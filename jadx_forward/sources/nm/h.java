package nm;

/* loaded from: classes12.dex */
public final class h extends com.p314xaae8f345.mm.app.d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f419967d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nm.i f419968e;

    public h(nm.i iVar, nm.d dVar) {
        this.f419968e = iVar;
    }

    public void a(android.app.Application application) {
        application.registerActivityLifecycleCallbacks(this);
        if (android.os.Build.VERSION.SDK_INT < 35) {
            this.f419968e.f419971b.post(this);
            return;
        }
        java.util.List historicalProcessStartReasons = ((android.app.ActivityManager) application.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getHistoricalProcessStartReasons(1);
        if (historicalProcessStartReasons.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Fail to get startup reason, treat as start without ui.");
            return;
        }
        int reason = ((android.app.ApplicationStartInfo) historicalProcessStartReasons.get(0)).getReason();
        if (reason == 6 || reason == 7 || reason == 11) {
            this.f419967d = true;
        } else {
            this.f419967d = false;
        }
        synchronized (this.f419968e.f419973d) {
            this.f419968e.f419973d[0] = java.lang.Boolean.valueOf(this.f419967d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Check has ui created by ApplicationStartInfo, result: %s", java.lang.Boolean.valueOf(this.f419967d));
    }

    @Override // com.p314xaae8f345.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.f419967d = true;
    }

    @Override // com.p314xaae8f345.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        android.view.View decorView;
        if (!k95.b.a(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FirstScreenArrangement2", "[!] Not business ui (%s), skip triggering arranged first screen actions.", activity);
            return;
        }
        nm.i iVar = this.f419968e;
        synchronized (iVar.f419973d) {
            if (iVar.f419975f) {
                return;
            }
            android.view.Window window = activity.getWindow();
            if (window == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get window of '%s'.", activity);
                decorView = null;
            } else {
                decorView = window.getDecorView();
                if (decorView == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get decor view of '%s'.", activity);
                }
            }
            if (decorView == null) {
                iVar.f419971b.a();
            } else if (decorView.getViewTreeObserver() != null) {
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(new nm.e(iVar, decorView));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FirstScreenArrangement2", "[-] Fail to get view tree observer of '%s'.", activity);
                iVar.f419971b.a();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui detect runnable was invoked.");
        synchronized (this.f419968e.f419973d) {
            this.f419968e.f419973d[0] = java.lang.Boolean.valueOf(this.f419967d);
            if (!this.f419967d) {
                nm.i.a(this.f419968e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FirstScreenArrangement2", "[+] Startup by ui detect runnable was invoked over, has_ui_created: %s", java.lang.Boolean.valueOf(this.f419967d));
        }
    }
}
