package kz3;

/* loaded from: classes15.dex */
public final class p implements uy3.u {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f395439d;

    /* renamed from: e, reason: collision with root package name */
    public final kz3.r f395440e;

    /* renamed from: f, reason: collision with root package name */
    public ry3.m f395441f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f395442g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f395443h;

    /* renamed from: i, reason: collision with root package name */
    public int f395444i;

    /* renamed from: m, reason: collision with root package name */
    public int f395445m;

    /* renamed from: n, reason: collision with root package name */
    public final int f395446n;

    /* renamed from: o, reason: collision with root package name */
    public final int f395447o;

    /* renamed from: p, reason: collision with root package name */
    public float f395448p;

    /* renamed from: q, reason: collision with root package name */
    public float f395449q;

    /* renamed from: r, reason: collision with root package name */
    public final kz3.q f395450r;

    /* renamed from: s, reason: collision with root package name */
    public lz3.e f395451s;

    /* renamed from: t, reason: collision with root package name */
    public int f395452t;

    /* renamed from: u, reason: collision with root package name */
    public lz3.c f395453u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f395454v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f395455w;

    public p(android.content.Context context, kz3.r ocrViewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrViewModel, "ocrViewModel");
        this.f395439d = context;
        this.f395440e = ocrViewModel;
        this.f395450r = new kz3.q();
        this.f395446n = com.p314xaae8f345.mm.ui.bl.h(context);
        this.f395447o = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
        this.f395455w = true;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Float.valueOf(f17);
        objArr[2] = java.lang.Float.valueOf(f18);
        objArr[3] = java.lang.Integer.valueOf(this.f395446n);
        ry3.m mVar = this.f395441f;
        objArr[4] = mVar != null ? java.lang.Boolean.valueOf(mVar.f483057a) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "onDialogShowAnimationStart dialogHeight: %s, startTransY: %s, endTransY: %s, statusBarHeight: %s, enableFullScreen: %s", objArr);
        this.f395448p = f17;
        this.f395449q = f18;
        m(false);
        lz3.c cVar = new lz3.c();
        cVar.f403900a = this.f395442g;
        cVar.f403902c.set(this.f395445m, this.f395444i);
        cVar.f403903d.set(k(), j());
        this.f395453u = cVar;
        lz3.e eVar = this.f395451s;
        if (eVar != null) {
            eVar.e(cVar);
        }
        lz3.c cVar2 = this.f395453u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar2);
        boolean z17 = cVar2.f403901b;
        kz3.q qVar = this.f395450r;
        qVar.f395456a = z17;
        lz3.c cVar3 = this.f395453u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar3);
        qVar.f395458c = cVar3.f403905f.f403906a.x;
        lz3.c cVar4 = this.f395453u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar4);
        if (cVar4.f403901b && (this.f395442g instanceof db5.f0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(this.f395442g, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            qVar.f395457b = (k() * 1.0f) / ((db5.f0) r0).mo79182x97cbed21();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "onDialogShowAnimationStart isLongImage: %s, showDefaultScale: %s, showDoubleScale: %s", java.lang.Boolean.valueOf(qVar.f395456a), java.lang.Float.valueOf(qVar.f395458c), java.lang.Float.valueOf(qVar.f395457b));
        o();
        g();
        android.view.View view = this.f395442g;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view).mo45733x95d78576(false);
        }
    }

    @Override // uy3.u
    public void b() {
        ((kz3.l) this.f395440e).f395433r = false;
    }

    @Override // uy3.u
    public void c() {
        lz3.e eVar;
        this.f395455w = true;
        if (this.f395454v) {
            this.f395454v = false;
            return;
        }
        lz3.c cVar = this.f395453u;
        if (cVar != null && (eVar = this.f395451s) != null) {
            eVar.a(cVar);
        }
        m(false);
        n(false);
        if (this.f395452t == 1 && !l()) {
            int i17 = this.f395444i;
            android.view.View view = this.f395443h;
            if (view == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i17;
            } else {
                layoutParams = null;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        lz3.e eVar;
        lz3.e eVar2;
        float min = java.lang.Math.min(java.lang.Math.max((java.lang.Math.abs(this.f395448p - f17) * 1.0f) / java.lang.Math.abs(this.f395449q - this.f395448p), 0.0f), 1.0f);
        if (i17 == 0) {
            if (this.f395452t == 1 && !l()) {
                int j17 = this.f395444i + ((int) ((j() - r6) * min));
                int k17 = k();
                i((int) (this.f395445m + ((k17 - r3) * min)), j17);
                android.view.View view = this.f395443h;
                if (view != null) {
                    view.getLayoutParams();
                }
                android.view.View view2 = this.f395443h;
                if (view2 != null) {
                    view2.getLayoutParams();
                }
            }
            if (this.f395442g instanceof db5.f0) {
                lz3.e eVar3 = this.f395451s;
                if ((eVar3 != null && eVar3.d()) && (eVar2 = this.f395451s) != null) {
                    eVar2.c(min);
                }
            }
        } else {
            int k18 = k();
            float f19 = this.f395445m + ((k18 - r2) * min);
            if (this.f395452t == 1 && !l()) {
                int i18 = (int) f19;
                android.view.View view3 = this.f395443h;
                if (view3 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = i18;
                    } else {
                        layoutParams = null;
                    }
                    view3.setLayoutParams(layoutParams);
                }
            }
            if (this.f395442g instanceof db5.f0) {
                lz3.e eVar4 = this.f395451s;
                if ((eVar4 != null && eVar4.d()) && (eVar = this.f395451s) != null) {
                    eVar.b(1.0f - min);
                }
            }
        }
        if (min < 1.0f) {
            n(false);
        } else {
            n(true);
            this.f395454v = false;
        }
    }

    @Override // uy3.u
    public void e() {
        this.f395455w = false;
        m(true);
        android.view.KeyEvent.Callback callback = this.f395442g;
        if (callback instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).f();
        }
        android.view.View view = this.f395442g;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view).mo45733x95d78576(true);
        }
        android.view.View view2 = this.f395442g;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ocr/ImageOCRResultDialogMoveListener", "onDialogDismissAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f395452t == 1 && l() && (this.f395442g instanceof db5.f0)) {
            i(this.f395444i, this.f395445m);
            android.view.KeyEvent.Callback callback2 = this.f395442g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback2).i();
        }
    }

    @Override // uy3.u
    public void f() {
        this.f395455w = false;
        if (this.f395452t == 1 && l()) {
            n(true);
        }
    }

    public final void g() {
        android.view.View view = this.f395442g;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            float m45731x299dd38e = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view).m45731x299dd38e();
            kz3.q qVar = this.f395450r;
            if (m45731x299dd38e > qVar.f395458c) {
                android.view.View view2 = this.f395442g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view2).m45744x2456349a(qVar.f395458c);
            }
        }
    }

    @Override // uy3.u
    public void h() {
        c();
        this.f395454v = true;
    }

    public final void i(int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view = this.f395443h;
        if (view == null) {
            return;
        }
        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
            layoutParams = null;
        } else {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        view.setLayoutParams(layoutParams);
    }

    public final int j() {
        ry3.m mVar = this.f395441f;
        return (int) (mVar != null ? mVar.f483057a : true ? this.f395449q + this.f395446n : this.f395449q);
    }

    public final int k() {
        return this.f395445m - (this.f395447o * 2);
    }

    public final boolean l() {
        return this.f395439d.getResources().getConfiguration().orientation == 2;
    }

    public final void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageOcrResultDialogMoveListener", "setCanRefresh %b, view: %s", java.lang.Boolean.valueOf(z17), this.f395442g);
        android.view.KeyEvent.Callback callback = this.f395442g;
        if (callback instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).mo45735x96646ed(z17);
        }
    }

    public final void n(boolean z17) {
        android.view.View view;
        java.lang.Object obj = ((kz3.l) this.f395440e).f395430o;
        if (!(obj instanceof android.view.View) || (view = (android.view.View) obj) == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ocr/ImageGalleryImageOCRHelper", "showBackgroundOpView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void o() {
        android.view.KeyEvent.Callback callback = this.f395442g;
        if ((callback instanceof db5.f0) && this.f395452t == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).mo45736x50bb6417(java.lang.Float.valueOf(this.f395450r.f395458c));
        }
    }
}
