package nc5;

/* loaded from: classes.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f417761d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f417762e;

    public r(java.util.ArrayList sugList, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sugList, "sugList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f417761d = sugList;
        this.f417762e = callback;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f417761d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        nc5.p holder = (nc5.p) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f417761d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        holder.f417758d.setText((java.lang.CharSequence) ((android.util.Pair) obj).first);
        holder.f3639x46306858.setOnClickListener(new nc5.q(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bme, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new nc5.p(inflate);
    }
}
