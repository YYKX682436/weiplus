package bm2;

/* loaded from: classes3.dex */
public final class p2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f103752d = new java.util.LinkedList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103752d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.n2 holder = (bm2.n2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f103752d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.uk6 uk6Var = (r45.uk6) obj;
        holder.f103658d.setText(uk6Var.m75945x2fec8307(0));
        holder.f103659e.setText(uk6Var.m75945x2fec8307(1));
        int m75939xb282bd08 = (uk6Var.m75939xb282bd08(3) * uk6Var.m75939xb282bd08(6)) / uk6Var.m75939xb282bd08(4);
        int m75939xb282bd082 = uk6Var.m75939xb282bd08(6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m75939xb282bd08);
        sb6.append('/');
        sb6.append(m75939xb282bd082);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(sb6.toString());
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        if (uk6Var.m75939xb282bd08(3) == uk6Var.m75939xb282bd08(4)) {
            f0Var.c(foregroundColorSpan, 0, f0Var.length(), 17);
        } else {
            f0Var.c(foregroundColorSpan, 0, java.lang.String.valueOf(m75939xb282bd08).length(), 17);
        }
        holder.f103660f.setText(f0Var);
        holder.f3639x46306858.setOnClickListener(new bm2.o2(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqn, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.n2(this, inflate);
    }
}
