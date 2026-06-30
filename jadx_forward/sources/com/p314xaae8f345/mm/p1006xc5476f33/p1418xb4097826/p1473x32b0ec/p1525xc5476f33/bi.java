package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f193571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci f193572e;

    public bi(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ci ciVar) {
        this.f193571d = obj;
        this.f193572e = ciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = this.f193571d;
        r45.ac4 ac4Var = obj instanceof r45.ac4 ? (r45.ac4) obj : null;
        if (ac4Var != null) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = this.f193572e.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
    }
}
