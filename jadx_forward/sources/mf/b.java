package mf;

/* loaded from: classes13.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f407521b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.DisplayMetrics f407522c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Configuration f407523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf.d f407524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mf.d dVar, android.content.res.Resources resources, android.util.DisplayMetrics displayMetrics) {
        super(resources);
        this.f407524e = dVar;
        this.f407521b = resources;
        this.f407522c = displayMetrics;
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        this.f407523d = configuration;
        configuration.densityDpi = this.f407522c.densityDpi;
        android.content.res.Configuration configuration2 = new android.content.res.Configuration(resources.getConfiguration());
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        displayMetrics2.setTo(resources.getDisplayMetrics());
        c(configuration2, displayMetrics2, false);
    }

    public final void c(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics, boolean z17) {
        if (this.f407522c == null || z17) {
            this.f407522c = this.f407524e.f407528c.a(displayMetrics, configuration);
            android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
            this.f407523d = configuration2;
            configuration2.densityDpi = this.f407522c.densityDpi;
        }
        super.updateConfiguration(this.f407523d, this.f407522c);
        this.f407521b.updateConfiguration(configuration, displayMetrics);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a, android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        android.content.res.Configuration configuration = this.f407523d;
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
        android.util.DisplayMetrics displayMetrics = this.f407522c;
        return displayMetrics != null ? displayMetrics : super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17) {
        android.util.DisplayMetrics displayMetrics;
        android.util.DisplayMetrics displayMetrics2 = this.f407522c;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i17, displayMetrics2.densityDpi);
        }
        android.graphics.drawable.Drawable drawable = this.f407521b.getDrawable(i17);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f407522c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f407522c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f407521b.getDrawableForDensity(i17, i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.a, android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        if (this.f407522c != null) {
            c(configuration, displayMetrics, true);
        } else {
            super.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i17, int i18, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        if (i18 == 0 && (displayMetrics = this.f407522c) != null) {
            i18 = displayMetrics.densityDpi;
        }
        return this.f407521b.getDrawableForDensity(i17, i18, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i17, android.content.res.Resources.Theme theme) {
        android.util.DisplayMetrics displayMetrics;
        android.util.DisplayMetrics displayMetrics2 = this.f407522c;
        if (displayMetrics2 != null) {
            return getDrawableForDensity(i17, displayMetrics2.densityDpi, theme);
        }
        android.graphics.drawable.Drawable drawable = this.f407521b.getDrawable(i17, theme);
        if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && (displayMetrics = this.f407522c) != null) {
            ((android.graphics.drawable.BitmapDrawable) drawable).setTargetDensity(displayMetrics.densityDpi);
        }
        return drawable;
    }
}
