package ia2;

/* loaded from: classes2.dex */
public final class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f371475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f371476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f371477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f371478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f371479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f371480f;

    public l0(ia2.n0 n0Var, r45.f96 f96Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, yz5.p pVar, yz5.a aVar) {
        this.f371475a = n0Var;
        this.f371476b = f96Var;
        this.f371477c = h0Var;
        this.f371478d = i17;
        this.f371479e = pVar;
        this.f371480f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28.IFetchDoneListener
    /* renamed from: onFetchDone */
    public void mo56137xb461ee3d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response) {
        r45.v96 v96Var;
        r45.l95 l95Var;
        r45.e95 e95Var;
        int i17;
        r45.bp2 bp2Var;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f371477c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) h0Var.f391656d;
        ia2.n0 n0Var = this.f371475a;
        n0Var.getClass();
        if (response.getErrCode() == 0 && response.getErrType() == 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - n0Var.f371494o;
            n0Var.f371494o = elapsedRealtime;
            com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 c23936xb436cdb0 = n0Var.f371489g;
            if (c23936xb436cdb0 != null) {
                c23936xb436cdb0.m88619x75d2c8e9(elapsedRealtime, ia2.q0.a("setFeedLoadingTime"));
            }
            if (c13879x1453fa95.f189079s != null) {
                int i18 = c13879x1453fa95.f189080t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa952 = n0Var.f371493n;
                if (c13879x1453fa952 != null && (bp2Var = c13879x1453fa952.f189079s) != null && (m75941xfb821914 = bp2Var.m75941xfb821914(0)) != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else {
                            if (((r45.ap2) it.next()).m75939xb282bd08(0) == i18) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                r45.bp2 bp2Var2 = c13879x1453fa95.f189079s;
                byte[] m75962x8b6d8abc = bp2Var2 != null ? bp2Var2.m75962x8b6d8abc() : null;
                if (m75962x8b6d8abc == null) {
                    m75962x8b6d8abc = new byte[0];
                }
                byte[] bArr = m75962x8b6d8abc;
                int i19 = this.f371478d;
                com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23966x2bb6c1fd b17 = n0Var.b(i17, i19, response, true);
                com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628 = n0Var.f371488f;
                if (c23922xf4e16628 != null) {
                    c23922xf4e16628.m88608x43dbf7a8(bArr, i17, i19, b17, ia2.q0.a("updateInitPage"));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "finderpoistream response tabList should not be null!");
            }
            java.lang.Object response2 = response.getResponse();
            r45.zo2 zo2Var = response2 instanceof r45.zo2 ? (r45.zo2) response2 : null;
            r45.n95 n95Var = (zo2Var == null || (v96Var = (r45.v96) zo2Var.m75936x14adae67(4)) == null || (l95Var = v96Var.f469542d) == null || (e95Var = l95Var.f460774d) == null) ? null : e95Var.f454699f;
            r45.f96 f96Var = this.f371476b;
            this.f371479e.mo149xb9724478(java.lang.Float.valueOf(n95Var != null ? n95Var.f462717e : f96Var.m75938x746dc8a6(1)), java.lang.Float.valueOf(n95Var != null ? n95Var.f462716d : f96Var.m75938x746dc8a6(0)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "requestPoiStream failed. error code: " + java.lang.Integer.valueOf(response.getErrCode()) + ", error message: " + response.getErrMsg());
            this.f371480f.mo152xb9724478();
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new ia2.k0(h0Var, this, n0Var, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "requestPoiStream end");
    }
}
