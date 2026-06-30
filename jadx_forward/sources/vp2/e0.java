package vp2;

/* loaded from: classes2.dex */
public final class e0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oa2 f520450d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f520451e;

    public e0(r45.oa2 notice, r45.fa2 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notice, "notice");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f520450d = notice;
        this.f520451e = container;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (obj instanceof vp2.e0) {
            r45.h32 h32Var = (r45.h32) ((vp2.e0) obj).f520450d.m75936x14adae67(0);
            java.lang.String m75945x2fec8307 = h32Var != null ? h32Var.m75945x2fec8307(4) : null;
            r45.h32 h32Var2 = (r45.h32) this.f520450d.m75936x14adae67(0);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, h32Var2 != null ? h32Var2.m75945x2fec8307(4) : null)) {
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
        return 5;
    }
}
