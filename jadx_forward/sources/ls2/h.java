package ls2;

/* loaded from: classes5.dex */
public final class h extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f402562d;

    /* renamed from: e, reason: collision with root package name */
    public int f402563e;

    /* renamed from: f, reason: collision with root package name */
    public int f402564f;

    public h(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 3 : i19;
        this.f402562d = i17;
        this.f402563e = i18;
        this.f402564f = i19;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (this.f402563e == 0) {
            return;
        }
        int v07 = parent.v0(view);
        int i17 = this.f402563e;
        int i18 = this.f402564f;
        boolean z17 = false;
        int i19 = ((i17 / i18) * i18) - (i17 % i18 > 0 ? 0 : i18);
        int i27 = (i19 + i18) - 1;
        int i28 = this.f402562d;
        if (v07 < i18) {
            outRect.bottom = i28;
            return;
        }
        if (i19 <= v07 && v07 <= i27) {
            z17 = true;
        }
        if (z17) {
            outRect.top = i28;
        } else {
            outRect.top = i28;
            outRect.bottom = i28;
        }
    }
}
