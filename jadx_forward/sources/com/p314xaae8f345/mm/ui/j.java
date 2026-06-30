package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f290501a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f290502b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f290503c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f290504d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f290505e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f290506f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f290507g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f290508h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f290509i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.ViewGroup f290510j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f290511k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.ImageView f290512l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f290513m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f290514n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f290515o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f290516p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f290517q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f290518r;

    /* renamed from: t, reason: collision with root package name */
    public final int f290520t;

    /* renamed from: s, reason: collision with root package name */
    public int f290519s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f290521u = true;

    public j(android.view.View view) {
        this.f290520t = 0;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        view.setLayoutParams(layoutParams);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obn);
        this.f290504d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.osp);
        this.f290505e = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obr);
        this.f290506f = textView3;
        this.f290507g = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.obp);
        this.f290508h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.obo);
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nqs);
        this.f290509i = textView4;
        this.f290510j = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.nqu);
        this.f290511k = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.nqt);
        this.f290513m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nxp);
        this.f290512l = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567593k10);
        this.f290514n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567831ku4);
        this.f290515o = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ld9);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f78238xaeb5384d);
        this.f290501a = findViewById;
        this.f290502b = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.a4p);
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564020fv);
        this.f290503c = textView5;
        this.f290516p = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.lst);
        this.f290517q = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ova);
        this.f290520t = i65.a.f(findViewById.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.ajt);
        findViewById.post(new com.p314xaae8f345.mm.ui.g(this));
        this.f290518r = view;
        com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
        com.p314xaae8f345.mm.ui.f.b(textView4, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        com.p314xaae8f345.mm.ui.f.b(textView3, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
        com.p314xaae8f345.mm.ui.f.b(textView5, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.f.b(textView2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3);
            com.p314xaae8f345.mm.ui.bk.s0(textView2.getPaint());
        }
    }

    public void a(int i17) {
        if (i17 == 0) {
            i17 = com.p314xaae8f345.mm.R.raw.f78544x9f7efbda;
        }
        android.widget.TextView textView = this.f290503c;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f290502b;
        if (c22699x3dcdb352 != null && i17 != 0) {
            c22699x3dcdb352.s(i17, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            c22699x3dcdb352.setVisibility(0);
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        textView.setVisibility(8);
        c22699x3dcdb352.setVisibility(0);
    }

    public void b(int i17) {
        if (i17 == 0) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.f571889so;
        }
        android.widget.TextView textView = this.f290503c;
        if (textView != null) {
            textView.setText(i17);
            textView.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f290502b;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
        }
    }

    public void c(android.view.View.OnClickListener onClickListener) {
        this.f290501a.setOnClickListener(onClickListener);
    }

    public void d(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f290511k;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f290508h;
        if (z17) {
            c22699x3dcdb3522.setVisibility(8);
            c22699x3dcdb352.setVisibility(z18 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(this.f290509i.getCurrentTextColor());
        } else {
            c22699x3dcdb3522.setVisibility(z18 ? 0 : 8);
            c22699x3dcdb352.setVisibility(8);
            c22699x3dcdb3522.m82040x7541828(this.f290504d.getCurrentTextColor());
        }
    }

    public void e(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f290509i;
        if (charSequence == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
        if (i65.a.D(textView.getContext())) {
            textView.setTextSize(1, 14.0f);
            this.f290504d.setTextSize(1, 18.0f);
        }
    }

    public void f(int i17) {
        android.widget.TextView textView = this.f290504d;
        textView.setText(i17);
        if (com.p314xaae8f345.mm.ui.f.a()) {
            com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
        } else if (i65.a.D(textView.getContext())) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(textView.getContext()));
        }
    }

    public void g(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f290504d;
        textView.setText(charSequence);
        if (com.p314xaae8f345.mm.ui.f.a()) {
            com.p314xaae8f345.mm.ui.f.b(textView, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
        } else if (i65.a.D(textView.getContext())) {
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b) * i65.a.m(textView.getContext()));
        }
    }

    public void h(int i17) {
        android.widget.TextView textView = this.f290505e;
        if (textView != null) {
            if (i17 <= 0) {
                textView.setVisibility(8);
                return;
            }
            this.f290519s = i17;
            if (this.f290521u) {
                textView.setVisibility(0);
                textView.setText(java.lang.Integer.toString(i17));
            }
        }
    }
}
