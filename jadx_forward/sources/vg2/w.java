package vg2;

/* loaded from: classes3.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f518144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f518145e;

    public w(vg2.a0 a0Var, java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f518145e = a0Var;
        this.f518144d = itemList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f518144d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vg2.u holder = (vg2.u) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = holder.f518125d;
        x(textView);
        android.widget.TextView textView2 = holder.f518126e;
        x(textView2);
        java.util.List list = this.f518144d;
        textView2.setTextSize(list.size() > 5 ? 15.0f : 17.0f);
        textView.setTextSize(list.size() <= 5 ? 17.0f : 15.0f);
        textView2.setText(java.lang.String.valueOf(((r45.pv1) list.get(i17)).m75939xb282bd08(0)));
        holder.f3639x46306858.setOnClickListener(new vg2.v(this.f518145e, this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f518145e.f517998a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.as6, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new vg2.u(this, inflate);
    }

    public final void x(android.widget.TextView textView) {
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(this.f518145e.f517998a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GiftBatchSelectToastWidget", "setLiveGiftTypeFace error", e17);
        }
    }
}
