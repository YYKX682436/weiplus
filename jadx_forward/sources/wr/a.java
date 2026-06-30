package wr;

/* loaded from: classes4.dex */
public final class a implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.b f530260d;

    public a(wr.b bVar) {
        this.f530260d = bVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        byte[] bArr;
        jz5.f0 f0Var;
        byte[] bArr2;
        boolean z17 = c2CDownloadResult != null && c2CDownloadResult.f17871x139cb015 == 0;
        wr.b bVar = this.f530260d;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("failed to download thumb. id: ");
            sb6.append(bVar.b());
            sb6.append(", error code: ");
            sb6.append(c2CDownloadResult != null ? java.lang.Integer.valueOf(c2CDownloadResult.f17871x139cb015) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageCdnDownloader", sb6.toString());
            bVar.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageCdnDownloader", "succeeded in downloading thumb. id: " + bVar.b());
        java.lang.String str2 = bVar.f530264d;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageCdnDownloader", "download ok but file not exist for thumb. id: " + bVar.b());
            bVar.a();
            return;
        }
        java.lang.String key = bVar.f530263c;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(key);
        yz5.p pVar = bVar.f530265e;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageCdnDownloader", "no need to decrypt since input aeskey is empty");
            if (pVar != null) {
                pVar.mo149xb9724478(bVar.b(), java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1);
        kk.a aVar = kk.a.f389997a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        try {
            if (key.length() < 1) {
                bArr2 = null;
            } else {
                bArr2 = new byte[key.length() / 2];
                for (int i17 = 0; i17 < key.length() / 2; i17++) {
                    int i18 = i17 * 2;
                    int i19 = i18 + 1;
                    bArr2[i17] = (byte) ((java.lang.Integer.parseInt(key.substring(i18, i19), 16) * 16) + java.lang.Integer.parseInt(key.substring(i19, i18 + 2), 16));
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr2);
            bArr = aVar.a(N, bArr2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AESGCMUtils", e17, "failed to decypt aes-gcm-128 data. " + e17.getMessage(), new java.lang.Object[0]);
            bArr = null;
        }
        com.p314xaae8f345.mm.vfs.w6.h(str2);
        if (bArr != null) {
            if (true ^ (bArr.length == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb ok. id: " + bVar.b());
                com.p314xaae8f345.mm.vfs.w6.S(str2, bArr, 0, bArr.length);
                if (pVar != null) {
                    pVar.mo149xb9724478(bVar.b(), java.lang.Boolean.TRUE);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb failed. id: " + bVar.b());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EmoticonThumbImageCdnDownloader", "decypt downloaded thumb failed. id: " + bVar.b());
        }
        bVar.a();
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
    }
}
