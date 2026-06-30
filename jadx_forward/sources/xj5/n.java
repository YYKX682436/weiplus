package xj5;

/* loaded from: classes5.dex */
public final class n extends xj5.a {

    /* renamed from: w, reason: collision with root package name */
    public static final xj5.m f536447w = new xj5.m(null);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.db f536448u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f536449v;

    public n(com.p314xaae8f345.mm.p2621x8fb0427b.db record, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f536448u = record;
        this.f536449v = msgInfo;
    }

    @Override // xj5.a
    public java.util.Map a() {
        return kz5.c1.m(kz5.b1.e(new jz5.l("group_msg_top_item_id", java.lang.Integer.valueOf(this.f536448u.u0()))), f536447w.a(this.f536449v));
    }

    @Override // xj5.a
    public int c() {
        return 8;
    }

    @Override // xj5.a
    public boolean d(xj5.a aVar) {
        xj5.n other = (xj5.n) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar = this.f536448u;
        int u07 = dbVar.u0();
        com.p314xaae8f345.mm.p2621x8fb0427b.db dbVar2 = other.f536448u;
        return u07 == dbVar2.u0() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dbVar.t0(), dbVar2.t0());
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f536448u.u0();
    }

    @Override // in5.c
    public int h() {
        return xj5.a.f536420i;
    }

    @Override // xj5.e
    public int m(java.lang.Object obj) {
        xj5.n other = (xj5.n) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f536448u.u0() - other.f536448u.u0();
    }
}
