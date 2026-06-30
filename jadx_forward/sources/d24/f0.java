package d24;

/* loaded from: classes11.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 f307449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f307450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f307452g;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f307449d = c17513xe6a0fae1;
        this.f307450e = m1Var;
        this.f307451f = i17;
        this.f307452g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1 c17513xe6a0fae1 = this.f307449d;
        d17.q(255, c17513xe6a0fae1.C);
        c17513xe6a0fae1.C = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c17513xe6a0fae1.D;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            c17513xe6a0fae1.D = null;
        }
        android.app.ProgressDialog progressDialog = c17513xe6a0fae1.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f307450e;
        if (m1Var.mo808xfb85f7b0() == 255) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
            if (((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152977f == 2) {
                if (this.f307451f != -3 || this.f307452g != 4) {
                    c17513xe6a0fae1.A7();
                    return;
                }
                android.content.Intent intent = new android.content.Intent(c17513xe6a0fae1.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
                intent.putExtra("kintent_hint", c17513xe6a0fae1.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.hx9));
                android.app.Activity m80379x76847179 = c17513xe6a0fae1.m80379x76847179();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(5);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$queryHasPwdAndLogout$1$onSceneEnd$1", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }
}
