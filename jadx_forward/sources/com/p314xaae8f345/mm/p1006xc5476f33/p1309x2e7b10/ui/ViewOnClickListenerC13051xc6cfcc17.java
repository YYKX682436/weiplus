package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardGiftReceiveUI */
/* loaded from: classes15.dex */
public class ViewOnClickListenerC13051xc6cfcc17 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public android.widget.ImageView A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.widget.LinearLayout D;
    public android.widget.ListView E;
    public android.widget.RelativeLayout F;
    public android.widget.LinearLayout G;
    public android.widget.ImageView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.LinearLayout f176352J;
    public android.widget.TextView K;
    public android.widget.RelativeLayout L;
    public android.widget.RelativeLayout M;
    public android.widget.ImageView N;
    public android.widget.ImageView P;
    public android.widget.TextView Q;
    public android.widget.Button R;
    public android.widget.TextView S;
    public android.widget.ListView T;
    public android.widget.RelativeLayout U;
    public android.widget.TextView V;
    public android.widget.TextView W;
    public android.view.View X;
    public android.widget.ProgressBar Z;

    /* renamed from: d, reason: collision with root package name */
    public int f176353d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f176354e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e f176355f;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f176357h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f176358i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f176359m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f176360n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f176361o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f176362p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.RelativeLayout f176363p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f176364q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f176365r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f176366s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f176367t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f176368u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f176369v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f176370w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f176371x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f176373y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f176374z;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f176356g = null;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: x0, reason: collision with root package name */
    public final lu1.b f176372x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.l1(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ViewOnClickListenerC13051xc6cfcc17 viewOnClickListenerC13051xc6cfcc17, boolean z17) {
        if (viewOnClickListenerC13051xc6cfcc17.f176363p0 != null) {
            return;
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) android.view.View.inflate(viewOnClickListenerC13051xc6cfcc17, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569834pj, null);
        viewOnClickListenerC13051xc6cfcc17.f176363p0 = relativeLayout;
        viewOnClickListenerC13051xc6cfcc17.X = relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.f564973av1);
        viewOnClickListenerC13051xc6cfcc17.V = (android.widget.TextView) viewOnClickListenerC13051xc6cfcc17.f176363p0.findViewById(com.p314xaae8f345.mm.R.id.on6);
        viewOnClickListenerC13051xc6cfcc17.W = (android.widget.TextView) viewOnClickListenerC13051xc6cfcc17.f176363p0.findViewById(com.p314xaae8f345.mm.R.id.f568972on5);
        viewOnClickListenerC13051xc6cfcc17.V.setOnClickListener(viewOnClickListenerC13051xc6cfcc17);
        viewOnClickListenerC13051xc6cfcc17.W.setOnClickListener(viewOnClickListenerC13051xc6cfcc17);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (z17) {
            if (viewOnClickListenerC13051xc6cfcc17.U.getVisibility() == 0) {
                layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.f563880c2);
            } else {
                layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.b_6);
            }
            layoutParams.bottomMargin = viewOnClickListenerC13051xc6cfcc17.V6(30);
            layoutParams.topMargin = viewOnClickListenerC13051xc6cfcc17.V6(40);
        } else {
            layoutParams.addRule(12, -1);
            layoutParams.bottomMargin = viewOnClickListenerC13051xc6cfcc17.V6(30);
            layoutParams.topMargin = viewOnClickListenerC13051xc6cfcc17.V6(40);
        }
        if (viewOnClickListenerC13051xc6cfcc17.U.getVisibility() == 0) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            if (viewOnClickListenerC13051xc6cfcc17.L.getVisibility() == 0) {
                layoutParams2.topMargin = viewOnClickListenerC13051xc6cfcc17.V6(0);
                viewOnClickListenerC13051xc6cfcc17.U.setLayoutParams(layoutParams2);
            } else {
                layoutParams2.topMargin = viewOnClickListenerC13051xc6cfcc17.V6(60);
            }
            viewOnClickListenerC13051xc6cfcc17.U.setLayoutParams(layoutParams2);
            viewOnClickListenerC13051xc6cfcc17.U.addView(viewOnClickListenerC13051xc6cfcc17.f176363p0, layoutParams);
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = viewOnClickListenerC13051xc6cfcc17.V6(60);
            viewOnClickListenerC13051xc6cfcc17.F.setLayoutParams(layoutParams3);
            viewOnClickListenerC13051xc6cfcc17.F.addView(viewOnClickListenerC13051xc6cfcc17.f176363p0, layoutParams);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.T)) {
            viewOnClickListenerC13051xc6cfcc17.V.setVisibility(8);
        } else {
            viewOnClickListenerC13051xc6cfcc17.V.setVisibility(0);
            viewOnClickListenerC13051xc6cfcc17.V.setText(viewOnClickListenerC13051xc6cfcc17.f176355f.T);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.U)) {
            android.view.View view = viewOnClickListenerC13051xc6cfcc17.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewOnClickListenerC13051xc6cfcc17.W.setVisibility(8);
        } else {
            android.view.View view2 = viewOnClickListenerC13051xc6cfcc17.X;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewOnClickListenerC13051xc6cfcc17.W.setVisibility(0);
            viewOnClickListenerC13051xc6cfcc17.W.setText(viewOnClickListenerC13051xc6cfcc17.f176355f.U);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnClickListenerC13051xc6cfcc17.f176355f.f176183g)) {
            viewOnClickListenerC13051xc6cfcc17.F.setVisibility(8);
        }
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = this.f176355f;
        if (c13037x580b4d4e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", java.lang.Integer.valueOf(c13037x580b4d4e.C));
        int i17 = this.f176355f.C;
        if (i17 == 1) {
            Z6();
        } else if (i17 == 2) {
            this.f176365r.setVisibility(8);
            this.f176358i.setVisibility(0);
            this.f176360n.setText(this.f176355f.A);
            this.f176361o.setText(this.f176355f.f176193s + "     " + this.f176355f.f176194t + mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ask));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.B)) {
                this.f176359m.setVisibility(8);
            } else {
                this.f176359m.setVisibility(0);
                o11.f fVar = new o11.f();
                fVar.f423616g = lp0.b.D();
                fVar.f423615f = xt1.q.m(this.f176355f.B);
                fVar.f423611b = true;
                fVar.f423610a = true;
                n11.a.b().h(this.f176355f.B, this.f176359m, fVar.a());
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.E)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            } else {
                this.f176360n.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176355f.E, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.F)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
            } else {
                this.f176361o.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176355f.F, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176192r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
            } else {
                o11.f fVar2 = new o11.f();
                fVar2.f423616g = lp0.b.D();
                fVar2.f423615f = xt1.q.m(this.f176355f.f176192r);
                fVar2.f423629t = true;
                fVar2.f423611b = true;
                fVar2.f423610a = true;
                fVar2.f423625p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
                n11.a.b().h(this.f176355f.f176192r, this.f176364q, fVar2.a());
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176191q)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
            } else {
                o11.f fVar3 = new o11.f();
                fVar3.f423616g = lp0.b.D();
                fVar3.f423615f = xt1.q.m(this.f176355f.f176191q);
                fVar3.f423611b = true;
                fVar3.f423610a = true;
                fVar3.f423625p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
                fVar3.f423629t = true;
                fVar3.f423630u = i65.a.b(this, 8);
                n11.a.b().h(this.f176355f.f176191q, this.f176362p, fVar3.a());
            }
        } else {
            Z6();
        }
        if (this.f176355f.Q == 1) {
            this.G.setVisibility(0);
            this.f176352J.setVisibility(8);
            this.F.setVisibility(8);
            android.widget.TextView textView = this.I;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.f176355f.f176181e;
            float textSize = this.I.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
            Y6(this.H);
        } else {
            this.G.setVisibility(8);
            this.f176352J.setVisibility(0);
            this.F.setVisibility(0);
            Y6(this.P);
            android.widget.TextView textView2 = this.Q;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.f176355f.f176181e;
            float textSize2 = this.Q.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str2, textSize2));
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176184h) || "undefined".equals(this.f176355f.f176184h)) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176185i) || "undefined".equals(this.f176355f.f176185i))) {
                this.L.setVisibility(8);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
            } else {
                this.L.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e2 = this.f176355f;
            if (c13037x580b4d4e2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13037x580b4d4e2.f176184h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e3 = this.f176355f;
                lu1.c.a(c13037x580b4d4e3.f176184h, c13037x580b4d4e3.f176187n, c13037x580b4d4e3.f176198x, 2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e4 = this.f176355f;
            if (c13037x580b4d4e4 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13037x580b4d4e4.f176186m)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e5 = this.f176355f;
                lu1.c.a(c13037x580b4d4e5.f176186m, c13037x580b4d4e5.f176189p, c13037x580b4d4e5.f176201z, 2);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176183g)) {
                android.widget.TextView textView3 = this.K;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str3 = this.f176355f.f176183g;
                float textSize3 = this.K.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str3, textSize3));
            }
        }
        if (this.f176355f.M.size() > 0) {
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.setVisibility(8);
            if (this.f176355f.M.size() <= 2) {
                this.C.setVisibility(8);
                W6(this.f176355f.M);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) this.f176355f.M.get(0));
                linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) this.f176355f.M.get(1));
                W6(linkedList);
                this.C.setVisibility(0);
                this.C.setOnClickListener(this);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i18 = 0; i18 < this.f176355f.M.size(); i18++) {
                    if (i18 != 0 && i18 != 1) {
                        linkedList2.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) this.f176355f.M.get(i18));
                    }
                }
                this.E.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.o1(this, linkedList2));
                X6(this.E);
            }
        } else {
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(8);
            this.E.setVisibility(8);
        }
        if (this.f176355f.N.size() > 0) {
            this.U.setVisibility(0);
            this.T.setVisibility(0);
            this.T.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m1(this));
            X6(this.T);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.P)) {
                this.S.setVisibility(0);
                this.S.setText(this.f176355f.P);
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.P)) {
            this.U.setVisibility(8);
            this.S.setVisibility(8);
            this.T.setVisibility(8);
        } else {
            this.U.setVisibility(0);
            this.S.setVisibility(0);
            this.S.setText(this.f176355f.P);
            this.T.setVisibility(8);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.W)) {
            this.R.setVisibility(8);
        } else {
            this.R.setVisibility(0);
            this.R.setText(this.f176355f.W);
            this.R.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.f1(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.I) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176195u) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.T) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.U)) {
            this.f176357h.setFillViewport(true);
        } else {
            this.f176357h.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.g1(this));
        }
    }

    public final int V6(int i17) {
        return i65.a.b(mo55332x76847179(), i17);
    }

    public final void W6(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem acceptedCardItem = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e.AcceptedCardItem) it.next();
            android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569832ph, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.olg);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.olf);
            textView.setText(acceptedCardItem.f176202d);
            textView2.setText(acceptedCardItem.f176203e + mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ask));
            this.D.addView(inflate);
        }
    }

    public void X6(android.widget.ListView listView) {
        android.widget.ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int count = adapter.getCount();
        int i17 = 0;
        for (int i18 = 0; i18 < count; i18++) {
            android.view.View view = adapter.getView(i18, null, listView);
            view.measure(0, 0);
            i17 += view.getMeasuredHeight();
        }
        android.view.ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
        layoutParams.height = i17 + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(layoutParams);
    }

    public final void Y6(android.widget.ImageView imageView) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176182f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
            return;
        }
        int b17 = i65.a.b(this, 20);
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(this.f176355f.f176182f);
        fVar.f423611b = true;
        fVar.f423629t = true;
        fVar.f423630u = 3;
        fVar.f423610a = true;
        fVar.f423620k = b17;
        fVar.f423619j = b17;
        fVar.f423625p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
        n11.a.b().h(this.f176355f.f176182f, imageView, fVar.a());
    }

    public final void Z6() {
        this.f176358i.setVisibility(8);
        this.f176365r.setVisibility(0);
        this.f176370w.setText(this.f176355f.f176193s);
        if (this.f176355f.Q == 1) {
            this.f176374z.setAlpha(0.5f);
            this.f176371x.setVisibility(8);
            this.f176373y.setVisibility(8);
            this.f176367t.setVisibility(8);
            this.f176366s.setVisibility(8);
        } else {
            this.f176371x.setVisibility(0);
            this.f176373y.setVisibility(0);
            this.f176367t.setVisibility(0);
            this.f176366s.setVisibility(0);
            this.f176371x.setText(this.f176355f.f176194t);
            this.f176373y.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ask);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176194t)) {
                this.f176371x.setVisibility(8);
                this.f176373y.setVisibility(8);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.G)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
            } else {
                this.f176371x.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176355f.G, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.B)) {
            this.f176369v.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        } else {
            this.f176369v.setVisibility(0);
            o11.f fVar = new o11.f();
            fVar.f423616g = lp0.b.D();
            fVar.f423615f = xt1.q.m(this.f176355f.B);
            fVar.f423611b = true;
            fVar.f423610a = true;
            n11.a.b().h(this.f176355f.B, this.f176369v, fVar.a());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.A)) {
            this.f176368u.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        } else {
            this.f176368u.setVisibility(0);
            this.f176368u.setText(this.f176355f.A);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.E)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            } else {
                this.f176368u.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176355f.E, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.F)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
        } else {
            this.f176370w.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f(this.f176355f.F, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c)));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176192r)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
        } else {
            o11.f fVar2 = new o11.f();
            fVar2.f423616g = lp0.b.D();
            fVar2.f423615f = xt1.q.m(this.f176355f.f176192r);
            fVar2.f423629t = true;
            fVar2.f423611b = true;
            fVar2.f423610a = true;
            fVar2.f423625p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
            n11.a.b().h(this.f176355f.f176192r, this.A, fVar2.a());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176191q)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
            return;
        }
        o11.f fVar3 = new o11.f();
        fVar3.f423616g = lp0.b.D();
        fVar3.f423615f = xt1.q.m(this.f176355f.f176191q);
        fVar3.f423611b = true;
        fVar3.f423610a = true;
        fVar3.f423625p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
        fVar3.f423629t = true;
        fVar3.f423630u = i65.a.b(this, 8);
        n11.a.b().h(this.f176355f.f176191q, this.f176374z, fVar3.a());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569836pl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f176357h = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.b_f);
        this.f176358i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bci);
        this.f176359m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hnq);
        this.f176360n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.opr);
        this.f176361o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.opq);
        this.f176362p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hno);
        this.f176364q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hnp);
        this.f176362p.setOnClickListener(this);
        this.f176365r = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bch);
        this.f176366s = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.agp);
        this.f176367t = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.agu);
        this.f176368u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.om_);
        this.f176370w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.opl);
        this.f176369v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hnk);
        this.f176371x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oq9);
        this.f176373y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oq_);
        this.f176374z = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlf);
        this.A = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlg);
        this.f176374z.setOnClickListener(this);
        this.B = findViewById(com.p314xaae8f345.mm.R.id.baq);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.opt);
        this.D = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.bap);
        this.E = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.bar);
        this.F = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b_5);
        this.G = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gs8);
        this.H = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlk);
        this.I = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.on9);
        this.f176352J = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gs7);
        this.P = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hlj);
        this.Q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.on8);
        this.K = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.on7);
        this.L = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b_y);
        this.M = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.haz);
        this.N = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.oni);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.S = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.okq);
        this.T = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f563880c2);
        this.U = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.b_3);
        this.R = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.bac);
        this.Z = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.h_0);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.h1(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.haz) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176185i)) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf.class);
                intent.putExtra("key_gift_into", this.f176355f);
                intent.putExtra("key_is_mute", false);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 3, this.f176354e, kk.v.a(this.f176353d));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.b_y) {
            if (this.Z.getVisibility() == 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176184h)) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13050xc93b9c8f.class);
                intent2.putExtra("key_gift_into", this.f176355f);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 4, this.f176354e, kk.v.a(this.f176353d));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.f568972on5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e = this.f176355f;
            if (c13037x580b4d4e != null && c13037x580b4d4e.f176197w) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 7, this.f176354e, kk.v.a(this.f176353d));
                if (!"cardhomepage/couponandgiftcard".equals(this.f176355f.V)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    am.ah ahVar = c5631x90d66b9.f135958g;
                    ahVar.f87687a = mo55332x76847179;
                    ahVar.f87688b = 2;
                    c5631x90d66b9.e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "enter to cardhome");
                } else if (((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue()) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                    j45.l.j(mo55332x76847179(), "card", ".ui.v3.CouponCardListUI", intent3, null);
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9 c5631x90d66b92 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5631x90d66b9();
                    c5631x90d66b92.f135958g.f87687a = mo55332x76847179();
                    c5631x90d66b92.e();
                }
                finish();
                overridePendingTransition(0, 0);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.on6) {
            if (!android.text.TextUtils.isEmpty(this.f176355f.R) && !android.text.TextUtils.isEmpty(this.f176355f.S)) {
                int intExtra = getIntent().getIntExtra("key_from_appbrand_type", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e2 = this.f176355f;
                lu1.d.d(c13037x580b4d4e2.H, c13037x580b4d4e2.R, c13037x580b4d4e2.S, 1062, intExtra);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 8, this.f176354e, kk.v.a(this.f176353d));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.f176179J)) {
                lu1.d.j(this, this.f176355f.f176179J, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 8, this.f176354e, kk.v.a(this.f176353d));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.hlf || view.getId() == com.p314xaae8f345.mm.R.id.hno) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.K) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f176355f.L)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.wu wuVar = new r45.wu();
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e c13037x580b4d4e3 = this.f176355f;
                wuVar.f470991d = c13037x580b4d4e3.K;
                wuVar.f470992e = c13037x580b4d4e3.L;
                linkedList.add(wuVar);
                java.lang.String stringExtra = getIntent().getStringExtra("key_template_id");
                r45.pd6 pd6Var = new r45.pd6();
                pd6Var.f464502d = stringExtra;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", stringExtra);
                gm0.j1.n().f354821b.g(new xt1.b0(linkedList, pd6Var, 27));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13866, 9, this.f176354e, kk.v.a(this.f176353d));
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.opt) {
            if (this.E.getVisibility() == 0) {
                this.E.setVisibility(8);
                this.C.setText("查看全部");
            } else {
                this.E.setVisibility(0);
                this.C.setText("收起");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f176354e = getIntent().getStringExtra("key_order_id");
        this.f176353d = getIntent().getIntExtra("key_biz_uin", -1);
        this.f176355f = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13037x580b4d4e) getIntent().getParcelableExtra("key_gift_into");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", this.f176354e, java.lang.Integer.valueOf(this.f176353d));
        mo43517x10010bd5();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de, this);
        gm0.j1.n().f354821b.a(1099, this);
        lu1.c.b(this.f176372x0);
        if (this.f176355f != null) {
            U6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
        if (this.f176353d == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
            return;
        }
        if (this.f176354e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
        gm0.j1.n().f354821b.g(new xt1.g0(this.f176353d, this.f176354e));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.i1(this));
        this.f176356g = Q;
        if (Q != null) {
            Q.show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.d0.f34984x366c91de, this);
        gm0.j1.n().f354821b.q(1099, this);
        lu1.c.c(this.f176372x0);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f176356g;
        if (u3Var != null && u3Var.isShowing()) {
            this.f176356g.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof xt1.g0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                lu1.r.e(this, str, true);
                return;
            } else {
                if (m1Var instanceof xt1.b0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    return;
                }
                return;
            }
        }
        if (m1Var instanceof xt1.g0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
            this.f176355f = ((xt1.g0) m1Var).f538013f;
            U6();
            return;
        }
        if (m1Var instanceof xt1.b0) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
            java.util.LinkedList linkedList = ((xt1.b0) m1Var).f537985f;
            if (linkedList == null || linkedList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
                return;
            }
            tt1.j jVar = (tt1.j) linkedList.get(0);
            if (jVar == null || !(jVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) it.next());
            }
            intent.putExtra("key_card_info", (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe) jVar);
            intent.putExtra("key_previous_scene", 27);
            intent.putExtra("key_from_scene", 27);
            intent.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent.putExtra("key_card_git_info", this.f176355f);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
