package g22;

/* loaded from: classes15.dex */
public final class f extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f349340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f349341e;

    /* renamed from: f, reason: collision with root package name */
    public final int f349342f;

    /* renamed from: g, reason: collision with root package name */
    public final i22.w f349343g;

    /* renamed from: h, reason: collision with root package name */
    public int f349344h;

    /* renamed from: i, reason: collision with root package name */
    public int f349345i;

    public f(int i17, int i18, int i19, i22.w sizeResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeResolver, "sizeResolver");
        this.f349340d = i17;
        this.f349341e = i18;
        this.f349342f = i19;
        this.f349343g = sizeResolver;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        i22.w wVar = this.f349343g;
        this.f349344h = wVar.f369593b;
        this.f349345i = wVar.f369594c;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = parent.mo7946xf939df19();
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        int b17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) layoutParams).b();
        if (b17 < 0 || mo1894x7e414b06 <= 0) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = parent.mo7946xf939df19();
        int mo863xcdaf1228 = mo7946xf939df192 != null ? mo7946xf939df192.mo863xcdaf1228(b17) : -1;
        int i17 = this.f349341e;
        if (mo863xcdaf1228 != 4) {
            if (mo863xcdaf1228 == 7) {
                int i18 = i17 + wVar.f369596e;
                outRect.set(i18, 0, i18, 0);
                return;
            } else {
                if (mo863xcdaf1228 != 8) {
                    return;
                }
                outRect.set(0, 0, 0, 0);
                return;
            }
        }
        int i19 = b17 - this.f349342f;
        int i27 = this.f349344h;
        int i28 = i19 % i27;
        int i29 = i19 / i27;
        outRect.bottom = this.f349340d;
        float f17 = (((i17 * 2) + ((i27 - 1) * r1)) * 1.0f) / i27;
        float f18 = i17 + (i28 * (this.f349345i - f17));
        outRect.left = a06.d.b(f18);
        outRect.right = a06.d.b(f17 - f18);
    }
}
