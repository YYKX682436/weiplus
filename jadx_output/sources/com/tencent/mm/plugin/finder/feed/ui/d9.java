package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class d9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f109937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f109937d = finderLiveDelManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.x4 x4Var;
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f109937d;
        finderLiveDelManagerUI.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveDelManagerUI", "goToFinderLive to:" + str);
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (x4Var = nVar.f309155g) != null) {
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            androidx.appcompat.app.AppCompatActivity context = finderLiveDelManagerUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (str == null) {
                str = "";
            }
            ((vd2.f1) e0Var).Bi(context, null, str, finderLiveDelManagerUI, x4Var, null);
        }
        return jz5.f0.f302826a;
    }
}
