package ni2;

/* loaded from: classes10.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f418883h;

    /* renamed from: i, reason: collision with root package name */
    public final lj2.x0 f418884i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f418885m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f418886n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f418887o;

    /* renamed from: p, reason: collision with root package name */
    public xh2.a f418888p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f418889q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.p f418890r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f418883h = buContext;
        this.f418884i = server;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f418885m = hashMap;
        this.f418886n = new java.util.HashMap();
        this.f418887o = new java.util.HashMap();
        ni2.i0 i0Var = new ni2.i0(this, context);
        this.f418890r = i0Var;
        android.view.View view = this.f418889q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.qtz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        hashMap.put(1, new ij2.c(findViewById, i0Var));
        android.view.View view2 = this.f418889q;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.qub);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById2;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            this.f418885m.put(java.lang.Integer.valueOf(i17 + 2), new ij2.c(viewGroup.getChildAt(i17), this.f418890r));
        }
        android.view.View view3 = this.f418889q;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view3.findViewById(com.p314xaae8f345.mm.R.id.quc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById3;
        int childCount2 = viewGroup2.getChildCount();
        for (int i18 = 0; i18 < childCount2; i18++) {
            this.f418885m.put(java.lang.Integer.valueOf(i18 + 6), new ij2.c(viewGroup2.getChildAt(i18), this.f418890r));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        return f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570472dl3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f418889q = rootView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        p3325xe03a0797.p3326xc267989b.y0 a17 = this.f418884i.a();
        if (a17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new ni2.j0(this, null), 3, null);
        }
    }
}
