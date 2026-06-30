package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes11.dex */
public class g1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashSet f152859g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f152860h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f152861d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f152862e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f152863f;

    public g1(java.lang.String str, int i17, int i18, java.util.LinkedList linkedList) {
        this.f152861d = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yd6();
        lVar.f152198b = new r45.zd6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f152200d = 251;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152862e = a17;
        r45.yd6 yd6Var = (r45.yd6) a17.f152243a.f152217a;
        yd6Var.f472528e = c01.z1.r();
        yd6Var.f472527d = i17;
        yd6Var.f472529f = str;
        yd6Var.f472530g = "" + java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList2 = yd6Var.f472532i;
        if (linkedList != null && linkedList.size() == i18) {
            yd6Var.f472531h = i18;
            linkedList2.addAll(linkedList);
        }
        linkedList2.size();
    }

    public static boolean H() {
        ((hs.g0) ((j30.o) i95.n0.c(j30.o.class))).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG;
        long t17 = c17.t(u3Var, 0L);
        if (t17 == 0 || gm0.j1.b().t()) {
            t17 = c01.id.c();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(t17));
        }
        if (c01.id.c() - t17 < 259200000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "lastLoginTime:%s", k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, t17 / 1000));
        return false;
    }

    public static void I(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
        if (q57 != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("messageSvrId", java.lang.Long.toString(q57.I0()));
                jSONObject.put("MsgCreateTime", java.lang.Long.toString(q57.mo78012x3fdd41df()));
                K(str, i17, "lastMessage", jSONObject.toString());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void J(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s", str, java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && gm0.j1.b().m()) {
            if (!c01.e2.D(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(str)) {
                I(str, i17);
            }
        }
    }

    public static void K(java.lang.String toUserName, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s %s %s", toUserName, java.lang.Integer.valueOf(i17), str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(toUserName)) {
            return;
        }
        if ((!c01.e2.D(toUserName) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.Y3(toUserName)) && gm0.j1.b().m()) {
            boolean z17 = false;
            if (((i17 == 2 || i17 == 5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("StatusNotifyForbidEnterSession", 0) == 1) ? false : true) {
                if (i17 == 16 || i17 == 15 || (i17 == 9 && ("deleteMessages".equals(str) || "clearAllMsg".equals(str)))) {
                    gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(toUserName, i17, str, str2));
                    return;
                }
                if (H()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
                    boolean J3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(toUserName);
                    boolean z18 = i17 == 1 || i17 == 2 || i17 == 5 || i17 == 14 || i17 == 13;
                    if (J3 && z18) {
                        z17 = true;
                    }
                    if (z17) {
                        p3325xe03a0797.p3326xc267989b.l.d(v65.m.f515113a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new qi3.l(toUserName, 24, i17, str, str2, null), 2, null);
                    } else {
                        gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(toUserName, i17, str, str2));
                    }
                }
            }
        }
    }

    public static void L(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        if (f9Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "enterShareCardMessageStatusSession %s %s %s", f9Var.Q0(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("messageSvrId", java.lang.Long.toString(f9Var.I0()));
                jSONObject.put("shareCardMessageStatus", java.lang.Long.toString(i18));
                K(f9Var.Q0(), i17, "shareCardMessageStatus", jSONObject.toString());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void M(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]msgInfo is null");
            return;
        }
        gm0.j1.i();
        if (!((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]autoSyncState close");
            return;
        }
        java.util.HashSet hashSet = f152859g;
        if (hashSet.contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd: has send cmd: msgSvrId:%d, msgLocalId:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
            return;
        }
        hashSet.add(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        if (gm0.j1.b().m()) {
            c01.z1.x();
            v15.b bVar = new v15.b();
            v15.a aVar = new v15.a();
            aVar.l(f9Var.Q0());
            aVar.k(f9Var.I0());
            aVar.j(java.lang.Long.valueOf(f9Var.mo78012x3fdd41df() / 1000));
            bVar.j().add(aVar);
            java.lang.String str = "<![CDATA[" + bVar.m126747x696739c() + "]]>";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd:msgID:%d,  %s", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), str);
            if (H()) {
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p957x53236a1b.g1(c01.z1.r(), 11, "DownloadFile", str));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f152863f = u0Var;
        return mo9409x10f9447a(sVar, this.f152862e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 251;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "onGYNetEnd. userName=" + this.f152861d + ", errType=" + i18 + ", errCode=" + i19 + ",errMsg=" + str);
        this.f152863f.mo815x76e0bfae(i18, i19, str, this);
    }

    public g1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f152861d = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yd6();
        lVar.f152198b = new r45.zd6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f152200d = 251;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f152862e = a17;
        r45.yd6 yd6Var = (r45.yd6) a17.f152243a.f152217a;
        yd6Var.f472528e = c01.z1.r();
        yd6Var.f472527d = i17;
        yd6Var.f472529f = str;
        yd6Var.f472530g = "" + java.lang.System.currentTimeMillis();
        r45.xd6 xd6Var = new r45.xd6();
        yd6Var.f472533m = xd6Var;
        xd6Var.f471531d = str2;
        xd6Var.f471532e = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneStatusNotify", "real do status notify toUsername:%s code:%s funcName:%s args:%s", str, java.lang.Integer.valueOf(i17), str2, str3);
    }
}
