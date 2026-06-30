package na5;

/* loaded from: classes.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f417535d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f417536e;

    public g(java.util.List dataList, android.view.View.OnClickListener clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        this.f417535d = dataList;
        this.f417536e = clickListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f417535d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        na5.h holder = (na5.h) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String valueOf = java.lang.String.valueOf(((java.lang.Number) this.f417535d.get(i17)).intValue());
        android.widget.Button button = holder.f417538d;
        button.setText(valueOf);
        button.setOnClickListener(this.f417536e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569475c5, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new na5.h(inflate);
    }
}
