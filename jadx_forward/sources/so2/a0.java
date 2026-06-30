package so2;

/* loaded from: classes2.dex */
public final class a0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.cc1 f491777d;

    /* renamed from: e, reason: collision with root package name */
    public final ya2.b2 f491778e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491779f;

    public a0(r45.cc1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f491777d = item;
        this.f491779f = c01.id.c();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) item.m75936x14adae67(3);
        this.f491778e = c19782x23db1cfa != null ? ya2.d.h(c19782x23db1cfa, null, false, 3, null) : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof so2.a0) {
            so2.a0 a0Var = (so2.a0) obj;
            if (a0Var.mo2128x1ed62e84() == mo2128x1ed62e84()) {
                return 0;
            }
            if (this.f491779f > a0Var.f491779f) {
                return 1;
            }
        }
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        r45.vx0 vx0Var = (r45.vx0) this.f491777d.m75936x14adae67(2);
        if (vx0Var != null) {
            return vx0Var.m75942xfb822ef2(0);
        }
        return -1L;
    }

    @Override // in5.c
    public int h() {
        return 10002;
    }

    /* renamed from: toString */
    public java.lang.String m164846x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time=");
        r45.cc1 cc1Var = this.f491777d;
        sb6.append(cc1Var.m75942xfb822ef2(4));
        sb6.append(",collection_info=");
        r45.vx0 vx0Var = (r45.vx0) cc1Var.m75936x14adae67(2);
        sb6.append(vx0Var != null ? vx0Var.mo12245xcc313de3() : null);
        sb6.append(",author_contact=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) cc1Var.m75936x14adae67(3);
        sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.mo12245xcc313de3() : null);
        return sb6.toString();
    }
}
