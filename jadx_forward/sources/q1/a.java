package q1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q1.d[] f441014a;

    public a(int i17, int i18) {
        q1.d[] dVarArr = new q1.d[i17];
        for (int i19 = 0; i19 < i17; i19++) {
            dVarArr[i19] = new q1.d(i18);
        }
        this.f441014a = dVarArr;
    }

    public final float a(int i17, int i18) {
        return this.f441014a[i17].f441020b[i18].floatValue();
    }

    public final void b(int i17, int i18, float f17) {
        this.f441014a[i17].f441020b[i18] = java.lang.Float.valueOf(f17);
    }
}
