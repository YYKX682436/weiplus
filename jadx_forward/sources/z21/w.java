package z21;

/* loaded from: classes12.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.u0, z21.e {
    public static final java.lang.String L;
    public static final java.lang.String M;
    public static int N;
    public z21.j0 A;
    public java.lang.String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public z21.d I;

    /* renamed from: J, reason: collision with root package name */
    public final tl.v f551213J;
    public byte[] K;

    /* renamed from: d, reason: collision with root package name */
    public int f551214d;

    /* renamed from: e, reason: collision with root package name */
    public int f551215e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f551216f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f551217g;

    /* renamed from: h, reason: collision with root package name */
    public int f551218h;

    /* renamed from: i, reason: collision with root package name */
    public final int f551219i;

    /* renamed from: m, reason: collision with root package name */
    public int f551220m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f551221n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f551222o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f551223p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f551224q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f551225r;

    /* renamed from: s, reason: collision with root package name */
    public int f551226s;

    /* renamed from: t, reason: collision with root package name */
    public z21.b f551227t;

    /* renamed from: u, reason: collision with root package name */
    public e70.a0 f551228u;

    /* renamed from: v, reason: collision with root package name */
    public tl.w f551229v;

    /* renamed from: w, reason: collision with root package name */
    public f25.m0 f551230w;

    /* renamed from: x, reason: collision with root package name */
    public yl.b f551231x;

    /* renamed from: y, reason: collision with root package name */
    public yl.b f551232y;

    /* renamed from: z, reason: collision with root package name */
    public z21.a f551233z;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a;
        sb6.append(str);
        sb6.append("voice_temp.silk");
        L = sb6.toString();
        M = str + "voice_temp.opus";
        N = 5000;
    }

    public w() {
        this.f551214d = 0;
        this.f551215e = 0;
        this.f551216f = false;
        this.f551217g = false;
        this.f551218h = 0;
        this.f551219i = 0;
        this.f551220m = 0;
        this.f551221n = "";
        this.f551222o = "";
        this.f551223p = "";
        this.f551224q = "";
        this.f551225r = false;
        this.f551226s = 1;
        this.f551227t = null;
        this.f551228u = null;
        this.f551233z = null;
        this.B = "0";
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = null;
        this.f551213J = new z21.r(this);
    }

    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "error localCode = %s,errType = %s,errCode = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        z21.b bVar = this.f551227t;
        if (bVar != null) {
            bVar.e(i17, i18, i19, -1L);
        }
        d(false, true);
    }

    public final java.lang.String b() {
        return this.E ? M : L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r13 = this;
            boolean r0 = r13.F
            if (r0 == 0) goto Lbe
            boolean r0 = r13.C
            r1 = 0
            if (r0 == 0) goto L19
            z21.j0 r0 = r13.A
            if (r0 == 0) goto L16
            java.lang.String r0 = r0.f551163m
            if (r0 == 0) goto L16
            int r0 = r0.length()
            goto L17
        L16:
            r0 = r1
        L17:
            r9 = r0
            goto L3c
        L19:
            z21.a r0 = r13.f551233z
            boolean r2 = r0 instanceof z21.h
            if (r2 == 0) goto L3b
            z21.h r0 = (z21.h) r0     // Catch: java.lang.Exception -> L31
            java.lang.String[] r0 = r0.f551128z     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L3b
            int r2 = r0.length     // Catch: java.lang.Exception -> L31
            if (r2 <= 0) goto L3b
            r0 = r0[r1]     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L3b
            int r0 = r0.length()     // Catch: java.lang.Exception -> L31
            goto L17
        L31:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "MicroMsg.SceneVoiceInputAddr"
            java.lang.String r4 = "getResUser failed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r2)
        L3b:
            r9 = r1
        L3c:
            tl.w r0 = r13.f551229v
            if (r0 == 0) goto L43
            long r2 = r0.f501696p
            goto L45
        L43:
            r2 = 0
        L45:
            r11 = r2
            b31.l r2 = b31.l.f99146a
            int r6 = r13.f551219i
            java.lang.String r0 = r13.B
            int r10 = r13.f551220m
            java.lang.String r3 = "userName"
            java.lang.String r7 = r13.f551221n
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r3)
            java.lang.String r3 = "voiceId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r4, r5, r8}
            java.lang.String r4 = "MicroMsg.VoiceInputReporter"
            java.lang.String r5 = "reportStopVoiceInput startScene:%s, voiceId:%s, textCount:%s, recordLength:%s, stopType:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            b31.l.f99151f = r7
            b31.l.f99152g = r0
            b31.l.f99153h = r6
            b31.l.f99154i = r11
            java.util.ArrayList r3 = b31.l.f99149d
            r3.add(r0)
            java.util.ArrayList r3 = b31.l.f99150e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.add(r4)
            b31.e r3 = new b31.e
            r5 = r3
            r8 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.util.concurrent.ConcurrentHashMap r4 = b31.l.f99148c
            java.lang.Object r4 = r4.remove(r0)
            long[] r4 = (long[]) r4
            if (r4 == 0) goto La9
            r0 = r4[r1]
            r5 = 1
            r6 = r4[r5]
            r4 = r0
            r2.d(r3, r4, r6)
            goto Lbe
        La9:
            java.util.concurrent.ConcurrentHashMap r2 = b31.l.f99147b
            r2.put(r0, r3)
            java.lang.String r2 = "VoiceInputReporter.pendingStop#"
            java.lang.String r2 = r2.concat(r0)
            b31.i r3 = new b31.i
            r3.<init>(r0)
            r4 = 3000(0xbb8, double:1.482E-320)
            pm0.v.P(r2, r1, r3, r4)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.w.c():void");
    }

    @Override // z21.e
    /* renamed from: cancel */
    public void mo48278xae7a2e7a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "cancel fromUI = %s", java.lang.Boolean.valueOf(z17));
        this.f551227t = null;
        d(false, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x0129, TryCatch #2 {, blocks: (B:5:0x0016, B:7:0x001d, B:9:0x002b, B:11:0x003c, B:12:0x0040, B:13:0x0042, B:15:0x0049, B:16:0x004c, B:18:0x0050, B:19:0x0055, B:21:0x0059, B:22:0x005e, B:24:0x0070, B:26:0x0074, B:28:0x0076, B:31:0x007b, B:33:0x00bc, B:36:0x00c1, B:38:0x00c5, B:41:0x00db, B:42:0x011d, B:43:0x0125, B:46:0x00df, B:48:0x00e3, B:50:0x00e7, B:53:0x00fd, B:54:0x010d, B:57:0x011a, B:59:0x0105, B:60:0x0127, B:62:0x0089, B:64:0x008d, B:66:0x0091, B:68:0x0094, B:70:0x00a0, B:71:0x00a6, B:72:0x00ab, B:74:0x00ad), top: B:4:0x0016, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df A[Catch: all -> 0x0129, TryCatch #2 {, blocks: (B:5:0x0016, B:7:0x001d, B:9:0x002b, B:11:0x003c, B:12:0x0040, B:13:0x0042, B:15:0x0049, B:16:0x004c, B:18:0x0050, B:19:0x0055, B:21:0x0059, B:22:0x005e, B:24:0x0070, B:26:0x0074, B:28:0x0076, B:31:0x007b, B:33:0x00bc, B:36:0x00c1, B:38:0x00c5, B:41:0x00db, B:42:0x011d, B:43:0x0125, B:46:0x00df, B:48:0x00e3, B:50:0x00e7, B:53:0x00fd, B:54:0x010d, B:57:0x011a, B:59:0x0105, B:60:0x0127, B:62:0x0089, B:64:0x008d, B:66:0x0091, B:68:0x0094, B:70:0x00a0, B:71:0x00a6, B:72:0x00ab, B:74:0x00ad), top: B:4:0x0016, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.w.d(boolean, boolean):void");
    }

    public void e(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "setStopType stopType = %s", java.lang.Integer.valueOf(i17));
        this.f551220m = i17;
    }

    public void f(boolean z17, boolean z18, z21.d dVar) {
        this.G = z17;
        this.H = z18;
        this.I = dVar;
    }

    @Override // z21.e
    /* renamed from: getMaxAmplitudeRate */
    public int mo48281x67ad3875() {
        int i17 = this.f551214d;
        this.f551214d = 0;
        if (i17 > N) {
            N = i17;
        }
        return (i17 * 100) / N;
    }

    @Override // z21.e
    /* renamed from: init */
    public void mo48283x316510(int i17, int i18, z21.b bVar) {
        this.f551226s = i17;
        this.f551227t = bVar;
        this.f551218h = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r16, int r17, java.lang.String r18, com.p314xaae8f345.mm.p944x882e457a.m1 r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.w.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // z21.e
    /* renamed from: setVadSAndNRation */
    public void mo48293x799cc6f6(float f17) {
    }

    @Override // z21.e
    /* renamed from: start */
    public void mo48297x68ac462(java.lang.String str) {
        this.f551224q = str;
        mo48296x68ac462();
    }

    @Override // z21.e
    /* renamed from: stop */
    public void mo48299x360802(boolean z17) {
        z21.b bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "stop fromUI = %s", java.lang.Boolean.valueOf(z17));
        if (!z17 && (bVar = this.f551227t) != null) {
            bVar.g();
        }
        d(true, true);
    }

    @Override // z21.e
    /* renamed from: start */
    public void mo48296x68ac462() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceInputAddr", "start record");
        s75.d.c(new z21.u(this, null), "SceneVoiceInputAddr_record", 10);
    }

    @Override // z21.e
    /* renamed from: init */
    public void mo48284x316510(boolean z17, boolean z18, int i17, int i18, z21.b bVar) {
        this.f551225r = z17;
        this.f551226s = i17;
        this.f551227t = bVar;
        this.f551218h = i18;
    }

    public w(int i17, int i18, z21.b bVar) {
        this.f551214d = 0;
        this.f551215e = 0;
        this.f551216f = false;
        this.f551217g = false;
        this.f551219i = 0;
        this.f551220m = 0;
        this.f551221n = "";
        this.f551222o = "";
        this.f551223p = "";
        this.f551224q = "";
        this.f551225r = false;
        this.f551228u = null;
        this.f551233z = null;
        this.B = "0";
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = null;
        this.f551213J = new z21.r(this);
        this.f551226s = i17;
        this.f551227t = bVar;
        this.f551218h = i18;
    }

    public w(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, e70.a0 a0Var, z21.b bVar) {
        this.f551214d = 0;
        this.f551215e = 0;
        this.f551216f = false;
        this.f551217g = false;
        this.f551219i = 0;
        this.f551220m = 0;
        this.f551221n = "";
        this.f551222o = "";
        this.f551223p = "";
        this.f551224q = "";
        this.f551225r = false;
        this.f551226s = 1;
        this.f551233z = null;
        this.B = "0";
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = null;
        this.f551213J = new z21.r(this);
        this.f551227t = bVar;
        this.f551218h = i17;
        this.f551219i = i18;
        this.f551221n = str;
        this.f551222o = str2;
        this.f551223p = str3;
        this.f551228u = a0Var;
    }
}
