package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class se implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f164512d;

    public se(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.te teVar, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f164512d = rVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String key, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        android.os.Bundle bundle;
        if (gVar != null) {
            long j17 = gVar.f69496x83ec3dd;
            java.util.HashMap hashMap = i91.f.f371235a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            dn.m mVar = (dn.m) i91.f.f371235a.get(key);
            if (mVar != null) {
                mVar.B1 = j17;
            }
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f164512d;
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, retCode:%d sceneResult[%s]", java.lang.Integer.valueOf(i18), hVar);
                if (hVar.f69553xb5f54fe9 == -10008) {
                    bundle = new android.os.Bundle();
                    bundle.putInt("ret", 4);
                    bundle.putLong("progress", gVar.f69496x83ec3dd);
                } else {
                    bundle = new android.os.Bundle();
                    bundle.putInt("ret", 1);
                }
                rVar.a(bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload success, media id : %s  file url=%s   thumb url=%s", key, hVar.f69524x419c440e, hVar.f69560x7b284d5e);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ret", 0);
                bundle2.putString("fileUrl", hVar.f69524x419c440e);
                bundle2.putString("thumbUrl", hVar.f69560x7b284d5e);
                rVar.a(bundle2);
            }
            java.util.HashMap hashMap2 = i91.f.f371235a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            i91.f.f371235a.remove(key);
        }
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadToCommonCDN", "cdn upload failed, startRet : %d", java.lang.Integer.valueOf(i17));
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ret", 1);
            rVar.a(bundle3);
            java.util.HashMap hashMap3 = i91.f.f371235a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            i91.f.f371235a.remove(key);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
