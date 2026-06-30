package uv5;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static uv5.c f513005d;

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f513006a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f513007b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f513008c;

    public c(android.content.Context context) {
        this.f513006a = null;
        this.f513007b = null;
        this.f513008c = null;
        this.f513008c = context;
        this.f513006a = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104683x2b412f87(context), "patch.retry");
        this.f513007b = new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104683x2b412f87(context), "temp.apk");
    }

    public static uv5.c b(android.content.Context context) {
        if (f513005d == null) {
            f513005d = new uv5.c(context);
        }
        return f513005d;
    }

    public final void a(java.io.File file) {
        java.lang.String absolutePath = file.getAbsolutePath();
        java.io.File file2 = this.f513007b;
        if (absolutePath.equals(file2.getAbsolutePath())) {
            return;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "try copy file: %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        try {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104668x757a1d3(file, file2);
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.UpgradePatchRetry", "fail to copy file: %s to %s", file.getAbsolutePath(), file2.getAbsolutePath());
        }
    }

    public boolean c(java.lang.String str) {
        int parseInt;
        java.io.File file = this.f513006a;
        if (!file.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck retry file is not exist, just return", new java.lang.Object[0]);
            return true;
        }
        if (str == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck md5 is null, just return", new java.lang.Object[0]);
            return true;
        }
        uv5.b a17 = uv5.b.a(file);
        if (!str.equals(a17.f513003a) || (parseInt = java.lang.Integer.parseInt(a17.f513004b)) < 20) {
            return true;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchListenerCheck, retry count %d must exceed than max retry count", java.lang.Integer.valueOf(parseInt));
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134(this.f513007b);
        return false;
    }

    public boolean d(java.lang.String str) {
        java.io.File file = this.f513006a;
        if (!file.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck retry file is not exist, just return", new java.lang.Object[0]);
            return true;
        }
        if (str == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck md5 is null, just return", new java.lang.Object[0]);
            return true;
        }
        uv5.b a17 = uv5.b.a(file);
        if (str.equals(a17.f513003a)) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.UpgradePatchRetry", "onPatchResetMaxCheck, reset max check to 1", new java.lang.Object[0]);
            a17.f513004b = "1";
            uv5.b.b(file, a17);
        }
        return true;
    }
}
