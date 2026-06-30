package c05;

/* loaded from: classes9.dex */
public class j extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f37707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37707c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        c05.q qVar = this.f37707c;
        qVar.f213801c.putString("key_name", str);
        qVar.f213801c.putString("key_indentity", str2);
        this.f338834b.d(new d05.a(str, str2, qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_bank_type")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof d05.a;
        c05.q qVar = this.f37707c;
        if (z17) {
            d05.a aVar = (d05.a) m1Var;
            qVar.f213801c.putString("KEY_SESSION_KEY", aVar.f225578e);
            qVar.f213801c.putString("key_mobile", aVar.f225581h);
            qVar.f213801c.putBoolean("key_need_bind_deposit", aVar.f225579f);
            qVar.f213801c.putBoolean("key_is_bank_user", aVar.f225580g);
        }
        qVar.o(this.f338833a, 0, qVar.f213801c);
        return true;
    }
}
