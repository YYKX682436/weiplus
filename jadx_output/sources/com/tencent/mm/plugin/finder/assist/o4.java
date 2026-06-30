package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f102427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f102427d = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f102427d;
        if (it instanceof org.json.JSONObject) {
            try {
                int optInt = ((org.json.JSONObject) it).optInt("warnFlag");
                java.lang.String optString = ((org.json.JSONObject) it).optString("warningWording");
                bu2.j jVar = bu2.j.f24534a;
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = jVar.h(baseFinderFeed.getItemId());
                if (h17 != null) {
                    h17.getFeedObject().setWarnFlag(optInt);
                    h17.getFeedObject().setWarnWording(optString);
                    jVar.n(h17, bu2.i.f24529j);
                    com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                    feedUpdateEvent.f54252g.f6918a = h17.field_id;
                    feedUpdateEvent.e();
                }
                com.tencent.mars.xlog.Log.i("FinderMenuUtil", "[finishSetWarningWording] warnFlag:" + optInt + " warningWording:" + optString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderMenuUtil", java.lang.String.valueOf(e17.getMessage()));
            }
        }
        return jz5.f0.f302826a;
    }
}
