package ms4;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ms4.j0 f412579e = ms4.c0.f412538a;

    /* renamed from: a, reason: collision with root package name */
    public r45.nl4 f412580a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f412581b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f412582c;

    /* renamed from: d, reason: collision with root package name */
    public ks4.h f412583d;

    public j0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41382xcdae5de7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19061x48b2899b.class);
    }

    public final void a(android.content.Context context, r45.nl4 nl4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "is midas sdk already initialized: " + this.f412581b);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_wecoin_init_midas_sdk_once, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinUtils", "isMidasInitOnceABTest, %s", java.lang.Integer.valueOf(Ni));
        if ((Ni != 0) && this.f412581b) {
            return;
        }
        com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2 c4743x7dd68fb2 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4743x7dd68fb2();
        c4743x7dd68fb2.f20183xa3aefc97 = nl4Var.f463018d;
        c4743x7dd68fb2.f20184xc3c3c505 = nl4Var.f463019e;
        c4743x7dd68fb2.f20185xb4b4e3b5 = nl4Var.f463020f;
        c4743x7dd68fb2.f20193x243a3e51 = nl4Var.f463021g;
        c4743x7dd68fb2.f20194xfea94af0 = nl4Var.f463022h;
        c4743x7dd68fb2.f134673pf = nl4Var.f463023i;
        c4743x7dd68fb2.f20186x659cc89 = nl4Var.f463024m;
        c4743x7dd68fb2.f20190xc84d8cc9 = "enableX5=0";
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41381xca02612b("release");
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41383xb7de63a5(false);
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41382xcdae5de7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19061x48b2899b.class);
        com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41365x316510(context, c4743x7dd68fb2);
        this.f412581b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.content.Context activity, js4.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "initSDK.");
        r45.nl4 nl4Var = this.f412580a;
        if (nl4Var == null) {
            pq5.g h17 = new ks4.d().l().h(new ms4.f0(oVar, this, activity));
            if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                h17.f((im5.b) activity);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinMidasInitializer", "initSDK already initialized.");
        a(activity, nl4Var);
        ((ku5.t0) ku5.t0.f394148d).B(new ms4.e0(oVar));
    }

    public final void c(android.app.Activity context, js4.n info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String str = info.f383078c;
        java.lang.String str2 = str == null ? uuid : str;
        f(context, true);
        int d17 = os4.h.d(info.f383076a);
        e(d17, str2, uuid, 3, 1, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 20);
        r45.gc5 gc5Var = new r45.gc5();
        gc5Var.f456621h = info.f383077b;
        gc5Var.f456617d = uuid;
        gc5Var.f456618e = info.f383081f;
        gc5Var.f456619f = info.f383080e;
        gc5Var.f456624n = info.f383076a;
        gc5Var.f456625o = str2;
        gc5Var.f456620g = info.f383083h;
        gc5Var.f456622i = info.f383086k;
        gc5Var.f456623m = info.f383087l;
        ks4.h hVar = new ks4.h(gc5Var);
        this.f412583d = hVar;
        pq5.g l17 = hVar.l();
        if (l17 != null) {
            l17.h(new ms4.g0(this, context, info, d17, str2, uuid, gc5Var));
        }
    }

    public final void d(android.app.Activity activity, r45.hc5 response, java.lang.String env, js4.n info, java.lang.String uniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        if (response.f457581d != null) {
            java.lang.String str = response.f457583f;
            if (!(str == null || str.length() == 0)) {
                com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84 c4744x18108f84 = new com.p314xaae8f345.p592x631407a.api.p594x414ef28f.C4744x18108f84();
                r45.nl4 nl4Var = response.f457581d;
                c4744x18108f84.f20183xa3aefc97 = nl4Var.f463018d;
                c4744x18108f84.f20184xc3c3c505 = nl4Var.f463019e;
                c4744x18108f84.f20185xb4b4e3b5 = nl4Var.f463020f;
                c4744x18108f84.f20193x243a3e51 = nl4Var.f463021g;
                c4744x18108f84.f20194xfea94af0 = nl4Var.f463022h;
                c4744x18108f84.f134673pf = nl4Var.f463023i;
                c4744x18108f84.f20186x659cc89 = nl4Var.f463024m;
                c4744x18108f84.f20195xd67ef1e7 = "1";
                c4744x18108f84.f20226xa5656a2c = response.f457583f;
                c4744x18108f84.f20182xc04d5cf1.f20213xb6c1d73b = "wechat";
                com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41383xb7de63a5(false);
                com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41381xca02612b(env);
                c4744x18108f84.f20229x86f18d3 = 1;
                c4744x18108f84.f20228xc058de06 = info.f383081f;
                c4744x18108f84.f20192xa7245f4 = response.f457584g;
                int d17 = os4.h.d(info.f383076a);
                java.lang.String sceneSessionID = info.f383078c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sceneSessionID, "sceneSessionID");
                e(d17, sceneSessionID, uniqueId, 4, 1, 0, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(fe1.l.f69742x366c91de, 23);
                com.p314xaae8f345.p592x631407a.api.C4727x8a3e11bd.m41370xd7c293f5(activity, c4744x18108f84, new ms4.b0(response.f457582e, info, uniqueId));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeCoinMidasInitializer", "rechargeByMidasSDK param error.");
    }

    public final void e(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, int i27, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22129, java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3);
    }

    public final void f(android.app.Activity activity, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (z17) {
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 3, new ms4.i0(activity, this));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f412582c;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            u3Var = null;
        }
        this.f412582c = u3Var;
    }
}
