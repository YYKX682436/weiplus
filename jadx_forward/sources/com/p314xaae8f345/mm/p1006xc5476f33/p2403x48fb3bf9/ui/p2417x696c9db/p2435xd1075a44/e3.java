package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f268721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 f268724i;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var, int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        this.f268724i = p3Var;
        this.f268719d = i17;
        this.f268720e = i18;
        this.f268721f = i19;
        this.f268722g = str;
        this.f268723h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3 u3Var = this.f268724i.f269028f;
            int i17 = this.f268719d;
            int i18 = this.f268720e;
            int i19 = this.f268721f;
            java.lang.String str = this.f268722g;
            android.os.Bundle bundle = this.f268723h;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.u3.C(u3Var, i17, i18, i19, str, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebViewClient", e17.getMessage());
        }
    }
}
