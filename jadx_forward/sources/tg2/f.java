package tg2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f500701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f500702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f500703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg2.g f500704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f500705h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.widget.ImageView imageView, android.graphics.PointF pointF, android.graphics.PointF pointF2, tg2.g gVar, long j17) {
        super(0);
        this.f500701d = imageView;
        this.f500702e = pointF;
        this.f500703f = pointF2;
        this.f500704g = gVar;
        this.f500705h = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.PointF pointF = this.f500702e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f500701d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        android.util.Property property = android.view.View.X;
        android.graphics.PointF pointF2 = this.f500703f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) property, pointF.x - (imageView.getWidth() / 2), pointF2.x);
        long j17 = this.f500705h;
        ofFloat.setDuration(j17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(imageView, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.Y, pointF.y - (imageView.getHeight() / 2), pointF2.y);
        ofFloat2.setDuration(j17);
        tg2.g.a(this.f500704g, imageView, j17, ofFloat, ofFloat2);
        return jz5.f0.f384359a;
    }
}
