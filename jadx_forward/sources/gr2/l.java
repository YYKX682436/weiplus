package gr2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gr2.o f356314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f356315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f356316f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f356317g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f356318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356319i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356320m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f356321n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f356322o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f356323p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f356324q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gr2.o oVar, int i17, so2.j5 j5Var, java.util.ArrayList arrayList, android.view.View view, java.lang.String str, java.lang.String str2, int i18, android.os.Bundle bundle, so2.j5 j5Var2, long j17) {
        super(2);
        this.f356314d = oVar;
        this.f356315e = i17;
        this.f356316f = j5Var;
        this.f356317g = arrayList;
        this.f356318h = view;
        this.f356319i = str;
        this.f356320m = str2;
        this.f356321n = i18;
        this.f356322o = bundle;
        this.f356323p = j5Var2;
        this.f356324q = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        long j17;
        int i17;
        java.lang.String str2;
        java.lang.Object obj3;
        java.lang.String str3;
        int i18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.uo1 m76959xd0530b13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject7;
        int i19;
        java.lang.String str4;
        java.lang.Object obj4;
        int i27;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject8;
        r45.yz2 yz2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject10;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject11;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b132;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject12;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject13;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        gr2.o oVar = this.f356314d;
        oVar.getClass();
        so2.j5 j5Var = this.f356316f;
        if (j5Var instanceof vp2.j0) {
            r45.uc1 uc1Var = new r45.uc1();
            vp2.j0 j0Var = (vp2.j0) j5Var;
            uc1Var.set(0, new java.util.LinkedList(j0Var.f520462u));
            r45.c72 c72Var = j0Var.f520463v;
            uc1Var.set(1, c72Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) c72Var.m75936x14adae67(0) : null);
            intent2.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", uc1Var.mo14344x5f01b1f6());
        }
        if (j5Var instanceof vp2.i0) {
            vp2.i0 i0Var = (vp2.i0) j5Var;
            if (i0Var.f520461u) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 13);
                i0Var.f520461u = false;
            }
        }
        zl2.l lVar = zl2.l.f555398a;
        int i28 = this.f356315e;
        android.view.View view = this.f356318h;
        java.lang.String str6 = this.f356319i;
        java.lang.String str7 = this.f356320m;
        int i29 = this.f356321n;
        android.os.Bundle bundle = this.f356322o;
        android.content.Context context = oVar.f356331a;
        long j18 = 0;
        if (i29 == 3 || i29 == 6) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(j5Var);
            intent2.putExtra("key_chnl_extra", oVar.b(i28, view, "onItemClick"));
            boolean z17 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 == null || (feedObject7 = abstractC14490x69736cb5.getFeedObject()) == null) {
                str = "key_chnl_extra";
                j17 = 0;
            } else {
                str = "key_chnl_extra";
                j17 = feedObject7.m59251x5db1b11();
            }
            intent2.putExtra("CURRENT_FEED_ID", j17);
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            boolean z18 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            java.lang.String str8 = str;
            zy2.b8 b8Var = (zy2.b8) zVar.a(activityC0065xcd7aa112).c(zy2.b8.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb52 != null && (feedObject6 = abstractC14490x69736cb52.getFeedObject()) != null) {
                j18 = feedObject6.m59251x5db1b11();
            }
            r45.kc1 P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) b8Var).P6(j18);
            if (P6 != null) {
                i17 = 0;
                str2 = P6.m75945x2fec8307(0);
            } else {
                i17 = 0;
                str2 = null;
            }
            kc1Var.set(i17, str2);
            j42Var.set(i17, kc1Var);
            k42Var.set(i17, j42Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            k42Var.set(1, (abstractC14490x69736cb53 == null || (feedObject5 = abstractC14490x69736cb53.getFeedObject()) == null) ? null : feedObject5.m59226x730bcac6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb54 == null || (feedObject4 = abstractC14490x69736cb54.getFeedObject()) == null || (m59240x7c94657b = feedObject4.m59240x7c94657b()) == null || (m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd01666.m76959xd0530b13()) == null || (obj3 = m76959xd0530b13.m75945x2fec8307(1)) == null) {
                obj3 = "";
            }
            k42Var.set(3, obj3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            k42Var.set(2, (abstractC14490x69736cb55 == null || (feedObject3 = abstractC14490x69736cb55.getFeedObject()) == null) ? null : feedObject3.m59262xed29dd2b());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var.mo14344x5f01b1f6());
            if (z17) {
                intent2.putExtra("CURRENT_FEED_ID", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11());
            }
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            if (bundle != null) {
                intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
                intent2.putExtra(str8, oVar.a(bundle));
            }
            jz5.l d17 = lVar.d(arrayList, j5Var, false);
            java.util.List list = (java.util.List) d17.f384366d;
            int intValue = ((java.lang.Number) d17.f384367e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, str6);
            wk0Var.set(1, str7);
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            y74Var.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5)));
            boolean z19 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb56 = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb56 == null || (feedObject2 = abstractC14490x69736cb56.getFeedObject()) == null || (str3 = feedObject2.m59273x80025a04()) == null) {
                str3 = "";
            }
            y74Var.set(2, str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb57 = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb57 == null || (feedObject = abstractC14490x69736cb57.getFeedObject()) == null) {
                i18 = 5;
                c19792x256d2725 = null;
            } else {
                c19792x256d2725 = feedObject.getFeedObject();
                i18 = 5;
            }
            y74Var.set(i18, c19792x256d2725);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            java.util.LinkedList m75941xfb821914 = ta4Var.m75941xfb821914(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f356324q));
            m75941xfb821914.add(qa4Var);
            wk0Var.set(7, ta4Var);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(oVar.f356331a, intent2, list, intValue, wk0Var, null);
        } else {
            intent2.putExtra("key_chnl_extra", oVar.b(i28, view, "onItemClick"));
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            boolean z27 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            if (z27) {
                intent2.putExtra("CURRENT_FEED_ID", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject().m59251x5db1b11());
            }
            if (bundle != null) {
                intent2.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
                intent2.putExtra("key_chnl_extra", oVar.a(bundle));
            }
            r45.k42 k42Var2 = new r45.k42();
            r45.j42 j42Var2 = new r45.j42();
            r45.kc1 kc1Var2 = new r45.kc1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            boolean z28 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            zy2.b8 b8Var2 = (zy2.b8) zVar2.a(activityC0065xcd7aa1122).c(zy2.b8.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb58 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            r45.kc1 P62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) b8Var2).P6((abstractC14490x69736cb58 == null || (feedObject13 = abstractC14490x69736cb58.getFeedObject()) == null) ? 0L : feedObject13.m59251x5db1b11());
            if (P62 != null) {
                i19 = 0;
                str4 = P62.m75945x2fec8307(0);
            } else {
                i19 = 0;
                str4 = null;
            }
            kc1Var2.set(i19, str4);
            j42Var2.set(i19, kc1Var2);
            k42Var2.set(i19, j42Var2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb59 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            k42Var2.set(1, (abstractC14490x69736cb59 == null || (feedObject12 = abstractC14490x69736cb59.getFeedObject()) == null) ? null : feedObject12.m59226x730bcac6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb510 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb510 == null || (feedObject11 = abstractC14490x69736cb510.getFeedObject()) == null || (m59240x7c94657b2 = feedObject11.m59240x7c94657b()) == null || (m76802x2dd016662 = m59240x7c94657b2.m76802x2dd01666()) == null || (m76959xd0530b132 = m76802x2dd016662.m76959xd0530b13()) == null || (obj4 = m76959xd0530b132.m75945x2fec8307(1)) == null) {
                obj4 = "";
            }
            k42Var2.set(3, obj4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb511 = z27 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            k42Var2.set(2, (abstractC14490x69736cb511 == null || (feedObject10 = abstractC14490x69736cb511.getFeedObject()) == null) ? null : feedObject10.m59262xed29dd2b());
            intent2.putExtra("PRE_JOIN_LIVE_INFO", k42Var2.mo14344x5f01b1f6());
            intent2.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            r45.q92 q92Var = new r45.q92();
            java.util.ArrayList<so2.j5> arrayList2 = this.f356317g;
            for (so2.j5 j5Var2 : arrayList2) {
                if (j5Var2 instanceof wp2.b) {
                    wp2.b bVar = (wp2.b) j5Var2;
                    if (bVar.getFeedObject().f66939xc8a07680 != 0) {
                        q92Var.m75941xfb821914(0).add(java.lang.Long.valueOf(bVar.getFeedObject().f66939xc8a07680));
                    }
                }
            }
            so2.j5 j5Var3 = this.f356323p;
            boolean z29 = j5Var3 instanceof vp2.q;
            if (z29) {
                java.util.LinkedList m75941xfb8219142 = q92Var.m75941xfb821914(0);
                java.util.ArrayList arrayList3 = ((vp2.q) j5Var3).f520484e;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    so2.j5 j5Var4 = (so2.j5) it.next();
                    vp2.p pVar = j5Var4 instanceof vp2.p ? (vp2.p) j5Var4 : null;
                    arrayList4.add((pVar == null || (feedObject9 = pVar.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject9.f66939xc8a07680));
                }
                m75941xfb8219142.addAll(arrayList4);
            }
            q92Var.set(2, j5Var instanceof wp2.b ? ((wp2.b) j5Var).f529917p.f455665n : z29 ? ((vp2.q) j5Var3).f520483d.f455665n : null);
            dr2.c cVar = oVar.f356333c;
            q92Var.set(1, (cVar == null || (yz2Var = ((wq2.e) cVar).f530055a.f530065d) == null) ? null : yz2Var.f473055i);
            if (!q92Var.m75941xfb821914(0).isEmpty()) {
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_SQUARE_EXTRA_INFO", q92Var.mo14344x5f01b1f6());
            }
            jz5.l d18 = lVar.d(arrayList2, j5Var, false);
            java.util.List list2 = (java.util.List) d18.f384366d;
            int intValue2 = ((java.lang.Number) d18.f384367e).intValue();
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar3 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar3.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n == 182) {
                for (int i37 = 0; i37 < intValue2; i37++) {
                    java.util.ArrayList arrayList5 = list2 instanceof java.util.ArrayList ? (java.util.ArrayList) list2 : null;
                    if (arrayList5 != null) {
                    }
                }
                i27 = 0;
                intValue2 = 0;
            } else {
                i27 = 0;
            }
            r45.wk0 wk0Var2 = new r45.wk0();
            wk0Var2.set(i27, str6);
            wk0Var2.set(1, str7);
            wk0Var2.set(2, java.lang.Boolean.FALSE);
            wk0Var2.set(3, 1001);
            wk0Var2.set(4, -1);
            wk0Var2.set(5, 1);
            r45.y74 y74Var2 = new r45.y74();
            pf5.z zVar4 = pf5.z.f435481a;
            if (!z28) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            y74Var2.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar4.a(activityC0065xcd7aa1122).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb512 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb512 == null || (feedObject8 = abstractC14490x69736cb512.getFeedObject()) == null || (str5 = feedObject8.m59273x80025a04()) == null) {
                str5 = "";
            }
            y74Var2.set(2, str5);
            wk0Var2.set(6, y74Var2);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(oVar.f356331a, intent2, list2, intValue2, wk0Var2, null);
        }
        ig2.o.f372944a.a("startActivity");
        return jz5.f0.f384359a;
    }
}
