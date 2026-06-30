package cf5;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final cf5.l f40987a = new cf5.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f40988b = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(cf5.l lVar, java.lang.String str, java.util.Map map) {
        lVar.getClass();
        try {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, map, 38006);
            com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownInteractionReporter", "reportEvent: event=%s, params=%s", str, map);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MarkdownInteractionReporter", e17, "reportEvent failed", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0115, code lost:
    
        if (r7 != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(v11.r r7, v11.s r8, cf5.e r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cf5.l.b(v11.r, v11.s, cf5.e):void");
    }

    public final boolean c(java.util.List list, v11.s sVar) {
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (f40987a.d(((v11.a) it.next()).f432325h, sVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(v11.s sVar, v11.s sVar2) {
        int i17;
        int i18;
        int i19;
        int i27;
        if (sVar == null || (i17 = sVar.f432460c) < 0 || (i18 = sVar.f432461d) < i17 || (i19 = sVar2.f432458a) < 0 || (i27 = sVar2.f432459b) <= i19) {
            return false;
        }
        if (i18 <= i17) {
            i18 = i17 + 1;
        }
        return i19 < i18 && i17 < i27;
    }
}
