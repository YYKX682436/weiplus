package qz2;

/* loaded from: classes9.dex */
public class a extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qz2.b f449368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qz2.b bVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f449368c = bVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f449368c.f295334c.putString("pwd", (java.lang.String) objArr[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthProcess", "this is onNext");
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return false;
    }
}
