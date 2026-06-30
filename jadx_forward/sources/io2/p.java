package io2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final io2.i f375024a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f375025b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f375026c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f375027d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ProgressBar f375028e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f375029f;

    /* renamed from: g, reason: collision with root package name */
    public final ym5.q1 f375030g;

    public p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, io2.i presenter, android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f375024a = presenter;
        this.f375025b = rootView;
        this.f375026c = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) rootView.findViewById(com.p314xaae8f345.mm.R.id.m6e);
        this.f375027d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f375028e = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        this.f375029f = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.dft);
        this.f375030g = new io2.o(this);
    }

    public final void a(boolean z17) {
        this.f375028e.setVisibility(z17 ? 0 : 8);
    }
}
