package ut5;

/* loaded from: classes13.dex */
public class c extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f512723a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f512724b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ClassLoader f512725c;

    public c(android.content.Context context, java.lang.String str, java.lang.ClassLoader classLoader) {
        super(context);
        this.f512725c = classLoader;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        android.content.pm.ApplicationInfo applicationInfo = packageManager.getPackageArchiveInfo(str, 128).applicationInfo;
        applicationInfo.publicSourceDir = str;
        applicationInfo.sourceDir = str;
        try {
            this.f512723a = packageManager.getResourcesForApplication(applicationInfo);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return this.f512723a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.ClassLoader getClassLoader() {
        return this.f512725c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return this.f512723a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f512724b == null) {
            this.f512724b = ((android.view.LayoutInflater) super.getSystemService(str)).cloneInContext(this);
        }
        return this.f512724b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        return this.f512723a.newTheme();
    }
}
