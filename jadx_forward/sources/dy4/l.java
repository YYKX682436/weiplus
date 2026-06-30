package dy4;

/* loaded from: classes8.dex */
public final class l implements dy4.a, dy4.c, dy4.b {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f326214d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326215e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f326216f;

    /* renamed from: g, reason: collision with root package name */
    public cy4.e f326217g;

    public l(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f326214d = context;
        this.f326215e = "MicroMsg.WebViewUIProxyImpl";
        this.f326216f = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    }

    @Override // dy4.a
    public void C0(android.view.View view, int i17) {
        cy4.e b17 = b(this.f326214d);
        android.content.Context context = b17.f306399a;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewFullscreenImpl", "enterFullscreen activity(%s) destroyed", activity);
                return;
            }
            android.view.View view2 = b17.f306400b;
            b17.f306400b = view;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
            if (view2 == null) {
                if (view.getParent() instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.getParent();
                    b17.f306403e = viewGroup2;
                    b17.f306401c = viewGroup2.indexOfChild(view);
                    b17.f306402d = view.getLayoutParams();
                    b17.f306403e.removeView(view);
                    b17.f306405g = b17.f306400b.getDrawingCacheBackgroundColor();
                    b17.f306400b.setBackgroundColor(-16777216);
                } else {
                    b17.f306401c = 0;
                    b17.f306403e = null;
                    b17.f306402d = null;
                }
                viewGroup.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                viewGroup.bringChildToFront(view);
                view.setX(0.0f);
                view.setY(0.0f);
            }
            if (view2 == null) {
                b17.f306404f = viewGroup.getSystemUiVisibility();
                b17.f306406h = activity.getRequestedOrientation();
                android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                b17.f306407i = layoutParams;
                layoutParams.copyFrom(activity.getWindow().getAttributes());
            }
            viewGroup.setSystemUiVisibility(5894);
            activity.getWindow().addFlags(1024);
            if (i17 == -90) {
                activity.setRequestedOrientation(8);
            } else if (i17 == 0) {
                activity.setRequestedOrientation(1);
            } else if (i17 != 90) {
                activity.setRequestedOrientation(9);
            } else {
                activity.setRequestedOrientation(0);
            }
            qp1.h0.a(true, true, true);
            java.util.Iterator it = b17.f306408j.iterator();
            while (it.hasNext()) {
                ((cy4.f) it.next()).a();
            }
        }
    }

    @Override // dy4.c
    public synchronized void Q3(sf.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!this.f326216f.contains(callback)) {
            this.f326216f.add(callback);
        }
    }

    @Override // dy4.a
    public boolean V() {
        return b(this.f326214d).a(false);
    }

    public final boolean a(boolean z17) {
        cy4.e eVar = this.f326217g;
        if (eVar != null) {
            if (eVar.f306400b != null) {
                try {
                    return b(this.f326214d).a(z17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f326215e, "exitFullScreen ex=" + e17.getMessage());
                }
            }
        }
        return false;
    }

    public final cy4.e b(android.content.Context context) {
        if (this.f326217g == null) {
            this.f326217g = new cy4.e(context);
        }
        cy4.e eVar = this.f326217g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        return eVar;
    }

    public final boolean c() {
        cy4.e eVar = this.f326217g;
        return (eVar == null || eVar.f306400b == null) ? false : true;
    }

    public final void d(android.content.Context ct6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        this.f326214d = ct6;
        cy4.e eVar = this.f326217g;
        if (eVar != null) {
            eVar.f306399a = ct6;
            eVar.f306403e = null;
            eVar.f306400b = null;
        }
    }

    @Override // dy4.b
    public void g0(cy4.f fVar) {
        b(this.f326214d).f306408j.remove(fVar);
    }

    @Override // dy4.c
    public synchronized void g6(sf.e callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f326216f.remove(callback);
    }

    @Override // dy4.b
    public void q3(cy4.f fVar) {
        java.util.Set set = b(this.f326214d).f306408j;
        if (set.contains(fVar)) {
            return;
        }
        set.add(fVar);
    }
}
