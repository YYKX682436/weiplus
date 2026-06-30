package gr2;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f356305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 f356306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f356307f;

    public h0(byte[] bArr, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393, java.lang.ref.WeakReference weakReference) {
        this.f356305d = bArr;
        this.f356306e = c14572x50388393;
        this.f356307f = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = this.f356305d;
        java.lang.String str = bArr != null ? new java.lang.String(bArr, r26.c.f450398a) : null;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393 c14572x50388393 = this.f356306e;
        boolean z17 = true;
        c14572x50388393.r("handleSeiMessage seiData:" + bArr + " seiMessage:" + str, 1);
        if (str != null && r26.n0.B(str, "TencentStreamSEI", false)) {
            return;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("wxT");
            if (optInt == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("d"))) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14572x50388393.a(c14572x50388393, optInt, jSONObject, this.f356307f);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VoiceRoomLinkMicView", e17, "", new java.lang.Object[0]);
        }
    }
}
