package c05;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.c f119236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c05.c cVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119236c = cVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f119236c.f295334c.putString("key_pwd1", (java.lang.String) objArr[0]);
        this.f420367b.d(new ss4.x((java.lang.String) objArr[0], 5, ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        c05.c cVar = this.f119236c;
        android.os.Bundle bundle = cVar.f295334c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        cVar.o(abstractActivityC21394xb3d2c0cf, 0, bundle);
        abstractActivityC21394xb3d2c0cf.finish();
        return true;
    }
}
