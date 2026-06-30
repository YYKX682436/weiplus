package mw2;

/* loaded from: classes2.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw2.j f413251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw2.e f413252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f413253f;

    public h(mw2.j jVar, mw2.e eVar, android.graphics.Bitmap bitmap) {
        this.f413251d = jVar;
        this.f413252e = eVar;
        this.f413253f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        float width;
        float height;
        mw2.j jVar = this.f413251d;
        if (jVar.f413258d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSpritePreviewController", "Skip sprite preview because progress is already 0");
            return;
        }
        mw2.e eVar = this.f413252e;
        if (eVar.f413244c <= 0 || eVar.f413245d <= 0 || jVar.f413256b.getWidth() <= 0 || jVar.f413256b.getHeight() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderSpritePreviewController", "Invalid dimensions for matrix transform");
            return;
        }
        android.graphics.Bitmap bitmap = jVar.f413261g;
        android.graphics.Bitmap bitmap2 = this.f413253f;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bitmap, bitmap2)) {
            jVar.f413256b.setImageBitmap(bitmap2);
            jVar.f413261g = bitmap2;
        }
        android.widget.ImageView imageView = jVar.f413256b;
        jVar.getClass();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (eVar.f413244c <= 0 || (i17 = eVar.f413245d) <= 0 || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderSpritePreviewController", "Invalid dimensions for matrix transform");
        } else {
            float f17 = eVar.f413244c;
            float f18 = i17;
            float f19 = 0.0f;
            if (f17 / f18 > imageView.getWidth() / imageView.getHeight()) {
                width = imageView.getHeight() / f18;
                float width2 = (imageView.getWidth() - (f17 * width)) / 2.0f;
                height = 0.0f;
                f19 = width2;
            } else {
                width = imageView.getWidth() / f17;
                height = (imageView.getHeight() - (f18 * width)) / 2.0f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((-eVar.f413242a) * width, (-eVar.f413243b) * width);
            matrix.postTranslate(f19, height);
            imageView.setImageMatrix(matrix);
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        }
        jVar.f413256b.setAlpha(1.0f);
    }
}
