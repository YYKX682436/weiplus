package vp2;

/* loaded from: classes2.dex */
public final class s implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.pw1 f520487d;

    public s(r45.pw1 entryInfo, r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryInfo, "entryInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520487d = entryInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof vp2.s) {
            r45.pw1 pw1Var = this.f520487d;
            int m75939xb282bd08 = pw1Var.m75939xb282bd08(0);
            r45.pw1 pw1Var2 = ((vp2.s) obj).f520487d;
            if (m75939xb282bd08 == pw1Var2.m75939xb282bd08(0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pw1Var2.m75945x2fec8307(1), pw1Var.m75945x2fec8307(1)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pw1Var2.m75945x2fec8307(2), pw1Var.m75945x2fec8307(2))) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f520487d.m75939xb282bd08(0);
    }

    @Override // in5.c
    public int h() {
        return 17;
    }
}
