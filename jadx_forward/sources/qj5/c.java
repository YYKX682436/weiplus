package qj5;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f445500d;

    public c(qj5.n nVar) {
        this.f445500d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        android.view.View decorView2;
        float f17;
        qj5.n nVar = this.f445500d;
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed = nVar.E2;
        if (c22991x5a0fbed == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        float width = c22991x5a0fbed.getWidth();
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed2 = nVar.E2;
        if (c22991x5a0fbed2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        float height = c22991x5a0fbed2.getHeight();
        qj5.o oVar = nVar.f445516q2;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
        android.view.Window window = oVar.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        float width2 = decorView.getWidth();
        qj5.o oVar2 = nVar.f445516q2;
        if (oVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
        android.view.Window window2 = oVar2.getWindow();
        if (window2 == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        float height2 = decorView2.getHeight();
        if (nVar.h()) {
            if (width > 0.0f) {
                f17 = width2 / width;
            }
            f17 = 0.0f;
        } else {
            if (height > 0.0f) {
                f17 = height2 / height;
            }
            f17 = 0.0f;
        }
        if (!((java.lang.Float.isInfinite(f17) || java.lang.Float.isNaN(f17)) ? false : true) || f17 <= 0.0f) {
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed3 = nVar.E2;
            if (c22991x5a0fbed3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            c22991x5a0fbed3.setScaleX(1.0f);
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed4 = nVar.E2;
            if (c22991x5a0fbed4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            c22991x5a0fbed4.setScaleY(1.0f);
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed5 = nVar.E2;
            if (c22991x5a0fbed5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            c22991x5a0fbed5.setTranslationX(0.0f);
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed6 = nVar.E2;
            if (c22991x5a0fbed6 != null) {
                c22991x5a0fbed6.setTranslationY(0.0f);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
        }
        float f18 = width / 2.0f;
        float f19 = height / 2.0f;
        float f27 = width2 / 2.0f;
        float f28 = height2 / 2.0f;
        if (nVar.h()) {
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed7 = nVar.E2;
            if (c22991x5a0fbed7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            float f29 = f27 - f18;
            if (c22991x5a0fbed7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c22991x5a0fbed7.getLayoutParams();
            c22991x5a0fbed7.setTranslationX(f29 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0));
        } else {
            com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed8 = nVar.E2;
            if (c22991x5a0fbed8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            float f37 = f28 - f19;
            if (c22991x5a0fbed8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
                throw null;
            }
            c22991x5a0fbed8.setTranslationY(f37 - com.p314xaae8f345.mm.ui.kk.b(c22991x5a0fbed8));
        }
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed9 = nVar.E2;
        if (c22991x5a0fbed9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed9.setScaleX(f17);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed10 = nVar.E2;
        if (c22991x5a0fbed10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
        c22991x5a0fbed10.setScaleY(f17);
        com.p314xaae8f345.mm.p2830x630df168.C22991x5a0fbed c22991x5a0fbed11 = nVar.E2;
        if (c22991x5a0fbed11 != null) {
            c22991x5a0fbed11.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).start();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageView");
            throw null;
        }
    }
}
