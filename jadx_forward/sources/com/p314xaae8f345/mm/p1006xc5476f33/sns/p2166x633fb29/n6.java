package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes2.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6 f246047a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6();

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarCgiHelper", "doRequestSnsStarAction error >> " + r12);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r12, long r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r11 = this;
            java.lang.String r0 = "doRequestSnsStarAction"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r15 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l6
            if (r2 == 0) goto L1a
            r2 = r15
            com.tencent.mm.plugin.sns.model.l6 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l6) r2
            int r3 = r2.f245965f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f245965f = r3
            goto L1f
        L1a:
            com.tencent.mm.plugin.sns.model.l6 r2 = new com.tencent.mm.plugin.sns.model.l6
            r2.<init>(r11, r15)
        L1f:
            r7 = r2
            java.lang.Object r15 = r7.f245963d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r7.f245965f
            java.lang.String r10 = "MicroMsg.SnsStarCgiHelper"
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L33
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)     // Catch: rm0.j -> L31
            goto L9c
        L31:
            r12 = move-exception
            goto L9f
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r12
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "doRequestSnsStarAction >> "
            r15.<init>(r3)
            r15.append(r12)
            java.lang.String r3 = ", "
            r15.append(r3)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r15)
            com.tencent.mm.modelbase.i r3 = new com.tencent.mm.modelbase.i     // Catch: rm0.j -> L31
            r3.<init>()     // Catch: rm0.j -> L31
            r45.ia6 r15 = new r45.ia6     // Catch: rm0.j -> L31
            r15.<init>()     // Catch: rm0.j -> L31
            r15.f458428e = r12     // Catch: rm0.j -> L31
            r15.f458427d = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.l r12 = new com.tencent.mm.modelbase.l     // Catch: rm0.j -> L31
            r12.<init>()     // Catch: rm0.j -> L31
            r12.f152197a = r15     // Catch: rm0.j -> L31
            r45.ja6 r13 = new r45.ja6     // Catch: rm0.j -> L31
            r13.<init>()     // Catch: rm0.j -> L31
            r12.f152198b = r13     // Catch: rm0.j -> L31
            r13 = 11969(0x2ec1, float:1.6772E-41)
            r12.f152200d = r13     // Catch: rm0.j -> L31
            java.lang.String r13 = "/cgi-bin/micromsg-bin/mmsnsstickyontop"
            r12.f152199c = r13     // Catch: rm0.j -> L31
            r13 = 0
            r12.f152201e = r13     // Catch: rm0.j -> L31
            r12.f152202f = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.o r12 = r12.a()     // Catch: rm0.j -> L31
            r3.p(r12)     // Catch: rm0.j -> L31
            r12 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r7.f245965f = r4     // Catch: rm0.j -> L31
            r4 = r12
            java.lang.Object r15 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L31
            if (r15 != r2) goto L9c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L9c:
            r45.ja6 r15 = (r45.ja6) r15     // Catch: rm0.j -> L31
            goto Lb1
        L9f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "doRequestSnsStarAction error >> "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r12)
            r15 = 0
        Lb1:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6.a(int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarCgiHelper", "doRequestSnsStarList error >> " + r12);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, long r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r11 = this;
            java.lang.String r0 = "doRequestSnsStarList"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsStarCgiHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            boolean r2 = r15 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m6
            if (r2 == 0) goto L1a
            r2 = r15
            com.tencent.mm.plugin.sns.model.m6 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m6) r2
            int r3 = r2.f246012f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f246012f = r3
            goto L1f
        L1a:
            com.tencent.mm.plugin.sns.model.m6 r2 = new com.tencent.mm.plugin.sns.model.m6
            r2.<init>(r11, r15)
        L1f:
            r7 = r2
            java.lang.Object r15 = r7.f246010d
            pz5.a r2 = pz5.a.f440719d
            int r3 = r7.f246012f
            java.lang.String r10 = "MicroMsg.SnsStarCgiHelper"
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L33
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)     // Catch: rm0.j -> L31
            goto L9c
        L31:
            r12 = move-exception
            goto L9f
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            throw r12
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r3 = "doRequestSnsStarList >> "
            r15.<init>(r3)
            r15.append(r12)
            java.lang.String r3 = ", "
            r15.append(r3)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r15)
            com.tencent.mm.modelbase.i r3 = new com.tencent.mm.modelbase.i     // Catch: rm0.j -> L31
            r3.<init>()     // Catch: rm0.j -> L31
            r45.xa6 r15 = new r45.xa6     // Catch: rm0.j -> L31
            r15.<init>()     // Catch: rm0.j -> L31
            r15.f471451e = r13     // Catch: rm0.j -> L31
            r15.f471450d = r12     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.l r12 = new com.tencent.mm.modelbase.l     // Catch: rm0.j -> L31
            r12.<init>()     // Catch: rm0.j -> L31
            r12.f152197a = r15     // Catch: rm0.j -> L31
            r45.ya6 r13 = new r45.ya6     // Catch: rm0.j -> L31
            r13.<init>()     // Catch: rm0.j -> L31
            r12.f152198b = r13     // Catch: rm0.j -> L31
            r13 = 7678(0x1dfe, float:1.0759E-41)
            r12.f152200d = r13     // Catch: rm0.j -> L31
            java.lang.String r13 = "/cgi-bin/micromsg-bin/mmsnstoplist"
            r12.f152199c = r13     // Catch: rm0.j -> L31
            r13 = 0
            r12.f152201e = r13     // Catch: rm0.j -> L31
            r12.f152202f = r13     // Catch: rm0.j -> L31
            com.tencent.mm.modelbase.o r12 = r12.a()     // Catch: rm0.j -> L31
            r3.p(r12)     // Catch: rm0.j -> L31
            r12 = 0
            r6 = 0
            r8 = 3
            r9 = 0
            r7.f246012f = r4     // Catch: rm0.j -> L31
            r4 = r12
            java.lang.Object r15 = rm0.h.a(r3, r4, r6, r7, r8, r9)     // Catch: rm0.j -> L31
            if (r15 != r2) goto L9c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r2
        L9c:
            r45.ya6 r15 = (r45.ya6) r15     // Catch: rm0.j -> L31
            goto Lb1
        L9f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "doRequestSnsStarList error >> "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r10, r12)
            r15 = 0
        Lb1:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.n6.b(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
