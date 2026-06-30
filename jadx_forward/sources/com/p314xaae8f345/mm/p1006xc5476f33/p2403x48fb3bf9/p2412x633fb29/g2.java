package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class g2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 f264423c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f264425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 f264426f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 f264427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f264428h;

    public g2(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var, int i17, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var, int i18) {
        this.f264421a = context;
        this.f264422b = str;
        this.f264423c = l2Var;
        this.f264424d = i17;
        this.f264425e = bundle;
        this.f264426f = v0Var;
        this.f264427g = u1Var;
        this.f264428h = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.t6
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "WebAuthorizeDialog#onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        java.lang.String str = this.f264422b;
        if (i17 == 1) {
            ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(this.f264421a, com.p314xaae8f345.mm.p939x633fb29.p940x30579f.a.OPENSDK, str, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f2(this, bundle));
            return;
        }
        if (i17 != 2 && i17 != 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) this.f264423c).d();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var = this.f264423c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = this.f264426f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var = this.f264427g;
        int i18 = this.f264428h;
        android.content.Context context = this.f264421a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "doRejectLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.a(v0Var, this.f264425e.getString("oauth_url"), 2, bundle == null ? new java.util.ArrayList() : (java.util.ArrayList) bundle.getSerializable("key_scope"), u1Var, false, i18, l2Var, context);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).d();
        hy4.b bVar = hy4.b.INSTANCE;
        if (str == null) {
            str = "";
        }
        bVar.a(str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 0, 1, 0, 1, this.f264424d);
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264514b), this.f264424d);
    }
}
