package com.tencent.mm.modelsimple;

/* loaded from: classes11.dex */
public class g1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashSet f71326g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f71327h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f71328d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f71329e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f71330f;

    public g1(java.lang.String str, int i17, int i18, java.util.LinkedList linkedList) {
        this.f71328d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yd6();
        lVar.f70665b = new r45.zd6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f70667d = 251;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71329e = a17;
        r45.yd6 yd6Var = (r45.yd6) a17.f70710a.f70684a;
        yd6Var.f390995e = c01.z1.r();
        yd6Var.f390994d = i17;
        yd6Var.f390996f = str;
        yd6Var.f390997g = "" + java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList2 = yd6Var.f390999i;
        if (linkedList != null && linkedList.size() == i18) {
            yd6Var.f390998h = i18;
            linkedList2.addAll(linkedList);
        }
        linkedList2.size();
    }

    public static boolean H() {
        ((hs.g0) ((j30.o) i95.n0.c(j30.o.class))).getClass();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG;
        long t17 = c17.t(u3Var, 0L);
        if (t17 == 0 || gm0.j1.b().t()) {
            t17 = c01.id.c();
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(t17));
        }
        if (c01.id.c() - t17 < 259200000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "lastLoginTime:%s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, t17 / 1000));
        return false;
    }

    public static void I(java.lang.String str, int i17) {
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
        if (q57 != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("messageSvrId", java.lang.Long.toString(q57.I0()));
                jSONObject.put("MsgCreateTime", java.lang.Long.toString(q57.getCreateTime()));
                K(str, i17, "lastMessage", jSONObject.toString());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void J(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s", str, java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && gm0.j1.b().m()) {
            if (!c01.e2.D(str) || com.tencent.mm.storage.z3.Y3(str)) {
                I(str, i17);
            }
        }
    }

    public static void K(java.lang.String toUserName, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "enterSession %s %s %s %s", toUserName, java.lang.Integer.valueOf(i17), str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(toUserName)) {
            return;
        }
        if ((!c01.e2.D(toUserName) || com.tencent.mm.storage.z3.Y3(toUserName)) && gm0.j1.b().m()) {
            boolean z17 = false;
            if (((i17 == 2 || i17 == 5) && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("StatusNotifyForbidEnterSession", 0) == 1) ? false : true) {
                if (i17 == 16 || i17 == 15 || (i17 == 9 && ("deleteMessages".equals(str) || "clearAllMsg".equals(str)))) {
                    gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.g1(toUserName, i17, str, str2));
                    return;
                }
                if (H()) {
                    kotlin.jvm.internal.o.g(toUserName, "toUserName");
                    boolean J3 = com.tencent.mm.storage.z3.J3(toUserName);
                    boolean z18 = i17 == 1 || i17 == 2 || i17 == 5 || i17 == 14 || i17 == 13;
                    if (J3 && z18) {
                        z17 = true;
                    }
                    if (z17) {
                        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new qi3.l(toUserName, 24, i17, str, str2, null), 2, null);
                    } else {
                        gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.g1(toUserName, i17, str, str2));
                    }
                }
            }
        }
    }

    public static void L(com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        if (f9Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "enterShareCardMessageStatusSession %s %s %s", f9Var.Q0(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("messageSvrId", java.lang.Long.toString(f9Var.I0()));
                jSONObject.put("shareCardMessageStatus", java.lang.Long.toString(i18));
                K(f9Var.Q0(), i17, "shareCardMessageStatus", jSONObject.toString());
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void M(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]msgInfo is null");
            return;
        }
        gm0.j1.i();
        if (!((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE)).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]autoSyncState close");
            return;
        }
        java.util.HashSet hashSet = f71326g;
        if (hashSet.contains(java.lang.Long.valueOf(f9Var.getMsgId()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd: has send cmd: msgSvrId:%d, msgLocalId:%d", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.getMsgId()));
            return;
        }
        hashSet.add(java.lang.Long.valueOf(f9Var.getMsgId()));
        if (gm0.j1.b().m()) {
            c01.z1.x();
            v15.b bVar = new v15.b();
            v15.a aVar = new v15.a();
            aVar.l(f9Var.Q0());
            aVar.k(f9Var.I0());
            aVar.j(java.lang.Long.valueOf(f9Var.getCreateTime() / 1000));
            bVar.j().add(aVar);
            java.lang.String str = "<![CDATA[" + bVar.toXml() + "]]>";
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "[MicroMsg.MultiTerminalSyncMgr]sendSyncMultiTerminalCmd:msgID:%d,  %s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
            if (H()) {
                gm0.j1.n().f273288b.g(new com.tencent.mm.modelsimple.g1(c01.z1.r(), 11, "DownloadFile", str));
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f71330f = u0Var;
        return dispatch(sVar, this.f71329e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 251;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "onGYNetEnd. userName=" + this.f71328d + ", errType=" + i18 + ", errCode=" + i19 + ",errMsg=" + str);
        this.f71330f.onSceneEnd(i18, i19, str, this);
    }

    public g1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f71328d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yd6();
        lVar.f70665b = new r45.zd6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/statusnotify";
        lVar.f70667d = 251;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f71329e = a17;
        r45.yd6 yd6Var = (r45.yd6) a17.f70710a.f70684a;
        yd6Var.f390995e = c01.z1.r();
        yd6Var.f390994d = i17;
        yd6Var.f390996f = str;
        yd6Var.f390997g = "" + java.lang.System.currentTimeMillis();
        r45.xd6 xd6Var = new r45.xd6();
        yd6Var.f391000m = xd6Var;
        xd6Var.f389998d = str2;
        xd6Var.f389999e = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneStatusNotify", "real do status notify toUsername:%s code:%s funcName:%s args:%s", str, java.lang.Integer.valueOf(i17), str2, str3);
    }
}
