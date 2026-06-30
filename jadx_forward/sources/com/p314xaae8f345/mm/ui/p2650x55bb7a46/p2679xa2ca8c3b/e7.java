package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class e7 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f285378b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f285379c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f285380d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f285381e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f285382f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f285383g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f285384h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f285385i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f285386j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 f285387k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f285388l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f285389m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f285390n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f285391o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f285392p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f285393q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f285394r;

    public int a(android.content.Context context) {
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        int min = java.lang.Math.min(a17.f278668a, a17.f278669b);
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri();
        int i17 = (min * 3) / 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingItemAppMsgFinderFeed", "real widthPixels:" + min + " , width:" + i17);
        return i17;
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e7 b(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f285394r = view.findViewById(com.p314xaae8f345.mm.R.id.bkg);
        boolean z18 = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Ri() == 1;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f285394r.getLayoutParams();
        layoutParams.width = a(view.getContext());
        this.f285394r.setLayoutParams(layoutParams);
        this.f285378b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bnf);
        this.f285379c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bnp);
        this.f285380d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565206bo1);
        this.f285381e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bni);
        this.f285382f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565205bo0);
        this.f285383g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bo8);
        this.f285384h = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bnk);
        this.f285385i = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bno);
        this.f285387k = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9) view.findViewById(com.p314xaae8f345.mm.R.id.bnn);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f285388l = view.findViewById(com.p314xaae8f345.mm.R.id.bjy);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bne);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        this.f285389m = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cum);
        this.f285390n = view.findViewById(com.p314xaae8f345.mm.R.id.msr);
        this.f285391o = view.findViewById(com.p314xaae8f345.mm.R.id.fsk);
        this.f285392p = view.findViewById(com.p314xaae8f345.mm.R.id.bnq);
        this.f285393q = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ptg);
        if (!(true ^ ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el())) {
            this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
            this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        }
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.ott);
        this.f39501x4004bbf3 = progressBar;
        if (z17) {
            this.f285386j = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bqz);
            android.widget.ImageView imageView2 = this.f285380d;
            if (imageView2 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) {
                ((com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) imageView2).m82623x81e824af(com.p314xaae8f345.mm.R.C30861xcebc809e.c0j);
            }
        } else {
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.ImageView imageView3 = this.f285380d;
            if (imageView3 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) {
                ((com.p314xaae8f345.mm.p2776x373aa5.C22794x150b36fa) imageView3).m82623x81e824af(com.p314xaae8f345.mm.R.C30861xcebc809e.c08);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2222x373aa5.C18393x3e165bd9 c18393x3e165bd9 = this.f285387k;
        c18393x3e165bd9.f252188i = com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b;
        c18393x3e165bd9.f252187h = com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an;
        android.widget.ImageView imageView4 = this.f285384h;
        imageView4.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView4.getContext(), z18 ? com.p314xaae8f345.mm.R.raw.f79664x14f92eb : com.p314xaae8f345.mm.R.raw.f80119x628f1c9a, i65.a.d(this.f285384h.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f285388l;
    }
}
