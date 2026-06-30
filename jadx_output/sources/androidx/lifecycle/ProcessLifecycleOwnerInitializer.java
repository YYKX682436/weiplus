package androidx.lifecycle;

/* loaded from: classes13.dex */
public class ProcessLifecycleOwnerInitializer extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        android.content.Context context = getContext();
        if (!androidx.lifecycle.u.f11653a.getAndSet(true)) {
            ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new androidx.lifecycle.t());
        }
        android.content.Context context2 = getContext();
        androidx.lifecycle.q0 q0Var = androidx.lifecycle.q0.f11640o;
        q0Var.getClass();
        q0Var.f11645h = new android.os.Handler();
        q0Var.f11646i.f(androidx.lifecycle.m.ON_CREATE);
        ((android.app.Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new androidx.lifecycle.p0(q0Var));
        return true;
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
