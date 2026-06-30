package w45;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final w45.b f524432a = new w45.b();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e f524433b;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e>(a0Var) { // from class: com.tencent.mm.qqlogin.ChangeQQLoginTypeManager$exWindowCloseEventIListener$1
            {
                this.f39173x3fe91575 = 1684674094;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e c6268x26920e3e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e event = c6268x26920e3e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event.f136517g.f88753a, "escape_change_qq_login_type")) {
                    w45.b bVar = w45.b.f524432a;
                    if (r26.n0.B("", "ChangeQQLoginType_sendmsg", false)) {
                        w45.b.f524432a.a(event);
                    } else if (r26.n0.B("", "ChangeQQLoginType_kickout", false)) {
                        w45.b.f524433b = event;
                        w45.p pVar = new w45.p();
                        java.lang.Object l17 = gm0.j1.u().c().l(6, null);
                        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574576is1), null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bln), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, w45.k.f524444d, null);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeQQLoginType.LogoutHelper", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(99L, 145L, 1L, false);
                            if (gm0.j1.d() != null && gm0.j1.d().f152297d != null) {
                                gm0.j1.d().f152297d.C(false);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChangeQQLoginType.LogoutHelper", "dklogout User LOGOUT Now uin:%d , clear cookie", java.lang.Integer.valueOf(gm0.j1.b().h()));
                            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5435xbb30424e().e();
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.k) ((e42.m0) i95.n0.c(e42.m0.class))).Ai();
                            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                            w45.m mVar = new w45.m(pVar);
                            pVar.f524456c = mVar;
                            d17.a(255, mVar);
                            com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(2);
                            w0Var.f152977f = 2;
                            gm0.j1.d().g(w0Var);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new w45.n(w0Var, pVar), false);
                            pVar.f524457d = b4Var;
                            b4Var.c(12000L, 12000L);
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            pVar.f524459f = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571926tq), true, false, new w45.o(w0Var, pVar));
                            if (gm0.j1.a()) {
                                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                                java.lang.String r17 = c01.z1.r();
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                                c01.b9.f118602c.b(com.p314xaae8f345.mm.p943x351df9c2.g.c(r17, false, false));
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeQQLoginType.LogoutHelper", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
                        }
                    } else {
                        w45.b.f524432a.a(event);
                    }
                }
                return false;
            }
        };
    }

    public final void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6268x26920e3e event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.Object obj = event.f136517g.f88754b.get("liteAppUuid");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        long parseLong = str != null ? java.lang.Long.parseLong(str) : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChangeQQLoginTypeManager", "NEXT_ESCAPE_CHANGE_QQ_LOGIN, liteAppUuid=" + parseLong);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        android.content.Intent intent = new android.content.Intent();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(parseLong, intent);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, null, v45.c.class, w45.a.f524431d);
        f524433b = null;
    }
}
