package ni2;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f418831h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f418832i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f418833m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f418834n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, yz5.a agreeBlock) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreeBlock, "agreeBlock");
        this.f418831h = agreeBlock;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570486ds3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.r4d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f418832i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.b5d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f418833m = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.enh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f418834n = textView;
        com.p314xaae8f345.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f418833m;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f418832i;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
            throw null;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f418833m;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        textView4.setOnClickListener(new ni2.a(this));
        android.widget.TextView textView5 = this.f418832i;
        if (textView5 != null) {
            textView5.setOnClickListener(new ni2.b(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("okBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        android.widget.TextView textView = this.f418834n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lisenceTv");
            throw null;
        }
        java.lang.String string = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string.concat(string2));
        spannableString.setSpan(new ni2.f(this), string.length(), string.length() + string2.length(), 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }
}
