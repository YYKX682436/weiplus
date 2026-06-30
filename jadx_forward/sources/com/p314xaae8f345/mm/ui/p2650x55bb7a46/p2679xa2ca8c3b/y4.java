package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class y4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f287559b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f287560c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f287561d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f287562e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f287563f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f287564g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f287565h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f287566i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f287567j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f287568k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f287569l;

    /* renamed from: m, reason: collision with root package name */
    public int f287570m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f287571n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f287572o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f287573p = 0;

    public void a(int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        if (this.f287570m == i17) {
            return;
        }
        this.f287570m = i17;
        if (i17 == 1) {
            this.f287564g.setVisibility(0);
            this.f287560c.setVisibility(8);
            this.f287563f.setVisibility(8);
            this.f287562e.setClickable(true);
            android.widget.ImageView imageView = this.f287562e;
            this.f39493x8ad70635 = imageView;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.f287572o;
            this.f287562e.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f287569l.getLayoutParams();
            layoutParams2.topMargin = this.f287573p;
            this.f287569l.setLayoutParams(layoutParams2);
            return;
        }
        if (i17 == 2) {
            this.f287564g.setVisibility(8);
            this.f287563f.setVisibility(0);
            this.f287562e.setClickable(false);
            this.f39493x8ad70635 = this.f287563f;
            android.view.ViewGroup.LayoutParams layoutParams3 = this.f287562e.getLayoutParams();
            layoutParams3.height = this.f287571n;
            this.f287562e.setLayoutParams(layoutParams3);
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f287569l.getLayoutParams();
            layoutParams4.topMargin = 0;
            this.f287569l.setLayoutParams(layoutParams4);
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y4 b(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f39500xcbecde0f = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f39502xce2b2f8d = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f287563f = (android.widget.ImageView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3t);
        this.f287559b = (android.widget.RelativeLayout) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3s);
        this.f287560c = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3p);
        this.f287561d = (android.widget.ImageView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3q);
        this.f287562e = (android.widget.ImageView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.a3r);
        this.f287564g = (android.widget.RelativeLayout) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564786r22);
        this.f287565h = (android.widget.LinearLayout) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564790r26);
        this.f287566i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.r27);
        this.f287567j = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564789r25);
        this.f287568k = (android.widget.TextView) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564787r23);
        this.f287569l = (android.widget.FrameLayout) this.f39494xbf64baf8.findViewById(com.p314xaae8f345.mm.R.id.f564785r21);
        this.f287572o = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561772ak1);
        this.f287571n = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561773ak2);
        this.f287573p = view.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561771ak0);
        return this;
    }

    public void c(int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f287568k.getLayoutParams();
        layoutParams.bottomMargin = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        this.f287568k.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return this.f287559b;
    }
}
