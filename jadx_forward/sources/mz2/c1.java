package mz2;

/* loaded from: classes9.dex */
public class c1 implements mz2.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f414628a;

    public c1(mz2.d1 d1Var, mz2.y0 y0Var) {
        this.f414628a = d1Var;
    }

    @Override // mz2.b2
    public void a(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz2.b1(this, str));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mz2.a1(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HwFingerprintOpenDelegate", "GenRsaKeySync.callback rsaKey is empty!");
        }
    }
}
