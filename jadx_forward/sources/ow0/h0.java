package ow0;

/* loaded from: classes5.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f430849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gx0.u2 u2Var, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f430848e = u2Var;
        this.f430849f = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ow0.h0(this.f430848e, this.f430849f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ow0.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f430847d;
        gx0.u2 u2Var = this.f430848e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf R7 = u2Var.R7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a seekTime = this.f430849f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(seekTime, "$seekTime");
            this.f430847d = 1;
            if (gx0.bf.d7(R7, null, seekTime, true, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.kh S7 = u2Var.S7();
        java.lang.String string = u2Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lww);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        S7.r7(string, null);
        return jz5.f0.f384359a;
    }
}
