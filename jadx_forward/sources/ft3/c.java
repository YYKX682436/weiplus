package ft3;

/* loaded from: classes12.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.r0 f348078d;

    public c(em.r0 r0Var) {
        this.f348078d = r0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        if (u07 <= 0) {
            u07 = 0;
        }
        if (u07 > 0) {
            outRect.left = ym5.x.a(this.f348078d.a().getContext(), 8.0f);
        }
    }
}
