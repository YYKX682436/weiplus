package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class to implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f110585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 f110586e;

    public to(java.lang.Boolean bool, com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI31 occupyFinderUI31) {
        this.f110585d = bool;
        this.f110586e = occupyFinderUI31;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.xo4 req = (r45.xo4) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchNotRecClick isChecked:");
        java.lang.Boolean bool = this.f110585d;
        sb6.append(bool);
        sb6.append(" onModifyResult: ret = ");
        sb6.append(ret.getInteger(1));
        com.tencent.mars.xlog.Log.i("OccupyFinderUI31", sb6.toString());
        if (ret.getInteger(1) != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.so(this.f110586e, bool));
        }
    }
}
