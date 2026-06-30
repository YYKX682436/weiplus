package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class m extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar, android.content.Context context) {
        super(context, null, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559618a9);
        this.f91178f = qVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.a3.a(this, getContentDescription());
        setOnTouchListener(new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.l(this, this, qVar));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r
    public boolean c() {
        return false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r
    public boolean d() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f91178f.o();
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
