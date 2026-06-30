package qx2;

/* loaded from: classes2.dex */
public final class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f448865d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f448866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void a(android.widget.TextView textView, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!(str2.length() == 0)) {
            if (!(str3.length() == 0)) {
                int L = r26.n0.L(str, str2, 0, false, 6, null);
                int length = str2.length() + L;
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new qx2.d(str3, this), L, length, 33);
                textView.setHighlightColor(getContext().getResources().getColor(android.R.color.transparent));
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                textView.setText(spannableString);
                return;
            }
        }
        textView.setText(str);
    }

    public final java.lang.Object b(qx2.a aVar, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.widget.TextView textView;
        android.widget.Button button;
        android.widget.Button button2;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = nVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(getContext());
        y1Var.f293570s = new qx2.e(h0Var);
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        qx2.f fVar = new qx2.f(h0Var);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.akp, (android.view.ViewGroup) this, false);
        this.f448865d = inflate;
        if (inflate != null && (button2 = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.bfc)) != null) {
            button2.setOnClickListener(new qx2.b(this));
        }
        android.view.View view = this.f448865d;
        if (view != null && (button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.bfd)) != null) {
            button.setOnClickListener(new qx2.c(this, fVar));
        }
        android.view.View view2 = this.f448865d;
        if (view2 != null && (textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.bfi)) != null) {
            a(textView, aVar.f448855a, aVar.f448856b, aVar.f448857c);
        }
        android.view.View view3 = this.f448865d;
        android.widget.LinearLayout linearLayout = view3 != null ? (android.widget.LinearLayout) view3.findViewById(com.p314xaae8f345.mm.R.id.iix) : null;
        for (qx2.a aVar2 : list) {
            android.widget.TextView textView2 = new android.widget.TextView(getContext());
            textView2.setTextSize(15.0f);
            textView2.setPadding(0, ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8.0f), 0, 0);
            textView2.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            a(textView2, aVar2.f448855a, aVar2.f448856b, aVar2.f448857c);
            if (linearLayout != null) {
                linearLayout.addView(textView2);
            }
        }
        y1Var.k(this.f448865d);
        y1Var.s();
        this.f448866e = y1Var;
        java.lang.Object a17 = nVar.a();
        pz5.a aVar3 = pz5.a.f440719d;
        return a17;
    }

    /* renamed from: getRoot */
    public final android.view.View m161032xfb84e958() {
        return this.f448865d;
    }

    /* renamed from: setRoot */
    public final void m161033x764fb064(android.view.View view) {
        this.f448865d = view;
    }
}
