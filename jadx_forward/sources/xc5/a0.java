package xc5;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f534904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.e f534905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(xc5.h0 h0Var, l70.e eVar, mf3.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534904d = h0Var;
        this.f534905e = eVar;
        this.f534906f = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.a0(this.f534904d, this.f534905e, this.f534906f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.a0 a0Var = (xc5.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        rf3.u uVar;
        mf3.s sVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xc5.h0 h0Var = this.f534904d;
        h0Var.f535000y = false;
        l70.e eVar = this.f534905e;
        l70.f fVar = eVar.f398351a;
        l70.f fVar2 = l70.f.f398353d;
        mf3.k kVar = this.f534906f;
        if (fVar == fVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryImageBottomBarLayer", "download origin success. mediaId: " + kVar.mo2110x5db1b11());
            lg3.a aVar2 = h0Var.f534998w;
            if (aVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar, new vf3.f(vf3.e.f517914h, null, 0, 0.0f, 14, null));
            }
            rf3.q qVar = (rf3.q) h0Var.g(rf3.q.class);
            if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f407643m) != null) {
                uVar.t(sVar);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryImageBottomBarLayer", "download origin failed. ret: " + eVar.f398352b);
            kVar.f(mf3.w.f407661d);
            lg3.a aVar3 = h0Var.f534998w;
            if (aVar3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).h(kVar, new vf3.f(vf3.e.f517915i, null, 0, 0.0f, 14, null));
            }
        }
        h0Var.a0();
        return jz5.f0.f384359a;
    }
}
