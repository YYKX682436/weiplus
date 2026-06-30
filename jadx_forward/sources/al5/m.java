package al5;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f87483a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87484b;

    public m(boolean z17, int i17) {
        this.f87483a = z17;
        this.f87484b = i17;
    }

    /* renamed from: equals */
    public boolean m2302xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al5.m)) {
            return false;
        }
        al5.m mVar = (al5.m) obj;
        return this.f87483a == mVar.f87483a && this.f87484b == mVar.f87484b;
    }

    /* renamed from: hashCode */
    public int m2303x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f87483a) * 31) + java.lang.Integer.hashCode(this.f87484b);
    }

    /* renamed from: toString */
    public java.lang.String m2304x9616526c() {
        return "Result(success=" + this.f87483a + ", color=" + this.f87484b + ')';
    }
}
