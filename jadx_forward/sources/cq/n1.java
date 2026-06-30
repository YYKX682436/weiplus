package cq;

/* loaded from: classes2.dex */
public abstract class n1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:43:0x000d, B:6:0x001b, B:8:0x0052, B:10:0x0070, B:11:0x007c, B:13:0x0082, B:15:0x0091, B:19:0x00c1, B:25:0x00c8, B:32:0x0062, B:34:0x0032, B:37:0x003b, B:39:0x0044, B:17:0x00ad), top: B:42:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:43:0x000d, B:6:0x001b, B:8:0x0052, B:10:0x0070, B:11:0x007c, B:13:0x0082, B:15:0x0091, B:19:0x00c1, B:25:0x00c8, B:32:0x0062, B:34:0x0032, B:37:0x003b, B:39:0x0044, B:17:0x00ad), top: B:42:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(cq.k r6, java.lang.String r7, java.lang.Boolean r8) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            c66.q r6 = c66.q.f121026a
            r6 = 0
            r0 = 1
            java.lang.String r1 = "Finder.WCFinderWCDB"
            if (r7 == 0) goto L16
            int r2 = r7.length()     // Catch: java.lang.Exception -> Lcc
            if (r2 != 0) goto L14
            goto L16
        L14:
            r2 = r6
            goto L17
        L16:
            r2 = r0
        L17:
            if (r2 != 0) goto L30
            if (r8 == 0) goto L30
            com.tencent.wcdb.orm.Field r6 = ni0.b.f418724c     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.winq.Expression r6 = r6.eq(r7)     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.orm.Field r0 = ni0.b.f418729h     // Catch: java.lang.Exception -> Lcc
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.winq.Expression r8 = r0.eq(r8)     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.winq.Expression r6 = r6.and(r8)     // Catch: java.lang.Exception -> Lcc
            goto L50
        L30:
            if (r7 == 0) goto L38
            int r2 = r7.length()     // Catch: java.lang.Exception -> Lcc
            if (r2 != 0) goto L39
        L38:
            r6 = r0
        L39:
            if (r6 != 0) goto L42
            com.tencent.wcdb.orm.Field r6 = ni0.b.f418724c     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.winq.Expression r6 = r6.eq(r7)     // Catch: java.lang.Exception -> Lcc
            goto L50
        L42:
            if (r8 == 0) goto L4f
            com.tencent.wcdb.orm.Field r6 = ni0.b.f418729h     // Catch: java.lang.Exception -> Lcc
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.winq.Expression r6 = r6.eq(r8)     // Catch: java.lang.Exception -> Lcc
            goto L50
        L4f:
            r6 = 0
        L50:
            if (r6 == 0) goto L62
            jz5.g r8 = c66.q.f121040o     // Catch: java.lang.Exception -> Lcc
            jz5.n r8 = (jz5.n) r8     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r8 = r8.mo141623x754a37bb()     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.core.Table r8 = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) r8     // Catch: java.lang.Exception -> Lcc
            java.util.List r6 = r8.m107094xde3eb429(r6)     // Catch: java.lang.Exception -> Lcc
            if (r6 != 0) goto L70
        L62:
            jz5.g r6 = c66.q.f121040o     // Catch: java.lang.Exception -> Lcc
            jz5.n r6 = (jz5.n) r6     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r6 = r6.mo141623x754a37bb()     // Catch: java.lang.Exception -> Lcc
            com.tencent.wcdb.core.Table r6 = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) r6     // Catch: java.lang.Exception -> Lcc
            java.util.List r6 = r6.m107093xde3eb429()     // Catch: java.lang.Exception -> Lcc
        L70:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r6)     // Catch: java.lang.Exception -> Lcc
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lcc
            r8.<init>()     // Catch: java.lang.Exception -> Lcc
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> Lcc
        L7c:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> Lcc
            if (r0 == 0) goto Ld3
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Exception -> Lcc
            r2 = r0
            ni0.h r2 = (ni0.h) r2     // Catch: java.lang.Exception -> Lcc
            java.lang.String r3 = r2.f418759d     // Catch: java.lang.Exception -> Lcc
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r3)     // Catch: java.lang.Exception -> Lcc
            if (r3 != 0) goto Lc6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcc
            r4.<init>()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r5 = "[getFinderAsyncAIGCDraftItemList] invalid taskId:"
            r4.append(r5)     // Catch: java.lang.Exception -> Lcc
            r4.append(r7)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lcc
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r2 = r2.f418756a     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = "taskId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)     // Catch: java.lang.Exception -> Lcc
            jz5.g r4 = c66.q.f121040o     // Catch: java.lang.Exception -> Lc1
            jz5.n r4 = (jz5.n) r4     // Catch: java.lang.Exception -> Lc1
            java.lang.Object r4 = r4.mo141623x754a37bb()     // Catch: java.lang.Exception -> Lc1
            com.tencent.wcdb.core.Table r4 = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) r4     // Catch: java.lang.Exception -> Lc1
            com.tencent.wcdb.orm.Field r5 = ni0.b.f418724c     // Catch: java.lang.Exception -> Lc1
            com.tencent.wcdb.winq.Expression r2 = r5.eq(r2)     // Catch: java.lang.Exception -> Lc1
            r4.m107088x90df30e9(r2)     // Catch: java.lang.Exception -> Lc1
            goto Lc6
        Lc1:
            java.lang.String r2 = "deleteFinderAsyncAIGCDraftItem fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Exception -> Lcc
        Lc6:
            if (r3 == 0) goto L7c
            r8.add(r0)     // Catch: java.lang.Exception -> Lcc
            goto L7c
        Lcc:
            java.lang.String r6 = "getFinderAsyncAIGCDraftItemList fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r6)
            kz5.p0 r8 = kz5.p0.f395529d
        Ld3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.n1.a(cq.k, java.lang.String, java.lang.Boolean):java.util.List");
    }
}
