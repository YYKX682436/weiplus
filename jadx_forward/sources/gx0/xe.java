package gx0;

/* loaded from: classes5.dex */
public final class xe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f358715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f358716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f358717i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, int i17, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358713e = bfVar;
        this.f358714f = c4128x879fba0a;
        this.f358715g = i17;
        this.f358716h = c4129xdee64553;
        this.f358717i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.xe(this.f358713e, this.f358714f, this.f358715g, this.f358716h, this.f358717i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.xe) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a l17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358712d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358713e.B;
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.f358713e.E;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a sub = (c4167x88133861 == null || (l17 = c4167x88133861.l()) == null) ? null : l17.sub(new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a(1L));
                if (c4152x8b3cf7db == null || sub == null) {
                    return java.lang.Boolean.FALSE;
                }
                this.f358713e.L = false;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b17 = this.f358714f.m33983x7b953cf2() ? ou0.f.b(this.f358714f, sub) : this.f358713e.M;
                gx0.bf bfVar = this.f358713e;
                int i18 = bfVar.D;
                if (i18 <= 0) {
                    i18 = this.f358715g;
                }
                int i19 = i18;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = this.f358716h;
                com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee645532 = c4129xdee64553 == null ? bfVar.C : c4129xdee64553;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4129xdee645532);
                boolean z17 = this.f358717i;
                this.f358712d = 1;
                oz5.n nVar = new oz5.n(pz5.f.b(this));
                c4152x8b3cf7db.m34179xda91516c(c4129xdee645532, b17, i19, z17, new ou0.t(nVar));
                java.lang.Object a17 = nVar.a();
                if (a17 != aVar) {
                    a17 = jz5.f0.f384359a;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            yy0.m7 m7Var = (yy0.m7) this.f358713e.R6().O6();
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.l4(m7Var, null), 3, null);
            gx0.bf bfVar2 = this.f358713e;
            bfVar2.getClass();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a InvalidTime = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InvalidTime, "InvalidTime");
            bfVar2.M = InvalidTime;
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MovieComp.PlaybackControlUIC", "startPlaying - failed:" + e17.getMessage(), e17);
            return java.lang.Boolean.FALSE;
        }
    }
}
