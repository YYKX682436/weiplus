package bm2;

/* loaded from: classes3.dex */
public final class f2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f103415d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f103416e;

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103415d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.c2 holder = (bm2.c2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f103415d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        bm2.b2 b2Var = (bm2.b2) obj;
        java.lang.String str = b2Var.f103319b.f391131c;
        if (str == null) {
            str = "";
        }
        android.widget.TextView textView = holder.f103341d;
        textView.setText(str);
        boolean m40093xb9aa8b5f = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.widget.TextView textView2 = holder.f103342e;
        if (m40093xb9aa8b5f && b2Var.f103319b.f391130b == 5) {
            holder.f3639x46306858.getLayoutParams().height = i65.a.f(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
            textView2.setVisibility(0);
        } else {
            holder.f3639x46306858.getLayoutParams().height = i65.a.f(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
            textView2.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof android.widget.RelativeLayout.LayoutParams)) {
                ((android.widget.RelativeLayout.LayoutParams) layoutParams).addRule(15, -1);
            }
        }
        boolean z17 = b2Var.f103321d;
        android.widget.ImageView imageView = holder.f103343f;
        if (z17) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        holder.f3639x46306858.setOnClickListener(new bm2.e2(b2Var, holder, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b0c, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.c2(this, inflate);
    }
}
