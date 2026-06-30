package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rx extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f108949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(2);
        this.f108948d = pzVar;
        this.f108949e = baseFinderFeed;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ix0 ret = (r45.ix0) obj2;
        kotlin.jvm.internal.o.g((r45.g33) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f108948d;
        com.tencent.mars.xlog.Log.i(pzVar.U, "live feed danmaku close ret:" + ret);
        int integer = ret.getInteger(1);
        com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
        if (integer == 0) {
            this.f108949e.d2(false);
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.d(com.tencent.mm.R.string.cvn);
            e4Var.c();
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(mMActivity);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_error);
            e4Var2.d(com.tencent.mm.R.string.eqz);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
