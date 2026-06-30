package bl2;

/* loaded from: classes3.dex */
public final class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 f103236h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f103237i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f103238m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f103239n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f103240o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 abstractC14196xf9d9d703) {
        super(context, false, zl2.u4.f555521d, false, 8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f103236h = abstractC14196xf9d9d703;
        this.f103240o = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dns;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.r9_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f103238m = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.r5_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f103237i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.r5e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f103239n = (android.widget.TextView) findViewById3;
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
        android.widget.TextView textView = this.f103238m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f103238m;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tvTitle");
            throw null;
        }
        textView2.setText(this.f103240o);
        android.view.View view = this.f103237i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnGoToWrite");
            throw null;
        }
        view.setOnClickListener(new bl2.d(this));
        android.widget.TextView textView3 = this.f103239n;
        if (textView3 != null) {
            textView3.setOnClickListener(new bl2.e(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btnStartLive");
            throw null;
        }
    }
}
