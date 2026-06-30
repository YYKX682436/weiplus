package dl2;

/* loaded from: classes3.dex */
public final class p extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f316783d;

    public p(dl2.f0 f0Var) {
        this.f316783d = f0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f316783d.f316740k.f316755c.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        dl2.q holder = (dl2.q) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        dl2.f0 f0Var = this.f316783d;
        java.util.LinkedHashMap linkedHashMap = f0Var.f316749t;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = holder.f316785e;
        android.text.TextWatcher textWatcher = (android.text.TextWatcher) linkedHashMap.get(c22621x7603e017);
        if (textWatcher != null) {
            c22621x7603e017.removeTextChangedListener(textWatcher);
        }
        java.lang.Object obj = f0Var.f316740k.f316755c.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dl2.f fVar = (dl2.f) obj;
        boolean z17 = fVar.f316728a;
        java.util.LinkedHashMap linkedHashMap2 = f0Var.f316743n;
        r45.n30 n30Var = fVar.f316729b;
        r45.kv1 kv1Var = (r45.kv1) linkedHashMap2.get(n30Var.m75945x2fec8307(0));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(kv1Var != null ? kv1Var.m75945x2fec8307(2) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        android.widget.ImageView imageView = holder.f316784d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f316787g.setText(java.lang.String.valueOf(kv1Var != null ? java.lang.Integer.valueOf((int) kv1Var.m75938x746dc8a6(9)) : null));
        c22621x7603e017.setText(java.lang.String.valueOf(n30Var.m75939xb282bd08(1)), android.widget.TextView.BufferType.EDITABLE);
        android.widget.TextView textView = holder.f316786f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-giftNameTv>(...)");
        com.p314xaae8f345.mm.ui.fk.a(textView);
        if (kv1Var == null || (str = kv1Var.m75945x2fec8307(8)) == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.CheckBox checkBox = holder.f316788h;
        checkBox.setChecked(z17);
        checkBox.setOnClickListener(new dl2.k(holder, n30Var, f0Var, fVar));
        c22621x7603e017.mo81583x7e4f2d39((android.text.InputFilter[]) ((jz5.n) f0Var.f316750u).mo141623x754a37bb());
        dl2.o oVar = new dl2.o(fVar, f0Var);
        f0Var.f316749t.put(c22621x7603e017, oVar);
        c22621x7603e017.addTextChangedListener(oVar);
        c22621x7603e017.setTag(java.lang.Integer.valueOf(i17));
        c22621x7603e017.setOnFocusChangeListener(new dl2.l(f0Var));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = holder.f316791n;
        c22699x3dcdb352.clearColorFilter();
        if (n30Var.m75939xb282bd08(1) == 0) {
            c22699x3dcdb352.setAlpha(0.3f);
        } else {
            c22699x3dcdb352.setAlpha(1.0f);
        }
        holder.f316789i.setOnClickListener(new dl2.m(n30Var, f0Var, holder, fVar));
        holder.f316790m.setOnClickListener(new dl2.n(n30Var, f0Var, holder, fVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570432as0, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new dl2.q(inflate);
    }
}
