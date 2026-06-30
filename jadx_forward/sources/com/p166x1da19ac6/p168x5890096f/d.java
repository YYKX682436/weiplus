package com.p166x1da19ac6.p168x5890096f;

/* loaded from: classes13.dex */
public class d extends com.p166x1da19ac6.p168x5890096f.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f125549a;

    /* renamed from: b, reason: collision with root package name */
    public int f125550b;

    /* renamed from: c, reason: collision with root package name */
    public com.p166x1da19ac6.p168x5890096f.f f125551c;

    public d(android.content.Context context, int i17) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f125549a = applicationContext;
        if (applicationContext == null) {
            java.lang.String str = context.getApplicationInfo().nativeLibraryDir;
            this.f125549a = context;
        }
        this.f125550b = i17;
        this.f125551c = new com.p166x1da19ac6.p168x5890096f.f(new java.io.File(this.f125549a.getApplicationInfo().nativeLibraryDir), i17);
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    public int a(java.lang.String str, int i17, android.os.StrictMode.ThreadPolicy threadPolicy) {
        return this.f125551c.a(str, i17, threadPolicy);
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    public void b(int i17) {
        this.f125551c.b(i17);
    }

    public boolean c() {
        java.io.File file = this.f125551c.f125555a;
        try {
            android.content.Context context = this.f125549a;
            android.content.Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            java.io.File file2 = new java.io.File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            file.toString();
            file2.toString();
            int i17 = this.f125550b | 1;
            this.f125550b = i17;
            this.f125551c = new com.p166x1da19ac6.p168x5890096f.f(file2, i17);
            this.f125549a = createPackageContext;
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.p166x1da19ac6.p168x5890096f.d0
    /* renamed from: toString */
    public java.lang.String mo16739x9616526c() {
        return this.f125551c.mo16739x9616526c();
    }
}
