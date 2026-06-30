package ut2;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f512352a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h1 f512353b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f512354c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f512355d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f512356e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f512357f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f512358g;

    public a4(android.view.View root, st2.h1 shoppingListInternal) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingListInternal, "shoppingListInternal");
        this.f512352a = root;
        this.f512353b = shoppingListInternal;
        this.f512354c = root.findViewById(com.p314xaae8f345.mm.R.id.flj);
        this.f512355d = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.flk);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.f566343q43);
        this.f512356e = textView;
        android.widget.TextView textView2 = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.fli);
        d92.f fVar = d92.f.f309003a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        fVar.l(textView2, 17.0f, false);
        this.f512357f = textView2;
        this.f512358g = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.tor);
        textView2.setOnClickListener(new ut2.v3(this));
        textView.setOnClickListener(new ut2.w3(this));
        java.lang.String string = root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ak_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = root.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573369rv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(root.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5)), 0, spannableString.length(), 17);
        textView.setText(android.text.TextUtils.concat(string, spannableString));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShoppingPanelEmptyHolder", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public final void a(r45.dv1 shelf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shelf, "shelf");
        bw5.q30 q30Var = (bw5.q30) shelf.m75936x14adae67(41);
        if (q30Var == null) {
            return;
        }
        boolean[] zArr = q30Var.f113453g;
        java.lang.String str = zArr[1] ? q30Var.f113450d : "";
        android.text.SpannableString spannableString = new android.text.SpannableString(zArr[2] ? q30Var.f113451e : "");
        spannableString.setSpan(new ut2.x3(this), 0, spannableString.length(), 17);
        java.lang.CharSequence concat = android.text.TextUtils.concat(str, spannableString);
        android.widget.TextView textView = this.f512358g;
        textView.setText(concat);
        textView.setMovementMethod(new ut2.y3());
    }

    public final void b(boolean z17, boolean z18, boolean z19) {
        if (!z17) {
            android.view.View view = this.f512354c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f512354c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelEmptyHolder", "setVisible", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f512357f;
        android.widget.TextView textView2 = this.f512355d;
        if (!z18) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        android.widget.TextView textView3 = this.f512356e;
        if (z19) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
        } else {
            textView3.setVisibility(8);
            textView2.setVisibility(0);
        }
    }
}
