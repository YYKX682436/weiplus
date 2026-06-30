package a02;

/* loaded from: classes7.dex */
public class a extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f375a;

    public a(java.lang.String str) {
        super(kk.w.a(str, false), com.tencent.mm.plugin.appbrand.jsapi.ia.CTRL_INDEX);
        this.f375a = str;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("DownloadsObserver", "path should be null");
            return;
        }
        java.lang.String str2 = this.f375a + str;
        if (i17 == 8) {
            com.tencent.mars.xlog.Log.i("DownloadsObserver", "close write file: %s", str2);
            return;
        }
        if (i17 == 32) {
            com.tencent.mars.xlog.Log.i("DownloadsObserver", "open file: %s", str2);
        } else if (i17 == 64) {
            com.tencent.mars.xlog.Log.i("DownloadsObserver", "move from file: %s", str2);
        } else {
            if (i17 != 512) {
                return;
            }
            com.tencent.mars.xlog.Log.i("DownloadsObserver", "delete file: %s", str2);
        }
    }
}
