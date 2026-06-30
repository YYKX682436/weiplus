package c61;

@j95.b
/* loaded from: classes10.dex */
public final class w8 extends i95.w implements zy2.pa {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f39386d = new java.util.LinkedList();

    public void Ai(android.content.Context context, int i17, int i18) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = nyVar;
        if (nyVar2 != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny.l7(nyVar2, i17, i18, null, 4, null);
        }
    }

    public void Bi(android.content.Context context, android.content.Intent intent, long j17, java.lang.String str, int i17, int i18, boolean z17, int i19) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, j17, str, i17, i18, z17, i19, null, 256, null);
    }

    public void Di(int i17) {
        int i18;
        com.tencent.mm.autogen.mmdata.rpt.LiveEntranceShowStruct liveEntranceShowStruct = new com.tencent.mm.autogen.mmdata.rpt.LiveEntranceShowStruct();
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(ro0.a.f397973a);
        boolean z17 = false;
        if (z07 != null && z07.G0(r17)) {
            i18 = 2;
        } else {
            if (z07 != null && z07.L0(r17)) {
                z17 = true;
            }
            i18 = z17 ? 1 : 3;
        }
        liveEntranceShowStruct.f58581f = i18;
        liveEntranceShowStruct.f58580e = liveEntranceShowStruct.b("roomid", ro0.a.f397973a, true);
        liveEntranceShowStruct.f58579d = 1L;
        liveEntranceShowStruct.f58582g = i17;
        liveEntranceShowStruct.k();
    }

    public void Ni() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorClickIconEnterLive");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1380L, 0L, 1L);
    }

    public void Ri(java.lang.String currUI, com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo, r45.f03 showInfo, int i17, java.lang.String contextId, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(currUI, "currUI");
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        kotlin.jvm.internal.o.g(showInfo, "showInfo");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        com.tencent.mm.plugin.finder.report.x2.f125429a.e(currUI, ctrInfo, showInfo, i17, contextId, i18, i19, i27);
    }

    public void Ui(int i17, int i18, long j17, java.util.Map map) {
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).ij(i17, i18, j17, map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:259|(5:260|261|(1:263)(1:389)|264|265)|(28:267|268|269|270|271|272|(1:274)(1:381)|275|(2:277|278)(1:380)|279|280|(1:282)(1:376)|(1:284)|285|(1:287)(1:375)|288|(1:290)(1:374)|(1:292)|293|294|295|(1:297)(1:370)|(3:329|(1:331)(1:369)|(3:334|(1:336)(1:368)|(15:338|(1:340)(1:367)|341|(1:343)(1:366)|(1:345)|346|(1:348)(1:365)|349|(1:351)(1:364)|(1:353)(1:363)|354|(1:356)(1:362)|357|(1:359)(1:361)|360))(1:333))(1:299)|300|(1:302)|303|(1:328)(1:305)|306)|388|271|272|(0)(0)|275|(0)(0)|279|280|(0)(0)|(0)|285|(0)(0)|288|(0)(0)|(0)|293|294|295|(0)(0)|(0)(0)|300|(0)|303|(2:328|306)|305|306) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:259|260|261|(1:263)(1:389)|264|265|(28:267|268|269|270|271|272|(1:274)(1:381)|275|(2:277|278)(1:380)|279|280|(1:282)(1:376)|(1:284)|285|(1:287)(1:375)|288|(1:290)(1:374)|(1:292)|293|294|295|(1:297)(1:370)|(3:329|(1:331)(1:369)|(3:334|(1:336)(1:368)|(15:338|(1:340)(1:367)|341|(1:343)(1:366)|(1:345)|346|(1:348)(1:365)|349|(1:351)(1:364)|(1:353)(1:363)|354|(1:356)(1:362)|357|(1:359)(1:361)|360))(1:333))(1:299)|300|(1:302)|303|(1:328)(1:305)|306)|388|271|272|(0)(0)|275|(0)(0)|279|280|(0)(0)|(0)|285|(0)(0)|288|(0)(0)|(0)|293|294|295|(0)(0)|(0)(0)|300|(0)|303|(2:328|306)|305|306) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r26 == 11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r29 == 8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x059c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x059d, code lost:
    
        com.tencent.mars.xlog.Log.e("HABBYGE-MALI.SnsFeedMonitor", "_getHellFeed, crash-2: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x050f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0514, code lost:
    
        com.tencent.mars.xlog.Log.e("HABBYGE-MALI.SnsFeedMonitor", "_getHellFeed, crash: " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0511, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0512, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02aa A[Catch: Exception -> 0x031b, TryCatch #5 {Exception -> 0x031b, blocks: (B:134:0x02a6, B:136:0x02aa, B:171:0x02b4, B:173:0x02b8, B:176:0x02c5, B:178:0x02c9, B:180:0x02d1, B:182:0x02d5, B:183:0x02db, B:185:0x02df, B:188:0x02e6, B:190:0x02ec, B:191:0x02f2, B:193:0x02f6, B:196:0x02ff, B:198:0x0307, B:199:0x030d, B:201:0x0311, B:202:0x0315), top: B:133:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b4 A[Catch: Exception -> 0x031b, TryCatch #5 {Exception -> 0x031b, blocks: (B:134:0x02a6, B:136:0x02aa, B:171:0x02b4, B:173:0x02b8, B:176:0x02c5, B:178:0x02c9, B:180:0x02d1, B:182:0x02d5, B:183:0x02db, B:185:0x02df, B:188:0x02e6, B:190:0x02ec, B:191:0x02f2, B:193:0x02f6, B:196:0x02ff, B:198:0x0307, B:199:0x030d, B:201:0x0311, B:202:0x0315), top: B:133:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c9 A[Catch: Exception -> 0x0511, TryCatch #7 {Exception -> 0x0511, blocks: (B:272:0x04c5, B:274:0x04c9, B:275:0x04d2, B:277:0x04d8), top: B:271:0x04c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04d8 A[Catch: Exception -> 0x0511, TRY_LEAVE, TryCatch #7 {Exception -> 0x0511, blocks: (B:272:0x04c5, B:274:0x04c9, B:275:0x04d2, B:277:0x04d8), top: B:271:0x04c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04e6 A[Catch: Exception -> 0x050f, TryCatch #1 {Exception -> 0x050f, blocks: (B:280:0x04e2, B:282:0x04e6, B:285:0x04ed, B:287:0x04f5, B:288:0x04fb, B:290:0x04ff, B:293:0x0506), top: B:279:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04f5 A[Catch: Exception -> 0x050f, TryCatch #1 {Exception -> 0x050f, blocks: (B:280:0x04e2, B:282:0x04e6, B:285:0x04ed, B:287:0x04f5, B:288:0x04fb, B:290:0x04ff, B:293:0x0506), top: B:279:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04ff A[Catch: Exception -> 0x050f, TryCatch #1 {Exception -> 0x050f, blocks: (B:280:0x04e2, B:282:0x04e6, B:285:0x04ed, B:287:0x04f5, B:288:0x04fb, B:290:0x04ff, B:293:0x0506), top: B:279:0x04e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x052b A[Catch: Exception -> 0x059c, TryCatch #3 {Exception -> 0x059c, blocks: (B:295:0x0527, B:297:0x052b, B:329:0x0535, B:331:0x0539, B:334:0x0546, B:336:0x054a, B:338:0x0552, B:340:0x0556, B:341:0x055c, B:343:0x0560, B:346:0x0567, B:348:0x056d, B:349:0x0573, B:351:0x0577, B:354:0x0580, B:356:0x0588, B:357:0x058e, B:359:0x0592, B:360:0x0596), top: B:294:0x0527 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0664 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0535 A[Catch: Exception -> 0x059c, TryCatch #3 {Exception -> 0x059c, blocks: (B:295:0x0527, B:297:0x052b, B:329:0x0535, B:331:0x0539, B:334:0x0546, B:336:0x054a, B:338:0x0552, B:340:0x0556, B:341:0x055c, B:343:0x0560, B:346:0x0567, B:348:0x056d, B:349:0x0573, B:351:0x0577, B:354:0x0580, B:356:0x0588, B:357:0x058e, B:359:0x0592, B:360:0x0596), top: B:294:0x0527 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vi(android.view.View r21, java.lang.Object r22, int r23, int r24, int r25, long r26, java.lang.String r28, int r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.w8.Vi(android.view.View, java.lang.Object, int, int, int, long, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r42 == 15) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Zi(long r35, long r37, java.lang.String r39, int r40, int r41, long r42, java.lang.String r44, int r45, int r46, java.lang.String r47, java.lang.String r48, long r49, int r51, java.lang.String r52, java.lang.String r53, java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.w8.Zi(long, long, java.lang.String, int, int, long, java.lang.String, int, int, java.lang.String, java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r43 == 17) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void aj(long r37, long r39, java.lang.String r41, java.lang.String r42, long r43, java.lang.String r45, int r46, java.lang.String r47, java.lang.String r48) {
        /*
            r36 = this;
            r0 = r48
            java.lang.String r1 = "nickname"
            r14 = r42
            kotlin.jvm.internal.o.g(r14, r1)
            java.lang.String r1 = "chnlExtra"
            r12 = r47
            kotlin.jvm.internal.o.g(r12, r1)
            java.lang.String r1 = "sessionBuffer"
            kotlin.jvm.internal.o.g(r0, r1)
            ml2.x1 r1 = ml2.x1.f328202f
            r2 = 2
            int r2 = (r43 > r2 ? 1 : (r43 == r2 ? 0 : -1))
            if (r2 != 0) goto L1f
            goto L44
        L1f:
            ml2.x1 r2 = ml2.x1.f328215v
            r3 = 14
            int r3 = (r43 > r3 ? 1 : (r43 == r3 ? 0 : -1))
            if (r3 != 0) goto L28
            goto L42
        L28:
            ml2.x1 r2 = ml2.x1.f328216w
            r3 = 15
            int r3 = (r43 > r3 ? 1 : (r43 == r3 ? 0 : -1))
            if (r3 != 0) goto L31
            goto L42
        L31:
            ml2.x1 r2 = ml2.x1.f328217x
            r3 = 16
            int r3 = (r43 > r3 ? 1 : (r43 == r3 ? 0 : -1))
            if (r3 != 0) goto L3a
            goto L42
        L3a:
            ml2.x1 r2 = ml2.x1.f328218y
            r3 = 17
            int r3 = (r43 > r3 ? 1 : (r43 == r3 ? 0 : -1))
            if (r3 != 0) goto L44
        L42:
            r11 = r2
            goto L45
        L44:
            r11 = r1
        L45:
            java.lang.Class<zy2.zb> r1 = zy2.zb.class
            i95.m r1 = i95.n0.c(r1)
            zy2.zb r1 = (zy2.zb) r1
            java.lang.String r2 = ""
            if (r41 != 0) goto L53
            r4 = r2
            goto L55
        L53:
            r4 = r41
        L55:
            java.lang.String r6 = pm0.v.u(r37)
            if (r45 != 0) goto L5e
            r18 = r2
            goto L60
        L5e:
            r18 = r45
        L60:
            ml2.f0 r9 = new ml2.f0
            r2 = r9
            r3 = 0
            r5 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 67034368(0x3fedd00, float:1.4979517E-36)
            r34 = 0
            r7 = r37
            r35 = r9
            r9 = r39
            r12 = r18
            r14 = r42
            r18 = r46
            r21 = r47
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r29, r30, r31, r32, r33, r34)
            ml2.j0 r1 = (ml2.j0) r1
            r1.getClass()
            ml2.d r1 = ml2.j0.f327584m
            r2 = r35
            r1.i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.w8.aj(long, long, java.lang.String, java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    public void bj(java.lang.String eid, int i17, org.json.JSONObject jSONObject, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(eid, "eid");
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, qt2Var, eid, i17, jSONObject, false, null, 48, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void cj(boolean r37, int r38, int r39, zy2.na r40) {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.w8.cj(boolean, int, int, zy2.na):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x022f, code lost:
    
        if (r0 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0122, code lost:
    
        if ((r13 == null) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0156, code lost:
    
        if ((r13 == null) != false) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fj(java.lang.String r18, boolean r19, boolean r20, zy2.na r21) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.w8.fj(java.lang.String, boolean, boolean, zy2.na):void");
    }

    public void hj(int i17) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1309L, i17, 1L);
        g0Var.d(19212, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c01.id.a()));
    }

    public void ij(java.lang.String eventId, java.lang.String imgSourceUrl, int i17, zy2.oa showPosition) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3 = "";
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(imgSourceUrl, "imgSourceUrl");
        kotlin.jvm.internal.o.g(showPosition, "showPosition");
        int hashCode = eventId.hashCode();
        if (hashCode != -1517775158) {
            if (hashCode != 1196167304) {
                if (hashCode != 1196169603 || !eventId.equals("view_exp")) {
                    return;
                }
            } else if (!eventId.equals("view_clk")) {
                return;
            }
        } else if (!eventId.equals("view_unexp")) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(imgSourceUrl);
        try {
            str = parse.getQueryParameter("feedid");
            if (str == null) {
                str = "";
            }
            try {
                str2 = parse.getQueryParameter("snapshottype");
                if (str2 == null) {
                    str2 = "";
                }
                try {
                    java.lang.String queryParameter = parse.getQueryParameter(dm.i4.COL_USERNAME);
                    if (queryParameter != null) {
                        str3 = queryParameter;
                    }
                } catch (java.lang.UnsupportedOperationException unused) {
                }
            } catch (java.lang.UnsupportedOperationException unused2) {
                str2 = "";
            }
        } catch (java.lang.UnsupportedOperationException unused3) {
            str = "";
            str2 = str;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Bj("watch_original_video", eventId, kz5.c1.k(new jz5.l("feed_id", str), new jz5.l("screenshot_type", str2), new jz5.l("view_scene", java.lang.Integer.valueOf(i17)), new jz5.l("show_position", java.lang.Integer.valueOf(showPosition.f477524d)), new jz5.l("finder_username", str3)), 1, false);
    }

    public void mj(int i17, android.content.Intent intent) {
        if ((i17 == 2 || i17 == 4) && intent != null) {
            intent.putExtra("enter_finder_home_ui_type", i17);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REPORT_SDK_SPECIAL_SOURCE_INT_SYNC, java.lang.Integer.valueOf(i17));
    }

    public void nj(java.util.List feedIdList, boolean z17) {
        kotlin.jvm.internal.o.g(feedIdList, "feedIdList");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new java.util.LinkedList();
        java.util.Iterator it = feedIdList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            r45.vd6 vd6Var = new r45.vd6();
            if (z17) {
                vd6Var.set(14, java.lang.Long.valueOf(pm0.v.Z((java.lang.String) pair.first)));
                vd6Var.set(15, (java.lang.String) pair.second);
            } else {
                vd6Var.set(0, java.lang.Long.valueOf(pm0.v.Z((java.lang.String) pair.first)));
                vd6Var.set(4, (java.lang.String) pair.second);
            }
            r45.q25 q25Var = new r45.q25();
            q25Var.set(4, java.lang.Integer.valueOf(q25Var.getInteger(4) + 1));
            q25Var.set(7, 1);
            vd6Var.set(3, q25Var);
            ((java.util.LinkedList) h0Var.f310123d).add(vd6Var);
        }
        new db2.y2((java.util.List) h0Var.f310123d, null).l().H(new c61.v8(h0Var));
    }

    public void oj(r45.n23 videoInfo) {
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        java.util.LinkedList linkedList = this.f39386d;
        com.tencent.mm.plugin.finder.report.n4 n4Var = (com.tencent.mm.plugin.finder.report.n4) kz5.n0.Z(linkedList);
        if (linkedList.size() > 20) {
            ot5.g.c("startPlayVideoInMp", "startPlayVideoInMp remove:".concat(pm0.v.u(((com.tencent.mm.plugin.finder.report.n4) linkedList.getFirst()).f125153a)));
            linkedList.remove(0);
        }
        if (n4Var != null) {
            linkedList.remove(n4Var);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) videoInfo.getCustom(0);
        if (finderObject != null) {
            long id6 = finderObject.getId();
            r45.dm2 object_extend = finderObject.getObject_extend();
            linkedList.add(new com.tencent.mm.plugin.finder.report.n4(id6, object_extend != null ? object_extend.getString(62) : null, c01.id.c(), com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), null, false, null, 112, null));
        }
    }

    public r45.qt2 wi(android.content.Context context) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            nyVar = null;
        }
        if (nyVar != null) {
            return nyVar.V6();
        }
        return null;
    }
}
