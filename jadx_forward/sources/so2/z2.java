package so2;

/* loaded from: classes.dex */
public final class z2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.q94 f492264d;

    public z2(r45.q94 liveRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRecord, "liveRecord");
        this.f492264d = liveRecord;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.z2 z2Var = obj instanceof so2.z2 ? (so2.z2) obj : null;
        if (z2Var == null) {
            return -1;
        }
        r45.q94 q94Var = z2Var.f492264d;
        long m75942xfb822ef2 = q94Var.m75942xfb822ef2(4);
        r45.q94 q94Var2 = this.f492264d;
        if (m75942xfb822ef2 == q94Var2.m75942xfb822ef2(4)) {
            return 0;
        }
        return q94Var2.m75939xb282bd08(2) > q94Var.m75939xb282bd08(2) ? 1 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.z2.class.hashCode();
    }
}
