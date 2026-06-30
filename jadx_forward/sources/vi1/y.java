package vi1;

/* loaded from: classes7.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f519035d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f519036e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f519037f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f519038g;

    public y(android.content.Context context, java.util.ArrayList phoneItems, yz5.l onPhoneItemRemove) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItems, "phoneItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onPhoneItemRemove, "onPhoneItemRemove");
        this.f519035d = context;
        this.f519036e = phoneItems;
        this.f519037f = onPhoneItemRemove;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f519036e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vi1.x holder = (vi1.x) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f519036e.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) obj;
        holder.f519024f.setText(c12542x3a17e581.f168933e);
        boolean z17 = c12542x3a17e581.f168939n;
        vi1.y yVar = holder.f519022d;
        android.widget.TextView textView = holder.f519025g;
        if (z17) {
            textView.setText(yVar.f519035d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3x));
        } else {
            textView.setText("");
        }
        boolean z18 = yVar.f519038g;
        android.widget.ImageView imageView = holder.f519023e;
        if (!z18 || c12542x3a17e581.f168939n) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new vi1.w(holder, c12542x3a17e581));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569595ft, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new vi1.x(this, inflate);
    }
}
