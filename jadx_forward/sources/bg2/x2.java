package bg2;

/* loaded from: classes3.dex */
public final class x2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public r45.xg6 f102169e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f102170f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f102171g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f102172h;

    /* renamed from: i, reason: collision with root package name */
    public final int f102173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102172h = new bg2.o2(this);
        this.f102173i = 46;
    }

    public static final void Y6(bg2.x2 x2Var) {
        x2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertSearchComponentController", "start polling");
        bg2.g2 g2Var = (bg2.g2) x2Var.N6(bg2.g2.class);
        if (g2Var != null) {
            g2Var.Y6(x2Var.f102173i, x2Var.Z6(), true, new bg2.u2(x2Var, r45.nc2.class));
        }
    }

    @Override // tc2.c
    public void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.kr0 m59293x6b032749;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        tc2.g gVar = this.f498674d;
        in5.s0 s0Var = gVar.f498682i;
        this.f102170f = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.f565786t93) : null;
        in5.s0 s0Var2 = gVar.f498682i;
        android.view.View p17 = s0Var2 != null ? s0Var2.p(com.p314xaae8f345.mm.R.id.f567873sa4) : null;
        this.f102171g = p17;
        if (p17 != null) {
            p17.addOnLayoutChangeListener(this.f102172h);
        }
        c7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59293x6b032749 = feedObject.m59293x6b032749()) == null || (m75941xfb821914 = m59293x6b032749.m75941xfb821914(12)) == null) {
            return;
        }
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.kz3) obj).m75939xb282bd08(0) == 26) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.kz3 kz3Var = (r45.kz3) obj;
        this.f102169e = kz3Var != null ? (r45.xg6) kz3Var.m75936x14adae67(17) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            r11 = this;
            tc2.g r0 = r11.f498674d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f498681h
            boolean r2 = r1 instanceof so2.h1
            r3 = 0
            if (r2 == 0) goto Lc
            so2.h1 r1 = (so2.h1) r1
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 != 0) goto L10
            return
        L10:
            so2.g1 r2 = r1.f491917n
            int r4 = r2.f491889a
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L1a
            r4 = r5
            goto L1b
        L1a:
            r4 = r6
        L1b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "has fetched "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = " has data "
            r7.append(r8)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r11.b7()
            if (r8 == 0) goto L32
            r8 = r5
            goto L33
        L32:
            r8 = r6
        L33:
            r7.append(r8)
            java.lang.String r8 = " showType "
            r7.append(r8)
            r45.xg6 r8 = r11.f102169e
            if (r8 == 0) goto L4e
            int r8 = r8.m75939xb282bd08(r6)
            if (r8 == 0) goto L4b
            if (r8 == r5) goto L48
            goto L4e
        L48:
            r45.yg6 r8 = r45.yg6.ShowType_BackToPreview
            goto L4f
        L4b:
            r45.yg6 r8 = r45.yg6.ShowType_StayPreview
            goto L4f
        L4e:
            r8 = r3
        L4f:
            if (r8 != 0) goto L6e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "unknown value "
            r8.<init>(r9)
            r45.xg6 r9 = r11.f102169e
            if (r9 == 0) goto L66
            int r9 = r9.m75939xb282bd08(r6)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L67
        L66:
            r9 = r3
        L67:
            r8.append(r9)
            java.lang.String r8 = r8.toString()
        L6e:
            r7.append(r8)
            java.lang.String r8 = " delay "
            r7.append(r8)
            r45.xg6 r8 = r11.f102169e
            if (r8 == 0) goto L83
            int r5 = r8.m75939xb282bd08(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L84
        L83:
            r5 = r3
        L84:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "LiveConvertSearchComponentController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r5)
            if (r4 == 0) goto L95
            r11.d7()
        L95:
            r45.xg6 r4 = r11.f102169e
            if (r4 != 0) goto L9a
            return
        L9a:
            int r5 = r4.m75939xb282bd08(r6)
            if (r5 != 0) goto La4
            boolean r5 = r1.f491916m
            if (r5 == 0) goto La8
        La4:
            int r2 = r2.f491889a
            if (r2 <= 0) goto Lb8
        La8:
            kotlinx.coroutines.y0 r5 = r0.f498680g
            if (r5 == 0) goto Lb8
            r6 = 0
            r7 = 0
            bg2.p2 r8 = new bg2.p2
            r8.<init>(r1, r4, r11, r3)
            r9 = 3
            r10 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.x2.Q6():void");
    }

    @Override // tc2.c
    public void U6() {
        android.view.View view = this.f102170f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertSearchComponentController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertSearchComponentController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // tc2.c
    public void X6() {
        android.view.View view = this.f102171g;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f102172h);
        }
    }

    public final r45.mc2 Z6() {
        so2.g1 g1Var;
        r45.mc2 mc2Var = new r45.mc2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        mc2Var.set(0, java.lang.Long.valueOf(((h1Var == null || (g1Var = h1Var.f491917n) == null) ? 0 : g1Var.f491889a) + 1));
        return mc2Var;
    }

    public final java.util.LinkedList a7(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.v92 v92Var = new r45.v92();
        v92Var.set(0, 1);
        v92Var.set(1, b7());
        r45.u92 u92Var = new r45.u92();
        u92Var.set(0, java.lang.Integer.valueOf(z17 ? 7 : 8));
        u92Var.set(3, v92Var);
        linkedList.add(u92Var);
        return linkedList;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 b7() {
        so2.g1 g1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        if (h1Var == null || (g1Var = h1Var.f491917n) == null) {
            return null;
        }
        return g1Var.f491890b;
    }

    public final void c7() {
        android.view.View view;
        android.view.View view2 = this.f102170f;
        if (view2 == null || (view = this.f102171g) == null) {
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = parent instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) parent : null;
        if (c1073x7e08a787 == null) {
            return;
        }
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
        cVar.d(c1073x7e08a787);
        cVar.e(view2.getId(), 4, view.getVisibility() == 0 ? view.getId() : com.p314xaae8f345.mm.R.id.f565582hh3, 3);
        cVar.b(c1073x7e08a787);
        c1073x7e08a787.m7179xd020a803(null);
    }

    public final void d7() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 b76 = b7();
        java.lang.String e76 = e7(b76);
        if ((e76 != null && e76.length() > 0) && (y0Var = this.f498674d.f498680g) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.w2(this, b76, null), 3, null);
        }
    }

    public final java.lang.String e7(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        r45.wf6 wf6Var;
        r45.iw4 iw4Var;
        if (c19786x6a1e2862 == null || (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) == null || (wf6Var = (r45.wf6) kz5.n0.Z(m76521x7528c3fb)) == null || (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) == null) {
            return null;
        }
        return iw4Var.m75945x2fec8307(1);
    }

    @Override // tc2.h
    /* renamed from: onLiveStart */
    public void mo10403x39a513b7(r45.hc1 hc1Var) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.xg6 xg6Var = this.f102169e;
        if (xg6Var == null) {
            return;
        }
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        if (h1Var != null && h1Var.f491917n.f491889a <= 0 && xg6Var.m75939xb282bd08(0) == 1 && h1Var.f491916m && (y0Var = gVar.f498680g) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.q2(this, null), 3, null);
        }
    }
}
