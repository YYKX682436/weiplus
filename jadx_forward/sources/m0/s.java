package m0;

/* loaded from: classes14.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final float f404040a = 10;

    public static final float a(p2.f getRippleEndRadius, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getRippleEndRadius, "$this$getRippleEndRadius");
        float b17 = d1.e.b(d1.f.a(d1.k.d(j17), d1.k.b(j17))) / 2.0f;
        return z17 ? b17 + getRippleEndRadius.R(f404040a) : b17;
    }
}
