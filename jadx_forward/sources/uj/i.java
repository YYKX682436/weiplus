package uj;

/* loaded from: classes7.dex */
public final class i implements jc3.x {

    /* renamed from: d, reason: collision with root package name */
    public final uj.g f509689d = new uj.g();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 f509690e;

    /* renamed from: f, reason: collision with root package name */
    public final uj.q f509691f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f509692g;

    public i() {
        uj.k kVar = uj.k.f509694a;
        this.f509690e = kVar.b();
        java.lang.String u17 = kVar.a().u("AppID", "");
        java.lang.String u18 = kVar.a().u("ModuleName", "");
        int o17 = kVar.a().o("VersionType", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u18);
        this.f509691f = new uj.q(u17, o17, u18);
        this.f509692g = jz5.h.b(new uj.h(this));
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        return this.f509689d;
    }

    @Override // jc3.x
    public java.lang.String d() {
        jz5.g gVar = this.f509692g;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgManagement", "providePackageMD5 md5:".concat((java.lang.String) mo141623x754a37bb));
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        return (java.lang.String) mo141623x754a37bb2;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        uj.q qVar = this.f509691f;
        java.lang.String str = "game.js";
        if (qVar.f509711c.length() > 0) {
            str = qVar.f509711c + "game.js";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgManagement", "provideEncryptedPath:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 b17 = this.f509689d.b();
        if (b17 != null) {
            java.lang.String b18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) b17).b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "getPkgPath(...)");
            cb6.mo146xb9724478(kz5.b0.c(new lc3.k0(b18, str)));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicPlayablePkgManagement", "provideEncryptedPath: pkg not found");
            cb6.mo146xb9724478(kz5.p0.f395529d);
        }
    }

    @Override // jc3.x
    public java.lang.String g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 n9Var = this.f509690e;
        java.lang.String str = n9Var != null ? n9Var.f67177x28d45f97 : null;
        if (str == null) {
            str = "MagicPlayableService";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayablePkgManagement", "provideAppId appId:".concat(str));
        return str;
    }
}
