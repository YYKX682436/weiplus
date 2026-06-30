package w23;

/* loaded from: classes2.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f524129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 f524130e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 c15638x5a203cd0) {
        this.f524130e = c15638x5a203cd0;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f524129d = paint;
        paint.setColor(color);
        paint.setStrokeWidth(6.4f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo7902x5db88677(outRect, view, parent, state);
        int v07 = parent.v0(view);
        if (v07 % 4 == 0) {
            outRect.left = 4;
        }
        outRect.right = 4;
        outRect.bottom = 4;
        boolean z17 = false;
        if (v07 >= 0 && v07 < 4) {
            z17 = true;
        }
        if (z17) {
            outRect.top = 4;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    public void mo7903x73cebf37(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f524130e.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = parent.p0(0);
        android.view.View view = p07 != null ? p07.f3639x46306858 : null;
        if (view != null) {
            c17.drawRect(new android.graphics.Rect(view.getLeft() + 2, view.getTop() + 2, view.getRight() - 2, view.getBottom() - 2), this.f524129d);
        }
        super.mo8166xc398a7c3(c17, parent, state);
    }
}
