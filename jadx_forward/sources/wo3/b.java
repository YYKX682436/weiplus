package wo3;

/* loaded from: classes9.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f529674n;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f529675m;

    public b(java.lang.String bindSerial, java.lang.String bankType, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bindSerial, "bindSerial");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bankType, "bankType");
        this.f529675m = bindSerial;
        r45.h26 h26Var = new r45.h26();
        java.lang.String Ni = to3.c0.Ai().Ni(196617);
        java.lang.String e17 = yo3.m.e();
        java.lang.String Ni2 = to3.c0.Ai().Ni(196628);
        Ni2 = android.text.TextUtils.isEmpty(Ni2) ? wo.w0.k() : Ni2;
        java.lang.String str2 = "" + (java.lang.System.currentTimeMillis() / 1000);
        int random = ((int) (java.lang.Math.random() * 1000000)) + 1000000;
        if (android.text.TextUtils.isEmpty(e17)) {
            str = Ni2 + '&' + str2 + '&' + random;
        } else {
            str = Ni2 + '&' + str2 + '&' + random + '&' + e17;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        java.lang.String m121777xc5c0ef96 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121777xc5c0ef96(Ni, str);
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, null);
        int a17 = to3.c0.Ai().wi().a();
        h26Var.f457318d = Ni;
        h26Var.f457319e = str;
        h26Var.f457320f = m121777xc5c0ef96;
        h26Var.f457322h = bankType;
        h26Var.f457321g = bindSerial;
        h26Var.f457324m = str3 != null ? java.lang.Integer.parseInt(str3) : 0;
        h26Var.f457323i = i17;
        h26Var.f457325n = a17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = h26Var;
        lVar.f152198b = new r45.i26();
        lVar.f152200d = 7140;
        lVar.f152199c = "/cgi-bin/mmpay-bin/offlinesetpayment";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152211o = 2;
        p(lVar.a());
        this.f152182i = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSetOfflinePayment", "do setpayment: " + bankType + ", " + bindSerial + ", " + a17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f17;
        r45.i26 i26Var = (r45.i26) fVar;
        if (i17 == 0 && i18 == 0) {
            if ((i26Var != null && i26Var.f458222d == 0) && (f17 = vr4.f1.wi().Ai().f(this.f529675m)) != null) {
                yo3.f fVar2 = yo3.f.f545678a;
                java.lang.String field_bindSerial = f17.f69225xed6d60f6;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_bindSerial, "field_bindSerial");
                yo3.d dVar = yo3.f.f545679b;
                if (dVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sImpl");
                    throw null;
                }
                dVar.d(field_bindSerial);
            }
        }
        f529674n = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        f529674n = true;
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        return l17;
    }
}
