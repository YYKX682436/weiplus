package fg2;

/* loaded from: classes10.dex */
public final class r1 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343817a;

    public r1(android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.widget.RelativeLayout relativeLayout2) {
        this.f343817a = relativeLayout;
    }

    public static fg2.r1 a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.eog;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234) x4.b.a(view, com.p314xaae8f345.mm.R.id.eog);
        if (c14323xd3329234 != null) {
            i17 = com.p314xaae8f345.mm.R.id.eoi;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(view, com.p314xaae8f345.mm.R.id.eoi);
            if (c22789xd23e9a9b != null) {
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                return new fg2.r1(relativeLayout, c14323xd3329234, c22789xd23e9a9b, relativeLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343817a;
    }
}
