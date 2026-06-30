package bp4;

/* loaded from: classes10.dex */
public final class g3 implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23179d;

    public g3(ju3.d0 d0Var) {
        this.f23179d = d0Var;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar != null) {
            int i17 = iVar.f343782e;
            ju3.d0 d0Var = this.f23179d;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TemplateNormalModeSelectPlugin", "onSelect template mode");
                ju3.d0.k(d0Var, ju3.c0.H2, null, 2, null);
            } else if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TemplateNormalModeSelectPlugin", "onSelect normal mode");
                ju3.d0.k(d0Var, ju3.c0.I2, null, 2, null);
            }
        }
    }
}
