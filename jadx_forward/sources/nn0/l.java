package nn0;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.m f420124d;

    public l(nn0.m mVar) {
        this.f420124d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        nn0.m mVar = this.f420124d;
        int i19 = mVar.f420129e;
        int i27 = mVar.f420130f;
        android.view.TextureView textureView = mVar.f420125a;
        if (textureView != null && i19 != 0 && i27 != 0 && (i17 = mVar.f420127c) != 0 && (i18 = mVar.f420128d) != 0) {
            double d17 = i27 / i19;
            int i28 = (int) (i17 * d17);
            if (i18 > i28) {
                mVar.f420131g = i17;
                mVar.f420132h = i28;
            } else {
                mVar.f420131g = (int) (i18 / d17);
                mVar.f420132h = i18;
            }
            int i29 = mVar.f420131g;
            float f17 = (i17 - i29) / 2.0f;
            float f18 = (i18 - r7) / 2.0f;
            float f19 = i29 / i17;
            float f27 = mVar.f420132h / i18;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            textureView.getTransform(matrix);
            matrix.setScale(f19, f27);
            matrix.postTranslate(f17, f18);
            textureView.setTransform(matrix);
            textureView.requestLayout();
        }
        mVar.c(mVar.f420133i);
        mVar.e(mVar.f420134j);
    }
}
