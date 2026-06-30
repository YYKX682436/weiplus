package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f94988a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f94989b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f94990c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f94991d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f94992e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f94993f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f94994g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView[] f94995h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f94996i;

    public e2(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view, int i17, eu1.f fVar) {
        this(mMActivity, view, i17, fVar, null);
    }

    public void a(int i17) {
        android.view.View view = this.f94989b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b() {
        int i17 = this.f94988a;
        if (i17 != 2) {
            if (i17 == 3) {
                this.f94992e.setText(com.tencent.mm.R.string.f490811aw3);
                android.view.View findViewById = this.f94989b.findViewById(com.tencent.mm.R.id.b_i);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "updateTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String str = (java.lang.String) xt1.t0.Di().a("key_card_entrance_tips");
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    this.f94993f.setVisibility(8);
                    return;
                } else {
                    this.f94993f.setText(str);
                    this.f94993f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
        if (jVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CardHomePageItemController", "updateShareCardView data is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f266854i)) {
            this.f94993f.setVisibility(8);
        } else {
            this.f94993f.setVisibility(0);
            this.f94993f.setText(jVar.f266854i);
        }
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(jVar.f266853h);
        android.widget.ImageView[] imageViewArr = this.f94995h;
        if (L0) {
            for (int i18 = 0; i18 < 3; i18++) {
                imageViewArr[i18].setVisibility(8);
            }
        } else {
            for (int i19 = 0; i19 < 3; i19++) {
                if (i19 < jVar.f266853h.size()) {
                    imageViewArr[i19].setVisibility(0);
                    lu1.g0.b(imageViewArr[i19], (java.lang.String) jVar.f266853h.get(i19), this.f94991d.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi), com.tencent.mm.R.drawable.cbt, false);
                } else {
                    imageViewArr[i19].setVisibility(8);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.L0(jVar.f266853h) || jVar.f266853h.size() != 1 || !jVar.f266851f || jVar.f266852g) {
            this.f94996i.setVisibility(8);
        } else {
            this.f94996i.setVisibility(0);
        }
    }

    public e2(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view, int i17, eu1.f fVar, r45.ku kuVar) {
        this.f94995h = r6;
        this.f94991d = mMActivity;
        this.f94989b = view;
        this.f94988a = i17;
        this.f94990c = view.findViewById(com.tencent.mm.R.id.b_m);
        this.f94992e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b_o);
        this.f94993f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b_n);
        this.f94994g = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.b_p);
        android.widget.ImageView[] imageViewArr = {(android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.b_j), (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.b_k), (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.b_l)};
        this.f94996i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bbo);
        if (i17 == 1) {
            this.f94992e.setText(mMActivity.getString(com.tencent.mm.R.string.f490797au1, 0));
            this.f94994g.setImageResource(com.tencent.mm.R.raw.card_home_member_card_icon);
            return;
        }
        if (i17 == 2) {
            this.f94992e.setText(com.tencent.mm.R.string.avd);
            this.f94994g.setImageResource(com.tencent.mm.R.raw.card_home_friend_ticket_icon);
            return;
        }
        if (i17 == 3) {
            this.f94992e.setText(com.tencent.mm.R.string.f490811aw3);
            this.f94994g.setImageResource(com.tencent.mm.R.raw.card_home_my_ticket_icon);
            return;
        }
        if (i17 == 4) {
            if (kuVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CardHomePageItemController", "cell element is null");
                a(8);
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b_i);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/CardHomePageItemController", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f94992e.setText(kuVar.f378947e);
            this.f94994g.setUseSdcardCache(true);
            this.f94994g.setUrl(kuVar.f378948f);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(kuVar.f378949g)) {
                this.f94993f.setText(kuVar.f378949g);
                this.f94993f.setVisibility(0);
            } else {
                this.f94993f.setVisibility(8);
            }
        }
    }
}
