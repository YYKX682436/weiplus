package cs2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f303596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f303597b;

    /* renamed from: c, reason: collision with root package name */
    public final int f303598c;

    public d(boolean z17, boolean z18, int i17) {
        this.f303596a = z17;
        this.f303597b = z18;
        this.f303598c = i17;
    }

    /* renamed from: equals */
    public boolean m122603xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs2.d)) {
            return false;
        }
        cs2.d dVar = (cs2.d) obj;
        return this.f303596a == dVar.f303596a && this.f303597b == dVar.f303597b && this.f303598c == dVar.f303598c;
    }

    /* renamed from: hashCode */
    public int m122604x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f303596a) * 31) + java.lang.Boolean.hashCode(this.f303597b)) * 31) + java.lang.Integer.hashCode(this.f303598c);
    }

    /* renamed from: toString */
    public java.lang.String m122605x9616526c() {
        return "FirstBufferingConfig(onEnterPreload=" + this.f303596a + ", onFetchDonePreload=" + this.f303597b + ", preloadStage=" + this.f303598c + ')';
    }
}
