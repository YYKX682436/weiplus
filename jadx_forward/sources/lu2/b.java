package lu2;

/* loaded from: classes3.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f402896d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.DialogInterface.OnClickListener f402897e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface f402898f;

    public b(java.util.List dataList, android.content.DialogInterface.OnClickListener onClickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f402896d = dataList;
        this.f402897e = onClickListener;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f402896d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        lu2.c holder = (lu2.c) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = holder.f402899d;
        if (textView != null) {
            textView.setText((java.lang.CharSequence) this.f402896d.get(i17));
        }
        holder.f3639x46306858.setOnClickListener(new lu2.a(this, holder, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a3m, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new lu2.c(inflate);
    }
}
