package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f216592d;

    /* renamed from: e, reason: collision with root package name */
    public int f216593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf f216594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f216595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 f216596h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5520x1f521b06 c5520x1f521b06, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216594f = qfVar;
        this.f216595g = c14994x9b99c079;
        this.f216596h = c5520x1f521b06;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lf(this.f216594f, this.f216595g, this.f216596h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object d17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f216593e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar = this.f216594f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.qt2 d18 = xy2.c.d(qfVar.m158354x19263085());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f216595g;
            db2.g4 g4Var = new db2.g4(c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59276x6c285d75(), d18 != null ? d18.m75939xb282bd08(5) : 0, 2, "", true, null, null, 0L, null, false, false, null, d18, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, c14994x9b99c079.m59229xb5af1dd5(), null, 402644928, null);
            this.f216593e = 1;
            d17 = xg2.g.d(g4Var, null, this, 1, null);
            if (d17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d17 = obj;
        }
        xg2.h hVar = (xg2.h) d17;
        if (hVar instanceof xg2.i) {
            oz5.l lVar = hVar.f535925a;
            if (lVar == null) {
                lVar = mo48699x76847179();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kf kfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.kf(hVar, null, this.f216596h, qfVar);
            this.f216592d = hVar;
            this.f216593e = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(lVar, kfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
