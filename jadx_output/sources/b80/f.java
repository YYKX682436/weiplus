package b80;

/* loaded from: classes12.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.mm.sdk.platformtools.t8.c(str2);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgUpload.SendImgPreFeatureService", "clearPrivacyFromExifInterface error:%s", e17.getMessage());
            com.tencent.mm.vfs.x6.a(str, str2, true);
        } catch (java.lang.IllegalArgumentException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgUpload.SendImgPreFeatureService", "clearPrivacyFromExifInterface error:%s", e18.getMessage());
            com.tencent.mm.vfs.x6.a(str, str2, true);
        }
    }
}
