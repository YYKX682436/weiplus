package sr2;

/* loaded from: classes5.dex */
public final class p5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f493207d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f493208e;

    public p5(java.util.List dataList, yz5.p onItemClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClick, "onItemClick");
        this.f493207d = dataList;
        this.f493208e = onItemClick;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f493207d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        sr2.q5 holder = (sr2.q5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.r03 r03Var = (r45.r03) this.f493207d.get(i17);
        java.lang.String str = "#" + r03Var.m75945x2fec8307(0);
        android.widget.TextView textView = holder.f493221d;
        if (textView != null) {
            textView.setText(str);
        }
        holder.f3639x46306858.setOnClickListener(new sr2.o5(this, r03Var, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570604b64, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new sr2.q5(inflate);
    }
}
