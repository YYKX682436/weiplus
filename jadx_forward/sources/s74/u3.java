package s74;

/* loaded from: classes4.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static final s74.u3 f486095a = new s74.u3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f486096b = kz5.c1.l(new jz5.l("finder-logo", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78383xd1c56b91)), new jz5.l("finder-logo-dark", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78382xf93bbf8a)), new jz5.l("weapp-logo", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78386xe177d375)), new jz5.l("weapp-logo-dark", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78387x4c84b600)));

    public final boolean A(java.lang.Object obj, yz5.l childrenOf, yz5.l visit) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childrenOf, "childrenOf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visit, "visit");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return true;
        }
        if (((java.lang.Boolean) visit.mo146xb9724478(obj)).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return true;
        }
        java.lang.Iterable iterable = (java.lang.Iterable) childrenOf.mo146xb9724478(obj);
        if (iterable != null) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 != null) {
                    f486095a.A(obj2, childrenOf, visit);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByIterable", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return false;
    }

    public final void B(org.json.JSONObject jSONObject, yz5.l childrenOf, yz5.l visit) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(childrenOf, "childrenOf");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visit, "visit");
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return;
        }
        if (((java.lang.Boolean) visit.mo146xb9724478(jSONObject)).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return;
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) childrenOf.mo146xb9724478(jSONObject);
        if (jSONArray != null) {
            c75.c.d(jSONArray, new s74.t3(childrenOf, visit));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverseObjByJSONArray", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x04fb, code lost:
    
        if ((r3 != null && r3.a()) == false) goto L308;
     */
    /* JADX WARN: Removed duplicated region for block: B:299:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x055d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0569 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C(s74.f3 r20, java.lang.String r21, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r22, android.content.Context r23, int r24) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.C(s74.f3, java.lang.String, com.tencent.mm.plugin.sns.storage.SnsInfo, android.content.Context, int):java.lang.String");
    }

    public final void a(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd c0085xa15044fd, android.widget.ImageView.ScaleType scaleType) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLifecycleScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLifecycleScope", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = f3Var.f485804e;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new s74.k3(jSONObject, f3Var, c0085xa15044fd, scaleType, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("applyImage", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r14.equals("bold") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007f, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r14, "bold") == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.content.Context r13, org.json.JSONObject r14, android.widget.TextView r15) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.b(android.content.Context, org.json.JSONObject, android.widget.TextView):boolean");
    }

    public final s74.j3 c(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createBulletScreenContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636 c17794x6bc92636 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2144xc2a3071e.C17794x6bc92636(context, null);
        c44.a.l();
        c44.a.o();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(c17794x6bc92636, layoutParams);
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.U = c17794x6bc92636;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAdBulletScreenView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        c44.a.l();
        g3Var.j(-1);
        c44.a.l();
        g3Var.i(-1);
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createBulletScreenContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 d(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bak, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 c17705x7d0622a3 = inflate instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17705x7d0622a3) inflate : null;
        if (c17705x7d0622a3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.Factory", "inflate com.tencent.mm.plugin.sns.R.layout.five_compliance_management error!");
            s74.j3 j3Var = new s74.j3(new android.widget.FrameLayout(context), g3Var, null, null, null, 28, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return j3Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetForDynamicView", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        android.view.View view = c17705x7d0622a3.contentView;
        if (view != null) {
            view.setBackground(null);
        }
        android.view.View view2 = c17705x7d0622a3.contentView;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        android.view.View view3 = c17705x7d0622a3.contentView;
        if (view3 != null) {
            view3.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetForDynamicView", "com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView");
        c17705x7d0622a3.setBackground(stateListDrawable);
        z(f3Var, c17705x7d0622a3, f17, jSONObject);
        c17705x7d0622a3.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        c17705x7d0622a3.setMinimumHeight(g3Var.b());
        c17705x7d0622a3.setMinimumWidth(g3Var.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setComplianceView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f485799J = c17705x7d0622a3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setComplianceView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        c17705x7d0622a3.setVisibility(8);
        s74.j3 j3Var2 = new s74.j3(c17705x7d0622a3, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createComplianceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var2;
    }

    public final s74.j3 e(s74.f3 f3Var, org.json.JSONObject obj, android.content.Context ctx, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFlexView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        org.json.JSONObject optJSONObject = obj.optJSONObject("configs");
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        int optInt = optJSONObject.optInt("version", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f485809j = optInt;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDynamicVersion", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f485808i = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.Factory", "createFlexView " + f3Var.i());
        org.json.JSONObject optJSONObject2 = obj.optJSONObject("layout");
        if (optJSONObject2 == null) {
            optJSONObject2 = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> keys = optJSONObject2.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object opt = optJSONObject2.opt(next);
            boolean z17 = opt instanceof org.json.JSONObject;
            c75.c cVar = c75.c.f121170a;
            if (z17) {
                opt = cVar.c((org.json.JSONObject) opt);
            } else if (opt instanceof org.json.JSONArray) {
                opt = cVar.b((org.json.JSONArray) opt);
            }
            jSONObject.put(next, opt);
        }
        B(jSONObject, s74.m3.f485957d, new s74.n3(f3Var));
        if (f3Var.i() >= 101) {
            f3Var.b(jSONObject);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRootObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.f485814o = jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRootObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFlexViewInternal$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 f17 = f(f3Var, jSONObject, ctx, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlexViewInternal$default", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlexView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final s74.j3 f(s74.f3 f3Var, org.json.JSONObject jSONObject, android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 l17 = l(f3Var, jSONObject, context);
        if (l17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return null;
        }
        if (z17) {
            s74.q4 q4Var = s74.q4.f486046a;
            android.view.View c17 = l17.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubOfMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "<this>");
            c17.setTag(com.p314xaae8f345.mm.R.id.pv6, java.lang.Boolean.TRUE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubOfMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
            if (f3Var.i() >= 101 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("position"), "absolute")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainElementContainerSubAbsoluteViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                java.util.List list = f3Var.C;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainElementContainerSubAbsoluteViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                ((java.util.ArrayList) list).add(l17.c());
            }
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString(dm.i4.f66865x76d1ec5a), "rootContainer");
        if (b17) {
            l17.c().setId(com.p314xaae8f345.mm.R.id.d5i);
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("enable-outer-area-click"), "true");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnableOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f3Var.f485811l = b18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnableOuterAreaClick", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            if (jSONObject.has("android-root-margin-top")) {
                java.lang.Float valueOf = java.lang.Float.valueOf(q(jSONObject, "android-root-margin-top", 10.0f, f3Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f3Var.f485812m = valueOf;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRootViewMarginTop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            }
            if (jSONObject.has("android-root-margin-bottom")) {
                java.lang.Float valueOf2 = java.lang.Float.valueOf(q(jSONObject, "android-root-margin-bottom", 2.0f, f3Var));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                f3Var.f485813n = valueOf2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRootViewMarginBottom", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            }
        }
        if (jSONObject.has("children")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("children");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jSONArray);
            c75.c.d(jSONArray, new s74.o3(f3Var, jSONObject, z17, context, b17, l17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return l17;
    }

    public final s74.j3 g(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createGridElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4(context);
        z(f3Var, c17972xe84284f4, f17, jSONObject);
        s74.j3 j3Var = new s74.j3(c17972xe84284f4, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createGridElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final s74.g3 h(s74.f3 r34, org.json.JSONObject r35) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.h(s74.f3, org.json.JSONObject):s74.g3");
    }

    public final s74.j3 i(s74.f3 f3Var, android.content.Context context, org.json.JSONObject jSONObject, float f17, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = null;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569509d1, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        if (viewGroup != null) {
            c44.a.o();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, c44.b.a(21));
            layoutParams.gravity = 8388659;
            layoutParams.leftMargin = c44.b.a(6);
            layoutParams.topMargin = c44.b.a(6);
            frameLayout.addView(viewGroup, layoutParams);
        } else {
            viewGroup = null;
        }
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.P = viewGroup;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569508d0, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd432 = inflate2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43) inflate2 : null;
        if (c17806x48d2cd432 != null) {
            c44.a.l();
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, c44.b.a(30));
            layoutParams2.gravity = 80;
            frameLayout.addView(c17806x48d2cd432, layoutParams2);
            c17806x48d2cd43 = c17806x48d2cd432;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.O = c17806x48d2cd43;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLivingDescBar", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createLivingStatusLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 j(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.p3 p3Var = new s74.p3(context, f3Var);
        p3Var.setBackground(stateListDrawable);
        z(f3Var, p3Var, f17, jSONObject);
        p3Var.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        p3Var.setMinimumHeight(g3Var.b());
        p3Var.setMinimumWidth(g3Var.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.A = p3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        float a17 = g3Var.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        f3Var.B = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMainElementHeight", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        s74.j3 j3Var = new s74.j3(p3Var, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createMainElement", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    public final s74.j3 k(s74.f3 f3Var, android.content.Context context, android.graphics.drawable.StateListDrawable stateListDrawable, float f17, org.json.JSONObject jSONObject, s74.g3 g3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSeparator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setBackground(new android.graphics.drawable.ColorDrawable(v(jSONObject, "color", context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4m))));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("separator-direction"), "vertical")) {
            g3Var.j(1);
        } else {
            g3Var.i(1);
        }
        frameLayout.setPadding(g3Var.e(), g3Var.g(), g3Var.f(), g3Var.d());
        s74.j3 j3Var = new s74.j3(frameLayout, g3Var, null, null, null, 28, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSeparator", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return j3Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final s74.j3 l(s74.f3 r58, org.json.JSONObject r59, android.content.Context r60) {
        /*
            Method dump skipped, instructions count: 4670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.u3.l(s74.f3, org.json.JSONObject, android.content.Context):s74.j3");
    }

    public final void m(s74.f3 f3Var, org.json.JSONObject obj, android.content.Context ctx, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doHideViewForElderMode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f3Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (obj.optBoolean("hide-for-elder-mode") && ca4.m0.Z(ctx)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory", "doHideViewForElderMode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext;Lorg/json/JSONObject;Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory", "doHideViewForElderMode", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/DynamicViewFactory$DynamicViewContext;Lorg/json/JSONObject;Landroid/content/Context;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doHideViewForElderMode", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }

    public final int n(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickTransitionType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        java.lang.Object tag = view != null ? view.getTag(com.p314xaae8f345.mm.R.id.f565674pv4) : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        int i17 = 0;
        if (str != null) {
            switch (str.hashCode()) {
                case -1721484885:
                    if (str.equals("baseType")) {
                        i17 = 3;
                        break;
                    }
                    break;
                case -1255672639:
                    if (str.equals("normalType")) {
                        i17 = 1;
                        break;
                    }
                    break;
                case -1038130864:
                    str.equals("undefined");
                    break;
                case 1475827516:
                    if (str.equals("ordinaryType")) {
                        i17 = 2;
                        break;
                    }
                    break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickTransitionType", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final jz5.l o(s74.f3 f3Var, org.json.JSONObject jSONObject) {
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCombinedElementWh", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("type"), "gridElement")) {
            if (f3Var.m()) {
                lVar = new jz5.l(java.lang.Integer.valueOf(c44.b.a(130)), java.lang.Integer.valueOf(c44.b.a(130)));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var = f3Var.f().f38162xfb2a357c;
                lVar = m0Var != null && m0Var.b() == 1 ? new jz5.l(java.lang.Integer.valueOf(c44.b.a(80)), java.lang.Integer.valueOf(c44.b.a(80))) : new jz5.l(java.lang.Integer.valueOf(c44.b.a(75)), java.lang.Integer.valueOf(c44.b.a(75)));
            }
        } else if (f3Var.m()) {
            lVar = new jz5.l(java.lang.Integer.valueOf(c44.b.a(396)), java.lang.Integer.valueOf(c44.b.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508)));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m0 m0Var2 = f3Var.f().f38162xfb2a357c;
            lVar = m0Var2 != null && m0Var2.b() == 1 ? new jz5.l(java.lang.Integer.valueOf(c44.b.a(248)), java.lang.Integer.valueOf(c44.b.a(140))) : new jz5.l(java.lang.Integer.valueOf(c44.b.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d)), java.lang.Integer.valueOf(c44.b.a(132)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCombinedElementWh", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return lVar;
    }

    public final int p() {
        android.view.Display defaultDisplay;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMultiImageWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context != null ? context.getSystemService("window") : null;
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        android.graphics.Point point = new android.graphics.Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.bk(point);
        int nj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMultiImageWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return nj6;
    }

    public final float q(org.json.JSONObject jSONObject, java.lang.String key, float f17, s74.f3 dynamicCtx) {
        float floatValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicCtx, "dynamicCtx");
        java.lang.String optString = jSONObject.optString(key);
        if (optString == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return f17;
        }
        if (r26.i0.n(optString, "rem", true)) {
            java.lang.String substring = optString.substring(0, optString.length() - 3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.Float f18 = r26.g0.f(r26.n0.u0(substring).toString());
            floatValue = f18 != null ? f18.floatValue() : 0.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
            f17 = (dynamicCtx.f485800a * floatValue) / 750.0f;
        } else if (r26.i0.n(optString, "px", true)) {
            java.lang.String substring2 = optString.substring(0, optString.length() - 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            java.lang.Float f19 = r26.g0.f(r26.n0.u0(substring2).toString());
            floatValue = f19 != null ? f19.floatValue() : 0.0f;
            android.content.Context h17 = dynamicCtx.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            float g17 = i65.a.g(h17) * floatValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            f17 = g17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPxFloat", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final int r(org.json.JSONObject jSONObject, java.lang.String str, int i17, s74.f3 f3Var) {
        float floatValue;
        float g17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        java.lang.String optString = jSONObject.optString(str);
        if (optString == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return i17;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "$calculateAdjustedGridWidth()")) {
            i17 = p();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "$calculateAdjustedGridMargin()")) {
            i17 = f3Var.f().m70136xbd5ce118() ? f3Var.m() ? c44.b.a(3) : c44.b.a(4) : c44.b.a(3);
        } else {
            if (r26.i0.n(optString, "rem", true)) {
                java.lang.String substring = optString.substring(0, optString.length() - 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                java.lang.Float f17 = r26.g0.f(r26.n0.u0(substring).toString());
                floatValue = f17 != null ? f17.floatValue() : 0.0f;
                f3Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                g17 = (float) java.lang.Math.ceil((f3Var.f485800a * floatValue) / 750.0f);
            } else if (r26.i0.n(optString, "px", true)) {
                java.lang.String substring2 = optString.substring(0, optString.length() - 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                java.lang.Float f18 = r26.g0.f(r26.n0.u0(substring2).toString());
                floatValue = f18 != null ? f18.floatValue() : 0.0f;
                android.content.Context h17 = f3Var.h();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
                g17 = i65.a.g(h17) * floatValue;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dp2Pix", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
            }
            i17 = (int) g17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPxOrWrap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final float s(int i17, android.content.Context context) {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getScaleSize", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (i17 == 1) {
            f17 = 1.0f;
        } else if (i17 != 2) {
            f17 = i65.a.q(context);
            if (com.p314xaae8f345.mm.ui.bk.M(f17, i65.a.u(context)) || com.p314xaae8f345.mm.ui.bk.M(f17, i65.a.v(context))) {
                f17 = i65.a.t(context);
            }
        } else {
            f17 = i65.a.q(context);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getScaleSize", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return f17;
    }

    public final boolean t(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExprDisplay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        boolean z17 = false;
        if (r26.i0.y(str, "$getDisplayFlexOrNone('", false) && r26.i0.n(str, "')", false)) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExprDisplay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return z17;
    }

    public final int u(org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseBackgroundColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        int v17 = v(jSONObject, "background-color", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseBackgroundColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return v17;
    }

    public final int v(org.json.JSONObject jSONObject, java.lang.String key, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        int w17 = w((com.p314xaae8f345.mm.ui.bk.C() && jSONObject.has(key.concat("-dark"))) ? jSONObject.optString(key.concat("-dark")) : jSONObject.optString(key), i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return w17;
    }

    public final int w(java.lang.String str, int i17) {
        int i18;
        java.lang.String obj;
        int parseInt;
        int parseInt2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (str != null) {
            try {
                obj = r26.n0.u0(str).toString();
            } catch (java.lang.Throwable th6) {
                ca4.q.c("ad_dynamic_error", th6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicView.Factory", "parse color from string failed, return default value!");
            }
            if (obj != null) {
                if (r26.i0.y(obj, "#", false)) {
                    i18 = android.graphics.Color.parseColor(str);
                } else {
                    if (r26.i0.y(obj, "rgba", true)) {
                        java.lang.CharSequence u07 = r26.n0.u0(obj.subSequence(4, obj.length()));
                        if (u07.length() > 2) {
                            java.util.List f07 = r26.n0.f0(u07.subSequence(1, u07.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                            if (f07.size() == 4) {
                                parseInt = (((int) (java.lang.Float.parseFloat(r26.n0.u0((java.lang.String) f07.get(3)).toString()) * 255)) << 24) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(0)).toString()) << 16) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(1)).toString()) << 8);
                                parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f07.get(2)).toString());
                            }
                        }
                        i18 = i17;
                    } else {
                        if (r26.i0.y(obj, "rgb", true)) {
                            java.lang.CharSequence u08 = r26.n0.u0(obj.subSequence(3, obj.length()));
                            if (u08.length() > 2) {
                                java.util.List f08 = r26.n0.f0(u08.subSequence(1, u08.length() - 1), new java.lang.String[]{","}, false, 0, 6, null);
                                if (f08.size() == 3) {
                                    parseInt = (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(0)).toString()) << 16) | (-16777216) | (java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(1)).toString()) << 8);
                                    parseInt2 = java.lang.Integer.parseInt(r26.n0.u0((java.lang.String) f08.get(2)).toString());
                                }
                            }
                        }
                        i18 = i17;
                    }
                    i18 = parseInt2 | parseInt;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
                return i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseColorStr", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return i17;
    }

    public final java.lang.String x(org.json.JSONObject jSONObject, java.lang.String jsonKey, i64.q adDataModel) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonKey, "jsonKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adDataModel, "adDataModel");
        java.lang.String optString = jSONObject.optString(jsonKey);
        s74.q4 q4Var = s74.q4.f486046a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String w17 = q4Var.w(adDataModel, optString);
        if (w17 != null) {
            optString = w17;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "$getCardBottomLogoText()")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
            return optString;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        java.lang.String str = null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = adDataModel.f370824e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            int i17 = adDataModel.f370825f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ad.model.AdDataModel");
            int r17 = ca4.m0.r(c17933xe8d1b226, i17, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = adDataModel.f370820a;
            if (c17902x72cc1771 != null && c17902x72cc1771.m70106x7ba4fd89()) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6j);
            } else if (r17 == 1) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6j);
            } else if (r17 == 2) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m6o);
            } else if (r17 == 3) {
                str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clc);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCardBottomLogoWording", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseStringValue", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return str;
    }

    public final int y(org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jSONObject, "<this>");
        int v17 = v(jSONObject, "color", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseTextColor", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        return v17;
    }

    public final void z(s74.f3 f3Var, android.view.View view, float f17, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOutlineWithRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        f3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResetOutlineViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.List list = f3Var.f485819t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResetOutlineViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        ((java.util.ArrayList) list).add(new s74.h3(view, f17, jSONObject));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOutlineWithRadius", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
    }
}
