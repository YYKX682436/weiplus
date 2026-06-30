package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController */
/* loaded from: classes13.dex */
public class C26082x40a924c5 {

    /* renamed from: mAnimatorModel */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 f49763x14dea115;

    /* renamed from: mDistances */
    private double[] f49764x8fb73d31;

    /* renamed from: mDuration */
    private long f49765xae41f521;

    /* renamed from: mEarthMercatorProjection */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26103x96456f6b f49766xd6bfd10b;

    /* renamed from: mIValueAnimatorStrategy */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.a f49767x3745f6ef;

    /* renamed from: mInitRotate */
    private final float f49768xe9a71ad8;

    /* renamed from: mLatLngs */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] f49769x9b46a300;

    /* renamed from: mModelType */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType f49770x2df8c16;

    /* renamed from: mRotateAnimatorSet */
    private android.animation.AnimatorSet f49771x67c1d6b3;

    /* renamed from: mRotateEnabled */
    private final boolean f49772x1d03a1f9;

    /* renamed from: mSumDistance */
    private double f49773x688944b3;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f296901a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType.m99439xcee59d22().length];
            f296901a = iArr;
            try {
                iArr[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType.MODEL_OVERLAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController$a */
    /* loaded from: classes13.dex */
    public interface a {
        android.animation.ValueAnimator a(float f17, float f18);

        double[] a();
    }

    public C26082x40a924c5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 interfaceC26027x51ae46b9, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType modelType, boolean z17, float f17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr, double[] dArr, double d17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26103x96456f6b c26103x96456f6b) {
        this.f49772x1d03a1f9 = z17;
        this.f49768xe9a71ad8 = f17;
        if (z17) {
            this.f49763x14dea115 = interfaceC26027x51ae46b9;
            this.f49765xae41f521 = j17;
            this.f49770x2df8c16 = modelType;
            this.f49771x67c1d6b3 = new android.animation.AnimatorSet();
            this.f49769x9b46a300 = c26041x873d1d26Arr;
            this.f49764x8fb73d31 = dArr;
            this.f49773x688944b3 = d17;
            this.f49766xd6bfd10b = c26103x96456f6b;
            m99966x2770e3db();
            m99965x652ec539();
        }
    }

    /* renamed from: calculateAngle */
    private double m99962xc302b50d(double d17, double d18, double d19, double d27) {
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

    /* renamed from: calculateDelay */
    private long m99963xc328f5bd(int i17, int i18) {
        double d17 = 0.0d;
        while (i17 < i18) {
            d17 += this.f49764x8fb73d31[i17];
            i17++;
        }
        return (long) ((this.f49765xae41f521 * d17) / this.f49773x688944b3);
    }

    /* renamed from: createRotateAnimator */
    private android.animation.ValueAnimator m99964xa0c6e57e(float f17, float f18, long j17, long j18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.a aVar = this.f49767x3745f6ef;
        float f19 = this.f49768xe9a71ad8;
        android.animation.ValueAnimator a17 = aVar.a(f17 + f19, f18 + f19);
        a17.setDuration(j17);
        a17.setStartDelay(j18);
        a17.setInterpolator(new android.view.animation.LinearInterpolator());
        a17.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.this.f49763x14dea115 == null) {
                    return;
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.this.f49763x14dea115.mo36860x742bae00((float) parseDouble);
            }
        });
        return a17;
    }

    /* renamed from: initRotateAnimation */
    private void m99965x652ec539() {
        int i17;
        long j17;
        float f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float f18 = 0.0f;
        int i18 = 0;
        int i19 = 1;
        int i27 = 0;
        long j18 = 0;
        while (true) {
            java.lang.Object[] objArr = this.f49769x9b46a300;
            if (i19 >= objArr.length) {
                this.f49771x67c1d6b3.playSequentially(arrayList);
                return;
            }
            if (objArr[i27].m99507xb2c87fbf(objArr[i19])) {
                i17 = i19;
            } else {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd5 = this.f49766xd6bfd10b.m100076xba582bd5(this.f49769x9b46a300[i18]);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd52 = this.f49766xd6bfd10b.m100076xba582bd5(this.f49769x9b46a300[i27]);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd53 = this.f49766xd6bfd10b.m100076xba582bd5(this.f49769x9b46a300[i19]);
                double d17 = m100076xba582bd52.f296904x;
                double d18 = d17 - m100076xba582bd5.f296904x;
                float f19 = f18;
                double d19 = m100076xba582bd5.f296905y;
                int i28 = i18;
                double d27 = m100076xba582bd52.f296905y;
                int i29 = i19;
                int i37 = i27;
                float m99962xc302b50d = (float) m99962xc302b50d(d18, d19 - d27, m100076xba582bd53.f296904x - d17, d27 - m100076xba582bd53.f296905y);
                if (arrayList.size() == 0) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 interfaceC26027x51ae46b9 = this.f49763x14dea115;
                    if (interfaceC26027x51ae46b9 == null) {
                        return;
                    }
                    float mo36858x79734cf4 = interfaceC26027x51ae46b9.mo36858x79734cf4();
                    double[] a17 = this.f49767x3745f6ef.a();
                    i17 = i29;
                    m99962xc302b50d = ((float) m99962xc302b50d(a17[0], a17[1], m100076xba582bd53.f296904x - m100076xba582bd52.f296904x, m100076xba582bd52.f296905y - m100076xba582bd53.f296905y)) - mo36858x79734cf4;
                    f17 = mo36858x79734cf4;
                    j17 = 0;
                } else {
                    i17 = i29;
                    long abs = (long) ((this.f49765xae41f521 * (((java.lang.Math.abs(m99962xc302b50d) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.f49773x688944b3);
                    j18 = m99963xc328f5bd(i28, i37) - (abs / 2);
                    j17 = abs;
                    f17 = f19;
                }
                float f27 = f17 + m99962xc302b50d;
                arrayList.add(m99964xa0c6e57e(f17, f27, j17, j18));
                f18 = f27;
                i18 = i37;
                i27 = i17;
            }
            i19 = i17 + 1;
        }
    }

    /* renamed from: initValueAnimatorStrategy */
    private void m99966x2770e3db() {
        this.f49767x3745f6ef = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.a() { // from class: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController.1
            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.a
            public final android.animation.ValueAnimator a(float f17, float f18) {
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.AnonymousClass3.f296901a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.this.f49770x2df8c16.ordinal()] != 1) {
                    return android.animation.ValueAnimator.ofFloat(f17, f18);
                }
                return android.animation.ValueAnimator.ofFloat(f17 * (-1.0f), f18 * (-1.0f));
            }

            @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.a
            public final double[] a() {
                double[] dArr = {0.0d, 1.0d};
                int[] iArr = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.AnonymousClass3.f296901a;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5.this.f49770x2df8c16.ordinal();
                return dArr;
            }
        };
    }

    /* renamed from: cancelAnimation */
    public void m99967x5236b62a() {
        if (this.f49772x1d03a1f9) {
            this.f49771x67c1d6b3.cancel();
        }
    }

    /* renamed from: endAnimation */
    public void m99968x2a2878e9() {
        if (this.f49772x1d03a1f9) {
            this.f49771x67c1d6b3.end();
        }
    }

    /* renamed from: startAnimation */
    public void m99969x2d8c4542() {
        if (this.f49772x1d03a1f9 && !this.f49771x67c1d6b3.isRunning()) {
            this.f49771x67c1d6b3.start();
        }
    }
}
