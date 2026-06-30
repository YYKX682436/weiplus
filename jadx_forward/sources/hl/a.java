package hl;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f363545a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f363546b;

    public a(java.lang.String str, java.lang.String str2) {
        java.lang.String f17 = rl.a.f(str, str2);
        this.f363546b = f17;
        java.lang.Object[] objArr = {str2, f17};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "AudioPcmCacheFile mUrl:%s, fileName:%s,", objArr);
    }

    public synchronized void a() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "close", null);
        java.io.RandomAccessFile randomAccessFile = this.f363545a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "close RandomAccessFile error ", "" + e17.getMessage());
            }
        }
    }

    public synchronized int b() {
        java.io.RandomAccessFile randomAccessFile = this.f363545a;
        if (randomAccessFile == null) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "getLength error, randomAccessFile is null", null);
            return -1;
        }
        try {
            return (int) randomAccessFile.length();
        } catch (java.io.IOException e17) {
            java.lang.Object[] objArr = {"" + e17.getMessage()};
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "Error get length of file , err %s", objArr);
            return -1;
        }
    }
}
