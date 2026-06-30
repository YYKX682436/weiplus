package m92;

/* loaded from: classes10.dex */
public class b extends dm.v3 implements java.lang.Cloneable {
    public static final l75.e0 T1 = dm.v3.m125557x3593deb(m92.b.class);

    public b() {
    }

    @Override // dm.v3, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return T1;
    }

    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public m92.b m147066x5a5dd5d() {
        m92.b bVar = new m92.b();
        bVar.mo9015xbf5d97fd(new m92.k(mo9763xeb27878e(), T1, null, 4, null));
        return bVar;
    }

    /* renamed from: toString */
    public java.lang.String m147067x9616526c() {
        java.lang.String contentValues = mo9763xeb27878e().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentValues, "toString(...)");
        return contentValues;
    }

    public final r45.nc4 u0() {
        r45.nc4 nc4Var = this.f68714xaa8c8588;
        return nc4Var == null ? new r45.nc4() : nc4Var;
    }

    public final boolean v0() {
        return (u0().m75942xfb822ef2(21) & 1) != 0;
    }

    public final boolean w0() {
        return ((r45.gx0) u0().m75936x14adae67(29)) != null;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 y0() {
        return (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) u0().m75936x14adae67(35);
    }

    public b(java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f68723xdec927b = finderUsername;
    }
}
