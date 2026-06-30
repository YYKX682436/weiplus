package ze5;

/* loaded from: classes9.dex */
public final class m6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 f553624b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f553625c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f553626d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f553627e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f553628f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f553629g;

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view, boolean z17) {
        if (view == null) {
            return this;
        }
        super.mo80050xaf65a0fc(view);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39500xcbecde0f = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.bkm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f553624b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85) findViewById2;
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39492x5b9aa3a3 = findViewById3 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById3 : null;
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.bky);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f553626d = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.sq9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f553627e = findViewById5;
        android.view.View findViewById6 = view.findViewById(com.p314xaae8f345.mm.R.id.bkz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f553628f = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = view.findViewById(com.p314xaae8f345.mm.R.id.sq_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f553629g = (android.widget.TextView) findViewById7;
        android.widget.ImageView imageView = this.f553628f;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureTipsIcon");
            throw null;
        }
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79052x3a20d976, view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c)));
        android.widget.TextView textView = this.f553629g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureTipsTV");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        if (z17) {
            android.view.View findViewById8 = view.findViewById(com.p314xaae8f345.mm.R.id.brc);
            this.f39502xce2b2f8d = findViewById8 instanceof android.widget.TextView ? (android.widget.TextView) findViewById8 : null;
        } else {
            android.view.View findViewById9 = view.findViewById(com.p314xaae8f345.mm.R.id.ott);
            this.f39501x4004bbf3 = findViewById9 instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById9 : null;
            android.view.View findViewById10 = view.findViewById(com.p314xaae8f345.mm.R.id.bqx);
            this.f39499x8eebed7e = findViewById10 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById10 : null;
            android.view.View findViewById11 = view.findViewById(com.p314xaae8f345.mm.R.id.bqz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById11, "findViewById(...)");
            this.f553625c = (android.widget.ImageView) findViewById11;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.sru);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View a17 = ((io.t) T6).a(context);
        linearLayout.addView(a17);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = a17.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388613;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = a17.findViewById(com.p314xaae8f345.mm.R.id.uw8).getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 8388613;
            }
        }
        lf5.g.a(a17, true, z17);
        m80057x35d80ff(T6);
        return this;
    }

    public final android.view.View b() {
        android.view.View view = this.f553626d;
        if (view != null) {
            return view;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("captureTipsView");
        throw null;
    }

    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 c() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22076x79b79a85 c22076x79b79a85 = this.f553624b;
        if (c22076x79b79a85 != null) {
            return c22076x79b79a85;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0
    /* renamed from: getMainContainerView */
    public android.view.View mo79945xb0f558d7() {
        return c();
    }
}
