package c05;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f37713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37713c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f37713c;
        qVar.f213801c.putBoolean("key_is_follow_bank_username", ((java.lang.Boolean) objArr[0]).booleanValue());
        qVar.n();
        this.f338834b.d(new ss4.e0(null, 0), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        c05.q qVar = this.f37713c;
        qVar.o(this.f338833a, 0, qVar.f213801c);
        return true;
    }
}
