package lm2;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final lm2.p f400925i = new lm2.p(null);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f400926j = kz5.c0.i(20057, 20034, 20035, 20002);

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f400927a;

    /* renamed from: b, reason: collision with root package name */
    public final lm2.g f400928b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.j0 f400929c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f400930d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.j0 f400931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f400932f;

    /* renamed from: g, reason: collision with root package name */
    public km2.m0 f400933g;

    /* renamed from: h, reason: collision with root package name */
    public km2.m0 f400934h;

    public h0(gk2.e liveBuContext, lm2.g bulletStore) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveBuContext, "liveBuContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bulletStore, "bulletStore");
        this.f400927a = liveBuContext;
        this.f400928b = bulletStore;
        this.f400929c = new p012xc85e97e9.p093xedfae76a.j0(new java.util.concurrent.ConcurrentHashMap());
        this.f400930d = new java.util.concurrent.ConcurrentHashMap();
        this.f400931e = new p012xc85e97e9.p093xedfae76a.j0(new java.util.concurrent.ConcurrentHashMap());
        this.f400932f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(lm2.h0 r32, java.lang.String r33, java.util.List r34, r45.qn r35, lm2.j0 r36, lm2.o r37) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.a(lm2.h0, java.lang.String, java.util.List, r45.qn, lm2.j0, lm2.o):void");
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "boxDebugLog, " + str);
    }

    public final lm2.j0 c() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f400929c.mo3195x754a37bb();
        if (concurrentHashMap == null) {
            return null;
        }
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            return (lm2.j0) ((java.util.Map.Entry) it.next()).getValue();
        }
        return null;
    }

    public final lm2.j0 d(java.lang.String boxId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f400929c.mo3195x754a37bb();
        if (concurrentHashMap != null) {
            return (lm2.j0) concurrentHashMap.get(boxId);
        }
        return null;
    }

    public final long e() {
        return ((mm2.e1) this.f400927a.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r9, boolean r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.f(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r21, r45.qn r22, lm2.j0 r23, r45.ch1 r24, lm2.o r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.g(java.lang.String, r45.qn, lm2.j0, r45.ch1, lm2.o, boolean):boolean");
    }

    public final boolean h(r45.ch1 updateInfo) {
        lm2.j0 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateInfo, "updateInfo");
        r45.qm1 qm1Var = (r45.qm1) updateInfo.m75936x14adae67(8);
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = qm1Var != null ? qm1Var.m75945x2fec8307(1) : null;
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17 || (d17 = d(m75945x2fec8307)) == null) {
            return false;
        }
        return g("selfLike", d17.f400944d, d17, updateInfo, (lm2.o) this.f400930d.get(m75945x2fec8307), true);
    }
}
