package jr0;

/* loaded from: classes12.dex */
public class l extends qi.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f382866a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f382867b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f382868c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f382869d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f382870e;

    /* renamed from: f, reason: collision with root package name */
    public final ri.h0 f382871f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f382872g;

    /* renamed from: h, reason: collision with root package name */
    public jr0.j f382873h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f382874i;

    public l(android.content.Context context, java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Long l18) {
        super(context);
        this.f382871f = new ri.h0();
        this.f382872g = new java.util.concurrent.ConcurrentHashMap();
        new java.util.concurrent.ConcurrentLinkedQueue();
        this.f382874i = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f382866a = context;
        this.f382867b = l17;
        this.f382868c = str;
        this.f382869d = bool.booleanValue();
        this.f382870e = l18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p849xbf8d97c1.e0.f150243a;
        intentFilter.addAction("ENABLE_FPS");
        intentFilter.addAction("MODIFY_EVIL_THRESHOLD");
        intentFilter.addAction("ENABLE_METHOD_BEAT");
        intentFilter.addAction("ENABLE_ANR");
        intentFilter.addAction("ENABLE_START_UP");
        intentFilter.addAction("ENABLE_EVIL_METHOD");
        intentFilter.addAction("ENABLE_FPS_FLOAT");
        intentFilter.addAction("ENABLE_DEV_LOG");
        com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64 c10887x707c7a64 = new com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64();
        try {
            if (fp.h.a(33)) {
                context.registerReceiver(c10887x707c7a64, intentFilter, com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64.f150377a, null);
            } else {
                context.registerReceiver(c10887x707c7a64, intentFilter, com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64.f150377a, null, 4);
            }
        } catch (java.lang.Throwable unused) {
            context.unregisterReceiver(c10887x707c7a64);
            if (fp.h.a(33)) {
                context.registerReceiver(c10887x707c7a64, intentFilter, com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64.f150377a, null);
            } else {
                context.registerReceiver(c10887x707c7a64, intentFilter, com.p314xaae8f345.mm.p849xbf8d97c1.p856x6a8fa373.C10887x707c7a64.f150377a, null, 4);
            }
        }
    }

    @Override // qi.a, qi.c
    public void a(ri.d0 d0Var) {
        jr0.i iVar = new jr0.i();
        iVar.f477395d = d0Var.f477395d;
        iVar.f477393b = d0Var.f477393b;
        qi.b bVar = d0Var.f477396e;
        iVar.f477396e = bVar;
        iVar.f477394c = d0Var.f477394c;
        iVar.f477392a = d0Var.f477392a;
        if (bVar instanceof dj.b) {
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f382874i;
            concurrentLinkedDeque.addFirst(iVar);
            if (concurrentLinkedDeque.size() >= 30) {
                concurrentLinkedDeque.removeLast();
            }
        }
        try {
            jr0.j jVar = this.f382873h;
            if (jVar != null && ((jr0.h) jVar).a(iVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MatrixReporter", "[reportJson] pass this report! tag=%s", iVar.f477393b);
                return;
            }
            jr0.k kVar = (jr0.k) this.f382872g.get(iVar.f477396e);
            if (kVar != null) {
                kVar.a(iVar);
            }
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    e(iVar, null);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.setAction("action.matrix.deprecated-report");
                intent.putExtra("tag", iVar.f477393b);
                intent.putExtra("key", iVar.f477394c);
                intent.putExtra("type", iVar.f477392a);
                intent.putExtra("value", iVar.f477395d.toString());
                intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, (java.lang.String) null);
                oj.j.c("MicroMsg.MatrixReporter", "Matrix report with broadcast tag:%s", iVar.f477393b);
                this.f382866a.sendBroadcast(intent);
            } catch (java.lang.Throwable th6) {
                oj.j.b("MicroMsg.MatrixReporter", "Matrix report occur error:" + th6, new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MatrixReporter", e17, "", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x05fc A[Catch: Exception -> 0x0632, TryCatch #3 {Exception -> 0x0632, blocks: (B:41:0x05fc, B:43:0x0606, B:45:0x060f, B:49:0x0618, B:87:0x0461, B:89:0x0486, B:90:0x0489, B:92:0x04a6, B:93:0x04c2, B:95:0x04df, B:96:0x04fb, B:98:0x0518, B:99:0x0534, B:101:0x0551, B:102:0x056d, B:104:0x058a, B:105:0x05a6, B:182:0x05b7, B:184:0x05c2, B:186:0x05e4), top: B:17:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(ri.d0 r42, java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jr0.l.e(ri.d0, java.lang.String):void");
    }

    /* renamed from: toString */
    public java.lang.String m141252x9616526c() {
        return "clientVersion=" + this.f382867b + " revision=" + this.f382868c + " isDebug=" + this.f382869d + " publishType" + this.f382870e;
    }
}
