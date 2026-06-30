package a01;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a01.d f81898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f81900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f81901g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a01.d dVar, java.lang.String str, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f81898d = dVar;
        this.f81899e = str;
        this.f81900f = bitmap;
        this.f81901g = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        a01.d dVar = this.f81898d;
        java.lang.String b17 = dVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCoverBitmapInternal ");
        sb6.append(this.f81899e);
        sb6.append(" bitmap:");
        android.graphics.Bitmap bitmap = this.f81900f;
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
        android.view.View view = this.f81901g;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = dVar.f81904c;
        imageView.setImageBitmap(bitmap);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) {
            android.graphics.Matrix transform = ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) view).getTransform(null);
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
        dVar.f81902a.addView(imageView, layoutParams);
        return jz5.f0.f384359a;
    }
}
