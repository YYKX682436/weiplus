package com.p284x36a29809.p285xb1e6786a.sdk;

/* renamed from: com.hihonor.easygo.sdk.EasyGo */
/* loaded from: classes13.dex */
public final class C2821x7b4b60aa {
    private static final java.lang.String TAG = "EasyGo";

    /* renamed from: mEasyGoManager */
    private com.hihonor.easygo.manager.EasyGoManager f9467x7720ec56;

    public C2821x7b4b60aa(android.content.Context context) {
        this.f9467x7720ec56 = null;
        if (m20991xa5830a66(context) == 0) {
            this.f9467x7720ec56 = new com.hihonor.easygo.manager.EasyGoManager(context);
        }
    }

    /* renamed from: assembleInitFailRet */
    private java.util.List<java.lang.Integer> m20990x48f70041(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return java.util.Collections.nCopies(strArr.length, 507);
    }

    /* renamed from: getRomSupStatus */
    private int m20991xa5830a66(android.content.Context context) {
        try {
            return new com.hihonor.easygo.manager.EasyGoManager(context).getRomSupStatus(context, "1.0.2");
        } catch (java.lang.Exception unused) {
            return 509;
        } catch (java.lang.NoClassDefFoundError unused2) {
            return 506;
        } catch (java.lang.SecurityException unused3) {
            return 508;
        }
    }

    /* renamed from: init */
    public java.util.List<java.lang.Integer> m20992x316510(java.lang.String[] strArr) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.f9467x7720ec56;
        return easyGoManager == null ? m20990x48f70041(strArr) : easyGoManager.init(strArr);
    }

    /* renamed from: invokeAsync */
    public void m20993x37e7d8e4(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle, com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 interfaceC2820xb884e798) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.f9467x7720ec56;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.invokeAsync(str, str2, jSONObject, bundle, interfaceC2820xb884e798);
    }

    /* renamed from: invokeSync */
    public com.p284x36a29809.p285xb1e6786a.sdk.p289xc04ba66c.C2824xe8c72797 m20994x7572d733(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.f9467x7720ec56;
        return easyGoManager == null ? new com.p284x36a29809.p285xb1e6786a.sdk.p289xc04ba66c.C2824xe8c72797(507, new android.os.Bundle()) : new com.p284x36a29809.p285xb1e6786a.sdk.p289xc04ba66c.C2824xe8c72797(easyGoManager.invokeSync(str, str2, jSONObject, bundle));
    }

    /* renamed from: release */
    public void m20995x41012807() {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.f9467x7720ec56;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.release();
    }
}
