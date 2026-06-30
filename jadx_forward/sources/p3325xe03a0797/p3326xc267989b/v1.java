package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class v1 implements p3325xe03a0797.p3326xc267989b.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f392216d;

    public v1(boolean z17) {
        this.f392216d = z17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public boolean a() {
        return this.f392216d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.k2
    public p3325xe03a0797.p3326xc267989b.h3 f() {
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m144121x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Empty{");
        sb6.append(this.f392216d ? "Active" : "New");
        sb6.append('}');
        return sb6.toString();
    }
}
