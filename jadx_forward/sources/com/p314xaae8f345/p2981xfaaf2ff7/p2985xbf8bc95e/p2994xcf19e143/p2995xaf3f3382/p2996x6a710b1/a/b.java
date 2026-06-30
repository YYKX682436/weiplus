package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h f296915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h f296916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f296917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f296918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f296919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b f296920f;

    public b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2, int i17, double d17, float f17) {
        this.f296920f = c26107x3ada911b;
        this.f296915a = hVar;
        this.f296916b = hVar2;
        this.f296917c = i17;
        this.f296918d = d17;
        this.f296919e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        double[] dArr;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i iVar;
        double[] dArr2;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.i iVar2;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d263;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener;
        double d17;
        double d18;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener2;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d264;
        int i17;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d265;
        if (this.f296915a.m100094xb2c87fbf(this.f296916b)) {
            return;
        }
        dArr = this.f296920f.f296942e;
        if (dArr[this.f296917c] == 0.0d) {
            return;
        }
        double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar = this.f296915a;
        double d19 = hVar.f296930a;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar2 = this.f296916b;
        double d27 = (hVar2.f296930a - d19) * parseDouble;
        double d28 = this.f296918d;
        double d29 = d19 + (d27 / d28);
        double d37 = hVar.f296931b;
        double d38 = d37 + (((hVar2.f296931b - d37) * parseDouble) / d28);
        if (this.f296920f.m100114x2817c635() == null) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b = this.f296920f;
        iVar = c26107x3ada911b.f296953p;
        c26107x3ada911b.f296945h = iVar.a(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h(d29, d38));
        this.f296920f.f296946i = this.f296917c;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b2 = this.f296920f;
        double d39 = this.f296919e;
        dArr2 = c26107x3ada911b2.f296942e;
        c26107x3ada911b2.f296947j = d39 + (parseDouble / dArr2[this.f296917c]);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b3 = this.f296920f;
        iVar2 = c26107x3ada911b3.f296953p;
        c4406x873d1d26 = this.f296920f.f296948k;
        c4406x873d1d262 = this.f296920f.f296945h;
        c26107x3ada911b3.f296949l = iVar2.a(c4406x873d1d26, c4406x873d1d262);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a) this.f296920f.m100114x2817c635();
        c4406x873d1d263 = this.f296920f.f296945h;
        interfaceC4409x88f1805a.mo37260xa32537ab(c4406x873d1d263);
        markerTranslateStatusListener = this.f296920f.f296955r;
        if (markerTranslateStatusListener != null) {
            d17 = this.f296920f.f296949l;
            d18 = this.f296920f.f296950m;
            if (d17 >= d18) {
                markerTranslateStatusListener2 = this.f296920f.f296955r;
                c4406x873d1d264 = this.f296920f.f296945h;
                i17 = this.f296920f.f296946i;
                markerTranslateStatusListener2.mo100106x54c9b90e(c4406x873d1d264, i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus.AnimationInterpolating);
                this.f296920f.f296949l = 0.0d;
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b4 = this.f296920f;
                c4406x873d1d265 = c26107x3ada911b4.f296945h;
                c26107x3ada911b4.f296948k = c4406x873d1d265;
            }
        }
    }
}
