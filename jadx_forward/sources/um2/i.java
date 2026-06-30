package um2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(um2.x5 x5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510357e = x5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.i(this.f510357e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510356d;
        um2.x5 x5Var = this.f510357e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            um2.h hVar = new um2.h(x5Var, null);
            this.f510356d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj().L0(((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            zl2.r4.f555483a.f3(x5Var.f101138b, "charge live invalid!");
            fm2.c cVar = x5Var.f101139c;
            if (cVar != null) {
                qo0.c.a(cVar, qo0.b.X4, null, 2, null);
            }
            fm2.c cVar2 = x5Var.f101139c;
            if (cVar2 != null && (adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) cVar2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad.class)) != null) {
                adVar.v1();
            }
        }
        return jz5.f0.f384359a;
    }
}
