package so2;

/* loaded from: classes.dex */
public final class y2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xc5 f492257d;

    public y2(r45.xc5 prizeRecord) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prizeRecord, "prizeRecord");
        this.f492257d = prizeRecord;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.y2 y2Var = obj instanceof so2.y2 ? (so2.y2) obj : null;
        if (y2Var == null) {
            return -1;
        }
        r45.xc5 xc5Var = y2Var.f492257d;
        java.lang.String m75945x2fec8307 = xc5Var != null ? xc5Var.m75945x2fec8307(4) : null;
        r45.xc5 xc5Var2 = this.f492257d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, xc5Var2 != null ? xc5Var2.m75945x2fec8307(4) : null)) {
            return 0;
        }
        return xc5Var2.m75942xfb822ef2(1) > xc5Var.m75942xfb822ef2(1) ? 1 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.y2.class.hashCode();
    }
}
