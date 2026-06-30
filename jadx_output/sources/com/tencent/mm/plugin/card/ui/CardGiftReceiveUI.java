package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class CardGiftReceiveUI extends com.tencent.mm.ui.MMActivity implements android.view.View.OnClickListener, com.tencent.mm.modelbase.u0 {
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
    public android.widget.LinearLayout f94819J;
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
    public int f94820d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f94821e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.card.model.CardGiftInfo f94822f;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f94824h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f94825i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f94826m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f94827n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f94828o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f94829p;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.RelativeLayout f94830p0;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f94831q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.LinearLayout f94832r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f94833s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f94834t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f94835u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f94836v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f94837w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f94838x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f94840y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f94841z;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f94823g = null;
    public final com.tencent.mm.sdk.platformtools.n3 Y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: x0, reason: collision with root package name */
    public final lu1.b f94839x0 = new com.tencent.mm.plugin.card.ui.l1(this);

    public static void T6(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI, boolean z17) {
        if (cardGiftReceiveUI.f94830p0 != null) {
            return;
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) android.view.View.inflate(cardGiftReceiveUI, com.tencent.mm.R.layout.f488301pj, null);
        cardGiftReceiveUI.f94830p0 = relativeLayout;
        cardGiftReceiveUI.X = relativeLayout.findViewById(com.tencent.mm.R.id.f483440av1);
        cardGiftReceiveUI.V = (android.widget.TextView) cardGiftReceiveUI.f94830p0.findViewById(com.tencent.mm.R.id.on6);
        cardGiftReceiveUI.W = (android.widget.TextView) cardGiftReceiveUI.f94830p0.findViewById(com.tencent.mm.R.id.f487439on5);
        cardGiftReceiveUI.V.setOnClickListener(cardGiftReceiveUI);
        cardGiftReceiveUI.W.setOnClickListener(cardGiftReceiveUI);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        if (z17) {
            if (cardGiftReceiveUI.U.getVisibility() == 0) {
                layoutParams.addRule(3, com.tencent.mm.R.id.f482347c2);
            } else {
                layoutParams.addRule(3, com.tencent.mm.R.id.b_6);
            }
            layoutParams.bottomMargin = cardGiftReceiveUI.V6(30);
            layoutParams.topMargin = cardGiftReceiveUI.V6(40);
        } else {
            layoutParams.addRule(12, -1);
            layoutParams.bottomMargin = cardGiftReceiveUI.V6(30);
            layoutParams.topMargin = cardGiftReceiveUI.V6(40);
        }
        if (cardGiftReceiveUI.U.getVisibility() == 0) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            if (cardGiftReceiveUI.L.getVisibility() == 0) {
                layoutParams2.topMargin = cardGiftReceiveUI.V6(0);
                cardGiftReceiveUI.U.setLayoutParams(layoutParams2);
            } else {
                layoutParams2.topMargin = cardGiftReceiveUI.V6(60);
            }
            cardGiftReceiveUI.U.setLayoutParams(layoutParams2);
            cardGiftReceiveUI.U.addView(cardGiftReceiveUI.f94830p0, layoutParams);
        } else {
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -1);
            layoutParams3.topMargin = cardGiftReceiveUI.V6(60);
            cardGiftReceiveUI.F.setLayoutParams(layoutParams3);
            cardGiftReceiveUI.F.addView(cardGiftReceiveUI.f94830p0, layoutParams);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.T)) {
            cardGiftReceiveUI.V.setVisibility(8);
        } else {
            cardGiftReceiveUI.V.setVisibility(0);
            cardGiftReceiveUI.V.setText(cardGiftReceiveUI.f94822f.T);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.U)) {
            android.view.View view = cardGiftReceiveUI.X;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cardGiftReceiveUI.W.setVisibility(8);
        } else {
            android.view.View view2 = cardGiftReceiveUI.X;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateBottom", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cardGiftReceiveUI.W.setVisibility(0);
            cardGiftReceiveUI.W.setText(cardGiftReceiveUI.f94822f.U);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.f94650g)) {
            cardGiftReceiveUI.F.setVisibility(8);
        }
    }

    public final void U6() {
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = this.f94822f;
        if (cardGiftInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "doUpdate due to cardGiftInfo is null!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descLayoutMode:%d", java.lang.Integer.valueOf(cardGiftInfo.C));
        int i17 = this.f94822f.C;
        if (i17 == 1) {
            Z6();
        } else if (i17 == 2) {
            this.f94832r.setVisibility(8);
            this.f94825i.setVisibility(0);
            this.f94827n.setText(this.f94822f.A);
            this.f94828o.setText(this.f94822f.f94660s + "     " + this.f94822f.f94661t + getContext().getString(com.tencent.mm.R.string.ask));
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.B)) {
                this.f94826m.setVisibility(8);
            } else {
                this.f94826m.setVisibility(0);
                o11.f fVar = new o11.f();
                fVar.f342083g = lp0.b.D();
                fVar.f342082f = xt1.q.m(this.f94822f.B);
                fVar.f342078b = true;
                fVar.f342077a = true;
                n11.a.b().h(this.f94822f.B, this.f94826m, fVar.a());
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.E)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            } else {
                this.f94827n.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(this.f94822f.E, getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.F)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
            } else {
                this.f94828o.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(this.f94822f.F, getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94659r)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
            } else {
                o11.f fVar2 = new o11.f();
                fVar2.f342083g = lp0.b.D();
                fVar2.f342082f = xt1.q.m(this.f94822f.f94659r);
                fVar2.f342096t = true;
                fVar2.f342078b = true;
                fVar2.f342077a = true;
                fVar2.f342092p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
                n11.a.b().h(this.f94822f.f94659r, this.f94831q, fVar2.a());
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94658q)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
            } else {
                o11.f fVar3 = new o11.f();
                fVar3.f342083g = lp0.b.D();
                fVar3.f342082f = xt1.q.m(this.f94822f.f94658q);
                fVar3.f342078b = true;
                fVar3.f342077a = true;
                fVar3.f342092p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
                fVar3.f342096t = true;
                fVar3.f342097u = i65.a.b(this, 8);
                n11.a.b().h(this.f94822f.f94658q, this.f94829p, fVar3.a());
            }
        } else {
            Z6();
        }
        if (this.f94822f.Q == 1) {
            this.G.setVisibility(0);
            this.f94819J.setVisibility(8);
            this.F.setVisibility(8);
            android.widget.TextView textView = this.I;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.f94822f.f94648e;
            float textSize = this.I.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str, textSize));
            Y6(this.H);
        } else {
            this.G.setVisibility(8);
            this.f94819J.setVisibility(0);
            this.F.setVisibility(0);
            Y6(this.P);
            android.widget.TextView textView2 = this.Q;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = this.f94822f.f94648e;
            float textSize2 = this.Q.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str2, textSize2));
            if ((com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94651h) || "undefined".equals(this.f94822f.f94651h)) && (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94652i) || "undefined".equals(this.f94822f.f94652i))) {
                this.L.setVisibility(8);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is empty");
            } else {
                this.L.setVisibility(0);
            }
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo2 = this.f94822f;
            if (cardGiftInfo2 == null || com.tencent.mm.sdk.platformtools.t8.K0(cardGiftInfo2.f94651h)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "fromUserContentPicUrl is null");
            } else {
                com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo3 = this.f94822f;
                lu1.c.a(cardGiftInfo3.f94651h, cardGiftInfo3.f94654n, cardGiftInfo3.f94665x, 2);
            }
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo4 = this.f94822f;
            if (cardGiftInfo4 == null || com.tencent.mm.sdk.platformtools.t8.K0(cardGiftInfo4.f94653m)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "fromUserContentThumbPicUrl is null");
            } else {
                com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo5 = this.f94822f;
                lu1.c.a(cardGiftInfo5.f94653m, cardGiftInfo5.f94656p, cardGiftInfo5.f94668z, 2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94650g)) {
                android.widget.TextView textView3 = this.K;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str3 = this.f94822f.f94650g;
                float textSize3 = this.K.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, str3, textSize3));
            }
        }
        if (this.f94822f.M.size() > 0) {
            android.view.View view = this.B;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.E.setVisibility(8);
            if (this.f94822f.M.size() <= 2) {
                this.C.setVisibility(8);
                W6(this.f94822f.M);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add((com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) this.f94822f.M.get(0));
                linkedList.add((com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) this.f94822f.M.get(1));
                W6(linkedList);
                this.C.setVisibility(0);
                this.C.setOnClickListener(this);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (int i18 = 0; i18 < this.f94822f.M.size(); i18++) {
                    if (i18 != 0 && i18 != 1) {
                        linkedList2.add((com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) this.f94822f.M.get(i18));
                    }
                }
                this.E.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.card.ui.o1(this, linkedList2));
                X6(this.E);
            }
        } else {
            android.view.View view2 = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "updateCardList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(8);
            this.E.setVisibility(8);
        }
        if (this.f94822f.N.size() > 0) {
            this.U.setVisibility(0);
            this.T.setVisibility(0);
            this.T.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.card.ui.m1(this));
            X6(this.T);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.P)) {
                this.S.setVisibility(0);
                this.S.setText(this.f94822f.P);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.P)) {
            this.U.setVisibility(8);
            this.S.setVisibility(8);
            this.T.setVisibility(8);
        } else {
            this.U.setVisibility(0);
            this.S.setVisibility(0);
            this.S.setText(this.f94822f.P);
            this.T.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.W)) {
            this.R.setVisibility(8);
        } else {
            this.R.setVisibility(0);
            this.R.setText(this.f94822f.W);
            this.R.setOnClickListener(new com.tencent.mm.plugin.card.ui.f1(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.I) && com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94662u) && com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.T) && com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.U)) {
            this.f94824h.setFillViewport(true);
        } else {
            this.f94824h.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.card.ui.g1(this));
        }
    }

    public final int V6(int i17) {
        return i65.a.b(getContext(), i17);
    }

    public final void W6(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem acceptedCardItem = (com.tencent.mm.plugin.card.model.CardGiftInfo.AcceptedCardItem) it.next();
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.f488299ph, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.olg);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.olf);
            textView.setText(acceptedCardItem.f94669d);
            textView2.setText(acceptedCardItem.f94670e + getContext().getString(com.tencent.mm.R.string.ask));
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94649f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "fromUserImgUrl is null");
            return;
        }
        int b17 = i65.a.b(this, 20);
        o11.f fVar = new o11.f();
        fVar.f342083g = lp0.b.D();
        fVar.f342082f = xt1.q.m(this.f94822f.f94649f);
        fVar.f342078b = true;
        fVar.f342096t = true;
        fVar.f342097u = 3;
        fVar.f342077a = true;
        fVar.f342087k = b17;
        fVar.f342086j = b17;
        fVar.f342092p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
        n11.a.b().h(this.f94822f.f94649f, imageView, fVar.a());
    }

    public final void Z6() {
        this.f94825i.setVisibility(8);
        this.f94832r.setVisibility(0);
        this.f94837w.setText(this.f94822f.f94660s);
        if (this.f94822f.Q == 1) {
            this.f94841z.setAlpha(0.5f);
            this.f94838x.setVisibility(8);
            this.f94840y.setVisibility(8);
            this.f94834t.setVisibility(8);
            this.f94833s.setVisibility(8);
        } else {
            this.f94838x.setVisibility(0);
            this.f94840y.setVisibility(0);
            this.f94834t.setVisibility(0);
            this.f94833s.setVisibility(0);
            this.f94838x.setText(this.f94822f.f94661t);
            this.f94840y.setText(com.tencent.mm.R.string.ask);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94661t)) {
                this.f94838x.setVisibility(8);
                this.f94840y.setVisibility(8);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.G)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardPriceTitleColor is empty");
            } else {
                this.f94838x.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(this.f94822f.G, getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.B)) {
            this.f94836v.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        } else {
            this.f94836v.setVisibility(0);
            o11.f fVar = new o11.f();
            fVar.f342083g = lp0.b.D();
            fVar.f342082f = xt1.q.m(this.f94822f.B);
            fVar.f342078b = true;
            fVar.f342077a = true;
            n11.a.b().h(this.f94822f.B, this.f94836v, fVar.a());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.A)) {
            this.f94835u.setVisibility(8);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "descIconUrl is null");
        } else {
            this.f94835u.setVisibility(0);
            this.f94835u.setText(this.f94822f.A);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.E)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.descriptionTitleColor is empty");
            } else {
                this.f94835u.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(this.f94822f.E, getResources().getColor(com.tencent.mm.R.color.a0c)));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.F)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.cardTitleColor is empty");
        } else {
            this.f94837w.setTextColor(com.tencent.mm.sdk.platformtools.t8.f(this.f94822f.F, getResources().getColor(com.tencent.mm.R.color.a0c)));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94659r)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardLogoLUrl is null");
        } else {
            o11.f fVar2 = new o11.f();
            fVar2.f342083g = lp0.b.D();
            fVar2.f342082f = xt1.q.m(this.f94822f.f94659r);
            fVar2.f342096t = true;
            fVar2.f342078b = true;
            fVar2.f342077a = true;
            fVar2.f342092p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
            n11.a.b().h(this.f94822f.f94659r, this.A, fVar2.a());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94658q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardBackgroundPicUrl is null");
            return;
        }
        o11.f fVar3 = new o11.f();
        fVar3.f342083g = lp0.b.D();
        fVar3.f342082f = xt1.q.m(this.f94822f.f94658q);
        fVar3.f342078b = true;
        fVar3.f342077a = true;
        fVar3.f342092p = new android.graphics.drawable.ColorDrawable(lu1.a0.d("#CCCCCC"));
        fVar3.f342096t = true;
        fVar3.f342097u = i65.a.b(this, 8);
        n11.a.b().h(this.f94822f.f94658q, this.f94841z, fVar3.a());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488303pl;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f94824h = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.b_f);
        this.f94825i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bci);
        this.f94826m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hnq);
        this.f94827n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.opr);
        this.f94828o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.opq);
        this.f94829p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hno);
        this.f94831q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hnp);
        this.f94829p.setOnClickListener(this);
        this.f94832r = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bch);
        this.f94833s = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.agp);
        this.f94834t = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.agu);
        this.f94835u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.om_);
        this.f94837w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.opl);
        this.f94836v = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hnk);
        this.f94838x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oq9);
        this.f94840y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.oq_);
        this.f94841z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlf);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlg);
        this.f94841z.setOnClickListener(this);
        this.B = findViewById(com.tencent.mm.R.id.baq);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.opt);
        this.D = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bap);
        this.E = (android.widget.ListView) findViewById(com.tencent.mm.R.id.bar);
        this.F = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b_5);
        this.G = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gs8);
        this.H = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlk);
        this.I = (android.widget.TextView) findViewById(com.tencent.mm.R.id.on9);
        this.f94819J = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.gs7);
        this.P = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.hlj);
        this.Q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.on8);
        this.K = (android.widget.TextView) findViewById(com.tencent.mm.R.id.on7);
        this.L = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b_y);
        this.M = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.haz);
        this.N = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.oni);
        this.L.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.S = (android.widget.TextView) findViewById(com.tencent.mm.R.id.okq);
        this.T = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482347c2);
        this.U = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.b_3);
        this.R = (android.widget.Button) findViewById(com.tencent.mm.R.id.bac);
        this.Z = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.h_0);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.card.ui.h1(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.haz) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94652i)) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardGiftVideoUI.class);
                intent.putExtra("key_gift_into", this.f94822f);
                intent.putExtra("key_is_mute", false);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 3, this.f94821e, kk.v.a(this.f94820d));
            }
        } else if (view.getId() == com.tencent.mm.R.id.b_y) {
            if (this.Z.getVisibility() == 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94651h)) {
                android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardGiftImageUI.class);
                intent2.putExtra("key_gift_into", this.f94822f);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent2);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                overridePendingTransition(0, 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 4, this.f94821e, kk.v.a(this.f94820d));
            }
        } else if (view.getId() == com.tencent.mm.R.id.f487439on5) {
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = this.f94822f;
            if (cardGiftInfo != null && cardGiftInfo.f94664w) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 7, this.f94821e, kk.v.a(this.f94820d));
                if (!"cardhomepage/couponandgiftcard".equals(this.f94822f.V)) {
                    com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    am.ah ahVar = gotoCardHomePageEvent.f54425g;
                    ahVar.f6154a = context;
                    ahVar.f6155b = 2;
                    gotoCardHomePageEvent.e();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "enter to cardhome");
                } else if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue()) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                    j45.l.j(getContext(), "card", ".ui.v3.CouponCardListUI", intent3, null);
                } else {
                    com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent2 = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
                    gotoCardHomePageEvent2.f54425g.f6154a = getContext();
                    gotoCardHomePageEvent2.e();
                }
                finish();
                overridePendingTransition(0, 0);
            }
        } else if (view.getId() == com.tencent.mm.R.id.on6) {
            if (!android.text.TextUtils.isEmpty(this.f94822f.R) && !android.text.TextUtils.isEmpty(this.f94822f.S)) {
                int intExtra = getIntent().getIntExtra("key_from_appbrand_type", 0);
                com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo2 = this.f94822f;
                lu1.d.d(cardGiftInfo2.H, cardGiftInfo2.R, cardGiftInfo2.S, 1062, intExtra);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 8, this.f94821e, kk.v.a(this.f94820d));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.f94646J)) {
                lu1.d.j(this, this.f94822f.f94646J, 0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 8, this.f94821e, kk.v.a(this.f94820d));
            }
        } else if (view.getId() == com.tencent.mm.R.id.hlf || view.getId() == com.tencent.mm.R.id.hno) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.K) || com.tencent.mm.sdk.platformtools.t8.K0(this.f94822f.L)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "cardGiftInfo.userCardId is null");
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.wu wuVar = new r45.wu();
                com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo3 = this.f94822f;
                wuVar.f389458d = cardGiftInfo3.K;
                wuVar.f389459e = cardGiftInfo3.L;
                linkedList.add(wuVar);
                java.lang.String stringExtra = getIntent().getStringExtra("key_template_id");
                r45.pd6 pd6Var = new r45.pd6();
                pd6Var.f382969d = stringExtra;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "doBatchGetCardItemByTpInfo templateId:%s", stringExtra);
                gm0.j1.n().f273288b.g(new xt1.b0(linkedList, pd6Var, 27));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13866, 9, this.f94821e, kk.v.a(this.f94820d));
            }
        } else if (view.getId() == com.tencent.mm.R.id.opt) {
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

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f94821e = getIntent().getStringExtra("key_order_id");
        this.f94820d = getIntent().getIntExtra("key_biz_uin", -1);
        this.f94822f = (com.tencent.mm.plugin.card.model.CardGiftInfo) getIntent().getParcelableExtra("key_gift_into");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "onCreate, orderId:%s, bizUin:%s", this.f94821e, java.lang.Integer.valueOf(this.f94820d));
        initView();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.a(1099, this);
        lu1.c.b(this.f94839x0);
        if (this.f94822f != null) {
            U6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "cardGiftInfo is null, sync GiftCard from serve");
        if (this.f94820d == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, bizUin is -1, fail!");
            return;
        }
        if (this.f94821e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo, orderId is null, fail");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "doNetSceneGetCardGiftInfo");
        gm0.j1.n().f273288b.g(new xt1.g0(this.f94820d, this.f94821e));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.card.ui.i1(this));
        this.f94823g = Q;
        if (Q != null) {
            Q.show();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.webview.d0.CTRL_INDEX, this);
        gm0.j1.n().f273288b.q(1099, this);
        lu1.c.c(this.f94839x0);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f94823g;
        if (u3Var != null && u3Var.isShowing()) {
            this.f94823g.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof xt1.g0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                lu1.r.e(this, str, true);
                return;
            } else {
                if (m1Var instanceof xt1.b0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", ", NetSceneBatchGetCardItemByTpInfo onSceneEnd fail return!  errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                    return;
                }
                return;
            }
        }
        if (m1Var instanceof xt1.g0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "card gift info cgi success!");
            this.f94822f = ((xt1.g0) m1Var).f456480f;
            U6();
            return;
        }
        if (m1Var instanceof xt1.b0) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.CardDetailUI.class);
            java.util.LinkedList linkedList = ((xt1.b0) m1Var).f456452f;
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardinfo list  size is null or empty!");
                return;
            }
            tt1.j jVar = (tt1.j) linkedList.get(0);
            if (jVar == null || !(jVar instanceof com.tencent.mm.plugin.card.model.CardInfo)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardGiftReceiveUI", "NetSceneBatchGetCardItemByTpInfo resp cardInfo  is null!");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add((com.tencent.mm.plugin.card.model.CardInfo) it.next());
            }
            intent.putExtra("key_card_info", (com.tencent.mm.plugin.card.model.CardInfo) jVar);
            intent.putExtra("key_previous_scene", 27);
            intent.putExtra("key_from_scene", 27);
            intent.putExtra("key_from_appbrand_type", intent.getIntExtra("key_from_appbrand_type", 0));
            intent.putExtra("key_card_git_info", this.f94822f);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
