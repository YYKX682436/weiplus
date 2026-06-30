package qf2;

/* loaded from: classes.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f443884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f443885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f443887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443888i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f443889m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, az2.f fVar, yz5.l lVar, qf2.q3 q3Var, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443884e = hVar;
        this.f443885f = fVar;
        this.f443886g = lVar;
        this.f443887h = q3Var;
        this.f443888i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.e3(this.f443884e, interfaceC29045xdcb5ca57, this.f443885f, this.f443886g, this.f443887h, this.f443888i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.e3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.m52 m52Var;
        java.lang.String m75945x2fec8307;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443883d;
        yz5.l lVar = this.f443886g;
        az2.f fVar = this.f443885f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.m52 m52Var2 = (r45.m52) ((xg2.i) this.f443884e).f535926b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = m52Var2.m75934xbce7f2f(1);
            qf2.q3 q3Var = this.f443887h;
            if (m75934xbce7f2f == null && ((r45.qp1) m52Var2.m75936x14adae67(4)) != null) {
                r45.qp1 qp1Var = (r45.qp1) m52Var2.m75936x14adae67(4);
                if (qp1Var != null && (m75945x2fec8307 = qp1Var.m75945x2fec8307(1)) != null) {
                    db5.t7.m123883x26a183b(q3Var.O6(), m75945x2fec8307, 0).show();
                }
                fVar.b();
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return jz5.f0.f384359a;
            }
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context O6 = q3Var.O6();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f2 = m52Var2.m75934xbce7f2f(1);
            byte[] g17 = m75934xbce7f2f2 != null ? m75934xbce7f2f2.g() : null;
            if (g17 == null) {
                g17 = new byte[0];
            }
            this.f443889m = m52Var2;
            this.f443883d = 1;
            java.lang.Object Mk = ((c61.l7) b6Var).Mk(O6, g17, this.f443888i, this);
            if (Mk == aVar) {
                return aVar;
            }
            m52Var = m52Var2;
            obj = Mk;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m52Var = (r45.m52) this.f443889m;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        jz5.l lVar2 = (jz5.l) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePayMicControl", "addPayPriceRequest success, pay result: " + lVar2 + " session_id: " + m52Var.m75945x2fec8307(3));
        fVar.b();
        lVar.mo146xb9724478(lVar2.f384366d);
        return jz5.f0.f384359a;
    }
}
