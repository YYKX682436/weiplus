package tg2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f500697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f500698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tg2.g f500699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f500700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.widget.ImageView imageView, android.graphics.PointF pointF, tg2.g gVar, android.graphics.PointF pointF2) {
        super(0);
        this.f500697d = imageView;
        this.f500698e = pointF;
        this.f500699f = gVar;
        this.f500700g = pointF2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.PointF pointF = this.f500698e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f500697d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF.x - (imageView.getWidth() / 2), pointF.y - (imageView.getHeight() / 2));
        float f18 = pointF.x;
        android.graphics.PointF pointF2 = this.f500700g;
        float f19 = pointF2.x;
        float f27 = 2;
        float abs = ((f18 + f19) * 0.5f) - (java.lang.Math.abs(f18 - f19) / f27);
        float f28 = pointF.y;
        float f29 = pointF2.y;
        path.quadTo(abs, ((f28 + f29) * 0.5f) - (java.lang.Math.abs(f28 - f29) / f27), pointF2.x, pointF2.y);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.X, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.Y, path);
        ofFloat.setInterpolator(tg2.g.f500706b);
        ofFloat.setDuration(1650L);
        tg2.g.a(this.f500699f, imageView, 1650L, ofFloat);
        return jz5.f0.f384359a;
    }
}
