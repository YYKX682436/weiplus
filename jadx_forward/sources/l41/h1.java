package l41;

/* loaded from: classes15.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397359d;

    /* renamed from: e, reason: collision with root package name */
    public int f397360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f397361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j41.j0 f397362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 f397363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397364i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f397365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j41.h0 h0Var, j41.j0 j0Var, com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1, l41.j1 j1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f397361f = h0Var;
        this.f397362g = j0Var;
        this.f397363h = c11207x71c7a1c1;
        this.f397364i = j1Var;
        this.f397365m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l41.h1(this.f397361f, this.f397362g, this.f397363h, this.f397364i, this.f397365m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l41.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        m41.d dVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f397360e;
        int i18 = 1;
        l41.j1 j1Var = this.f397364i;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                j41.h0 h0Var = this.f397361f;
                j41.j0 j0Var = this.f397362g;
                r45.s4 s4Var = this.f397363h.f153810i;
                if (s4Var == null) {
                    s4Var = new r45.s4();
                }
                m41.d dVar2 = new m41.d(h0Var, j0Var, s4Var);
                this.f397359d = dVar2;
                this.f397360e = 1;
                if (dVar2.d(this) == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (m41.d) this.f397359d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            l41.j1.b(j1Var, dVar);
            l41.k0 k0Var = l41.j1.f397374t;
            java.lang.Long l17 = ((r45.iq6) dVar.f149954b).f458808h != null ? new java.lang.Long(r2.f459805e) : null;
            e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            int i19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, c19767x257d7f, c19767x257d7f2) ? c19767x257d7f2.f38864x6ac9171 : 0;
            e42.d0 d0Var2 = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f3 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f4 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
            int i27 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var2, c19767x257d7f3, c19767x257d7f4) ? c19767x257d7f4.f38864x6ac9171 : 0;
            if (!this.f397365m) {
                i18 = 0;
            }
            int k17 = j1Var.k();
            j41.u uVar = j1Var.f397378d;
            java.lang.String a17 = l41.k0.a(k0Var, l17, new java.lang.Integer(k17), new java.lang.Integer(uVar != null ? ((k41.g0) uVar).f68600x1c5d3c28 : 0), new java.lang.Integer(i19), new java.lang.Integer(i27), null, null, new java.lang.Integer(i18), null, null, td1.i.f76806x366c91de, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=0 (tryAdd success), extra=%s", a17);
            y02.v0 a18 = y02.x0.f540167d.a();
            if (a18 != null) {
                a18.p1(bw5.d5.EcsOpenImKfLoadResult, 0, a17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConfirmController", "tryAddKefuConversation exception: " + e17.getMessage());
            j1Var.n();
        }
        return jz5.f0.f384359a;
    }
}
