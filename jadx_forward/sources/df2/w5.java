package df2;

/* loaded from: classes3.dex */
public final class w5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f313191a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f313192b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f313193c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f313194d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f313195e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f313196f;

    /* renamed from: g, reason: collision with root package name */
    public int f313197g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f313198h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f313199i;

    public w5(df2.d6 d6Var, android.view.View rootView, java.util.List gestureInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gestureInfoList, "gestureInfoList");
        this.f313199i = d6Var;
        this.f313191a = rootView;
        this.f313192b = gestureInfoList;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.iqx);
        this.f313193c = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.iqy);
        this.f313194d = findViewById2;
        this.f313195e = (android.widget.ImageView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.oab);
        this.f313196f = (android.widget.TextView) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.oac);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController;Landroid/view/View;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "<init>", "(Lcom/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController;Landroid/view/View;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(df2.w5 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof df2.t5
            if (r0 == 0) goto L16
            r0 = r7
            df2.t5 r0 = (df2.t5) r0
            int r1 = r0.f312947h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f312947h = r1
            goto L1b
        L16:
            df2.t5 r0 = new df2.t5
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f312945f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f312947h
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f312944e
            r45.ir1 r6 = (r45.ir1) r6
            java.lang.Object r0 = r0.f312943d
            df2.w5 r0 = (df2.w5) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r5 = r7
            r7 = r6
            r6 = r0
            r0 = r5
            goto L64
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            int r7 = r6.f313197g
            java.util.List r2 = r6.f313192b
            int r4 = r2.size()
            int r7 = r7 % r4
            java.lang.Object r7 = kz5.n0.a0(r2, r7)
            r45.ir1 r7 = (r45.ir1) r7
            if (r7 != 0) goto L55
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto La6
        L55:
            sg2.x r2 = sg2.x.f489488a
            r0.f312943d = r6
            r0.f312944e = r7
            r0.f312947h = r3
            java.lang.Object r0 = r2.f(r7, r0)
            if (r0 != r1) goto L64
            goto La6
        L64:
            sg2.e r0 = (sg2.e) r0
            if (r0 != 0) goto L6b
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto La6
        L6b:
            android.widget.TextView r1 = r6.f313196f
            r2 = 4
            java.lang.String r3 = r7.m75945x2fec8307(r2)
            if (r3 == 0) goto L75
            goto L77
        L75:
            java.lang.String r3 = ""
        L77:
            r1.setText(r3)
            java.lang.String r0 = r0.f489427a
            android.graphics.Bitmap r1 = com.p314xaae8f345.mm.p786x600aa8b.e.c(r0)
            android.widget.ImageView r6 = r6.f313195e
            r6.setImageBitmap(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "loop tips bindData, "
            r6.<init>(r1)
            java.lang.String r7 = r7.m75945x2fec8307(r2)
            r6.append(r7)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Finder.GestureEffectAnchorSettingController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.w5.a(df2.w5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        java.util.List list = this.f313192b;
        if (list.isEmpty() || ((mm2.c1) this.f313199i.m56788xbba4bfc0(mm2.c1.class)).a8()) {
            android.view.View view = this.f313193c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_TIPS_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GestureEffectAnchorSettingController", "startLoop but hasShown");
            return;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f313198h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f313194d.animate().cancel();
        this.f313197g = 0;
        android.view.View view2 = this.f313193c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "startLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f313198h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this.f313199i, null, null, new df2.v5(this, list.size() > 1, null), 3, null);
    }

    public final void c() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f313198h;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f313194d.animate().cancel();
        this.f313197g = 0;
        android.view.View view = this.f313193c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "stopLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/GestureEffectAnchorSettingController$LoopTips", "stopLoop", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
