package pe4;

/* loaded from: classes15.dex */
public class m extends pe4.o {

    /* renamed from: j, reason: collision with root package name */
    public boolean f435241j;

    /* renamed from: k, reason: collision with root package name */
    public gu5.c f435242k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f435243l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f435244m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f435245n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.animation.Animation f435246o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.animation.Animation f435247p;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Handler f435248q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f435249r;

    public m(java.lang.ref.WeakReference weakReference, re4.c0 c0Var, re4.d0 d0Var, android.os.Handler handler) {
        super(weakReference, c0Var, d0Var, handler);
        this.f435241j = false;
        this.f435242k = null;
        this.f435243l = null;
        this.f435244m = null;
        this.f435245n = null;
        this.f435246o = null;
        this.f435247p = null;
        this.f435248q = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f435249r = new pe4.l(this);
        this.f435253d = handler;
    }

    public static void g(pe4.m mVar, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = mVar.f435243l;
        if (j0Var == null || !j0Var.isShowing()) {
            java.lang.ref.WeakReference weakReference = mVar.f435252c;
            if (weakReference == null || weakReference.get() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "hy: ui released.");
                re4.d0 d0Var = mVar.f435251b;
                d0Var.f476059a = 90007;
                d0Var.f476060b = "internal error occurred: ui released";
                mVar.b();
            } else {
                re4.c0 c0Var = mVar.f435250a;
                if (!c0Var.f476055d.booleanValue()) {
                    if (mVar.f435243l == null) {
                        android.app.Activity activity = (android.app.Activity) weakReference.get();
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                        android.view.View inflate = activity.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bag, (android.view.ViewGroup) null, false);
                        mVar.f435244m = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g5z);
                        mVar.f435245n = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566529g64);
                        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.g5y)).setText(c0Var.f476054c);
                        aVar.L = inflate;
                        aVar.A = true;
                        aVar.f293266w = of5.b.a(activity).getString(com.p314xaae8f345.mm.R.C30867xcad56011.jic);
                        aVar.F = new pe4.i(mVar);
                        aVar.G = new pe4.j(mVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                        j0Var2.e(aVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar.f293256m;
                        if (d0Var2 != null) {
                            d0Var2.a(j0Var2.f293370r);
                        }
                        mVar.f435243l = j0Var2;
                        j0Var2.setOnShowListener(new pe4.h(mVar));
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var3 = mVar.f435243l;
                        if (j0Var3 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
                        } else if (mVar.f435253d != null) {
                            mVar.a();
                            mVar.f435253d.obtainMessage(6, j0Var3).sendToTarget();
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
                        }
                        mVar.f435243l.setCanceledOnTouchOutside(false);
                    }
                    if (!mVar.f435243l.isShowing() && weakReference.get() != null && !((android.app.Activity) weakReference.get()).isFinishing() && !((android.app.Activity) weakReference.get()).isDestroyed()) {
                        mVar.f435243l.show();
                    }
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: req restart after fail, but no need");
            return;
        }
        if (mVar.f435242k == null) {
            mVar.j();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "mFingerprintCanceller not null, cancel and start auth by delaying 500ms.");
        gu5.c cVar = mVar.f435242k;
        cVar.getClass();
        zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
        if (cVar.f357494a.isCanceled()) {
            zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
        } else {
            ju5.o.a().c(new gu5.a(cVar));
            ju5.o a17 = ju5.o.a();
            a17.f383669b.postDelayed(new gu5.b(cVar), 350L);
        }
        mVar.f435248q.postDelayed(new pe4.c(mVar), 500L);
    }

    public static android.view.animation.Animation h(android.content.Context context, long j17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "hy: context is null.");
            return null;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559260o);
        if (j17 > 0) {
            loadAnimation.setDuration(j17);
        }
        loadAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator());
        return loadAnimation;
    }

    @Override // pe4.o
    public void c(android.os.Bundle bundle) {
        if (!wt5.a.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            re4.d0 d0Var = this.f435251b;
            d0Var.f476059a = 90011;
            d0Var.f476060b = "no fingerprint enrolled";
            b();
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(new java.lang.String[]{"android.permission.USE_FINGERPRINT"});
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                f((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreate", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            } else {
                this.f435241j = true;
            }
        } catch (java.lang.NoSuchMethodError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f435241j = true;
        }
    }

    @Override // pe4.o
    public void d(android.os.Bundle bundle) {
        if (!wt5.a.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            re4.d0 d0Var = this.f435251b;
            d0Var.f476059a = 90011;
            d0Var.f476060b = "no fingerprint enrolled, inform fail and return";
            b();
            return;
        }
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.checkSelfPermission("android.permission.USE_FINGERPRINT") != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                arrayList.add(new java.lang.String[]{"android.permission.USE_FINGERPRINT"});
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
                f((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/soter/controller/SoterControllerFingerprint", "onPostCreateAndAutoStartVerify", "(Landroid/os/Bundle;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            } else {
                this.f435241j = true;
            }
        } catch (java.lang.NoSuchMethodError unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
            this.f435241j = true;
        }
        if (this.f435241j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "mIsRequestingFingerprintAuthen true, start prepareAuthKey");
            i();
        }
    }

    @Override // pe4.o
    public void e(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 0) {
            if (strArr.length >= 1 && iArr.length >= 1 && "android.permission.USE_FINGERPRINT".equals(strArr[0]) && iArr[0] == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
                i();
                this.f435241j = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
                re4.d0 d0Var = this.f435251b;
                d0Var.f476059a = 90002;
                d0Var.f476060b = "user not grant to use fingerprint";
                b();
            }
        }
    }

    public final boolean i() {
        android.os.Handler handler = this.f435253d;
        if (handler != null) {
            handler.obtainMessage(4).sendToTarget();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
        pe4.b bVar = new pe4.b(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy:mscene:" + this.f435257h);
        cu5.b.e(bVar, false, true, this.f435257h, this.f435255f, this.f435256g);
        return false;
    }

    public final void j() {
        this.f435254e = false;
        this.f435242k = new gu5.c();
        pe4.e eVar = new pe4.e(this);
        pe4.g gVar = new pe4.g(this);
        ju5.c cVar = new ju5.c(null);
        cVar.f383599a = this.f435257h;
        cVar.f383601c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        cVar.f383608j = this.f435242k;
        cVar.f383600b = this.f435250a.f476053b;
        cVar.f383609k = gVar;
        cu5.b.g(eVar, cVar);
    }
}
