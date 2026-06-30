package ph4;

/* loaded from: classes8.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436002d;

    public c(android.content.Context context) {
        this.f436002d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int u07 = parent.u0(view);
        if (u07 == -1) {
            u07 = parent.w0(view).m8187x9323db3a();
        }
        int i17 = ph4.e.f436004p;
        int i18 = ph4.e.f436005q;
        outRect.left = i18 / 2;
        outRect.right = i18 / 2;
        if (u07 / 3 > 0) {
            outRect.top = i65.a.f(this.f436002d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        } else {
            outRect.top = 0;
        }
        outRect.bottom = 0;
    }
}
