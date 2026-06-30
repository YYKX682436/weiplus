package so2;

/* loaded from: classes2.dex */
public class c0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oo2 f491819d;

    /* renamed from: e, reason: collision with root package name */
    public final ya2.b2 f491820e;

    public c0(r45.oo2 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f491819d = item;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(3);
        this.f491820e = c19782x23db1cfa != null ? ya2.d.h(c19782x23db1cfa, null, false, 3, null) : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        r45.xx0 xx0Var;
        r45.xx0 xx0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.c0)) {
            return -1;
        }
        r45.vx0 vx0Var = (r45.vx0) this.f491819d.m75936x14adae67(2);
        long j17 = 0;
        long m75942xfb822ef2 = (vx0Var == null || (xx0Var2 = (r45.xx0) vx0Var.m75936x14adae67(23)) == null) ? 0L : xx0Var2.m75942xfb822ef2(2);
        r45.vx0 vx0Var2 = (r45.vx0) ((so2.c0) obj).f491819d.m75936x14adae67(2);
        if (vx0Var2 != null && (xx0Var = (r45.xx0) vx0Var2.m75936x14adae67(23)) != null) {
            j17 = xx0Var.m75942xfb822ef2(2);
        }
        return m75942xfb822ef2 > j17 ? 1 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        r45.vx0 vx0Var = (r45.vx0) this.f491819d.m75936x14adae67(2);
        if (vx0Var != null) {
            return vx0Var.m75942xfb822ef2(0);
        }
        return -1L;
    }

    @Override // in5.c
    public int h() {
        return -22;
    }

    /* renamed from: toString */
    public java.lang.String m164856x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("collection_info=");
        r45.oo2 oo2Var = this.f491819d;
        r45.vx0 vx0Var = (r45.vx0) oo2Var.m75936x14adae67(2);
        sb6.append(vx0Var != null ? vx0Var.mo12245xcc313de3() : null);
        sb6.append(",author_contact=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oo2Var.m75936x14adae67(3);
        sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.mo12245xcc313de3() : null);
        return sb6.toString();
    }
}
