package g63;

/* loaded from: classes8.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 f350654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025 activityC16045xfe36c025) {
        super(0);
        this.f350654d = activityC16045xfe36c025;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f350654d.findViewById(com.p314xaae8f345.mm.R.id.cg7);
        com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec16583 = (com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583) findViewById;
        int i17 = com.p314xaae8f345.mm.R.id.cix;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.cix);
        if (frameLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.f565479cj3;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f565479cj3);
            if (c1163xf1deaba4 != null) {
                i17 = com.p314xaae8f345.mm.R.id.m6e;
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m6e);
                if (c22801x87cbdc00 != null) {
                    return new a63.c(c22814x6ec16583, c22814x6ec16583, frameLayout, c1163xf1deaba4, c22801x87cbdc00);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
