package in5;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f374676a;

    /* renamed from: b, reason: collision with root package name */
    public int f374677b;

    /* renamed from: c, reason: collision with root package name */
    public int f374678c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f374679d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.LongSparseArray f374680e;

    public v0(int i17, int i18, int i19) {
        this.f374676a = i17;
        this.f374677b = i18;
        this.f374678c = i19;
    }

    public final boolean a() {
        return this.f374679d;
    }

    public final void b(boolean z17) {
        this.f374679d = z17;
    }

    /* renamed from: equals */
    public boolean m136795xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5.v0)) {
            return false;
        }
        in5.v0 v0Var = (in5.v0) obj;
        return this.f374676a == v0Var.f374676a && this.f374677b == v0Var.f374677b && this.f374678c == v0Var.f374678c;
    }

    /* renamed from: hashCode */
    public int m136796x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f374676a) * 31) + java.lang.Integer.hashCode(this.f374677b)) * 31) + java.lang.Integer.hashCode(this.f374678c);
    }

    /* renamed from: toString */
    public java.lang.String m136797x9616526c() {
        return "WxItemShowInfo(spanIndex=" + this.f374676a + ", width=" + this.f374677b + ", height=" + this.f374678c + ')';
    }
}
