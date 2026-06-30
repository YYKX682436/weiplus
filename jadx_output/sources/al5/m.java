package al5;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5951b;

    public m(boolean z17, int i17) {
        this.f5950a = z17;
        this.f5951b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al5.m)) {
            return false;
        }
        al5.m mVar = (al5.m) obj;
        return this.f5950a == mVar.f5950a && this.f5951b == mVar.f5951b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f5950a) * 31) + java.lang.Integer.hashCode(this.f5951b);
    }

    public java.lang.String toString() {
        return "Result(success=" + this.f5950a + ", color=" + this.f5951b + ')';
    }
}
