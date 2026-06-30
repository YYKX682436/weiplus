package kl2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f390321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kl2.n nVar) {
        super(1);
        this.f390321d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kl2.n nVar = this.f390321d;
        jl2.a aVar = nVar.f390324h;
        if (booleanValue) {
            il2.s sVar = il2.s.f373619a;
            zl2.e5 e5Var = zl2.e5.f555274h;
            il2.r rVar = (il2.r) aVar;
            mm2.p5 p5Var = (mm2.p5) ((mm2.v5) rVar.S0().a(mm2.v5.class)).f411016f.mo3195x754a37bb();
            sVar.a(e5Var, p5Var != null ? p5Var.f410883b : 0L);
            mm2.p5 p5Var2 = nVar.f390333t;
            long j17 = p5Var2 != null ? p5Var2.f410883b : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RestrictConsumeDialogWidget", "handleFaceVerifyResult: " + j17);
            zl2.j5.f555383a.e(j17);
            ((mm2.v5) rVar.S0().a(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.u5.f410997a);
        } else {
            ((mm2.v5) ((il2.r) aVar).S0().a(mm2.v5.class)).f411021n.mo7808x76db6cb1(mm2.r5.f410913a);
        }
        return jz5.f0.f384359a;
    }
}
