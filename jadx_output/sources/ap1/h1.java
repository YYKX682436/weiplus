package ap1;

/* loaded from: classes5.dex */
public final class h1 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f12673d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f12674e = "";

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f12675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f12676g;

    public h1(ap1.p1 p1Var) {
        this.f12676g = p1Var;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String searchText) {
        kotlin.jvm.internal.o.g(searchText, "searchText");
        this.f12674e = searchText;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
        ap1.p1 p1Var = this.f12676g;
        this.f12675f = pf5.e.launch$default(p1Var, null, null, new ap1.g1(this, p1Var, null), 3, null);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mars.xlog.Log.i("RoamSearchContactUIC", "onQuitSearch");
        kotlinx.coroutines.r2 r2Var = this.f12675f;
        if (r2Var == null) {
            kotlin.jvm.internal.o.o("searchJob");
            throw null;
        }
        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        ap1.p1 p1Var = this.f12676g;
        ap1.i1 i1Var = p1Var.f12722d;
        if (i1Var != null) {
            i1Var.r();
        }
        this.f12673d = "";
        this.f12674e = "";
        ap1.p1.T6(p1Var);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
