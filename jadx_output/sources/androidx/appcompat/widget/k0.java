package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9624c = {android.R.attr.indeterminateDrawable, android.R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ProgressBar f9625a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f9626b;

    public k0(android.widget.ProgressBar progressBar) {
        this.f9625a = progressBar;
    }

    public void a(android.util.AttributeSet attributeSet, int i17) {
        android.widget.ProgressBar progressBar = this.f9625a;
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(progressBar.getContext(), attributeSet, f9624c, i17, 0);
        android.graphics.drawable.Drawable f17 = l17.f(0);
        if (f17 != null) {
            if (f17 instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) f17;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                android.graphics.drawable.AnimationDrawable animationDrawable2 = new android.graphics.drawable.AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i18 = 0; i18 < numberOfFrames; i18++) {
                    android.graphics.drawable.Drawable b17 = b(animationDrawable.getFrame(i18), true);
                    b17.setLevel(10000);
                    animationDrawable2.addFrame(b17, animationDrawable.getDuration(i18));
                }
                animationDrawable2.setLevel(10000);
                f17 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f17);
        }
        android.graphics.drawable.Drawable f18 = l17.f(1);
        if (f18 != null) {
            progressBar.setProgressDrawable(b(f18, false));
        }
        l17.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.graphics.drawable.Drawable b(android.graphics.drawable.Drawable drawable, boolean z17) {
        if (drawable instanceof f3.k) {
            ((f3.l) ((f3.k) drawable)).getClass();
        } else {
            if (drawable instanceof android.graphics.drawable.LayerDrawable) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[numberOfLayers];
                for (int i17 = 0; i17 < numberOfLayers; i17++) {
                    int id6 = layerDrawable.getId(i17);
                    drawableArr[i17] = b(layerDrawable.getDrawable(i17), id6 == 16908301 || id6 == 16908303);
                }
                android.graphics.drawable.LayerDrawable layerDrawable2 = new android.graphics.drawable.LayerDrawable(drawableArr);
                for (int i18 = 0; i18 < numberOfLayers; i18++) {
                    layerDrawable2.setId(i18, layerDrawable.getId(i18));
                }
                return layerDrawable2;
            }
            if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
                android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f9626b == null) {
                    this.f9626b = bitmap;
                }
                android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new android.graphics.BitmapShader(bitmap, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z17 ? new android.graphics.drawable.ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
