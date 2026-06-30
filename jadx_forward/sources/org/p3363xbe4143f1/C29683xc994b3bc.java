package org.p3363xbe4143f1;

/* renamed from: org.libpag.DisplayLink */
/* loaded from: classes15.dex */
class C29683xc994b3bc implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    private android.animation.ValueAnimator f429279a;

    /* renamed from: nativeContext */
    private long f75009xffae8598 = 0;

    /* renamed from: b, reason: collision with root package name */
    private android.os.Handler f429280b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: org.libpag.DisplayLink$a */
    /* loaded from: classes15.dex */
    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            org.p3363xbe4143f1.C29683xc994b3bc.this.f429279a.start();
        }
    }

    /* renamed from: org.libpag.DisplayLink$b */
    /* loaded from: classes15.dex */
    public class b implements java.lang.Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            org.p3363xbe4143f1.C29683xc994b3bc.this.f429279a.cancel();
        }
    }

    private C29683xc994b3bc() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f429279a = ofFloat;
        ofFloat.setDuration(1000L);
        this.f429279a.addUpdateListener(this);
        this.f429279a.setRepeatCount(-1);
    }

    /* renamed from: Create */
    public static org.p3363xbe4143f1.C29683xc994b3bc m154614x78ca8d1c(long j17) {
        org.p3363xbe4143f1.C29683xc994b3bc c29683xc994b3bc = new org.p3363xbe4143f1.C29683xc994b3bc();
        c29683xc994b3bc.f75009xffae8598 = j17;
        return c29683xc994b3bc;
    }

    /* renamed from: onUpdate */
    private native void m154616x5cf50f88(long j17);

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        m154616x5cf50f88(this.f75009xffae8598);
    }

    /* renamed from: start */
    public void m154617x68ac462() {
        this.f429280b.post(new org.p3363xbe4143f1.C29683xc994b3bc.a());
    }

    /* renamed from: stop */
    public void m154618x360802() {
        this.f429280b.post(new org.p3363xbe4143f1.C29683xc994b3bc.b());
    }
}
