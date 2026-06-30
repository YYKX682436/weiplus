package md4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final md4.e f407410a = new md4.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f407411b = new java.util.ArrayList(java.util.Arrays.asList(java.lang.Double.valueOf(0.75d), java.lang.Double.valueOf(1.0d), java.lang.Double.valueOf(1.3333333333333333d)));

    public final void a(android.widget.ImageView imageView, com.p314xaae8f345.mm.p2621x8fb0427b.z3 contact, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachRound", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        if (z17 || !contact.r2()) {
            o11.f fVar = new o11.f();
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
            fVar.f423612c = true;
            fVar.f423629t = true;
            n11.a.b().h(str, imageView, fVar.a());
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, contact.d1());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachRound", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }

    public final android.view.View b(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildSnsCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(pc4.d.f434943a.x() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dzv : com.p314xaae8f345.mm.R.C30864xbddafb2a.dzu, (android.view.ViewGroup) null, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildSnsCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return inflate;
    }

    public final java.lang.String c(java.lang.String url) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCacheKey", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        byte[] bytes = url.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCacheKey", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return g17;
    }

    public final java.util.List d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObject, "tlObject");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowImageStyle", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        r45.a90 a90Var = tlObject.f39014x86965dde;
        r45.hh4 hh4Var = a90Var.f451376n;
        boolean z17 = (hh4Var != null && hh4Var.f457682d == 8) && hh4Var.f457693r > 0 && a90Var.f451373h.size() > 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowImageStyle", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        if (!z17) {
            java.util.List a17 = qa4.f.a(tlObject);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            return a17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pc4.d.f434943a.a()) {
            arrayList.add(qa4.f.a(tlObject).get(1));
        } else {
            arrayList.add(qa4.f.a(tlObject).get(0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        return arrayList;
    }

    public final void e(android.view.View root, java.lang.String url, float f17, float f18, java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3;
        int i18;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        android.content.Context context;
        md4.e eVar;
        android.widget.ImageView imageView2;
        double d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        android.widget.ImageView imageView3 = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.bcb);
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.b9_);
        android.widget.ImageView imageView4 = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.f564935sj4);
        android.widget.TextView textView3 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f564936sj5);
        android.widget.TextView textView4 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.ptk);
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.sj6);
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.sj7);
        android.widget.ImageView imageView5 = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.szt);
        android.content.Context context2 = root.getContext();
        imageView3.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView5);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        boolean x17 = pc4.d.f434943a.x();
        int i19 = be1.r.f4230x366c91de;
        if (x17) {
            str3 = "updateCardView";
            i18 = 138;
        } else {
            str3 = "updateCardView";
            i18 = 169;
        }
        int b17 = i65.a.b(context2, i18);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            imageView = imageView4;
            textView = textView4;
            context = context2;
            android.view.ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = b17;
                layoutParams.height = b17;
                imageView3.setLayoutParams(layoutParams);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView5.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = b17;
                layoutParams2.height = b17;
                imageView5.setLayoutParams(layoutParams2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            textView = textView4;
            double d18 = b17;
            imageView = imageView4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            if (f17 <= 0.0f || f18 <= 0.0f) {
                context = context2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                d17 = 0.75d;
            } else {
                double d19 = f17 / f18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                java.util.ArrayList arrayList = (java.util.ArrayList) f407411b;
                context = context2;
                d17 = ((java.lang.Number) arrayList.get(0)).doubleValue();
                double abs = java.lang.Math.abs(d19 - d17);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    double doubleValue = ((java.lang.Number) it.next()).doubleValue();
                    double abs2 = java.lang.Math.abs(d19 - doubleValue);
                    if (abs2 < abs) {
                        d17 = doubleValue;
                        abs = abs2;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findClosestRatio", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            }
            int i27 = (int) (d18 / d17);
            android.view.ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = b17;
                layoutParams3.height = i27;
                imageView3.setLayoutParams(layoutParams3);
            }
            android.view.ViewGroup.LayoutParams layoutParams4 = imageView5.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = b17;
                layoutParams4.height = i27;
                imageView5.setLayoutParams(layoutParams4);
            }
            android.view.ViewGroup.LayoutParams layoutParams5 = imageView5.getLayoutParams();
            layoutParams5.width = b17;
            layoutParams5.height = i27;
            imageView5.setLayoutParams(layoutParams5);
            if (f17 / f18 < 0.33000001311302185d) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                if (imageView3 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicMsgCardHelper", "updateBizSharePicImageViewCrop");
                    ((com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) imageView3).m82522xf4e85f16(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 0.2f));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
                if (imageView3 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicMsgCardHelper", "resetBizSharePicImageViewCropWithLongPic");
                    ((com.p314xaae8f345.mm.p2776x373aa5.C22782x8bcca9d0) imageView3).m82522xf4e85f16(new android.graphics.RectF(0.0f, 0.0f, 1.0f, 1.0f));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetBizSharePicImageViewCropWithLongPic", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateThumbSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateContentSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        pc4.d dVar = pc4.d.f434943a;
        if (dVar.x()) {
            i19 = 150;
        }
        android.content.Context context3 = context;
        int b18 = i65.a.b(context3, i19);
        android.view.ViewGroup.LayoutParams layoutParams6 = textView2.getLayoutParams();
        layoutParams6.width = b18;
        textView2.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = findViewById.getLayoutParams();
        layoutParams7.width = b18;
        findViewById.setLayoutParams(layoutParams7);
        android.view.ViewGroup.LayoutParams layoutParams8 = findViewById2.getLayoutParams();
        layoutParams8.width = b18;
        findViewById2.setLayoutParams(layoutParams8);
        if (dVar.x()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/ui/item/improve/loader/BizPicMsgCardHelper", "updateContentSize", "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateContentSize", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        java.lang.String obj = str2 != null ? r26.n0.u0(str2).toString() : null;
        if (android.text.TextUtils.isEmpty(obj)) {
            textView2.setVisibility(4);
        } else {
            textView2.setVisibility(0);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context3, obj));
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.okr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(i17), obj}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        imageView3.setContentDescription(format);
        if (dVar.x()) {
            imageView3.setImportantForAccessibility(2);
        }
        if (android.text.TextUtils.isEmpty(url)) {
            eVar = this;
        } else {
            o11.f fVar = new o11.f();
            fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.amn;
            fVar.f423610a = true;
            eVar = this;
            fVar.D = eVar.c(url);
            n11.a.b().h(url, imageView3, fVar.a());
        }
        textView.setText(java.lang.String.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        if (str == null || imageView == null || textView3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicMsgCardHelper", "param null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPicMsgCardHelper", "srcUsername null");
            }
            if (c01.e2.G(str)) {
                imageView2 = imageView;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView2, str);
            } else {
                imageView2 = imageView;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView2, " ");
                imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgo);
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView3.getTextSize();
            ((ke0.e) xVar).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, "", textSize));
            imageView2.setVisibility(0);
            textView3.setVisibility(0);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                e17 = str;
            }
            imageView2.setTag(str);
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (n17 == null || ((int) n17.E2) <= 0)) {
                imageView2.setTag(str);
                ((c01.k7) c01.n8.a()).b(str, 3, new md4.b(new java.lang.ref.WeakReference(imageView2), textView3, context3));
            } else if (c01.e2.G(str)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n17);
                if (!n17.r2()) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                    if (com.p314xaae8f345.mm.p943x351df9c2.g.a(str) == null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
                        if (n07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d())) {
                            eVar.a(imageView2, n17, n07.d(), true);
                        }
                    }
                }
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                float textSize2 = textView3.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, e17, textSize2));
            } else {
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string2 = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574732oj4);
                float textSize3 = textView3.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, string2, textSize3));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshSrcInfo", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        }
        if (dVar.x()) {
            root.getViewTreeObserver().addOnGlobalLayoutListener(new md4.c(root));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }

    public final void f(android.view.View root, r45.jj4 media, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        r45.lj4 lj4Var = media.f459398p;
        e(root, "", lj4Var.f461053d, lj4Var.f461054e, str, str2, i17);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.bcb);
        imageView.setTag(media.f459388d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().o(media, imageView, hashCode(), true, com.p314xaae8f345.mm.p2621x8fb0427b.s7.d(), false, null, new md4.d(media, imageView));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCardView", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper");
    }
}
