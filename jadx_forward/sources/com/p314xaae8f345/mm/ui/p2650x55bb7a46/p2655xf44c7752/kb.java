package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes11.dex */
public final class kb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f282688d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f282692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282693i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f1 f282694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 f282695n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(java.lang.String str, long j17, long j18, java.lang.String str2, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f1 f1Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f282690f = str;
        this.f282691g = j17;
        this.f282692h = j18;
        this.f282693i = str2;
        this.f282694m = f1Var;
        this.f282695n = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.kb kbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.kb(this.f282690f, this.f282691g, this.f282692h, this.f282693i, this.f282694m, this.f282695n, interfaceC29045xdcb5ca57);
        kbVar.f282689e = obj;
        return kbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.kb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f282688d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f282689e;
            mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
            long j17 = this.f282691g;
            long j18 = this.f282692h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) yVar;
            p1Var.getClass();
            java.lang.String talker = this.f282690f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            java.lang.String mediaId = this.f282693i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.m2 m2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.g1(p1Var, talker, j17, j18, mediaId, null));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.jb jbVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.jb(y0Var, this.f282694m, this.f282695n);
            this.f282688d = 1;
            if (m2Var.a(jbVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
