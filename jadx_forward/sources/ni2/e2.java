package ni2;

/* loaded from: classes3.dex */
public final class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f418816h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f418817i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f418818m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f418819n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f418820o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f418821p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.content.Context context, gk2.e buContext, yz5.a closeClick, yz5.a windowClose) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeClick, "closeClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowClose, "windowClose");
        this.f418816h = closeClick;
        this.f418817i = windowClose;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ec_;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.s7e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f418818m = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f418819n = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569269sa3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f418820o = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.chx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f418821p = (android.widget.TextView) findViewById4;
        android.view.View view = this.f418818m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stopCloseBtn");
            throw null;
        }
        view.setOnClickListener(new ni2.b2(this));
        android.view.View view2 = this.f418819n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        view2.setOnClickListener(new ni2.c2(this));
        android.view.View view3 = this.f418820o;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("windowCloseBtn");
            throw null;
        }
        view3.setOnClickListener(new ni2.d2(this));
        android.widget.TextView textView = this.f418821p;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        y(1);
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("style", 1);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.X2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
