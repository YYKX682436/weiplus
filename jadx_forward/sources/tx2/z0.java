package tx2;

/* loaded from: classes3.dex */
public final class z0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f504209d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f504210e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = nVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(getContext());
        y1Var.f293570s = new tx2.x0(h0Var);
        tx2.y0 y0Var = new tx2.y0(h0Var);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8z, (android.view.ViewGroup) this, false);
        this.f504209d = inflate;
        if (inflate != null && (findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bf_)) != null) {
            findViewById3.setOnClickListener(new tx2.t0(this));
        }
        android.view.View view = this.f504209d;
        if (view != null && (findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f567196ij2)) != null) {
            findViewById2.setOnClickListener(new tx2.u0(this));
        }
        android.view.View view2 = this.f504209d;
        if (view2 != null && (findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.bfa)) != null) {
            findViewById.setOnClickListener(new tx2.v0(this, y0Var));
        }
        android.view.View view3 = this.f504209d;
        if (view3 != null && (imageView2 = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.f566943hl1)) != null) {
            n11.a.b().g(str, imageView2);
        }
        android.view.View view4 = this.f504209d;
        if (view4 != null && (imageView = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.ehp)) != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79664x14f92eb, i65.a.d(imageView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7)));
        }
        android.view.View view5 = this.f504209d;
        android.widget.TextView textView2 = view5 != null ? (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.oqh) : null;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        android.view.View view6 = this.f504209d;
        android.widget.TextView textView3 = view6 != null ? (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.f568965om4) : null;
        if (textView3 != null) {
            textView3.setText(str3);
        }
        android.view.View view7 = this.f504209d;
        if (view7 != null && (textView = (android.widget.TextView) view7.findViewById(com.p314xaae8f345.mm.R.id.f568992op4)) != null) {
            hc2.o.a(textView, true);
            textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e3x, java.lang.Integer.valueOf(i17)));
        }
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new tx2.w0(this));
        y1Var.k(this.f504209d);
        y1Var.s();
        this.f504210e = y1Var;
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* renamed from: getRoot */
    public final android.view.View m167130xfb84e958() {
        return this.f504209d;
    }

    /* renamed from: setRoot */
    public final void m167131x764fb064(android.view.View view) {
        this.f504209d = view;
    }
}
