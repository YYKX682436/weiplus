package fq5;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f347195d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347196e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347196e = c22927xe8447aa8;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fq5.d(this.f347196e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.View view;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f347195d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aq5.p0 p0Var = aq5.p0.f94806a;
            this.f347195d = 1;
            if (!aq5.p0.f94810e) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(aq5.p0.f94811f);
                aq5.p0.f94810e = true;
            }
            i95.m c17 = i95.n0.c(gz.l.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "unInit");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.m("F2F-Transfer");
            ((kp.s) ((gz.l) c17)).f392364d = null;
            aq5.p0.f94807b = new aq5.f(true);
            obj = aq5.p0.f94808c.e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq5.r0 r0Var = (aq5.r0) obj;
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347196e;
        c22927xe8447aa8.f295820s = r0Var;
        aq5.p0 p0Var2 = aq5.p0.f94806a;
        aq5.q0 callback = (aq5.q0) ((jz5.n) c22927xe8447aa8.f295815n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        aq5.f fVar = aq5.p0.f94807b;
        if (fVar != null) {
            fVar.f94767d = callback;
        }
        if (fVar == null || fVar.f94766c == null) {
            aq5.a aVar2 = aq5.a.f94748d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "init() called with: result = " + r0Var.f94824a);
        int i18 = r0Var.f94824a;
        if (i18 == 0) {
            c22927xe8447aa8.f295811g = r0Var.f94825b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "loadQrcode() called");
            c22927xe8447aa8.V6(3);
            v65.i.b(c22927xe8447aa8.f295816o, null, new fq5.h(c22927xe8447aa8, null), 1, null);
        } else {
            c22927xe8447aa8.f295811g = null;
            if (i18 == 100206) {
                em.j4 j4Var = c22927xe8447aa8.f295809e;
                if (j4Var != null && (view = j4Var.f336009a) != null) {
                    view.post(new fq5.f(c22927xe8447aa8));
                }
                c22927xe8447aa8.V6(6);
            } else {
                jq5.l lVar = jq5.n.f382815a;
                if (lVar.c() && lVar.e()) {
                    c22927xe8447aa8.V6(5);
                } else {
                    c22927xe8447aa8.V6(2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
