package com.tencent.mars.mm;

/* loaded from: classes12.dex */
public class AppManagerCallback implements com.tencent.mars.app.AppManager.CallBack {
    private static final java.lang.String TAG = "AppCallBack";
    private android.content.Context context;
    com.tencent.mars.app.AppManager.DeviceInfo info = new com.tencent.mars.app.AppManager.DeviceInfo(o45.wf.f343026d, wo.q.f447780a);

    public AppManagerCallback(android.content.Context context) {
        this.context = null;
        this.context = context;
    }

    private static java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public com.tencent.mars.app.AppManager.AccountInfo getAccountInfo() {
        com.tencent.mars.app.AppManager.AccountInfo accountInfo = new com.tencent.mars.app.AppManager.AccountInfo();
        if (com.tencent.mm.network.x2.c() != null && com.tencent.mm.network.x2.c().f71993n != null) {
            try {
                accountInfo.uin = com.tencent.mm.network.x2.c().f71993n.f71902o;
                java.lang.String str = com.tencent.mm.network.x2.c().f71993n.f71906s;
                accountInfo.userName = str;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    accountInfo.userName = com.tencent.mm.network.x2.c().f71993n.f71895e;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return accountInfo;
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public java.lang.String getAppFilePath() {
        android.content.Context context = this.context;
        if (context == null) {
            com.tencent.mars.mm.Assert.assertTrue(false);
            return null;
        }
        try {
            com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(context.getFilesDir());
            if (!j17.m()) {
                j17.k();
            }
            return j17.toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            com.tencent.mars.mm.Assert.assertTrue(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return "";
        }
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public java.lang.String getClientConfig(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public long getClientConfigID(java.lang.String str) {
        return j62.b.f().c(str);
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public int getClientVersion() {
        return o45.wf.f343029g;
    }

    @Override // com.tencent.mars.app.AppManager.CallBack
    public com.tencent.mars.app.AppManager.DeviceInfo getDeviceType() {
        return this.info;
    }
}
