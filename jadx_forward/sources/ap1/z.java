package ap1;

/* loaded from: classes5.dex */
public final class z extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f94301d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f94302e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f94303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ap1.i0 f94304g;

    public z(ap1.i0 i0Var, java.util.List items, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        this.f94304g = i0Var;
        this.f94301d = items;
        this.f94302e = z17;
        this.f94303f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(128);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f94301d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        ap1.c2 c2Var;
        ap1.b0 holder = (ap1.b0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ap1.a0 a0Var = (ap1.a0) this.f94301d.get(i17);
        ap1.i0 i0Var = this.f94304g;
        j75.f U6 = i0Var.U6();
        holder.f94139d.setChecked((U6 == null || (c2Var = (ap1.c2) U6.mo140437x75286adb()) == null) ? false : c2Var.d(a0Var.f94133a));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(holder.f94140e, a0Var.f94133a, null);
        android.widget.TextView textView = holder.f94141f;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f94303f;
        java.lang.String str = a0Var.f94133a;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) r2Var.get(str);
        if (charSequence == null) {
            charSequence = oo1.g.f428676a.a(context, str);
            r2Var.put(str, charSequence);
        }
        textView.setText(charSequence);
        if (this.f94302e) {
            holder.f94142g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(a0Var.f94135c));
        }
        i0Var.W6(a0Var, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.en9, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        ap1.b0 b0Var = new ap1.b0(inflate);
        b0Var.f94142g.setVisibility(this.f94302e ? 0 : 8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = b0Var.f94143h;
        c22699x3dcdb352.setVisibility(8);
        android.view.View view = b0Var.f3639x46306858;
        ap1.i0 i0Var = this.f94304g;
        view.setOnClickListener(new ap1.x(b0Var, i0Var, this));
        c22699x3dcdb352.setOnClickListener(new ap1.y(i0Var));
        return b0Var;
    }
}
