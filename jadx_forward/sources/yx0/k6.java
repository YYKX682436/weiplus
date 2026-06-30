package yx0;

/* loaded from: classes5.dex */
public final class k6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs0.h f548953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f548954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(yx0.b8 b8Var, bs0.h hVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548952d = b8Var;
        this.f548953e = hVar;
        this.f548954f = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.k6(this.f548952d, this.f548953e, this.f548954f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx0.k6 k6Var = (yx0.k6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yz5.l lVar = this.f548952d.f548724r;
        if (lVar != null) {
            lVar.mo146xb9724478("kEmptyTemplateId");
        }
        int ordinal = this.f548952d.f548725s.ordinal();
        if (ordinal != 2) {
            switch (ordinal) {
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    p3325xe03a0797.p3326xc267989b.l.f(null, new yx0.i6(this.f548952d, null), 1, null);
                    this.f548952d.q0(yx0.v.f549232m);
                    yx0.b8 b8Var = this.f548952d;
                    b8Var.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.j6(b8Var, this.f548953e, this.f548954f, null), 3, null);
                    break;
                default:
                    yz5.l lVar2 = this.f548952d.f548723q;
                    if (lVar2 != null) {
                        lVar2.mo146xb9724478("kEmptyTemplateId");
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchEmptyTemplate >> but state is " + this.f548952d.f548725s);
                    break;
            }
        } else {
            this.f548952d.q0(yx0.v.f549232m);
            yx0.b8 b8Var2 = this.f548952d;
            b8Var2.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "reportSwitchToEmptyTemplate");
            pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
            if (b8Var2.H1) {
                b8Var2.H1 = false;
                z17 = true;
            } else {
                ((yy0.o0) k0Var).Ri(java.lang.System.currentTimeMillis() - b8Var2.D1);
                b8Var2.D1 = 0L;
                z17 = false;
            }
            ((yy0.o0) k0Var).Ui("kEmptyTemplateId", 0L, 0, null, 4, z17, b8Var2.f548710d.mo47327x5e317b7(), !b8Var2.f548710d.mo47328xa04c9187(), false, false);
            b8Var2.D1 = java.lang.System.currentTimeMillis();
            i95.m c17 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "SCSwitchTemplate", "MJShootComposing", "kEmptyTemplateId", 0, 8, null);
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m0Var);
            pp0.m0.n3(m0Var, "mjpublisher_sc_switch_template", null, 2, null);
            yy0.m7 m7Var = (yy0.m7) l0Var;
            pp0.m0.V8(m0Var, kz5.c1.k(new jz5.l("mj_publisher_session_id", m7Var.Ri()), new jz5.l("template_id", "kEmptyTemplateId"), new jz5.l("is_template_downloaded", "1")), "mjpublisher_sc_switch_template", null, 4, null);
            if (z17) {
                pp0.m0.n3(m0Var, "mjpublisher_first_load_template", null, 2, null);
                jz5.l[] lVarArr = new jz5.l[4];
                lVarArr[0] = new jz5.l("mj_publisher_session_id", m7Var.Ri());
                lVarArr[1] = new jz5.l("template_id", "kEmptyTemplateId");
                lVarArr[2] = new jz5.l("is_template_downloaded", "1");
                lVarArr[3] = new jz5.l("is_first_init", m7Var.aj() ? "1" : "0");
                pp0.m0.V8(m0Var, kz5.c1.k(lVarArr), "mjpublisher_first_load_template", null, 4, null);
            }
            yx0.b8 b8Var3 = this.f548952d;
            b8Var3.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var3.L, null, null, new yx0.h6(b8Var3, this.f548953e, this.f548954f, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
