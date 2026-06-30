package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class uw extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f110837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(2);
        this.f110837d = pzVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String invokeSource = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String str3 = this.f110837d.U;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetFirstFeed ");
        sb6.append(invokeSource);
        sb6.append(' ');
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = feed.getFeedObject().getFeedObject();
        if (feedObject != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feedObject.getObjectDesc();
            java.lang.String str4 = "";
            if (objectDesc == null || (str2 = objectDesc.getDescription()) == null) {
                str2 = "";
            }
            java.lang.String u17 = pm0.v.u(feedObject.getId());
            if (!android.text.TextUtils.isEmpty(str2)) {
                str4 = str2.substring(0, java.lang.Math.min(4, str2.length()));
                kotlin.jvm.internal.o.f(str4, "substring(...)");
            }
            str = u17 + '.' + str4;
        } else {
            str = "INVALID-FEED";
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
        int i17 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        return jz5.f0.f302826a;
    }
}
