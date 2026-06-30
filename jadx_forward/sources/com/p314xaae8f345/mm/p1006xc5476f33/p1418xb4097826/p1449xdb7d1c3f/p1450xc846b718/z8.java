package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xs2 f187606a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f187607b;

    public z8(r45.xs2 ext, java.lang.String tipsId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        this.f187606a = ext;
        this.f187607b = tipsId;
    }

    /* renamed from: equals */
    public boolean m56004xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187606a, z8Var.f187606a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f187607b, z8Var.f187607b);
    }

    /* renamed from: hashCode */
    public int m56005x8cdac1b() {
        return (this.f187606a.hashCode() * 31) + this.f187607b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m56006x9616526c() {
        return "EnterTabTipsExtInfo(ext=" + this.f187606a + ", tipsId=" + this.f187607b + ')';
    }
}
