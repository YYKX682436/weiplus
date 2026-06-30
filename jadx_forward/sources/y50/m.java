package y50;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final y50.m f540993a;

    /* renamed from: b, reason: collision with root package name */
    public static final y50.e f540994b;

    /* renamed from: c, reason: collision with root package name */
    public static final y50.e f540995c;

    static {
        y50.m mVar = new y50.m();
        f540993a = mVar;
        f540994b = new y50.e(new y50.k(mVar), new y50.l(mVar));
        f540995c = new y50.e(new y50.f(mVar), new y50.g(mVar));
    }

    public static void a(y50.m mVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, java.lang.Integer[] targetColor, long j17, java.lang.Integer[] numArr, android.view.animation.Interpolator interpolator, int i17, java.lang.Object obj) {
        long j18 = (i17 & 4) != 0 ? 0L : j17;
        java.lang.Integer[] fromColor = (i17 & 8) != 0 ? new java.lang.Integer[0] : numArr;
        android.view.animation.Interpolator interpolator2 = (i17 & 16) != 0 ? null : interpolator;
        mVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetColor, "targetColor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromColor, "fromColor");
        long j19 = j18;
        android.view.animation.Interpolator interpolator3 = interpolator2;
        mVar.b(activity, f540994b, j19, (java.lang.Integer) kz5.z.U(targetColor, 0), (java.lang.Integer) kz5.z.U(fromColor, 0), interpolator3);
        mVar.b(activity, f540995c, j19, (java.lang.Integer) kz5.z.U(targetColor, 1), (java.lang.Integer) kz5.z.U(fromColor, 1), interpolator3);
    }

    public final void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, y50.e eVar, long j17, java.lang.Integer num, java.lang.Integer num2, android.view.animation.Interpolator interpolator) {
        int intValue;
        android.animation.ValueAnimator valueAnimator = eVar.f540981d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        eVar.f540981d = null;
        java.lang.Integer num3 = eVar.f540980c;
        yz5.l lVar = eVar.f540978a;
        if (num3 == null) {
            if (num == null) {
                return;
            } else {
                eVar.f540980c = (java.lang.Integer) lVar.mo146xb9724478(abstractActivityC21394xb3d2c0cf);
            }
        }
        if (num != null) {
            intValue = num.intValue();
        } else {
            java.lang.Integer num4 = eVar.f540980c;
            intValue = num4 != null ? num4.intValue() : 0;
        }
        if (j17 <= 0) {
            if (num == null) {
                eVar.f540980c = null;
            }
            eVar.f540979b.mo149xb9724478(abstractActivityC21394xb3d2c0cf, java.lang.Integer.valueOf(intValue));
            return;
        }
        int intValue2 = num2 != null ? num2.intValue() : ((java.lang.Number) lVar.mo146xb9724478(abstractActivityC21394xb3d2c0cf)).intValue();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.addUpdateListener(new y50.h(intValue2, intValue, eVar, abstractActivityC21394xb3d2c0cf));
        ofFloat.addListener(new y50.j(num, eVar, abstractActivityC21394xb3d2c0cf, intValue));
        ofFloat.addListener(new y50.i(eVar, abstractActivityC21394xb3d2c0cf, intValue));
        ofFloat.setInterpolator(interpolator != null ? interpolator : ta5.h.f498412a.a());
        eVar.f540981d = ofFloat;
        ofFloat.start();
    }
}
