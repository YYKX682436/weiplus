package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class zf extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe {
    public static java.lang.String D1 = "1";
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13695x90c81d08 A1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13696xe0bc050d B1;
    public volatile boolean C1;

    /* renamed from: l1, reason: collision with root package name */
    public final int f186642l1;

    /* renamed from: p1, reason: collision with root package name */
    public final java.lang.String f186643p1;

    /* renamed from: x1, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f186644x1;

    /* renamed from: y0, reason: collision with root package name */
    public final cw2.f8 f186645y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f186646y1;

    /* renamed from: z1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13694x13cb4d1f f186647z1;

    public /* synthetic */ zf(cw2.f8 f8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var, boolean z17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f8Var, k8Var, (i19 & 4) != 0 ? false : z17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? 0 : i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf r9, long r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.Cif
            if (r0 == 0) goto L16
            r0 = r12
            com.tencent.mm.plugin.finder.convert.if r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.Cif) r0
            int r1 = r0.f185198f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f185198f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.convert.if r0 = new com.tencent.mm.plugin.finder.convert.if
            r0.<init>(r9, r12)
        L1b:
            java.lang.Object r12 = r0.f185196d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f185198f
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto Ld1
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r5 = 0
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto Ld6
            in5.s0 r12 = r9.T1(r10)
            if (r12 == 0) goto Ld6
            android.view.View r2 = r12.f3639x46306858
            boolean r2 = r2.isShown()
            java.lang.String r5 = r9.f186643p1
            if (r2 != 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "deleteLiveFeed not same pos: "
            r9.<init>(r10)
            int r10 = r12.m8183xf806b362()
            r9.append(r10)
            java.lang.String r10 = " isShown = false"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r9)
            goto Ld6
        L6a:
            int r2 = r12.m8183xf806b362()
            androidx.recyclerview.widget.RecyclerView r6 = r9.f185890J
            if (r6 == 0) goto L7d
            androidx.recyclerview.widget.f2 r6 = r6.mo7946xf939df19()
            if (r6 == 0) goto L7d
            int r6 = r6.mo1894x7e414b06()
            goto L7e
        L7d:
            r6 = 0
        L7e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "deleteLiveFeed itemCount: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = " adapterPosition: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
            int r5 = r2 + 1
            if (r5 >= r6) goto Ld6
            if (r2 < 0) goto Ld6
            java.lang.Object r12 = r12.f374658i
            boolean r2 = r12 instanceof so2.h1
            r5 = 0
            if (r2 == 0) goto La7
            so2.h1 r12 = (so2.h1) r12
            goto La8
        La7:
            r12 = r5
        La8:
            if (r12 != 0) goto Lab
            goto Lad
        Lab:
            r12.f491913g = r4
        Lad:
            androidx.recyclerview.widget.RecyclerView r12 = r9.f185890J
            if (r12 == 0) goto Ld6
            tb2.h r2 = new tb2.h
            r2.<init>(r12)
            r12.m7964x8d4ad49c(r2)
            com.tencent.mm.plugin.finder.convert.jf r2 = new com.tencent.mm.plugin.finder.convert.jf
            r2.<init>(r9, r10)
            r12.post(r2)
            kotlinx.coroutines.p0 r12 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.plugin.finder.convert.kf r2 = new com.tencent.mm.plugin.finder.convert.kf
            r2.<init>(r9, r10, r5)
            r0.f185198f = r4
            java.lang.Object r12 = p3325xe03a0797.p3326xc267989b.l.g(r12, r2, r0)
            if (r12 != r1) goto Ld1
            goto Ld7
        Ld1:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r12.booleanValue()
        Ld6:
            r1 = r3
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.O1(com.tencent.mm.plugin.finder.convert.zf, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ void Q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, long j17, boolean z17, java.lang.Integer num, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkDeleteLiveFeed");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 8) != 0) {
            str = null;
        }
        zfVar.P1(j17, z18, num, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void A0(ec2.f ev6) {
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f185890J;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null || (s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf, ev6.f332498j, false, 2, null)) == null) {
            return;
        }
        java.lang.Object obj = s0Var.f374658i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var == null) {
            return;
        }
        this.f186384e.g(s0Var, ev6);
        if (h1Var.getFeedObject().m59312x7b7fa34a()) {
            return;
        }
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = h1Var.getFeedObject().getFeedObject();
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        r45.qt2 V6 = Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null;
        ((b92.d1) zbVar).getClass();
        dk2.u6.f315704a.e(context, feedObject, V6, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void B0(ec2.f ev6) {
        in5.s0 s0Var;
        r45.nw1 m76794xd0557130;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f185890J;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf == null || (s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf, ev6.f332498j, false, 2, null)) == null) {
            return;
        }
        java.lang.Object obj = s0Var.f374658i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var == null) {
            return;
        }
        this.f186384e.h(s0Var, ev6);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
        int i18 = Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216913n : 0;
        if (h1Var.getFeedObject().m59312x7b7fa34a()) {
            return;
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        dk2.u6 u6Var = dk2.u6.f315704a;
        r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
        java.lang.String m75945x2fec8307 = m59258xd0557130 != null ? m59258xd0557130.m75945x2fec8307(3) : null;
        boolean z17 = true;
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) || ((i17 = this.f185893h) != 1 && i17 != 3 && i17 != 4 && i17 != 35 && i18 != 1)) {
            z17 = false;
        }
        if (z17) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = h1Var.getFeedObject().getFeedObject();
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            zy2.ra Sj2 = ((c61.p2) ybVar2).Sj(context);
            r45.qt2 V6 = Sj2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj2).V6() : null;
            ((b92.d1) zbVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
            long j17 = dk2.u6.f315713j;
            r45.nw1 m76794xd05571302 = finderObject.m76794xd0557130();
            if (j17 == (m76794xd05571302 != null ? m76794xd05571302.m75942xfb822ef2(0) : 0L)) {
                return;
            }
            r45.nw1 m76794xd05571303 = finderObject.m76794xd0557130();
            dk2.u6.f315713j = m76794xd05571303 != null ? m76794xd05571303.m75942xfb822ef2(0) : 0L;
            r45.nw1 m76794xd05571304 = finderObject.m76794xd0557130();
            boolean A = pm0.v.A(m76794xd05571304 != null ? m76794xd05571304.m75942xfb822ef2(57) : 0L, 1L);
            int i19 = dk2.u6.f315706c;
            if (A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", "[needJoinLiveOnExposure] true");
                if (zl2.q4.f555466a.E()) {
                    db5.t7.m123883x26a183b(context, "当前直播feed曝光即上报", 0).show();
                }
            } else {
                r45.nw1 m76794xd05571305 = finderObject.m76794xd0557130();
                r5 = ((m76794xd05571305 != null ? m76794xd05571305.m75939xb282bd08(38) : 0) <= 0 || (m76794xd0557130 = finderObject.m76794xd0557130()) == null) ? i19 : m76794xd0557130.m75939xb282bd08(38);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlayLiveOnFeedFlow: validWatchTime:");
            sb6.append(r5);
            sb6.append(", serverConfigTime:");
            r45.nw1 m76794xd05571306 = finderObject.m76794xd0557130();
            sb6.append(m76794xd05571306 != null ? java.lang.Integer.valueOf(m76794xd05571306.m75939xb282bd08(38)) : null);
            sb6.append(", clientValidWatchTime:");
            sb6.append(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFeedFlowReporter", sb6.toString());
            dk2.u6.f315705b = new dk2.r6(r5, context, finderObject, V6);
            dk2.u6.f315707d.c(r5 * 1000, 0L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void D0(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var, int i17, int i18, boolean z18, long j18, int i19, int i27) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void K(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, int i18) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (b2()) {
            return;
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.iar);
        if (V1(item)) {
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y();
        yVar.f214900c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) holder.p(com.p314xaae8f345.mm.R.id.ghd);
        yVar.f214901d = this.f186645y0;
        yVar.f214899b = this.f185893h;
        yVar.f214903f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hf(p17, holder, item, this);
        c15324x3354d808.a(item, yVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public int P() {
        return 9;
    }

    public final void P1(long j17, boolean z17, java.lang.Integer num, java.lang.String str) {
        java.lang.String str2 = this.f186643p1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkDeleteLiveFeed feedId: " + j17 + " isNeedCheck: " + z17);
        in5.s0 T1 = T1(j17);
        if (T1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) T1.f374658i;
            if ((abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L) != j17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDeleteLiveFeed isShown = false, feedId: ");
                sb6.append(j17);
                sb6.append(" deleteJob: ");
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f186644x1;
                sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb6.toString());
                return;
            }
            if (!z17 || (num != null && num.intValue() == 2)) {
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f186644x1;
                if (r2Var2 != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                }
                this.f186644x1 = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ff(abstractC14490x69736cb5, this, j17, T1, num, str, null), 3, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkDeleteLiveFeed status not end, feedId: " + j17);
            }
            r1 = jz5.f0.f384359a;
        }
        if (r1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkDeleteLiveFeed cur holder = null feedId, " + j17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void R0(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.Boolean bool) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd c15287xabbcfcd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15287xabbcfcd) holder.p(com.p314xaae8f345.mm.R.id.efq);
        if (c15287xabbcfcd == null) {
            return;
        }
        c15287xabbcfcd.setVisibility(8);
    }

    public final void R1(in5.s0 holder, android.widget.FrameLayout frameLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        uc2.b bVar = (uc2.b) this.f186384e.a(holder, uc2.b.class);
        if (bVar != null) {
            bg2.x0 x0Var = (bg2.x0) bVar;
            if (x0Var.f102152n) {
                x0Var.f102148g = frameLayout;
                cg2.k kVar = x0Var.f102149h;
                if (kVar != null) {
                    kVar.getBulletManager().d(x0Var.f102157s, z17);
                    pm0.v.V(100L, new bg2.o0(x0Var));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void S0(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
    }

    public final void S1(so2.j5 feed, in5.s0 holder, boolean z17, android.content.Intent intent) {
        java.lang.String str;
        java.util.HashSet hashSet;
        r45.dm2 m76806xdef68064;
        r45.pm2 pm2Var;
        android.content.Intent intent2;
        r45.dm2 m76806xdef680642;
        r45.cl2 cl2Var;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject3;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.uo1 m76959xd0530b13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject7;
        android.content.Intent intent3;
        java.lang.String stringExtra;
        android.content.Intent intent4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject8;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject10;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        boolean z18 = feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
        intent.putExtra("CURRENT_FEED_ID", (abstractC14490x69736cb5 == null || (feedObject10 = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject10.m59251x5db1b11());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
        intent.putExtra("key_ad_flag", (abstractC14490x69736cb52 == null || (feedObject8 = abstractC14490x69736cb52.getFeedObject()) == null || (feedObject9 = feedObject8.getFeedObject()) == null) ? 0 : feedObject9.m76752x103fd925());
        intent.putExtra("LAUNCH_WITH_ANIM", z17);
        intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
        intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", false);
        android.content.Context context = holder.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String stringExtra2 = (activity == null || (intent4 = activity.getIntent()) == null) ? null : intent4.getStringExtra("key_jsapi_bypass");
        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "enterLive, byPass:" + stringExtra2);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra2);
                intent.putExtra("key_enter_live_param_by_pass_type", jSONObject.optInt("by_pass_type"));
                intent.putExtra("key_enter_live_param_by_pass_info", jSONObject.optString("by_pass_info"));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FeedFullLiveConvert", th6, "byPassJson error", new java.lang.Object[0]);
            }
        }
        android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String str2 = "";
        if (activity2 != null && (intent3 = activity2.getIntent()) != null && (stringExtra = intent3.getStringExtra("key_extra_info")) != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI origin chnl_extra:".concat(stringExtra));
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(r26.i0.t(stringExtra, ";", ",", false));
                java.lang.String stringExtra3 = intent.getStringExtra("key_chnl_extra");
                org.json.JSONObject put = stringExtra3 != null ? new org.json.JSONObject(r26.i0.t(stringExtra3, ";", ",", false)).put("s1s", jSONObject2.optJSONObject("s1s")) : null;
                if (put != null) {
                    jSONObject2 = put;
                }
                intent.putExtra("key_chnl_extra", jSONObject2.toString());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI final chnl_extra:".concat(stringExtra));
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FeedFullLiveConvert", th7, "", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d = this.f185891f.getF204176d();
        if (f204176d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            long m59251x5db1b11 = (abstractC14490x69736cb53 == null || (feedObject7 = abstractC14490x69736cb53.getFeedObject()) == null) ? 0L : feedObject7.m59251x5db1b11();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "[enterLiveVisitorUI] objectId = ".concat(pm0.v.u(m59251x5db1b11)));
            r45.k42 k42Var = new r45.k42();
            r45.j42 j42Var = new r45.j42();
            r45.kc1 kc1Var = new r45.kc1();
            r45.kc1 P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) ((zy2.b8) pf5.z.f435481a.a(f204176d).c(zy2.b8.class))).P6(m59251x5db1b11);
            kc1Var.set(0, P6 != null ? P6.m75945x2fec8307(0) : null);
            j42Var.set(0, kc1Var);
            k42Var.set(0, j42Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            k42Var.set(1, (abstractC14490x69736cb54 == null || (feedObject6 = abstractC14490x69736cb54.getFeedObject()) == null) ? null : feedObject6.m59226x730bcac6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb55 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            if (abstractC14490x69736cb55 == null || (feedObject5 = abstractC14490x69736cb55.getFeedObject()) == null || (m59240x7c94657b = feedObject5.m59240x7c94657b()) == null || (m76802x2dd01666 = m59240x7c94657b.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd01666.m76959xd0530b13()) == null || (obj = m76959xd0530b13.m75945x2fec8307(1)) == null) {
                obj = "";
            }
            k42Var.set(3, obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb56 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
            k42Var.set(2, (abstractC14490x69736cb56 == null || (feedObject4 = abstractC14490x69736cb56.getFeedObject()) == null) ? null : feedObject4.m59262xed29dd2b());
            intent.putExtra("PRE_JOIN_LIVE_INFO", k42Var.mo14344x5f01b1f6());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb57 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject11 = (abstractC14490x69736cb57 == null || (feedObject3 = abstractC14490x69736cb57.getFeedObject()) == null) ? null : feedObject3.getFeedObject();
        int i17 = this.f186642l1;
        if (i17 != 0 && feedObject11 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "enterLiveVisitorUI rewrite commentScene:" + i17 + " sessionBuffer:" + feedObject11.m76829x97edf6c0());
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).rk(feedObject11, i17, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(feed);
        jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, feed);
        java.util.List list = (java.util.List) Ai.f384366d;
        int intValue = ((java.lang.Number) Ai.f384367e).intValue();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb58 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
        if (abstractC14490x69736cb58 == null || (feedObject2 = abstractC14490x69736cb58.getFeedObject()) == null || (str = feedObject2.m59273x80025a04()) == null) {
            str = "";
        }
        y74Var.set(2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb59 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed : null;
        y74Var.set(5, (abstractC14490x69736cb59 == null || (feedObject = abstractC14490x69736cb59.getFeedObject()) == null) ? null : feedObject.getFeedObject());
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        ta4Var.set(10, java.lang.Integer.valueOf(holder.m8183xf806b362() + 1));
        if (feedObject11 != null && (m76806xdef680642 = feedObject11.m76806xdef68064()) != null && (cl2Var = (r45.cl2) m76806xdef680642.m75936x14adae67(4)) != null && (m75945x2fec8307 = cl2Var.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        byte[] bytes = str2.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        ta4Var.set(1, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length));
        android.app.Activity activity3 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean booleanExtra = (activity3 == null || (intent2 = activity3.getIntent()) == null) ? true : intent2.getBooleanExtra("key_jsapi_enable_history", true);
        if (!booleanExtra) {
            ta4Var.set(25, java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "enableHistory:" + booleanExtra);
        }
        if (feedObject11 != null && (m76806xdef68064 = feedObject11.m76806xdef68064()) != null && (pm2Var = (r45.pm2) m76806xdef68064.m75936x14adae67(12)) != null && ((r45.wm2) pm2Var.m75936x14adae67(10)) != null) {
            r45.wm2 wm2Var = new r45.wm2();
            nv2.h1 h1Var = nv2.n1.f422083g;
            nv2.n1 n1Var = nv2.n1.f422084h;
            wm2Var.set(0, java.lang.Integer.valueOf(((java.lang.Boolean) n1Var.k(feedObject11).f384366d).booleanValue() ? 1 : 0));
            wm2Var.set(1, java.lang.Integer.valueOf(n1Var.l(feedObject11)));
            wm2Var.set(3, n1Var.h(feedObject11));
            ta4Var.set(30, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(wm2Var.mo14344x5f01b1f6()));
        }
        wk0Var.set(7, ta4Var);
        r45.u74 u74Var = new r45.u74();
        r45.ta4 ta4Var2 = (r45.ta4) wk0Var.m75936x14adae67(7);
        u74Var.set(0, ta4Var2 != null ? ta4Var2.m75934xbce7f2f(1) : null);
        so2.h1 h1Var2 = feed instanceof so2.h1 ? (so2.h1) feed : null;
        u74Var.set(1, h1Var2 != null ? h1Var2.f491912f : null);
        wk0Var.set(8, u74Var);
        tc2.b bVar = this.f186384e;
        bVar.getClass();
        tc2.g c18 = bVar.c(holder);
        if (c18 != null && (hashSet = c18.f498677d) != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.Object obj2 = (tc2.c) it.next();
                tc2.h hVar = obj2 instanceof tc2.h ? (tc2.h) obj2 : null;
                if (hVar != null) {
                    hVar.g5(intent, wk0Var);
                }
            }
        }
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((vd2.f1) e0Var).Ni(context, intent, list, intValue, wk0Var, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void T0(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final in5.s0 T1(long j17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f185890J;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        if (c22848x6ddd90cf != null) {
            return (in5.s0) in5.n0.Y(c22848x6ddd90cf, j17, false, 2, null);
        }
        return null;
    }

    public final java.util.Map U1(r45.nw1 nw1Var) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[3];
        boolean z17 = false;
        lVarArr[0] = new jz5.l("live_id", nw1Var != null ? pm0.v.u(nw1Var.m75942xfb822ef2(0)) : 0);
        if (nw1Var != null && nw1Var.m75939xb282bd08(2) == 1) {
            z17 = true;
        }
        if (z17) {
            ml2.v1 v1Var = ml2.v1.f409673e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f409673e;
            j17 = 2;
        }
        lVarArr[1] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        lVarArr[2] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }

    public final boolean V1(so2.h1 h1Var) {
        r45.rp1 rp1Var;
        r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
        if ((m59258xd0557130 == null || (rp1Var = (r45.rp1) m59258xd0557130.m75936x14adae67(45)) == null || rp1Var.m75939xb282bd08(0) != 1 || rp1Var.m75939xb282bd08(3) == 1) ? false : true) {
            return true;
        }
        r45.nw1 m59258xd05571302 = h1Var.getFeedObject().m59258xd0557130();
        java.lang.String m75945x2fec8307 = m59258xd05571302 != null ? m59258xd05571302.m75945x2fec8307(3) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return true;
        }
        r45.nw1 m59258xd05571303 = h1Var.getFeedObject().m59258xd0557130();
        if ((m59258xd05571303 == null || cm2.a.f124861a.u(m59258xd05571303, "", m59258xd05571303.m75942xfb822ef2(0))) ? false : true) {
            return true;
        }
        r45.nw1 m59258xd05571304 = h1Var.getFeedObject().m59258xd0557130();
        return m59258xd05571304 != null && m59258xd05571304.m75939xb282bd08(42) == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void W0(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (b2()) {
            return;
        }
        super.W0(holder);
        java.lang.Object obj = holder.f374658i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var != null) {
            Y1(holder, h1Var, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /* renamed from: W1, reason: merged with bridge method [inline-methods] */
    public void u0(in5.s0 holder, android.view.View view, so2.h1 item, android.view.MotionEvent motionEvent) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (b2()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "[onMediaLongClick] feedId=".concat(pm0.v.u(item.mo2128x1ed62e84())));
        D1 = "1";
        if (C(item) && item.getFeedObject().getMediaType() == 9 && !item.getIsPreview()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Aa).mo141623x754a37bb()).r()).intValue();
            android.content.Context context = holder.f374654e;
            if (intValue == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f185891f;
                if (!k8Var.d0()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
                    k0Var.f293405n = k8Var.Y(item, k0Var);
                    k0Var.f293414s = k8Var.c4(item, holder);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ni(holder, item.mo2128x1ed62e84(), item.getFeedObject());
                    db5.g4 g4Var = new db5.g4(context);
                    k8Var.Y(item, k0Var).mo887xc459429a(g4Var);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(g4Var.f309877d)) {
                        view.performHapticFeedback(0, 2);
                        k0Var.v();
                    }
                }
            }
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            zy2.ra Sj = ((c61.p2) ybVar).Sj(context);
            java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216913n) : null);
            zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            java.lang.String str = Sj2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj2).f216915p : null;
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.S1;
            jz5.l[] lVarArr = new jz5.l[4];
            r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = item.getFeedObject().getFeedObject();
            lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(feedObject != null ? java.lang.Long.valueOf(feedObject.m76784x5db1b11()) : null));
            lVarArr[2] = new jz5.l("panel_sence", "1");
            lVarArr[3] = new jz5.l("sessionBuffer", item.g0());
            zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), str, valueOf, item.g0(), null, false, 96, null);
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.u1 u1Var2 = ml2.u1.T1;
            jz5.l[] lVarArr2 = new jz5.l[3];
            r45.nw1 m59258xd05571302 = item.getFeedObject().m59258xd0557130();
            lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = item.getFeedObject().getFeedObject();
            lVarArr2[1] = new jz5.l("feedid", pm0.v.u(feedObject2 != null ? feedObject2.m76784x5db1b11() : 0L));
            lVarArr2[2] = new jz5.l("panel_sence", "1");
            zy2.zb.I8(zbVar2, u1Var2, kz5.c1.l(lVarArr2), str, valueOf, item.g0(), null, false, 96, null);
            view.performHapticFeedback(0, 2);
            n0(holder, item, view, 2);
        }
        tc2.b bVar = this.f186384e;
        bVar.getClass();
        tc2.g c19 = bVar.c(holder);
        if (c19 == null || (hashSet = c19.f498677d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).T6(view);
        }
    }

    public final void X1(in5.s0 s0Var) {
        if (b2()) {
            android.view.View view = s0Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            int childCount = ((android.view.ViewGroup) view).getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View view2 = s0Var.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.View childAt = ((android.view.ViewGroup) view2).getChildAt(i17);
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.jdk))) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(4);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshContainerForEnterLiveRoom", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshContainerForEnterLiveRoom", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(in5.s0 r24, so2.h1 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.Y1(in5.s0, so2.h1, boolean):void");
    }

    public final void Z1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject, int i17, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(feedObject.getFeedObject().m76784x5db1b11()));
        jn0Var.set(12, feedObject.m59229xb5af1dd5());
        jn0Var.set(1, feedObject.getFeedObject().m76836x6c03c64c());
        jn0Var.set(2, feedObject.getFeedObject().m76829x97edf6c0());
        jn0Var.set(5, java.lang.Integer.valueOf(feedObject.getMediaType()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "live expose adFlag : " + feedObject.getFeedObject().m76752x103fd925() + " actionType: " + i17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", i17);
        jSONObject.put("value", java.lang.System.currentTimeMillis() / ((long) 1000));
        jn0Var.set(3, jSONObject.toString());
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        ((c61.l7) b6Var).al(Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null, 18054, jn0Var);
    }

    public final void a2(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (b2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
            if (abstractC15229x2dc379 != null) {
                abstractC15229x2dc379.m61652x7f02fdf3().setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                abstractC15229x2dc379.requestLayout();
            }
            java.lang.Object obj = holder.f374658i;
            so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
            if (h1Var != null) {
                uc2.d dVar = (uc2.d) this.f186384e.a(holder, uc2.d.class);
                if (dVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf) dVar).Z6(holder, false, true);
                }
                holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tp6, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
                if (dVar != null) {
                    uc2.d.E5(dVar, holder, c15316x68272fd9 != null ? c15316x68272fd9.m61652x7f02fdf3() : null, h1Var, true, false, 16, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b2() {
        /*
            r9 = this;
            java.lang.Class<zy2.b6> r0 = zy2.b6.class
            i95.m r0 = i95.n0.c(r0)
            zy2.b6 r0 = (zy2.b6) r0
            c61.l7 r0 = (c61.l7) r0
            boolean r0 = r0.zk()
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            ae2.in r0 = ae2.in.f85221a
            lb2.j r0 = r0.s()
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L27
            r0 = r2
            goto L28
        L27:
            r0 = r1
        L28:
            jz5.g r3 = ae2.in.I2
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.mo141623x754a37bb()
            lb2.j r3 = (lb2.j) r3
            java.lang.Object r3 = r3.r()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r2) goto L40
            r3 = r2
            goto L41
        L40:
            r3 = r1
        L41:
            java.lang.String r4 = "key_enable_mixed_timeline_with_liveroom"
            com.tencent.mm.plugin.finder.feed.k8 r5 = r9.f185891f
            if (r3 == 0) goto L5d
            com.tencent.mm.ui.MMActivity r3 = r5.getF204176d()
            if (r3 == 0) goto L58
            android.content.Intent r3 = r3.getIntent()
            if (r3 == 0) goto L58
            boolean r3 = r3.getBooleanExtra(r4, r1)
            goto L59
        L58:
            r3 = r1
        L59:
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r0 == 0) goto L76
            com.tencent.mm.ui.MMActivity r6 = r5.getF204176d()
            if (r6 == 0) goto L71
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L71
            boolean r6 = r6.getBooleanExtra(r4, r1)
            goto L72
        L71:
            r6 = r1
        L72:
            if (r6 == 0) goto L76
            r6 = r2
            goto L77
        L76:
            r6 = r1
        L77:
            int r7 = r9.f186642l1
            if (r0 == 0) goto L83
            if (r7 == r2) goto L81
            r0 = 120(0x78, float:1.68E-43)
            if (r7 != r0) goto L83
        L81:
            r0 = r2
            goto L84
        L83:
            r0 = r1
        L84:
            r8 = 39
            if (r7 != r8) goto L9e
            com.tencent.mm.ui.MMActivity r5 = r5.getF204176d()
            if (r5 == 0) goto L99
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L99
            boolean r4 = r5.getBooleanExtra(r4, r1)
            goto L9a
        L99:
            r4 = r1
        L9a:
            if (r4 == 0) goto L9e
            r4 = r2
            goto L9f
        L9e:
            r4 = r1
        L9f:
            if (r3 != 0) goto La7
            if (r6 != 0) goto La7
            if (r0 != 0) goto La7
            if (r4 == 0) goto La8
        La7:
            r1 = r2
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.b2():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void c1(in5.s0 holder, android.graphics.Rect videoViewRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoViewRect, "videoViewRect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "refreshLiveOrientationBtnLayout videoViewRect " + videoViewRect);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f566292tn5);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sf(c22699x3dcdb352, videoViewRect));
        }
    }

    public final void c2(android.view.Window window) {
        if (this.C1 && window != null) {
            window.clearFlags(8192);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unlock screen record:");
        sb6.append(this.C1);
        sb6.append(",window:");
        sb6.append(window != null ? window.hashCode() : 0);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        this.C1 = false;
    }

    @Override // in5.r
    public int e() {
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T7).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "getLayoutId slideModeEnable=" + z17);
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue();
        return z17 ? booleanValue ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dt7 : com.p314xaae8f345.mm.R.C30864xbddafb2a.dt6 : booleanValue ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f569381dt5 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569380p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.h1 item = (so2.h1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        boolean b27 = b2();
        tc2.b bVar = this.f186384e;
        if (b27) {
            uc2.d dVar = (uc2.d) bVar.a(holder, uc2.d.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
            if (c15316x68272fd9 != null) {
                c15316x68272fd9.m62168x369dfee5(dVar);
            }
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.iar);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.eqi);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            X1(holder);
            return;
        }
        if (z17) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder liveFeedStateChangeListener:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13695x90c81d08 c13695x90c81d08 = this.A1;
        sb6.append(c13695x90c81d08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        c13695x90c81d08.mo48813x58998cd();
        mo48813x58998cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f186643p1, "onBindViewHolder getItemId: " + item.mo2128x1ed62e84());
        r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
        int m75939xb282bd08 = m59258xd0557130 != null ? m59258xd0557130.m75939xb282bd08(2) : 2;
        if (!b2()) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.o77);
            android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.eqi);
            if (imageView2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FeedFullLiveConvert", "[refreshMask] holder=" + holder.m8185xcdaf1228() + " position=" + holder.m8183xf806b362() + " data=" + holder.f374658i + " holder=" + holder + ' ' + holder.f3639x46306858);
            }
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.iar);
            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59259x7dea7760());
            if (mb4Var == null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                r45.nw1 m59258xd05571302 = item.getFeedObject().m59258xd0557130();
                sb7.append(m59258xd05571302 != null ? java.lang.Long.valueOf(m59258xd05571302.m75942xfb822ef2(0)) : null);
                sb7.append(" firstMedia is empty");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            }
            java.lang.String m75945x2fec8307 = mb4Var != null ? mb4Var.m75945x2fec8307(16) : null;
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = mb4Var != null ? mb4Var.m75945x2fec8307(20) : null;
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
                java.lang.String m75945x2fec83073 = mb4Var != null ? mb4Var.m75945x2fec8307(1) : null;
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                java.lang.String m75945x2fec83074 = mb4Var != null ? mb4Var.m75945x2fec8307(19) : null;
                str = m75945x2fec83073.concat(m75945x2fec83074 != null ? m75945x2fec83074 : "");
            } else {
                str = concat;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("refreshMask item=");
            ya2.b2 contact = item.getContact();
            sb8.append(contact != null ? contact.w0() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb8.toString());
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (m75939xb282bd08 == 1) {
                holder.f3639x46306858.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vf(holder, item, m75939xb282bd08, this));
                android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f98);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.iar);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.f98);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (V1(item)) {
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d e17 = g1Var.e();
                mn2.j0 j0Var = new mn2.j0(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                e17.c(j0Var, imageView2, g1Var.h(mn2.f1.f411486d));
                if (p19 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(p19, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "refreshMask", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedLive;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                i95.m c17 = i95.n0.c(c61.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
                c61.zb.g7((c61.zb) c17, imageView2, str, 0, 4, null);
            }
        }
        android.content.Context context = holder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        if (abstractActivityC15087xee12defa != null) {
            if ((item.getFeedObject().getFeedObject().m76755x3ca2cb4e() & 1) == 0) {
                zy2.b8 b8Var = (zy2.b8) pf5.z.f435481a.a(abstractActivityC15087xee12defa).c(zy2.b8.class);
                long m59251x5db1b11 = item.getFeedObject().m59251x5db1b11();
                java.lang.String m59276x6c285d75 = item.getFeedObject().m59276x6c285d75();
                r45.nw1 m59258xd05571303 = item.getFeedObject().m59258xd0557130();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.fg) b8Var).R6(m59251x5db1b11, m59276x6c285d75, m59258xd05571303 != null ? m59258xd05571303.m75942xfb822ef2(0) : 0L, item.w(), abstractActivityC15087xee12defa);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pf pfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pf(this, item);
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
            if (p37 != null) {
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(p37, "live_room_card");
                ((cy1.a) aVar.ik(p37, 32, 26236)).Ai(p37, pfVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = item.getFeedObject();
                android.content.Context context2 = p37.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                ym5.a1.h(p37, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mf(feedObject, this, context2));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31 c15310x1d9feb31 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15310x1d9feb31) holder.p(com.p314xaae8f345.mm.R.id.f566143ti1);
        if (c15310x1d9feb31 != null) {
            bVar.getClass();
            tc2.g c18 = bVar.c(holder);
            uc2.i iVar = (uc2.i) (c18 != null ? c18.a(sb2.o.class) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract = this.f185891f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("onBind tabType=");
            int i19 = this.f185893h;
            sb9.append(i19);
            sb9.append(" mediaClickController=");
            sb9.append(iVar != null ? iVar.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBubbleLayoutCompatSlideEnter", sb9.toString());
            c15310x1d9feb31.B = iVar;
            c15310x1d9feb31.P = i19;
            c15310x1d9feb31.L = contract;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context3 = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context3);
        java.lang.String valueOf = java.lang.String.valueOf(Sj != null ? java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).f216913n) : null);
        zy2.ra Sj2 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context3);
        java.lang.String str2 = Sj2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj2).f216915p : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f566292tn5);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qf(holder, item, str2, valueOf));
            java.lang.Object obj = holder.f374658i;
            so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
            if (h1Var != null) {
                if (h1Var.f2()) {
                    java.lang.System.nanoTime();
                    boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    if (!z18) {
                        c22699x3dcdb352.setVisibility(0);
                        i95.m c19 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                        zy2.zb zbVar = (zy2.zb) c19;
                        ml2.u1 u1Var = ml2.u1.f409591k3;
                        jz5.l[] lVarArr = new jz5.l[1];
                        r45.nw1 m59258xd05571304 = item.getFeedObject().m59258xd0557130();
                        lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(m59258xd05571304 != null ? java.lang.Long.valueOf(m59258xd05571304.m75942xfb822ef2(0)) : null));
                        zy2.zb.I8(zbVar, u1Var, kz5.c1.l(lVarArr), str2, valueOf, item.g0(), null, false, 96, null);
                        return;
                    }
                }
                c22699x3dcdb352.setVisibility(8);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public boolean h0() {
        in5.s0 s0Var = this.f185908z;
        if (s0Var != null) {
            uc2.g gVar = (uc2.g) this.f186384e.a(s0Var, uc2.g.class);
            java.lang.Integer num = null;
            if (gVar != null) {
                in5.s0 s0Var2 = ((sb2.l) gVar).f498674d.f498682i;
                android.view.ViewGroup viewGroup = s0Var2 != null ? (android.view.ViewGroup) s0Var2.p(com.p314xaae8f345.mm.R.id.ltb) : null;
                if (viewGroup != null) {
                    num = java.lang.Integer.valueOf(viewGroup.getChildCount());
                }
            }
            if (num != null && num.intValue() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (!b2()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr qrVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214440f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0();
            s0Var.f214521a = recyclerView;
            c15324x3354d808.b(qrVar, s0Var);
            holder.w(com.p314xaae8f345.mm.R.id.a_x, 8);
            holder.w(com.p314xaae8f345.mm.R.id.c79, 8);
            holder.w(com.p314xaae8f345.mm.R.id.msw, 8);
            holder.w(com.p314xaae8f345.mm.R.id.f568621ng5, 8);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.aur);
            if (p17 != null) {
                p17.getLayoutParams().height = (int) (((java.lang.Number) ((jz5.n) this.f185902t).mo141623x754a37bb()).intValue() * 0.38d);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d8082 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr qrVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214442h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0 s0Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0();
        s0Var2.f214521a = recyclerView;
        c15324x3354d8082.b(qrVar2, s0Var2);
        X1(holder);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        os5.r rVar = kd2.p1.N.a().M;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).getClass();
        if (rVar != null) {
            dk2.ef.f314931n = rVar;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
        if (c15415x74224fd8 == null) {
            return;
        }
        c15415x74224fd8.f214171w = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7, in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (b2() && (s0Var = this.f185908z) != null) {
            android.view.View view = s0Var.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
            if (c15379x1d4ea971 != null) {
                c15379x1d4ea971.a(false, "Finder.FeedFullLiveConvert");
            }
            uc2.d dVar = (uc2.d) this.f186384e.a(s0Var, uc2.d.class);
            if (dVar != null) {
                uc2.d.K2(dVar, s0Var, false, false, 4, null);
            }
            s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tp6, java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "onDetachedFromRecyclerView: focusedHolder detached, liveRoomController: " + dVar + ", focusedHolder: " + s0Var);
        }
        super.j(recyclerView);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromRecyclerView liveFeedStateChangeListener:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13695x90c81d08 c13695x90c81d08 = this.A1;
        sb6.append(c13695x90c81d08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        android.content.Context context = recyclerView.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c2(activity != null ? activity.getWindow() : null);
        c13695x90c81d08.mo48814x2efc64();
        mo48814x2efc64();
        mo48814x2efc64();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f186644x1;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onDetachedFromRecyclerView deleteJob: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f186644x1;
        sb7.append(r2Var2 != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var2).a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f186643p1, sb7.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.l(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewRecycled liveFeedStateChangeListener:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13695x90c81d08 c13695x90c81d08 = this.A1;
        sb6.append(c13695x90c81d08);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
        android.content.Context context = o17 != null ? o17.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c2(activity != null ? activity.getWindow() : null);
        c13695x90c81d08.mo48814x2efc64();
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51 c15288x851f5d51 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15288x851f5d51) holder.p(com.p314xaae8f345.mm.R.id.efr);
        c15288x851f5d51.getClass();
        c15288x851f5d51.f212632i.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveRecommendView", "[clearAll]");
        if (b2()) {
            java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.tp6);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder, this.f185908z) || !b17) {
                android.view.View view = holder.f3639x46306858;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
                if (c15379x1d4ea971 != null) {
                    c15379x1d4ea971.a(false, "Finder.FeedFullLiveConvert");
                }
                uc2.d dVar = (uc2.d) this.f186384e.a(holder, uc2.d.class);
                if (dVar != null) {
                    uc2.d.K2(dVar, holder, false, false, 4, null);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o18 = holder.o();
                android.content.Context context2 = o18 != null ? o18.getContext() : null;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                android.view.View findViewById = activity2 != null ? activity2.findViewById(com.p314xaae8f345.mm.R.id.ggn) : null;
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = findViewById;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onViewRecycled", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o19 = holder.o();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = o19 != null ? o19.getLayoutManager() : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
                if (c15415x74224fd8 != null) {
                    c15415x74224fd8.f214171w = false;
                }
                holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tp6, bool);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FeedFullLiveConvert", "onViewRecycled: exit live room as fallback, holder == focusedHolder: " + p3321xbce91901.jvm.p3324x21ffc6bd.o.b(holder, this.f185908z) + ", hasExited: " + b17 + ", liveRoomController: " + dVar + ", holder: " + holder);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7
    public java.util.List n() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(super.n());
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        arrayList.addAll(kz5.c0.i(bg2.d2.class, bg2.g2.class, bg2.n2.class, bg2.u.class, bg2.k0.class, bg2.l.class, bg2.z3.class, bg2.o4.class, bg2.j0.class, bg2.r.class, bg2.d.class, bg2.e2.class, bg2.k.class, bg2.c5.class, bg2.j5.class, bg2.c.class, bg2.q6.class, bg2.l8.class, bg2.a5.class, bg2.y0.class, bg2.h4.class, bg2.o5.class, bg2.x2.class, bg2.s5.class, bg2.x8.class, bg2.t1.class, bg2.x0.class, bg2.d0.class, bg2.d1.class, bg2.j1.class, bg2.g1.class, bg2.b3.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf.class));
        arrayList.add(sb2.o.class);
        arrayList.add(sb2.l.class);
        arrayList.add(sb2.k.class);
        arrayList.add(sb2.b.class);
        arrayList.add(sb2.i.class);
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void p0(in5.s0 holder) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.p0(holder);
        java.lang.Object obj = holder.f374658i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        if (h1Var != null) {
            r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
            if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 2) {
                D(holder, h1Var);
            }
            ae2.in inVar = ae2.in.f85221a;
            if (((java.lang.Number) ae2.in.S3.r()).intValue() > 0) {
                Y1(holder, h1Var, true);
            }
            if (b2()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9 c15316x68272fd9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15316x68272fd9) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) holder.f374658i;
                android.content.Context context = holder.f374654e;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                long j17 = 0;
                if (activity != null && (intent = activity.getIntent()) != null) {
                    j17 = intent.getLongExtra("KEY_FIRST_FOCUSED_FEED_ID", 0L);
                }
                uc2.d dVar = (uc2.d) this.f186384e.a(holder, uc2.d.class);
                if (dVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1494xdcdf3d8f.C14207x67cb93cf) dVar).Y6(holder, c15316x68272fd9 != null ? c15316x68272fd9.m61652x7f02fdf3() : null, h1Var, false, abstractC14490x69736cb5.mo2128x1ed62e84() == j17);
                }
                X1(holder);
                android.view.View view = holder.f3639x46306858;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
                if (c15379x1d4ea971 != null) {
                    c15379x1d4ea971.a(true, "Finder.FeedFullLiveConvert");
                }
                android.content.Context context2 = holder.o().getContext();
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                android.view.View findViewById = activity2 != null ? activity2.findViewById(com.p314xaae8f345.mm.R.id.ggn) : null;
                if (findViewById == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void q0(p012xc85e97e9.p093xedfae76a.y owner) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "onLifecycleDestroy");
        if (b2()) {
            in5.s0 s0Var = this.f185908z;
            if (s0Var != null) {
                android.view.View view = s0Var.f3639x46306858;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
                if (c15379x1d4ea971 != null) {
                    c15379x1d4ea971.a(false, "Finder.FeedFullLiveConvert");
                }
                uc2.d dVar = (uc2.d) this.f186384e.a(s0Var, uc2.d.class);
                if (dVar != null) {
                    uc2.d.K2(dVar, s0Var, true, false, 4, null);
                }
                s0Var.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tp6, java.lang.Boolean.TRUE);
            }
            in5.s0 s0Var2 = this.f185908z;
            android.content.Context context = (s0Var2 == null || (o17 = s0Var2.o()) == null) ? null : o17.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            android.view.View findViewById = activity != null ? activity.findViewById(com.p314xaae8f345.mm.R.id.ggn) : null;
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onLifecycleDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onLifecycleDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r12.isFinishing() == true) goto L32;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r0(p012xc85e97e9.p093xedfae76a.y r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.r0(androidx.lifecycle.y):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public boolean s0(in5.s0 holder, android.view.View view, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObj, android.view.MotionEvent motionEvent, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        if (b2()) {
            return true;
        }
        this.f186384e.e(holder, view, intent);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void t0(in5.s0 holder, android.view.View view, android.view.MotionEvent e17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 holder, boolean z17, int i17) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.t1(item, holder, z17, i17);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.lkg);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wf(this, holder, item));
        }
        uc2.a aVar = (uc2.a) this.f186384e.a(holder, uc2.a.class);
        if (aVar != null) {
            boolean isEmpty = nv2.n1.f422084h.h(item.getFeedObject().getFeedObject()).isEmpty();
            bg2.d0 d0Var = (bg2.d0) aVar;
            in5.s0 s0Var = d0Var.f498674d.f498682i;
            android.content.Context context = s0Var != null ? s0Var.f374654e : null;
            if (context == null) {
                return;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.f101540q, java.lang.Boolean.valueOf(isEmpty))) {
                if (isEmpty) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z6 = d0Var.Z6();
                    if (Z6 != null) {
                        Z6.setTranslationY(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z62 = d0Var.Z6();
                    if (Z62 != null) {
                        Z62.m82895x25bfb969(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
                    }
                } else {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z63 = d0Var.Z6();
                    if (Z63 != null) {
                        Z63.setTranslationY(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9));
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z64 = d0Var.Z6();
                    if (Z64 != null) {
                        Z64.m82895x25bfb969(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
                    }
                }
                ag2.d dVar = d0Var.f101533g;
                if (dVar != null) {
                    dVar.m8146xced61ae5();
                }
                d0Var.f101540q = java.lang.Boolean.valueOf(isEmpty);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z65 = d0Var.Z6();
            if (Z65 != null && Z65.getVisibility() == 0) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 Z66 = d0Var.Z6();
                if ((Z66 != null ? Z66.getChildCount() : 0) > 0) {
                    d0Var.a7();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void w(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, boolean z17) {
        so2.h1 item = (so2.h1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        if (abstractC15229x2dc379 != null) {
            android.content.Context context = abstractC15229x2dc379.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int i18 = ((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels;
            java.lang.Object parent = holder.o().getParent().getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
            int bottom = ((android.view.View) parent).getBottom();
            java.util.LinkedList<r45.mb4> m59264x7efe73ec = item.getFeedObject().m59264x7efe73ec();
            r45.mb4 first = m59264x7efe73ec.getFirst();
            for (r45.mb4 mb4Var : m59264x7efe73ec) {
                r45.mb4 mb4Var2 = first;
                if ((mb4Var2.m75938x746dc8a6(5) * 1.0f) / mb4Var2.m75938x746dc8a6(4) < (mb4Var.m75938x746dc8a6(5) * 1.0f) / mb4Var.m75938x746dc8a6(4)) {
                    first = mb4Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "calculateMediaLayoutParams res:[" + mb4Var.m75938x746dc8a6(4) + " x " + mb4Var.m75938x746dc8a6(5));
            }
            abstractC15229x2dc379.m61652x7f02fdf3().getLayoutParams().width = i18;
            abstractC15229x2dc379.m61652x7f02fdf3().getLayoutParams().height = bottom;
            android.view.ViewGroup.LayoutParams layoutParams = abstractC15229x2dc379.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            layoutParams2.gravity = 17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
            android.view.ViewGroup.LayoutParams layoutParams3 = c15196x85976f5f != null ? c15196x85976f5f.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = 0;
                layoutParams4.bottomMargin = 0;
                layoutParams4.gravity = 17;
            }
            abstractC15229x2dc379.requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void x0(long j17, in5.s0 holder) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScrollIdle focusPos: ");
        in5.s0 s0Var = this.f185908z;
        java.lang.Integer num = null;
        sb6.append(s0Var != null ? java.lang.Integer.valueOf(s0Var.m8183xf806b362()) : null);
        sb6.append(" feedId: ");
        sb6.append(j17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f186643p1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        in5.s0 T1 = T1(j17);
        if (T1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) T1.f374658i;
            if ((abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L) == j17) {
                this.f186646y1 = j17;
                if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59258xd0557130 = feedObject.m59258xd0557130()) != null) {
                    num = java.lang.Integer.valueOf(m59258xd0557130.m75939xb282bd08(2));
                }
                Q1(this, j17, true, num, null, 8, null);
                return;
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onScrollIdle isShown = false, feedId: ");
            sb8.append(j17);
            sb8.append(" deleteJob: ");
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f186644x1;
            sb8.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f186644x1;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.z0(holder, i17, i18, z17);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        int S6 = c15456x2c452bca != null ? c15456x2c452bca.S6() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUnFocusFeedCenter isFromScroll:");
        sb6.append(z17);
        sb6.append(",newTabType:");
        sb6.append(S6);
        sb6.append(",curTabType:");
        int i19 = this.f185893h;
        sb6.append(i19);
        sb6.append(',');
        cm2.a aVar = cm2.a.f124861a;
        java.lang.Object obj = holder.f374658i;
        so2.h1 h1Var = obj instanceof so2.h1 ? (so2.h1) obj : null;
        sb6.append(aVar.y((h1Var == null || (feedObject = h1Var.getFeedObject()) == null) ? null : feedObject.m59258xd0557130()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        if (z17 || S6 != i19) {
            android.content.Context context2 = holder.o().getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            c2(activity != null ? activity.getWindow() : null);
        }
        java.lang.Object obj2 = holder.f374658i;
        so2.h1 h1Var2 = obj2 instanceof so2.h1 ? (so2.h1) obj2 : null;
        if (h1Var2 == null) {
            return;
        }
        if (!h1Var2.getFeedObject().m59312x7b7fa34a()) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = h1Var2.getFeedObject().getFeedObject();
            zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
            r45.qt2 V6 = Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null;
            ((b92.d1) zbVar).getClass();
            dk2.u6.f315704a.e(context, feedObject2, V6, true);
        }
        if (b2()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
            android.content.Context context3 = o17 != null ? o17.getContext() : null;
            android.app.Activity activity2 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("activity:");
            sb7.append(activity2 != null ? activity2.getClass().getSimpleName() : null);
            sb7.append(",isFinishing:");
            sb7.append(activity2 != null ? java.lang.Boolean.valueOf(activity2.isFinishing()) : null);
            sb7.append(",isDestroyed:");
            sb7.append(activity2 != null ? java.lang.Boolean.valueOf(activity2.isDestroyed()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb7.toString());
            if (!z17 && S6 == i19) {
                if (!(activity2 != null && activity2.isFinishing())) {
                    return;
                }
            }
            android.view.View view = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) view : null;
            if (c15379x1d4ea971 != null) {
                c15379x1d4ea971.a(false, "Finder.FeedFullLiveConvert");
            }
            uc2.d dVar = (uc2.d) this.f186384e.a(holder, uc2.d.class);
            if (dVar != null) {
                uc2.d.K2(dVar, holder, false, false, 4, null);
            }
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tp6, java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", "onUnFocusFeedCenter liveRoomController:" + dVar + ", holder:" + holder);
            android.content.Context context4 = holder.o().getContext();
            android.app.Activity activity3 = context4 instanceof android.app.Activity ? (android.app.Activity) context4 : null;
            android.view.View findViewById = activity3 != null ? activity3.findViewById(com.p314xaae8f345.mm.R.id.ggn) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = holder.o().getLayoutManager();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 c15415x74224fd8 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager : null;
            if (c15415x74224fd8 == null) {
                return;
            }
            c15415x74224fd8.f214171w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFinderLiveExitListener$1] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1] */
    public zf(cw2.f8 videoCore, final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract, boolean z17, int i17, int i18) {
        super(contract, z17, i17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCore, "videoCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f186645y0 = videoCore;
        this.f186642l1 = i18;
        this.f186643p1 = "LiveFeedDelete_" + hashCode();
        final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d = contract.getF204176d();
        this.f186647z1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5439x752a578e>(f204176d) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedExposeListener$1
            {
                this.f39173x3fe91575 = 339975038;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5439x752a578e c5439x752a578e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5439x752a578e event = c5439x752a578e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveFeedExposeListener receive feedId: ");
                sb6.append(event.f135781g.f88079a);
                sb6.append(" focusedHolder: ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.this;
                sb6.append(zfVar.f185908z);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = contract;
                if (!k8Var.getF204176d().mo78538xecd98af8()) {
                    return false;
                }
                in5.s0 s0Var = zfVar.f185908z;
                so2.j5 j5Var = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
                so2.h1 h1Var = j5Var instanceof so2.h1 ? (so2.h1) j5Var : null;
                if (h1Var == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = h1Var.getFeedObject();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = k8Var.getF204176d().mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                zfVar.Z1(feedObject, 68, mo55332x76847179);
                return false;
            }
        };
        final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d2 = contract.getF204176d();
        this.A1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3>(f204176d2) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFeedStateChangeListener$1
            {
                this.f39173x3fe91575 = 439877283;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 event = c5445x963cab3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                pm0.v.V(0L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nf(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.this));
                return false;
            }
        };
        final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d3 = contract.getF204176d();
        this.B1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5482xc842f1ea>(f204176d3) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullLiveConvert$liveFinderLiveExitListener$1
            {
                this.f39173x3fe91575 = 721137114;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5482xc842f1ea c5482xc842f1ea) {
                so2.j5 j5Var;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5482xc842f1ea event = c5482xc842f1ea;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveFinderLiveExitListener receive feedId: ");
                am.pb pbVar = event.f135818g;
                sb6.append(pbVar.f89144a);
                sb6.append(" focusedHolder: ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.this;
                sb6.append(zfVar.f185908z);
                sb6.append("focusedHolder feedId: ");
                in5.s0 s0Var = zfVar.f185908z;
                sb6.append((s0Var == null || (j5Var = (so2.j5) s0Var.f374658i) == null) ? null : java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
                in5.s0 s0Var2 = zfVar.f185908z;
                if (s0Var2 != null) {
                    so2.j5 j5Var2 = (so2.j5) s0Var2.f374658i;
                    if (j5Var2 != null && pbVar.f89144a == j5Var2.mo2128x1ed62e84()) {
                        s0Var2.f3639x46306858.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.of(s0Var2));
                    }
                }
                return false;
            }
        };
    }
}
