package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes11.dex */
public final class z8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f267126d;

    /* renamed from: e, reason: collision with root package name */
    public int f267127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 f267128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var, nw4.y2 y2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f267128f = e9Var;
        this.f267129g = y2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.z8(this.f267128f, this.f267129g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.z8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.ui.widget.dialog.u3] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.tencent.mm.ui.widget.dialog.u3] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q;
        ?? r27 = "MicroMsg.PrivateCommonApiHandler";
        pz5.a aVar = pz5.a.f440719d;
        ?? r37 = this.f267127e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nw4.y2 y2Var = this.f267129g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.e9 e9Var = this.f267128f;
        try {
            try {
                if (r37 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    android.content.Context context = e9Var.f266617a.f266508d;
                    Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), e9Var.f266617a.f266508d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, null);
                    com.p314xaae8f345.mm.p957x53236a1b.j jVar = com.p314xaae8f345.mm.p957x53236a1b.j.f152884a;
                    this.f267126d = Q;
                    this.f267127e = 1;
                    if (jVar.a(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (r37 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) this.f267126d;
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                Q.dismiss();
                android.content.Context context2 = e9Var.f266617a.f266508d;
                r27 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f;
                r37 = 0;
                r37 = 0;
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = r27 != 0 ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context2 : null;
                if (activityC21401x6ce6f73f != null) {
                    js.w0 w0Var = (js.w0) i95.n0.c(js.w0.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.y8(activityC21401x6ce6f73f, e9Var, y2Var);
                    is.i0 i0Var = (is.i0) w0Var;
                    i0Var.getClass();
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
                    if (c01.z1.t() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"))) {
                        c71.b.c(activityC21401x6ce6f73f, ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AffiliatedAcctForgetPwdUrl"), 0, true);
                    } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has not bind mobile");
                        android.content.Intent intent = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504.class);
                        intent.putExtra("bind_scene", 4);
                        intent.putExtra("bind_scene", 4);
                        db5.e1.C(activityC21401x6ce6f73f, activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574337hx4), "", activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ail), activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new is.b0(i0Var, activityC21401x6ce6f73f, intent, y8Var), new is.c0(i0Var, y8Var));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdServiceSetPwdService", "has bind mobile");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC21401x6ce6f73f);
                        java.lang.String string = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572353ax4);
                        java.lang.String string2 = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572351ax2, str);
                        java.lang.String string3 = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572352ax3);
                        java.lang.String string4 = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572350ax1);
                        java.lang.String string5 = activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
                        u1Var.u(string);
                        u1Var.g(string2);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = u1Var.f293529a.f293354b;
                        aVar2.f293267x = string3;
                        aVar2.f293268y = string4;
                        aVar2.f293269z = string5;
                        is.e0 e0Var = new is.e0(i0Var, activityC21401x6ce6f73f, str, y8Var);
                        is.g0 g0Var = new is.g0(i0Var, activityC21401x6ce6f73f, y8Var);
                        is.h0 h0Var = new is.h0(i0Var, y8Var);
                        aVar2.I = e0Var;
                        aVar2.f293241J = g0Var;
                        aVar2.K = h0Var;
                        u1Var.q(false);
                        android.widget.Button button = (android.widget.Button) u1Var.f293531c.findViewById(com.p314xaae8f345.mm.R.id.jl8);
                        if (button != null) {
                            button.setTextColor(activityC21401x6ce6f73f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
                        }
                    }
                }
                return f0Var;
            } catch (rm0.j e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r27, e17, "", new java.lang.Object[0]);
                tm.a b17 = tm.a.b(e17.f478959g);
                if (b17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r27, "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new java.lang.Integer(e17.f478958f), new java.lang.Integer(b17.f501933c), b17.f501931a, b17.f501932b);
                    db5.e1.G(e9Var.f266617a.f266508d, b17.f501932b, b17.f501934d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.w8(e9Var, y2Var));
                }
                r37.dismiss();
                return f0Var;
            }
        } catch (java.lang.Throwable th6) {
            r37.dismiss();
            throw th6;
        }
    }
}
