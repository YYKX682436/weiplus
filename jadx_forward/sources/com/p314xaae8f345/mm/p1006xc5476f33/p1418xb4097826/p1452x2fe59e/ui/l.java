package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f191782a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.z91 f191783b;

    public l(int i17, r45.z91 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        this.f191782a = i17;
        this.f191783b = request;
    }

    /* renamed from: equals */
    public boolean m56626xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l) obj;
        return this.f191782a == lVar.f191782a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f191783b, lVar.f191783b);
    }

    /* renamed from: hashCode */
    public int m56627x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f191782a) * 31) + this.f191783b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m56628x9616526c() {
        return "RelatedRequest(scene=" + this.f191782a + ", request=" + this.f191783b + ')';
    }
}
