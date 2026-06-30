package j65;

/* loaded from: classes13.dex */
public abstract class a extends android.content.res.Resources {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f379450a;

    public a(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f379450a = resources;
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i17) {
        return this.f379450a.getAnimation(i17);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i17) {
        return this.f379450a.getBoolean(i17);
    }

    @Override // android.content.res.Resources
    public int getColor(int i17, android.content.res.Resources.Theme theme) {
        return this.f379450a.getColor(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17, android.content.res.Resources.Theme theme) {
        return this.f379450a.getColorStateList(i17, theme);
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.f379450a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i17) {
        return this.f379450a.getDimension(i17);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i17) {
        return this.f379450a.getDimensionPixelOffset(i17);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i17) {
        return this.f379450a.getDimensionPixelSize(i17);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.f379450a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public float getFraction(int i17, int i18, int i19) {
        return this.f379450a.getFraction(i17, i18, i19);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f379450a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i17) {
        return this.f379450a.getIntArray(i17);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i17) {
        return this.f379450a.getInteger(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i17) {
        return this.f379450a.getLayout(i17);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i17) {
        return this.f379450a.getMovie(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18, java.lang.Object... objArr) {
        return this.f379450a.getQuantityString(i17, i18, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i17, int i18) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(this.f379450a.getQuantityString(i17, i18));
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i17) {
        return this.f379450a.getResourceEntryName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i17) {
        return this.f379450a.getResourceName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i17) {
        return this.f379450a.getResourcePackageName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i17) {
        return this.f379450a.getResourceTypeName(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(this.f379450a.getString(i17));
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i17) {
        return this.f379450a.getStringArray(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(this.f379450a.getString(i17));
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i17) {
        return this.f379450a.getTextArray(i17);
    }

    @Override // android.content.res.Resources
    public void getValue(int i17, android.util.TypedValue typedValue, boolean z17) {
        this.f379450a.getValue(i17, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i17, int i18, android.util.TypedValue typedValue, boolean z17) {
        this.f379450a.getValueForDensity(i17, i18, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i17) {
        return this.f379450a.getXml(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.f379450a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i17) {
        return this.f379450a.obtainTypedArray(i17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17) {
        return this.f379450a.openRawResource(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i17) {
        return this.f379450a.openRawResourceFd(i17);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.f379450a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) {
        this.f379450a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.f379450a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i17) {
        return this.f379450a.getColor(i17);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i17) {
        return this.f379450a.getColorStateList(i17);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i17, int i18) {
        return this.f379450a.getQuantityString(i17, i18);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i17, java.lang.Object... objArr) {
        return this.f379450a.getString(i17, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i17, java.lang.CharSequence charSequence) {
        return this.f379450a.getText(i17, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z17) {
        this.f379450a.getValue(str, typedValue, z17);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17, android.util.TypedValue typedValue) {
        return this.f379450a.openRawResource(i17, typedValue);
    }
}
