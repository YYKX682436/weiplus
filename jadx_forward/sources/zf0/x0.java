package zf0;

/* loaded from: classes5.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f554122a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f554123b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f554124c;

    public x0(int i17, boolean z17, boolean z18) {
        this.f554122a = i17;
        this.f554123b = z17;
        this.f554124c = z18;
    }

    public final boolean a() {
        return this.f554123b;
    }

    public final boolean b() {
        return this.f554124c;
    }

    public final int c() {
        return this.f554122a;
    }

    /* renamed from: equals */
    public boolean m178846xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf0.x0)) {
            return false;
        }
        zf0.x0 x0Var = (zf0.x0) obj;
        return this.f554122a == x0Var.f554122a && this.f554123b == x0Var.f554123b && this.f554124c == x0Var.f554124c;
    }

    /* renamed from: hashCode */
    public int m178847x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f554122a) * 31) + java.lang.Boolean.hashCode(this.f554123b)) * 31) + java.lang.Boolean.hashCode(this.f554124c);
    }

    /* renamed from: toString */
    public java.lang.String m178848x9616526c() {
        return "CompressStrategy(step=" + this.f554122a + ", forceSoftDecode=" + this.f554123b + ", forceSoftEncode=" + this.f554124c + ')';
    }
}
