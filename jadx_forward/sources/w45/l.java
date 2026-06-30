package w45;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f524445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f524446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f524447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f524448g;

    public l(w45.p pVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f524445d = pVar;
        this.f524446e = m1Var;
        this.f524447f = i17;
        this.f524448g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f524445d;
        d17.q(255, pVar.f524456c);
        pVar.f524456c = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = pVar.f524457d;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            pVar.f524457d = null;
        }
        android.app.ProgressDialog progressDialog = pVar.f524459f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f524446e;
        if (m1Var.mo808xfb85f7b0() == 255) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
            if (((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152977f == 2) {
                if (this.f524447f != -3 || this.f524448g != 4) {
                    w45.p.a(pVar);
                    return;
                }
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p2498x2099b549.ActivityC19817xd086b397.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
