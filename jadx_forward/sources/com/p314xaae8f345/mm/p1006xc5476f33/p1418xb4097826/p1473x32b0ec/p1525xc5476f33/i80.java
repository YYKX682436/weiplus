package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i80 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f194470d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f194471e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f194472f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f194473g;

    /* renamed from: h, reason: collision with root package name */
    public final cm2.t f194474h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f194475i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f194476m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f194477n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f194478o;

    /* renamed from: p, reason: collision with root package name */
    public cm2.f0 f194479p;

    public i80(android.content.Context context, gk2.e buContext, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194470d = context;
        this.f194471e = buContext;
        this.f194472f = statusMonitor;
        this.f194473g = lVar;
        this.f194474h = tVar;
        this.f194475i = "FinderLiveRedPacketBubble";
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570505ay3, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f194476m = (android.view.ViewGroup) inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f194474h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        cm2.f0 f0Var;
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "POST_PORTRAIT") || (f0Var = this.f194479p) == null) {
            return;
        }
        a(f0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    public final void a(cm2.f0 f0Var) {
        java.util.LinkedList m75941xfb821914;
        r45.wd5 wd5Var;
        xu2.u uVar;
        xu2.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var;
        android.content.Context context = this.f194470d;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        java.lang.String str = this.f194475i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "goRedPacketCoverPage isLandscape:" + z17);
        java.lang.String str2 = null;
        if (z17) {
            dk2.ef efVar = dk2.ef.f314905a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var == null || (r60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60.class)) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.q1(r60Var, "POST_PORTRAIT", null, 2, null);
            return;
        }
        bf2.c.c(bf2.c.f101131a, this.f194471e, 5, 7, null, 0, null, 0, 0, null, 0, 1016, null);
        gk2.e eVar = this.f194471e;
        if (((mm2.c1) eVar.a(mm2.c1.class)).M7()) {
            qo0.c cVar = this.f194472f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
            if (k0Var2 != null && (uVar = (xu2.u) k0Var2.mo57682x2a5e9229(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
                vVar.b();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "needJump:" + f0Var.f124921g);
        if (f0Var.f124921g) {
            this.f194478o = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c80(this, null), 3, null);
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            new ke2.v(e1Var.f410516m, e1Var.f410521r.m75942xfb822ef2(0), 7, xy2.c.e(context), ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, f0Var.f124920f, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(f0Var.f124875v.mo14344x5f01b1f6()), null, null, null, 512, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d80(this, f0Var));
        } else {
            r45.e52 e52Var = f0Var.f124875v;
            if (e52Var != null && (m75941xfb821914 = e52Var.m75941xfb821914(0)) != null && (wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb821914)) != null) {
                str2 = wd5Var.m75945x2fec8307(4);
            }
            b(str2);
        }
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194475i, "url: " + str);
        android.content.Intent intent = new android.content.Intent();
        if (str == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(this.f194470d, "webview", ".ui.tools.WebViewUI", intent, 1011);
    }

    public final void c(cm2.f0 f0Var) {
        android.view.View view;
        java.lang.Object obj;
        this.f194479p = f0Var;
        android.view.ViewGroup viewGroup = this.f194476m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566331fk4);
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566332fk5);
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.hhj);
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.eqy);
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o6s);
        int i17 = 0;
        java.util.LinkedList m75941xfb821914 = f0Var.f124875v.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getInfos(...)");
        r45.wd5 wd5Var = (r45.wd5) kz5.n0.Z(m75941xfb821914);
        gk2.e eVar = this.f194471e;
        if (wd5Var != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d e17 = g1Var.e();
            view = findViewById2;
            mn2.q3 q3Var = new mn2.q3(wd5Var.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411505z));
            textView3.setText(wd5Var.m75945x2fec8307(0));
            if (wd5Var.m75939xb282bd08(6) != 0) {
                java.lang.String m75945x2fec8307 = wd5Var.m75945x2fec8307(7);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    m75945x2fec8307 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.otr);
                }
                if (wd5Var.m75939xb282bd08(8) > 0) {
                    m75945x2fec8307 = m75945x2fec8307 + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ots, java.lang.Integer.valueOf(wd5Var.m75939xb282bd08(8)));
                }
                textView2.setText(m75945x2fec8307);
            } else {
                java.lang.String m75945x2fec83072 = wd5Var.m75945x2fec8307(7);
                if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                    textView2.setText(wd5Var.m75945x2fec8307(7));
                }
            }
            java.lang.String m75945x2fec83073 = wd5Var.m75945x2fec8307(2);
            if (m75945x2fec83073 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
                r45.i52 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k0.f197118a.a(m75945x2fec83073);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveStatus] status:");
                if (a17 == null || (obj = pm0.b0.g(a17)) == null) {
                    obj = "null";
                }
                sb6.append(obj);
                sb6.append(", url:");
                sb6.append(m75945x2fec83073);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194475i, sb6.toString());
                android.content.Context context = this.f194470d;
                if (a17 == null) {
                    textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9m));
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
                    textView.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6d));
                    i17 = 0;
                } else {
                    i17 = 0;
                    if (a17.m75933x41a8a7f2(0)) {
                        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9n));
                        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                        textView.setBackground(null);
                        if (viewGroup == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                            throw null;
                        }
                        viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e80(f0Var), 5000L);
                    } else if (a17.m75939xb282bd08(1) == 0) {
                        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9m));
                        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6));
                        textView.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a6d));
                    } else {
                        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e9o));
                        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
                        textView.setBackground(null);
                        if (viewGroup == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                            throw null;
                        }
                        viewGroup.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.e80(f0Var), 5000L);
                    }
                }
                if (zl2.r4.f555483a.y1(eVar)) {
                    findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f80(this, f0Var));
                } else {
                    findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.g80(this, f0Var));
                }
            } else {
                i17 = 0;
            }
        } else {
            view = findViewById2;
        }
        if (zl2.r4.f555483a.y1(eVar)) {
            textView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = view;
            view2.setVisibility(((java.lang.Integer) arrayList.get(i17)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int i18 = i17;
        android.view.View view3 = view;
        textView.setVisibility(i18);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(i18)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble", "refreshView", "(Lcom/tencent/mm/plugin/finder/live/view/convert/PromoteRedPacketItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h80(this, f0Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        return com.p314xaae8f345.mm.R.id.eqy;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.f0) {
            c((cm2.f0) data);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        android.view.ViewGroup viewGroup = this.f194476m;
        if (viewGroup != null) {
            return viewGroup;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data instanceof cm2.f0) {
            c((cm2.f0) data);
            bf2.c.c(bf2.c.f101131a, this.f194471e, 1, 7, null, 0, null, 0, 0, null, 0, 1016, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        return com.p314xaae8f345.mm.R.id.hhj;
    }
}
