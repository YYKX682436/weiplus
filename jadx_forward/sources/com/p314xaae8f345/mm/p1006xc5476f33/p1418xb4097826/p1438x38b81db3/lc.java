package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class lc implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185447c;

    public lc(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        this.f185445a = s0Var;
        this.f185446b = abstractC14490x69736cb5;
        this.f185447c = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = this.f185445a.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.putAll(kz5.c1.k(new jz5.l("feed_id", pm0.v.u(this.f185446b.mo2128x1ed62e84())), new jz5.l("bubble_text", this.f185447c)));
        return c17;
    }
}
