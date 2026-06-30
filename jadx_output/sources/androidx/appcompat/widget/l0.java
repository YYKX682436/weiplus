package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class l0 extends androidx.appcompat.widget.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.SeekBar f9638d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9639e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.res.ColorStateList f9640f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f9641g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9642h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9643i;

    public l0(android.widget.SeekBar seekBar) {
        super(seekBar);
        this.f9640f = null;
        this.f9641g = null;
        this.f9642h = false;
        this.f9643i = false;
        this.f9638d = seekBar;
    }

    @Override // androidx.appcompat.widget.k0
    public void a(android.util.AttributeSet attributeSet, int i17) {
        super.a(attributeSet, i17);
        android.widget.SeekBar seekBar = this.f9638d;
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(seekBar.getContext(), attributeSet, j.a.f296180h, i17, 0);
        android.graphics.drawable.Drawable f17 = l17.f(0);
        if (f17 != null) {
            seekBar.setThumb(f17);
        }
        android.graphics.drawable.Drawable e17 = l17.e(1);
        android.graphics.drawable.Drawable drawable = this.f9639e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f9639e = e17;
        if (e17 != null) {
            e17.setCallback(seekBar);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            f3.c.b(e17, n3.v0.d(seekBar));
            if (e17.isStateful()) {
                e17.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (l17.k(3)) {
            this.f9641g = androidx.appcompat.widget.y0.c(l17.h(3, -1), this.f9641g);
            this.f9643i = true;
        }
        if (l17.k(2)) {
            this.f9640f = l17.b(2);
            this.f9642h = true;
        }
        l17.m();
        c();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.f9639e;
        if (drawable != null) {
            if (this.f9642h || this.f9643i) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f9639e = mutate;
                if (this.f9642h) {
                    f3.b.h(mutate, this.f9640f);
                }
                if (this.f9643i) {
                    f3.b.i(this.f9639e, this.f9641g);
                }
                if (this.f9639e.isStateful()) {
                    this.f9639e.setState(this.f9638d.getDrawableState());
                }
            }
        }
    }

    public void d(android.graphics.Canvas canvas) {
        if (this.f9639e != null) {
            int max = this.f9638d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9639e.getIntrinsicWidth();
                int intrinsicHeight = this.f9639e.getIntrinsicHeight();
                int i17 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i18 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9639e.setBounds(-i17, -i18, i17, i18);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i19 = 0; i19 <= max; i19++) {
                    this.f9639e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
