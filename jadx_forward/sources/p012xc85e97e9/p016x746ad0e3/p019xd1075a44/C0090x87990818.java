package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatSeekBar */
/* loaded from: classes13.dex */
public class C0090x87990818 extends android.widget.SeekBar {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l0 f90910d;

    public C0090x87990818(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559921ig);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l0 l0Var = this.f90910d;
        android.graphics.drawable.Drawable drawable = l0Var.f91172e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        android.widget.SeekBar seekBar = l0Var.f91171d;
        if (drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f90910d.f91172e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f90910d.d(canvas);
    }

    public C0090x87990818(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l0 l0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l0(this);
        this.f90910d = l0Var;
        l0Var.a(attributeSet, i17);
    }
}
