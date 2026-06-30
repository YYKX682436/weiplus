package mg2;

/* loaded from: classes10.dex */
public final class a extends lg2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // lg2.a
    public void k() {
        android.view.ViewGroup viewGroup = this.f400099q;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = this.f400099q;
        android.view.ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        android.view.ViewGroup viewGroup3 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup3 != null) {
            viewGroup3.addView(this.f400096n, new android.widget.FrameLayout.LayoutParams((int) (x() * s().width()), (int) (x() * s().height())));
        }
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        return new android.graphics.Rect(0, 0, (int) (x() * s().width()), (int) (x() * s().height()));
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        ig2.n nVar = this.f400098p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar);
        return nVar.f372943i;
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f400089d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55(context);
        c22646x1e9ca55.m81437x205ac394(context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        ig2.n nVar = this.f400098p;
        ig2.g gVar = nVar instanceof ig2.g ? (ig2.g) nVar : null;
        if (gVar != null) {
            android.view.View view = gVar.f372908j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.widget.ImageView");
            imageView.setImageDrawable(((android.widget.ImageView) view).getDrawable());
        }
        c22646x1e9ca55.addView(imageView, layoutParams);
        return c22646x1e9ca55;
    }

    @Override // lg2.b, lg2.a, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        super.onAnimationEnd(p07);
        ig2.m.f372926a.d();
    }

    @Override // lg2.a
    public void p() {
        android.view.ViewGroup viewGroup = this.f400099q;
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f400096n);
        }
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchInImageDirector";
    }

    public final float x() {
        android.view.ViewGroup viewGroup = this.f400099q;
        if (viewGroup == null) {
            return 1.0f;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        float height = viewGroup.getHeight() / s().height();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f400099q);
        float width = r1.getWidth() / s().width();
        return width < height ? height : width;
    }
}
