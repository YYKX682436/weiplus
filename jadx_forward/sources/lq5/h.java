package lq5;

/* loaded from: classes3.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f402007d;

    /* renamed from: e, reason: collision with root package name */
    public final int f402008e;

    /* renamed from: f, reason: collision with root package name */
    public final int f402009f;

    /* renamed from: g, reason: collision with root package name */
    public final int f402010g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f402011h;

    /* renamed from: i, reason: collision with root package name */
    public final float f402012i;

    /* renamed from: m, reason: collision with root package name */
    public int f402013m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f402014n;

    public h(java.util.List array, int i17, int i18, int i19, boolean z17, float f17, int i27, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(array, "array");
        this.f402007d = array;
        this.f402008e = i17;
        this.f402009f = i18;
        this.f402010g = i19;
        this.f402011h = z17;
        this.f402012i = f17;
        this.f402013m = i27;
        this.f402014n = lVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return (this.f402007d.size() + this.f402008e) - 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) view;
        int i18 = this.f402008e;
        java.lang.CharSequence charSequence = "";
        if (!(i17 >= 0 && i17 < i18 / 2)) {
            if (!(i17 < mo1894x7e414b06() && mo1894x7e414b06() - (i18 / 2) <= i17)) {
                charSequence = (java.lang.CharSequence) this.f402007d.get(i17 - (i18 / 2));
            }
        }
        textView.setText(charSequence);
        holder.f3639x46306858.setOnClickListener(new lq5.f(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p2816xed9644dc.p2817x373aa5.C22937xcdd26040 c22937xcdd26040 = new com.p314xaae8f345.mm.p2816xed9644dc.p2817x373aa5.C22937xcdd26040(context, null, 0, 6, null);
        c22937xcdd26040.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, this.f402013m));
        c22937xcdd26040.setGravity(17);
        int i18 = this.f402010g;
        c22937xcdd26040.setTextColor(i18);
        c22937xcdd26040.setTextSize(0, this.f402012i);
        c22937xcdd26040.m83494x4cc3e24c(this.f402009f);
        c22937xcdd26040.m83493x3493d1a8(i18);
        c22937xcdd26040.m83495x5c3839ac(this.f402011h);
        return new lq5.g(c22937xcdd26040);
    }
}
