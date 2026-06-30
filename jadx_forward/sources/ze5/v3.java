package ze5;

/* loaded from: classes9.dex */
public final class v3 implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final int f553778d;

    /* renamed from: e, reason: collision with root package name */
    public final int f553779e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f553780f;

    public v3(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553778d = f9Var != null ? te5.h.f500182a.e(f9Var) : 0;
        this.f553779e = f9Var != null ? te5.h.f500182a.d(f9Var) : 0;
        this.f553780f = f9Var != null ? te5.h.f500182a.a(f9Var) : false;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        ze5.v3 other = (ze5.v3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f553778d == other.f553778d && this.f553779e == other.f553779e && this.f553780f == other.f553780f;
    }
}
