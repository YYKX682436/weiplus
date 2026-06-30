package b10;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f98547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98549c;

    /* renamed from: d, reason: collision with root package name */
    public final int f98550d;

    public b(int i17, int i18, int i19, int i27) {
        this.f98547a = i17;
        this.f98548b = i18;
        this.f98549c = i19;
        this.f98550d = i27;
    }

    /* renamed from: equals */
    public boolean m9567xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10.b)) {
            return false;
        }
        b10.b bVar = (b10.b) obj;
        return this.f98547a == bVar.f98547a && this.f98548b == bVar.f98548b && this.f98549c == bVar.f98549c && this.f98550d == bVar.f98550d;
    }

    /* renamed from: hashCode */
    public int m9568x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f98547a) * 31) + java.lang.Integer.hashCode(this.f98548b)) * 31) + java.lang.Integer.hashCode(this.f98549c)) * 31) + java.lang.Integer.hashCode(this.f98550d);
    }

    /* renamed from: toString */
    public java.lang.String m9569x9616526c() {
        return "RenderStats(reusedInPlace=" + this.f98547a + ", fromPool=" + this.f98548b + ", newlyCreated=" + this.f98549c + ", poolSize=" + this.f98550d + ')';
    }
}
