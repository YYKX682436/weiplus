package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator */
/* loaded from: classes13.dex */
public class C26107x3ada911b extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.AbstractC26108xa6da3b37 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] f296941d;

    /* renamed from: e, reason: collision with root package name */
    public double[] f296942e;

    /* renamed from: f, reason: collision with root package name */
    public double f296943f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f296944g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f296945h;

    /* renamed from: i, reason: collision with root package name */
    public int f296946i;

    /* renamed from: j, reason: collision with root package name */
    public double f296947j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f296948k;

    /* renamed from: l, reason: collision with root package name */
    public double f296949l;

    /* renamed from: m, reason: collision with root package name */
    public double f296950m;

    /* renamed from: n, reason: collision with root package name */
    public float f296951n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f296952o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i f296953p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f296954q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener f296955r;

    /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator$MarkerTranslateStatusListener */
    /* loaded from: classes13.dex */
    public interface MarkerTranslateStatusListener {

        /* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator$MarkerTranslateStatusListener$AnimationStatus */
        /* loaded from: classes6.dex */
        public enum AnimationStatus {
            AnimationInterpolating,
            AnimationComplete
        }

        /* renamed from: onInterpolatePoint */
        void mo100106x54c9b90e(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus animationStatus);

        /* renamed from: onInterpolateRotation */
        void mo100107xc0881340(float f17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus animationStatus);
    }

    public C26107x3ada911b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, long j17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr) {
        this(interfaceC4409x88f1805a, j17, c4406x873d1d26Arr, false);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.AbstractC26108xa6da3b37
    /* renamed from: cancelAnimation */
    public void mo100098x5236b62a() {
        android.animation.AnimatorSet animatorSet;
        super.mo100098x5236b62a();
        synchronized (this) {
            if (this.f296944g && (animatorSet = this.f296952o) != null) {
                animatorSet.cancel();
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.AbstractC26108xa6da3b37
    /* renamed from: createSegmentAnimator */
    public android.animation.ValueAnimator mo100099x657bca9e(int i17) {
        return m100100x657bca9e(i17, 0.0f);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.AbstractC26108xa6da3b37
    /* renamed from: endAnimation */
    public void mo100101x2a2878e9() {
        android.animation.AnimatorSet animatorSet;
        super.mo100101x2a2878e9();
        synchronized (this) {
            if (this.f296944g && (animatorSet = this.f296952o) != null) {
                animatorSet.end();
            }
        }
    }

    /* renamed from: setAnimatorLeftTime */
    public void m100102x50acbffd(long j17) {
        if (j17 < 0) {
            return;
        }
        mo100098x5236b62a();
        double[] dArr = this.f296942e;
        int i17 = this.f296946i;
        this.f296943f = dArr[i17] * (1.0d - this.f296947j);
        while (true) {
            i17++;
            if (i17 >= this.f296941d.length - 1) {
                m100116xffd6ec16(j17);
                a(this.f296946i, (float) this.f296947j);
                mo100105x2d8c4542();
                return;
            }
            this.f296943f += this.f296942e[i17];
        }
    }

    /* renamed from: setAnimatorPosition */
    public void m100103x16d24db2(int i17, float f17) {
        if (i17 < 0 || i17 >= this.f296942e.length) {
            return;
        }
        mo100098x5236b62a();
        a(i17, h3.a.a(f17, 0.0f, 1.0f));
        mo100105x2d8c4542();
    }

    /* renamed from: setPrecision */
    public void m100104x9ba663c(double d17) {
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        this.f296950m = d17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.AbstractC26108xa6da3b37
    /* renamed from: startAnimation */
    public void mo100105x2d8c4542() {
        super.mo100105x2d8c4542();
        synchronized (this) {
            if (this.f296944g && this.f296952o != null && !this.f296954q) {
                this.f296954q = true;
                this.f296952o.start();
            }
        }
    }

    public C26107x3ada911b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, long j17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr, boolean z17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener) {
        super(interfaceC4409x88f1805a, j17);
        this.f296949l = 0.0d;
        this.f296950m = 0.0d;
        this.f296954q = false;
        this.f296955r = markerTranslateStatusListener;
        if (c4406x873d1d26Arr == null) {
            return;
        }
        this.f296941d = c4406x873d1d26Arr;
        this.f296942e = new double[c4406x873d1d26Arr.length - 1];
        this.f296953p = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i();
        int i17 = 0;
        while (i17 < c4406x873d1d26Arr.length - 1) {
            int i18 = i17 + 1;
            this.f296942e[i17] = this.f296953p.a(c4406x873d1d26Arr[i17], c4406x873d1d26Arr[i18]);
            this.f296943f += this.f296942e[i17];
            i17 = i18;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i19 = 0; i19 < c4406x873d1d26Arr.length - 1; i19++) {
            arrayList.add(mo100099x657bca9e(i19));
        }
        m100112x1e7e22c5().playSequentially(arrayList);
        this.f296944g = z17;
        if (z17) {
            a(0);
        }
    }

    /* renamed from: createSegmentAnimator */
    public android.animation.ValueAnimator m100100x657bca9e(int i17, float f17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a17 = this.f296953p.a(this.f296941d[i17]);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a18 = this.f296953p.a(this.f296941d[i17 + 1]);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h(a18.f296930a, a18.f296931b);
        double d17 = 1.0f - f17;
        double d18 = f17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h((a17.f296930a * d17) + (a18.f296930a * d18), (d17 * a17.f296931b) + (d18 * a18.f296931b));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i iVar = this.f296953p;
        double a19 = iVar.a(iVar.a(hVar2), this.f296953p.a(hVar));
        this.f296949l = 0.0d;
        this.f296948k = this.f296953p.a(hVar2);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((m100113x51e8b0a() * a19) / this.f296943f));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) a19);
        valueAnimator.addListener(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.a(this));
        valueAnimator.addUpdateListener(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.b(this, hVar2, hVar, i17, a19, f17));
        return valueAnimator;
    }

    public final void a(int i17, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m100100x657bca9e(i17, f17));
        for (int i18 = i17 + 1; i18 < this.f296941d.length - 1; i18++) {
            arrayList.add(mo100099x657bca9e(i18));
        }
        m100115xb4e39639(new android.animation.AnimatorSet());
        m100112x1e7e22c5().playSequentially(arrayList);
        if (this.f296944g) {
            a(i17);
        }
    }

    public final void a(int i17) {
        int i18;
        long j17;
        float f17;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f296952o = animatorSet;
        animatorSet.addListener(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.c(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = i17;
        int i27 = this.f296946i;
        int i28 = i17 + 1;
        float f18 = 0.0f;
        long j18 = 0;
        while (true) {
            java.lang.Object[] objArr = this.f296941d;
            if (i28 < objArr.length) {
                if (!objArr[i19].m37194xb2c87fbf(objArr[i28])) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a17 = this.f296953p.a(this.f296941d[i27]);
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a18 = this.f296953p.a(this.f296941d[i19]);
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h a19 = this.f296953p.a(this.f296941d[i28]);
                    double d17 = a18.f296930a;
                    double d18 = d17 - a17.f296930a;
                    double d19 = a17.f296931b;
                    double d27 = a18.f296931b;
                    int i29 = i19;
                    int i37 = i27;
                    float a27 = (float) a(d18, d19 - d27, a19.f296930a - d17, d27 - a19.f296931b);
                    if (arrayList.size() == 0) {
                        if (m100114x2817c635() == null) {
                            return;
                        }
                        float mo37235x79734cf4 = ((com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a) m100114x2817c635()).mo37235x79734cf4();
                        a27 = ((float) a(0.0d, 1.0d, a19.f296930a - a18.f296930a, a18.f296931b - a19.f296931b)) - mo37235x79734cf4;
                        i18 = i29;
                        f17 = mo37235x79734cf4;
                        j17 = 0;
                    } else {
                        long m100113x51e8b0a = (long) ((m100113x51e8b0a() * (((java.lang.Math.abs(a27) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.f296943f);
                        i18 = i29;
                        j18 = a(i37, i18) - (m100113x51e8b0a / 2);
                        j17 = m100113x51e8b0a;
                        f17 = f18;
                    }
                    float f19 = f17 + a27;
                    arrayList.add(a(f17, f19, j17, j18));
                    i27 = i18;
                    f18 = f19;
                    i19 = i28;
                }
                i28++;
            } else {
                this.f296952o.playSequentially(arrayList);
                return;
            }
        }
    }

    public C26107x3ada911b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, long j17, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26[] c4406x873d1d26Arr, boolean z17) {
        this(interfaceC4409x88f1805a, j17, c4406x873d1d26Arr, z17, null);
    }

    public final double a(double d17, double d18, double d19, double d27) {
        double sqrt = ((d17 * d19) + (d18 * d27)) / (java.lang.Math.sqrt((d17 * d17) + (d18 * d18)) * java.lang.Math.sqrt((d19 * d19) + (d27 * d27)));
        if (java.lang.Double.isNaN(sqrt)) {
            return 0.0d;
        }
        if (sqrt < -1.0d) {
            sqrt = -1.0d;
        }
        if (sqrt > 1.0d) {
            sqrt = 1.0d;
        }
        double acos = (java.lang.Math.acos(sqrt) * 180.0d) / 3.141592653589793d;
        if ((d17 * d27) - (d18 * d19) > 0.0d) {
            acos = -acos;
        }
        return (float) acos;
    }

    public final long a(int i17, int i18) {
        double d17 = 0.0d;
        while (i17 < i18) {
            d17 += this.f296942e[i17];
            i17++;
        }
        return (long) ((m100113x51e8b0a() * d17) / this.f296943f);
    }

    public final android.animation.ValueAnimator a(float f17, float f18, long j17, long j18) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(j17);
        ofFloat.setStartDelay(j18);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addListener(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.d(this));
        ofFloat.addUpdateListener(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.e(this));
        return ofFloat;
    }
}
