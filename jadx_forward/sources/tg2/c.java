package tg2;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f500692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f500693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f500694f;

    public c(android.widget.ImageView imageView, android.graphics.PointF pointF, yz5.a aVar) {
        this.f500692d = imageView;
        this.f500693e = pointF;
        this.f500694f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.PointF pointF = this.f500693e;
        float f17 = pointF.x;
        android.widget.ImageView imageView = this.f500692d;
        imageView.setX(f17 - (imageView.getWidth() / 2));
        imageView.setY(pointF.y - (imageView.getHeight() / 2));
        imageView.setVisibility(0);
        this.f500694f.mo152xb9724478();
    }
}
