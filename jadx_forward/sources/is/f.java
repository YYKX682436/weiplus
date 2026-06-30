package is;

@j95.b
/* loaded from: classes11.dex */
public final class f extends i95.w implements js.r0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public js.p0 f375862d;

    public void Ai(java.lang.String username) {
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "clearNoPwdInfo：username[%s]", username);
        android.content.SharedPreferences sharedPreferences = c01.uc.f119047c.f119049a;
        try {
            if (sharedPreferences.contains(username)) {
                java.lang.String string = sharedPreferences.getString(username, "");
                jSONObject = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 0))) : new org.json.JSONObject();
            } else {
                jSONObject = new org.json.JSONObject();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("last_logout_no_pwd_ticket_for_one_click") || !jSONObject.has("last_logout_no_pwd_ticket_for_one_click")) {
                return;
            }
            jSONObject.remove("last_logout_no_pwd_ticket_for_one_click");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountInfo", "delete key %s, jsonStr %s", "last_logout_no_pwd_ticket_for_one_click", jSONObject.toString());
            sharedPreferences.edit().putString(username, android.util.Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", "last_logout_no_pwd_ticket_for_one_click", username, e17.getMessage());
        }
    }

    public void Bi(js.a type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ui = Ui();
        if (Ui != null) {
            Ui.A(Ni(type), Ui.o(Ni(type), 0) + 1);
        }
    }

    public long Di(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "getLoginTypeCfg：curUserName[%s]", username);
        java.lang.String c17 = c01.uc.f119047c.c(username, "last_login_type_exp");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return 0L;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        return java.lang.Long.parseLong(c17);
    }

    public final java.lang.String Ni(js.a aVar) {
        int ordinal = aVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? "" : "key_logout_fingerprint_entry_show_times" : "key_logout_no_pwd_entry_show_times";
    }

    public boolean Ri() {
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "getNoPwdPermissionStatus， curUserName[%s]", r17);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c01.uc.f119047c.c(r17, "last_logout_no_pwd_permission_status"), "1");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ui() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("account_" + gm0.m.i() + "_login_mmkv");
    }

    public boolean Vi(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f402313d;
        boolean z17 = (Di & 16) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "isFastSwitchDynamicConfigEnable [%b]", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean Zi(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f402313d;
        return (Di & 8) != 0;
    }

    public boolean aj(js.a type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ui = Ui();
        return Ui != null && Ui.o(Ni(type), 0) < 3;
    }

    public boolean bj(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        long Di = Di(username);
        ls.k[] kVarArr = ls.k.f402313d;
        return (Di & 2) != 0;
    }

    public boolean cj() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("TrustedFriendFuncEntry"), 0) != 0;
    }

    public void fj(de0.f fVar, java.lang.String saveKey, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(saveKey, "saveKey");
        if (z17) {
            boolean Ri = Ri();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "saveLastNoPwdTicket judgePermission[%b]", java.lang.Boolean.valueOf(Ri));
            if (!Ri) {
                return;
            }
        }
        java.lang.String str = fVar != null ? ((r45.kd4) ((com.p314xaae8f345.mm.p957x53236a1b.r0) fVar).f152935e.f152244b.f152233a).f460133d : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "no pwd ticket is null!");
        }
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "logout return username[%s]", r17);
        c01.uc.f119047c.h(r17, saveKey, str);
    }

    public void hj(java.lang.String username, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        c01.uc.f119047c.h(username, "last_logout_fingerprint_permission_status", z17 ? "1" : "0");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        js.p0 p0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoService", "onSceneEnd errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (m1Var == null || m1Var.mo808xfb85f7b0() != 145) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            js.p0 p0Var2 = this.f375862d;
            if (p0Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6) p0Var2).a(null, null);
                return;
            }
            return;
        }
        if (!(m1Var instanceof h11.e) || (p0Var = this.f375862d) == null) {
            return;
        }
        h11.e eVar = (h11.e) m1Var;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6) p0Var).a(((h11.d) eVar.f359604d).f359602b.f424458a.f455046h, eVar.P());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object wi(android.content.Context r11, java.lang.String r12, java.lang.String r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is.f.wi(android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
