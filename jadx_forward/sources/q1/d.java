package q1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f441019a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Float[] f441020b;

    public d(int i17) {
        this.f441019a = i17;
        java.lang.Float[] fArr = new java.lang.Float[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            fArr[i18] = java.lang.Float.valueOf(0.0f);
        }
        this.f441020b = fArr;
    }

    public final float a(q1.d a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        float f17 = 0.0f;
        for (int i17 = 0; i17 < this.f441019a; i17++) {
            f17 += this.f441020b[i17].floatValue() * a17.f441020b[i17].floatValue();
        }
        return f17;
    }
}
