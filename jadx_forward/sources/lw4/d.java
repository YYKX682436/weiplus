package lw4;

/* loaded from: classes8.dex */
public class d implements lw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f403183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lw4.g f403184b;

    public d(lw4.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1) {
        this.f403184b = gVar;
        this.f403183a = c19252xb5f78ab1;
    }

    @Override // lw4.e
    public void a() {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        kw4.b0 e17;
        java.lang.ref.WeakReference weakReference2;
        android.view.View view2;
        kw4.c0 c0Var = this.f403184b.f403187c;
        kw4.b0 e18 = c0Var.e(c0Var.f394692e);
        float[] fArr = c0Var.f394693f;
        if (e18 == null || (weakReference = e18.f394679a) == null || fArr == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        int i17 = c0Var.f394692e;
        int i18 = c0Var.f394691d;
        if (i17 != i18 && (e17 = c0Var.e(i18)) != null && (weakReference2 = e17.f394679a) != null && (view2 = (android.view.View) weakReference2.get()) != null) {
            c0Var.f(c0Var.f394691d, fArr, view2.getVisibility());
        }
        int i19 = c0Var.f394692e;
        c0Var.f394691d = -1;
        c0Var.f394692e = -1;
        lw4.a aVar = c0Var.f394695h;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = ((lw4.b) aVar).f403179a;
            c19252xb5f78ab1.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onExitFullScreen");
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = c19252xb5f78ab1.f263603g;
            if (c19230x247e287e.N) {
                c19230x247e287e.N = false;
                c19230x247e287e.w();
            }
            c19252xb5f78ab1.a(false);
            c0Var.f394695h = null;
        }
        c0Var.f(i19, fArr, view.getVisibility());
    }

    @Override // lw4.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f403183a;
        c19252xb5f78ab1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onUIResume");
        c19252xb5f78ab1.f263601e.g();
    }

    @Override // lw4.e
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f403183a;
        c19252xb5f78ab1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onUIPause");
        c19252xb5f78ab1.f263601e.e();
    }

    @Override // lw4.e
    public void d() {
        this.f403183a.g();
    }

    @Override // lw4.e
    public void e() {
        this.f403183a.f();
    }

    @Override // lw4.e
    /* renamed from: onBackPressed */
    public boolean mo146440xbdc3c5dc() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f403183a;
        if (!c19252xb5f78ab1.d()) {
            return false;
        }
        c19252xb5f78ab1.h(false);
        return true;
    }

    @Override // lw4.e
    /* renamed from: onDestroy */
    public void mo146441xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f403183a;
        c19252xb5f78ab1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "onUIDestroy");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "clean");
        c19252xb5f78ab1.q();
        c19252xb5f78ab1.f263601e.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = c19252xb5f78ab1.f263603g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c19230x247e287e.M;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = c19230x247e287e.L;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        try {
            c19252xb5f78ab1.getContext().unregisterReceiver(c19252xb5f78ab1.U);
        } catch (java.lang.Exception unused) {
        }
    }
}
