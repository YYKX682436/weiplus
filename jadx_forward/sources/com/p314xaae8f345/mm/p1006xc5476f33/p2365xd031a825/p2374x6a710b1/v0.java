package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0 f262526a = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f262527b = new java.util.LinkedHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006c, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r7 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l b(int r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.v0.b(int, java.lang.String, java.lang.String):jz5.l");
    }

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "update chatType=" + info.f262371d + ", sendType=" + info.f262372e + " for " + str);
        java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = stackTrace.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.StackTraceElement stackTraceElement = stackTrace[i17];
            java.lang.String className = stackTraceElement.getClassName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "getClassName(...)");
            if (r26.n0.B(className, "com.tencent", false)) {
                arrayList.add(stackTraceElement);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", kz5.n0.g0(arrayList, "\n", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.t0.f262520d, 30, null));
        if (info.f262372e == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262515g) {
            if (info.f262371d == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262474g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType single");
                info.f262371d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262475h;
            }
            if (info.f262371d == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262476i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType group");
                info.f262371d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262477m;
            }
            if (info.f262371d == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262478n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .enterprise correction: chatType timeline");
                info.f262371d = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262479o;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 n0Var = info.f262371d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 n0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262473f;
        if (n0Var == n0Var2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 s0Var = info.f262372e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262514f;
            if (s0Var != s0Var2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "chatType == .unknown correction: sendType from " + info.f262372e + " to unknown");
                info.f262372e = s0Var2;
            }
        }
        if (info.f262372e == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262514f && info.f262371d != n0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WCPaySessionInfoRecorder", "sendType == .unknown correction: sendType from " + info.f262371d + " to unknown");
            info.f262371d = n0Var2;
        }
        f262527b.put(str, info);
    }
}
