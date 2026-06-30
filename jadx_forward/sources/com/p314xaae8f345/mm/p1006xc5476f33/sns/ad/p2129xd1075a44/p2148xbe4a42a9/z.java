package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9;

/* loaded from: classes4.dex */
public abstract class z extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.h0 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f245308o;

    /* renamed from: p, reason: collision with root package name */
    public final int f245309p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f245310q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f245311r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f245312s;

    public z(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, int i17, i64.b1 b1Var) {
        super(str, yVar, view);
        this.f245308o = view;
        this.f245309p = i17;
        this.f245310q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.w(this));
        this.f245311r = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.x(this));
        this.f245312s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.y(this));
    }

    public final void A(int i17) {
        android.graphics.drawable.Drawable e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.view.View view = this.f245308o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            return;
        }
        android.widget.LinearLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        jz5.g gVar = this.f245311r;
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        a84.v0.a(context, imageView, 14, 14);
        android.widget.LinearLayout y18 = y();
        if (y18 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundResIdByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            int i18 = z(i17) ? com.p314xaae8f345.mm.R.C30861xcebc809e.d8w : com.p314xaae8f345.mm.R.C30861xcebc809e.d8x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundResIdByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            y18.setBackgroundResource(i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLivingIcon", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        if (imageView2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivingIconDrawableByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            if (z(i17)) {
                e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81072x92ff1b9a, context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77843xb0e5e715));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            } else {
                e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f81072x92ff1b9a, context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.amo));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivingIconDrawableByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
            imageView2.setImageDrawable(e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLivingTextByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLivingText", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea) ((jz5.n) this.f245312s).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLivingText", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        if (c18277x17b0cea != null) {
            if (z(i17)) {
                c18277x17b0cea.setText(c18277x17b0cea.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j7q));
                c18277x17b0cea.setTextColor(c18277x17b0cea.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77843xb0e5e715));
            } else {
                c18277x17b0cea.setText(c18277x17b0cea.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574711oj2));
                c18277x17b0cea.setTextColor(c18277x17b0cea.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLivingTextByStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetUIByLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.h0
    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "status changed, status is " + i18);
        if (ca4.z0.T((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) i()).equals(str) && i17 != i18 && n(i())) {
            A(i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLiveStatusChanged", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void d(java.lang.Object obj, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        java.lang.String T = ca4.z0.T(model);
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.c(T, 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "optLivingStatus, snsId is " + T + ", status is " + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.a(T, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.LinearLayout y17 = y();
        if ((y17 != null ? y17.getContext() : null) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        } else {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.v.f245299e.a(model)) {
                e74.i.f().d(this.f245309p, model);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestFinderLivingStatus", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        }
        A(c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        android.widget.LinearLayout y17 = y();
        if (y17 != null) {
            y17.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
    }

    public final android.widget.LinearLayout y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMLivingContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f245310q).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMLivingContainer", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        return linearLayout;
    }

    public final boolean z(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLiving", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        boolean z17 = i17 == 2 || i17 == 770;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLiving", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
        return z17;
    }
}
