package c05;

/* loaded from: classes9.dex */
public class i extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f119239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119239c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f119239c;
        qVar.f295334c.putString("key_pwd1", (java.lang.String) objArr[0]);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object obj = objArr[1];
        this.f420367b.d(new d05.b(str, obj != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) obj, 0) : 0, qVar.f295334c.getString("key_bank_type")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof d05.b;
        c05.q qVar = this.f119239c;
        if (z17) {
            d05.b bVar = (d05.b) m1Var;
            qVar.f295334c.putString("KEY_SESSION_KEY", bVar.f307115d);
            qVar.f295334c.putString("key_pre_name", bVar.f307116e);
            qVar.f295334c.putString("key_pre_indentity", bVar.f307117f);
            qVar.f295334c.putBoolean("key_has_indentity_info", bVar.f307118g);
        }
        qVar.o(this.f420366a, 0, qVar.f295334c);
        return true;
    }
}
