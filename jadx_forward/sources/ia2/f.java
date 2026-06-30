package ia2;

/* loaded from: classes2.dex */
public final class f extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f371451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371452c;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3) {
        this.f371452c = activityC13656x51707ca3;
        this.f371451b = new java.lang.ref.WeakReference(activityC13656x51707ca3);
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        java.lang.ref.WeakReference weakReference;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerClose");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) this.f371451b.get();
        ((cy1.a) rVar).w8((activityC13656x51707ca3 == null || (weakReference = activityC13656x51707ca3.f183313t) == null) ? null : (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) weakReference.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // hx2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(gx2.q r14) {
        /*
            r13 = this;
            java.lang.String r0 = "layout"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.lang.String r0 = "MicroMsg.FinderFlutterPOIActivity"
            java.lang.String r1 = "onDrawerExpand"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.ref.WeakReference r0 = r13.f371451b
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) r0
            if (r0 != 0) goto L19
            return
        L19:
            ia2.n0 r1 = r0.f183315v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader r1 = r1.f371493n
            if (r1 == 0) goto L2c
            r45.bp2 r1 = r1.f189079s
            if (r1 == 0) goto L2c
            java.util.LinkedList r1 = r1.m75941xfb821914(r2)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 == 0) goto L38
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L36
            goto L38
        L36:
            r1 = r2
            goto L39
        L38:
            r1 = r3
        L39:
            if (r1 != r3) goto L3d
            r1 = r3
            goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L47
            boolean r1 = r0.W
            if (r1 != 0) goto L47
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.c7(r0)
        L47:
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity r1 = r13.f371452c
            ia2.n0 r4 = r1.f183315v
            if (r4 == 0) goto L54
            boolean r4 = r0.D
            if (r4 != 0) goto L54
            r0.q7(r3)
        L54:
            android.view.View r0 = r1.K
            if (r0 != 0) goto L59
            goto L9f
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.ThreadLocal r4 = zj0.c.f554818a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r3.add(r4)
            java.util.Collections.reverse(r3)
            java.lang.Object[] r6 = r3.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent"
            java.lang.String r8 = "onDrawerExpand"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setAlpha"
            java.lang.String r12 = "(F)V"
            r5 = r0
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r2 = r3.get(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0.setAlpha(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent"
            java.lang.String r7 = "onDrawerExpand"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setAlpha"
            java.lang.String r11 = "(F)V"
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
        L9f:
            yz5.q r0 = r1.Q
            if (r0 == 0) goto Lc2
            float r2 = r14.m62620x5b051b9d()
            float r14 = r14.m62616x9c78005c()
            float r2 = r2 - r14
            java.lang.Float r14 = java.lang.Float.valueOf(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r1.C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r14 = r0.mo147xb9724478(r14, r2, r1)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia2.f.c(gx2.q):void");
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        gx2.q qVar;
        java.lang.ref.WeakReference weakReference;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerOpen");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.ref.WeakReference weakReference2 = this.f371451b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference2.get();
        ((cy1.a) rVar).D2((activityC13656x51707ca3 == null || (weakReference = activityC13656x51707ca3.f183313t) == null) ? null : (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) weakReference.get());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) weakReference2.get();
        if (activityC13656x51707ca32 == null || (qVar = activityC13656x51707ca32.f183309J) == null) {
            return;
        }
        if (qVar.f358906y1) {
            qVar.postInvalidate();
        }
        qVar.f358906y1 = false;
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 c23922xf4e16628;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "onDrawerPeek");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) this.f371451b.get();
        if (activityC13656x51707ca3 == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
        ia2.n0 n0Var = activityC13656x51707ca3.f183315v;
        if (n0Var != null && (c23922xf4e16628 = n0Var.f371488f) != null) {
            c23922xf4e16628.m88605x7a7ec60d(ia2.q0.a("scrollToTop"));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca32 = this.f371452c;
        if (activityC13656x51707ca32.f183315v != null && !activityC13656x51707ca3.D) {
            activityC13656x51707ca3.q7(false);
        }
        android.view.View view = activityC13656x51707ca32.K;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onDrawerPeek", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onDrawerPeek", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        yz5.q qVar = activityC13656x51707ca32.Q;
        if (qVar != null) {
        }
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "onScroll");
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "resetTranslation");
        float m62620x5b051b9d = layout.m62620x5b051b9d() - f17;
        float m62620x5b051b9d2 = layout.m62620x5b051b9d();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371452c;
        activityC13656x51707ca3.getClass();
        float m62616x9c78005c = m62620x5b051b9d2 - layout.m62616x9c78005c();
        if (m62620x5b051b9d > 0.0d) {
            float f18 = m62620x5b051b9d / m62616x9c78005c;
            r3 = f18 >= 0.0f ? f18 : 0.0f;
            if (r3 > 1.0f) {
                r3 = 1.0f;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) this.f371451b.get();
        if (activityC13656x51707ca32 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.h7(activityC13656x51707ca32, r3, b17, b18);
        }
        if (b17) {
            android.view.View view = activityC13656x51707ca3.K;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1 - r3));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/poi/flutter/FinderFlutterPOIActivity$CallbackComponent", "onTranslationChange", "(Lcom/tencent/mm/plugin/finder/view/drawer/FinderCustomDrawer;FLjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            yz5.q qVar = activityC13656x51707ca3.Q;
            if (qVar != null) {
            }
        }
    }
}
