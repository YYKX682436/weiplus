package zt4;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f557128c;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var, android.os.Bundle bundle) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f557128c = bundle;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        this.f420367b.a(new zt4.c(this.f557128c.getString("payu_reference")), true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        android.os.Bundle bundle = this.f557128c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29.C19196xf4e4ba33 c19196xf4e4ba33 = (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29.C19196xf4e4ba33) bundle.getParcelable("key_security_question");
        this.f420367b.a(new zt4.b(bundle.getString("payu_reference"), c19196xf4e4ba33.f262805d, bundle.getString("key_question_answer")), true);
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof zt4.c;
        android.os.Bundle bundle = this.f557128c;
        if (z17 && i17 == 0 && i18 == 0) {
            zt4.c cVar = (zt4.c) m1Var;
            bundle.putParcelable("key_security_question", new com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.p2386x633fb29.C19196xf4e4ba33(cVar.f557131d, cVar.f557132e));
            return false;
        }
        if (m1Var instanceof zt4.b) {
            zt4.b bVar = (zt4.b) m1Var;
            if (i17 == 0 && i18 == 0 && bVar.f557129d) {
                bundle.putString("payu_reference", bVar.f557130e);
                com.p314xaae8f345.mm.p2802xd031a825.a.d(this.f420366a, bundle);
                return true;
            }
        }
        return false;
    }
}
