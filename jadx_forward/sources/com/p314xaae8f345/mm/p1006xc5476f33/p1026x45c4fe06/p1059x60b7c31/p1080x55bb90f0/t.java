package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes7.dex */
public final class t implements j91.d {

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f161989d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f161990e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f161991f;

    /* renamed from: g, reason: collision with root package name */
    public int f161992g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f161993h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f161994i;

    public t(ze.n runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f161989d = runtime;
        this.f161990e = "";
        this.f161991f = "";
        this.f161992g = -1;
        this.f161993h = "";
        this.f161994i = new java.util.ArrayList();
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        try {
            if (this.f161992g < 0) {
                return "";
            }
            if (g()) {
                str2 = (java.lang.String) r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null).get(0);
            } else {
                java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
                java.lang.String str3 = this.f161989d.u0().f128815y0;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, f07.get(0))) {
                    str2 = (java.lang.String) f07.get(1);
                } else {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, f07.get(1))) {
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatToolService", "exitChatToolAllPage");
            m(new java.util.ArrayList());
            this.f161992g = -1;
            k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.k(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatToolService", "exitChatTool currentChatToolRoom:" + this.f161990e);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f161990e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatToolService", "exitChatTool ignore.");
            return;
        }
        this.f161990e = "";
        this.f161991f = "";
        this.f161992g = -1;
        k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.l(this));
    }

    public synchronized java.lang.String c() {
        java.lang.String chatToolMode;
        java.lang.String str;
        synchronized (this) {
            chatToolMode = this.f161993h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
        }
        return str;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "subpackage") && !f()) {
            str = "";
            return str;
        }
        str = this.f161990e;
        return str;
    }

    public synchronized java.lang.String d() {
        return this.f161991f;
    }

    public java.util.ArrayList e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f()) {
            java.util.Iterator it = ((java.util.ArrayList) this.f161994i).iterator();
            while (it.hasNext()) {
                j91.a aVar = (j91.a) it.next();
                if (!(aVar.f379876a.length() == 0)) {
                    arrayList.add(aVar.f379876a);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean f() {
        java.lang.String chatToolMode;
        chatToolMode = this.f161993h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "allPage");
    }

    public boolean g() {
        if (!f()) {
            int i17 = this.f161992g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.e[] eVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.e.f161915d;
            if (i17 != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.e[] eVarArr2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.e.f161915d;
                if (i17 != 4) {
                    return false;
                }
            }
        }
        return true;
    }

    public synchronized boolean h(java.lang.String chatToolMode, int i17, java.lang.String chatToolRoom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolRoom, "chatToolRoom");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatToolService", "openChatTool chatToolMode:" + chatToolMode + " chatType:" + i17 + " userName:" + chatToolRoom + " runtime.service:" + this.f161989d.C0());
        this.f161993h = chatToolMode;
        this.f161992g = i17;
        this.f161990e = chatToolRoom;
        java.lang.String a17 = a(chatToolRoom);
        this.f161991f = a17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.m(this, i17));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatToolService", "openChatTool fail, sendToUserName is null, chatToolRoom:".concat(chatToolRoom));
        b();
        return false;
    }

    public boolean i(java.lang.String chatToolRoomsId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolRoomsId, "chatToolRoomsId");
        this.f161993h = "allPage";
        this.f161992g = i17;
        if (chatToolRoomsId.length() > 0) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(chatToolRoomsId), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.j.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.s(this));
        } else {
            k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.n(this));
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
    public java.lang.Object j(boolean r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t.j(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k(java.lang.Runnable runnable) {
        ze.n nVar = this.f161989d;
        if (nVar.J0()) {
            runnable.run();
        } else {
            nVar.I1(runnable);
        }
    }

    public void l() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12065xe6923e4a(e(), this.f161990e), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.i.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.p.f161965d);
    }

    public void m(java.util.List chatToolRooms) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolRooms, "chatToolRooms");
        java.util.List list = this.f161994i;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(chatToolRooms);
    }

    public final void n(java.util.LinkedList responseList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(responseList, "responseList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = responseList.iterator();
        while (it.hasNext()) {
            r45.dz dzVar = (r45.dz) it.next();
            j91.a aVar = new j91.a(null, null, null, 0, 15, null);
            java.lang.String share_name = dzVar.f454397d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(share_name, "share_name");
            aVar.f379876a = share_name;
            java.lang.String opengid = dzVar.f454398e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(opengid, "opengid");
            aVar.f379877b = opengid;
            java.lang.String open_single_roomid = dzVar.f454399f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(open_single_roomid, "open_single_roomid");
            aVar.f379878c = open_single_roomid;
            arrayList.add(aVar);
        }
        m(arrayList);
    }

    public boolean o(org.json.JSONObject data) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.String optString = data.optString("opengid", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            java.util.List list = this.f161994i;
            if (!((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((j91.a) obj).f379877b, optString)) {
                        break;
                    }
                }
                j91.a aVar = (j91.a) obj;
                if (aVar == null) {
                    return false;
                }
                if (aVar.f379876a.length() > 0) {
                    java.lang.String userName = aVar.f379876a;
                    java.lang.Object obj2 = new java.lang.Object();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(java.lang.System.currentTimeMillis());
                    sb6.append('_');
                    sb6.append(obj2.hashCode());
                    this.f161990e = userName + '-' + sb6.toString() + "-allPage";
                    this.f161991f = userName;
                    c0Var.f391645d = true;
                } else {
                    p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.q(c0Var, this, null), 3, null);
                }
                return c0Var.f391645d;
            }
        }
        return false;
    }

    public void p(java.util.List chatToolRooms) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolRooms, "chatToolRooms");
        java.util.List list = this.f161994i;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(chatToolRooms);
    }
}
