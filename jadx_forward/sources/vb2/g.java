package vb2;

/* loaded from: classes10.dex */
public final class g implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 f516138a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f516139b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f516140c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f516141d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f516142e;

    public g(com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec16583, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.widget.TextView textView, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec165832, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        this.f516138a = c22814x6ec16583;
        this.f516139b = c1163xf1deaba4;
        this.f516140c = textView;
        this.f516141d = c22627xa933f8e4;
        this.f516142e = c22801x87cbdc00;
    }

    public static vb2.g a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.ciw;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(view, com.p314xaae8f345.mm.R.id.ciw);
        if (c1163xf1deaba4 != null) {
            i17 = com.p314xaae8f345.mm.R.id.dft;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.dft);
            if (textView != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec16583 = (com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583) view;
                i17 = com.p314xaae8f345.mm.R.id.ilq;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) x4.b.a(view, com.p314xaae8f345.mm.R.id.ilq);
                if (c22627xa933f8e4 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.m6e;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(view, com.p314xaae8f345.mm.R.id.m6e);
                    if (c22801x87cbdc00 != null) {
                        return new vb2.g(c22814x6ec16583, c1163xf1deaba4, textView, c22814x6ec16583, c22627xa933f8e4, c22801x87cbdc00);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516138a;
    }
}
