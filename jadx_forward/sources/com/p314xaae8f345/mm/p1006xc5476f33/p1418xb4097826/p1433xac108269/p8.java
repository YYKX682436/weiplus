package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 f183993a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f183994b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f183995c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final long f183996d = 1552;

    /* JADX WARN: Removed duplicated region for block: B:37:0x0044 A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:13:0x0014, B:15:0x001f, B:16:0x005a, B:18:0x0074, B:19:0x007e, B:21:0x00b6, B:27:0x007a, B:29:0x0027, B:31:0x002f, B:33:0x0037, B:37:0x0044, B:39:0x004c), top: B:12:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8 r6, java.lang.String r7, com.p314xaae8f345.mm.p2495xc50a8b8b.g r8, boolean r9, boolean r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 2
            if (r12 == 0) goto L5
            r8 = 0
        L5:
            r12 = r11 & 4
            r0 = 0
            if (r12 == 0) goto Lb
            r9 = r0
        Lb:
            r11 = r11 & 8
            if (r11 == 0) goto L10
            r10 = r0
        L10:
            java.lang.String r11 = "tag, stage:"
            monitor-enter(r6)
            java.lang.String r12 = "stage"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r12)     // Catch: java.lang.Throwable -> Lc4
            r12 = 2
            r1 = 3
            r2 = 1
            if (r9 == 0) goto L27
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = r0     // Catch: java.lang.Throwable -> Lc4
            java.util.ArrayList r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b     // Catch: java.lang.Throwable -> Lc4
            r3.clear()     // Catch: java.lang.Throwable -> Lc4
            goto L5a
        L27:
            java.util.ArrayList r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b     // Catch: java.lang.Throwable -> Lc4
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> Lc4
            if (r4 != 0) goto Lc2
            java.lang.Object r4 = kz5.n0.Z(r3)     // Catch: java.lang.Throwable -> Lc4
            r45.nd6 r4 = (r45.nd6) r4     // Catch: java.lang.Throwable -> Lc4
            if (r4 == 0) goto L41
            int r4 = r4.m75939xb282bd08(r1)     // Catch: java.lang.Throwable -> Lc4
            com.tencent.mm.plugin.finder.assist.r8 r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a     // Catch: java.lang.Throwable -> Lc4
            if (r4 != r2) goto L41
            r4 = r2
            goto L42
        L41:
            r4 = r0
        L42:
            if (r4 == 0) goto Lc2
            java.lang.Object r3 = kz5.n0.k0(r3)     // Catch: java.lang.Throwable -> Lc4
            r45.nd6 r3 = (r45.nd6) r3     // Catch: java.lang.Throwable -> Lc4
            if (r3 == 0) goto L56
            int r3 = r3.m75939xb282bd08(r1)     // Catch: java.lang.Throwable -> Lc4
            com.tencent.mm.plugin.finder.assist.r8 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a     // Catch: java.lang.Throwable -> Lc4
            if (r3 != r12) goto L56
            r3 = r2
            goto L57
        L56:
            r3 = r0
        L57:
            if (r3 == 0) goto L5a
            goto Lc2
        L5a:
            r45.nd6 r3 = new r45.nd6     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = ""
            r3.set(r0, r4)     // Catch: java.lang.Throwable -> Lc4
            r3.set(r2, r7)     // Catch: java.lang.Throwable -> Lc4
            long r4 = c01.id.a()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lc4
            r3.set(r12, r4)     // Catch: java.lang.Throwable -> Lc4
            if (r9 == 0) goto L78
            com.tencent.mm.plugin.finder.assist.r8 r12 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a     // Catch: java.lang.Throwable -> Lc4
            r12 = r2
            goto L7e
        L78:
            if (r10 == 0) goto L7d
            com.tencent.mm.plugin.finder.assist.r8 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184088a     // Catch: java.lang.Throwable -> Lc4
            goto L7e
        L7d:
            r12 = r0
        L7e:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> Lc4
            r3.set(r1, r12)     // Catch: java.lang.Throwable -> Lc4
            r12 = 4
            r3.set(r12, r8)     // Catch: java.lang.Throwable -> Lc4
            com.tencent.mm.plugin.finder.assist.n8 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183941a     // Catch: java.lang.Throwable -> Lc4
            r8.a(r3)     // Catch: java.lang.Throwable -> Lc4
            java.util.ArrayList r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183994b     // Catch: java.lang.Throwable -> Lc4
            r8.add(r3)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r8 = "Finder.LiveAnchorFlowStats"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lc4
            r12.append(r7)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = ", isStart:"
            r12.append(r7)     // Catch: java.lang.Throwable -> Lc4
            r12.append(r9)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = ", isEnd:"
            r12.append(r7)     // Catch: java.lang.Throwable -> Lc4
            r12.append(r10)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> Lc4
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)     // Catch: java.lang.Throwable -> Lc4
            if (r10 == 0) goto Lc0
            ku5.u0 r7 = ku5.t0.f394148d     // Catch: java.lang.Throwable -> Lc4
            com.tencent.mm.plugin.finder.assist.o8 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o8.f183965d     // Catch: java.lang.Throwable -> Lc4
            long r9 = (long) r0     // Catch: java.lang.Throwable -> Lc4
            ku5.t0 r7 = (ku5.t0) r7     // Catch: java.lang.Throwable -> Lc4
            r7.k(r8, r9)     // Catch: java.lang.Throwable -> Lc4
        Lc0:
            monitor-exit(r6)
            goto Lc3
        Lc2:
            monitor-exit(r6)
        Lc3:
            return
        Lc4:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.tencent.mm.plugin.finder.assist.p8, java.lang.String, com.tencent.mm.protobuf.g, boolean, boolean, int, java.lang.Object):void");
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n8.f183942b = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(f183996d, 1123L);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(f183996d, 61L);
    }
}
