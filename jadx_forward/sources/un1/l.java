package un1;

/* loaded from: classes5.dex */
public final class l extends s35.b implements io1.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f510983m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f510984n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f510985o;

    /* renamed from: p, reason: collision with root package name */
    public long f510986p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f510983m = "MM.Roam.RoamLiteBanner";
        this.f510986p = -1L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.b(this);
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        pm0.v.X(new un1.j(this, task));
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        pm0.v.X(new un1.k(this, task, state, error));
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.p(this);
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569707jk;
    }

    @Override // s35.b
    public int c() {
        return 3;
    }

    @Override // s35.b
    public void h(android.view.View innerBannerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(innerBannerView, "innerBannerView");
        android.view.View findViewById = innerBannerView.findViewById(com.p314xaae8f345.mm.R.id.ac6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f510985o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = innerBannerView.findViewById(com.p314xaae8f345.mm.R.id.ac7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f510984n = (android.widget.TextView) findViewById2;
        innerBannerView.setOnClickListener(new un1.i(this));
    }
}
