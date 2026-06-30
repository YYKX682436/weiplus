package cw1;

/* loaded from: classes12.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f304524a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f304525b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f304526c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f304527d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304528e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Boolean f304529f;

    /* renamed from: g, reason: collision with root package name */
    public final int f304530g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f304531h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f304532i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f304533j;

    public i4(java.lang.String str, int[] iArr, int[] iArr2, long[] timeRange, int i17, java.lang.Boolean bool, int i18, boolean z17, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        this.f304524a = str;
        this.f304525b = iArr;
        this.f304526c = iArr2;
        this.f304527d = timeRange;
        this.f304528e = i17;
        this.f304529f = bool;
        this.f304530g = i18;
        this.f304531h = z17;
        this.f304532i = z18;
        this.f304533j = z19;
    }

    /* renamed from: equals */
    public boolean m122827xb2c87fbf(java.lang.Object obj) {
        cw1.i4 i4Var = obj instanceof cw1.i4 ? (cw1.i4) obj : null;
        return i4Var != null && this.f304528e == i4Var.f304528e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304529f, i4Var.f304529f) && this.f304531h == i4Var.f304531h && this.f304532i == i4Var.f304532i && this.f304533j == i4Var.f304533j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304524a, i4Var.f304524a) && this.f304530g == i4Var.f304530g && java.util.Arrays.equals(this.f304525b, i4Var.f304525b) && java.util.Arrays.equals(this.f304526c, i4Var.f304526c) && java.util.Arrays.equals(this.f304527d, i4Var.f304527d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m122828x8cdac1b() {
        return java.util.Arrays.deepHashCode(new java.io.Serializable[]{this.f304524a, this.f304525b, this.f304526c, this.f304527d, java.lang.Integer.valueOf(this.f304528e), this.f304529f, java.lang.Integer.valueOf(this.f304530g), java.lang.Boolean.valueOf(this.f304531h), java.lang.Boolean.valueOf(this.f304532i), java.lang.Boolean.valueOf(this.f304533j)});
    }
}
