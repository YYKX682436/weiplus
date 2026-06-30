package el2;

/* loaded from: classes3.dex */
public final class u2 extends xt2.m6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f335454d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f335455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f335456f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f335457g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f335458h;

    public u2(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f335454d = root;
        this.f335455e = basePlugin;
        this.f335456f = "FinderLiveVisitorBottomFolderWidget";
        this.f335457g = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.rm6);
        this.f335458h = root.findViewById(com.p314xaae8f345.mm.R.id.f566165rm5);
        root.setOnClickListener(new el2.s2(this));
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f335458h;
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f335454d;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = this.f335457g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "imageView");
        return imageView;
    }
}
