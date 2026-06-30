package vh0;

@j95.b
/* loaded from: classes11.dex */
public final class i2 extends i95.w implements vh0.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f518413d = jz5.h.b(vh0.h2.f518411d);

    /* renamed from: e, reason: collision with root package name */
    public ip.j f518414e;

    public boolean Ai(java.lang.String str) {
        return Di(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi(str));
    }

    public boolean Bi(com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var) {
        if (y8Var == null) {
            return false;
        }
        return Di(y8Var.f277891a) || Di(y8Var.D);
    }

    public boolean Di(java.lang.String str) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(str)) {
            return ih.a.h("clicfg_enable_yuanbao_show_openim_info_android", false);
        }
        return false;
    }

    public final java.lang.String Ni(java.lang.String str) {
        boolean containsKey;
        ip.j jVar = this.f518414e;
        boolean z17 = false;
        if (jVar != null) {
            synchronized (jVar) {
                if (!jVar.f375103b) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
                    jVar.f();
                }
                str.trim();
                jVar.f375102a.containsKey(str);
                containsKey = jVar.f375102a.containsKey(str);
            }
            if (containsKey) {
                z17 = true;
            }
        }
        if (!z17) {
            return null;
        }
        ip.j jVar2 = this.f518414e;
        java.lang.String d17 = jVar2 != null ? jVar2.d(str) : null;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return d17 == null ? "" : d17;
    }

    public final xh0.b Ri() {
        return (xh0.b) ((jz5.n) this.f518413d).mo141623x754a37bb();
    }

    public java.lang.String Ui(java.lang.String str) {
        xh0.b Ri = Ri();
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) Ri.f536013m.a(str);
        return str2 == null ? "" : str2;
    }

    public java.lang.String Vi(java.lang.String str) {
        xh0.b Ri = Ri();
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) Ri.f536012i.a(str);
        return str2 == null ? "" : str2;
    }

    public java.lang.String Zi(java.lang.String str) {
        xh0.b Ri = Ri();
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) Ri.f536014n.a(str);
        if (str2 == null) {
            str2 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return "";
        }
        java.lang.String optString = new org.json.JSONObject(str2).optString("Detail", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        return optString;
    }

    public java.lang.String aj(java.lang.String str, boolean z17) {
        java.lang.String str2 = "";
        java.lang.String Vi = Vi(str == null ? "" : str);
        if (str == null) {
            str = "";
        }
        java.lang.String Ui = Ui(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ui)) {
            str2 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, Ui);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getWordingFromID(...)");
        }
        return (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", Vi)) ? "@".concat(str2) : str2;
    }

    public org.json.JSONArray bj(java.lang.String username) {
        org.json.JSONArray jSONArray;
        java.lang.Object opt;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String Ni = Ni("IntelligenceExternalInfo");
        if (Ni != null) {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(Ni).optJSONObject(username);
            if (optJSONObject == null || (opt = optJSONObject.opt("profile_info_detail")) == null) {
                jSONArray = null;
            } else {
                if (opt instanceof org.json.JSONArray) {
                    jSONArray = (org.json.JSONArray) opt;
                } else if (opt instanceof java.lang.String) {
                    jSONArray = new org.json.JSONArray((java.lang.String) opt);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotConfigService", "[-] bad profile info detail value from dynamic config: " + opt);
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotConfigService", "[+] get 'profile_info_detail' from dynamic config, username: %s, value: %s", username, jSONArray);
                }
            }
            if (jSONArray != null) {
                return jSONArray;
            }
        }
        java.lang.String str = (java.lang.String) Ri().f536009f.a(username);
        return str != null ? new org.json.JSONArray(str) : null;
    }

    public org.json.JSONObject cj() {
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2517x2c0e0b6f.C19981xf5b241b4());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(f17);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("maxTitleLength", jSONObject.optInt("maxTitleLength", 32));
                jSONObject2.put("maxContentLength", jSONObject.optInt("maxContentLength", 600));
                jSONObject2.put("maxCommandCount", jSONObject.optInt("maxCommandCount", 100));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotConfigService", "[+] getShortcutCommandLimits from repairer config: %s", jSONObject2.toString());
                return jSONObject2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotConfigService", e17, "[-] parse ShortcutCommandLimits failed, use defaults", new java.lang.Object[0]);
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("maxTitleLength", 32);
        jSONObject3.put("maxContentLength", 600);
        jSONObject3.put("maxCommandCount", 100);
        return jSONObject3;
    }

    public java.lang.String fj(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return (java.lang.String) Ri().f536015o.a(username);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long hj(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "IntelligenceExternalInfo"
            java.lang.String r0 = r5.Ni(r0)
            if (r0 == 0) goto L5f
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r0)
            org.json.JSONObject r0 = r1.optJSONObject(r6)
            r1 = 0
            if (r0 == 0) goto L58
            java.lang.String r2 = "toolbar_flag"
            java.lang.Object r0 = r0.opt(r2)
            if (r0 == 0) goto L58
            boolean r2 = r0 instanceof java.lang.String
            java.lang.String r3 = "MicroMsg.ChatBotConfigService"
            if (r2 == 0) goto L35
            java.lang.String r0 = (java.lang.String) r0
            long r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L33:
            r1 = r0
            goto L4d
        L35:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L3c
            java.lang.Long r0 = (java.lang.Long) r0
            goto L33
        L3c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[-] bad toolbar flag value from dynamic config: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
        L4d:
            if (r1 == 0) goto L58
            java.lang.String r0 = "[+] get 'toolbar_flag' from dynamic config, username: %s, value: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0, r2)
        L58:
            if (r1 == 0) goto L5f
            long r0 = r1.longValue()
            goto L74
        L5f:
            xh0.b r0 = r5.Ri()
            xh0.d r0 = r0.f536011h
            java.lang.Object r6 = r0.a(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 == 0) goto L72
            long r0 = r6.longValue()
            goto L74
        L72:
            r0 = 0
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.i2.hj(java.lang.String):long");
    }

    public vh0.f1 ij(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        xh0.b Ri = Ri();
        Ri.getClass();
        return new xh0.e(Ri, username, null);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f518414e = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
    }

    public boolean wi(com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var) {
        if (y8Var != null && Bi(y8Var)) {
            return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi(y8Var.f277891a)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Vi(y8Var.D))) ? false : true;
        }
        return false;
    }
}
