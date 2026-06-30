package pf3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f435364a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435365b;

    public j(int i17, int i18, int i19, int i27) {
        this.f435364a = i18;
        this.f435365b = i27;
    }

    /* renamed from: equals */
    public boolean m158340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf3.j)) {
            return false;
        }
        pf3.j jVar = (pf3.j) obj;
        jVar.getClass();
        return this.f435364a == jVar.f435364a && this.f435365b == jVar.f435365b;
    }

    /* renamed from: hashCode */
    public int m158341x8cdac1b() {
        return (((((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(this.f435364a)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(this.f435365b);
    }

    /* renamed from: toString */
    public java.lang.String m158342x9616526c() {
        return "HitExpand(left=0, top=" + this.f435364a + ", right=0, bottom=" + this.f435365b + ')';
    }
}
