package mk4;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk4.h f408683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f408686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mk4.h hVar, java.lang.String str, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f408683d = hVar;
        this.f408684e = str;
        this.f408685f = bitmap;
        this.f408686g = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mk4.h hVar = this.f408683d;
        java.lang.String d17 = hVar.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCoverBitmapInternal ");
        sb6.append(this.f408684e);
        sb6.append(" bitmap:");
        android.graphics.Bitmap bitmap = this.f408685f;
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d17, sb6.toString());
        android.view.View view = this.f408686g;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = hVar.f408689c;
        imageView.setImageBitmap(bitmap);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56) {
            android.graphics.Matrix transform = ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18687x1c450e56) view).getTransform(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(transform, "getTransform(...)");
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
        hVar.f408687a.addView(imageView, layoutParams);
        return jz5.f0.f384359a;
    }
}
