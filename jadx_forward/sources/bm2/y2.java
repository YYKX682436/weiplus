package bm2;

/* loaded from: classes3.dex */
public final class y2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f103979d = new java.util.LinkedList();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103979d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.x2 holder = (bm2.x2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f103979d;
        java.lang.Object obj = linkedList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.x22 x22Var = (r45.x22) obj;
        java.lang.String string = holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lub, java.lang.Integer.valueOf(x22Var.m75939xb282bd08(3)));
        android.widget.TextView textView = holder.f103959d;
        textView.setText(string);
        textView.setVisibility((i17 < 1 || ((r45.x22) linkedList.get(i17 - 1)).m75939xb282bd08(3) != x22Var.m75939xb282bd08(3)) ? 0 : 4);
        holder.f103961f.setText(x22Var.m75945x2fec8307(1));
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(x22Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        android.widget.ImageView imageView = holder.f103960e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-rightIv>(...)");
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f411498s));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqm, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new bm2.x2(this, inflate);
    }
}
