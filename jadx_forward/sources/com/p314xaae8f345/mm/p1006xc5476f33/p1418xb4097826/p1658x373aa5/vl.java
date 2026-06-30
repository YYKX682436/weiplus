package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class vl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 f214788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f214789e;

    public vl(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f214788d = c15352x8ed10a39;
        this.f214789e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15352x8ed10a39 c15352x8ed10a39 = this.f214788d;
        java.lang.Object obj = c15352x8ed10a39.m62410xe172022e().m75941xfb821914(0).get(this.f214789e.f391649d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.r03 r03Var = (r45.r03) obj;
        c15352x8ed10a39.tagClickMap.put(java.lang.Long.valueOf(r03Var.m75942xfb822ef2(1)), 1);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286 c5539x720c286 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5539x720c286();
        c5539x720c286.f135863g.f88559a = r03Var;
        c5539x720c286.e();
    }
}
