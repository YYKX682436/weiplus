package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class i extends xi1.b {

    /* renamed from: l, reason: collision with root package name */
    public final xi1.l f87596l;

    /* renamed from: m, reason: collision with root package name */
    public int f87597m;

    /* renamed from: n, reason: collision with root package name */
    public int f87598n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f87599o;

    /* renamed from: p, reason: collision with root package name */
    public xi1.o f87600p;

    public i(com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var, xi1.k kVar) {
        super(r0Var, kVar);
        this.f87598n = -1;
        this.f87596l = new com.tencent.mm.plugin.appbrand.platform.window.activity.h(this, r0Var);
    }

    @Override // xi1.m
    public xi1.o a() {
        return this.f87600p;
    }

    @Override // xi1.b, xi1.m
    public final void e(android.view.View view, int i17) {
        super.e(view, i17);
        android.app.Activity w17 = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) this.f454688b).w();
        if (w17 != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) w17.getWindow().getDecorView();
            if (this.f454696j == null) {
                this.f87597m = viewGroup.getSystemUiVisibility();
            }
            if (fp.h.a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4102);
            }
            if (this.f454696j == null) {
                android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                this.f87599o = layoutParams;
                layoutParams.copyFrom(w17.getWindow().getAttributes());
            }
            w17.getWindow().addFlags(1024);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                w17.getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
            }
            if (this.f454696j == null) {
                this.f87598n = w17.getRequestedOrientation();
            }
            h(i17);
        } else {
            com.tencent.mars.xlog.Log.e("Luggage.ActivityWindowFullscreenImpl", "enterFullscreen, get NULL activity");
            if (this.f454696j == null) {
                this.f87598n = -1;
                this.f87599o = null;
                this.f87597m = 0;
            }
        }
        java.util.Iterator it = this.f454695i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).o();
        }
        this.f454696j = null;
    }

    @Override // xi1.b, xi1.m
    public boolean g() {
        boolean z17 = this.f454697k;
        try {
            if (!super.g()) {
                if (!z17) {
                    return false;
                }
                this.f454697k = false;
                i();
                return true;
            }
            android.app.Activity w17 = ((com.tencent.mm.plugin.appbrand.platform.window.activity.r0) this.f454688b).w();
            if (w17 != null && !w17.isFinishing() && !w17.isDestroyed()) {
                ((android.view.ViewGroup) w17.getWindow().getDecorView()).setSystemUiVisibility(this.f87597m);
                w17.getWindow().clearFlags(1024);
                if (this.f87599o != null) {
                    w17.getWindow().setAttributes(this.f87599o);
                }
                xi1.l lVar = this.f87596l;
                ((com.tencent.mm.plugin.appbrand.platform.window.activity.h) lVar).f87594a.getOrientationHandler().b(xi1.o.e(this.f87598n), null);
                this.f87598n = -1;
                i();
                return true;
            }
            com.tencent.mars.xlog.Log.e("Luggage.ActivityWindowFullscreenImpl", "exitFullscreen activity(%s) destroyed", w17);
            i();
            return true;
        } finally {
            this.f87600p = null;
        }
    }

    @Override // xi1.m
    public void h(int i17) {
        this.f454697k = true;
        if (i17 == -90) {
            this.f87600p = xi1.o.e(8);
        } else if (i17 == 0) {
            this.f87600p = xi1.o.e(1);
        } else if (i17 != 90) {
            this.f87600p = xi1.o.e(9);
        } else {
            this.f87600p = xi1.o.e(0);
        }
        xi1.l lVar = this.f87596l;
        ((com.tencent.mm.plugin.appbrand.platform.window.activity.h) lVar).f87594a.getOrientationHandler().b(this.f87600p, null);
    }
}
