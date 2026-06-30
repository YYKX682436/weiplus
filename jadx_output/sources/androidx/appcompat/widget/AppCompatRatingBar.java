package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class AppCompatRatingBar extends android.widget.RatingBar {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.k0 f9376d;

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478381i9);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.graphics.Bitmap bitmap = this.f9376d.f9626b;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i17, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.k0 k0Var = new androidx.appcompat.widget.k0(this);
        this.f9376d = k0Var;
        k0Var.a(attributeSet, i17);
    }
}
