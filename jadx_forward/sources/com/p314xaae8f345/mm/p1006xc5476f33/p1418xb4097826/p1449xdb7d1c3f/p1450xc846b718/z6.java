package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xs2 f187601a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187602b;

    public z6(r45.xs2 ext, java.lang.String tipsId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        this.f187601a = ext;
        this.f187602b = tipsId;
    }

    /* renamed from: equals */
    public boolean m56001xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z6 z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187601a, z6Var.f187601a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187602b, z6Var.f187602b);
    }

    /* renamed from: hashCode */
    public int m56002x8cdac1b() {
        return (this.f187601a.hashCode() * 31) + this.f187602b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m56003x9616526c() {
        return "EnterTabTipsExtInfo(ext=" + this.f187601a + ", tipsId=" + this.f187602b + ')';
    }
}
