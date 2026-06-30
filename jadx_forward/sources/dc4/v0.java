package dc4;

/* loaded from: classes4.dex */
public class v0 extends dc4.v {
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda A;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p B;
    public jb4.v C;
    public final i64.b1 F;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f310373p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f310374q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f310375r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f310376s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f310377t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f310378u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f310379v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f310380w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933 f310381x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f310382y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f310383z;
    public java.lang.String D = null;
    public int E = 0;
    public final jb4.u G = new dc4.r0(this);
    public final jb4.c0 H = new dc4.u0(this);

    public v0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, i64.b1 b1Var) {
        this.f310364d = c19807x593d1720;
        this.f310365e = c17933xe8d1b226;
        this.f310371n = iVar;
        this.F = b1Var;
    }

    public static /* synthetic */ android.widget.ImageView l(dc4.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        android.widget.ImageView imageView = v0Var.f310382y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return imageView;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda m(dc4.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = v0Var.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return c22626x3e1b8dda;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p n(dc4.v0 v0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = v0Var.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return pVar;
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        this.f310366f = view;
        this.f310367g = view2;
        this.f310373p = view.getContext();
        this.f310383z = view.findViewById(com.p314xaae8f345.mm.R.id.f81555new);
        this.f310374q = view.findViewById(com.p314xaae8f345.mm.R.id.ofu);
        this.f310375r = view.findViewById(com.p314xaae8f345.mm.R.id.aug);
        this.f310376s = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ofw);
        this.f310377t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ofv);
        this.f310378u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.aui);
        this.f310379v = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.auh);
        this.f310380w = view.findViewById(com.p314xaae8f345.mm.R.id.aut);
        this.f310382y = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567394jc5);
        this.f310381x = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933) view.findViewById(com.p314xaae8f345.mm.R.id.nex);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        this.A = c22626x3e1b8dda;
        c22626x3e1b8dda.m81380xca027da2(50);
        float I = ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_q);
        float I2 = ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_l);
        this.f310376s.setTextSize(0, I);
        this.f310377t.setTextSize(0, I2);
        this.f310378u.setTextSize(0, I);
        this.f310379v.setTextSize(0, I2);
        this.f310381x.i(1.8f, 30.0f, -2.0f);
        this.f310381x.m70293x94523662(0.45f);
        this.f310381x.m70289x2eac842c(this.H);
        this.f310381x.m70292xd5adfc84(true);
        this.f310381x.m70291xc4a52ce5(false);
        this.f310381x.k();
        jb4.v vVar = new jb4.v();
        this.C = vVar;
        jb4.u uVar = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        vVar.f380385a = uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "initView, hash=" + this.f310381x.hashCode());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, hash=" + this.f310381x.hashCode());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(this.f310365e.m70367x7525eefd());
            this.f310365e = a17;
            android.view.ViewGroup.LayoutParams layoutParams = null;
            this.B = null;
            if (a17 != null && a17.m70354x74235b3e() != null) {
                this.B = this.f310365e.m70354x74235b3e().f38212x4fa759ce;
            }
            android.view.View view = this.f310374q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f310376s.setVisibility(8);
            this.f310377t.setVisibility(8);
            android.view.View view2 = this.f310375r;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f310378u.setVisibility(8);
            this.f310379v.setVisibility(8);
            android.view.View view3 = this.f310380w;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.B != null) {
                int y17 = ca4.m0.y("MicroMsg.SphereImageView.SphereCardAdDetailItem", this.f310373p, o(), this.f310372o);
                int i17 = this.B.f247622a;
                if (i17 == 0) {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = y17;
                    layoutParams.height = (int) (y17 * 0.75f);
                } else if (i17 == 1) {
                    layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
                    layoutParams.width = y17;
                    layoutParams.height = y17;
                }
                if (layoutParams != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = this.f310366f.getLayoutParams();
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.f310366f.setLayoutParams(layoutParams2);
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) this.f310366f).m81437x205ac394(i65.a.b(this.f310373p, 8));
                    android.view.ViewGroup.LayoutParams layoutParams3 = this.f310381x.getLayoutParams();
                    layoutParams3.width = layoutParams.width;
                    layoutParams3.height = layoutParams.height;
                    this.f310381x.setLayoutParams(layoutParams3);
                    android.view.ViewGroup.LayoutParams layoutParams4 = this.f310382y.getLayoutParams();
                    layoutParams4.width = layoutParams3.width;
                    layoutParams4.height = layoutParams3.height;
                    this.f310382y.setLayoutParams(layoutParams4);
                }
                int i18 = this.B.f247626e;
                if (i18 == 0) {
                    android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{android.graphics.Color.argb((int) (r0.f247625d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable.setGradientType(0);
                    this.f310374q.setBackground(gradientDrawable);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247623b) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247624c)) {
                        android.view.View view4 = this.f310374q;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view5 = this.f310375r;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247623b)) {
                        this.f310376s.setVisibility(0);
                        this.f310376s.setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ni(this.f310376s.getContext(), this.B.f247623b));
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247624c)) {
                        this.f310377t.setVisibility(0);
                        this.f310377t.setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ni(this.f310377t.getContext(), this.B.f247624c));
                    }
                } else if (i18 == 1) {
                    android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb((int) (r0.f247625d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable2.setGradientType(0);
                    android.view.View view6 = this.f310374q;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f310375r.setBackground(gradientDrawable2);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247623b) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247624c)) {
                        android.view.View view7 = this.f310375r;
                        zj0.a aVar = new zj0.a();
                        zj0.c.c(0, aVar);
                        yj0.a.d(view7, aVar.b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((java.lang.Integer) aVar.a(0)).intValue());
                        yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.RelativeLayout.LayoutParams layoutParams5 = (android.widget.RelativeLayout.LayoutParams) this.f310380w.getLayoutParams();
                        layoutParams5.topMargin = i65.a.b(this.f310373p, 4);
                        this.f310380w.setLayoutParams(layoutParams5);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247623b)) {
                        this.f310378u.setVisibility(0);
                        this.f310378u.setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ni(this.f310378u.getContext(), this.B.f247623b));
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B.f247624c)) {
                        this.f310379v.setVisibility(0);
                        this.f310379v.setText(com.p314xaae8f345.mm.p2614xca6eae71.x1.Di().Ni(this.f310379v.getContext(), this.B.f247624c));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f310365e;
                if (c17933xe8d1b226 != null && c17933xe8d1b226.m70346x10413e67().m70106x7ba4fd89()) {
                    android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb((int) (this.B.f247625d * 2.55f), 0, 0, 0), android.graphics.Color.argb(0, 0, 0, 0)});
                    gradientDrawable3.setGradientType(0);
                    android.view.View view8 = this.f310375r;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(0);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f310375r.setBackground(gradientDrawable3);
                    android.view.View view9 = this.f310380w;
                    zj0.a aVar2 = new zj0.a();
                    zj0.c.c(0, aVar2);
                    yj0.a.d(view9, aVar2.b(), "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) aVar2.a(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/detail/item/SphereCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f310381x.setVisibility(0);
                this.f310381x.setTag(this);
                this.f310381x.setOnClickListener(this.f310371n.T);
                java.lang.String str = this.D;
                if (str != null && str.equals(this.B.f247628g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid refreshView");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "loadImage");
                p();
                this.C.e(this.B.f247628g, this.f310381x.getLayoutParams().width, this.f310381x.getLayoutParams().height, "scene_timeline");
                this.D = this.B.f247628g;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "invalid spherecardinfo");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "refreshView, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }

    public final int o() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        i64.b1 b1Var = this.F;
        if (b1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
            return 1;
        }
        int i17 = b1Var.f370628j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        return i17;
    }

    public void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
        try {
            this.f310382y.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = this.B;
            java.lang.String str = pVar.f247628g;
            java.lang.String str2 = pVar.f247629h;
            new jb4.t(str, str2, "scene_timeline", new dc4.q0(this, str, str2)).execute(new java.lang.Void[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "showMaskView exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMaskView", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem");
    }
}
