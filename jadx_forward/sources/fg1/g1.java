package fg1;

/* loaded from: classes7.dex */
public final class g1 implements pd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final bg.f f343401a;

    /* renamed from: b, reason: collision with root package name */
    public final fg1.f1 f343402b = new fg1.f1(this, null);

    public g1(bg.f fVar) {
        this.f343401a = fVar;
        fg1.y0 y0Var = new fg1.y0(this);
        fVar.M1 = y0Var;
        dg.e eVar = fVar.f101298i;
        if (eVar != null) {
            fg1.b0 b0Var = (fg1.b0) eVar;
            synchronized (b0Var) {
                b0Var.f343382h = y0Var;
            }
        }
        fg1.z0 z0Var = new fg1.z0(this);
        fVar.N1 = z0Var;
        dg.e eVar2 = fVar.f101298i;
        if (eVar2 != null) {
            fg1.b0 b0Var2 = (fg1.b0) eVar2;
            synchronized (b0Var2) {
                b0Var2.f343383i = z0Var;
            }
        }
    }

    public boolean a() {
        return this.f343401a.T1.get();
    }

    @Override // pd1.j
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, pd1.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = v5Var.mo50357xcd94f799();
        bg.f fVar = this.f343401a;
        if (mo50357xcd94f799 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            iVar.a(fVar.C(), fVar.D());
            return;
        }
        java.lang.String str = "document.querySelector('embed[embed-id=\"" + fVar.f334030d + "\"]').getBoundingClientRect().toJSON()";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebVideoOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        mo50357xcd94f799.mo14660x738236e6(str, new fg1.a1(this, iVar));
    }

    @Override // pd1.j
    public int i() {
        bg.f fVar = this.f343401a;
        int i17 = (int) (fVar.O1 * fVar.E);
        fVar.A();
        return i17;
    }

    @Override // pd1.j
    /* renamed from: isPlaying */
    public boolean mo129535xc00617a4() {
        return this.f343401a.G();
    }

    @Override // pd1.j
    public int k() {
        bg.f fVar = this.f343401a;
        int i17 = (int) (fVar.P1 * fVar.F);
        fVar.A();
        return i17;
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        bg.f fVar = this.f343401a;
        return new android.graphics.Point(fVar.C(), fVar.D());
    }

    @Override // pd1.j
    public pd1.o n() {
        return this.f343402b;
    }
}
