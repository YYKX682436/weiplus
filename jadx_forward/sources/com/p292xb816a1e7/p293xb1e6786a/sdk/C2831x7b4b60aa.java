package com.p292xb816a1e7.p293xb1e6786a.sdk;

/* renamed from: com.huawei.easygo.sdk.EasyGo */
/* loaded from: classes13.dex */
public final class C2831x7b4b60aa {
    private static final java.lang.String TAG = "EasyGo";

    /* renamed from: mEasyGoManager */
    private com.huawei.easygo.manager.EasyGoManager f9658x7720ec56;

    public C2831x7b4b60aa(android.content.Context context) {
        this.f9658x7720ec56 = null;
        if (m21059xa5830a66(context) == 0) {
            this.f9658x7720ec56 = new com.huawei.easygo.manager.EasyGoManager(context);
        }
    }

    /* renamed from: assembleInitFailRet */
    private java.util.List<java.lang.Integer> m21058x48f70041(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return java.util.Collections.nCopies(strArr.length, 507);
    }

    /* renamed from: getRomSupStatus */
    private int m21059xa5830a66(android.content.Context context) {
        try {
            return new com.huawei.easygo.manager.EasyGoManager(context).getRomSupStatus(context, "1.0.2");
        } catch (java.lang.Exception unused) {
            return 509;
        } catch (java.lang.NoClassDefFoundError unused2) {
            return 506;
        } catch (java.lang.SecurityException unused3) {
            return 508;
        }
    }

    /* renamed from: init */
    public java.util.List<java.lang.Integer> m21060x316510(java.lang.String[] strArr) {
        com.huawei.easygo.manager.EasyGoManager easyGoManager = this.f9658x7720ec56;
        return easyGoManager == null ? m21058x48f70041(strArr) : easyGoManager.init(strArr);
    }

    /* renamed from: invokeAsync */
    public void m21061x37e7d8e4(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle, com.p292xb816a1e7.p293xb1e6786a.p294xf5bc2045.InterfaceC2830xb884e798 interfaceC2830xb884e798) {
        com.huawei.easygo.manager.EasyGoManager easyGoManager = this.f9658x7720ec56;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.invokeAsync(str, str2, jSONObject, bundle, interfaceC2830xb884e798);
    }

    /* renamed from: invokeSync */
    public com.p292xb816a1e7.p293xb1e6786a.sdk.p297xc04ba66c.C2834xe8c72797 m21062x7572d733(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle) {
        com.huawei.easygo.manager.EasyGoManager easyGoManager = this.f9658x7720ec56;
        return easyGoManager == null ? new com.p292xb816a1e7.p293xb1e6786a.sdk.p297xc04ba66c.C2834xe8c72797(507, new android.os.Bundle()) : new com.p292xb816a1e7.p293xb1e6786a.sdk.p297xc04ba66c.C2834xe8c72797(easyGoManager.invokeSync(str, str2, jSONObject, bundle));
    }

    /* renamed from: release */
    public void m21063x41012807() {
        com.huawei.easygo.manager.EasyGoManager easyGoManager = this.f9658x7720ec56;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.release();
    }
}
