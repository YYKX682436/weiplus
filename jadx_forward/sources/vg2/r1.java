package vg2;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f518093a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f518094b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f518095c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f518096d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f518097e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f518098f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xi6 f518099g;

    /* renamed from: h, reason: collision with root package name */
    public ce2.i f518100h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f518101i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewGroup f518102j;

    /* renamed from: k, reason: collision with root package name */
    public final vg2.b1 f518103k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22844xf57b2386 f518104l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f518105m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f518106n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f518107o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f518108p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f518109q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f518110r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f518111s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f518112t;

    public r1(android.content.Context context, android.view.ViewGroup parentRoot, yz5.a closeGiftPanel, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentRoot, "parentRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeGiftPanel, "closeGiftPanel");
        this.f518093a = context;
        this.f518094b = parentRoot;
        this.f518095c = closeGiftPanel;
        this.f518096d = pVar;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.as9, (android.view.ViewGroup) null);
        this.f518097e = inflate;
        this.f518098f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f518099g = new r45.xi6();
        this.f518100h = new ce2.i();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f518101i = linkedList;
        vg2.b1 b1Var = new vg2.b1(this, linkedList);
        this.f518103k = b1Var;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22844xf57b2386 c22844xf57b2386 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22844xf57b2386) inflate.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        c22844xf57b2386.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22844xf57b2386.getContext(), 0, false));
        c22844xf57b2386.setVerticalFadingEdgeEnabled(false);
        c22844xf57b2386.setVerticalScrollBarEnabled(false);
        c22844xf57b2386.setOverScrollMode(2);
        c22844xf57b2386.mo7960x6cab2c8d(b1Var);
        this.f518104l = c22844xf57b2386;
        this.f518105m = jz5.h.b(new vg2.l1(this));
        this.f518106n = jz5.h.b(new vg2.o1(this));
        this.f518107o = jz5.h.b(new vg2.m1(this));
        this.f518108p = jz5.h.b(new vg2.n1(this));
        this.f518109q = jz5.h.b(new vg2.f1(this));
        this.f518110r = jz5.h.b(new vg2.e1(this));
        this.f518111s = jz5.h.b(new vg2.h1(this));
        this.f518112t = jz5.h.b(new vg2.j1(this));
        c22844xf57b2386.N(new vg2.c1(this));
    }

    public static final void a(vg2.r1 r1Var, android.view.ViewGroup viewGroup) {
        int width;
        android.graphics.drawable.Drawable drawable;
        int i17;
        r1Var.getClass();
        int i18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        int[] t17 = pm0.v.t(viewGroup);
        boolean z17 = true;
        int i19 = t17[1];
        int height = r1Var.e().getHeight();
        android.widget.ImageView imageView = r1Var.f518098f;
        int height2 = i19 - (height + imageView.getHeight());
        int width2 = t17[0] + (viewGroup.getWidth() / 2);
        android.content.Context context = r1Var.f518093a;
        int b17 = i65.a.b(context, 16);
        if (width2 - (r1Var.e().getWidth() / 2) < b17) {
            width = b17;
        } else {
            int i27 = i18 - b17;
            width = (r1Var.e().getWidth() / 2) + width2 > i27 ? (i27 - r1Var.e().getWidth()) - r1Var.e().getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj) : width2 - (r1Var.e().getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = r1Var.e().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < b17) {
                width = b17;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.topMargin = height2;
            marginLayoutParams.rightMargin = b17;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = r1Var.e().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i28 = a17.f278668a;
        if (!z17 && i28 > (i17 = a17.f278669b)) {
            i28 = i17;
        }
        int paddingLeft = (((((i28 - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0)) - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0)) - r1Var.e().getPaddingLeft()) - r1Var.e().getPaddingRight()) - r1Var.d().getPaddingLeft()) - r1Var.d().getPaddingRight();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22844xf57b2386 c22844xf57b2386 = r1Var.f518104l;
        c22844xf57b2386.m82897x8e6ff544(paddingLeft);
        jz5.g gVar = r1Var.f518105m;
        if (((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getVisibility() == 0) {
            ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getWidth();
        }
        c22844xf57b2386.requestLayout();
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560591om), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.leftMargin = width2 - (imageView.getWidth() / 2);
        }
        android.view.View view = r1Var.f518097e;
        view.requestLayout();
        view.post(new vg2.d1(r1Var));
    }

    public static final java.lang.String b(vg2.r1 r1Var) {
        android.view.ViewGroup viewGroup = r1Var.f518102j;
        if (viewGroup != null) {
            java.lang.Object tag = viewGroup.getTag(com.p314xaae8f345.mm.R.id.f2u);
            java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
            if (num != null) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1;
                int intValue = (num.intValue() / 4) + 1;
                int intValue2 = (num.intValue() + 1) % 4;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(intValue);
                sb6.append('-');
                sb6.append(intValue2);
                return sb6.toString();
            }
        }
        return "";
    }

    public static final void c(vg2.r1 r1Var, r45.yi6 yi6Var) {
        r1Var.getClass();
        boolean m75933x41a8a7f2 = yi6Var.m75933x41a8a7f2(8);
        jz5.g gVar = r1Var.f518105m;
        if (!m75933x41a8a7f2) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean m75933x41a8a7f22 = r1Var.f518099g.m75933x41a8a7f2(4);
        jz5.g gVar2 = r1Var.f518106n;
        jz5.g gVar3 = r1Var.f518107o;
        if (m75933x41a8a7f22) {
            android.view.View view3 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setText(yi6Var.m75945x2fec8307(11));
            return;
        }
        android.view.View view4 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomTextEntrance", "(Lcom/tencent/mm/protocal/protobuf/SwitchSkinItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb()).setText(yi6Var.m75945x2fec8307(9));
        ((android.widget.TextView) ((jz5.n) r1Var.f518108p).mo141623x754a37bb()).setText(java.lang.String.valueOf((int) (yi6Var.m75938x746dc8a6(5) - r1Var.f518100h.f67813x29a891c4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if ((!((java.lang.Boolean) ae2.in.f85258d6.r()).booleanValue() && gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_HAS_SHOW_GIFT_SKIN_PANEL_BOOLEAN_SYNC, false)) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(vg2.r1 r3, android.view.ViewGroup r4, ce2.i r5, boolean r6, boolean r7, int r8, java.lang.Object r9) {
        /*
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L6
            r6 = r0
        L6:
            r8 = r8 & 8
            if (r8 == 0) goto Lb
            r7 = r0
        Lb:
            r3.getClass()
            java.lang.String r8 = "attachView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r8)
            java.lang.String r8 = "giftInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r8)
            int r8 = r5.f67799x225ba391
            r9 = 64
            boolean r8 = pm0.v.z(r8, r9)
            r9 = 1
            if (r8 == 0) goto L2e
            int r8 = r5.f67810x6cc83fdf
            if (r8 != r9) goto L29
            r8 = r9
            goto L2a
        L29:
            r8 = r0
        L2a:
            if (r8 == 0) goto L2e
            r8 = r9
            goto L2f
        L2e:
            r8 = r0
        L2f:
            r45.aw1 r1 = dk2.u7.f315727n
            if (r1 == 0) goto L38
            int r1 = r1.m75939xb282bd08(r0)
            goto L39
        L38:
            r1 = r0
        L39:
            int r2 = r5.f67804x8e6dc6f8
            if (r1 >= r2) goto L3f
            r1 = r9
            goto L40
        L3f:
            r1 = r0
        L40:
            java.lang.String r2 = "GiftSkinSelectPanelWidget"
            if (r8 != 0) goto Ld0
            if (r1 == 0) goto L48
            goto Ld0
        L48:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "showWidget showCustomGiftInfo:"
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r8)
            r3.f518102j = r4
            r3.f518100h = r5
            boolean r8 = r5.T0()
            if (r8 == 0) goto L67
            r3.h(r4, r0)
            goto Lb2
        L67:
            if (r7 == 0) goto L80
            r45.xi6 r6 = new r45.xi6
            r6.<init>()
            r3.f518099g = r6
            r45.na0 r5 = r5.D0()
            if (r5 == 0) goto L7c
            r6 = 10
            boolean r0 = r5.m75933x41a8a7f2(r6)
        L7c:
            r3.i(r4, r0, r9)
            goto Lb2
        L80:
            r45.xi6 r5 = r5.f67816xdcd1d904
            java.lang.String r7 = "field_switchSkinInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r7)
            r3.f518099g = r5
            if (r6 != 0) goto Lae
            nb2.a r5 = ae2.in.f85258d6
            java.lang.Object r5 = r5.r()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto Lab
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r6 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_HAS_SHOW_GIFT_SKIN_PANEL_BOOLEAN_SYNC
            boolean r5 = r5.o(r6, r0)
            if (r5 == 0) goto Lab
            r5 = r9
            goto Lac
        Lab:
            r5 = r0
        Lac:
            if (r5 != 0) goto Laf
        Lae:
            r0 = r9
        Laf:
            r3.h(r4, r0)
        Lb2:
            android.view.View r4 = r3.f518097e
            r4.requestLayout()
            android.view.ViewGroup r3 = r3.f518094b
            r3.removeView(r4)
            r3.addView(r4)
            gm0.b0 r3 = gm0.j1.u()
            com.tencent.mm.storage.n3 r3 = r3.c()
            com.tencent.mm.storage.u3 r4 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_HAS_SHOW_GIFT_SKIN_PANEL_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.x(r4, r5)
            r0 = r9
            goto Ld5
        Ld0:
            java.lang.String r3 = "giftInfo no unlock , dont show panel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
        Ld5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vg2.r1.j(vg2.r1, android.view.ViewGroup, ce2.i, boolean, boolean, int, java.lang.Object):boolean");
    }

    public final android.view.View d() {
        return (android.view.View) ((jz5.n) this.f518110r).mo141623x754a37bb();
    }

    public final android.view.View e() {
        return (android.view.View) ((jz5.n) this.f518109q).mo141623x754a37bb();
    }

    public final android.widget.TextView f() {
        return (android.widget.TextView) ((jz5.n) this.f518111s).mo141623x754a37bb();
    }

    public final void g() {
        android.view.View view = this.f518097e;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f518097e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f518094b.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x017e, code lost:
    
        if (r6 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b2, code lost:
    
        r3 = r4.get(r2.f518014e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, "get(...)");
        c(r5, (r45.yi6) r3);
        r2.m8151xc67946d3(0, r1.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.view.ViewGroup r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg2.r1.h(android.view.ViewGroup, boolean):void");
    }

    public final void i(android.view.ViewGroup viewGroup, boolean z17, boolean z18) {
        if (z18) {
            android.view.View view = this.f518097e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomGiftGuideText", "(Landroid/view/ViewGroup;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomGiftGuideText", "(Landroid/view/ViewGroup;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f518097e.getViewTreeObserver().addOnGlobalLayoutListener(new vg2.q1(this, viewGroup));
        }
        jz5.g gVar = this.f518112t;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb();
        android.content.Context context = this.f518093a;
        textView.setText(z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbx) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dbw));
        android.view.View d17 = d();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomGiftGuideText", "(Landroid/view/ViewGroup;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSkinSelectPanelWidget", "refreshCustomGiftGuideText", "(Landroid/view/ViewGroup;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f().setVisibility(8);
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
    }
}
