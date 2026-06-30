package pt2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac f439783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.C14959x1a54a2ac c14959x1a54a2ac) {
        super(0);
        this.f439783d = c14959x1a54a2ac;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View m7474xfb86a31b = this.f439783d.m7474xfb86a31b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7474xfb86a31b);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m7474xfb86a31b;
        int i17 = com.p314xaae8f345.mm.R.id.l9m;
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) x4.b.a(m7474xfb86a31b, com.p314xaae8f345.mm.R.id.l9m);
        if (c1081xa22a3e5a != null) {
            i17 = com.p314xaae8f345.mm.R.id.lqa;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) x4.b.a(m7474xfb86a31b, com.p314xaae8f345.mm.R.id.lqa);
            if (c1163xf1deaba4 != null) {
                i17 = com.p314xaae8f345.mm.R.id.m6e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) x4.b.a(m7474xfb86a31b, com.p314xaae8f345.mm.R.id.m6e);
                if (c15343x638a173f != null) {
                    return new vb2.r(frameLayout, frameLayout, c1081xa22a3e5a, c1163xf1deaba4, c15343x638a173f);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(m7474xfb86a31b.getResources().getResourceName(i17)));
    }
}
