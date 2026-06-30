package cw2;

/* loaded from: classes10.dex */
public final class ab implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f305106d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f305107e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f305108f;

    /* renamed from: g, reason: collision with root package name */
    public final cw2.za f305109g;

    public ab(android.view.ViewGroup layout, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f305106d = status;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.cjo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f305107e = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = layout.findViewById(com.p314xaae8f345.mm.R.id.cju);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f305108f = (android.widget.TextView) findViewById2;
        this.f305109g = new cw2.za(this);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
    }
}
