package j65;

/* loaded from: classes13.dex */
public final class y extends j65.a {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f379531b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.res.Configuration f379532c;

    /* renamed from: d, reason: collision with root package name */
    public android.util.DisplayMetrics f379533d;

    /* renamed from: e, reason: collision with root package name */
    public final int f379534e;

    public y(android.content.res.Resources resources, int i17, android.util.DisplayMetrics displayMetrics) {
        super(resources);
        this.f379534e = 0;
        this.f379531b = resources;
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        this.f379532c = configuration;
        this.f379533d = displayMetrics;
        configuration.densityDpi = displayMetrics.densityDpi;
        this.f379534e = i17;
        if (i17 == 1) {
            j65.m.c(configuration, true);
        } else if (i17 == 2) {
            j65.m.c(configuration, false);
        }
        a(this.f379532c, this.f379533d, false);
    }

    public final void a(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics, boolean z17) {
        int i17 = this.f379534e;
        if (i17 != 0 || z17) {
            this.f379532c = new android.content.res.Configuration(configuration);
            this.f379533d = j65.f.d();
            if (i17 == 1) {
                j65.m.c(this.f379532c, true);
            } else if (i17 == 2) {
                j65.m.c(this.f379532c, false);
            }
        }
        super.updateConfiguration(this.f379532c, this.f379533d);
    }

    @Override // j65.a, android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        android.content.res.Configuration configuration = this.f379532c;
        return configuration != null ? configuration : super.getConfiguration();
    }

    @Override // j65.a, android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        android.util.DisplayMetrics displayMetrics = this.f379533d;
        return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17) {
        android.util.DisplayMetrics displayMetrics;
        android.util.DisplayMetrics displayMetrics2 = this.f379533d;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i17, displayMetrics2.densityDpi);
        }
        android.graphics.drawable.Drawable drawable = this.f379531b.getDrawable(i17);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f379533d) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f379533d) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f379531b.getDrawableForDensity(i17, i18);
    }

    @Override // j65.a, android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        if (this.f379534e != 0) {
            a(configuration, displayMetrics, true);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f379533d) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f379531b.getDrawableForDensity(i17, i18, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        try {
            android.util.DisplayMetrics displayMetrics2 = this.f379533d;
            if (displayMetrics2 != null) {
                return getDrawableForDensity(i17, displayMetrics2.densityDpi, theme);
            }
        } catch (java.lang.NoSuchMethodError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UIModeResource", e17, "getDrawable(id, theme)", new java.lang.Object[0]);
            if (theme == null) {
                return getDrawableForDensity(i17, this.f379533d.densityDpi);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f379531b.getDrawable(i17, theme);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f379533d) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }
}
