package vg2;

/* loaded from: classes3.dex */
public final class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f518078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec f518079e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec, java.util.List itemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemList, "itemList");
        this.f518079e = c14224x1cce21ec;
        this.f518078d = itemList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f518078d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View view = holder.f3639x46306858;
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setText("x" + ((java.lang.String) this.f518078d.get(i17)));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec = this.f518079e;
            textView.setTextSize(1, c14224x1cce21ec.f193190f2);
            textView.setTextColor(-1);
            textView.setIncludeFontPadding(false);
            try {
                textView.setTypeface(android.graphics.Typeface.createFromAsset(c14224x1cce21ec.getContext().getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = this.f518079e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new vg2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234(context));
    }
}
