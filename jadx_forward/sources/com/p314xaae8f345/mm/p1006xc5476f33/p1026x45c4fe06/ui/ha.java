package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes13.dex */
public final class ha extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f171291b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.DisplayMetrics f171292c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Configuration f171293d;

    public ha(android.content.res.Resources resources, android.util.DisplayMetrics displayMetrics) {
        super(resources);
        this.f171291b = resources;
        this.f171292c = displayMetrics;
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        this.f171293d = configuration;
        configuration.densityDpi = this.f171292c.densityDpi;
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        displayMetrics2.setTo(resources.getDisplayMetrics());
        c(configuration2, displayMetrics2, false);
    }

    public final void c(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics, boolean z17) {
        if (this.f171292c == null || z17) {
            this.f171292c = j65.f.d();
            android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
            this.f171293d = configuration2;
            configuration2.densityDpi = this.f171292c.densityDpi;
        }
        super.updateConfiguration(this.f171293d, this.f171292c);
        this.f171291b.updateConfiguration(configuration, displayMetrics);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a, android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        android.content.res.Configuration configuration = this.f171293d;
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a, android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        android.util.DisplayMetrics displayMetrics = this.f171292c;
        return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17) {
        android.util.DisplayMetrics displayMetrics;
        android.util.DisplayMetrics displayMetrics2 = this.f171292c;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i17, displayMetrics2.densityDpi);
        }
        android.graphics.drawable.Drawable drawable = this.f171291b.getDrawable(i17);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f171292c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f171292c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f171291b.getDrawableForDensity(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a, android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        if (this.f171292c != null) {
            c(configuration, displayMetrics, true);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f171292c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f171291b.getDrawableForDensity(i17, i18, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        try {
            android.util.DisplayMetrics displayMetrics2 = this.f171292c;
            if (displayMetrics2 != null) {
                return getDrawableForDensity(i17, displayMetrics2.densityDpi, theme);
            }
        } catch (java.lang.NoSuchMethodError e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandUIScreenAdaptiveContextThemeWrapper", e17, "getDrawable(id, theme)", new java.lang.Object[0]);
            if (theme == null) {
                return getDrawableForDensity(i17, this.f171292c.densityDpi);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f171291b.getDrawable(i17, theme);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f171292c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }
}
