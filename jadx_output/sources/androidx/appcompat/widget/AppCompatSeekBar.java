package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class AppCompatSeekBar extends android.widget.SeekBar {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.l0 f9377d;

    public AppCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478388ig);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.l0 l0Var = this.f9377d;
        android.graphics.drawable.Drawable drawable = l0Var.f9639e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        android.widget.SeekBar seekBar = l0Var.f9638d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f9377d.f9639e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f9377d.d(canvas);
    }

    public AppCompatSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.l0 l0Var = new androidx.appcompat.widget.l0(this);
        this.f9377d = l0Var;
        l0Var.a(attributeSet, i17);
    }
}
