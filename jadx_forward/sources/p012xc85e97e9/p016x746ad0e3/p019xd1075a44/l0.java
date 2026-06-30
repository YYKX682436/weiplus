package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class l0 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.SeekBar f91171d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f91172e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.res.ColorStateList f91173f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f91174g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91175h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f91176i;

    public l0(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.f91173f = null;
        this.f91174g = null;
        this.f91175h = false;
        this.f91176i = false;
        this.f91171d = seekBar;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.k0
    public void a(android.util.AttributeSet attributeSet, int i17) {
        super.a(attributeSet, i17);
        android.widget.SeekBar seekBar = this.f91171d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(seekBar.getContext(), attributeSet, j.a.f377713h, i17, 0);
        android.graphics.drawable.Drawable f17 = l17.f(0);
        if (f17 != null) {
            seekBar.setThumb(f17);
        }
        android.graphics.drawable.Drawable e17 = l17.e(1);
        android.graphics.drawable.Drawable drawable = this.f91172e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f91172e = e17;
        if (e17 != null) {
            e17.setCallback(seekBar);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            f3.c.b(e17, n3.v0.d(seekBar));
            if (e17.isStateful()) {
                e17.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (l17.k(3)) {
            this.f91174g = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.c(l17.h(3, -1), this.f91174g);
            this.f91176i = true;
        }
        if (l17.k(2)) {
            this.f91173f = l17.b(2);
            this.f91175h = true;
        }
        l17.m();
        c();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.f91172e;
        if (drawable != null) {
            if (this.f91175h || this.f91176i) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f91172e = mutate;
                if (this.f91175h) {
                    f3.b.h(mutate, this.f91173f);
                }
                if (this.f91176i) {
                    f3.b.i(this.f91172e, this.f91174g);
                }
                if (this.f91172e.isStateful()) {
                    this.f91172e.setState(this.f91171d.getDrawableState());
                }
            }
        }
    }

    public void d(android.graphics.Canvas canvas) {
        if (this.f91172e != null) {
            int max = this.f91171d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f91172e.getIntrinsicWidth();
                int intrinsicHeight = this.f91172e.getIntrinsicHeight();
                int i17 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i18 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f91172e.setBounds(-i17, -i18, i17, i18);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i19 = 0; i19 <= max; i19++) {
                    this.f91172e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
