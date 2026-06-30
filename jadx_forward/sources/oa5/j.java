package oa5;

/* loaded from: classes8.dex */
public class j extends oa5.b {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425415g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f425416h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Interpolator f425417i;

    public j(android.view.View view) {
        this.f425415g = new java.lang.ref.WeakReference(view.animate());
    }

    @Override // oa5.b
    public oa5.b a(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f17);
        }
        return this;
    }

    @Override // oa5.b
    public void c() {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.f425417i = null;
        }
    }

    @Override // oa5.b
    public oa5.b d(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b e(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b f(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b g(long j17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b h(android.view.animation.Interpolator interpolator) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
            this.f425417i = interpolator;
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b i(android.animation.Animator.AnimatorListener animatorListener) {
        if (((android.view.ViewPropertyAnimator) this.f425415g.get()) != null) {
            this.f425416h = animatorListener;
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b j(long j17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j17);
        }
        return this;
    }

    @Override // oa5.b
    public void l() {
        java.lang.System.currentTimeMillis();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f);
        java.lang.ref.WeakReference weakReference = this.f425415g;
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) weakReference.get();
        java.lang.Runnable runnable = this.f425390c;
        if (runnable != null) {
            this.f425388a.put(ofFloat, runnable);
            this.f425390c = null;
        }
        java.lang.Runnable runnable2 = this.f425391d;
        if (runnable2 != null) {
            this.f425389b.put(ofFloat, runnable2);
            this.f425391d = null;
        }
        viewPropertyAnimator.setListener(new oa5.h(this, ofFloat));
        if (this.f425392e != null) {
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            android.view.ViewPropertyAnimator viewPropertyAnimator2 = (android.view.ViewPropertyAnimator) weakReference.get();
            ofFloat2.setDuration(viewPropertyAnimator2 != null ? viewPropertyAnimator2.getDuration() : -1L);
            android.view.animation.Interpolator interpolator = this.f425417i;
            if (interpolator != null) {
                ofFloat2.setInterpolator(interpolator);
            }
            ofFloat2.setStartDelay(viewPropertyAnimator.getStartDelay());
            ofFloat2.addUpdateListener(new oa5.i(this));
            ofFloat2.start();
        }
        viewPropertyAnimator.start();
    }

    @Override // oa5.b
    public oa5.b m(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b n(float f17) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f17);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b o(java.lang.Runnable runnable) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withEndAction(runnable);
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b p(java.lang.Runnable runnable) {
        android.view.ViewPropertyAnimator viewPropertyAnimator = (android.view.ViewPropertyAnimator) this.f425415g.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withStartAction(runnable);
        }
        return this;
    }
}
