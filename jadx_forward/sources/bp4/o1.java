package bp4;

/* loaded from: classes5.dex */
public final class o1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104840f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f104841g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104842h;

    /* renamed from: i, reason: collision with root package name */
    public int f104843i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104840f = parent;
        this.f104841g = parent.getContext();
        this.f104842h = jz5.h.b(new bp4.n1(this));
        this.f104843i = -1;
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.jgg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        z((android.view.ViewGroup) findViewById, com.p314xaae8f345.mm.R.raw.f79694xc84cada8, com.p314xaae8f345.mm.R.C30867xcad56011.ctr);
        android.view.View findViewById2 = parent.findViewById(com.p314xaae8f345.mm.R.id.jgo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        z((android.view.ViewGroup) findViewById2, com.p314xaae8f345.mm.R.raw.f79915x64991f25, com.p314xaae8f345.mm.R.C30867xcad56011.cts);
        android.view.View findViewById3 = parent.findViewById(com.p314xaae8f345.mm.R.id.jhh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        z((android.view.ViewGroup) findViewById3, com.p314xaae8f345.mm.R.raw.f79922xc8543845, com.p314xaae8f345.mm.R.C30867xcad56011.ctu);
        android.view.View findViewById4 = parent.findViewById(com.p314xaae8f345.mm.R.id.jhg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        z((android.view.ViewGroup) findViewById4, com.p314xaae8f345.mm.R.raw.f79991x7898ebda, com.p314xaae8f345.mm.R.C30867xcad56011.ctt);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        ju3.d0 d0Var = this.f546865d;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jgg) {
            ju3.c0 c0Var = ju3.c0.f383416j2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_VLOG_SELECT_TRACK", this.f104843i);
            d0Var.w(c0Var, bundle);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jgo) {
            ju3.d0.k(d0Var, ju3.c0.I, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jhh) {
            ju3.d0.k(d0Var, ju3.c0.K, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.jhg) {
            ju3.d0.k(d0Var, ju3.c0.f383421m2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f104843i = -1;
        mo9067x901b6914(4);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        ((android.view.ViewGroup) ((jz5.n) this.f104842h).mo141623x754a37bb()).setVisibility(i17);
    }

    public final void z(android.view.ViewGroup viewGroup, int i17, int i18) {
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.content.Context context = this.f104841g;
        textView.setText(i65.a.r(context, i18));
        ((android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.h5n)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, i17, -1));
        viewGroup.setOnClickListener(this);
    }
}
