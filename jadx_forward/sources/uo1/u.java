package uo1;

/* loaded from: classes5.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k f511123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f511124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f511125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511126h;

    public u(po1.d dVar, qo1.f0 f0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f511124f = dVar;
        this.f511125g = f0Var;
        this.f511126h = y1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570245dq3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s8y)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfj);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.riz);
        button.setOnClickListener(new uo1.q(this.f511124f, this.f511125g, this, this.f511126h));
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        jz5.l a17 = c12844xf7745c1a.a();
        button.setEnabled(a17.f384366d != null && ((java.lang.Boolean) a17.f384367e).booleanValue());
        uo1.s sVar = new uo1.s(button);
        this.f511123e = sVar;
        c12844xf7745c1a.d(sVar);
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cyy)).setOnClickListener(new uo1.t(this));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k kVar = this.f511123e;
        if (kVar != null) {
            c12844xf7745c1a.f(kVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accessoryListener");
            throw null;
        }
    }
}
