package s52;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static volatile s52.b f484692h;

    /* renamed from: b, reason: collision with root package name */
    public e42.i0 f484694b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f484697e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f484698f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f484699g = true;

    /* renamed from: a, reason: collision with root package name */
    public final s52.a f484693a = new s52.a();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f484695c = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f484696d = new java.util.concurrent.CopyOnWriteArrayList();

    public static s52.b d() {
        if (f484692h == null) {
            synchronized (s52.b.class) {
                if (f484692h == null) {
                    f484692h = new s52.b();
                }
            }
        }
        return f484692h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01de, code lost:
    
        if ("com.tencent.mm.plugin.sns.ui.SnsUploadUI".equals(r1) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(int r19, java.lang.String r20, int r21, long r22) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.f(int, java.lang.String, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r12 == r3.intValue()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.a(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r24, int r25, long r26) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.b(java.lang.String, int, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d7, code lost:
    
        if (r13 == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r17, int r18, long r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s52.b.c(java.lang.String, int, long):void");
    }

    public final nm5.c e(java.lang.String str, int i17) {
        r45.b2 e17;
        f52.c b17 = f52.c.b();
        try {
            nm5.b d17 = b17.d();
            nm5.b c17 = b17.c();
            if (str == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: illeagal Event");
                return null;
            }
            java.lang.String str2 = (java.lang.String) d17.a(0);
            if ("com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI".equals(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFakeSwitchAccountUI true");
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: Resume: %s, Pause: %s, Stop: %s", d17, c17, str);
            java.lang.Integer num = (java.lang.Integer) d17.a(1);
            java.lang.Integer num2 = (java.lang.Integer) c17.a(1);
            boolean z17 = (str.equals(str2) && str.equals(c17.a(0))) && (num != null && num2 != null && i17 == num.intValue() && i17 == num2.intValue());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop, case-1：%b", java.lang.Boolean.valueOf(z17));
            if (z17 && !"com.tencent.mm.plugin.voip.ui.VideoActivity".equals(str) && !"com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity".equals(str) && (e17 = b17.e()) != null) {
                r45.bn6 bn6Var = e17.f451967d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8: %s, %s", bn6Var.f452433d, java.lang.Integer.valueOf(bn6Var.f452434e));
                if (e17.f451967d.f452433d.startsWith("com.tencent.mm")) {
                    r45.bn6 bn6Var2 = e17.f451967d;
                    if (bn6Var2.f452434e <= 0 && !bn6Var2.f452433d.equals(str)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop isEvent8-1: false");
                        z17 = false;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop: NOT wx activity");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellFrontBackMonitor", "isFront2BackOnStop case1 && case2：%b", java.lang.Boolean.valueOf(z17));
            return nm5.j.d(str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellFrontBackMonitor", e18, "isFront2BackOnStop", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(932L, 43L, 1L, false);
            return null;
        }
    }

    public void g(int i17) {
        s52.a aVar = this.f484693a;
        r45.i53 a17 = aVar.a();
        if (a17 == null) {
            a17 = new r45.i53();
        }
        a17.f458273d = i17;
        aVar.b(a17);
    }
}
