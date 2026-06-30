package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes13.dex */
public abstract class a extends android.content.res.Resources {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f91021a;

    public a(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f91021a = resources;
    }

    public final int a(int i17) {
        return super.getDimensionPixelOffset(i17);
    }

    public final int b(int i17) {
        return super.getDimensionPixelSize(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i17) {
        return this.f91021a.getAnimation(i17);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i17) {
        return this.f91021a.getBoolean(i17);
    }

    @Override // android.content.res.Resources
    public int getColor(int i17, android.content.res.Resources.Theme theme) {
        return this.f91021a.getColor(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17, android.content.res.Resources.Theme theme) {
        return this.f91021a.getColorStateList(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.f91021a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i17) {
        return this.f91021a.getDimension(i17);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.f91021a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public float getFraction(int i17, int i18, int i19) {
        return this.f91021a.getFraction(i17, i18, i19);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f91021a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i17) {
        return this.f91021a.getIntArray(i17);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i17) {
        return this.f91021a.getInteger(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i17) {
        return this.f91021a.getLayout(i17);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i17) {
        return this.f91021a.getMovie(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18, java.lang.Object... objArr) {
        return this.f91021a.getQuantityString(i17, i18, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i17, int i18) {
        return this.f91021a.getQuantityText(i17, i18);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i17) {
        return this.f91021a.getResourceEntryName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i17) {
        return this.f91021a.getResourceName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i17) {
        return this.f91021a.getResourcePackageName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i17) {
        return this.f91021a.getResourceTypeName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17) {
        return this.f91021a.getString(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i17) {
        return this.f91021a.getStringArray(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17) {
        return this.f91021a.getText(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i17) {
        return this.f91021a.getTextArray(i17);
    }

    @Override // android.content.res.Resources
    public void getValue(int i17, android.util.TypedValue typedValue, boolean z17) {
        this.f91021a.getValue(i17, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i17, int i18, android.util.TypedValue typedValue, boolean z17) {
        this.f91021a.getValueForDensity(i17, i18, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i17) {
        return this.f91021a.getXml(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.f91021a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i17) {
        return this.f91021a.obtainTypedArray(i17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17) {
        return this.f91021a.openRawResource(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i17) {
        return this.f91021a.openRawResourceFd(i17);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f91021a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) {
        this.f91021a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.f91021a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i17) {
        return this.f91021a.getColor(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17) {
        return this.f91021a.getColorStateList(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18) {
        return this.f91021a.getQuantityString(i17, i18);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17, java.lang.Object... objArr) {
        return this.f91021a.getString(i17, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17, java.lang.CharSequence charSequence) {
        return this.f91021a.getText(i17, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z17) {
        this.f91021a.getValue(str, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17, android.util.TypedValue typedValue) {
        return this.f91021a.openRawResource(i17, typedValue);
    }
}
