package a01;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a01.d f365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a01.d dVar, java.lang.String str, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f365d = dVar;
        this.f366e = str;
        this.f367f = bitmap;
        this.f368g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a01.d dVar = this.f365d;
        java.lang.String b17 = dVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCoverBitmapInternal ");
        sb6.append(this.f366e);
        sb6.append(" bitmap:");
        android.graphics.Bitmap bitmap = this.f367f;
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i(b17, sb6.toString());
        android.view.View view = this.f368g;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = dVar.f371c;
        imageView.setImageBitmap(bitmap);
        if (view instanceof com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) {
            android.graphics.Matrix transform = ((com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender) view).getTransform(null);
            kotlin.jvm.internal.o.f(transform, "getTransform(...)");
            float[] fArr = new float[9];
            transform.getValues(fArr);
            float f17 = fArr[0];
            float f18 = fArr[4];
            if (f17 > 0.0f && f18 > 0.0f) {
                imageView.setPivotX(r2.getWidth() / 2.0f);
                imageView.setPivotY(r2.getHeight() / 2.0f);
                imageView.setScaleX(f17);
                imageView.setScaleY(f18);
            }
        }
        dVar.f369a.addView(imageView, layoutParams);
        return jz5.f0.f302826a;
    }
}
