package androidx.startup;

/* loaded from: classes12.dex */
public class InitializationProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            throw new r4.c("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        if (r4.a.f369491d == null) {
            synchronized (r4.a.f369492e) {
                if (r4.a.f369491d == null) {
                    r4.a.f369491d = new r4.a(context);
                }
            }
        }
        r4.a aVar = r4.a.f369491d;
        android.content.Context context2 = aVar.f369495c;
        try {
            t4.a.f("Startup");
            aVar.a(context2.getPackageManager().getProviderInfo(new android.content.ComponentName(context2.getPackageName(), androidx.startup.InitializationProvider.class.getName()), 128).metaData);
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new r4.c(e17);
        }
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.IllegalStateException("Not allowed.");
    }
}
