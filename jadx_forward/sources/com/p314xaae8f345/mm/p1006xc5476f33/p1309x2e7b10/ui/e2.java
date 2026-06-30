package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f176521a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f176522b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f176523c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f176524d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f176525e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f176526f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f176527g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView[] f176528h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f176529i;

    public e2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view, int i17, eu1.f fVar) {
        this(abstractActivityC21394xb3d2c0cf, view, i17, fVar, null);
    }

    public void a(int i17) {
        android.view.View view = this.f176522b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b() {
        int i17 = this.f176521a;
        if (i17 != 2) {
            if (i17 == 3) {
                this.f176525e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572344aw3);
                android.view.View findViewById = this.f176522b.findViewById(com.p314xaae8f345.mm.R.id.b_i);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String str = (java.lang.String) xt1.t0.Di().a("key_card_entrance_tips");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    this.f176526f.setVisibility(8);
                    return;
                } else {
                    this.f176526f.setText(str);
                    this.f176526f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f348387i)) {
            this.f176526f.setVisibility(8);
        } else {
            this.f176526f.setVisibility(0);
            this.f176526f.setText(jVar.f348387i);
        }
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(jVar.f348386h);
        android.widget.ImageView[] imageViewArr = this.f176528h;
        if (L0) {
            for (int i18 = 0; i18 < 3; i18++) {
                imageViewArr[i18].setVisibility(8);
            }
        } else {
            for (int i19 = 0; i19 < 3; i19++) {
                if (i19 < jVar.f348386h.size()) {
                    imageViewArr[i19].setVisibility(0);
                    lu1.g0.b(imageViewArr[i19], (java.lang.String) jVar.f348386h.get(i19), this.f176524d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561402hi), com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, false);
                } else {
                    imageViewArr[i19].setVisibility(8);
                }
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(jVar.f348386h) || jVar.f348386h.size() != 1 || !jVar.f348384f || jVar.f348385g) {
            this.f176529i.setVisibility(8);
        } else {
            this.f176529i.setVisibility(0);
        }
    }

    public e2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view, int i17, eu1.f fVar, r45.ku kuVar) {
        this.f176528h = r6;
        this.f176524d = abstractActivityC21394xb3d2c0cf;
        this.f176522b = view;
        this.f176521a = i17;
        this.f176523c = view.findViewById(com.p314xaae8f345.mm.R.id.b_m);
        this.f176525e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b_o);
        this.f176526f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.b_n);
        this.f176527g = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.b_p);
        android.widget.ImageView[] imageViewArr = {(android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.b_j), (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.b_k), (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.b_l)};
        this.f176529i = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bbo);
        if (i17 == 1) {
            this.f176525e.setText(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572330au1, 0));
            this.f176527g.setImageResource(com.p314xaae8f345.mm.R.raw.f78754x704f6854);
            return;
        }
        if (i17 == 2) {
            this.f176525e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avd);
            this.f176527g.setImageResource(com.p314xaae8f345.mm.R.raw.f78753xbc36dcdc);
            return;
        }
        if (i17 == 3) {
            this.f176525e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572344aw3);
            this.f176527g.setImageResource(com.p314xaae8f345.mm.R.raw.f78755xa957fb6a);
            return;
        }
        if (i17 == 4) {
            if (kuVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardHomePageItemController", "cell element is null");
                a(8);
            }
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.b_i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f176525e.setText(kuVar.f460480e);
            this.f176527g.m75397xc185581c(true);
            this.f176527g.m75396xca029dad(kuVar.f460481f);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kuVar.f460482g)) {
                this.f176526f.setText(kuVar.f460482g);
                this.f176526f.setVisibility(0);
            } else {
                this.f176526f.setVisibility(8);
            }
        }
    }
}
