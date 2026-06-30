package a02;

/* loaded from: classes7.dex */
public class a extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f81908a;

    public a(java.lang.String str) {
        super(kk.w.a(str, false), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ia.f34362x366c91de);
        this.f81908a = str;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DownloadsObserver", "path should be null");
            return;
        }
        java.lang.String str2 = this.f81908a + str;
        if (i17 == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DownloadsObserver", "close write file: %s", str2);
            return;
        }
        if (i17 == 32) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DownloadsObserver", "open file: %s", str2);
        } else if (i17 == 64) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DownloadsObserver", "move from file: %s", str2);
        } else {
            if (i17 != 512) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DownloadsObserver", "delete file: %s", str2);
        }
    }
}
