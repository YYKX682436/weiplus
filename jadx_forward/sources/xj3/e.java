package xj3;

/* loaded from: classes4.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public int f536407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536408e;

    public e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f536408e = sj3.i1.f490090b / 2;
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
        int mo1894x7e414b06 = mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0;
        int i17 = this.f536408e;
        if (u07 == 0) {
            outRect.set((parent.getWidth() - this.f536407d) / 2, 0, i17, 0);
        } else if (u07 == mo1894x7e414b06 - 1) {
            outRect.set(i17, 0, (parent.getWidth() - this.f536407d) / 2, 0);
        } else {
            outRect.set(i17, 0, i17, 0);
        }
    }
}
