package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class t2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f263513a;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Point f263515c;

    /* renamed from: d, reason: collision with root package name */
    public long f263516d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.k2 f263518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263519g;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f263514b = "";

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f263517e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3();

    public t2(zg0.k2 k2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263518f = k2Var;
        this.f263519g = e3Var;
    }

    public final boolean a(java.lang.String url, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263519g;
        java.lang.String stringExtra = e3Var.d0().getStringExtra("geta8key_username");
        int k07 = e3Var.k0(stringExtra);
        if (!this.f263513a) {
            this.f263514b = url;
        }
        pw4.c cVar = e3Var.f263471l;
        if (cVar.f440246b && cVar.f440261q && !cVar.f440248d && ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x3.f263552h).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(e3Var.o1(), "handle oauth fail on background");
            e3Var.J(e3Var.f263482q0, url);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var = e3Var.f263349r1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
        o2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 oauthMultiAccountMgr = this.f263517e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oauthMultiAccountMgr, "oauthMultiAccountMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var = o2Var.f263436c;
        if (f3Var != null) {
            f3Var.c();
        }
        o2Var.f263436c = oauthMultiAccountMgr;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 e07 = e3Var.e0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.n2 n2Var = e3Var.f263350s1;
        int e17 = e3Var.j1().e();
        android.content.Context Y = e3Var.Y();
        android.app.Dialog dialog = e3Var.f263477o;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a = java.lang.System.currentTimeMillis();
        hy4.b.INSTANCE.d(1, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2 o2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var;
        java.lang.String c17 = o2Var2.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorize scene: %d, autoOauth: %d, url=%s", java.lang.Integer.valueOf(k07), java.lang.Integer.valueOf(i17), c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.w1(o2Var2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) o2Var2.f263434a.get();
        if (e3Var2 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = o2Var2.f263435b;
            if (u3Var != null && u3Var.isShowing()) {
                u3Var.dismiss();
            }
            if (u3Var != null) {
                u3Var.setCancelMessage(null);
            }
            if (u3Var != null) {
                u3Var.setDismissMessage(null);
            }
            o2Var2.f263435b = db5.e1.Q(e3Var2.f263449a.m81400x569210f3(), null, e3Var2.Y().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gga), true, true, w1Var);
        }
        r45.kx4 kx4Var = new r45.kx4();
        kx4Var.f460558d = url;
        kx4Var.f460559e = stringExtra;
        kx4Var.f460560f = k07;
        kx4Var.f460561g = i17;
        kx4Var.f460563i = c17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = kx4Var;
        lVar.f152198b = new r45.lx4();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/oauth_authorize";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.d1.f34608x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(Y);
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.x1(weakReference, e07, o2Var2, n2Var, url, e17, dialog));
        return true;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return !this.f263518f.f554287g && com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.e(url, this.f263519g.d0().getIntExtra("geta8key_scene", 0));
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return a(url, (this.f263513a || !((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) this.f263519g.f263349r1).e()) ? 0 : 1);
    }
}
