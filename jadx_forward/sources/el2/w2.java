package el2;

/* loaded from: classes3.dex */
public final class w2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f335470a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.k92 f335471b;

    public w2(int i17, r45.k92 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f335470a = i17;
        this.f335471b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String b() {
        return this.f335471b.m75945x2fec8307(4);
    }

    @Override // el2.v2
    public java.lang.String c() {
        java.lang.String m75945x2fec8307 = this.f335471b.m75945x2fec8307(6);
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f335471b.m75945x2fec8307(3);
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f335470a));
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f335471b.mo14344x5f01b1f6()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    /* renamed from: getData */
    public java.lang.Object mo127813xfb7e5820() {
        return this.f335471b;
    }

    @Override // el2.v2
    /* renamed from: getTitle */
    public java.lang.String mo127814x7531c8a2() {
        return this.f335471b.m75945x2fec8307(2);
    }

    @Override // el2.v2
    /* renamed from: getType */
    public int mo127815xfb85f7b0() {
        return this.f335470a;
    }
}
