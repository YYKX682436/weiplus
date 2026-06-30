package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class k implements com.tencent.mm.plugin.emoji.sync.m {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.sync.e f97634e;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.j f97639j;

    /* renamed from: k, reason: collision with root package name */
    public int f97640k;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f97643n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f97644o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f97630a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f97631b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97632c = false;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.sync.l f97633d = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Vector f97635f = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f97636g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Vector f97637h = new java.util.Vector();

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f97638i = new java.util.HashSet();

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f97641l = {false};

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f97642m = new com.tencent.mm.plugin.emoji.sync.f(this);

    public k(com.tencent.mm.plugin.emoji.sync.e eVar) {
        this.f97640k = -1;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f97643n = new com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2(this, a0Var);
        this.f97644o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EmojiSyncTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$3
            {
                this.__eventId = 1273581380;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent) {
                com.tencent.mm.autogen.events.EmojiSyncTaskEvent emojiSyncTaskEvent2 = emojiSyncTaskEvent;
                if (!(emojiSyncTaskEvent2 instanceof com.tencent.mm.autogen.events.EmojiSyncTaskEvent) || com.tencent.mm.sdk.platformtools.t8.K0(emojiSyncTaskEvent2.f54103g.f7603b)) {
                    return false;
                }
                am.p4 p4Var = emojiSyncTaskEvent2.f54103g;
                com.tencent.mm.plugin.emoji.sync.k.this.d(p4Var.f7603b, p4Var.f7602a, p4Var.f7604c);
                return false;
            }
        };
        this.f97634e = eVar;
        android.os.Process.myUid();
        this.f97640k = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public synchronized void a(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.emoji.sync.l lVar = (com.tencent.mm.plugin.emoji.sync.l) it.next();
                java.util.Iterator it6 = this.f97636g.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    if (com.tencent.mm.sdk.platformtools.t8.D0(lVar.getKey(), ((com.tencent.mm.plugin.emoji.sync.l) it6.next()).getKey())) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    ((java.util.LinkedList) this.f97636g).addAll(list);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "addNoWifiTask: %s", lVar.getKey());
                }
            }
        }
    }

    public synchronized void b(java.util.List list) {
        if (list != null) {
            if (list.size() > 0) {
                int size = list.size();
                for (int i17 = 0; i17 < size; i17++) {
                    com.tencent.mm.plugin.emoji.sync.l lVar = (com.tencent.mm.plugin.emoji.sync.l) list.get(i17);
                    com.tencent.mm.plugin.emoji.sync.l lVar2 = this.f97633d;
                    if (lVar2 != null && lVar2.equals(lVar)) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = lVar == null ? "task is null" : lVar.getKey();
                        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] currentTask equals task is has exist:%s", objArr);
                    } else if (lVar == null || this.f97637h.contains(lVar)) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        objArr2[0] = lVar == null ? "task is null" : lVar.getKey();
                        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is has exist:%s", objArr2);
                    } else {
                        this.f97637h.add(lVar);
                    }
                }
            }
        }
    }

    public void c() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.emoji.sync.g(this));
    }

    public synchronized void d(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] task is finish. key:%s success:%b", str, java.lang.Boolean.valueOf(z17));
        if (this.f97633d != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (this.f97635f.contains(this.f97633d)) {
                this.f97635f.remove(this.f97633d);
            } else if (((java.util.LinkedList) this.f97636g).contains(this.f97633d)) {
                ((java.util.LinkedList) this.f97636g).remove(this.f97633d);
            } else if (this.f97637h.contains(this.f97633d)) {
                this.f97637h.remove(this.f97633d);
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "retry later.");
            } else if (i17 != 2) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.emoji.sync.h(this, i17));
            }
            if (i17 == 2) {
                ((ku5.t0) ku5.t0.f312615d).k(this.f97642m, 3000L);
            } else {
                ((ku5.t0) ku5.t0.f312615d).k(this.f97642m, 1000L);
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BKGLoader.BKGLoaderManager", "CurrentTask or key is null. or key is no equal crrentkey ");
    }

    public synchronized void e() {
        java.util.Vector vector = this.f97635f;
        if (vector != null) {
            vector.clear();
        }
        java.util.Vector vector2 = this.f97637h;
        if (vector2 != null) {
            vector2.clear();
        }
        ((java.util.LinkedList) this.f97636g).clear();
        this.f97631b = false;
        this.f97632c = false;
    }

    public synchronized void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "tryToStart: %s", java.lang.Boolean.valueOf(this.f97630a));
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) && !this.f97630a && this.f97636g.isEmpty()) {
            if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is 3g or 4g]");
                this.f97631b = false;
                this.f97632c = false;
                c();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[dz tryToStart is not wifi, 3g nor 4g]");
            }
        }
        java.util.Vector vector = this.f97635f;
        if (vector == null || vector.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart no task list .");
            java.util.Vector vector2 = this.f97635f;
            if (vector2 == null || vector2.size() <= 0) {
                this.f97631b = false;
            }
            java.util.Vector vector3 = this.f97635f;
            if ((vector3 == null || vector3.size() <= 0) && this.f97631b) {
                this.f97631b = false;
            }
            c();
        } else {
            this.f97631b = true;
            this.f97632c = false;
            com.tencent.mm.plugin.emoji.sync.l lVar = (com.tencent.mm.plugin.emoji.sync.l) this.f97635f.remove(0);
            this.f97633d = lVar;
            lVar.b(this);
            ((com.tencent.mm.plugin.emoji.sync.d) this.f97634e.f97622a).execute(this.f97633d);
            com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart task is ruing. key:%s upload list size:%d", this.f97633d.getKey(), java.lang.Integer.valueOf(this.f97635f.size()));
            c();
        }
        if (!this.f97631b) {
            if (this.f97636g.isEmpty()) {
                java.util.Vector vector4 = this.f97637h;
                if (vector4 == null || vector4.size() <= 0) {
                    this.f97632c = false;
                    this.f97630a = false;
                } else {
                    this.f97632c = true;
                    com.tencent.mm.plugin.emoji.sync.l lVar2 = (com.tencent.mm.plugin.emoji.sync.l) this.f97637h.remove(0);
                    this.f97633d = lVar2;
                    lVar2.b(this);
                    ((com.tencent.mm.plugin.emoji.sync.d) this.f97634e.f97622a).execute(this.f97633d);
                    com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] tryToStart download store emoji task is runing. productID:%s size:%d", this.f97633d.getKey(), java.lang.Integer.valueOf(this.f97637h.size()));
                }
            } else {
                this.f97632c = true;
                com.tencent.mm.plugin.emoji.sync.l lVar3 = (com.tencent.mm.plugin.emoji.sync.l) ((java.util.LinkedList) this.f97636g).remove(0);
                this.f97633d = lVar3;
                lVar3.b(this);
                ((com.tencent.mm.plugin.emoji.sync.d) this.f97634e.f97622a).execute(this.f97633d);
            }
            c();
        }
    }
}
