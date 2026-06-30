package xc5;

/* loaded from: classes12.dex */
public final class l extends lf3.n implements qf3.b, qf3.c, xg3.h0 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile boolean f535053q;

    /* renamed from: r, reason: collision with root package name */
    public static volatile java.util.Set f535054r;

    /* renamed from: d, reason: collision with root package name */
    public final mf3.f f535055d;

    /* renamed from: e, reason: collision with root package name */
    public qf3.a f535056e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f535057f;

    /* renamed from: g, reason: collision with root package name */
    public long[] f535058g;

    /* renamed from: h, reason: collision with root package name */
    public int f535059h;

    /* renamed from: i, reason: collision with root package name */
    public int f535060i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f535061m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f535062n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f535063o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Set f535064p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f535055d = new mf3.f();
        this.f535057f = "";
        this.f535058g = new long[0];
        this.f535064p = new java.util.LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V6(xc5.l r16, int r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.l.V6(xc5.l, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final mf3.k W6(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (msgInfo.m78014x7b98c171() || msgInfo.mo78013xfb85f7b0() == 43) {
            return new xc5.t2(msgInfo);
        }
        wh5.f fVar = wh5.f.f527585a;
        if (fVar.a() && msgInfo.J2() && !fVar.b(msgInfo)) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = msgInfo.j();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (j17 == null) {
                j17 = "";
            }
            dVar.m126728xdc93280d(j17);
            r3 = xs.l1.b(dVar, msgInfo.A0() == 1);
        }
        if (!r3) {
            return new xc5.i0(msgInfo);
        }
        mf3.k kVar = null;
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(msgInfo.Q0(), msgInfo.m124847x74d37ac6());
            if (T1 == null || T1.f404166a != msgInfo.m124847x74d37ac6()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ChatLiveMediaInfo imgInfo query failed, msgId=");
                sb6.append(msgInfo.m124847x74d37ac6());
                sb6.append(" imgInfo=");
                sb6.append(T1);
                sb6.append(" localId=");
                sb6.append(T1 != null ? java.lang.Long.valueOf(T1.f404166a) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryMediaInfoFactory", sb6.toString());
            } else {
                kVar = wh5.h0.f527601a.a(msgInfo, T1);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "tryCreateChatLiveMediaInfo failed: " + e17.getMessage());
        }
        if (kVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "create ChatLiveMediaInfo, msgId=" + msgInfo.m124847x74d37ac6());
            return kVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryMediaInfoFactory", "create LiveMsgHistoryGalleryMediaInfo fallback, msgId=" + msgInfo.m124847x74d37ac6());
        return new xc5.z0(msgInfo);
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        long[] longArrayExtra = intent.getLongArrayExtra("key_msg_history_gallery_msg_id_list");
        long longExtra = intent.getLongExtra("img_gallery_msg_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("img_gallery_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch, talker=");
        sb6.append(stringExtra);
        sb6.append(" currentMsgId=");
        sb6.append(longExtra);
        sb6.append(" msgIdListSize=");
        sb6.append(longArrayExtra != null ? longArrayExtra.length : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHistoryGalleryDataProvider", sb6.toString());
        if (longArrayExtra != null) {
            if (!(longArrayExtra.length == 0)) {
                if (!(stringExtra.length() == 0)) {
                    this.f535056e = listener;
                    this.f535057f = stringExtra;
                    this.f535058g = longArrayExtra;
                    mf3.f fVar = this.f535055d;
                    fVar.clear();
                    this.f535059h = 0;
                    this.f535060i = 0;
                    this.f535061m = false;
                    this.f535062n = false;
                    this.f535063o = false;
                    java.util.Set set = this.f535064p;
                    set.clear();
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(kz5.z.W(this.f535058g, longExtra));
                    if (!(valueOf.intValue() >= 0)) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : 0;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(this.f535057f, this.f535058g[intValue]);
                    if (k17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryDataProvider", "fetch failed, anchor msg not found, msgId=" + longExtra);
                        return false;
                    }
                    fVar.add(W6(k17));
                    this.f535059h = intValue;
                    this.f535060i = intValue + 1;
                    set.add(java.lang.Long.valueOf(longExtra));
                    java.lang.String valueOf2 = java.lang.String.valueOf(longExtra);
                    lf3.c0 c0Var = (lf3.c0) listener;
                    c0Var.Y6(valueOf2);
                    c0Var.X6(fVar, false);
                    listener.T3(0);
                    com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
                    if (O6 != null) {
                        v65.i.b(O6, null, new xc5.g(this, intValue, null), 1, null);
                    }
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
                    return true;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryDataProvider", "fetch failed, msgIdList is null/empty or talker is empty");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0064, code lost:
    
        if ((r3 != null && r3.P2()) != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0026 A[SYNTHETIC] */
    @Override // xg3.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(xg3.m0 r19, xg3.l0 r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.l.c0(xg3.m0, xg3.l0):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        if (!this.f535064p.isEmpty()) {
            f535054r = kz5.n0.X0(this.f535064p);
        }
        this.f535056e = null;
        this.f535055d.clear();
        this.f535058g = new long[0];
        this.f535064p.clear();
        this.f535061m = false;
        this.f535062n = false;
        this.f535063o = false;
    }
}
