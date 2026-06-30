package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public final class u8 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public int f266976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f266977e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f266978f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q8 f266979g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f266980h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f266981i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p8 f266982m;

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p8 p8Var;
        android.content.Context context = (android.content.Context) this.f266981i.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.p8 p8Var2 = this.f266982m;
        if (p8Var2 != null && context != null) {
            if (!this.f266977e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult called without msgId attached...");
            } else if (i17 != 33) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, mismatched request_code = %d", java.lang.Integer.valueOf(i17));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) this.f266982m).a(this.f266976d, "fail");
            } else if (i18 == 4097 || i18 == 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) p8Var2).a(this.f266976d, "cancel");
            } else if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("selectpkg");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, get null packageName");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) this.f266982m).a(this.f266976d, "fail");
                } else {
                    (jt.w.GoogleMap.h().equals(stringExtra) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.o8(null) : jt.w.BaiduMap.h().equals(stringExtra) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.m8(null) : jt.w.SogouMap.h().equals(stringExtra) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.s8(null) : jt.w.AutonaviMap.h().equals(stringExtra) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.n8(null) : new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.t8(null)).b(context, null, this.f266979g, this.f266980h);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) this.f266982m).a(this.f266976d, "ok");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenMapNavigator", "onActivityResult, not support result_code = %d", java.lang.Integer.valueOf(i18));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) this.f266982m).a(this.f266976d, "fail");
            }
        }
        if (this.f266977e && (p8Var = this.f266982m) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g8 g8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.g8) ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.d3) p8Var).f266581a.f266605i.f266519p0).remove(java.lang.Integer.valueOf(this.f266976d));
            if (g8Var != null) {
                g8Var.f266673a = null;
                g8Var.f266674b = null;
            }
        }
        this.f266977e = false;
        this.f266978f = 0;
        this.f266979g = null;
        this.f266981i = null;
        this.f266982m = null;
        this.f266980h = null;
    }
}
