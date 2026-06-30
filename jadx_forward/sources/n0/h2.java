package n0;

/* loaded from: classes14.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f415059a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f415060b;

    public final int a() {
        int[] iArr = this.f415059a;
        int i17 = this.f415060b - 1;
        this.f415060b = i17;
        return iArr[i17];
    }

    public final void b(int i17) {
        int i18 = this.f415060b;
        int[] iArr = this.f415059a;
        if (i18 >= iArr.length) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
            this.f415059a = copyOf;
        }
        int[] iArr2 = this.f415059a;
        int i19 = this.f415060b;
        this.f415060b = i19 + 1;
        iArr2[i19] = i17;
    }
}
