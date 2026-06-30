package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class w5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f287431b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f287432c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f287433d;

    /* renamed from: e, reason: collision with root package name */
    public int f287434e;

    /* renamed from: f, reason: collision with root package name */
    public int f287435f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f287436g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f287437h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f287438i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f287439j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f287440k;

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 a(android.view.View view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo80050xaf65a0fc(view);
        this.f39493x8ad70635 = this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2 c22811x324162d2 = (com.p314xaae8f345.mm.p2776x373aa5.C22811x324162d2) view.findViewById(com.p314xaae8f345.mm.R.id.f565184sq4);
        if (c22811x324162d2 != null) {
            c22811x324162d2.m82764xec18708e(new ym5.a6(5.0d, 0.0d, 3.5d, 0.0d, 0, 26, null));
        }
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f287431b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.sez);
        this.f287432c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.set);
        this.f287433d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.sev);
        this.f287436g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.sqv);
        this.f287437h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.sqw);
        this.f287438i = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.squ);
        this.f287439j = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.sqx);
        android.view.ViewStub viewStub = (android.view.ViewStub) view.findViewById(com.p314xaae8f345.mm.R.id.v_3);
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        r31.m wi6 = ((q31.t) ((q31.r) c17)).wi();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f287440k = ((ko.a) wi6).b(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewStub);
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f287440k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        if (abstractC11172x705e5905 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        } else {
            try {
                android.view.ViewParent parent = viewStub.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                int indexOfChild = viewGroup != null ? viewGroup.indexOfChild(viewStub) : -1;
                if (indexOfChild >= 0) {
                    if (viewGroup != null) {
                        viewGroup.removeViewInLayout(viewStub);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    if (layoutParams != null) {
                        if (viewGroup != null) {
                            viewGroup.addView(abstractC11172x705e5905, indexOfChild, layoutParams);
                        }
                    } else if (viewGroup != null) {
                        viewGroup.addView(abstractC11172x705e5905, indexOfChild);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DSLComponents", "inflateWithView exp=" + e17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateWithView", "com.tencent.mm.plugin.sns.ad.dsl.DSLComponentsKt");
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f287440k;
        if (abstractC11172x705e59052 != null) {
            a11.b bVar = new a11.b();
            bVar.f82033d = false;
            bVar.f82034e = "礼物";
            bVar.f82035f = view.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5);
            abstractC11172x705e59052.m48330xfcfee142(bVar);
        }
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f287435f = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k);
        this.f287434e = (int) (i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k) * 3.0f);
        return this;
    }
}
