package df2;

/* loaded from: classes3.dex */
public final class dk extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f311518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pk f311519e;

    public dk(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, df2.pk pkVar) {
        this.f311518d = c22849x81a93d25;
        this.f311519e = pkVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) - 1;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f311518d;
        outRect.left = u07 == 0 ? ym5.x.a(c22849x81a93d25.getContext(), 19.0f) : ym5.x.a(c22849x81a93d25.getContext(), 5.0f);
        outRect.right = u07 == mo1894x7e414b06 ? ym5.x.a(c22849x81a93d25.getContext(), 19.0f) : ym5.x.a(c22849x81a93d25.getContext(), 5.0f);
        if (zl2.q4.f555466a.E()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311519e.f312606m, "view:" + view + ",position:" + u07 + ",lastPosition:" + mo1894x7e414b06);
        }
    }
}
