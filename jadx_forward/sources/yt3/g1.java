package yt3;

/* loaded from: classes3.dex */
public final class g1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f546990d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f546991e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f546992f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f546993g;

    /* renamed from: h, reason: collision with root package name */
    public final yt3.f1 f546994h;

    public g1(android.view.ViewGroup view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546990d = view;
        this.f546991e = status;
        this.f546992f = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ghn);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cmw);
        this.f546993g = viewGroup;
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cmt);
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cmv);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565522cn1);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cmz);
        this.f546994h = yt3.f1.f546972e;
        viewGroup.setVisibility(4);
        view.findViewById(com.p314xaae8f345.mm.R.id.d6p);
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f81270x5ce8d8a2, -1));
        imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79887x15f6a8c3, -1));
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (this.f546994h != yt3.f1.f546971d) {
            return false;
        }
        ju3.d0.k(this.f546991e, ju3.c0.R1, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f546993g;
        android.view.ViewGroup viewGroup2 = this.f546992f;
        ju3.d0 d0Var = this.f546991e;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmt) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.R1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmv) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.S1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565522cn1) {
            ju3.d0.k(d0Var, ju3.c0.U1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmz) {
            ju3.d0.k(d0Var, ju3.c0.T1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f546990d.setVisibility(i17);
    }
}
