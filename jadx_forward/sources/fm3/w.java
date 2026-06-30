package fm3;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f345691a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Point f345692b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.Size f345693c;

    public w(android.graphics.drawable.Drawable drawable, android.graphics.Point position, android.util.Size size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(position, "position");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        this.f345691a = drawable;
        this.f345692b = position;
        this.f345693c = size;
    }

    public final void a(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.util.Size size = this.f345693c;
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        imageView.setLayoutParams(layoutParams);
        android.graphics.Point point = this.f345692b;
        imageView.setX(point.x);
        imageView.setY(point.y);
        imageView.setImageDrawable(this.f345691a);
    }

    public final android.animation.Animator b(fm3.w to6, android.widget.ImageView animateView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animateView, "animateView");
        a(animateView);
        android.graphics.Point point = this.f345692b;
        float f17 = point.x;
        android.graphics.Point point2 = to6.f345692b;
        float f18 = point2.x;
        float f19 = point.y;
        float f27 = point2.y;
        android.util.Size size = this.f345693c;
        float width = size.getWidth();
        android.util.Size size2 = to6.f345693c;
        float width2 = size2.getWidth();
        float height = size.getHeight();
        float height2 = size2.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new fm3.v(this, f17, f18, f19, f27, width, width2, height, height2, animateView, z17));
        return ofFloat;
    }

    /* renamed from: equals */
    public boolean m129786xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.w)) {
            return false;
        }
        fm3.w wVar = (fm3.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345691a, wVar.f345691a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345692b, wVar.f345692b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345693c, wVar.f345693c);
    }

    /* renamed from: hashCode */
    public int m129787x8cdac1b() {
        android.graphics.drawable.Drawable drawable = this.f345691a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f345692b.hashCode()) * 31) + this.f345693c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129788x9616526c() {
        return "MusicMvAnimationInfo(drawable=" + this.f345691a + ", position=" + this.f345692b + ", size=" + this.f345693c + ')';
    }
}
