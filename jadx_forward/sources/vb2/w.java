package vb2;

/* loaded from: classes2.dex */
public final class w implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f516285a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f516286b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f516287c;

    public w(android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f) {
        this.f516285a = frameLayout;
        this.f516286b = c22849x81a93d25;
        this.f516287c = c15343x638a173f;
    }

    public static vb2.w a(android.view.View view) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        int i17 = com.p314xaae8f345.mm.R.id.f567991la3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(view, com.p314xaae8f345.mm.R.id.f567991la3);
        if (c22849x81a93d25 != null) {
            i17 = com.p314xaae8f345.mm.R.id.lr8;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) x4.b.a(view, com.p314xaae8f345.mm.R.id.lr8);
            if (c15343x638a173f != null) {
                return new vb2.w(frameLayout, frameLayout, c22849x81a93d25, c15343x638a173f);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f516285a;
    }
}
