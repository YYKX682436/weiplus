package dw3;

/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f325723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f325725c;

    /* renamed from: d, reason: collision with root package name */
    public final int f325726d;

    /* renamed from: e, reason: collision with root package name */
    public final int f325727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f325728f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f325729g;

    /* renamed from: h, reason: collision with root package name */
    public final int f325730h;

    /* renamed from: i, reason: collision with root package name */
    public int f325731i;

    /* renamed from: j, reason: collision with root package name */
    public final int f325732j;

    public d0(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17, int i37, int i38, int i39) {
        this.f325723a = i17;
        this.f325724b = i18;
        this.f325725c = i19;
        this.f325726d = i27;
        this.f325727e = i28;
        this.f325728f = i29;
        this.f325729g = z17;
        this.f325730h = i37;
        this.f325731i = i38;
        this.f325732j = i39;
    }

    public final int a() {
        return this.f325724b;
    }

    public final boolean b() {
        return this.f325729g;
    }

    public final int c() {
        return this.f325723a;
    }

    /* renamed from: equals */
    public boolean m126350xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw3.d0)) {
            return false;
        }
        dw3.d0 d0Var = (dw3.d0) obj;
        return this.f325723a == d0Var.f325723a && this.f325724b == d0Var.f325724b && this.f325725c == d0Var.f325725c && this.f325726d == d0Var.f325726d && this.f325727e == d0Var.f325727e && this.f325728f == d0Var.f325728f && this.f325729g == d0Var.f325729g && this.f325730h == d0Var.f325730h && this.f325731i == d0Var.f325731i && this.f325732j == d0Var.f325732j;
    }

    /* renamed from: hashCode */
    public int m126351x8cdac1b() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f325723a) * 31) + java.lang.Integer.hashCode(this.f325724b)) * 31) + java.lang.Integer.hashCode(this.f325725c)) * 31) + java.lang.Integer.hashCode(this.f325726d)) * 31) + java.lang.Integer.hashCode(this.f325727e)) * 31) + java.lang.Integer.hashCode(this.f325728f)) * 31) + java.lang.Boolean.hashCode(this.f325729g)) * 31) + java.lang.Integer.hashCode(this.f325730h)) * 31) + java.lang.Integer.hashCode(this.f325731i)) * 31) + java.lang.Integer.hashCode(this.f325732j);
    }

    /* renamed from: toString */
    public java.lang.String m126352x9616526c() {
        return "VideoInfo(width=" + this.f325723a + ", height=" + this.f325724b + ", duration=" + this.f325725c + ", rotate=" + this.f325726d + ", videoBitrate=" + this.f325727e + ", fps=" + this.f325728f + ", matchScreenRatio=" + this.f325729g + ", useABA=" + this.f325730h + ", bitrateAdaptiveUp=" + this.f325731i + ", useMinMaxQP=" + this.f325732j + ')';
    }
}
