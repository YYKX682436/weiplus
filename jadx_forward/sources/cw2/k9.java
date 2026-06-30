package cw2;

/* loaded from: classes10.dex */
public final class k9 {

    /* renamed from: a, reason: collision with root package name */
    public int f305341a;

    /* renamed from: b, reason: collision with root package name */
    public int f305342b;

    /* renamed from: c, reason: collision with root package name */
    public int f305343c;

    /* renamed from: d, reason: collision with root package name */
    public long f305344d;

    public k9(int i17, int i18, int i19, long j17) {
        this.f305341a = i17;
        this.f305342b = i18;
        this.f305343c = i19;
        this.f305344d = j17;
    }

    /* renamed from: equals */
    public boolean m122898xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.k9)) {
            return false;
        }
        cw2.k9 k9Var = (cw2.k9) obj;
        return this.f305341a == k9Var.f305341a && this.f305342b == k9Var.f305342b && this.f305343c == k9Var.f305343c && this.f305344d == k9Var.f305344d;
    }

    /* renamed from: hashCode */
    public int m122899x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f305341a) * 31) + java.lang.Integer.hashCode(this.f305342b)) * 31) + java.lang.Integer.hashCode(this.f305343c)) * 31) + java.lang.Long.hashCode(this.f305344d);
    }

    /* renamed from: toString */
    public java.lang.String m122900x9616526c() {
        return "PreloadTaskResult(startCount=" + this.f305341a + ", stopCount=" + this.f305342b + ", completeCount=" + this.f305343c + ", preloadSize=" + this.f305344d + ')';
    }
}
