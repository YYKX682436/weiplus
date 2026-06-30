package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class co implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f285274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f285275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f285276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 f285277g;

    public co(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5, java.lang.CharSequence charSequence, long j17, int i17) {
        this.f285277g = c21917xeb4fc2b5;
        this.f285274d = charSequence;
        this.f285275e = j17;
        this.f285276f = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.CharSequence charSequence;
        int i17;
        int i18;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = this.f285277g;
        c21917xeb4fc2b5.f284752r.clear();
        android.text.SpannableStringBuilder spannableStringBuilder = c21917xeb4fc2b5.f284752r;
        int i19 = c21917xeb4fc2b5.f284746i;
        long j17 = this.f285275e;
        c21917xeb4fc2b5.getClass();
        if (spannableStringBuilder != null && (charSequence = this.f285274d) != null && charSequence.length() != 0) {
            int length = charSequence.length();
            if (charSequence.length() >= i19) {
                int i27 = i19 + 20;
                if (i27 > charSequence.length()) {
                    i27 = charSequence.length();
                }
                i18 = i19;
                i17 = i27;
            } else {
                i17 = length;
                i18 = i17;
            }
            jl1.a aVar = new jl1.a(0, c21917xeb4fc2b5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("ratio", 0.0f, 1.0f));
            ofPropertyValuesHolder.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.Cdo(c21917xeb4fc2b5, aVar, spannableStringBuilder, charSequence, i17, i18, j17));
            ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.eo(c21917xeb4fc2b5, j17, spannableStringBuilder, charSequence, i17, i18));
            ofPropertyValuesHolder.setDuration(150L).start();
        }
        int i28 = c21917xeb4fc2b5.f284746i + 20;
        int i29 = this.f285276f;
        if (i28 > i29) {
            i28 = i29;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "(%s)currentContentLength:%s newCurrentContentLength:%s endNum:%s animating:%s", java.lang.Integer.valueOf(c21917xeb4fc2b5.f284742e.hashCode()), java.lang.Integer.valueOf(c21917xeb4fc2b5.f284746i), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Boolean.valueOf(c21917xeb4fc2b5.f284747m));
        c21917xeb4fc2b5.f284746i = i28;
        if (i29 != i28) {
            return true;
        }
        if (c21917xeb4fc2b5.f284747m) {
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5874xa80bd9bc c5874xa80bd9bc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5874xa80bd9bc();
        c5874xa80bd9bc.f136182g.f89270a = this.f285275e;
        c5874xa80bd9bc.e();
        return false;
    }
}
