package p012xc85e97e9.p102x5f27bff;

/* renamed from: androidx.profileinstaller.ProfileInstallReceiver */
/* loaded from: classes13.dex */
public class C1159xd563dbe1 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            j4.i.b(context, new j4.ExecutorC28999x2e755c(), new j4.f(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            java.lang.String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string)) {
                if ("DELETE_SKIP_FILE".equals(string)) {
                    new java.io.File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    setResultCode(11);
                    return;
                }
                return;
            }
            try {
                j4.i.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                setResultCode(10);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                setResultCode(7);
            }
        }
    }
}
