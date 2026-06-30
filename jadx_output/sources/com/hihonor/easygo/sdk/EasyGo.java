package com.hihonor.easygo.sdk;

/* loaded from: classes13.dex */
public final class EasyGo {
    private static final java.lang.String TAG = "EasyGo";
    private com.hihonor.easygo.manager.EasyGoManager mEasyGoManager;

    public EasyGo(android.content.Context context) {
        this.mEasyGoManager = null;
        if (getRomSupStatus(context) == 0) {
            this.mEasyGoManager = new com.hihonor.easygo.manager.EasyGoManager(context);
        }
    }

    private java.util.List<java.lang.Integer> assembleInitFailRet(java.lang.String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return java.util.Collections.nCopies(strArr.length, 507);
    }

    private int getRomSupStatus(android.content.Context context) {
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

    public java.util.List<java.lang.Integer> init(java.lang.String[] strArr) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.mEasyGoManager;
        return easyGoManager == null ? assembleInitFailRet(strArr) : easyGoManager.init(strArr);
    }

    public void invokeAsync(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle, com.hihonor.easygo.callback.IEasyGoCallback iEasyGoCallback) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.invokeAsync(str, str2, jSONObject, bundle, iEasyGoCallback);
    }

    public com.hihonor.easygo.sdk.module.EasyGoRet invokeSync(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject, android.os.Bundle bundle) {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.mEasyGoManager;
        return easyGoManager == null ? new com.hihonor.easygo.sdk.module.EasyGoRet(507, new android.os.Bundle()) : new com.hihonor.easygo.sdk.module.EasyGoRet(easyGoManager.invokeSync(str, str2, jSONObject, bundle));
    }

    public void release() {
        com.hihonor.easygo.manager.EasyGoManager easyGoManager = this.mEasyGoManager;
        if (easyGoManager == null) {
            return;
        }
        easyGoManager.release();
    }
}
