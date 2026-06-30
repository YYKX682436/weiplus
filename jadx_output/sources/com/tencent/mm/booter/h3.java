package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class h3 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.booter.h3 f63379q = new com.tencent.mm.booter.h3();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.j3 f63380a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f63381b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f63382c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f63383d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.booter.g3 f63384e;

    /* renamed from: f, reason: collision with root package name */
    public int f63385f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f63386g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f63387h;

    /* renamed from: i, reason: collision with root package name */
    public long f63388i;

    /* renamed from: j, reason: collision with root package name */
    public long f63389j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f63390k;

    /* renamed from: l, reason: collision with root package name */
    public long f63391l;

    /* renamed from: m, reason: collision with root package name */
    public final int f63392m;

    /* renamed from: n, reason: collision with root package name */
    public final int f63393n;

    /* renamed from: o, reason: collision with root package name */
    public final int f63394o;

    /* renamed from: p, reason: collision with root package name */
    public final int f63395p;

    public h3() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f63381b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SendOutMsgEvent>(a0Var) { // from class: com.tencent.mm.booter.StayTimeReport$1
            {
                this.__eventId = 1245546543;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SendOutMsgEvent sendOutMsgEvent) {
                com.tencent.mm.autogen.events.SendOutMsgEvent sendOutMsgEvent2 = sendOutMsgEvent;
                if (!(sendOutMsgEvent2 instanceof com.tencent.mm.autogen.events.SendOutMsgEvent)) {
                    return false;
                }
                com.tencent.mm.storage.f9 f9Var = sendOutMsgEvent2.f54756g.f7743a;
                com.tencent.mm.booter.h3 h3Var = com.tencent.mm.booter.h3.this;
                if (h3Var.f63384e == null) {
                    return false;
                }
                java.util.HashSet hashSet = h3Var.f63386g;
                if (hashSet.contains(java.lang.Long.valueOf(f9Var.getMsgId())) || !h3Var.f63384e.f63364a.equals(f9Var.Q0())) {
                    return false;
                }
                hashSet.add(java.lang.Long.valueOf(f9Var.getMsgId()));
                h3Var.f63384e.f63374k++;
                com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "sendMsg msgType:%d, SendCnt:%d", java.lang.Integer.valueOf(f9Var.getType()), java.lang.Integer.valueOf(h3Var.f63384e.f63374k));
                return false;
            }
        };
        this.f63382c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ReceiveMsgEvent>(a0Var) { // from class: com.tencent.mm.booter.StayTimeReport$2
            {
                this.__eventId = 468947820;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ReceiveMsgEvent receiveMsgEvent) {
                java.lang.String str;
                com.tencent.mm.autogen.events.ReceiveMsgEvent receiveMsgEvent2 = receiveMsgEvent;
                if (!(receiveMsgEvent2 instanceof com.tencent.mm.autogen.events.ReceiveMsgEvent)) {
                    return false;
                }
                com.tencent.mm.storage.f9 f9Var = receiveMsgEvent2.f54654g.f8209a;
                com.tencent.mm.booter.h3 h3Var = com.tencent.mm.booter.h3.this;
                if (h3Var.f63384e == null) {
                    return false;
                }
                java.util.HashSet hashSet = h3Var.f63387h;
                if (hashSet.contains(java.lang.Long.valueOf(f9Var.I0())) || (str = h3Var.f63384e.f63364a) == null || !str.equals(f9Var.Q0())) {
                    return false;
                }
                hashSet.add(java.lang.Long.valueOf(f9Var.I0()));
                h3Var.f63384e.f63373j++;
                com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "receiveMsg msgType:%d, recvCnt:%d", java.lang.Integer.valueOf(f9Var.getType()), java.lang.Integer.valueOf(h3Var.f63384e.f63373j));
                return false;
            }
        };
        this.f63383d = new com.tencent.mm.booter.f3(this);
        this.f63385f = 0;
        this.f63386g = new java.util.HashSet();
        this.f63387h = new java.util.HashSet();
        this.f63391l = -1L;
        this.f63392m = 20;
        this.f63393n = 24;
        this.f63394o = 30;
        this.f63395p = 10800;
        try {
            this.f63380a = new com.tencent.mm.storage.j3(com.tencent.mm.storage.v3.f196273a + "staytime.cfg");
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StayTimeReport", e17, "", new java.lang.Object[0]);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str = com.tencent.mm.storage.v3.f196273a;
            sb6.append(str);
            sb6.append("staytime.cfg");
            com.tencent.mm.vfs.w6.h(sb6.toString());
            this.f63380a = new com.tencent.mm.storage.j3(str + "staytime.cfg");
        }
    }

    public void a(java.lang.String str) {
        com.tencent.mm.booter.g3 g3Var;
        this.f63381b.dead();
        this.f63382c.dead();
        this.f63383d.dead();
        this.f63387h.clear();
        this.f63386g.clear();
        boolean z17 = true;
        if (str == null || (g3Var = this.f63384e) == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = str;
            objArr[1] = java.lang.Boolean.valueOf(this.f63384e == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "exitChattingUI chatUser or reprotingItem is null, chatUser:%s, reportingItem is null:%b", objArr);
            return;
        }
        if (!str.equals(g3Var.f63364a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "exitChattingUI no startedUI: %s, start:", str, this.f63384e.f63364a);
            return;
        }
        com.tencent.mm.booter.g3 g3Var2 = this.f63384e;
        long j17 = g3Var2.f63366c;
        long j18 = this.f63388i;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        g3Var2.f63366c = j17 + ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
        com.tencent.mm.storage.j3 j3Var = this.f63380a;
        j3Var.f(5, ((java.lang.String) j3Var.b(5, "")) + this.f63384e.toString());
        if (this.f63384e == null) {
            return;
        }
        long d17 = j3Var.d(4, 0L);
        int c17 = j3Var.c(6, 0) + 1;
        j3Var.g(6, c17);
        com.tencent.mm.booter.g3 g3Var3 = this.f63384e;
        com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "exitChattingUI, chatUser:%s, type:%d, stayTime:%d, stayWebTime:%d, chattingReportCnt:%d", g3Var3.f63364a, java.lang.Integer.valueOf(g3Var3.f63365b), java.lang.Long.valueOf(this.f63384e.f63366c), java.lang.Integer.valueOf(this.f63384e.f63371h), java.lang.Integer.valueOf(c17));
        com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "exitChattingUI goBackHistoryStatus:%d, recnCnt:%d, sendCnt:%d", java.lang.Integer.valueOf(this.f63384e.f63372i), java.lang.Integer.valueOf(this.f63384e.f63373j), java.lang.Integer.valueOf(this.f63384e.f63374k));
        if (com.tencent.mm.sdk.platformtools.t8.H1(d17) <= this.f63395p && c17 <= this.f63394o) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str2 = ((java.lang.String) j3Var.b(5, "")) + "," + d17 + "," + com.tencent.mm.sdk.platformtools.t8.i1();
            com.tencent.mars.xlog.Log.i("MicroMsg.StayTimeReport", "report （13062） %d: %s", 13062, str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13062, str2);
            j3Var.g(6, 0);
            j3Var.f(5, "");
        }
    }
}
