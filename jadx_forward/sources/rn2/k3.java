package rn2;

/* loaded from: classes3.dex */
public final class k3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f479320d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f479321e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f479322f;

    public k3(boolean z17, boolean z18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f479320d = z17;
        this.f479321e = z18;
        this.f479322f = jz5.h.b(rn2.j3.f479308d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return x().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        rn2.i3 holder = (rn2.i3) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.String m75945x2fec8307 = ((rn2.y2) x().get(i17)).f479462d.m75945x2fec8307(2);
        int m75939xb282bd08 = ((rn2.y2) x().get(i17)).f479461c.m75939xb282bd08(1);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        android.widget.ImageView imageView = holder.f479301d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        android.content.res.Resources resources = holder.f3639x46306858.getContext().getResources();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m75939xb282bd08);
        sb6.append(' ');
        java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573175lj3, sb6.toString());
        android.widget.TextView textView = holder.f479302e;
        textView.setText(string);
        if (this.f479320d) {
            textView.setTextColor(android.graphics.Color.parseColor("#e5000000"));
        }
        zl2.r4.f555483a.b3(textView);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        android.view.View inflate;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (this.f479321e) {
            inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e_0, null);
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.a(parent.getContext(), 8.0f));
            }
        } else {
            inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.dej, null);
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.a(parent.getContext(), 8.0f));
            }
        }
        return new rn2.i3(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f479322f).mo141623x754a37bb();
    }
}
