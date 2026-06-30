package q81;

/* loaded from: classes7.dex */
public final class q extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String username, java.lang.String appId, java.lang.Object obj) {
        r45.of7 wxaSyncPreLaunchCmd = (r45.of7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaSyncPreLaunchCmd, "wxaSyncPreLaunchCmd");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(username) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "invalid username & appId");
            return java.lang.Boolean.FALSE;
        }
        try {
            g(username, appId, wxaSyncPreLaunchCmd.f463763d.f453064f);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Predownload.CmdPreLaunch", e17, "", new java.lang.Object[0]);
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.of7 wxaSyncPreLaunchCmd = (r45.of7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaSyncPreLaunchCmd, "wxaSyncPreLaunchCmd");
        r45.cf7 Base = wxaSyncPreLaunchCmd.f463763d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Base, "Base");
        return Base;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdPreLaunch";
    }

    public final boolean g(java.lang.String str, java.lang.String str2, int i17) {
        r45.u54 u54Var = new r45.u54();
        r45.ac7 ac7Var = new r45.ac7();
        ac7Var.f451459d = 0;
        ac7Var.f451460e = 0;
        ac7Var.f451461f = 0;
        ac7Var.f451463h = 1;
        ac7Var.f451462g = "";
        ac7Var.f451464i = 0;
        u54Var.f468589e = ac7Var;
        u54Var.f468590f = 3;
        u54Var.f468588d = str2;
        u54Var.f468598q = str;
        u54Var.f468599r = true;
        r45.fd7 fd7Var = new r45.fd7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        fd7Var.f455779d = a17 != null ? a17.i() : -1;
        u54Var.f468592h = fd7Var;
        r45.y50 y50Var = new r45.y50();
        y50Var.f472332f = 1;
        u54Var.f468604w = y50Var;
        new ug1.e(u54Var, false).l().H(new q81.p(str, str2, i17));
        return true;
    }
}
