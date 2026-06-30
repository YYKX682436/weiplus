package zh1;

/* loaded from: classes8.dex */
public final class h0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f554420a;

    public h0(zh1.r0 r0Var) {
        this.f554420a = r0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g1
    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onClick");
        zh1.y0 y0Var = zh1.y0.ENABLE;
        zh1.r0 r0Var = this.f554420a;
        if (y0Var != r0Var.f554468o.f554396a) {
            return;
        }
        r0Var.f554481f.u();
        zh1.v0 v0Var = r0Var.f554483h;
        if (v0Var == null) {
            zh1.a aVar = zh1.n.f554442o;
            zh1.n.f554444q = r0Var.f554479d;
            v0Var = aVar.b(r0Var.f554480e, r0Var.f554481f, r0Var.f554482g, r0Var.f554484i, r0Var.f554485m);
            r0Var.f554483h = v0Var;
        }
        v0Var.mo178969x35dafd();
    }
}
