package qd1;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f443174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f443175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443177h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f443178i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f443180n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f443181o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f443182p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443183q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f443184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f443185s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f443186t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ qd1.p f443187u;

    public j(qd1.p pVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, java.lang.String str3, int i17, int i18, boolean z19, java.lang.String str4, int i19, int i27, org.json.JSONObject jSONObject) {
        this.f443187u = pVar;
        this.f443173d = e9Var;
        this.f443174e = v5Var;
        this.f443175f = z17;
        this.f443176g = str;
        this.f443177h = str2;
        this.f443178i = z18;
        this.f443179m = str3;
        this.f443180n = i17;
        this.f443181o = i18;
        this.f443182p = z19;
        this.f443183q = str4;
        this.f443184r = i19;
        this.f443185s = i27;
        this.f443186t = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        fl1.g2 m48801x784fb1e3;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.view.View currentFocus;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443173d;
        if (e9Var.mo50262x39e05d35()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.k0 w07 = e9Var.t3().w0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f443174e;
            v5Var.I1().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb.MODAL);
            if (this.f443175f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
                if (t37.f156347w == null) {
                    fl1.c0 c0Var = new fl1.c0(t37.f156328d, ((fl1.c0) t37.m48801x784fb1e3()).m129673x80bc4746());
                    t37.f156347w = c0Var;
                    c0Var.m129675x794554ea(false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ef.UpperDialogContainer.a(t37, t37.f156347w);
                }
                m48801x784fb1e3 = t37.f156347w;
            } else {
                m48801x784fb1e3 = e9Var.t3().m48801x784fb1e3();
            }
            final fl1.b bVar = new fl1.b(e9Var.getF229340d());
            java.lang.String str = this.f443176g;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            boolean z17 = this.f443178i;
            java.lang.String str2 = this.f443177h;
            if (!K0) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || z17) {
                    bVar.setTitle(str);
                } else {
                    bVar.t(str);
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !z17) {
                bVar.t(str2);
            }
            bVar.A(this.f443179m, true, new qd1.k(this, bVar, w07));
            boolean z18 = this.f443182p;
            if (z18) {
                bVar.w(this.f443183q, false, new qd1.l(this, w07));
            }
            bVar.setOnCancelListener(new qd1.m(this, w07));
            bVar.B(this.f443184r);
            if (z18) {
                bVar.x(this.f443185s);
            }
            if (z17) {
                bVar.f293370r.setVisibility(0);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    java.lang.String optString = this.f443186t.optString("placeholderText");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        bVar.f293370r.setVisibility(0);
                        bVar.f293370r.setHint(optString);
                    }
                } else {
                    bVar.f293370r.setVisibility(0);
                    bVar.f293370r.setText(str2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.e(v5Var.mo51310xc2a54588());
                qd1.o oVar = new qd1.o(bVar, e9Var, null);
                e17.a(oVar);
                bVar.setOnDismissListener(new qd1.n(this, w07, e17, oVar));
            }
            ((fl1.c0) m48801x784fb1e3).c(bVar);
            int i17 = this.f443180n;
            if (i17 != -1) {
                w07.getClass();
                w07.f173281b.put(i17, bVar);
            }
            if (z17) {
                bVar.f293370r.requestFocus();
                android.content.Context f229340d = v5Var.getF229340d();
                android.app.Activity activity = f229340d instanceof android.app.Activity ? (android.app.Activity) f229340d : null;
                if (activity != null && (inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method")) != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
                    inputMethodManager.toggleSoftInput(0, 2);
                }
                e9Var.j(new java.lang.Runnable() { // from class: qd1.j$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        fl1.b.this.f293370r.requestFocus();
                    }
                }, 500L);
            }
        }
    }
}
