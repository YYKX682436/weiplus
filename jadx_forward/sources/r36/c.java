package r36;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final x36.o f450881d;

    /* renamed from: e, reason: collision with root package name */
    public static final x36.o f450882e;

    /* renamed from: f, reason: collision with root package name */
    public static final x36.o f450883f;

    /* renamed from: g, reason: collision with root package name */
    public static final x36.o f450884g;

    /* renamed from: h, reason: collision with root package name */
    public static final x36.o f450885h;

    /* renamed from: i, reason: collision with root package name */
    public static final x36.o f450886i;

    /* renamed from: a, reason: collision with root package name */
    public final x36.o f450887a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.o f450888b;

    /* renamed from: c, reason: collision with root package name */
    public final int f450889c;

    static {
        x36.n nVar = x36.o.f533229h;
        f450881d = nVar.a(":");
        f450882e = nVar.a(":status");
        f450883f = nVar.a(":method");
        f450884g = nVar.a(":path");
        f450885h = nVar.a(":scheme");
        f450886i = nVar.a(":authority");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            x36.n r0 = x36.o.f533229h
            x36.o r2 = r0.a(r2)
            x36.o r3 = r0.a(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: equals */
    public boolean m161489xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof r36.c)) {
            return false;
        }
        r36.c cVar = (r36.c) obj;
        return this.f450887a.mo174964xb2c87fbf(cVar.f450887a) && this.f450888b.mo174964xb2c87fbf(cVar.f450888b);
    }

    /* renamed from: hashCode */
    public int m161490x8cdac1b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f450887a.mo174965x8cdac1b()) * 31) + this.f450888b.mo174965x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m161491x9616526c() {
        return m36.e.j("%s: %s", this.f450887a.u(), this.f450888b.u());
    }

    public c(x36.o oVar, java.lang.String str) {
        this(oVar, x36.o.f533229h.a(str));
    }

    public c(x36.o oVar, x36.o oVar2) {
        this.f450887a = oVar;
        this.f450888b = oVar2;
        this.f450889c = oVar.l() + 32 + oVar2.l();
    }
}
