package fg2;

/* loaded from: classes10.dex */
public final class a0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343469a;

    public a0(android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234, android.widget.RelativeLayout relativeLayout2, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f343469a = relativeLayout;
    }

    public static fg2.a0 a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.f565301c03;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234) x4.b.a(view, com.p314xaae8f345.mm.R.id.f565301c03);
        if (c14323xd3329234 != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(view, com.p314xaae8f345.mm.R.id.iy7);
            if (c22789xd23e9a9b != null) {
                return new fg2.a0(relativeLayout, c14323xd3329234, relativeLayout, c22789xd23e9a9b);
            }
            i17 = com.p314xaae8f345.mm.R.id.iy7;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343469a;
    }
}
