package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes14.dex */
public final class jx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f216434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx f216435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x91.h f216436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar, x91.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f216435e = sxVar;
        this.f216436f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jx(this.f216435e, this.f216436f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.jx) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f216434d;
        boolean z17 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sx sxVar = this.f216435e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = sxVar.A;
            if ((r2Var2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) && (r2Var = sxVar.A) != null) {
                this.f216434d = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String U6 = sxVar.U6(sxVar.f217476y);
        if (U6 != null && U6.length() != 0) {
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderProjectionScreenUIC", "videoUrl is nullOrNil!!, return");
            db5.t7.m123882x26a183b(sxVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.d8b, 0).show();
            return f0Var;
        }
        x91.h hVar = this.f216436f;
        sxVar.f217474w = hVar;
        sxVar.f217475x = sxVar.f217476y;
        if (hVar != null) {
            hVar.e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bx(sxVar, U6));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProjectionScreenUIC", "selectDevice: " + sxVar.f217474w);
        sxVar.B = null;
        return f0Var;
    }
}
