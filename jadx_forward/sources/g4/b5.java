package g4;

/* loaded from: classes5.dex */
public abstract class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f349748a;

    /* renamed from: b, reason: collision with root package name */
    public final int f349749b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349750c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349751d;

    public b5(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f349748a = i17;
        this.f349749b = i18;
        this.f349750c = i19;
        this.f349751d = i27;
    }

    /* renamed from: equals */
    public boolean mo130825xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.b5)) {
            return false;
        }
        g4.b5 b5Var = (g4.b5) obj;
        return this.f349748a == b5Var.f349748a && this.f349749b == b5Var.f349749b && this.f349750c == b5Var.f349750c && this.f349751d == b5Var.f349751d;
    }

    /* renamed from: hashCode */
    public int mo130826x8cdac1b() {
        return java.lang.Integer.hashCode(this.f349748a) + java.lang.Integer.hashCode(this.f349749b) + java.lang.Integer.hashCode(this.f349750c) + java.lang.Integer.hashCode(this.f349751d);
    }
}
