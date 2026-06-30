package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o3 {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.h f284595m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.h(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.WeakHashMap f284596n = new java.util.WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Long f284597h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Long f284598i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f284599j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.HashMap f284600k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f284601l;

    public r(long j17, java.lang.Long l17, java.lang.Long l18) {
        this.f284597h = l17;
        this.f284598i = l18;
        this.f93715g = true;
        this.f93704f = j17;
    }

    public final void D(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, java.lang.String str, int i17, int i18) {
        int f17 = e06.p.f(i17, 0, str.length());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        if ((str.length() > 0) && f17 < str.length()) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i18), f17, str.length(), 33);
        }
        c22624x85d69039.b(spannableStringBuilder);
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g E(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j jVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j) this.f284600k.get(k3Var);
        if (jVar == null) {
            return null;
        }
        G(jVar.f284495a, jVar.f284503i);
        android.animation.ValueAnimator valueAnimator = jVar.f284499e;
        valueAnimator.removeAllListeners();
        android.view.View view = jVar.f284496b;
        android.graphics.Rect clipBounds = view.getClipBounds();
        android.graphics.Rect rect = clipBounds != null ? new android.graphics.Rect(clipBounds) : null;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i17 = layoutParams != null ? layoutParams.width : 0;
        float e17 = e06.p.e(((valueAnimator.getAnimatedFraction() * 300.0f) - 150.0f) / 150.0f, 0.0f, 1.0f);
        valueAnimator.cancel();
        H(jVar);
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g(jVar, rect, i17, e17);
    }

    public final void F() {
        if (o()) {
            return;
        }
        i();
        yz5.a aVar = this.f284601l;
        this.f284601l = null;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void G(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2) {
        java.util.HashMap hashMap = this.f284600k;
        hashMap.remove(k3Var);
        if (k3Var2 != null) {
            hashMap.remove(k3Var2);
        }
    }

    public final void H(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j jVar) {
        I(jVar.f284496b, jVar.f284497c, jVar.f284498d);
        android.view.View view = jVar.f284496b;
        view.setClipBounds(jVar.f284500f);
        android.view.View view2 = jVar.f284496b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(jVar.f284501g));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view : null;
        if (c22624x85d69039 != null) {
            java.lang.Integer num = jVar.f284502h;
            J(c22624x85d69039, num != null ? num.intValue() : c22624x85d69039.m84149xac551033(), 1.0f);
        }
        L(view);
        android.view.View view3 = jVar.f284504j;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(jVar.f284505k));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator", "resetViewState", "(Lcom/tencent/mm/ui/chatting/view/ChattingTextChangeItemAnimator$RunningAnim;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void I(android.view.View view, int i17, int i18) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i17;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }

    public final void J(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, int i17, float f17) {
        c22624x85d69039.m84183x1c5c5ff4(android.graphics.Color.argb(e06.p.f(a06.d.b(e06.p.e(f17, 0.0f, 1.0f) * 255.0f), 0, 255), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
    }

    public final void K(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039) {
        android.animation.ValueAnimator valueAnimator;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i iVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i) f284596n.remove(c22624x85d69039);
        if (iVar == null || (valueAnimator = iVar.f284489a) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void L(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) view : null;
        if (c22624x85d69039 == null) {
            return;
        }
        K(c22624x85d69039);
        java.lang.Object parent = c22624x85d69039.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
                c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) parent;
                break;
            } else {
                android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
                parent = view2 != null ? view2.getParent() : null;
            }
        }
        if (c1163xf1deaba4 == null || c1163xf1deaba4.m7949x5701d990() != this || o()) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.c(c1163xf1deaba4, this);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean g(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        return (payloads.isEmpty() ^ true) || f(viewHolder);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f284599j.remove(item);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j jVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j) this.f284600k.get(item);
        if (jVar == null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.a(item);
            if (a17 != null) {
                K(a17);
                return;
            }
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = jVar.f284495a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = jVar.f284503i;
        G(k3Var, k3Var2);
        android.animation.ValueAnimator valueAnimator = jVar.f284499e;
        valueAnimator.removeAllListeners();
        valueAnimator.cancel();
        H(jVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.a(item);
        if (a18 != null) {
            K(a18);
        }
        if (k3Var2 == null || k3Var2 == k3Var) {
            h(k3Var);
        } else {
            h(k3Var2);
            h(k3Var);
        }
        F();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void k() {
        java.util.HashMap hashMap = this.f284600k;
        java.util.Collection values = hashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Set<com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j> X0 = kz5.n0.X0(values);
        hashMap.clear();
        this.f284599j.clear();
        for (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j jVar : X0) {
            jVar.f284499e.removeAllListeners();
            jVar.f284499e.cancel();
            H(jVar);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = jVar.f284503i;
            if (k3Var != null) {
                h(k3Var);
            }
            h(jVar.f284495a);
        }
        i();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public boolean o() {
        return !this.f284600k.isEmpty();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 r(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17, java.util.List payloads) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.a(viewHolder);
        if (a17 != null && (b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.b(a17)) != null) {
            java.lang.CharSequence a18 = a17.a();
            this.f284599j.put(viewHolder, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w(b17.f284666a, b17.f284667b, a18 != null ? a18.length() : 0));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m2 m2Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m2();
        m2Var.a(viewHolder, 0);
        return m2Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void s() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean t(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "holder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.util.HashMap r0 = r14.f284599j
            boolean r0 = r0.containsKey(r15)
            r1 = 0
            if (r0 != 0) goto Lc7
            com.tencent.mm.ui.widget.MMNeat7extView r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.a(r15)
            r2 = 0
            r3 = 2131300369(0x7f091011, float:1.8218766E38)
            if (r0 != 0) goto L19
            goto L40
        L19:
            java.lang.Object r0 = r0.getTag(r3)
            boolean r4 = r0 instanceof java.lang.Long
            if (r4 == 0) goto L24
            java.lang.Long r0 = (java.lang.Long) r0
            goto L25
        L24:
            r0 = r2
        L25:
            if (r0 == 0) goto L40
            long r4 = r0.longValue()
            java.lang.Long r0 = r14.f284597h
            if (r0 == 0) goto L40
            long r6 = r0.longValue()
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto L3a
            goto L40
        L3a:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L40
            r0 = 1
            goto L41
        L40:
            r0 = r1
        L41:
            if (r0 == 0) goto Lc7
            com.tencent.mm.ui.widget.MMNeat7extView r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v.a(r15)
            if (r0 == 0) goto Lc7
            java.lang.Object r3 = r0.getTag(r3)
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L54
            java.lang.Long r3 = (java.lang.Long) r3
            goto L55
        L54:
            r3 = r2
        L55:
            if (r3 == 0) goto Lc7
            long r6 = r3.longValue()
            java.lang.CharSequence r3 = r0.a()
            if (r3 == 0) goto L65
            java.lang.String r2 = r3.toString()
        L65:
            if (r2 != 0) goto L69
            java.lang.String r2 = ""
        L69:
            java.util.WeakHashMap r3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r.f284596n
            java.lang.Object r4 = r3.remove(r0)
            com.tencent.mm.ui.chatting.view.i r4 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i) r4
            if (r4 == 0) goto L7a
            android.animation.ValueAnimator r4 = r4.f284489a
            if (r4 == 0) goto L7a
            r4.cancel()
        L7a:
            android.content.res.Resources r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e
            r5 = 2131100274(0x7f060272, float:1.7812925E38)
            int r11 = r4.getColor(r5)
            com.tencent.mm.ui.chatting.view.i r12 = new com.tencent.mm.ui.chatting.view.i
            r4 = 2
            float[] r4 = new float[r4]
            r4 = {x00cc: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r4)
            java.lang.String r4 = "ofFloat(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r4)
            r8 = 0
            r9 = 4
            r10 = 0
            r4 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            r14.D(r0, r2, r1, r11)
            android.animation.ValueAnimator r10 = r12.f284489a
            r4 = 750(0x2ee, double:3.705E-321)
            r10.setDuration(r4)
            r4 = -1
            r10.setRepeatCount(r4)
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            r10.setInterpolator(r4)
            com.tencent.mm.ui.chatting.view.q r13 = new com.tencent.mm.ui.chatting.view.q
            r4 = r13
            r5 = r2
            r6 = r12
            r7 = r14
            r8 = r0
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.addUpdateListener(r13)
            r3.put(r0, r12)
            android.animation.ValueAnimator r0 = r12.f284489a
            r0.start()
        Lc7:
            r14.h(r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r.t(androidx.recyclerview.widget.k3):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r30, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.r.u(androidx.recyclerview.widget.k3, androidx.recyclerview.widget.k3, int, int, int, int):boolean");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean v(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        x(holder);
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public boolean w(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        y(holder);
        return false;
    }
}
