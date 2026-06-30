package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public final class p4 implements i22.q0 {
    public final android.view.View A;
    public final android.widget.ProgressBar B;
    public final android.widget.ProgressBar C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public final android.widget.LinearLayout F;
    public final java.lang.String G;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f98121d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f98122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f98123f;

    /* renamed from: g, reason: collision with root package name */
    public final int f98124g;

    /* renamed from: h, reason: collision with root package name */
    public final j12.i f98125h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f98126i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f98127m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f98128n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f98129o;

    /* renamed from: p, reason: collision with root package name */
    public final int f98130p;

    /* renamed from: q, reason: collision with root package name */
    public final int f98131q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f98132r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f98133s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f98134t;

    /* renamed from: u, reason: collision with root package name */
    public final com.google.android.flexbox.FlexboxLayout f98135u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f98136v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f98137w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f98138x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f98139y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.ImageView f98140z;

    public p4(android.view.View itemView, android.content.Context context, int i17, int i18, j12.i emotionData, java.util.List list, boolean z17, boolean z18, yz5.a aVar, java.lang.String str, int i19, int i27, boolean z19, int i28, kotlin.jvm.internal.i iVar) {
        java.util.List designerNewProductList = (i28 & 32) != 0 ? kz5.p0.f313996d : list;
        boolean z27 = (i28 & 64) != 0 ? false : z17;
        boolean z28 = (i28 & 128) != 0 ? true : z18;
        yz5.a aVar2 = (i28 & 256) != 0 ? null : aVar;
        java.lang.String sdkRequestID = (i28 & 512) != 0 ? "" : str;
        boolean z29 = (i28 & 4096) == 0 ? z19 : false;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(emotionData, "emotionData");
        kotlin.jvm.internal.o.g(designerNewProductList, "designerNewProductList");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        this.f98121d = itemView;
        this.f98122e = context;
        this.f98123f = i17;
        this.f98124g = i18;
        this.f98125h = emotionData;
        this.f98126i = z27;
        this.f98127m = z28;
        this.f98128n = aVar2;
        this.f98129o = sdkRequestID;
        this.f98130p = i19;
        this.f98131q = i27;
        this.f98132r = z29;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.omi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98133s = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.omh);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f98134t = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f484190hq4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f98135u = (com.google.android.flexbox.FlexboxLayout) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f485387hj0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f98136v = findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.r9r);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f98137w = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.r9s);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f98138x = (com.tencent.mm.ui.widget.button.WeButton) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.r9t);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f98139y = (com.tencent.mm.ui.widget.button.WeButton) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.hjh);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f98140z = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.hj_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.A = findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.hhl);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.B = (android.widget.ProgressBar) findViewById10;
        android.view.View findViewById11 = itemView.findViewById(com.tencent.mm.R.id.f486416l53);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.C = (android.widget.ProgressBar) findViewById11;
        android.view.View findViewById12 = itemView.findViewById(com.tencent.mm.R.id.hob);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.D = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = itemView.findViewById(com.tencent.mm.R.id.sak);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.E = (android.widget.TextView) findViewById13;
        android.view.View findViewById14 = itemView.findViewById(com.tencent.mm.R.id.sah);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.F = (android.widget.LinearLayout) findViewById14;
        ym5.x.a(context, 8.0f);
        this.G = "MicroMsg.EmojiStoreV3HomeMainHolder";
    }

    public void a() {
        this.C.setVisibility(8);
        android.view.View view = this.A;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g(true);
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f98137w;
        weButton.setText(com.tencent.mm.R.string.byn);
        weButton.setEnabled(true);
    }

    @Override // i22.q0
    public void b(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.f98125h;
        if (iVar == null) {
            return;
        }
        c(iVar, productId, i17);
        if (i17 == 7) {
            com.tencent.mm.plugin.emoji.model.p pVar = com.tencent.mm.plugin.emoji.model.q.f97591c;
            com.tencent.mm.plugin.emoji.model.q.f97593e.put(productId, 7);
        }
        if (iVar.f297171f == -1) {
            com.tencent.mars.xlog.Log.i(this.G, "force refresh status");
            iVar.b(c01.z1.y(), null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
        }
        f();
    }

    public final void c(j12.i iVar, java.lang.String str, int i17) {
        if (iVar == null || str == null || kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
    }

    @Override // i22.q0
    public j12.i d() {
        return this.f98125h;
    }

    @Override // i22.q0
    public void e(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.f98125h;
        if (iVar == null) {
            return;
        }
        iVar.c(-1);
        iVar.b(c01.z1.y(), null, com.tencent.mm.plugin.emoji.model.q.f97591c.a(productId));
    }

    @Override // i22.q0
    public void f() {
        j12.i iVar = this.f98125h;
        if (iVar == null) {
            return;
        }
        i(8);
        int i17 = iVar.f297171f;
        if (i17 == 0) {
            a();
            return;
        }
        if (i17 == 3) {
            a();
            return;
        }
        bw5.ra raVar = iVar.f297168c;
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f98137w;
        android.widget.ProgressBar progressBar = this.C;
        android.widget.ImageView imageView = this.f98140z;
        if (i17 != 4) {
            if (i17 == 6) {
                progressBar.setVisibility(8);
                i(8);
                imageView.setVisibility(8);
                android.widget.ProgressBar progressBar2 = this.B;
                progressBar2.setVisibility(0);
                progressBar2.setProgress(iVar.f297170e);
                java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491097bw2);
                kotlin.jvm.internal.o.f(g17, "getString(...)");
                java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar.f297170e)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                progressBar2.setContentDescription(format);
                weButton.setEnabled(false);
                android.view.View view = this.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 7) {
                if (!iVar.f297175j || !j12.g.b(raVar.f32461i, 64)) {
                    progressBar.setVisibility(8);
                    g(false);
                    imageView.setVisibility(4);
                    android.view.View view2 = this.A;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                g(true);
                i(8);
                this.f98139y.setVisibility(0);
                imageView.setVisibility(4);
                android.view.View view3 = this.A;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 8) {
                progressBar.setVisibility(8);
                g(true);
                weButton.setText(com.tencent.mm.R.string.byq);
                weButton.setEnabled(false);
                imageView.setVisibility(4);
                android.view.View view4 = this.A;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            switch (i17) {
                case 10:
                    progressBar.setVisibility(8);
                    g(true);
                    weButton.setText(com.tencent.mm.R.string.f491112bz3);
                    imageView.setVisibility(4);
                    weButton.setEnabled(true);
                    android.view.View view5 = this.A;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 11:
                    progressBar.setVisibility(0);
                    i(8);
                    imageView.setVisibility(4);
                    android.view.View view6 = this.A;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(4);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 12:
                    break;
                default:
                    com.tencent.mars.xlog.Log.w(this.G, "unknown product status:%d", java.lang.Integer.valueOf(i17));
                    return;
            }
        }
        progressBar.setVisibility(8);
        android.view.View view7 = this.A;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
        arrayList7.add(4);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/EmotionSummaryConvert$EmojiSummaryViewHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g(true);
        imageView.setVisibility(4);
        if (raVar != null) {
            n22.i iVar2 = n22.j.f334293a;
            if ((raVar.f32461i & 512) == 512) {
                int i18 = raVar.f32470u;
                android.content.Context context = this.f98122e;
                weButton.setText(iVar2.d(context, i18, "", context.getColor(com.tencent.mm.R.color.aaq)));
                java.lang.String g18 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.c0n);
                kotlin.jvm.internal.o.f(g18, "getString(...)");
                java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(raVar.f32470u)}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                weButton.setContentDescription(format2);
            }
        }
        weButton.setEnabled(true);
    }

    public final void g(boolean z17) {
        com.tencent.mm.ui.widget.button.WeButton weButton = this.f98138x;
        if (weButton.isEnabled()) {
            weButton.setText(com.tencent.mm.R.string.byp);
            weButton.setIcon(com.tencent.mm.R.raw.icons_filled_done);
            weButton.setEnabled(false);
            weButton.setBackgroundColor(0);
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f98137w;
        if (z17) {
            weButton.setVisibility(8);
            weButton2.setVisibility(0);
        } else {
            weButton2.setVisibility(8);
            weButton.setVisibility(0);
        }
        this.f98139y.setVisibility(8);
    }

    @Override // i22.q0
    public void h(int i17, java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        j12.i iVar = this.f98125h;
        if (iVar == null) {
            return;
        }
        boolean z17 = false;
        if (i17 >= 0 && i17 < 100) {
            z17 = true;
        }
        if (z17) {
            c(iVar, productId, 6);
            iVar.f297170e = i17;
        }
        if (i17 >= 100) {
            c(iVar, productId, 7);
        }
        f();
    }

    public final void i(int i17) {
        this.f98137w.setVisibility(i17);
        this.f98138x.setVisibility(i17);
        this.f98139y.setVisibility(i17);
    }
}
