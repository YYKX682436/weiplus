package ml2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    public final ml2.z f408881a;

    /* renamed from: b */
    public final ml2.c0 f408882b;

    public d() {
        ml2.b bVar = new ml2.b(this);
        this.f408881a = new ml2.z(bVar);
        this.f408882b = new ml2.c0(bVar);
    }

    public static /* synthetic */ java.lang.String d(ml2.d dVar, long j17, long j18, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        return dVar.c(j17, j18, str);
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put(str2, str3);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.Audience21053Report", "append extra " + str2 + " : " + str3 + " failed");
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L57
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r12.m76802x2dd01666()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            int r1 = r1.m76964x7f025288()
            r4 = 9
            if (r1 != r4) goto L14
            r2 = r3
        L14:
            if (r2 == 0) goto L17
            goto L18
        L17:
            r12 = r0
        L18:
            if (r12 == 0) goto L57
            java.util.LinkedList r1 = r12.m76778x3fcfc169()
            if (r1 == 0) goto L2b
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            if (r1 != 0) goto L55
        L2b:
            r45.dm2 r12 = r12.m76806xdef68064()
            if (r12 == 0) goto L54
            r1 = 12
            com.tencent.mm.protobuf.f r12 = r12.m75936x14adae67(r1)
            r45.pm2 r12 = (r45.pm2) r12
            if (r12 == 0) goto L54
            r1 = 10
            com.tencent.mm.protobuf.f r12 = r12.m75936x14adae67(r1)
            r45.wm2 r12 = (r45.wm2) r12
            if (r12 == 0) goto L54
            r1 = 3
            java.util.LinkedList r1 = r12.m75941xfb821914(r1)
            if (r1 == 0) goto L54
            boolean r12 = r1.isEmpty()
            r12 = r12 ^ r3
            if (r12 == 0) goto L54
            goto L55
        L54:
            r1 = r0
        L55:
            r2 = r1
            goto L58
        L57:
            r2 = r0
        L58:
            if (r2 == 0) goto L69
            java.lang.String r3 = "#"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            ml2.a r8 = ml2.a.f408725d
            r9 = 30
            r10 = 0
            java.lang.String r0 = kz5.n0.g0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.d.b(com.tencent.mm.protocal.protobuf.FinderObject):java.lang.String");
    }

    public final java.lang.String c(long j17, long j18, java.lang.String str) {
        java.lang.String Zi = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Zi(j17, (int) j18, str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            gk2.e eVar = gk2.e.f354004n;
            Zi = java.lang.String.valueOf(eVar != null ? ((mm2.e1) eVar.a(mm2.e1.class)).f410526w : null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                Zi = ((ml2.r0) i95.n0.c(ml2.r0.class)).f409414t;
            }
        }
        return Zi != null ? r26.i0.t(Zi, ",", ";", false) : "";
    }

    public final java.lang.String e(ml2.x1 x1Var, java.lang.String str) {
        if (x1Var != ml2.x1.f409735f && x1Var != ml2.x1.f409736g && x1Var != ml2.x1.f409740n && x1Var != ml2.x1.f409744r) {
            return str;
        }
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184145b;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null) {
            return str;
        }
        int d17 = com.p314xaae8f345.mm.ui.bl.d(activity);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.Audience21053Report", "insertFullScreenStateToChnlExtra navigationBarHeight:" + d17 + " navigationBarHeight=" + d17);
        return a(str, "system_navigat_height", java.lang.String.valueOf(d17));
    }

    public final java.lang.String f(java.lang.String str, java.lang.String str2) {
        int i17 = 1;
        if (str2.length() == 0) {
            return str;
        }
        try {
            org.json.JSONObject jSONObject = str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2) ? 2 : 1;
            if (!c01.e2.S(str2)) {
                i17 = 0;
            }
            jSONObject.put("session_type", i18);
            jSONObject.put("is_enterprise", i17);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:432:0x0769, code lost:
    
        if (r3 >= 2) goto L1022;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        if (r3 >= 2) goto L649;
     */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08c4 A[LOOP:7: B:437:0x0785->B:456:0x08c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x08ec A[EDGE_INSN: B:457:0x08ec->B:458:0x08ec BREAK  A[LOOP:7: B:437:0x0785->B:456:0x08c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025f A[LOOP:0: B:54:0x0123->B:59:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0287 A[EDGE_INSN: B:60:0x0287->B:61:0x0287 BREAK  A[LOOP:0: B:54:0x0123->B:59:0x025f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r63, ml2.x1 r64, java.lang.String r65, ml2.y r66, int r67, long r68, int r70) {
        /*
            Method dump skipped, instructions count: 2455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.d.g(androidx.recyclerview.widget.RecyclerView, ml2.x1, java.lang.String, ml2.y, int, long, int):void");
    }

    public final void h(so2.j5 feed, int i17, ml2.x1 actionType, java.lang.String commentscene, java.lang.String clickSubTabContextId, java.lang.String chnlExtra) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentscene, "commentscene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickSubTabContextId, "clickSubTabContextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtra, "chnlExtra");
        long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(mo2128x1ed62e84);
        ml2.d0 d0Var = ml2.f0.A;
        nm5.c a17 = d0Var.a(feed);
        boolean z17 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        java.lang.String m59299x6bf53a6c = z17 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed).getFeedObject().m59299x6bf53a6c() : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q17);
        java.lang.Object a18 = a17.a(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "$1(...)");
        long longValue = ((java.lang.Number) a18).longValue();
        java.lang.Object a19 = a17.a(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "$2(...)");
        int intValue = ((java.lang.Number) a19).intValue();
        java.lang.String b17 = d0Var.b(feed);
        ml2.e0 e0Var = ml2.e0.f408902d;
        java.lang.Object a27 = a17.a(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "$3(...)");
        ml2.f0 f0Var = new ml2.f0(feed, m59299x6bf53a6c, i17, q17, mo2128x1ed62e84, longValue, actionType, commentscene, intValue, b17, e0Var, true, ((java.lang.Boolean) a27).booleanValue(), 0, null, clickSubTabContextId, chnlExtra, null, 0L, null, 0, 0L, 0, null, null, null, 67002368, null);
        ae2.in inVar = ae2.in.f85221a;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).mo141623x754a37bb()).r()).intValue() == 1;
        if (z17 && z18) {
            i(f0Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed).getFeedObject().getFeedObject().m76829x97edf6c0());
        } else {
            i(f0Var, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(58:30|(1:32)(1:218)|(1:34)(1:217)|35|(2:37|(1:39))(1:216)|40|(1:42)(1:215)|43|(2:45|(1:47)(2:211|(1:213)))(1:214)|48|(1:50)|51|(4:53|(1:55)(1:199)|56|(1:58))|(1:210)(1:203)|204|(1:206)|(1:208)(1:209)|60|(3:62|(1:64)(1:197)|(1:66)(22:67|(1:69)(2:190|(1:192)(2:193|(1:195)(1:196)))|70|(13:162|163|(1:165)(1:188)|(1:167)(1:187)|(1:169)(1:186)|170|171|172|173|174|175|(1:177)|178)(1:78)|79|(1:83)|84|(4:86|(1:88)(1:93)|(1:90)|(1:92))|(1:95)(1:161)|(1:160)(1:99)|100|(1:102)|103|(5:148|149|(1:151)(1:157)|(1:153)(1:156)|154)|(5:136|137|(1:139)(1:145)|(1:141)(1:144)|142)|106|(1:135)(1:110)|(2:112|(2:114|(1:116)(1:132))(1:133))(1:134)|117|(3:127|(1:129)(1:131)|130)|121|(2:123|124)(2:125|126)))|198|70|(1:72)|162|163|(0)(0)|(0)(0)|(0)(0)|170|171|172|173|174|175|(0)|178|79|(2:81|83)|84|(0)|(0)(0)|(1:97)|160|100|(0)|103|(0)|(0)|106|(1:108)|135|(0)(0)|117|(1:119)|127|(0)(0)|130|121|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "temp_9") != false) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "18") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x025c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0265, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.Audience21053Report", "onclick " + r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x025e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025f, code lost:
    
        r23 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0263, code lost:
    
        r18 = n30.r.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0262, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r0.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        r0 = ml2.q1.f409345e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "temp_1") != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "17") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0035, code lost:
    
        if (r0.equals("FinderFriendTabFragment") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.equals("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r0.equals("FinderMachineTabFragment") == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0165, code lost:
    
        if (r13 == null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
    
        r0 = ml2.q1.f409345e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "temp_1") != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, "17") != false) goto L465;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0224 A[Catch: Exception -> 0x0262, TryCatch #4 {Exception -> 0x0262, blocks: (B:163:0x0213, B:169:0x0224, B:186:0x022a), top: B:162:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022a A[Catch: Exception -> 0x0262, TRY_LEAVE, TryCatch #4 {Exception -> 0x0262, blocks: (B:163:0x0213, B:169:0x0224, B:186:0x022a), top: B:162:0x0213 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(ml2.f0 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.d.i(ml2.f0, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
    
        if (r4 == null) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(ml2.x1 r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 r26, r45.qt2 r27) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.d.j(ml2.x1, int, java.lang.String, com.tencent.mm.plugin.finder.storage.FeedData, r45.qt2):void");
    }
}
