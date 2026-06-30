package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatRatingBar */
/* loaded from: classes13.dex */
public class C0089xea302393 extends android.widget.RatingBar {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k0 f90909d;

    public C0089xea302393(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559914i9);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        android.graphics.Bitmap bitmap = this.f90909d.f91159b;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i17, 0), getMeasuredHeight());
        }
    }

    public C0089xea302393(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k0 k0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k0(this);
        this.f90909d = k0Var;
        k0Var.a(attributeSet, i17);
    }
}
