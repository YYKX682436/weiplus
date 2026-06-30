package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class se implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f82979d;

    public se(com.tencent.mm.plugin.appbrand.jsapi.te teVar, com.tencent.mm.ipcinvoker.r rVar) {
        this.f82979d = rVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String key, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        android.os.Bundle bundle;
        if (gVar != null) {
            long j17 = gVar.field_finishedLength;
            java.util.HashMap hashMap = i91.f.f289702a;
            kotlin.jvm.internal.o.g(key, "key");
            dn.m mVar = (dn.m) i91.f.f289702a.get(key);
            if (mVar != null) {
                mVar.B1 = j17;
            }
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f82979d;
        if (hVar != null) {
            int i18 = hVar.field_retCode;
            if (i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
                if (hVar.field_retCode == -10008) {
                    bundle = new android.os.Bundle();
                    bundle.putInt("ret", 4);
                    bundle.putLong("progress", gVar.field_finishedLength);
                } else {
                    bundle = new android.os.Bundle();
                    bundle.putInt("ret", 1);
                }
                rVar.a(bundle);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload success, media id : %s  file url=%s   thumb url=%s", key, hVar.field_fileUrl, hVar.field_thumbUrl);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ret", 0);
                bundle2.putString("fileUrl", hVar.field_fileUrl);
                bundle2.putString("thumbUrl", hVar.field_thumbUrl);
                rVar.a(bundle2);
            }
            java.util.HashMap hashMap2 = i91.f.f289702a;
            kotlin.jvm.internal.o.g(key, "key");
            i91.f.f289702a.remove(key);
        }
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ret", 1);
            rVar.a(bundle3);
            java.util.HashMap hashMap3 = i91.f.f289702a;
            kotlin.jvm.internal.o.g(key, "key");
            i91.f.f289702a.remove(key);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
