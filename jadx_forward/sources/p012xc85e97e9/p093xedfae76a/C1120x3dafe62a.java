package p012xc85e97e9.p093xedfae76a;

/* renamed from: androidx.lifecycle.ProcessLifecycleOwnerInitializer */
/* loaded from: classes13.dex */
public class C1120x3dafe62a extends android.content.ContentProvider {
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
        if (!p012xc85e97e9.p093xedfae76a.u.f93186a.getAndSet(true)) {
            ((android.app.Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new p012xc85e97e9.p093xedfae76a.t());
        }
        android.content.Context context2 = getContext();
        p012xc85e97e9.p093xedfae76a.q0 q0Var = p012xc85e97e9.p093xedfae76a.q0.f93173o;
        q0Var.getClass();
        q0Var.f93178h = new android.os.Handler();
        q0Var.f93179i.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        ((android.app.Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new p012xc85e97e9.p093xedfae76a.p0(q0Var));
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
