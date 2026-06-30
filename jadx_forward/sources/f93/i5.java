package f93;

/* loaded from: classes3.dex */
public final class i5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f341891d;

    /* renamed from: e, reason: collision with root package name */
    public final int f341892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f93.p5 f341893f;

    public i5(f93.p5 p5Var) {
        this.f341893f = p5Var;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f341891d = paint;
        this.f341892e = 1;
        paint.setColor(i65.a.d(p5Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        super.mo8166xc398a7c3(c17, parent, state);
        int childCount = parent.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (parent.u0(parent.getChildAt(i17)) != (parent.mo7946xf939df19() != null ? r4.mo1894x7e414b06() : 0) - 1) {
                c17.drawRect(parent.getPaddingLeft() + i65.a.h(this.f341893f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp), r2.getBottom() - this.f341892e, parent.getWidth() - parent.getPaddingRight(), r2.getBottom(), this.f341891d);
            }
        }
    }
}
