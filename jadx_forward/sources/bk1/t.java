package bk1;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final bk1.t f102883a = new bk1.t();

    public static java.lang.Object a(bk1.t tVar, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        if ((i19 & 2) != 0) {
            i18 = 32;
        }
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAppGetUserAuthorizeScopeList", "doFetch, updateTime: " + i17 + ", maxFetchCount: " + i18);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(rVar);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp_getuserauthorizescopelist";
        lVar.f152200d = 5046;
        r45.ic7 ic7Var = new r45.ic7();
        ic7Var.f458472d = i17;
        ic7Var.f458473e = i18;
        lVar.f152197a = ic7Var;
        lVar.f152198b = new r45.jc7();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        final bk1.r rVar2 = new bk1.r(weakReference);
        rVar.m(new bk1.q(com.p314xaae8f345.mm.p944x882e457a.z2.e(a17, new com.p314xaae8f345.mm.p944x882e457a.e3(rVar2) { // from class: bk1.s

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.s f102882d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rVar2, "function");
                this.f102882d = rVar2;
            }

            @Override // com.p314xaae8f345.mm.p944x882e457a.e3
            /* renamed from: callback */
            public final /* synthetic */ int mo1034xf5bc2045(int i27, int i28, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                return ((java.lang.Number) this.f102882d.v(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), str, oVar, m1Var)).intValue();
            }
        }, false, null)));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
