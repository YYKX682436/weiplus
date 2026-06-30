package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class oi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ti f108661d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi(com.tencent.mm.plugin.finder.feed.ti tiVar) {
        super(1);
        this.f108661d = tiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.x4 x4Var;
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveProfileWidgetJumpEmptyUIC", "goToFinderLive to:" + str);
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (x4Var = nVar.f309155g) != null) {
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            com.tencent.mm.plugin.finder.feed.ti tiVar = this.f108661d;
            android.app.Activity context = tiVar.getContext();
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            android.app.Activity context2 = tiVar.getContext();
            ((vd2.f1) e0Var).Bi(context, null, str2, context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null, x4Var, null);
        }
        return jz5.f0.f302826a;
    }
}
