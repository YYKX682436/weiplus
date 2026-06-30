package so2;

/* loaded from: classes4.dex */
public final class x1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f492230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f492231c;

    public x1(java.lang.String str, int i17, r45.qt2 qt2Var) {
        this.f492229a = str;
        this.f492230b = i17;
        this.f492231c = qt2Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        r45.qt2 qt2Var = this.f492231c;
        int i18 = this.f492230b;
        java.lang.String str = this.f492229a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
            am.zd zdVar = c5560x6f070be.f135879g;
            zdVar.f90084a = str;
            zdVar.f90085b = i18;
            zdVar.f90087d = qt2Var.m75939xb282bd08(7);
            zdVar.f90088e = qt2Var.m75939xb282bd08(5);
            zdVar.f90086c = true;
            c5560x6f070be.e();
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be c5560x6f070be2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5560x6f070be();
            am.zd zdVar2 = c5560x6f070be2.f135879g;
            zdVar2.f90084a = str;
            zdVar2.f90085b = i18;
            zdVar2.f90087d = qt2Var.m75939xb282bd08(7);
            zdVar2.f90088e = qt2Var.m75939xb282bd08(5);
            zdVar2.f90086c = false;
            c5560x6f070be2.e();
        }
        return jz5.f0.f384359a;
    }
}
