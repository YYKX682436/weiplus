package so2;

/* loaded from: classes.dex */
public final class j0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zx0 f491971d;

    public j0(r45.zx0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f491971d = info;
    }

    public final java.lang.Long a() {
        r45.vx0 vx0Var = (r45.vx0) this.f491971d.m75936x14adae67(0);
        if (vx0Var != null) {
            return java.lang.Long.valueOf(vx0Var.m75942xfb822ef2(0));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        r45.vx0 vx0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.j0) || (vx0Var = (r45.vx0) this.f491971d.m75936x14adae67(0)) == null) {
            return -1;
        }
        long m75942xfb822ef2 = vx0Var.m75942xfb822ef2(0);
        r45.vx0 vx0Var2 = (r45.vx0) ((so2.j0) obj).f491971d.m75936x14adae67(0);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(m75942xfb822ef2, vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        r45.vx0 vx0Var = (r45.vx0) this.f491971d.m75936x14adae67(0);
        if (vx0Var != null) {
            return vx0Var.m75942xfb822ef2(0);
        }
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return so2.j0.class.getName().hashCode();
    }
}
