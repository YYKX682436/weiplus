package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class m extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f9645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.widget.q qVar, android.content.Context context) {
        super(context, null, com.tencent.mm.R.attr.f478085a9);
        this.f9645f = qVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        androidx.appcompat.widget.a3.a(this, getContentDescription());
        setOnTouchListener(new androidx.appcompat.widget.l(this, this, qVar));
    }

    @Override // androidx.appcompat.widget.r
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.widget.r
    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f9645f.o();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i17, int i18, int i19, int i27) {
        boolean frame = super.setFrame(i17, i18, i19, i27);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            f3.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
