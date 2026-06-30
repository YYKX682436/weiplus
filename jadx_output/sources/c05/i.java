package c05;

/* loaded from: classes9.dex */
public class i extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f37706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37706c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f37706c;
        qVar.f213801c.putString("key_pwd1", (java.lang.String) objArr[0]);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object obj = objArr[1];
        this.f338834b.d(new d05.b(str, obj != null ? com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) obj, 0) : 0, qVar.f213801c.getString("key_bank_type")), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        boolean z17 = m1Var instanceof d05.b;
        c05.q qVar = this.f37706c;
        if (z17) {
            d05.b bVar = (d05.b) m1Var;
            qVar.f213801c.putString("KEY_SESSION_KEY", bVar.f225582d);
            qVar.f213801c.putString("key_pre_name", bVar.f225583e);
            qVar.f213801c.putString("key_pre_indentity", bVar.f225584f);
            qVar.f213801c.putBoolean("key_has_indentity_info", bVar.f225585g);
        }
        qVar.o(this.f338833a, 0, qVar.f213801c);
        return true;
    }
}
