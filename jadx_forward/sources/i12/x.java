package i12;

/* loaded from: classes15.dex */
public final class x extends i22.m implements i22.q0 {
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.LinearLayout C;
    public final java.lang.String D;
    public j12.i E;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f368784f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f368785g;

    /* renamed from: h, reason: collision with root package name */
    public final i22.p0 f368786h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368787i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368788m;

    /* renamed from: n, reason: collision with root package name */
    public final int f368789n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f368790o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f368791p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f368792q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc f368793r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f368794s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368795t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368796u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f368797v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f368798w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f368799x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ProgressBar f368800y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ProgressBar f368801z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context, android.view.View itemView, i22.p0 p0Var, java.lang.String finderUserName, java.lang.String sdkRequestID, int i17, java.lang.String pageSessionID, boolean z17) {
        super(itemView, p0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageSessionID, "pageSessionID");
        this.f368784f = context;
        this.f368785g = itemView;
        this.f368786h = p0Var;
        this.f368787i = finderUserName;
        this.f368788m = sdkRequestID;
        this.f368789n = i17;
        this.f368790o = z17;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.omi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f368791p = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.omh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f368792q = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565723hq4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f368793r = (com.p176xb6135e39.p177xcca8366f.p186xd1ce4f32.C1625xd76db8dc) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f566920hj0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f368794s = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.r9r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f368795t = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.p314xaae8f345.mm.R.id.r9s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f368796u = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.p314xaae8f345.mm.R.id.r9t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f368797v = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hjh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f368798w = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hj_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f368799x = findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hhl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById10, "findViewById(...)");
        this.f368800y = (android.widget.ProgressBar) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f567949l53);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
        this.f368801z = (android.widget.ProgressBar) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.p314xaae8f345.mm.R.id.hob);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById12, "findViewById(...)");
        this.A = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sak);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById13, "findViewById(...)");
        this.B = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = itemView.findViewById(com.p314xaae8f345.mm.R.id.sah);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById14, "findViewById(...)");
        this.C = (android.widget.LinearLayout) findViewById14;
        this.D = "MicroMsg.EmojiStoreV3HomeMainHolder";
    }

    @Override // i22.q0
    public void b(int i17, java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        k(iVar, productId, i17);
        if (i17 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179126e.put(productId, 7);
        }
        if (iVar.f378704f == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.D, "force refresh status");
            iVar.b(c01.z1.y(), null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.a(productId));
        }
        f();
    }

    @Override // i22.q0
    public j12.i d() {
        return this.E;
    }

    @Override // i22.q0
    public void e(java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        iVar.c(-1);
        iVar.b(c01.z1.y(), null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.a(productId));
    }

    @Override // i22.q0
    public void f() {
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        n(8);
        int i17 = iVar.f378704f;
        if (i17 == 0) {
            j();
            return;
        }
        if (i17 == 3) {
            j();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f368795t;
        android.widget.ProgressBar progressBar = this.f368801z;
        android.widget.ImageView imageView = this.f368798w;
        if (i17 != 4) {
            if (i17 == 6) {
                j12.i iVar2 = this.E;
                if (iVar2 == null) {
                    return;
                }
                progressBar.setVisibility(8);
                n(8);
                imageView.setVisibility(8);
                android.widget.ProgressBar progressBar2 = this.f368800y;
                progressBar2.setVisibility(0);
                progressBar2.setProgress(iVar2.f378703e);
                java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572630bw2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
                java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar2.f378703e)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                progressBar2.setContentDescription(format);
                android.view.View view = this.f368799x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 7) {
                if (!iVar.f378708j || !j12.g.b(iVar.f378701c.f113994i, 64)) {
                    progressBar.setVisibility(8);
                    l(false);
                    imageView.setVisibility(4);
                    android.view.View view2 = this.f368799x;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                l(true);
                n(8);
                this.f368797v.setVisibility(0);
                imageView.setVisibility(4);
                android.view.View view3 = this.f368799x;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 8) {
                progressBar.setVisibility(8);
                l(true);
                c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byq);
                c22661xa3a2b3c0.setEnabled(false);
                imageView.setVisibility(4);
                android.view.View view4 = this.f368799x;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            switch (i17) {
                case 10:
                    progressBar.setVisibility(8);
                    l(true);
                    c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572645bz3);
                    imageView.setVisibility(4);
                    c22661xa3a2b3c0.setEnabled(true);
                    android.view.View view5 = this.f368799x;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 11:
                    progressBar.setVisibility(0);
                    n(8);
                    imageView.setVisibility(4);
                    android.view.View view6 = this.f368799x;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(4);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 12:
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.D, "unknown product status:%d", java.lang.Integer.valueOf(i17));
                    return;
            }
        }
        j12.i iVar3 = this.E;
        if (iVar3 == null) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view7 = this.f368799x;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
        arrayList7.add(4);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        imageView.setVisibility(4);
        bw5.ra raVar = iVar3.f378701c;
        if (raVar != null) {
            n22.i iVar4 = n22.j.f415826a;
            if ((raVar.f113994i & 512) == 512) {
                int i18 = raVar.f114003u;
                android.content.Context context = this.f368784f;
                c22661xa3a2b3c0.setText(iVar4.d(context, i18, "", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)));
                java.lang.String g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.c0n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getString(...)");
                java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(raVar.f114003u)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                c22661xa3a2b3c0.setContentDescription(format2);
            }
        }
        c22661xa3a2b3c0.setEnabled(true);
    }

    @Override // i22.q0
    public void h(int i17, java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.E;
        if (iVar == null) {
            return;
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < 100) {
            z17 = true;
        }
        if (z17) {
            k(iVar, productId, 6);
            iVar.f378703e = i17;
        }
        if (i17 >= 100) {
            k(iVar, productId, 7);
        }
        f();
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        j12.i iVar;
        boolean z17;
        bw5.ra raVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(item, payloads);
        if (!payloads.isEmpty()) {
            f();
            return;
        }
        i22.m0 m0Var = item instanceof i22.m0 ? (i22.m0) item : null;
        if (m0Var == null || (iVar = m0Var.f369537a) == null) {
            return;
        }
        this.E = iVar;
        android.widget.TextView textView = this.f368791p;
        r45.kj0 kj0Var = iVar.f378702d;
        if (kj0Var == null) {
            android.view.View view = this.f368794s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        } else {
            textView.setText(kj0Var.f460260e);
            android.view.View view2 = this.f368794s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = true;
        }
        if (z17 || (raVar = iVar.f378701c) == null) {
            return;
        }
        textView.setText(raVar.f113991f);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(raVar.E)};
        android.content.Context context = this.f368784f;
        this.f368792q.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7s, objArr));
        this.f368793r.post(new i12.u(this, raVar));
        n22.f fVar = n22.f.f415823a;
        this.B.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7q, fVar.c(raVar.S.f471696e)));
        this.A.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7q, fVar.c(raVar.S.f471695d)));
        android.widget.LinearLayout linearLayout = this.C;
        boolean z18 = this.f368790o;
        if (z18) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
        f();
        i12.v vVar = new i12.v(this, item);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f368795t;
        c22661xa3a2b3c0.setOnClickListener(vVar);
        this.f368797v.setOnClickListener(new i12.w(this, item));
        java.lang.String str = this.f368788m;
        if (str.length() > 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            android.view.View view3 = this.f368785g;
            aVar.pk(view3, "finder_profile_emoticon_cell");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(view3, 40, 10, false);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22661xa3a2b3c0, "finder_profile_emoticon_cell_add");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(c22661xa3a2b3c0, 8, 10, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (!(str.length() == 0)) {
                j12.i iVar2 = this.E;
                bw5.ra raVar2 = iVar2 != null ? iVar2.f378701c : null;
                if (raVar2 != null) {
                    java.lang.String ProductID = raVar2.f113989d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ProductID, "ProductID");
                    hashMap.put("pid", ProductID);
                    hashMap.put("emoticon_type", 2);
                    hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f368789n));
                    hashMap.put("pos_id", java.lang.Integer.valueOf(m8183xf806b362()));
                    hashMap.put("emoticon_sessionid", str);
                    hashMap.put("emoticon_user_type", z18 ? "1" : "2");
                    iy1.c cVar = iy1.c.MainUI;
                    hashMap2.put("page_id", 50103);
                    hashMap2.put("page_name", "FinderProfileEmoticonTab");
                    hashMap.put("cur_page", hashMap2);
                }
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view3, hashMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(c22661xa3a2b3c0, hashMap);
        }
    }

    public void j() {
        this.f368801z.setVisibility(8);
        android.view.View view = this.f368799x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/adapter/EmojiStoreV3HomeMainForFinderHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f368795t;
        c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byn);
        c22661xa3a2b3c0.setEnabled(true);
        this.f368798w.setVisibility(8);
    }

    public final void k(j12.i iVar, java.lang.String str, int i17) {
        if (iVar == null || str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f368796u;
        if (c22661xa3a2b3c0.isEnabled()) {
            c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byp);
            c22661xa3a2b3c0.m81544x764b6bfb(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            c22661xa3a2b3c0.setEnabled(false);
            c22661xa3a2b3c0.setBackgroundColor(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f368795t;
        if (z17) {
            c22661xa3a2b3c0.setVisibility(8);
            c22661xa3a2b3c02.setVisibility(0);
        } else {
            c22661xa3a2b3c02.setVisibility(8);
            c22661xa3a2b3c0.setVisibility(0);
        }
        this.f368797v.setVisibility(8);
    }

    public final void n(int i17) {
        this.f368795t.setVisibility(i17);
        this.f368796u.setVisibility(i17);
        this.f368797v.setVisibility(i17);
    }
}
