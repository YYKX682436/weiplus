package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class i extends xi1.b {

    /* renamed from: l, reason: collision with root package name */
    public final xi1.l f169129l;

    /* renamed from: m, reason: collision with root package name */
    public int f169130m;

    /* renamed from: n, reason: collision with root package name */
    public int f169131n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f169132o;

    /* renamed from: p, reason: collision with root package name */
    public xi1.o f169133p;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var, xi1.k kVar) {
        super(r0Var, kVar);
        this.f169131n = -1;
        this.f169129l = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.h(this, r0Var);
    }

    @Override // xi1.m
    public xi1.o a() {
        return this.f169133p;
    }

    @Override // xi1.b, xi1.m
    public final void e(android.view.View view, int i17) {
        super.e(view, i17);
        android.app.Activity w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) this.f536221b).w();
        if (w17 != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) w17.getWindow().getDecorView();
            if (this.f536229j == null) {
                this.f169130m = viewGroup.getSystemUiVisibility();
            }
            if (fp.h.a(19)) {
                viewGroup.setSystemUiVisibility(2);
            } else {
                viewGroup.setSystemUiVisibility(4102);
            }
            if (this.f536229j == null) {
                android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
                this.f169132o = layoutParams;
                layoutParams.copyFrom(w17.getWindow().getAttributes());
            }
            w17.getWindow().addFlags(1024);
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                w17.getWindow().getAttributes().layoutInDisplayCutoutMode = 2;
            }
            if (this.f536229j == null) {
                this.f169131n = w17.getRequestedOrientation();
            }
            h(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.ActivityWindowFullscreenImpl", "enterFullscreen, get NULL activity");
            if (this.f536229j == null) {
                this.f169131n = -1;
                this.f169132o = null;
                this.f169130m = 0;
            }
        }
        java.util.Iterator it = this.f536228i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).o();
        }
        this.f536229j = null;
    }

    @Override // xi1.b, xi1.m
    public boolean g() {
        boolean z17 = this.f536230k;
        try {
            if (!super.g()) {
                if (!z17) {
                    return false;
                }
                this.f536230k = false;
                i();
                return true;
            }
            android.app.Activity w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) this.f536221b).w();
            if (w17 != null && !w17.isFinishing() && !w17.isDestroyed()) {
                ((android.view.ViewGroup) w17.getWindow().getDecorView()).setSystemUiVisibility(this.f169130m);
                w17.getWindow().clearFlags(1024);
                if (this.f169132o != null) {
                    w17.getWindow().setAttributes(this.f169132o);
                }
                xi1.l lVar = this.f169129l;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.h) lVar).f169127a.mo51612x60543150().b(xi1.o.e(this.f169131n), null);
                this.f169131n = -1;
                i();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.ActivityWindowFullscreenImpl", "exitFullscreen activity(%s) destroyed", w17);
            i();
            return true;
        } finally {
            this.f169133p = null;
        }
    }

    @Override // xi1.m
    public void h(int i17) {
        this.f536230k = true;
        if (i17 == -90) {
            this.f169133p = xi1.o.e(8);
        } else if (i17 == 0) {
            this.f169133p = xi1.o.e(1);
        } else if (i17 != 90) {
            this.f169133p = xi1.o.e(9);
        } else {
            this.f169133p = xi1.o.e(0);
        }
        xi1.l lVar = this.f169129l;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.h) lVar).f169127a.mo51612x60543150().b(this.f169133p, null);
    }
}
