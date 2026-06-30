package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes13.dex */
public final class ha extends com.tencent.mm.plugin.appbrand.widget.a {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f89758b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.DisplayMetrics f89759c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Configuration f89760d;

    public ha(android.content.res.Resources resources, android.util.DisplayMetrics displayMetrics) {
        super(resources);
        this.f89758b = resources;
        this.f89759c = displayMetrics;
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        this.f89760d = configuration;
        configuration.densityDpi = this.f89759c.densityDpi;
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        displayMetrics2.setTo(resources.getDisplayMetrics());
        c(configuration2, displayMetrics2, false);
    }

    public final void c(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics, boolean z17) {
        if (this.f89759c == null || z17) {
            this.f89759c = j65.f.d();
            android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
            this.f89760d = configuration2;
            configuration2.densityDpi = this.f89759c.densityDpi;
        }
        super.updateConfiguration(this.f89760d, this.f89759c);
        this.f89758b.updateConfiguration(configuration, displayMetrics);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.a, android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        android.content.res.Configuration configuration = this.f89760d;
        return configuration != null ? configuration : super.getConfiguration();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i17) {
        return a(i17);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i17) {
        return b(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.a, android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        android.util.DisplayMetrics displayMetrics = this.f89759c;
        return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17) {
        android.util.DisplayMetrics displayMetrics;
        android.util.DisplayMetrics displayMetrics2 = this.f89759c;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i17, displayMetrics2.densityDpi);
        }
        android.graphics.drawable.Drawable drawable = this.f89758b.getDrawable(i17);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f89759c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f89759c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f89758b.getDrawableForDensity(i17, i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.a, android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        if (this.f89759c != null) {
            c(configuration, displayMetrics, true);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f89759c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f89758b.getDrawableForDensity(i17, i18, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        try {
            android.util.DisplayMetrics displayMetrics2 = this.f89759c;
            if (displayMetrics2 != null) {
                return getDrawableForDensity(i17, displayMetrics2.densityDpi, theme);
            }
        } catch (java.lang.NoSuchMethodError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandUIScreenAdaptiveContextThemeWrapper", e17, "getDrawable(id, theme)", new java.lang.Object[0]);
            if (theme == null) {
                return getDrawableForDensity(i17, this.f89759c.densityDpi);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f89758b.getDrawable(i17, theme);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f89759c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }
}
