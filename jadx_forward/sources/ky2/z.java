package ky2;

/* loaded from: classes.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f395136d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f395137e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f395136d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ky2.x holder = (ky2.x) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String string = holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejq);
        java.util.ArrayList arrayList = this.f395136d;
        holder.f395132d.setText(k35.m1.g(string, ((r45.me2) arrayList.get(i17)).m75939xb282bd08(6) * 1000));
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = ((r45.me2) arrayList.get(i17)).m75945x2fec8307(1);
        android.widget.TextView textView = holder.f395133e;
        textView.setText(m75945x2fec8307);
        java.lang.CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView.setText(holder.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ejo, ((r45.me2) arrayList.get(i17)).m75945x2fec8307(12)));
        }
        holder.f3639x46306858.setOnClickListener(new ky2.y(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b1q, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new ky2.x(this, inflate);
    }
}
