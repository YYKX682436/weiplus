package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class gn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.hn f106855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(com.tencent.mm.plugin.finder.feed.hn hnVar) {
        super(1);
        this.f106855d = hnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (this.f106855d.f106941p) {
            java.lang.Integer valueOf = fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb6.append(", errCode ");
            sb6.append(valueOf);
            sb6.append(", errMsg ");
            sb6.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.i("requestBindPoiStream", sb6.toString());
            if (valueOf != null && valueOf.intValue() < 0) {
                android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                java.lang.String string = resources.getString(com.tencent.mm.R.string.f491981eu4);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                switch (valueOf.intValue()) {
                    case -5853:
                        string = resources.getString(com.tencent.mm.R.string.f491981eu4);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    case -5852:
                        string = resources.getString(com.tencent.mm.R.string.f491978eu1);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    case -5851:
                        string = resources.getString(com.tencent.mm.R.string.f491979eu2);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                    case -5850:
                        string = resources.getString(com.tencent.mm.R.string.f491980eu3);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        break;
                }
                db5.t7.m(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
            }
        }
        return jz5.f0.f302826a;
    }
}
