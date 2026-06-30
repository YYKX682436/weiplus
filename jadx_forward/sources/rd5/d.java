package rd5;

/* loaded from: classes9.dex */
public class d extends xm3.a implements rd5.a {

    /* renamed from: d, reason: collision with root package name */
    public we5.a f475787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f475789f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f475790g;

    /* renamed from: h, reason: collision with root package name */
    public we5.y0 f475791h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f475792i;

    static {
        new rd5.c(null);
    }

    public d(we5.a params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f475787d = params;
        this.f475788e = "";
        this.f475789f = "";
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        rd5.d other = (rd5.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f475787d.f526833b.T1(), other.f475787d.f526833b.T1());
    }

    @Override // xm3.a, in5.c
    public int h() {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wr) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xr.a(this.f475787d.f526832a)).c(this.f475787d.f526833b);
    }

    @Override // xm3.a, xm3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public rd5.d y0() {
        rd5.d dVar = (rd5.d) super.y0();
        we5.a aVar = this.f475787d;
        yb5.d dVar2 = aVar.f526832a;
        java.lang.Object m78011x5a5dd5d = aVar.f526833b.m78011x5a5dd5d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m78011x5a5dd5d, "null cannot be cast to non-null type com.tencent.mm.storage.MsgInfo");
        dVar.f475787d = new we5.a(dVar2, (com.p314xaae8f345.mm.p2621x8fb0427b.f9) m78011x5a5dd5d);
        return dVar;
    }

    public we5.b o() {
        java.lang.Object obj = this.f475792i;
        if (obj instanceof we5.b) {
            return (we5.b) obj;
        }
        return null;
    }

    @Override // xm3.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean X(rd5.d other) {
        java.util.List list;
        java.util.List list2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (this.f475790g == other.f475790g) {
            we5.y0 y0Var = this.f475791h;
            java.lang.Integer num = null;
            java.lang.Integer valueOf = (y0Var == null || (list2 = y0Var.f526937c) == null) ? null : java.lang.Integer.valueOf(((java.util.ArrayList) list2).size());
            we5.y0 y0Var2 = other.f475791h;
            if (y0Var2 != null && (list = y0Var2.f526937c) != null) {
                num = java.lang.Integer.valueOf(((java.util.ArrayList) list).size());
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, num) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475788e, other.f475788e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475789f, other.f475789f)) {
                return rd5.e.a(this.f475787d.f526833b, other.f475787d.f526833b);
            }
            return false;
        }
        return false;
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo = this.f475787d.f526833b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        return kz5.n0.g0(kz5.c0.i(java.lang.String.valueOf(msgInfo.Q0()), java.lang.String.valueOf(msgInfo.m124847x74d37ac6()), java.lang.String.valueOf(msgInfo.T1())), "||", null, null, 0, null, null, 62, null);
    }
}
