package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1 f295574a = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f295575b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f295576c = new java.util.HashSet();

    public final void a(p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
    }

    public final p3325xe03a0797.p3326xc267989b.y0 b() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        return p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("WalletPagDownloadScope")));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z1.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(java.lang.String str) {
        java.util.HashSet hashSet = f295575b;
        synchronized (hashSet) {
            hashSet.remove(str);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            for (yz5.a aVar : f295576c) {
                if (((java.lang.Boolean) aVar.mo152xb9724478()).booleanValue()) {
                    hashSet2.add(aVar);
                }
            }
            f295576c.removeAll(hashSet2);
        }
    }
}
