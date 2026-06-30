package gm0;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gm0.h1 f354719e;

    public f1(gm0.h1 h1Var, java.lang.String str) {
        this.f354719e = h1Var;
        this.f354718d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f354718d;
        try {
            this.f354719e.getClass();
            java.io.File file = new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getExternalFilesDir(null), "external_used_mark");
            if (!file.exists()) {
                file.createNewFile();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindOutDataDisappeared", "Update private usage '%s'", str);
            com.p314xaae8f345.mm.vfs.w6.R(file.getAbsolutePath(), str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FindOutDataDisappeared", th6, "", new java.lang.Object[0]);
        }
    }
}
