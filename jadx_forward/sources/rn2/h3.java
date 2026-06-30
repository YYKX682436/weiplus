package rn2;

/* loaded from: classes15.dex */
public final class h3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f479292e;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f479291d = jz5.h.b(rn2.a3.f479176d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f479293f = jz5.h.b(rn2.c3.f479218d);

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return x().size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        rn2.z2 holder = (rn2.z2) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = x().get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        rn2.y2 y2Var = (rn2.y2) obj;
        boolean z17 = y2Var.f479459a;
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        r45.kv1 kv1Var = y2Var.f479462d;
        wo0.c a17 = d1Var.a(new mn2.q3(kv1Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        android.widget.ImageView imageView = holder.f479468d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f479471g.setText(java.lang.String.valueOf((int) kv1Var.m75938x746dc8a6(9)));
        r45.n30 n30Var = y2Var.f479461c;
        java.lang.String valueOf = java.lang.String.valueOf(n30Var.m75939xb282bd08(1));
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.EDITABLE;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = holder.f479469e;
        c22621x7603e017.setText(valueOf, bufferType);
        android.widget.TextView textView = holder.f479470f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-giftNameTv>(...)");
        com.p314xaae8f345.mm.ui.fk.a(textView);
        java.lang.String m75945x2fec8307 = kv1Var.m75945x2fec8307(8);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        textView.setText(m75945x2fec8307);
        android.widget.CheckBox checkBox = holder.f479472h;
        checkBox.setChecked(z17);
        checkBox.setOnClickListener(new rn2.d3(holder, n30Var, this, y2Var));
        c22621x7603e017.mo81583x7e4f2d39((android.text.InputFilter[]) ((jz5.n) this.f479293f).mo141623x754a37bb());
        c22621x7603e017.setTag(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f479475n;
        c22699x3dcdb352.clearColorFilter();
        if (n30Var.m75939xb282bd08(1) == 0) {
            c22699x3dcdb352.setAlpha(0.3f);
        } else {
            c22699x3dcdb352.setAlpha(1.0f);
        }
        holder.f479473i.setOnClickListener(new rn2.e3(n30Var, holder, y2Var, this));
        holder.f479474m.setOnClickListener(new rn2.f3(n30Var, holder, y2Var, this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570432as0, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        rn2.z2 z2Var = new rn2.z2(inflate);
        z2Var.f479469e.addTextChangedListener(new rn2.g3(this, z2Var));
        return z2Var;
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f479291d).mo141623x754a37bb();
    }
}
