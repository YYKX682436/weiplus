package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4;

/* loaded from: classes2.dex */
public final class d implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.gb1 f192960d;

    public d(r45.gb1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f192960d = info;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return -1;
    }

    /* renamed from: equals */
    public boolean m56741xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d.class, obj.getClass())) {
            return false;
        }
        r45.gb1 gb1Var = this.f192960d;
        int m75939xb282bd08 = gb1Var.m75939xb282bd08(0);
        r45.gb1 gb1Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d) obj).f192960d;
        return m75939xb282bd08 == gb1Var2.m75939xb282bd08(0) && gb1Var.m75939xb282bd08(1) == gb1Var2.m75939xb282bd08(1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gb1Var.m75945x2fec8307(2), gb1Var2.m75945x2fec8307(2)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gb1Var.m75945x2fec8307(3), gb1Var2.m75945x2fec8307(3));
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return super.hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1470xd7658cb4.d.class.getName().hashCode();
    }

    /* renamed from: hashCode */
    public int m56742x8cdac1b() {
        return super.hashCode();
    }
}
