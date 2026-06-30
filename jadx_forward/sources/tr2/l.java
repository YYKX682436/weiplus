package tr2;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f502922a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f502923b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Button f502924c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f502925d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f502926e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f502927f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f502928g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f502929h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f502930i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View f502931j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f502932k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 f502933l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f502934m;

    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, yz5.l onEmojiChanged) {
        int i17;
        java.lang.CharSequence j17;
        java.lang.CharSequence j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEmojiChanged, "onEmojiChanged");
        int c17 = com.p314xaae8f345.mm.ui.bl.c(activity);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            i17 = (i19 >= i18 ? i19 : i18) - c17;
        }
        boolean z18 = i17 < 680;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity, 0, true, false, com.p314xaae8f345.mm.R.C30868x68b1db1.f575769yq);
        this.f502922a = y1Var;
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 b18 = qk.w9.b(activity);
        this.f502933l = b18;
        this.f502934m = interfaceC4987x84e327cb;
        activity.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.finder.post.interactioneasteregg.InteractionEasterEggAddHalfScreen$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                tr2.l lVar = tr2.l.this;
                lVar.f502933l.getClass();
                lVar.f502933l.a();
            }
        });
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7r, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f502923b = inflate;
        b(inflate, 32, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.b((android.widget.TextView) findViewById);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565024sm2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f502924c = button;
        if (interfaceC4987x84e327cb == null) {
            button.setEnabled(false);
        }
        button.setOnClickListener(new tr2.a(onEmojiChanged, this));
        b(button, 8, 1);
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565015b02);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f502925d = findViewById3;
        findViewById3.setOnClickListener(new tr2.b(this));
        b(findViewById3, 8, 2);
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.ned);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f502930i = findViewById4;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.om7);
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oly);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        int K = r26.n0.K(string, '#', 0, false, 6, null);
        int K2 = r26.n0.K(string, '#', K + 1, false, 4, null);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        j17 = hc2.x0.j(string, activity, K, com.p314xaae8f345.mm.R.raw.f80143xebd704ef, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimensionPixelSize, dimensionPixelSize, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        j18 = hc2.x0.j(j17, activity, K2, com.p314xaae8f345.mm.R.raw.f80313x7abd4f8b, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832, dimensionPixelSize, dimensionPixelSize, (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        textView.setText(j18);
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.rme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f502931j = findViewById5;
        findViewById5.setOnClickListener(new tr2.c(this));
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f502928g = findViewById6;
        if (z18) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                findViewById6.setLayoutParams(marginLayoutParams);
            }
        }
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.skx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f502929h = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.p314xaae8f345.mm.R.id.vif);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f502926e = findViewById8;
        findViewById8.setOnClickListener(new tr2.d(this));
        b(findViewById8, 8, 3);
        android.view.View findViewById9 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568991vj1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f502927f = findViewById9;
        findViewById9.setOnClickListener(new tr2.e(activity, this));
        b(findViewById9, 8, 4);
        android.view.View findViewById10 = inflate.findViewById(com.p314xaae8f345.mm.R.id.det);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f502932k = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t7r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById11;
        int i27 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        b18.mo75331xef640234(113);
        b18.mo75345x9e226965(4);
        b18.c();
        b18.mo75350x625ff6a7(false);
        b18.mo75351x4aab89d0(false);
        b18.p(true, false);
        b18.o(true, false);
        b18.mo75349x4a374107(true);
        b18.mo75348x625a7311(false);
        b18.mo75352xe9a5b5a2(true);
        b18.mo75328x6c4ebec7(new tr2.f(this));
        b18.setVisibility(8);
        viewGroup.addView(b18, new android.widget.FrameLayout.LayoutParams(-1, z18 ? java.lang.Math.min(activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561235cy), qk.w9.a(activity)) : qk.w9.a(activity)));
        y1Var.l(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
        y1Var.f293570s = new tr2.g(this);
        a(interfaceC4987x84e327cb, true);
        c();
    }

    public final void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17) {
        this.f502934m = interfaceC4987x84e327cb;
        if (!z17) {
            this.f502924c.setEnabled(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = this.f502932k;
        if (interfaceC4987x84e327cb != null) {
            android.view.View view = this.f502929h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f502931j;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e = c15276x168ec665.m43708x63ed375e();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m43708x63ed375e != null ? m43708x63ed375e.mo42933xb5885648() : null, interfaceC4987x84e327cb.mo42933xb5885648())) {
                return;
            }
            c15276x168ec665.m43715x36e51bc8(new tr2.j(interfaceC4987x84e327cb, this));
            c15276x168ec665.m43712xc040f7d2(interfaceC4987x84e327cb);
            c15276x168ec665.requestLayout();
            return;
        }
        android.view.View view3 = this.f502929h;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList5.add(4);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "invisible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c15276x168ec665.m43715x36e51bc8(null);
        c15276x168ec665.m43712xc040f7d2(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec6652 = this.f502932k;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(c15276x168ec6652, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Integer.valueOf(intValue4));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(c15276x168ec6652, arrayList8.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c15276x168ec6652.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(c15276x168ec6652, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c15276x168ec6652, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f502931j;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view4, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(intValue5));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(view4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "onPreviewEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view4, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(android.view.View view, int i17, java.lang.Integer num) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        lz5.m mVar = new lz5.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        mVar.put("enterscene", c19783xd9a946b7 != null ? java.lang.Integer.valueOf(c19783xd9a946b7.m76275xbcc8608a()) : null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        mVar.put("finder_post_sessionid", c19783xd9a946b72 != null ? c19783xd9a946b72.m76327x23a7af9b() : null);
        d2Var.n(view, "set_like_easter_egg_half_screen", (r20 & 4) != 0 ? 40 : i17, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.b(mVar), (r20 & 128) != 0 ? null : new tr2.k(this, num));
    }

    public final void c() {
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 abstractC4989x9e6071f3 = this.f502933l;
        abstractC4989x9e6071f3.setVisibility(0);
        android.view.View view = this.f502930i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/interactioneasteregg/InteractionEasterEggAddHalfScreen", "showEmojiPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        abstractC4989x9e6071f3.i();
    }
}
