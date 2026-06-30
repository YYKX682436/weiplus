package zh1;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zh1.n nVar) {
        super(1);
        this.f554411d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528 $receiver = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12480x1c9fd528) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        $receiver.J0(null, null);
        boolean C = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "buildHybridBottomSheet, isDarkMode: " + C);
        $receiver.mo120153xd15cf999().B(C ? 2 : 0);
        java.lang.Object systemService = $receiver.getContext().getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        $receiver.m52096xeed5daa9((android.view.WindowManager) systemService);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 c12479xe0723f03 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03($receiver);
        zh1.n nVar = this.f554411d;
        zh1.e eVar = new zh1.e(nVar);
        c12479xe0723f03.m52093xa517a63(new zh1.c(nVar, eVar));
        c12479xe0723f03.m52094xc0d322fd(new zh1.d(eVar, nVar));
        $receiver.mo120128x74041feb(c12479xe0723f03, "OpenMaterialJsApi");
        zh1.n nVar2 = this.f554411d;
        nVar2.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new zh1.j(c12479xe0723f03, nVar2, $receiver));
        this.f554411d.f554451m = c12479xe0723f03;
        return jz5.f0.f384359a;
    }
}
