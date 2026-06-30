package i11;

/* loaded from: classes4.dex */
public class z implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i11.u f368695e;

    public z(i11.u uVar, android.content.Context context) {
        this.f368695e = uVar;
        this.f368694d = context;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        android.database.Cursor cursor;
        boolean z17;
        i11.u uVar = this.f368695e;
        if (uVar.f368686b) {
            return java.lang.Boolean.FALSE;
        }
        uVar.f368686b = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.Context context = this.f368694d;
        try {
            cursor = context.getContentResolver().query(android.net.Uri.parse("content://com.vivo.permissionmanager.provider.permission/fuzzy_location_apps"), new java.lang.String[]{"package_name", "selected_fuzzy"}, "package_name=?", new java.lang.String[]{context.getPackageName()}, null);
            z17 = false;
            while (cursor != null) {
                try {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    if (cursor.getString(0) != null && cursor.getInt(1) == 1) {
                        z17 = true;
                    }
                } catch (java.lang.Throwable unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "check vivo coarse finish, " + z17 + ", " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    uVar.f368686b = false;
                    return java.lang.Boolean.valueOf(z17);
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SLocationManager", "check vivo coarse finish, " + z17 + ", " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        uVar.f368686b = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
