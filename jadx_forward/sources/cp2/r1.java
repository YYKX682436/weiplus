package cp2;

/* loaded from: classes2.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.u1 f302435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f302437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f302438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f302439h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302440i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302441m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f302442n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(cp2.u1 u1Var, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, long j17) {
        super(2);
        this.f302435d = u1Var;
        this.f302436e = i17;
        this.f302437f = j5Var;
        this.f302438g = arrayList;
        this.f302439h = view;
        this.f302440i = str;
        this.f302441m = str2;
        this.f302442n = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        int i17;
        java.lang.Integer num;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject3;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var;
        r45.wm2 wm2Var;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        r45.nw1 m59258xd0557130;
        r45.dd2 dd2Var;
        r45.dd2 dd2Var2;
        java.lang.String str7;
        java.util.ArrayList arrayList;
        zl2.l lVar;
        long j17;
        int i18;
        java.lang.String str8;
        java.lang.Object obj3;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject6;
        r45.dm2 m76806xdef680642;
        r45.pm2 pm2Var2;
        r45.wm2 wm2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject8;
        r45.dd2 dd2Var3;
        r45.dd2 dd2Var4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject10;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.uo1 m76959xd0530b13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject11;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject12;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject13;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        cp2.u1 u1Var = this.f302435d;
        u1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveRoom pos: ");
        int i19 = this.f302436e;
        sb6.append(i19);
        sb6.append(" launchWithAnim: ");
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", sb6.toString());
        so2.j5 feed = this.f302437f;
        if (feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e30) {
            r45.uc1 uc1Var = new r45.uc1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e30 e30Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e30) feed;
            uc1Var.set(0, new java.util.LinkedList(e30Var.f188155o));
            r45.c72 c72Var = e30Var.f188156p;
            uc1Var.set(1, c72Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) c72Var.m75936x14adae67(0) : null);
            intent2.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", uc1Var.mo14344x5f01b1f6());
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f517454a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B1).mo141623x754a37bb()).r()).intValue() == 1;
        zl2.l lVar2 = zl2.l.f555398a;
        java.lang.String str12 = this.f302440i;
        java.lang.String str13 = this.f302441m;
        long j18 = this.f302442n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba33012 = u1Var.f302454b;
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(feed);
            intent2.putExtra("key_chnl_extra", u1Var.a(i19, this.f302439h, "onItemClick"));
            if (abstractC14499x6ba33012 == null || (str7 = abstractC14499x6ba33012.s0()) == null) {
                str7 = "";
            }
            intent2.putExtra("key_click_sub_tab_context_id", str7);
            boolean z18 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            long j19 = 0;
            if (abstractC14490x69736cb5 == null || (feedObject13 = abstractC14490x69736cb5.getFeedObject()) == null) {
                arrayList = arrayList2;
                lVar = lVar2;
                j17 = 0;
            } else {
                arrayList = arrayList2;
                lVar = lVar2;
                j17 = feedObject13.m59251x5db1b11();
            }
            intent2.putExtra("CURRENT_FEED_ID", j17);
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            int i27 = qs5.z.f448011a;
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 1);
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = u1Var.f302453a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            zy2.b8 b8Var = (zy2.b8) pf5.z.f435481a.a(activity).c(zy2.b8.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb52 != null && (feedObject12 = abstractC14490x69736cb52.getFeedObject()) != null) {
                j19 = feedObject12.m59251x5db1b11();
            }
            i17 = i19;
            r45.kc1 P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) b8Var).P6(j19);
            if (P6 != null) {
                i18 = 0;
                str8 = P6.m75945x2fec8307(0);
            } else {
                i18 = 0;
                str8 = null;
            }
            kc1Var.set(i18, str8);
            j42Var.set(i18, kc1Var);
            k42Var.set(i18, j42Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            k42Var.set(1, (abstractC14490x69736cb53 == null || (feedObject11 = abstractC14490x69736cb53.getFeedObject()) == null) ? null : feedObject11.m59226x730bcac6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb54 == null || (feedObject10 = abstractC14490x69736cb54.getFeedObject()) == null || (m59240x7c94657b = feedObject10.m59240x7c94657b()) == null || (m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd01666.m76959xd0530b13()) == null || (obj3 = m76959xd0530b13.m75945x2fec8307(1)) == null) {
                obj3 = "";
            }
            k42Var.set(3, obj3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            k42Var.set(2, (abstractC14490x69736cb55 == null || (feedObject9 = abstractC14490x69736cb55.getFeedObject()) == null) ? null : feedObject9.m59262xed29dd2b());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var.mo14344x5f01b1f6());
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            android.os.Bundle bundle = new android.os.Bundle();
            boolean z19 = abstractC14499x6ba33012 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba33012 : null;
            if (c14521x246f2bd == null || (dd2Var4 = c14521x246f2bd.f203052s) == null || (str9 = java.lang.Integer.valueOf(dd2Var4.m75939xb282bd08(0)).toString()) == null) {
                str9 = "";
            }
            bundle.putString("tab_id", str9);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd2 = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba33012 : null;
            if (c14521x246f2bd2 == null || (dd2Var3 = c14521x246f2bd2.f203053t) == null || (str10 = java.lang.Integer.valueOf(dd2Var3.m75939xb282bd08(0)).toString()) == null) {
                str10 = "";
            }
            bundle.putString("sub_tab_id", str10);
            bundle.putString("card_index", java.lang.String.valueOf(i17));
            intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
            jz5.l d17 = lVar.d(arrayList, feed, false);
            java.util.List list = (java.util.List) d17.f384366d;
            int intValue = ((java.lang.Number) d17.f384367e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, str12);
            wk0Var.set(1, str13);
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            r45.ta4 ta4Var = new r45.ta4();
            ta4Var.set(8, java.lang.Boolean.TRUE);
            wk0Var.set(7, ta4Var);
            num = 1;
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(u1Var.b().m75939xb282bd08(5)));
            boolean z27 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb56 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb56 == null || (feedObject8 = abstractC14490x69736cb56.getFeedObject()) == null || (str11 = feedObject8.m59273x80025a04()) == null) {
                str11 = "";
            }
            y74Var.set(2, str11);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb57 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            y74Var.set(5, (abstractC14490x69736cb57 == null || (feedObject7 = abstractC14490x69736cb57.getFeedObject()) == null) ? null : feedObject7.getFeedObject());
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var2 = new r45.ta4();
            java.util.LinkedList m75941xfb821914 = ta4Var2.m75941xfb821914(20);
            r45.qa4 qa4Var = new r45.qa4();
            str2 = "card_index";
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(j18));
            m75941xfb821914.add(qa4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb58 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb58 != null && (feedObject5 = abstractC14490x69736cb58.getFeedObject()) != null && (feedObject6 = feedObject5.getFeedObject()) != null && (m76806xdef680642 = feedObject6.m76806xdef68064()) != null && (pm2Var2 = (r45.pm2) m76806xdef680642.m75936x14adae67(12)) != null && (wm2Var2 = (r45.wm2) pm2Var2.m75936x14adae67(10)) != null) {
                ta4Var2.set(30, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wm2Var2.mo14344x5f01b1f6()));
            }
            wk0Var.set(7, ta4Var2);
            str = "";
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(u1Var.f302453a, intent2, list, intValue, wk0Var, null);
            abstractC14499x6ba3301 = abstractC14499x6ba33012;
        } else {
            str = "";
            i17 = i19;
            num = 1;
            str2 = "card_index";
            jz5.l d18 = lVar2.d(this.f302438g, feed, false);
            java.util.List list2 = (java.util.List) d18.f384366d;
            int intValue2 = ((java.lang.Number) d18.f384367e).intValue();
            r45.wk0 wk0Var2 = new r45.wk0();
            wk0Var2.set(0, str12);
            wk0Var2.set(1, str13);
            wk0Var2.set(2, java.lang.Boolean.FALSE);
            wk0Var2.set(3, 1001);
            wk0Var2.set(4, -1);
            wk0Var2.set(5, -1);
            r45.ta4 ta4Var3 = new r45.ta4();
            ta4Var3.set(8, java.lang.Boolean.TRUE);
            java.util.LinkedList m75941xfb8219142 = ta4Var3.m75941xfb821914(20);
            r45.qa4 qa4Var2 = new r45.qa4();
            qa4Var2.set(0, "UserClick");
            qa4Var2.set(1, java.lang.Long.valueOf(j18));
            m75941xfb8219142.add(qa4Var2);
            boolean z28 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb59 = z28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb59 != null && (feedObject2 = abstractC14490x69736cb59.getFeedObject()) != null && (feedObject3 = feedObject2.getFeedObject()) != null && (m76806xdef68064 = feedObject3.m76806xdef68064()) != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && (wm2Var = (r45.wm2) pm2Var.m75936x14adae67(10)) != null) {
                ta4Var3.set(30, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wm2Var.mo14344x5f01b1f6()));
            }
            wk0Var2.set(7, ta4Var3);
            r45.y74 y74Var2 = new r45.y74();
            y74Var2.set(1, java.lang.Integer.valueOf(u1Var.b().m75939xb282bd08(5)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb510 = z28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb510 == null || (feedObject = abstractC14490x69736cb510.getFeedObject()) == null || (str3 = feedObject.m59273x80025a04()) == null) {
                str3 = str;
            }
            y74Var2.set(2, str3);
            wk0Var2.set(6, y74Var2);
            abstractC14499x6ba3301 = abstractC14499x6ba33012;
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(u1Var.f302453a, intent2, list2, intValue2, wk0Var2, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        cl0.g gVar = new cl0.g();
        boolean z29 = abstractC14499x6ba3301 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd3 = z29 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
        if (c14521x246f2bd3 == null || (dd2Var2 = c14521x246f2bd3.f203052s) == null || (str4 = java.lang.Integer.valueOf(dd2Var2.m75939xb282bd08(0)).toString()) == null) {
            str4 = str;
        }
        gVar.s("tab_id", str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd4 = z29 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) abstractC14499x6ba3301 : null;
        if (c14521x246f2bd4 == null || (dd2Var = c14521x246f2bd4.f203053t) == null || (str5 = java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)).toString()) == null) {
            str5 = str;
        }
        gVar.s("sub_tab_id", str5);
        gVar.s("card_type", num);
        gVar.s(str2, java.lang.Integer.valueOf(i17));
        so2.h1 h1Var = feed instanceof so2.h1 ? (so2.h1) feed : null;
        if (h1Var == null || (feedObject4 = h1Var.getFeedObject()) == null || (m59258xd0557130 = feedObject4.m59258xd0557130()) == null || (str6 = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str6 = str;
        }
        gVar.s("liveid", str6);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z37 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        c6463x6ead4318.u(str);
        c6463x6ead4318.p(str);
        c6463x6ead4318.B(str);
        c6463x6ead4318.y(str);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = str;
        }
        c6463x6ead4318.w(Ri);
        java.lang.String m75945x2fec8307 = u1Var.b().m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = str;
        }
        c6463x6ead4318.r(m75945x2fec8307);
        c6463x6ead4318.q(u1Var.c());
        c6463x6ead4318.A(str);
        c6463x6ead4318.x(str);
        c6463x6ead4318.v(str);
        c6463x6ead4318.s("more_page_card");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        c6463x6ead4318.t(r26.i0.t(gVar2, ",", ";", false));
        c6463x6ead4318.z(((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        c6463x6ead4318.k();
        ig2.o.f372944a.a("startActivity");
        return jz5.f0.f384359a;
    }
}
