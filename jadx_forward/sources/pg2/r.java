package pg2;

/* loaded from: classes3.dex */
public final class r implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f435714b;

    public r(android.view.View view, android.graphics.Rect rect) {
        this.f435713a = view;
        this.f435714b = rect;
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.Bitmap b17 = ug5.x.b(this.f435713a);
        imageView.setImageBitmap(b17);
        performer.f("key_enter_bitmap", b17);
        imageView.setOnClickListener(pg2.p.f435711d);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setAlpha(0.0f);
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageBitmap(b17);
        imageView2.setOnClickListener(pg2.q.f435712d);
        android.graphics.Rect rect = this.f435714b;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.gravity = 17;
        frameLayout.addView(imageView2, layoutParams);
        qg2.d dVar = qg2.d.f444326a;
        parent.addView(frameLayout, new android.view.ViewGroup.LayoutParams(dVar.g(), dVar.f()));
        return imageView;
    }
}
