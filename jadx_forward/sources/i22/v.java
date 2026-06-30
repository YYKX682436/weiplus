package i22;

/* loaded from: classes15.dex */
public final class v extends i22.m implements i22.q0 {
    public final android.widget.ImageView A;
    public final android.view.View B;
    public final android.widget.ProgressBar C;
    public final android.widget.ProgressBar D;
    public final android.view.View E;
    public final android.widget.TextView F;
    public final android.widget.ImageView G;
    public final android.graphics.drawable.Drawable H;
    public final android.graphics.drawable.Drawable I;

    /* renamed from: J, reason: collision with root package name */
    public i22.b0 f369571J;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 K;
    public final java.lang.String L;
    public j12.i M;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f369572f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f369573g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f369574h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f369575i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f369576m;

    /* renamed from: n, reason: collision with root package name */
    public final i22.p0 f369577n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f369578o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f369579p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f369580q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f369581r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f369582s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f369583t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f369584u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f369585v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.ImageView f369586w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f369587x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.ViewGroup f369588y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f369589z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(android.content.Context r11, android.view.View r12, java.util.List r13, boolean r14, boolean r15, i22.p0 r16, int r17, p3321xbce91901.jvm.p3324x21ffc6bd.i r18) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i22.v.<init>(android.content.Context, android.view.View, java.util.List, boolean, boolean, i22.p0, int, kotlin.jvm.internal.i):void");
    }

    @Override // i22.q0
    public void b(int i17, java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        k(iVar, productId, i17);
        if (iVar.f378704f == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.L, "force refresh status");
            boolean y17 = c01.z1.y();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.K;
            iVar.b(y17, f0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).b(productId) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.a(productId));
        }
        f();
    }

    @Override // i22.q0
    public j12.i d() {
        return this.M;
    }

    @Override // i22.q0
    public void e(java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        iVar.c(-1);
        boolean y17 = c01.z1.y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.K;
        iVar.b(y17, f0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).b(productId) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.a(productId));
    }

    @Override // i22.q0
    public void f() {
        j12.i iVar = this.M;
        if (iVar == null) {
            return;
        }
        o(8);
        int i17 = iVar.f378704f;
        if (i17 == 0) {
            j();
            return;
        }
        if (i17 == 3) {
            j();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f369583t;
        android.widget.ProgressBar progressBar = this.D;
        android.widget.ImageView imageView = this.A;
        if (i17 != 4) {
            if (i17 == 6) {
                j12.i iVar2 = this.M;
                if (iVar2 == null) {
                    return;
                }
                progressBar.setVisibility(8);
                o(8);
                imageView.setVisibility(8);
                android.widget.ProgressBar progressBar2 = this.C;
                progressBar2.setVisibility(0);
                progressBar2.setProgress(iVar2.f378703e);
                java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572630bw2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getString(...)");
                java.lang.String format = java.lang.String.format(g17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar2.f378703e)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                progressBar2.setContentDescription(format);
                android.view.View view = this.B;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 7) {
                if (!iVar.f378708j || !j12.g.b(iVar.f378700b.f473668n, 64)) {
                    progressBar.setVisibility(8);
                    l(false);
                    imageView.setVisibility(4);
                    android.view.View view2 = this.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                l(true);
                o(8);
                this.f369585v.setVisibility(0);
                imageView.setVisibility(4);
                android.view.View view3 = this.B;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == 8) {
                progressBar.setVisibility(8);
                l(true);
                c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byq);
                c22661xa3a2b3c0.setEnabled(false);
                imageView.setVisibility(4);
                android.view.View view4 = this.B;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            switch (i17) {
                case 10:
                    progressBar.setVisibility(8);
                    l(true);
                    c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572645bz3);
                    imageView.setVisibility(4);
                    c22661xa3a2b3c0.setEnabled(true);
                    android.view.View view5 = this.B;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 11:
                    progressBar.setVisibility(0);
                    o(8);
                    imageView.setVisibility(4);
                    android.view.View view6 = this.B;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(4);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                case 12:
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.L, "unknown product status:%d", java.lang.Integer.valueOf(i17));
                    return;
            }
        }
        j12.i iVar3 = this.M;
        if (iVar3 == null) {
            return;
        }
        progressBar.setVisibility(8);
        android.view.View view7 = this.B;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
        arrayList7.add(4);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        imageView.setVisibility(4);
        r45.zj0 zj0Var = iVar3.f378700b;
        if (zj0Var != null) {
            n22.i iVar4 = n22.j.f415826a;
            if ((zj0Var.f473668n & 512) == 512) {
                int i18 = zj0Var.A;
                android.content.Context context = this.f369572f;
                c22661xa3a2b3c0.setText(iVar4.d(context, i18, "", context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq)));
                java.lang.String g18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.c0n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getString(...)");
                java.lang.String format2 = java.lang.String.format(g18, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(iVar3.f378700b.A)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
                c22661xa3a2b3c0.setContentDescription(format2);
            } else {
                c22661xa3a2b3c0.setText(zj0Var.f473666i);
                java.lang.String g19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.bxc);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g19, "getString(...)");
                java.lang.String format3 = java.lang.String.format(g19, java.util.Arrays.copyOf(new java.lang.Object[]{c22661xa3a2b3c0.getText()}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
                c22661xa3a2b3c0.setContentDescription(format3);
            }
        }
        c22661xa3a2b3c0.setEnabled(true);
    }

    @Override // i22.q0
    public void h(int i17, java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        j12.i iVar = this.M;
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
        r45.zj0 zj0Var;
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
        this.M = iVar;
        if (this.f369575i) {
            iVar.f378708j = true;
            iVar.f378706h = true;
            iVar.f378707i = false;
        }
        iVar.f378707i = this.f369576m;
        android.widget.TextView textView = this.f369581r;
        android.widget.ImageView imageView = this.f369580q;
        android.widget.ImageView imageView2 = this.f369586w;
        r45.kj0 kj0Var = iVar.f378702d;
        if (kj0Var == null) {
            android.view.View view = this.f369582s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        } else {
            textView.setText(kj0Var.f460260e);
            n(kj0Var.f460266n);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460265m)) {
                n11.a b17 = n11.a.b();
                java.lang.String str = kj0Var.f460265m;
                b17.h(str, imageView, y12.f.b("", str));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kj0Var.f460268p)) {
                imageView2.setVisibility(8);
            } else {
                n11.a b18 = n11.a.b();
                java.lang.String str2 = kj0Var.f460268p;
                b18.h(str2, imageView2, y12.f.b("", str2));
                imageView2.setVisibility(0);
            }
            android.view.View view2 = this.f369582s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = true;
        }
        if (z17 || (zj0Var = iVar.f378700b) == null) {
            return;
        }
        textView.setText(zj0Var.f473663f);
        if (n22.l.c(zj0Var)) {
            n11.a.b().g("", imageView);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
        } else {
            n11.a b19 = n11.a.b();
            java.lang.String str3 = zj0Var.f473662e;
            b19.h(str3, imageView, y12.f.b(zj0Var.f473661d, str3));
        }
        boolean b27 = j12.g.b(zj0Var.f473667m, 2);
        if (!android.text.TextUtils.isEmpty(zj0Var.f473679y)) {
            imageView2.setImageDrawable(null);
            imageView2.setVisibility(0);
            n11.a b28 = n11.a.b();
            java.lang.String str4 = zj0Var.f473679y;
            b28.h(str4, imageView2, y12.f.b("", str4));
        } else if (b27) {
            imageView2.setVisibility(0);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhy);
        } else {
            imageView2.setVisibility(8);
        }
        android.view.View view3 = this.f369587x;
        int i17 = this.f369574h.contains(zj0Var.f473661d) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473680z) ? zj0Var.f473680z : zj0Var.f473678x);
        f();
        this.f369579p.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562843q6);
        boolean z18 = ((i22.m0) item).f369538b;
        android.view.View view4 = this.f369578o;
        if (z18) {
            view4.setBackground(this.H);
        } else {
            view4.setBackground(this.I);
        }
        this.f369583t.setOnClickListener(new i22.t(this, item));
        this.f369585v.setOnClickListener(new i22.u(this, item));
        r45.tj0 tj0Var = zj0Var.D;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.v(tj0Var)) {
            android.view.View view5 = this.E;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view6 = this.E;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str5 = tj0Var.f468029e;
        if (!(str5 == null || str5.length() == 0)) {
            vo0.e eVar = vo0.e.f520000a;
            vo0.a aVar = vo0.e.f520001b;
            java.lang.String IconUrl = tj0Var.f468029e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(IconUrl, "IconUrl");
            wo0.c a17 = aVar.a(IconUrl);
            yo0.f fVar = new yo0.f();
            fVar.f545611b = true;
            a17.f529405c = fVar.a();
            ((wo0.b) a17).c(this.G);
            this.F.setText(tj0Var.f468030f);
        }
        this.f369588y.setVisibility(8);
    }

    public void j() {
        this.D.setVisibility(8);
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f369583t;
        c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byn);
        c22661xa3a2b3c0.setEnabled(true);
        this.A.setVisibility(8);
    }

    public final void k(j12.i iVar, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var;
        if (iVar == null || str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            return;
        }
        iVar.c(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.f0 f0Var = this.K;
        if (f0Var == null || (f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q) f0Var).f179129b.get(str)) == null) {
            return;
        }
        f5Var.a(i17);
    }

    public final void l(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f369584u;
        if (c22661xa3a2b3c0.isEnabled()) {
            c22661xa3a2b3c0.setText(com.p314xaae8f345.mm.R.C30867xcad56011.byp);
            c22661xa3a2b3c0.m81544x764b6bfb(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            c22661xa3a2b3c0.setEnabled(false);
            c22661xa3a2b3c0.setBackgroundColor(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f369583t;
        if (z17) {
            c22661xa3a2b3c0.setVisibility(8);
            c22661xa3a2b3c02.setVisibility(0);
        } else {
            c22661xa3a2b3c02.setVisibility(8);
            c22661xa3a2b3c0.setVisibility(0);
        }
        this.f369585v.setVisibility(8);
    }

    public final void n(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.view.ViewGroup viewGroup = this.f369588y;
        android.widget.TextView textView = this.f369589z;
        if (K0) {
            viewGroup.setVisibility(8);
            textView.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void o(int i17) {
        this.f369583t.setVisibility(i17);
        this.f369584u.setVisibility(i17);
        this.f369585v.setVisibility(i17);
    }
}
