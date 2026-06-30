package c05;

/* loaded from: classes9.dex */
public class p extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f119246c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119246c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f119246c;
        qVar.f295334c.putBoolean("key_is_follow_bank_username", ((java.lang.Boolean) objArr[0]).booleanValue());
        qVar.n();
        this.f420367b.d(new ss4.e0(null, 0), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        c05.q qVar = this.f119246c;
        qVar.o(this.f420366a, 0, qVar.f295334c);
        return true;
    }
}
