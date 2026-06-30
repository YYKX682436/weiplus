package zo1;

/* loaded from: classes5.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: f, reason: collision with root package name */
    public int f556339f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f556340g;

    /* renamed from: d, reason: collision with root package name */
    public final fo1.h f556337d = new fo1.h();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f556338e = kz5.p0.f395529d;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f556341h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f556342i = new java.util.HashMap();

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f556338e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.CharSequence a17;
        wo1.b1 holder = (wo1.b1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        zo1.s sVar = (zo1.s) this.f556338e.get(i17);
        android.widget.CheckBox checkBox = holder.f529438d;
        checkBox.setVisibility(0);
        checkBox.setChecked(sVar.f556295c);
        com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w wVar = (com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = holder.f529439e;
        java.lang.String str = sVar.f556293a;
        wVar.Ai(imageView, str, null);
        android.widget.TextView textView = holder.f529440f;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fo1.h hVar = this.f556337d;
        boolean c17 = hVar.c(str);
        oo1.g gVar = oo1.g.f428676a;
        if (c17) {
            java.util.HashMap hashMap = this.f556342i;
            a17 = (java.lang.CharSequence) hashMap.get(str);
            if (a17 == null) {
                a17 = gVar.a(context, str);
                hashMap.put(str, a17);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        } else {
            hVar.b(str, new zo1.t(this, str, context));
            a17 = gVar.a(context, str);
        }
        textView.setText(a17);
        holder.f529441g.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.S1(sVar.f556294b));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.en9, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        wo1.b1 b1Var = new wo1.b1(inflate);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = b1Var.f529442h;
        c22699x3dcdb352.setVisibility(8);
        b1Var.f529441g.setVisibility(0);
        b1Var.f3639x46306858.setOnClickListener(new zo1.u(b1Var, this));
        c22699x3dcdb352.setOnClickListener(zo1.v.f556321d);
        return b1Var;
    }

    public final boolean x() {
        return this.f556339f == this.f556338e.size();
    }
}
