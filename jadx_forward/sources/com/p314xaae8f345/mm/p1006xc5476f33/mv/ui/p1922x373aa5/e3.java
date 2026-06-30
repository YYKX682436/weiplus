package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233351d;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233351d = c16693xf5eb90b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        int i18;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p08;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233351d;
        int i19 = c16693xf5eb90b6.f233228u;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = c16693xf5eb90b6.f233216f;
        java.lang.Integer valueOf = c1162x665295de != null ? java.lang.Integer.valueOf(c1162x665295de.w()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(valueOf, "null cannot be cast to non-null type kotlin.Int");
        int intValue = valueOf.intValue();
        int i27 = 0;
        if (intValue >= 0 && (i18 = i19 - intValue) > 0) {
            int i28 = i19 - 1;
            int i29 = 0;
            while (intValue < i28) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16693xf5eb90b6.lyricRv;
                i29++;
                c16693xf5eb90b6.d((c22849x81a93d25 == null || (p08 = c22849x81a93d25.p0(intValue)) == null) ? null : p08.f3639x46306858, i29 / i18);
                intValue++;
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c16693xf5eb90b6.f233216f;
        java.lang.Integer valueOf2 = c1162x665295de2 != null ? java.lang.Integer.valueOf(c1162x665295de2.w()) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(valueOf2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 0 || (i17 = intValue2 - i19) <= 0) {
            return;
        }
        while (true) {
            i19++;
            if (i19 >= intValue2) {
                return;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = c16693xf5eb90b6.lyricRv;
            i27++;
            float f17 = i17;
            c16693xf5eb90b6.d((c22849x81a93d252 == null || (p07 = c22849x81a93d252.p0(i19)) == null) ? null : p07.f3639x46306858, (f17 - i27) / f17);
        }
    }
}
