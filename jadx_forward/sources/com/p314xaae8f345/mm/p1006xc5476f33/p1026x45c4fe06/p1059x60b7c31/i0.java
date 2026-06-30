package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m f162828a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        this.f162828a = mVar;
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invokeHandler */
    public java.lang.String m51006x304a33b2(java.lang.String str, java.lang.String str2, int i17) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f162828a;
            return mVar == null ? "" : mVar.p0(str, str2, "", i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSInterface", e17, "invokeHandler", new java.lang.Object[0]);
            throw e17;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: invokeHandler2 */
    public java.lang.String m51007xd8fc42c0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f162828a;
            return mVar == null ? "" : mVar.p0(str, str2, str3, i17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSInterface", e17, "invokeHandler", new java.lang.Object[0]);
            throw e17;
        }
    }

    @android.webkit.JavascriptInterface
    /* renamed from: publishHandler */
    public void m51008x2242533b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = this.f162828a;
            if (mVar == null) {
                return;
            }
            int[] iArr = new int[0];
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
                iArr = new int[jSONArray.length()];
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    iArr[i17] = jSONArray.getInt(i17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJSInterface", e17.getMessage());
            }
            mVar.d(str, str2, iArr);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandJSInterface", e18, "publishHandler", new java.lang.Object[0]);
            throw e18;
        }
    }
}
