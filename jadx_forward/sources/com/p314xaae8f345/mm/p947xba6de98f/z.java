package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public final class z extends jm0.g {

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f152707n = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.d.f152434d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f152708f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f152709g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f152710h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f152711i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f152712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f152708f = jz5.h.b(new com.p314xaae8f345.mm.p947xba6de98f.y(service));
        this.f152710h = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.f.f152469d);
        this.f152711i = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.u.f152672d);
        this.f152712m = jz5.h.b(com.p314xaae8f345.mm.p947xba6de98f.v.f152679d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.p314xaae8f345.mm.p947xba6de98f.z r17, java.util.concurrent.ConcurrentHashMap r18, dn.m r19, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 r20) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p947xba6de98f.z.T6(com.tencent.mm.modelcdntran.z, java.util.concurrent.ConcurrentHashMap, dn.m, kotlinx.coroutines.flow.i2):void");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", "onAccountInit");
        com.p314xaae8f345.mm.p947xba6de98f.s1.cj().f152588s.m127126x9d92d11c(this.f381800d, new com.p314xaae8f345.mm.p947xba6de98f.p(this));
        this.f152709g = true;
        b7(1);
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p947xba6de98f.q(this), 1000L);
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 U6(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(3, 0, null, 6, null);
        c7(new com.p314xaae8f345.mm.p947xba6de98f.h(this, mediaId, b17, null));
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }

    public int V6(java.lang.String mediaId, com.p314xaae8f345.mm.p947xba6de98f.e runningObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningObj, "runningObj");
        boolean z17 = runningObj.f152460a.f323319e;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = runningObj.f152461b;
        if (z17) {
            com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(mediaId);
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = new com.p314xaae8f345.mm.p947xba6de98f.n1(com.p314xaae8f345.mm.p947xba6de98f.m1.f152623v, mediaId);
            n1Var.f152638c = 0;
            W6(i2Var, n1Var);
        } else {
            com.p314xaae8f345.mm.p947xba6de98f.s1.cj().getClass();
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(mediaId);
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var2 = new com.p314xaae8f345.mm.p947xba6de98f.n1(com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q, mediaId);
            n1Var2.f152638c = 0;
            W6(i2Var, n1Var2);
        }
        return 0;
    }

    public final void W6(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        v65.i.b(a7(), null, new com.p314xaae8f345.mm.p947xba6de98f.k(i2Var, n1Var, null), 1, null);
    }

    public final java.util.concurrent.ConcurrentLinkedDeque X6() {
        return (java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) this.f152710h).mo141623x754a37bb();
    }

    public final java.util.concurrent.ConcurrentHashMap Y6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f152711i).mo141623x754a37bb();
    }

    public final java.util.concurrent.ConcurrentHashMap Z6() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f152712m).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a a7() {
        return (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f152708f).mo141623x754a37bb();
    }

    public final boolean b7(int i17) {
        if (!(!X6().isEmpty())) {
            return false;
        }
        v65.i.b(a7(), null, new com.p314xaae8f345.mm.p947xba6de98f.s(this, i17, null), 1, null);
        return true;
    }

    public final void c7(yz5.p pVar) {
        if (!this.f152709g) {
            v65.i.b(a7(), null, new com.p314xaae8f345.mm.p947xba6de98f.t(this, pVar, null), 1, null);
        } else {
            b7(3);
            v65.i.b(a7(), null, pVar, 1, null);
        }
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 d7(dn.m task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(3, 0, null, 6, null);
        java.lang.String str = task.f69601xaca5bdda;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = com.p314xaae8f345.mm.p947xba6de98f.m1.f152614m;
            java.lang.String str2 = task.f69601xaca5bdda;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = new com.p314xaae8f345.mm.p947xba6de98f.n1(m1Var, str2);
            n1Var.f152639d = task;
            W6(b17, n1Var);
            return b17;
        }
        java.lang.String log = "startDownloadTask " + task.f69601xaca5bdda + ' ' + Y6().size();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", log);
        task.f323319e = false;
        c7(new com.p314xaae8f345.mm.p947xba6de98f.w(this, task, b17, null));
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 e7(dn.m task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(3, 0, null, 6, null);
        java.lang.String str = task.f69601xaca5bdda;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = com.p314xaae8f345.mm.p947xba6de98f.m1.f152619r;
            java.lang.String str2 = task.f69601xaca5bdda;
            if (str2 == null) {
                str2 = "";
            }
            com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = new com.p314xaae8f345.mm.p947xba6de98f.n1(m1Var, str2);
            n1Var.f152639d = task;
            W6(b17, n1Var);
            return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
        }
        java.lang.String log = "startUploadTask " + task.f69601xaca5bdda + ' ' + Y6().size();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cdn.CdnFSC", log);
        task.f323319e = true;
        c7(new com.p314xaae8f345.mm.p947xba6de98f.x(this, task, b17, null));
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }
}
