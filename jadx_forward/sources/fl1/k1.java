package fl1;

/* loaded from: classes7.dex */
public final class k1 extends fl1.p1 {

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f345331g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f345332h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1(android.view.ViewGroup r4, java.util.List r5, fl1.r1 r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "items"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "itemAdapter"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131493109(0x7f0c00f5, float:1.8609689E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "inflate(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            r3.<init>(r4, r5, r6)
            android.view.View r4 = r3.f345375d
            r5 = 2131322954(0x7f09684a, float:1.8264574E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f345331g = r4
            android.view.View r4 = r3.f345375d
            r6 = 2131319776(0x7f095be0, float:1.8258128E38)
            android.view.View r4 = r4.findViewById(r6)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f345332h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.k1.<init>(android.view.ViewGroup, java.util.List, fl1.r1):void");
    }

    @Override // fl1.p1
    public void i(fl1.h1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f345331g.setText(item.f345313b);
    }

    @Override // fl1.p1
    public void k(boolean z17) {
        android.widget.TextView textView = this.f345331g;
        android.widget.ImageView imageView = this.f345332h;
        if (z17) {
            textView.setContentDescription(textView.getText());
            imageView.setVisibility(0);
            imageView.setContentDescription(imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571833r5));
        } else {
            textView.setContentDescription(((java.lang.Object) textView.getText()) + ' ' + imageView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571835r7));
            imageView.setVisibility(4);
        }
    }
}
