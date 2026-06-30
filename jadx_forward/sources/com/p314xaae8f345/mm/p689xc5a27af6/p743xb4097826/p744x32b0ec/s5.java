package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class s5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f148448d;

    /* renamed from: e, reason: collision with root package name */
    public int f148449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f148450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f148452h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(yz5.l lVar, java.lang.String str, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148450f = lVar;
        this.f148451g = str;
        this.f148452h = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.s5(this.f148450f, this.f148451g, this.f148452h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.s5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148449e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
            yz5.l lVar2 = this.f148450f;
            this.f148448d = lVar2;
            this.f148449e = 1;
            obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) a1Var).Ui(this.f148451g, this.f148452h, this);
            if (obj == aVar) {
                return aVar;
            }
            lVar = lVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = (yz5.l) this.f148448d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        lVar.mo146xb9724478(obj);
        return jz5.f0.f384359a;
    }
}
