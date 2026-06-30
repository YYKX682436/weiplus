package kl;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.io.InputStream f390239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f390240b;

    public b(java.lang.String str, boolean z17, java.lang.String str2) {
        if (z17) {
            this.f390240b = rl.a.f(str2, str);
        } else {
            this.f390240b = rl.a.a(str);
        }
        java.lang.Object[] objArr = {this.f390240b};
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioConvertCacheReader", "cacheFile:%s", objArr);
        try {
            this.f390239a = com.p314xaae8f345.mm.vfs.w6.C(rl.a.b(this.f390240b));
        } catch (java.io.FileNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioConvertCacheReader", e17, "VFSFileOp.openRead", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioConvertCacheReader", e18, "VFSFileOp.openRead", new java.lang.Object[0]);
        }
    }

    public byte[] a(int i17) {
        java.io.InputStream inputStream = this.f390239a;
        if (inputStream == null) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mix.AudioConvertCacheReader", "readPcmDataTrack, inputStream is null", null);
            return null;
        }
        if (i17 > 0) {
            byte[] bArr = new byte[i17];
            try {
                if (inputStream.read(bArr, 0, i17) > 0) {
                    return bArr;
                }
            } catch (java.lang.Exception e17) {
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioConvertCacheReader", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public void b() {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioConvertCacheReader", "release", null);
        try {
            java.io.InputStream inputStream = this.f390239a;
            if (inputStream != null) {
                inputStream.close();
                this.f390239a = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mix.AudioConvertCacheReader", e17, "inputStream close", new java.lang.Object[0]);
        }
    }
}
