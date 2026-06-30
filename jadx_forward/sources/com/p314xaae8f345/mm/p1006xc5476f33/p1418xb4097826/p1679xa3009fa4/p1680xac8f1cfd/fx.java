package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class fx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f215971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f215972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f215973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f215974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3325xe03a0797.p3326xc267989b.y0 y0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f215971d = hVar;
        this.f215972e = y0Var;
        this.f215973f = j17;
        this.f215974g = sxVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fx(this.f215971d, interfaceC29045xdcb5ca57, this.f215972e, this.f215973f, this.f215974g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fx fxVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fx) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fxVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedList m75941xfb821914 = ((r45.ca1) ((xg2.i) this.f215971d).f535926b).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject_screen_cast(...)");
        r45.yx4 yx4Var = (r45.yx4) kz5.n0.Z(m75941xfb821914);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (yx4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", "requestFeedUrl: requestId=" + pm0.v.u(this.f215973f) + ", resultId=" + pm0.v.u(yx4Var.m75942xfb822ef2(0)) + ", videoUrl=" + yx4Var.m75945x2fec8307(1) + ", expired_time=" + yx4Var.m75942xfb822ef2(2));
            ((java.util.HashMap) ((jz5.n) this.f215974g.f217477z).mo141623x754a37bb()).put(new java.lang.Long(yx4Var.m75942xfb822ef2(0)), yx4Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProjectionScreenUIC", "requestFeedUrl: fail, resp is empty");
        }
        return f0Var2;
    }
}
