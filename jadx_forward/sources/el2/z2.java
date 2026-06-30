package el2;

/* loaded from: classes3.dex */
public final class z2 implements el2.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f335491a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.wd5 f335492b;

    public z2(int i17, r45.wd5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f335491a = i17;
        this.f335492b = item;
    }

    @Override // el2.v2
    public java.lang.String a() {
        return this.f335492b.m75945x2fec8307(5);
    }

    @Override // el2.v2
    public java.lang.String b() {
        r45.wd5 wd5Var = this.f335492b;
        if (wd5Var.m75939xb282bd08(6) == 0) {
            java.lang.String m75945x2fec8307 = wd5Var.m75945x2fec8307(7);
            return !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? wd5Var.m75945x2fec8307(7) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8p);
        }
        java.lang.String m75945x2fec83072 = wd5Var.m75945x2fec8307(7);
        if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
            m75945x2fec83072 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.otr);
        }
        if (wd5Var.m75939xb282bd08(8) <= 0) {
            return m75945x2fec83072;
        }
        return m75945x2fec83072 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ots, java.lang.Integer.valueOf(wd5Var.m75939xb282bd08(8)));
    }

    @Override // el2.v2
    public java.lang.String c() {
        return "";
    }

    @Override // el2.v2
    public java.lang.String d() {
        return this.f335492b.m75945x2fec8307(1);
    }

    @Override // el2.v2
    public r45.a52 e() {
        r45.a52 a52Var = new r45.a52();
        a52Var.set(0, java.lang.Integer.valueOf(this.f335491a));
        r45.e52 e52Var = new r45.e52();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f335492b);
        e52Var.set(0, linkedList);
        a52Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(e52Var.mo14344x5f01b1f6()));
        return a52Var;
    }

    @Override // el2.v2
    public jz5.l f() {
        return null;
    }

    @Override // el2.v2
    /* renamed from: getData */
    public java.lang.Object mo127813xfb7e5820() {
        return this.f335492b;
    }

    @Override // el2.v2
    /* renamed from: getTitle */
    public java.lang.String mo127814x7531c8a2() {
        return this.f335492b.m75945x2fec8307(0);
    }

    @Override // el2.v2
    /* renamed from: getType */
    public int mo127815xfb85f7b0() {
        return this.f335491a;
    }
}
