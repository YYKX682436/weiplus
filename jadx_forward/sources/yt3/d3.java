package yt3;

/* loaded from: classes10.dex */
public final class d3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f546938d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f546939e;

    /* renamed from: f, reason: collision with root package name */
    public final et0.q f546940f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f546941g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f546942h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f546943i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f546944m;

    public d3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view, ju3.d0 status, et0.q qVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546938d = view;
        this.f546939e = status;
        this.f546940f = qVar;
        this.f546942h = true;
        this.f546944m = true;
        view.setOnClickListener(new yt3.b3(this));
        if (z65.c.a()) {
            view.setOnLongClickListener(new yt3.c3(this));
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }

    public final void a(boolean z17) {
        nu3.i.f421751a.n("KEY_RECORD_IS_BEAUTIFY", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f546938d;
        c22699x3dcdb352.m82040x7541828(z17 ? c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0m) : -1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_BEAUTIFY_ENABLE", z17);
        this.f546939e.w(ju3.c0.f383438u, bundle);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f546941g) {
            this.f546938d.setVisibility(i17);
        }
    }
}
