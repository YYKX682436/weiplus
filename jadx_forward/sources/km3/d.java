package km3;

/* loaded from: classes10.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final km3.c f390772d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f390773e;

    public d(km3.c itemClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemClickListener, "itemClickListener");
        this.f390772d = itemClickListener;
        this.f390773e = new java.util.ArrayList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f390773e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        km3.b holder = (km3.b) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f390773e;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) arrayList.get(i17);
        android.widget.TextView textView = holder.f390771d;
        textView.setText(charSequence);
        textView.setContentDescription((java.lang.CharSequence) arrayList.get(i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c4h, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new km3.b(this, inflate);
    }

    public final void x(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = this.f390773e;
        arrayList.clear();
        arrayList.addAll(list);
        m8146xced61ae5();
    }
}
