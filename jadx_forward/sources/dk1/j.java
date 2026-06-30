package dk1;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final dk1.j f314684a = new dk1.j();

    public static java.lang.Object a(dk1.j jVar, java.lang.String str, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        if ((i19 & 4) != 0) {
            i18 = 32;
        }
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "doFetch, appUsername: " + str + ", updateTime: " + i17 + ", maxFetchCount: " + i18);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(rVar);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp_getwxauseuserinforecordlist";
        lVar.f152200d = 2690;
        r45.kc7 kc7Var = new r45.kc7();
        kc7Var.f460124d = str;
        kc7Var.f460125e = i17;
        kc7Var.f460126f = i18;
        lVar.f152197a = kc7Var;
        lVar.f152198b = new r45.lc7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        final dk1.h hVar = new dk1.h(weakReference);
        rVar.m(new dk1.g(com.p314xaae8f345.mm.p944x882e457a.z2.e(a17, new com.p314xaae8f345.mm.p944x882e457a.e3(hVar) { // from class: dk1.i

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.s f314683d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "function");
                this.f314683d = hVar;
            }

            @Override // com.p314xaae8f345.mm.p944x882e457a.e3
            /* renamed from: callback */
            public final /* synthetic */ int mo1034xf5bc2045(int i27, int i28, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                return ((java.lang.Number) this.f314683d.v(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str2, oVar, m1Var)).intValue();
            }
        }, false, null)));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
