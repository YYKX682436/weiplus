package h34;

/* loaded from: classes15.dex */
public class a0 extends c34.z {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f360010h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f360011i;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f360012e;

    /* renamed from: f, reason: collision with root package name */
    public final h34.f f360013f;

    /* renamed from: g, reason: collision with root package name */
    public long f360014g;

    public a0(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f360013f = new h34.f();
        this.f360012e = context;
        f360011i = false;
    }

    @Override // c34.z
    public void a() {
        this.f119780d = null;
        this.f360013f.c();
        if (f360011i) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f360014g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(10987, 1, "", 2, java.lang.Integer.valueOf((int) currentTimeMillis));
            g0Var.C(835L, 1L, 1L);
            f360011i = false;
        }
    }

    @Override // c34.z
    public void b() {
        boolean z17;
        if (f360010h) {
            return;
        }
        h34.f fVar = this.f360013f;
        synchronized (fVar.f360045n) {
            if (!fVar.f360052u) {
                int m93507xc8b1ab0a = com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93507xc8b1ab0a();
                if (m93507xc8b1ab0a >= 0) {
                    fVar.f360052u = true;
                }
                z17 = m93507xc8b1ab0a >= 0;
            }
        }
        if (z17) {
            f360010h = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
        }
    }

    @Override // c34.z
    public void c() {
    }

    @Override // c34.z
    public void d() {
    }

    @Override // c34.z
    public void e() {
        if (this.f119780d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.ShakeTVService", "shakeGetListener == null");
            return;
        }
        if (!(this.f360012e instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Micromsg.ShakeTVService", "context not an Activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) this.f119780d).a7(new java.util.ArrayList(), 0L);
            return;
        }
        f360011i = true;
        this.f360014g = java.lang.System.currentTimeMillis();
        h34.f fVar = this.f360013f;
        h34.s sVar = new h34.s() { // from class: h34.a0$$a
            /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0167. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:121:0x033e  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x04a0  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0519  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x05ab  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x05d8  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0189  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0228  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x02be  */
            @Override // h34.s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(r45.js5 r27, long r28, boolean r30) {
                /*
                    Method dump skipped, instructions count: 1650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: h34.C28438x56d4592.a(r45.js5, long, boolean):void");
            }
        };
        fVar.c();
        synchronized (fVar.f360045n) {
            fVar.f360051t = com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93506x7210bb1c();
        }
        synchronized (fVar.f360045n) {
            if (!fVar.f360052u) {
                if (com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93507xc8b1ab0a() >= 0) {
                    fVar.f360052u = true;
                }
            }
        }
        fVar.f360042h = 408;
        fVar.f360046o = sVar;
        fVar.f360049r = false;
        fVar.f360048q = false;
        fVar.f360043i = false;
        fVar.f360055x = false;
        c01.d9.e().a(367, fVar);
        c01.d9.e().a(408, fVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.f360050s = (int) java.lang.System.currentTimeMillis();
        tl.w wVar = new tl.w(8000, 1, 4);
        fVar.f360047p = wVar;
        wVar.f501693m = -19;
        wVar.f501705y = fVar.f360056y;
        if (wVar.k()) {
            synchronized (fVar.f360045n) {
                int m93511x4dfe9695 = com.p314xaae8f345.p2890x4f7fd00.C25301x6ac8ff91.m93511x4dfe9695();
                if (m93511x4dfe9695 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicFingerPrintRecorder", "init failed QAFPReset:%d clientid:%d", java.lang.Integer.valueOf(m93511x4dfe9695), java.lang.Integer.valueOf(fVar.f360050s));
                    fVar.b();
                } else {
                    fVar.f360041g = java.lang.System.currentTimeMillis();
                    fVar.f360053v = java.lang.System.currentTimeMillis();
                    fVar.f360054w = 0;
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicFingerPrintRecorder", "start record failed");
            fVar.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(835L, 5L, 1L);
    }

    public final void f(java.util.List list, long j17) {
        c34.x xVar = this.f119780d;
        if (xVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar).a7(list, j17);
        }
    }
}
