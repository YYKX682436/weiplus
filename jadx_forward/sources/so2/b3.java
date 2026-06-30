package so2;

/* loaded from: classes3.dex */
public final class b3 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zy1 f491801d;

    public b3(r45.zy1 winnerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(winnerInfo, "winnerInfo");
        this.f491801d = winnerInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        r45.zy1 zy1Var = obj instanceof r45.zy1 ? (r45.zy1) obj : null;
        if (zy1Var == null) {
            return -1;
        }
        java.lang.String m75945x2fec8307 = zy1Var.m75945x2fec8307(0);
        r45.zy1 zy1Var2 = this.f491801d;
        return (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, zy1Var2.m75945x2fec8307(0)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zy1Var.m75945x2fec8307(1), zy1Var2.m75945x2fec8307(1))) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.b3.class.hashCode();
    }
}
