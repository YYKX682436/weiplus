package ey2;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public int f339026a;

    /* renamed from: b, reason: collision with root package name */
    public int f339027b;

    /* renamed from: c, reason: collision with root package name */
    public int f339028c;

    public r2(int i17, int i18, int i19) {
        this.f339026a = i17;
        this.f339027b = i18;
        this.f339028c = i19;
    }

    /* renamed from: equals */
    public boolean m128378xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.r2)) {
            return false;
        }
        ey2.r2 r2Var = (ey2.r2) obj;
        return this.f339026a == r2Var.f339026a && this.f339027b == r2Var.f339027b && this.f339028c == r2Var.f339028c;
    }

    /* renamed from: hashCode */
    public int m128379x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f339026a) * 31) + java.lang.Integer.hashCode(this.f339027b)) * 31) + java.lang.Integer.hashCode(this.f339028c);
    }

    /* renamed from: toString */
    public java.lang.String m128380x9616526c() {
        return "EndStateCache(completePlayCnt=" + this.f339026a + ", completePlayCntInThisPlay=" + this.f339027b + ", maxProgress=" + this.f339028c + ')';
    }
}
