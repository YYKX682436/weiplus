package b80;

/* loaded from: classes12.dex */
public final class f {
    public f(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c(str2);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgUpload.SendImgPreFeatureService", "clearPrivacyFromExifInterface error:%s", e17.getMessage());
            com.p314xaae8f345.mm.vfs.x6.a(str, str2, true);
        } catch (java.lang.IllegalArgumentException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgUpload.SendImgPreFeatureService", "clearPrivacyFromExifInterface error:%s", e18.getMessage());
            com.p314xaae8f345.mm.vfs.x6.a(str, str2, true);
        }
    }
}
