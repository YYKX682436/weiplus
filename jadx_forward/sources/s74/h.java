package s74;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o0 f485852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f485853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s74.o0 o0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f485852d = o0Var;
        this.f485853e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        s74.f3 f3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        java.lang.String str3 = "invoke";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        s74.o0 o0Var = this.f485852d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 F = o0Var.F();
        if (F != null) {
            F.m70598x59285800(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.j(), "processClickableViews");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) o0Var.i();
        if (c17933xe8d1b2262 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        } else {
            android.content.Context E = o0Var.E();
            android.app.Activity activity = E instanceof android.app.Activity ? (android.app.Activity) E : null;
            if (activity != null) {
                s74.f3 f3Var2 = o0Var.f485991y;
                if (f3Var2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.List list = f3Var2.f485821v;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                    java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                    while (it.hasNext()) {
                        jz5.l lVar = (jz5.l) it.next();
                        android.view.View view = (android.view.View) lVar.f384366d;
                        org.json.JSONObject jSONObject = (org.json.JSONObject) lVar.f384367e;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString(dm.i4.f66865x76d1ec5a), "clickActionButton")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o0Var.j(), "clickActionButton is already clickable!");
                        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("type"), "gridElement")) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(o0Var.j(), "gridElement is already clickable!");
                        } else {
                            if (jSONObject.has("click-type")) {
                                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "rootElementClick");
                                s74.p2 p2Var = o0Var.f485985s;
                                if (b17) {
                                    view.setTag(p2Var.e());
                                    view.setOnClickListener(new s74.b0(o0Var));
                                } else {
                                    str2 = str3;
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "mainElementClick")) {
                                        if (f3Var2.e().f370821b.m70136xbd5ce118()) {
                                            w64.n nVar = new w64.n(o0Var.E(), o0Var.f485981o, o0Var.f485982p, null, new s74.j0(view));
                                            s74.c0 c0Var = new s74.c0(view);
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnGetJumpAnimInfoListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                                            nVar.f524860t = c0Var;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnGetJumpAnimInfoListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = f3Var2.e().f370821b.f38162xfb2a357c;
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 a17 = m0Var != null ? m0Var.a() : null;
                                            if (a17 != null) {
                                                a17.f244102a = 11;
                                                nVar.p(new w64.c(a17, c17933xe8d1b2262, 0, null, true, 1, false, null, 204, null));
                                            }
                                            view.setOnClickListener(new s74.d0(c17933xe8d1b2262, o0Var, nVar));
                                        } else {
                                            view.setTag(p2Var.e());
                                            i64.q e17 = f3Var2.e();
                                            e17.getClass();
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isVideo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isVideo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
                                            if (e17.f370823d) {
                                                view.setOnClickListener(new s74.e0(o0Var));
                                            } else {
                                                view.setOnClickListener(new s74.f0(o0Var));
                                            }
                                        }
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "actionLinkClick")) {
                                        view.setTag(java.lang.Long.valueOf(c17933xe8d1b2262.f68891x29d1292e));
                                        view.setOnClickListener(new s74.g0(o0Var));
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "gameGiftTagClick")) {
                                        view.setOnClickListener(new s74.h0(o0Var, c17933xe8d1b2262, f3Var2));
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "consultBarTitleClick") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "consultBarButtonClick")) {
                                        view.setOnClickListener(new s74.i0(f3Var2, o0Var, c17933xe8d1b2262, jSONObject));
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "actionButtonClick")) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createActionButtonClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                                        final s74.e1 e1Var = new s74.e1((s74.o2) o0Var, c17933xe8d1b2262, o0Var.f485983q);
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createActionButtonClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent");
                                        view.setOnClickListener(new android.view.View.OnClickListener(e1Var) { // from class: s74.l0

                                            /* renamed from: d, reason: collision with root package name */
                                            public final /* synthetic */ yz5.l f485934d;

                                            {
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e1Var, "function");
                                                this.f485934d = e1Var;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(android.view.View view2) {
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$sam$android_view_View_OnClickListener$0");
                                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                                arrayList.add(view2);
                                                java.lang.Object[] array = arrayList.toArray();
                                                arrayList.clear();
                                                yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                                                this.f485934d.mo146xb9724478(view2);
                                                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AbsDynamicComponent$sam$android_view_View_OnClickListener$0", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$sam$android_view_View_OnClickListener$0");
                                            }
                                        });
                                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("click-type"), "gridElementClick")) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.j(), "init gridElementClick, id=" + jSONObject.optString(dm.i4.f66865x76d1ec5a) + ", type=" + jSONObject.optString("type"));
                                        if (c17933xe8d1b2262.m70384xbd5ce118()) {
                                            view.setOnClickListener(new s74.y(o0Var, view));
                                        } else {
                                            view.setTag(p2Var.e());
                                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f17 = p2Var.f();
                                            view.setOnClickListener(f17 != null ? f17.f251346p : null);
                                        }
                                    }
                                }
                            } else {
                                str2 = str3;
                                if (jSONObject.has("bind-click-action-info")) {
                                    java.lang.String optString = jSONObject.optString("bind-click-action-info");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9.f(c17933xe8d1b2262.m70354x74235b3e().f38257x4d212eed, c17933xe8d1b2262.m70354x74235b3e().f38256xfef403e4 + '.' + optString);
                                    f18.f244102a = 15;
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                                    r45.a90 a90Var = m70371x485d7.f39014x86965dde;
                                    if (!(a90Var != null && a90Var.f451370e == 5)) {
                                        if (!(a90Var != null && a90Var.f451370e == 15)) {
                                            z17 = false;
                                            f3Var = f3Var2;
                                            boolean z18 = z17;
                                            c17933xe8d1b226 = c17933xe8d1b2262;
                                            view.setOnClickListener(new s74.a0(activity, o0Var, f18, c17933xe8d1b2262, z18, view));
                                            c17933xe8d1b2262 = c17933xe8d1b226;
                                            f3Var2 = f3Var;
                                            str3 = str2;
                                        }
                                    }
                                    z17 = true;
                                    f3Var = f3Var2;
                                    boolean z182 = z17;
                                    c17933xe8d1b226 = c17933xe8d1b2262;
                                    view.setOnClickListener(new s74.a0(activity, o0Var, f18, c17933xe8d1b2262, z182, view));
                                    c17933xe8d1b2262 = c17933xe8d1b226;
                                    f3Var2 = f3Var;
                                    str3 = str2;
                                }
                            }
                            f3Var = f3Var2;
                            c17933xe8d1b226 = c17933xe8d1b2262;
                            c17933xe8d1b2262 = c17933xe8d1b226;
                            f3Var2 = f3Var;
                            str3 = str2;
                        }
                        str2 = str3;
                        f3Var = f3Var2;
                        c17933xe8d1b226 = c17933xe8d1b2262;
                        c17933xe8d1b2262 = c17933xe8d1b226;
                        f3Var2 = f3Var;
                        str3 = str2;
                    }
                }
                str = str3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
                s74.o0.y(o0Var, (s74.j3) this.f485853e.f391656d);
                java.lang.String str4 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
                return f0Var;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        str = "invoke";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$processClickableViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        s74.o0.y(o0Var, (s74.j3) this.f485853e.f391656d);
        java.lang.String str42 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str42, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str42, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$bindComponentModel$3$3");
        return f0Var2;
    }
}
