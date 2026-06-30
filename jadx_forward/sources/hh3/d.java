package hh3;

/* loaded from: classes4.dex */
public class d extends ih3.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f362996e;

    /* renamed from: f, reason: collision with root package name */
    public fh3.a f362997f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f362998g;

    /* renamed from: h, reason: collision with root package name */
    public long f362999h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f363000i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f363001m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f363002n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f363003o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f363004p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f363005q;

    public d(ih3.m mVar) {
        super(mVar);
        this.f362996e = null;
        gm0.j1.d().a(3713, this);
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "new_link_succeed_contact";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (map == null) {
            return null;
        }
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str2 == null ? "" : str2;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        hh3.a aVar = new hh3.a(this, 1, null, bundle, map, str, weakReference, string, weakReference2);
        aVar.m75740x3ab833d4(true);
        spannableString.setSpan(aVar, 0, str3.length(), 33);
        return spannableString;
    }

    @Override // ih3.n
    public void c() {
        super.c();
        gm0.j1.d().q(3713, this);
    }

    public final void e(android.content.Context context) {
        android.app.ProgressDialog progressDialog = this.f362996e;
        if (progressDialog == null) {
            this.f362996e = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfj), true, true, new hh3.b(this));
        } else {
            if (progressDialog.isShowing()) {
                return;
            }
            this.f362996e.show();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        android.app.ProgressDialog progressDialog = this.f362996e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f362996e.dismiss();
        }
        if (m1Var instanceof fh3.a) {
            if (i18 == -3600) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                u1Var.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfe));
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
                u1Var.l(null);
                u1Var.q(false);
                jh3.n.i(this.f362999h, 7);
                return;
            }
            if (i17 == 0 && i18 == 0) {
                fh3.a aVar = (fh3.a) m1Var;
                r45.ow4 ow4Var = aVar.f344190f;
                r45.ow4 ow4Var2 = ow4Var != null ? ow4Var : null;
                if (ow4Var2 != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(ow4Var2.f76492x92037252.f458492d);
                    int i19 = aVar.f344191g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NetSceneOpenImNotAutoSucceed ret:%s action:%s", valueOf, java.lang.Integer.valueOf(i19));
                    if (i19 == 1) {
                        java.lang.ref.WeakReference weakReference = this.f362998g;
                        if (weakReference == null || weakReference.get() == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "NOT_AUTO_SUCCEED_ACTION_PREPARE context == null");
                            return;
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1((android.content.Context) this.f362998g.get());
                        u1Var2.a(false);
                        u1Var2.g(this.f363000i);
                        u1Var2.j(this.f363001m);
                        u1Var2.n(this.f363002n);
                        u1Var2.b(new hh3.c(this));
                        u1Var2.q(false);
                        jh3.n.i(this.f362999h, 8);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "notAutoSucceedResp is null");
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
            }
            db5.t7.m123883x26a183b(context, str, 0).show();
            jh3.n.i(this.f362999h, 6);
        }
    }
}
