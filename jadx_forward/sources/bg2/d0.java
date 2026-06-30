package bg2;

/* loaded from: classes3.dex */
public final class d0 extends tc2.c implements tc2.h, uc2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101531e;

    /* renamed from: f, reason: collision with root package name */
    public we2.p f101532f;

    /* renamed from: g, reason: collision with root package name */
    public ag2.d f101533g;

    /* renamed from: h, reason: collision with root package name */
    public volatile r45.b94 f101534h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f101535i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101536m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f101537n;

    /* renamed from: o, reason: collision with root package name */
    public int f101538o;

    /* renamed from: p, reason: collision with root package name */
    public int f101539p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f101540q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101531e = "LiveConvertCommentListController";
        r45.b94 b94Var = new r45.b94();
        b94Var.set(0, 100);
        b94Var.set(10, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 400)));
        b94Var.set(11, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 1)));
        b94Var.set(12, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400)));
        this.f101534h = b94Var;
        this.f101535i = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f101540q = java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0 A[SYNTHETIC] */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H0(r45.r71 r14) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d0.H0(r45.r71):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tc2.c
    public void Q6() {
        in5.s0 s0Var;
        r45.zg6 zg6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        r45.kr0 d17;
        java.util.LinkedList m75941xfb821914;
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        r45.kz3 kz3Var = null;
        if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59240x7c94657b = feedObject.m59240x7c94657b()) != null && (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b)) != null && (m75941xfb821914 = d17.m75941xfb821914(12)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.kz3 kz3Var2 = (r45.kz3) next;
                if (kz3Var2.m75939xb282bd08(0) == 23 && ((r45.zg6) kz3Var2.m75936x14adae67(14)) != null) {
                    kz3Var = next;
                    break;
                }
            }
            kz3Var = kz3Var;
        }
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.H7).mo141623x754a37bb()).r()).booleanValue();
        this.f101537n = kz3Var != null || booleanValue;
        this.f101538o = (kz3Var == null || (zg6Var = (r45.zg6) kz3Var.m75936x14adae67(14)) == null) ? 0 : zg6Var.m75939xb282bd08(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svr = ");
        sb6.append(kz3Var != null);
        sb6.append(", local = ");
        sb6.append(booleanValue);
        sb6.append(", delay:");
        sb6.append(this.f101538o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101531e, sb6.toString());
        if (this.f101537n && (s0Var = gVar.f498682i) != null) {
            we2.p pVar = new we2.p();
            pVar.g(new bg2.y(this));
            this.f101532f = pVar;
            this.f101533g = new ag2.d(pVar, new bg2.z(this, s0Var), new bg2.a0(this));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6 = Z6();
            if (Z6 != null) {
                android.content.Context context = s0Var.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                Z6.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1547x31c90fad.C14423xb0a0cdaf(context));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z62 = Z6();
            if (Z62 == null) {
                return;
            }
            Z62.mo7960x6cab2c8d(this.f101533g);
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        android.content.Context context;
        zy2.ra Sj;
        if (this.f101537n) {
            tc2.g gVar = this.f498674d;
            in5.s0 s0Var = gVar.f498682i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
            in5.s0 s0Var2 = gVar.f498682i;
            so2.j5 j5Var = s0Var2 != null ? (so2.j5) s0Var2.f374658i : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
            ml2.u1 u1Var = ml2.u1.f409581g3;
            jz5.l[] lVarArr = new jz5.l[2];
            if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            lVarArr[1] = new jz5.l("comment_count", java.lang.String.valueOf(this.f101539p));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        this.f101537n = false;
        ag2.d dVar = this.f101533g;
        if (dVar != null) {
            dVar.f86228n.clear();
            dVar.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6 = Z6();
        if (Z6 != null) {
            Z6.setVisibility(8);
        }
        this.f101535i.clear();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101536m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f101536m = null;
        this.f101539p = 0;
    }

    public final void Y6(java.util.List list) {
        if (!list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101531e, "dealWithMsgList  msgList size:" + list.size());
            pm0.v.X(new bg2.x(this, list));
        }
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        if (s0Var != null) {
            return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570) s0Var.p(com.p314xaae8f345.mm.R.id.tic);
        }
        return null;
    }

    public final void a7() {
        android.view.View p17;
        android.view.View p18;
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        if (s0Var != null && (p18 = s0Var.p(com.p314xaae8f345.mm.R.id.hyr)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(p18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bg2.o5 o5Var = (bg2.o5) N6(bg2.o5.class);
        if (o5Var != null) {
            o5Var.f101901n = 8;
        }
        in5.s0 s0Var2 = gVar.f498682i;
        if (s0Var2 == null || (p17 = s0Var2.p(com.p314xaae8f345.mm.R.id.iho)) == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(p17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
