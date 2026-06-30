package of1;

/* loaded from: classes7.dex */
public final class t1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f426542d;

    public t1(of1.w1 w1Var) {
        this.f426542d = w1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x
    public void b() {
        of1.w1 w1Var = this.f426542d;
        w1Var.f426578s.mo74096x57429eec();
        of1.v0 v0Var = (of1.v0) w1Var.m151222x143f1b92();
        v0Var.g0().Z(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = v0Var.W1;
        if (oVar != null) {
            oVar.m51535x3498a0(new of1.i0(v0Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v
    public void c() {
        of1.w1 w1Var = this.f426542d;
        w1Var.f426578s.mo74095xb01dfb57();
        ((of1.v0) w1Var.m151222x143f1b92()).g0().Z(false);
    }
}
