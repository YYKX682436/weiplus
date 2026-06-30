package te2;

/* loaded from: classes.dex */
public final class t implements te2.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499948d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499949e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f499950f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f499951g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f499952h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f499953i;

    public t(android.view.View root, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499948d = root;
        this.f499949e = activity;
        this.f499950f = root.findViewById(com.p314xaae8f345.mm.R.id.hwy);
        this.f499951g = root.findViewById(com.p314xaae8f345.mm.R.id.hvh);
        this.f499952h = root.findViewById(com.p314xaae8f345.mm.R.id.hyx);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.bys);
        if (imageView != null) {
            imageView.setOnClickListener(new te2.s(this));
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499949e;
    }
}
