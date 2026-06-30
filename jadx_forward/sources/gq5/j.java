package gq5;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f356170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ud0 f356171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq5.o f356173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bw5.ud0 ud0Var, java.lang.String str, gq5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f356171e = ud0Var;
        this.f356172f = str;
        this.f356173g = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gq5.j(this.f356171e, this.f356172f, this.f356173g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq5.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f356170d;
        gq5.o oVar = this.f356173g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aq5.p0 p0Var = aq5.p0.f94806a;
            bw5.ud0 decryptKeyResp = this.f356171e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decryptKeyResp, "$decryptKeyResp");
            aq5.q0 q0Var = (aq5.q0) ((jz5.n) oVar.f356157i).mo141623x754a37bb();
            this.f356170d = 1;
            if (!aq5.p0.f94810e) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(aq5.p0.f94811f);
                aq5.p0.f94810e = true;
            }
            i95.m c17 = i95.n0.c(gz.l.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NearConnectionService", "unInit");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3153x29abb432.d.f298891c.m("F2F-Transfer");
            ((kp.s) ((gz.l) c17)).f392364d = null;
            aq5.p0.f94807b = new aq5.f(false);
            obj = aq5.p0.f94809d.c(decryptKeyResp, this.f356172f, q0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        aq5.s0 s0Var = (aq5.s0) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f356188m, "init sender: result " + s0Var.f94827a);
        int i18 = s0Var.f94827a;
        if (!(i18 == 0)) {
            if (i18 == 100206) {
                j75.f Q6 = oVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new eq5.i(17));
                }
            } else if (i18 == 100202 && ((kp.i1) ((gz.m) i95.n0.c(gz.m.class))).bj()) {
                j75.f Q62 = oVar.Q6();
                if (Q62 != null) {
                    Q62.B3(new eq5.i(17));
                }
            } else {
                j75.f Q63 = oVar.Q6();
                if (Q63 != null) {
                    Q63.B3(new eq5.i(16));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
