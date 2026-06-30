package c05;

/* loaded from: classes9.dex */
public class b extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.c f37703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c05.c cVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37703c = cVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        this.f37703c.f213801c.putString("key_pwd1", (java.lang.String) objArr[0]);
        this.f338834b.d(new ss4.x((java.lang.String) objArr[0], 5, ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        c05.c cVar = this.f37703c;
        android.os.Bundle bundle = cVar.f213801c;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        cVar.o(mMActivity, 0, bundle);
        mMActivity.finish();
        return true;
    }
}
