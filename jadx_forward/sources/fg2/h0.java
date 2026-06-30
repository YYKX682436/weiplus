package fg2;

/* loaded from: classes10.dex */
public final class h0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f343595a;

    public h0(android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.widget.RelativeLayout relativeLayout2) {
        this.f343595a = relativeLayout;
    }

    public static fg2.h0 a(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.R.id.ezq;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec c14224x1cce21ec = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1499x306930.p1500xd1075a44.C14224x1cce21ec) x4.b.a(view, com.p314xaae8f345.mm.R.id.ezq);
        if (c14224x1cce21ec != null) {
            i17 = com.p314xaae8f345.mm.R.id.ezr;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c14323xd3329234 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234) x4.b.a(view, com.p314xaae8f345.mm.R.id.ezr);
            if (c14323xd3329234 != null) {
                i17 = com.p314xaae8f345.mm.R.id.ezw;
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) x4.b.a(view, com.p314xaae8f345.mm.R.id.ezw);
                if (c22789xd23e9a9b != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
                    return new fg2.h0(relativeLayout, c14224x1cce21ec, c14323xd3329234, c22789xd23e9a9b, relativeLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f343595a;
    }
}
