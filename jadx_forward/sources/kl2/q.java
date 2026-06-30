package kl2;

/* loaded from: classes3.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final jl2.a f390337h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f390338i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f390339m;

    /* renamed from: n, reason: collision with root package name */
    public long f390340n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f390341o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f390342p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context, jl2.a service) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f390337h = service;
        this.f390341o = "";
        this.f390342p = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dst;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.odb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f390338i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rtr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f390339m = (android.widget.TextView) findViewById2;
        android.widget.TextView textView = this.f390338i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f390339m;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f390339m;
        if (textView3 != null) {
            textView3.setOnClickListener(new kl2.p(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnText");
            throw null;
        }
    }
}
