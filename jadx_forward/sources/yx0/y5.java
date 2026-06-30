package yx0;

/* loaded from: classes5.dex */
public final class y5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f549319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f549320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f549321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b f549322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(yx0.b8 b8Var, yz5.l lVar, boolean z17, int i17, com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3978x9b06196b c3978x9b06196b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549318d = b8Var;
        this.f549319e = lVar;
        this.f549320f = z17;
        this.f549321g = i17;
        this.f549322h = c3978x9b06196b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.y5(this.f549318d, this.f549319e, this.f549320f, this.f549321g, this.f549322h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.y5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        switch (this.f549318d.f548725s.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "startRecord >> Invalid state: " + this.f549318d.f548725s);
                yz5.l lVar = this.f549319e;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
                return jz5.f0.f384359a;
            case 2:
            default:
                ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).Ri(java.lang.System.currentTimeMillis() - this.f549318d.D1);
                this.f549318d.D1 = 0L;
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.n2(m7Var, null), 3, null);
                i95.m c17 = i95.n0.c(w40.e.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                w40.e.fh((w40.e) c17, "andr_MJ_Camera_Video_Begin", null, 2, null);
                synchronized (yy0.m7.class) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m7Var.f549758d, "isFrontFacingCamera: " + m7Var.B);
                    z17 = m7Var.B;
                }
                if (z17) {
                    m7Var.Bj(2);
                } else {
                    m7Var.Bj(3);
                }
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                java.util.Map Ai = m7Var.Ai();
                Ai.put("view_id", "sc_start_record");
                ((cy1.a) rVar).yj("sc_start_record", null, Ai, 6, false);
                this.f549318d.q0(yx0.v.f549238s);
                this.f549318d.F1 = false;
                this.f549318d.E1 = java.lang.System.currentTimeMillis();
                java.lang.String d17 = dw3.h.d(dw3.h.f325744a, null, null, 3, null);
                yx0.b8 b8Var = this.f549318d;
                boolean z18 = this.f549320f;
                b8Var.f548732x1 = z18;
                b8Var.f548727u = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new yx0.x5(this.f549321g, z18, b8Var, this.f549322h, d17, this.f549319e, null), 3, null);
                return jz5.f0.f384359a;
        }
    }
}
