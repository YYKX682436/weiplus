package r15;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f450177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450178b;

    public f(int i17, int i18) {
        this.f450177a = i17;
        this.f450178b = i18;
    }

    /* renamed from: equals */
    public boolean m161295xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r15.f)) {
            return false;
        }
        r15.f fVar = (r15.f) obj;
        return this.f450177a == fVar.f450177a && this.f450178b == fVar.f450178b;
    }

    /* renamed from: hashCode */
    public int m161296x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f450177a) * 31) + java.lang.Integer.hashCode(this.f450178b);
    }

    /* renamed from: toString */
    public java.lang.String m161297x9616526c() {
        return "LocateResult(startIndex=" + this.f450177a + ", endIndex=" + this.f450178b + ')';
    }
}
