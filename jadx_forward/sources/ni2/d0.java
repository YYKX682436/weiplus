package ni2;

/* loaded from: classes3.dex */
public final class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f418802h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f418803i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.CheckBox f418804m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f418805n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f418806o;

    /* renamed from: p, reason: collision with root package name */
    public int f418807p;

    /* renamed from: q, reason: collision with root package name */
    public hi2.b f418808q;

    /* renamed from: r, reason: collision with root package name */
    public int f418809r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.content.Context context, qo0.c statusMonitor) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f418802h = statusMonitor;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.anr;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int n() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eng);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f418803i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.enc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f418804m = (android.widget.CheckBox) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.enf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f418805n = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.p314xaae8f345.mm.R.id.ene);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f418806o = findViewById4;
        findViewById4.setOnClickListener(new ni2.y(this));
        android.widget.CheckBox checkBox = this.f418804m;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new ni2.z(this));
        android.widget.TextView textView = this.f418803i;
        if (textView != null) {
            textView.setOnClickListener(new ni2.a0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public boolean r() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        qo0.c.a(this.f418802h, qo0.b.U3, null, 2, null);
    }
}
