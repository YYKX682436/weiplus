package w5;

/* loaded from: classes13.dex */
public final class a extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, android.graphics.drawable.Animatable {

    /* renamed from: d, reason: collision with root package name */
    public final d6.g f524467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f524468e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f524469f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f524470g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f524471h;

    /* renamed from: i, reason: collision with root package name */
    public final int f524472i;

    /* renamed from: m, reason: collision with root package name */
    public final int f524473m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f524474n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f524475o;

    /* renamed from: p, reason: collision with root package name */
    public long f524476p;

    /* renamed from: q, reason: collision with root package name */
    public int f524477q;

    /* renamed from: r, reason: collision with root package name */
    public int f524478r;

    public a(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, d6.g scale, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scale, "scale");
        this.f524467d = scale;
        this.f524468e = i17;
        this.f524469f = z17;
        this.f524470g = z18;
        this.f524471h = new java.util.ArrayList();
        this.f524472i = a(drawable == null ? null : java.lang.Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : java.lang.Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.f524473m = a(drawable == null ? null : java.lang.Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : java.lang.Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.f524474n = drawable == null ? null : drawable.mutate();
        android.graphics.drawable.Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f524475o = mutate;
        this.f524477q = 255;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        android.graphics.drawable.Drawable drawable3 = this.f524474n;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (mutate == null) {
            return;
        }
        mutate.setCallback(this);
    }

    public final int a(java.lang.Integer num, java.lang.Integer num2) {
        if (!this.f524470g) {
            if (num != null && num.intValue() == -1) {
                return -1;
            }
            if (num2 != null && num2.intValue() == -1) {
                return -1;
            }
        }
        return java.lang.Math.max(num == null ? -1 : num.intValue(), num2 != null ? num2.intValue() : -1);
    }

    public final void b() {
        this.f524478r = 2;
        this.f524474n = null;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f524471h;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            g6.b bVar = (g6.b) ((v4.a) arrayList.get(i17));
            w5.a aVar = bVar.f350560a;
            aVar.getClass();
            ((java.util.ArrayList) aVar.f524471h).remove(bVar);
            ((p3325xe03a0797.p3326xc267989b.r) bVar.f350561b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            if (i18 > size) {
                return;
            } else {
                i17 = i18;
            }
        }
    }

    public final void c(android.graphics.drawable.Drawable drawable, android.graphics.Rect targetBounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetBounds, "targetBounds");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int width = targetBounds.width();
        int height = targetBounds.height();
        double d17 = v5.f.d(intrinsicWidth, intrinsicHeight, width, height, this.f524467d);
        double d18 = 2;
        int a17 = a06.d.a((width - (intrinsicWidth * d17)) / d18);
        int a18 = a06.d.a((height - (d17 * intrinsicHeight)) / d18);
        drawable.setBounds(targetBounds.left + a17, targetBounds.top + a18, targetBounds.right - a17, targetBounds.bottom - a18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int save;
        android.graphics.drawable.Drawable drawable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = this.f524478r;
        if (i17 == 0) {
            android.graphics.drawable.Drawable drawable2 = this.f524474n;
            if (drawable2 == null) {
                return;
            }
            drawable2.setAlpha(this.f524477q);
            save = canvas.save();
            try {
                drawable2.draw(canvas);
                return;
            } finally {
            }
        }
        android.graphics.drawable.Drawable drawable3 = this.f524475o;
        if (i17 == 2) {
            if (drawable3 == null) {
                return;
            }
            drawable3.setAlpha(this.f524477q);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
                return;
            } finally {
            }
        }
        double uptimeMillis = (android.os.SystemClock.uptimeMillis() - this.f524476p) / this.f524468e;
        double d17 = e06.p.d(uptimeMillis, 0.0d, 1.0d);
        int i18 = this.f524477q;
        int i19 = (int) (d17 * i18);
        if (this.f524469f) {
            i18 -= i19;
        }
        boolean z17 = uptimeMillis >= 1.0d;
        if (!z17 && (drawable = this.f524474n) != null) {
            drawable.setAlpha(i18);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i19);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z17) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f524477q;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        int i17 = this.f524478r;
        if (i17 == 0) {
            android.graphics.drawable.Drawable drawable = this.f524474n;
            if (drawable == null) {
                return null;
            }
            return drawable.getColorFilter();
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (i17 != 1) {
            if (i17 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        android.graphics.ColorFilter colorFilter = drawable2 == null ? null : drawable2.getColorFilter();
        if (colorFilter != null) {
            return colorFilter;
        }
        android.graphics.drawable.Drawable drawable3 = this.f524474n;
        if (drawable3 == null) {
            return null;
        }
        return drawable3.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f524473m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f524472i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        int i17 = this.f524478r;
        if (i17 == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (i17 == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        }
        if (drawable != null && drawable2 != null) {
            return android.graphics.drawable.Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable who) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f524478r == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect bounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            c(drawable, bounds);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        c(drawable2, bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        boolean level = drawable == null ? false : drawable.setLevel(i17);
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        return level || (drawable2 == null ? false : drawable2.setLevel(i17));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.graphics.drawable.Drawable drawable = this.f524474n;
        boolean state2 = drawable == null ? false : drawable.setState(state);
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        return state2 || (drawable2 == null ? false : drawable2.setState(state));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        scheduleSelf(what, j17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 <= 255) {
            z17 = true;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Invalid alpha: ", java.lang.Integer.valueOf(i17)).toString());
        }
        this.f524477q = i17;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i17) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            drawable.setTint(i17);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTint(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(android.graphics.BlendMode blendMode) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.f524474n;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        android.graphics.drawable.Drawable drawable2 = this.f524475o;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        java.lang.Object obj = this.f524474n;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        java.lang.Object obj2 = this.f524475o;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f524478r != 0) {
            return;
        }
        this.f524478r = 1;
        this.f524476p = android.os.SystemClock.uptimeMillis();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f524471h;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                ((v4.a) arrayList.get(i17)).getClass();
                if (i18 > size) {
                    break;
                } else {
                    i17 = i18;
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        java.lang.Object obj = this.f524474n;
        android.graphics.drawable.Animatable animatable = obj instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        java.lang.Object obj2 = this.f524475o;
        android.graphics.drawable.Animatable animatable2 = obj2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f524478r != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable who, java.lang.Runnable what) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(who, "who");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(what, "what");
        unscheduleSelf(what);
    }
}
