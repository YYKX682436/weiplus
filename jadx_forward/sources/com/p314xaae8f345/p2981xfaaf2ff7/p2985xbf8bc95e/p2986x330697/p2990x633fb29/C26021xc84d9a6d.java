package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator */
/* loaded from: classes13.dex */
public class C26021xc84d9a6d extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37 {

    /* renamed from: mAnimatorEndListeners */
    private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener> f49434x82704838;

    /* renamed from: mAnimatorModel */
    private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 f49435x14dea115;

    /* renamed from: mDistances */
    private double[] f49436x8fb73d31;

    /* renamed from: mEarthMercatorProjection */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26103x96456f6b f49437xd6bfd10b;

    /* renamed from: mLatLngs */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] f49438x9b46a300;

    /* renamed from: mRotateAnimationController */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5 f49439xa3188f8;

    /* renamed from: mSumDistance */
    private double f49440x688944b3;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: animatorModel */
        private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 f49441xb9d09882;

        /* renamed from: duration */
        private final long f49442x89444d94;

        /* renamed from: latLngs */
        private final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] f49444xfd2df02d;

        /* renamed from: rotateEnabled */
        private boolean f49446xc1f59966 = false;

        /* renamed from: initRotate */
        private float f49443xd75228b = 0.0f;

        /* renamed from: modelType */
        private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType f49445x88284203 = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType.MARKER_OVERLAY;

        public Builder(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9 interfaceC26027x51ae46b9, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr) {
            this.f49441xb9d09882 = interfaceC26027x51ae46b9;
            this.f49442x89444d94 = j17;
            this.f49444xfd2df02d = c26041x873d1d26Arr;
        }

        /* renamed from: build */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d m99433x59bc66e() {
            return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d(this);
        }

        /* renamed from: initRotate */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.Builder m99434xd75228b(float f17) {
            this.f49443xd75228b = f17;
            return this;
        }

        /* renamed from: modelType */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.Builder m99435x88284203(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.ModelType modelType) {
            this.f49445x88284203 = modelType;
            return this;
        }

        /* renamed from: rotateEnabled */
        public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.Builder m99436xc1f59966(boolean z17) {
            this.f49446xc1f59966 = z17;
            return this;
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator$ModelType */
    /* loaded from: classes13.dex */
    public enum ModelType {
        MARKER_OVERLAY,
        MODEL_OVERLAY
    }

    public C26021xc84d9a6d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.Builder builder) {
        super(builder.f49441xb9d09882, builder.f49442x89444d94);
        this.f49435x14dea115 = builder.f49441xb9d09882;
        if (builder.f49444xfd2df02d == null || builder.f49444xfd2df02d.length <= 0 || builder.f49442x89444d94 < 0) {
            return;
        }
        this.f49438x9b46a300 = builder.f49444xfd2df02d;
        this.f49434x82704838 = new java.util.ArrayList();
        this.f49437xd6bfd10b = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26103x96456f6b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f49436x8fb73d31 = new double[this.f49438x9b46a300.length - 1];
        int i17 = 0;
        while (true) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr = this.f49438x9b46a300;
            if (i17 >= c26041x873d1d26Arr.length - 1) {
                break;
            }
            int i18 = i17 + 1;
            this.f49436x8fb73d31[i17] = this.f49437xd6bfd10b.m100074x69db0a53(c26041x873d1d26Arr[i17], c26041x873d1d26Arr[i18]);
            this.f49440x688944b3 += this.f49436x8fb73d31[i17];
            i17 = i18;
        }
        for (int i19 = 0; i19 < this.f49438x9b46a300.length - 1; i19++) {
            arrayList.add(mo99422x657bca9e(i19));
        }
        m100065x1e7e22c5().playSequentially(arrayList);
        this.f49439xa3188f8 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26082x40a924c5(builder.f49441xb9d09882, builder.f49442x89444d94, builder.f49445x88284203, builder.f49446xc1f59966, builder.f49443xd75228b, this.f49438x9b46a300, this.f49436x8fb73d31, this.f49440x688944b3, this.f49437xd6bfd10b);
    }

    /* renamed from: addAnimatorEndListener */
    public void m99420xc3f03ee7(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener iAnimatorEndListener) {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener> list = this.f49434x82704838;
        if (list == null || list.contains(iAnimatorEndListener) || iAnimatorEndListener == null) {
            return;
        }
        this.f49434x82704838.add(iAnimatorEndListener);
        m100063x35617db7();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37
    /* renamed from: cancelAnimation */
    public void mo99421x5236b62a() {
        super.mo99421x5236b62a();
        if (this.f49439xa3188f8 == null) {
            return;
        }
        synchronized (this) {
            this.f49439xa3188f8.m99967x5236b62a();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37
    /* renamed from: createSegmentAnimator */
    public android.animation.ValueAnimator mo99422x657bca9e(final int i17) {
        final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd5 = this.f49437xd6bfd10b.m100076xba582bd5(this.f49438x9b46a300[i17]);
        final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570 m100076xba582bd52 = this.f49437xd6bfd10b.m100076xba582bd5(this.f49438x9b46a300[i17 + 1]);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setDuration((long) ((m100066x51e8b0a() * this.f49436x8fb73d31[i17]) / this.f49440x688944b3));
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.setFloatValues((float) this.f49436x8fb73d31[i17]);
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                if (m100076xba582bd5.m100072xb2c87fbf(m100076xba582bd52)) {
                    return;
                }
                double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator2.getAnimatedValue()));
                double d17 = m100076xba582bd5.f296904x;
                double d18 = d17 + (((m100076xba582bd52.f296904x - d17) * parseDouble) / com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.this.f49436x8fb73d31[i17]);
                double d19 = m100076xba582bd5.f296905y;
                double d27 = d19 + (((m100076xba582bd52.f296905y - d19) * parseDouble) / com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.this.f49436x8fb73d31[i17]);
                if (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.this.f49435x14dea115 == null) {
                    return;
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.this.f49435x14dea115.mo36859xa32537ab(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26021xc84d9a6d.this.f49437xd6bfd10b.m100075x89192361(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.C26102x49b6570(d18, d27)));
            }
        });
        return valueAnimator;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37
    /* renamed from: endAnimation */
    public void mo99423x2a2878e9() {
        super.mo99423x2a2878e9();
        if (this.f49439xa3188f8 == null) {
            return;
        }
        synchronized (this) {
            this.f49439xa3188f8.m99968x2a2878e9();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37
    /* renamed from: innerAnimationEnd */
    public void mo99424x413de82d() {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener> list = this.f49434x82704838;
        if (list == null) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo36966x61363115();
        }
    }

    /* renamed from: removeAnimatorEndListener */
    public void m99425xcae17624(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener iAnimatorEndListener) {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener> list = this.f49434x82704838;
        if (list == null) {
            return;
        }
        list.remove(iAnimatorEndListener);
        m100068x94c16034();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37
    /* renamed from: startAnimation */
    public void mo99426x2d8c4542() {
        super.mo99426x2d8c4542();
        if (this.f49439xa3188f8 == null) {
            return;
        }
        synchronized (this) {
            this.f49439xa3188f8.m99969x2d8c4542();
        }
    }
}
