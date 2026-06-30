package lx2;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 f403583a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f403584b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f403585c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f403586d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f403587e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f403588f;

    /* renamed from: g, reason: collision with root package name */
    public r45.px2 f403589g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f403590h;

    /* renamed from: i, reason: collision with root package name */
    public long f403591i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Long f403592j;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 tipsLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        this.f403583a = tipsLayout;
        android.content.Context context = tipsLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f403584b = context;
        android.content.res.Resources resources = tipsLayout.getContext().getResources();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "getResources(...)");
        this.f403585c = resources;
        this.f403586d = jz5.h.b(new lx2.c(this));
        this.f403587e = jz5.h.b(new lx2.b(this));
        this.f403588f = jz5.h.b(lx2.a.f403580d);
    }

    public final void a(android.content.Context context, android.view.View tipsLayout, android.widget.FrameLayout.LayoutParams layoutParams, int i17) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsLayout, "tipsLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutParams, "layoutParams");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gi X6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class)).X6(i17);
        if (X6 == null || (textView = X6.f216061e) == null) {
            return;
        }
        if (!(textView.getVisibility() == 0)) {
            textView = null;
        }
        if (textView == null) {
            return;
        }
        int[] iArr = new int[2];
        textView.getLocationInWindow(iArr);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iArr[0]);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(tipsLayout.getWidth());
            if (!(valueOf2.intValue() > 0)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf((intValue + (textView.getWidth() / 2)) - (valueOf2.intValue() / 2));
                java.lang.Integer num = valueOf3.intValue() > 0 ? valueOf3 : null;
                if (num != null) {
                    int intValue2 = num.intValue();
                    layoutParams.gravity = 8388659;
                    layoutParams.setMarginStart(intValue2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f(), "adjustTabBubbleLayout leftMargin=" + intValue2 + ", tabType: " + i17);
                }
            }
        }
    }

    public final void b() {
        java.lang.Long l17 = this.f403592j;
        if (l17 != null) {
            long longValue = l17.longValue();
            this.f403592j = null;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
            this.f403591i = currentTimeMillis;
            org.json.JSONObject jSONObject = this.f403590h;
            if (jSONObject != null) {
                jSONObject.put("expose_time_ms", java.lang.String.valueOf(currentTimeMillis));
            }
        }
    }

    public abstract r45.qt2 c();

    public abstract java.lang.String d();

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map g(java.lang.Integer r11) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.d.g(java.lang.Integer):java.util.Map");
    }

    public void h() {
        b();
        r45.qt2 c17 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, c17, e(), 1, this.f403590h, false, null, 48, null);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f403588f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((cy1.a) ((dy1.r) mo141623x754a37bb)).yj("view_clk", null, g(c17 != null ? java.lang.Integer.valueOf(c17.m75939xb282bd08(5)) : null), 1, false);
    }

    public void i(android.view.View arrow, android.widget.LinearLayout.LayoutParams arrowParams, android.widget.FrameLayout.LayoutParams tipsParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrow, "arrow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrowParams, "arrowParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsParams, "tipsParams");
        android.content.Context context = this.f403584b;
        tipsParams.topMargin = ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay)) + ((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj)) + ((java.lang.Number) ((jz5.n) this.f403586d).mo141623x754a37bb()).intValue();
        tipsParams.width = -2;
        tipsParams.height = -2;
        arrow.setLayoutParams(arrowParams);
        this.f403583a.setLayoutParams(tipsParams);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb j(r45.px2 px2Var, java.lang.ref.WeakReference weakReference) {
        boolean z17;
        java.lang.String string;
        android.widget.ImageView imageView;
        java.lang.String str;
        r45.lb lbVar;
        r45.v80 v80Var;
        java.lang.String str2;
        r45.f03 f03Var;
        r45.ya0 ya0Var;
        r45.fz2 fz2Var;
        r45.f03 f03Var2;
        r45.ya0 ya0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15298x95ee76f1 c15298x95ee76f1 = this.f403583a;
        c15298x95ee76f1.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qb qbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qb(weakReference);
        if (px2Var == null || (f03Var = (r45.f03) px2Var.m75936x14adae67(1)) == null || (ya0Var = f03Var.B) == null || (fz2Var = ya0Var.f472451d) == null) {
            z17 = false;
        } else {
            r45.px2 px2Var2 = c15298x95ee76f1.f212679g;
            if (fz2Var.mo516x5c5a33d4((px2Var2 == null || (f03Var2 = (r45.f03) px2Var2.m75936x14adae67(1)) == null || (ya0Var2 = f03Var2.B) == null) ? null : ya0Var2.f472451d)) {
                qbVar.a(new oc2.j(oc2.i.f425735d, true, (r45.f03) px2Var.m75936x14adae67(1), null));
            } else {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.f565669d52);
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    frameLayout.removeAllViews();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b(c15298x95ee76f1.getContext());
                    oc2.h hVar = new oc2.h((int) c13738xbdff117b.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561976y2), false, false);
                    hVar.f425725d = oc2.f.f425698d;
                    c13738xbdff117b.f("Finder.HomeTabRedDotTipsBubbleView", hVar, fz2Var, qbVar);
                    frameLayout.addView(c13738xbdff117b, new android.widget.FrameLayout.LayoutParams(-2, -2));
                }
                android.view.View findViewById = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.oa8);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView", "updateDsl", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Lcom/tencent/mm/plugin/finder/extension/reddot/render/INodeRender$RenderCallback;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderHomeTabRedDotTipsBubbleView", "updateDsl", "(Lcom/tencent/mm/protocal/protobuf/FinderStreamTipsShowInfo;Lcom/tencent/mm/plugin/finder/extension/reddot/render/INodeRender$RenderCallback;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            z17 = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update is dslRender=");
        sb6.append(z17);
        sb6.append(",rRenderCallback is null:");
        sb6.append(weakReference == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb6.toString());
        if (z17) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb.f213966e;
        }
        c15298x95ee76f1.f212679g = px2Var;
        r45.f03 f03Var3 = px2Var != null ? (r45.f03) px2Var.m75936x14adae67(1) : null;
        java.util.LinkedList linkedList = f03Var3 != null ? f03Var3.f455429p : null;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        java.lang.String str3 = "";
        if (linkedList.isEmpty()) {
            java.lang.String str4 = f03Var3 != null ? f03Var3.f455423g : null;
            if (!(str4 == null || str4.length() == 0)) {
                if (f03Var3 == null || (str2 = f03Var3.f455423g) == null) {
                    str2 = "";
                }
                linkedList.add(str2);
            }
        }
        if (linkedList.isEmpty()) {
            c15298x95ee76f1.setVisibility(8);
        }
        android.view.View findViewById2 = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gex);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gey);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.gez);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById4;
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
        imageView4.setVisibility(8);
        android.view.View findViewById5 = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        if (f03Var3 == null || (string = f03Var3.f455422f) == null) {
            string = c15298x95ee76f1.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvt);
        }
        textView.setText(string);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        textView.setMaxWidth((int) textView.getResources().getDimension(linkedList.size() > 1 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561214ch : com.p314xaae8f345.mm.R.C30860x5b28f31.f561972xy));
        android.view.View findViewById6 = c15298x95ee76f1.findViewById(com.p314xaae8f345.mm.R.id.oag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById6;
        r45.eh6 eh6Var = (f03Var3 == null || (lbVar = f03Var3.f455437x) == null || (v80Var = lbVar.f460817d) == null) ? null : v80Var.f469515e;
        if (eh6Var != null && (str = eh6Var.f455035e) != null) {
            str3 = str;
        }
        int color = c15298x95ee76f1.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560779ty);
        boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (z18) {
            c22699x3dcdb352.setVisibility(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeTabRedDotTipsBubbleView", "loadHighLightIcon: iconUrl" + str3 + " highLightColor:" + color);
            wo0.c b17 = g1Var.e().b(new mn2.q3(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411497r));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mb mbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mb(c22699x3dcdb352, color, str3);
            b17.getClass();
            b17.f529406d = mbVar;
            b17.f529412j = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ob(str3, c22699x3dcdb352, color);
            b17.f529411i = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.pb(c22699x3dcdb352);
            b17.f();
            c22699x3dcdb352.m82040x7541828(color);
        } else {
            c22699x3dcdb352.setVisibility(8);
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str5 = (java.lang.String) obj;
            if (i17 == 0) {
                imageView2.setVisibility(0);
                imageView = imageView2;
            } else if (i17 != 1) {
                imageView4.setVisibility(0);
                imageView = imageView4;
            } else {
                imageView3.setVisibility(0);
                imageView = imageView3;
            }
            if (f03Var3 != null && f03Var3.f455420d == 4) {
                g1Var.a().c(new mn2.n(str5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W), imageView, g1Var.h(mn2.f1.f411490h));
            } else {
                g1Var.l().c(new mn2.n(str5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W), imageView, g1Var.h(mn2.f1.f411494o));
            }
            i17 = i18;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.jb.f213965d;
    }
}
