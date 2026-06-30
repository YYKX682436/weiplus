package kc2;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f388003a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f388004b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f388005c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f388006d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f388007e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f388008f;

    /* renamed from: g, reason: collision with root package name */
    public int f388009g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f388010h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f388011i;

    public q(kc2.g1 karaInfoManager, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(karaInfoManager, "karaInfoManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f388003a = karaInfoManager;
        this.f388004b = handler;
        this.f388005c = "FinderKaraInfoManager.Business";
        this.f388006d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f388007e = new java.util.concurrent.ConcurrentHashMap();
        this.f388008f = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f388010h = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f388011i = new java.util.concurrent.atomic.AtomicBoolean(false);
        handler.mo50293x3498a0(new kc2.n(this));
    }

    public final int a(java.lang.String tabKey) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabKey, "tabKey");
        java.util.List businessSeq = this.f388008f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(businessSeq, "businessSeq");
        synchronized (businessSeq) {
            java.util.List businessSeq2 = this.f388008f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(businessSeq2, "businessSeq");
            java.util.Iterator it = businessSeq2.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) it.next(), tabKey)) {
                    break;
                }
                i17++;
            }
        }
        return i17;
    }

    public final int b(java.util.List tabKeyList) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabKeyList, "tabKeyList");
        java.util.Iterator it = tabKeyList.iterator();
        do {
            i17 = -1;
            if (!it.hasNext()) {
                return -1;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.util.List businessSeq = this.f388008f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(businessSeq, "businessSeq");
            synchronized (businessSeq) {
                java.util.List businessSeq2 = this.f388008f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(businessSeq2, "businessSeq");
                java.util.Iterator it6 = businessSeq2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) it6.next(), str)) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        } while (i17 < 0);
        return i17;
    }

    public final void c() {
        int i17 = 0;
        if (this.f388006d.compareAndSet(false, true)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f388007e;
            java.util.List businessSeq = this.f388008f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(businessSeq, "businessSeq");
            java.util.List labelBusiness = this.f388010h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(labelBusiness, "labelBusiness");
            e(concurrentHashMap, businessSeq, labelBusiness);
            if (!concurrentHashMap.isEmpty()) {
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
                    kc2.l[] lVarArr = kc2.l.f387985d;
                    if (intValue == 1) {
                        i18++;
                    }
                }
                i17 = i18;
            }
            this.f388009g = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388005c, "init businessCnt=" + this.f388009g + ",businessSeq=" + businessSeq);
        }
    }

    public final int d(boolean z17) {
        if (z17) {
            kc2.l[] lVarArr = kc2.l.f387985d;
            return 1;
        }
        kc2.l[] lVarArr2 = kc2.l.f387985d;
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.concurrent.ConcurrentHashMap r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.q.e(java.util.concurrent.ConcurrentHashMap, java.util.List, java.util.List):void");
    }
}
