package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.jsapi.bio.face.d {
    private static final int CTRL_INDEX = 1262;
    private static final java.lang.String NAME = "startFacialEncryptionVerifyAndUploadVideo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bio.face.d, com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        this.f81338e = false;
        super.A(lVar, jSONObject, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bio.face.d
    public void D(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("face_flash_no_use_id_card", true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bio.face.d
    public java.lang.String E() {
        return NAME;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bio.face.d
    public boolean H() {
        return true;
    }
}
