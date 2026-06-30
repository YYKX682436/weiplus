package bl2;

/* loaded from: classes3.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub f103230h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f103231i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f103232m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f103233n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar) {
        super(context, context.getResources().getConfiguration().orientation == 2, zl2.u4.f555521d, false, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f103230h = ubVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dlf;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.oqh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f103232m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b0n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f103231i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.qxe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f103233n = (android.widget.TextView) findViewById3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void s() {
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        a();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        android.widget.TextView textView = this.f103232m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.view.View view = this.f103231i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnIKnow");
            throw null;
        }
        view.setOnClickListener(new bl2.a(this));
        android.widget.TextView textView2 = this.f103233n;
        if (textView2 != null) {
            textView2.setOnClickListener(new bl2.b(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvGoSettings");
            throw null;
        }
    }
}
