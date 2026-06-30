package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class t implements j91.d {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f80456d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f80457e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f80458f;

    /* renamed from: g, reason: collision with root package name */
    public int f80459g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f80460h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f80461i;

    public t(ze.n runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f80456d = runtime;
        this.f80457e = "";
        this.f80458f = "";
        this.f80459g = -1;
        this.f80460h = "";
        this.f80461i = new java.util.ArrayList();
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        try {
            if (this.f80459g < 0) {
                return "";
            }
            if (g()) {
                str2 = (java.lang.String) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).get(0);
            } else {
                java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
                java.lang.String str3 = this.f80456d.u0().f47282y0;
                if (kotlin.jvm.internal.o.b(str3, f07.get(0))) {
                    str2 = (java.lang.String) f07.get(1);
                } else {
                    if (!kotlin.jvm.internal.o.b(str3, f07.get(1))) {
                        return "";
                    }
                    str2 = (java.lang.String) f07.get(0);
                }
            }
            return str2;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public synchronized void b() {
        if (f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "exitChatToolAllPage");
            m(new java.util.ArrayList());
            this.f80459g = -1;
            k(new com.tencent.mm.plugin.appbrand.jsapi.chattool.k(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "exitChatTool currentChatToolRoom:" + this.f80457e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f80457e)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatToolService", "exitChatTool ignore.");
            return;
        }
        this.f80457e = "";
        this.f80458f = "";
        this.f80459g = -1;
        k(new com.tencent.mm.plugin.appbrand.jsapi.chattool.l(this));
    }

    public synchronized java.lang.String c() {
        java.lang.String chatToolMode;
        java.lang.String str;
        synchronized (this) {
            chatToolMode = this.f80460h;
            kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
        }
        return str;
        if (!kotlin.jvm.internal.o.b(chatToolMode, "subpackage") && !f()) {
            str = "";
            return str;
        }
        str = this.f80457e;
        return str;
    }

    public synchronized java.lang.String d() {
        return this.f80458f;
    }

    public java.util.ArrayList e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f()) {
            java.util.Iterator it = ((java.util.ArrayList) this.f80461i).iterator();
            while (it.hasNext()) {
                j91.a aVar = (j91.a) it.next();
                if (!(aVar.f298343a.length() == 0)) {
                    arrayList.add(aVar.f298343a);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean f() {
        java.lang.String chatToolMode;
        chatToolMode = this.f80460h;
        kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
        return kotlin.jvm.internal.o.b(chatToolMode, "allPage");
    }

    public boolean g() {
        if (!f()) {
            int i17 = this.f80459g;
            com.tencent.mm.plugin.appbrand.jsapi.chattool.e[] eVarArr = com.tencent.mm.plugin.appbrand.jsapi.chattool.e.f80382d;
            if (i17 != 3) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.e[] eVarArr2 = com.tencent.mm.plugin.appbrand.jsapi.chattool.e.f80382d;
                if (i17 != 4) {
                    return false;
                }
            }
        }
        return true;
    }

    public synchronized boolean h(java.lang.String chatToolMode, int i17, java.lang.String chatToolRoom) {
        kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
        kotlin.jvm.internal.o.g(chatToolRoom, "chatToolRoom");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatToolService", "openChatTool chatToolMode:" + chatToolMode + " chatType:" + i17 + " userName:" + chatToolRoom + " runtime.service:" + this.f80456d.C0());
        this.f80460h = chatToolMode;
        this.f80459g = i17;
        this.f80457e = chatToolRoom;
        java.lang.String a17 = a(chatToolRoom);
        this.f80458f = a17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            k(new com.tencent.mm.plugin.appbrand.jsapi.chattool.m(this, i17));
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatToolService", "openChatTool fail, sendToUserName is null, chatToolRoom:".concat(chatToolRoom));
        b();
        return false;
    }

    public boolean i(java.lang.String chatToolRoomsId, int i17) {
        kotlin.jvm.internal.o.g(chatToolRoomsId, "chatToolRoomsId");
        this.f80460h = "allPage";
        this.f80459g = i17;
        if (chatToolRoomsId.length() > 0) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(chatToolRoomsId), com.tencent.mm.plugin.appbrand.jsapi.chattool.j.class, new com.tencent.mm.plugin.appbrand.jsapi.chattool.s(this));
        } else {
            k(new com.tencent.mm.plugin.appbrand.jsapi.chattool.n(this));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:11:0x0029, B:12:0x008d, B:14:0x0094, B:16:0x0098, B:19:0x00bd, B:20:0x00f5, B:21:0x00f6, B:22:0x0102, B:30:0x006a, B:33:0x007e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f6 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:11:0x0029, B:12:0x008d, B:14:0x0094, B:16:0x0098, B:19:0x00bd, B:20:0x00f5, B:21:0x00f6, B:22:0x0102, B:30:0x006a, B:33:0x007e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.chattool.t.j(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k(java.lang.Runnable runnable) {
        ze.n nVar = this.f80456d;
        if (nVar.J0()) {
            runnable.run();
        } else {
            nVar.I1(runnable);
        }
    }

    public void l() {
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle(e(), this.f80457e), com.tencent.mm.plugin.appbrand.jsapi.chattool.i.class, com.tencent.mm.plugin.appbrand.jsapi.chattool.p.f80432d);
    }

    public void m(java.util.List chatToolRooms) {
        kotlin.jvm.internal.o.g(chatToolRooms, "chatToolRooms");
        java.util.List list = this.f80461i;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(chatToolRooms);
    }

    public final void n(java.util.LinkedList responseList) {
        kotlin.jvm.internal.o.g(responseList, "responseList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = responseList.iterator();
        while (it.hasNext()) {
            r45.dz dzVar = (r45.dz) it.next();
            j91.a aVar = new j91.a(null, null, null, 0, 15, null);
            java.lang.String share_name = dzVar.f372864d;
            kotlin.jvm.internal.o.f(share_name, "share_name");
            aVar.f298343a = share_name;
            java.lang.String opengid = dzVar.f372865e;
            kotlin.jvm.internal.o.f(opengid, "opengid");
            aVar.f298344b = opengid;
            java.lang.String open_single_roomid = dzVar.f372866f;
            kotlin.jvm.internal.o.f(open_single_roomid, "open_single_roomid");
            aVar.f298345c = open_single_roomid;
            arrayList.add(aVar);
        }
        m(arrayList);
    }

    public boolean o(org.json.JSONObject data) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        java.lang.String optString = data.optString("opengid", "");
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() == 0)) {
            java.util.List list = this.f80461i;
            if (!((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((j91.a) obj).f298344b, optString)) {
                        break;
                    }
                }
                j91.a aVar = (j91.a) obj;
                if (aVar == null) {
                    return false;
                }
                if (aVar.f298343a.length() > 0) {
                    java.lang.String userName = aVar.f298343a;
                    java.lang.Object obj2 = new java.lang.Object();
                    kotlin.jvm.internal.o.g(userName, "userName");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(java.lang.System.currentTimeMillis());
                    sb6.append('_');
                    sb6.append(obj2.hashCode());
                    this.f80457e = userName + '-' + sb6.toString() + "-allPage";
                    this.f80458f = userName;
                    c0Var.f310112d = true;
                } else {
                    kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.appbrand.jsapi.chattool.q(c0Var, this, null), 3, null);
                }
                return c0Var.f310112d;
            }
        }
        return false;
    }

    public void p(java.util.List chatToolRooms) {
        kotlin.jvm.internal.o.g(chatToolRooms, "chatToolRooms");
        java.util.List list = this.f80461i;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(chatToolRooms);
    }
}
