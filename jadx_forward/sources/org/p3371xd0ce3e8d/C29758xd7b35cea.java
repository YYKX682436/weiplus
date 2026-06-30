package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.DynamicBitrateAdjuster */
/* loaded from: classes15.dex */
class C29758xd7b35cea extends org.p3371xd0ce3e8d.C29728x6ba59bd8 {

    /* renamed from: BITRATE_ADJUSTMENT_MAX_SCALE */
    private static final double f75295x309edfcf = 4.0d;

    /* renamed from: BITRATE_ADJUSTMENT_SEC */
    private static final double f75296xefa40d91 = 3.0d;

    /* renamed from: BITRATE_ADJUSTMENT_STEPS */
    private static final int f75297x96ddd067 = 20;

    /* renamed from: BITS_PER_BYTE */
    private static final double f75298xd62ce23 = 8.0d;

    /* renamed from: bitrateAdjustmentScaleExp */
    private int f75299xc3ddb74d;

    /* renamed from: deviationBytes */
    private double f75300xfb99046a;

    /* renamed from: timeSinceLastAdjustmentMs */
    private double f75301x30d43836;

    /* renamed from: getBitrateAdjustmentScale */
    private double m155406x2e2453a6() {
        return java.lang.Math.pow(f75295x309edfcf, this.f75299xc3ddb74d / 20.0d);
    }

    @Override // org.p3371xd0ce3e8d.C29728x6ba59bd8, org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: getAdjustedBitrateBps */
    public int mo155138x5cbee03c() {
        return (int) (this.f75126x661583a9 * m155406x2e2453a6());
    }

    @Override // org.p3371xd0ce3e8d.C29728x6ba59bd8, org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: reportEncodedFrame */
    public void mo155140x9acaa853(int i17) {
        double d17 = this.f75127xbc6a620d;
        if (d17 == 0.0d) {
            return;
        }
        int i18 = this.f75126x661583a9;
        double d18 = this.f75300xfb99046a + (i17 - ((i18 / f75298xd62ce23) / d17));
        this.f75300xfb99046a = d18;
        this.f75301x30d43836 += 1000.0d / d17;
        double d19 = i18 / f75298xd62ce23;
        double d27 = f75296xefa40d91 * d19;
        double min = java.lang.Math.min(d18, d27);
        this.f75300xfb99046a = min;
        double max = java.lang.Math.max(min, -d27);
        this.f75300xfb99046a = max;
        if (this.f75301x30d43836 <= 3000.0d) {
            return;
        }
        if (max > d19) {
            int i19 = this.f75299xc3ddb74d - ((int) ((max / d19) + 0.5d));
            this.f75299xc3ddb74d = i19;
            this.f75299xc3ddb74d = java.lang.Math.max(i19, -20);
            this.f75300xfb99046a = d19;
        } else {
            double d28 = -d19;
            if (max < d28) {
                int i27 = this.f75299xc3ddb74d + ((int) (((-max) / d19) + 0.5d));
                this.f75299xc3ddb74d = i27;
                this.f75299xc3ddb74d = java.lang.Math.min(i27, 20);
                this.f75300xfb99046a = d28;
            }
        }
        this.f75301x30d43836 = 0.0d;
    }

    @Override // org.p3371xd0ce3e8d.C29728x6ba59bd8, org.p3371xd0ce3e8d.InterfaceC29729xaf9676e9
    /* renamed from: setTargets */
    public void mo155141x558e4a40(int i17, double d17) {
        int i18 = this.f75126x661583a9;
        if (i18 > 0 && i17 < i18) {
            this.f75300xfb99046a = (this.f75300xfb99046a * i17) / i18;
        }
        super.mo155141x558e4a40(i17, d17);
    }
}
