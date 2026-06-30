package dg2;

/* loaded from: classes2.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f313821d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f313822e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f313823f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f313824g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f313825h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dg2.m f313826i;

    public e(dg2.m mVar, java.util.LinkedList optionList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(optionList, "optionList");
        this.f313826i = mVar;
        this.f313821d = optionList;
        this.f313822e = new java.util.LinkedList();
        this.f313823f = jz5.h.b(new dg2.b(mVar));
        this.f313824g = jz5.h.b(new dg2.a(mVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f313821d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        dg2.f holder = (dg2.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f313821d.get(i17);
        holder.f3639x46306858.setOnClickListener(new dg2.c(holder));
        android.widget.CheckBox checkBox = holder.f313827d;
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(new dg2.d(this, obj));
        android.view.View view = holder.f313829f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(i17 == mo1894x7e414b06() + (-1) ? ((java.lang.Number) ((jz5.n) this.f313824g).mo141623x754a37bb()).intValue() : ((java.lang.Number) ((jz5.n) this.f313823f).mo141623x754a37bb()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams = null;
        }
        view.setLayoutParams(marginLayoutParams);
        yz5.l lVar = this.f313826i.f313845g;
        holder.f313828e.setText(lVar != null ? (java.lang.String) lVar.mo146xb9724478(obj) : null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570421dh0, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new dg2.f(inflate);
    }
}
