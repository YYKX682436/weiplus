package bp4;

/* loaded from: classes3.dex */
public final class v extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final float f104926d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bp4.x f104927e;

    public v(bp4.x xVar) {
        this.f104927e = xVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int m8183xf806b362 = parent.w0(view).m8183xf806b362();
        float f17 = this.f104926d;
        outRect.left = (int) f17;
        if (m8183xf806b362 + 1 == this.f104927e.f104950g.size()) {
            outRect.right = (int) f17;
        }
    }
}
