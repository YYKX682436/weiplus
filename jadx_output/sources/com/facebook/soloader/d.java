package com.facebook.soloader;

/* loaded from: classes13.dex */
public class d extends com.facebook.soloader.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f44016a;

    /* renamed from: b, reason: collision with root package name */
    public int f44017b;

    /* renamed from: c, reason: collision with root package name */
    public com.facebook.soloader.f f44018c;

    public d(android.content.Context context, int i17) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f44016a = applicationContext;
        if (applicationContext == null) {
            java.lang.String str = context.getApplicationInfo().nativeLibraryDir;
            this.f44016a = context;
        }
        this.f44017b = i17;
        this.f44018c = new com.facebook.soloader.f(new java.io.File(this.f44016a.getApplicationInfo().nativeLibraryDir), i17);
    }

    @Override // com.facebook.soloader.d0
    public int a(java.lang.String str, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        return this.f44018c.a(str, i17, threadPolicy);
    }

    @Override // com.facebook.soloader.d0
    public void b(int i17) {
        this.f44018c.b(i17);
    }

    public boolean c() {
        java.io.File file = this.f44018c.f44022a;
        try {
            android.content.Context context = this.f44016a;
            android.content.Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            java.io.File file2 = new java.io.File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            file.toString();
            file2.toString();
            int i17 = this.f44017b | 1;
            this.f44017b = i17;
            this.f44018c = new com.facebook.soloader.f(file2, i17);
            this.f44016a = createPackageContext;
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.facebook.soloader.d0
    public java.lang.String toString() {
        return this.f44018c.toString();
    }
}
