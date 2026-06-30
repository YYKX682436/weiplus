package fh2;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f344181h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f344182i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f344183m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f344184n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f344185o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f344186p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f344187q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, gk2.e buContext, yz5.a closeClick, yz5.a windowClose) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeClick, "closeClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowClose, "windowClose");
        this.f344181h = buContext;
        this.f344182i = closeClick;
        this.f344183m = windowClose;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqb;
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
        this.f344184n = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f344185o = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f569269sa3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f344186p = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.chx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f344187q = (android.widget.TextView) findViewById4;
        android.view.View view = this.f344184n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stopCloseBtn");
            throw null;
        }
        view.setOnClickListener(new fh2.d(this));
        android.view.View view2 = this.f344185o;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        view2.setOnClickListener(new fh2.e(this));
        android.view.View view3 = this.f344186p;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("windowCloseBtn");
            throw null;
        }
        view3.setOnClickListener(new fh2.f(this));
        android.widget.TextView textView = this.f344187q;
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
        gk2.e eVar = this.f344181h;
        boolean S6 = ((om2.g) eVar.a(om2.g.class)).S6();
        android.content.Context context = this.f199914d;
        if (S6) {
            android.widget.TextView textView = this.f344187q;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentText");
                throw null;
            }
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjp));
            y(1);
            return;
        }
        if (((om2.g) eVar.a(om2.g.class)).f427849w <= 0) {
            a();
            return;
        }
        android.widget.TextView textView2 = this.f344187q;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentText");
            throw null;
        }
        textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mj9, java.lang.Integer.valueOf(((om2.g) eVar.a(om2.g.class)).f427849w)));
        y(1);
    }

    public final void y(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        gk2.e eVar = this.f344181h;
        jSONObject.put("style", ((om2.g) eVar.a(om2.g.class)).S6() ? 3 : ((om2.g) eVar.a(om2.g.class)).f427849w > 0 ? 2 : 0);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.X2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
