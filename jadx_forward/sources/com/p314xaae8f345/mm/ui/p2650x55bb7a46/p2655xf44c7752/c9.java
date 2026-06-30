package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class c9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta f282369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282369d = taVar;
        this.f282370e = f9Var;
        this.f282371f = i17;
        this.f282372g = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c9(this.f282369d, this.f282370e, this.f282371f, this.f282372g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.c9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Imagegallery.handler.video.tp", "[+] [tomys] Easy crash pos, bitmap will be down sample to reduce mem cost. position=" + this.f282369d.f282958c);
        try {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282370e;
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(tg3.u0.L4((tg3.u0) c17, f9Var, f9Var.z0(), false, 4, null), this.f282371f, this.f282372g, false, false);
        } catch (java.lang.OutOfMemoryError unused) {
            return null;
        }
    }
}
