package rl1;

/* loaded from: classes13.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl1.g f478691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl1.g f478692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double[] f478693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rl1.e f478694g;

    public c(rl1.e eVar, rl1.g gVar, rl1.g gVar2, double[] dArr) {
        this.f478694g = eVar;
        this.f478691d = gVar;
        this.f478692e = gVar2;
        this.f478693f = dArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        rl1.g gVar = this.f478691d;
        rl1.g gVar2 = this.f478692e;
        if (gVar.m162701xb2c87fbf(gVar2)) {
            return;
        }
        double parseDouble = java.lang.Double.parseDouble(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        double d17 = gVar.f478711a;
        double d18 = (gVar2.f478711a - d17) * parseDouble;
        double d19 = this.f478693f[0];
        double d27 = d17 + (d18 / d19);
        double d28 = gVar.f478712b;
        double d29 = d28 + (((gVar2.f478712b - d28) * parseDouble) / d19);
        rl1.e eVar = this.f478694g;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = eVar.f478696a;
        eVar.f478699d.getClass();
        interfaceC4409x88f1805a.mo37260xa32537ab(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (d29 / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d27 / 4.007501668557849E7d) - 0.5d) * 360.0d));
    }
}
