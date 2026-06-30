package ys2;

/* loaded from: classes3.dex */
public final class x extends if2.b implements android.view.View.OnTouchListener {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f546729m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f546730n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f546731o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f546732p;

    /* renamed from: q, reason: collision with root package name */
    public float f546733q;

    /* renamed from: r, reason: collision with root package name */
    public long f546734r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, this.f546730n != null ? r1.getHeight() : 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(false);
        translateAnimation.setAnimationListener(new ys2.u(this));
        android.view.ViewGroup viewGroup = this.f546730n;
        if (viewGroup != null) {
            viewGroup.startAnimation(translateAnimation);
        }
    }

    public final void a7() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).N1 = true;
        X6(qo0.b.Z2, bundle);
        if2.d0 d0Var = this.f546729m;
        if (d0Var != null) {
            d0Var.d(0);
        }
        android.view.ViewGroup viewGroup = this.f546730n;
        if (viewGroup != null) {
            viewGroup.measure(0, 0);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, viewGroup.getMeasuredHeight(), 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            viewGroup.startAnimation(translateAnimation);
        }
        r45.i72 i72Var = (r45.i72) ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75936x14adae67(44);
        java.lang.Iterable<r45.w94> m75941xfb821914 = i72Var != null ? i72Var.m75941xfb821914(7) : null;
        if (m75941xfb821914 == null) {
            m75941xfb821914 = kz5.p0.f395529d;
        }
        org.json.JSONObject b17 = ml2.z0.b(ml2.z0.f409863a, null, 1, null);
        b17.put("wonderful_list_type", 1);
        for (r45.w94 w94Var : m75941xfb821914) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject = b17.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_wonderful_list_exp", jSONObject);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0 != 3) goto L33;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "v"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L82
            r3 = 0
            if (r0 == r2) goto L62
            r4 = 2
            if (r0 == r4) goto L3b
            r11 = 3
            if (r0 == r11) goto L62
            goto L9d
        L3b:
            android.view.ViewGroup r10 = r9.f546730n
            if (r10 == 0) goto L46
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L46
            r3 = r2
        L46:
            if (r3 != 0) goto L9d
            float r10 = r9.f546733q
            float r11 = r11.getY()
            float r10 = r10 - r11
            android.content.Context r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r11 = r11.getScaledTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L9d
            r9.a7()
            goto L9d
        L62:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r9.f546734r
            long r4 = r4 - r6
            int r11 = android.view.ViewConfiguration.getTapTimeout()
            long r6 = (long) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L75
            r9.Z6()
        L75:
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L7c
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L7c:
            if (r1 == 0) goto L9d
            r1.requestDisallowInterceptTouchEvent(r3)
            goto L9d
        L82:
            r11.getX()
            float r11 = r11.getY()
            r9.f546733q = r11
            long r3 = java.lang.System.currentTimeMillis()
            r9.f546734r = r3
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L98
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L98:
            if (r1 == 0) goto L9d
            r1.requestDisallowInterceptTouchEvent(r2)
        L9d:
            java.lang.String r5 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = 1
            r4 = r9
            yj0.a.i(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.x.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fkc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        this.f546729m = new if2.d0(viewGroup, this);
        viewGroup.setOnClickListener(new ys2.v(this));
        this.f546732p = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566775h03);
        this.f546731o = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pnu);
        this.f546730n = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pnv);
        android.view.View view = this.f546732p;
        if (view != null) {
            view.setOnClickListener(new ys2.w(this));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f546731o;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7960x6cab2c8d(new ys2.t(this));
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(viewGroup.getContext(), 0, false));
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        if2.d0 d0Var = this.f546729m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f546730n = null;
        this.f546731o = null;
        this.f546732p = null;
    }
}
