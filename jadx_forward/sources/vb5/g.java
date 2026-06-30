package vb5;

/* loaded from: classes4.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb5.l f516379d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vb5.l lVar) {
        super(0);
        this.f516379d = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Integer h17;
        e01.f o17 = c01.d9.b().o();
        vb5.l lVar = this.f516379d;
        java.lang.String c17 = o17.c(lVar.f280113d.x(), "showtype");
        int intValue = (c17 == null || (h17 = r26.h0.h(c17)) == null) ? 0 : h17.intValue();
        boolean f17 = c01.d9.b().o().f(lVar.f280113d.x());
        c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
        java.lang.String x17 = lVar.f280113d.x();
        int c18 = k41.h1.c(lVar.f280113d.x());
        ((b00.q2) b4Var).getClass();
        bw5.t10 t10Var = new bw5.t10();
        t10Var.f114745d = x17;
        boolean[] zArr = t10Var.f114749h;
        zArr[2] = true;
        t10Var.f114747f = intValue;
        zArr[4] = true;
        t10Var.f114746e = f17 ? 1 : 0;
        zArr[3] = true;
        t10Var.f114748g = c18;
        zArr[5] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152197a = t10Var;
        lVar2.f152198b = new bw5.u10();
        lVar2.f152199c = "/cgi-bin/mmbiz-bin/mmeccommkf_customer_service_banner";
        lVar2.f152200d = 25520;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEcsReportService", "reportBanner, bannerShowType: " + intValue + ", bannerStatus: " + (f17 ? 1 : 0) + ", bannerSource: " + c18);
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), b00.p2.f98282a);
        return jz5.f0.f384359a;
    }
}
