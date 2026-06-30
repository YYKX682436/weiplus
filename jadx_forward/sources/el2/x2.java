package el2;

/* loaded from: classes3.dex */
public final class x2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f335478a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f335479b;

    public x2(int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f335478a = i17;
        this.f335479b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return this.f335479b.m76501xf2fd2296();
    }

    @Override // el2.v2
    public java.lang.String b() {
        return this.f335479b.m76523x98b23862();
    }

    @Override // el2.v2
    public java.lang.String c() {
        java.lang.String m76495xac8a4bdb = this.f335479b.m76495xac8a4bdb();
        return m76495xac8a4bdb == null ? "" : m76495xac8a4bdb;
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f335479b.m76497x4fe38a1f();
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f335478a));
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f335479b.mo14344x5f01b1f6()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    /* renamed from: getData */
    public java.lang.Object mo127813xfb7e5820() {
        return this.f335479b;
    }

    @Override // el2.v2
    /* renamed from: getTitle */
    public java.lang.String mo127814x7531c8a2() {
        return this.f335479b.m76514x1202da9d();
    }

    @Override // el2.v2
    /* renamed from: getType */
    public int mo127815xfb85f7b0() {
        return this.f335478a;
    }
}
