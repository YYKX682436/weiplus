package fl1;

/* loaded from: classes7.dex */
public final class m1 extends fl1.p1 {

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f345338g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f345339h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f345340i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f345341m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m1(android.view.ViewGroup r4, java.util.List r5, fl1.r1 r6) {
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
            r1 = 2131493177(0x7f0c0139, float:1.8609827E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "inflate(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            r3.<init>(r4, r5, r6)
            android.view.View r4 = r3.f345375d
            r5 = 2131310280(0x7f0936c8, float:1.8238868E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f345338g = r4
            android.view.View r4 = r3.f345375d
            r6 = 2131322954(0x7f09684a, float:1.8264574E38)
            android.view.View r4 = r4.findViewById(r6)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f345339h = r4
            android.view.View r4 = r3.f345375d
            r6 = 2131321886(0x7f09641e, float:1.8262407E38)
            android.view.View r4 = r4.findViewById(r6)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f345340i = r4
            android.view.View r6 = r3.f345375d
            r0 = 2131319776(0x7f095be0, float:1.8258128E38)
            android.view.View r6 = r6.findViewById(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r3.f345341m = r6
            android.view.View r5 = r3.f345375d
            r6 = 1
            r5.setImportantForAccessibility(r6)
            r5 = 2
            r4.setImportantForAccessibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.m1.<init>(android.view.ViewGroup, java.util.List, fl1.r1):void");
    }

    @Override // fl1.p1
    public void i(fl1.h1 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.graphics.drawable.Drawable S7 = bf.g.a().S7();
        android.widget.ImageView imageView = this.f345338g;
        if (S7 != null) {
            imageView.setImageDrawable(S7);
        } else {
            S7 = null;
        }
        if (S7 == null) {
            imageView.setImageDrawable(null);
        }
        kl1.h hVar = (kl1.h) i95.n0.c(kl1.h.class);
        if (hVar == null) {
            hVar = kl1.b.f390276a;
        }
        android.widget.TextView textView = this.f345339h;
        java.lang.CharSequence S9 = hVar.S9(textView.getContext(), item.f345313b, textView.getTextSize());
        if (S9 == null) {
            S9 = "";
        }
        textView.setText(S9);
        boolean isEmpty = android.text.TextUtils.isEmpty(item.f345314c);
        android.widget.TextView textView2 = this.f345340i;
        if (isEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            java.lang.String str = item.f345314c;
            textView2.setText(str != null ? str : "");
        }
        android.graphics.Bitmap bitmap = item.f345316e;
        if (bitmap == null) {
            if (item.f345318g.length() > 0) {
                l01.d0.f396294a.b(imageView, item.f345318g, null, new fl1.l1(this));
                return;
            }
            return;
        }
        android.graphics.Bitmap t07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, false, i65.a.b(this.f345375d.getContext(), 4) * 1.0f, false, null);
        if (t07 != null) {
            imageView.setImageBitmap(t07);
            return;
        }
        android.graphics.drawable.Drawable S72 = bf.g.a().S7();
        if (S72 != null) {
            imageView.setImageDrawable(S72);
        } else {
            S72 = null;
        }
        if (S72 == null) {
            imageView.setImageDrawable(null);
        }
    }

    @Override // fl1.p1
    public void k(boolean z17) {
        android.widget.TextView textView = this.f345339h;
        android.widget.ImageView imageView = this.f345341m;
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
