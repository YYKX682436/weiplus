package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
final class te implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private te() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        dn.k kVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("appType", 0);
        int i18 = bundle.getInt("fileType", 0);
        java.lang.String key = bundle.getString("fileKey", "");
        java.lang.String string = bundle.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "");
        if (bundle.getBoolean("isCancel")) {
            if (((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37742xaa0a0de3(key, new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult()) == 0) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("ret", 3);
                rVar.a(bundle2);
                java.util.HashMap hashMap = i91.f.f371235a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                java.util.HashMap hashMap2 = i91.f.f371235a;
                dn.m mVar = (dn.m) hashMap2.get(key);
                if (mVar != null && (kVar = mVar.f323320f) != null) {
                    dn.g gVar = new dn.g();
                    gVar.f69496x83ec3dd = mVar.B1;
                    dn.h hVar = new dn.h();
                    hVar.f69553xb5f54fe9 = -10008;
                    kVar.r4(key, 0, gVar, hVar, false);
                }
                hashMap2.remove(key);
                return;
            }
            return;
        }
        byte[] byteArray = android.text.TextUtils.isEmpty(bundle.getString("fileDataKey", "")) ? bundle.getByteArray("fileData") : za1.b.f552411a.a(bundle.getString("fileDataKey"), true);
        java.lang.String string2 = bundle.getString("thumbFilePath", "");
        byte[] byteArray2 = android.text.TextUtils.isEmpty(bundle.getString("thumbFileDataKey", "")) ? bundle.getByteArray("thumbFileData") : za1.b.f552411a.a(bundle.getString("thumbFileDataKey"), true);
        boolean z17 = bundle.getBoolean("isStorageMode", true);
        bundle.getInt("snsUploadVersion", 1);
        dn.m mVar2 = new dn.m();
        mVar2.f323318d = "task_JsApiUploadToCommonCDN";
        mVar2.f69592xf1ebe47b = i18;
        mVar2.f69584x89a4c0cf = 2;
        mVar2.f69580x454032b6 = i17;
        mVar2.f69601xaca5bdda = key;
        mVar2.f69595x6d25b0d9 = string;
        mVar2.f69619xe9ed65f6 = string2;
        mVar2.f69606xccdbf540 = z17;
        if (byteArray != null) {
            mVar2.f323325m = byteArray;
        }
        if (byteArray2 != null) {
            mVar2.f323327o = byteArray2;
        }
        mVar2.f323320f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.se(this, rVar);
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar2)) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("ret", 2);
            rVar.a(bundle3);
        } else {
            java.util.HashMap hashMap3 = i91.f.f371235a;
            java.lang.String field_mediaId = mVar2.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            hashMap3.put(field_mediaId, mVar2);
        }
    }
}
