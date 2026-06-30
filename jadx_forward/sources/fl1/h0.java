package fl1;

/* loaded from: classes7.dex */
public class h0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.i0 f345311a;

    public h0(fl1.i0 i0Var) {
        this.f345311a = i0Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openGameLiteApp fail, ");
        fl1.i0 i0Var = this.f345311a;
        sb6.append(i0Var.f345322e.f453991i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", sb6.toString());
        i0Var.f345324g.a();
        i0Var.f345323f.run();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openGameLiteApp success, ");
        fl1.i0 i0Var = this.f345311a;
        sb6.append(i0Var.f345322e.f453991i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", sb6.toString());
        i0Var.f345324g.a();
        i0Var.f345323f.run();
    }
}
