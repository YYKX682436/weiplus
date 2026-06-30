package c05;

/* loaded from: classes9.dex */
public class j extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f119240c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119240c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        c05.q qVar = this.f119240c;
        qVar.f295334c.putString("key_name", str);
        qVar.f295334c.putString("key_indentity", str2);
        this.f420367b.d(new d05.a(str, str2, qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_bank_type")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof d05.a;
        c05.q qVar = this.f119240c;
        if (z17) {
            d05.a aVar = (d05.a) m1Var;
            qVar.f295334c.putString("KEY_SESSION_KEY", aVar.f307111e);
            qVar.f295334c.putString("key_mobile", aVar.f307114h);
            qVar.f295334c.putBoolean("key_need_bind_deposit", aVar.f307112f);
            qVar.f295334c.putBoolean("key_is_bank_user", aVar.f307113g);
        }
        qVar.o(this.f420366a, 0, qVar.f295334c);
        return true;
    }
}
