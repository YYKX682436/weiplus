package so2;

/* loaded from: classes3.dex */
public final class u2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fd2 f492168d;

    public u2(r45.fd2 tagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        this.f492168d = tagInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.u2 u2Var = obj instanceof so2.u2 ? (so2.u2) obj : null;
        if (u2Var != null) {
            int m75939xb282bd08 = u2Var.f492168d.m75939xb282bd08(0);
            int m75939xb282bd082 = this.f492168d.m75939xb282bd08(0);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75939xb282bd08 == m75939xb282bd082) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.u2.class.hashCode();
    }
}
