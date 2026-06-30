package com.p314xaae8f345.p2841xd11c237d.mm;

/* renamed from: com.tencent.paymars.mm.AppManagerCallback */
/* loaded from: classes12.dex */
public class C23012x2edeead1 implements com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack {
    private static final java.lang.String TAG = "AppCallBack";

    /* renamed from: context */
    private android.content.Context f40084x38b735af;

    /* renamed from: info */
    com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.DeviceInfo f40085x3164ae = new com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.DeviceInfo(o45.wf.f424559d, wo.q.f529313a);

    public C23012x2edeead1(android.content.Context context) {
        this.f40084x38b735af = null;
        this.f40084x38b735af = context;
    }

    /* renamed from: exception2String */
    private static java.lang.String m84282x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack
    /* renamed from: getAccountInfo */
    public com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.AccountInfo mo84258xd71cb45() {
        com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.AccountInfo accountInfo = new com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.AccountInfo();
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() != null && com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n != null) {
            try {
                accountInfo.uin = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
                java.lang.String str = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153439s;
                accountInfo.f40078xf01afcf6 = str;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    accountInfo.f40078xf01afcf6 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153428e;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return accountInfo;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack
    /* renamed from: getAppFilePath */
    public java.lang.String mo84259xda9123cc() {
        if (this.f40084x38b735af == null) {
            com.p314xaae8f345.p2841xd11c237d.mm.C23013x75755f66.m84284x7ca149f4(false);
            return null;
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f40084x38b735af.getFilesDir().getPath() + "/pay");
            if (!r6Var.m()) {
                r6Var.J();
            }
            return r6Var.m82469x9616526c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m84282x6cf4e7b4(e17));
            com.p314xaae8f345.p2841xd11c237d.mm.C23013x75755f66.m84283x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return "";
        }
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack
    /* renamed from: getClientConfig */
    public java.lang.String mo84260xeff8b163(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack
    /* renamed from: getClientVersion */
    public int mo84261xeb61b2d7() {
        return o45.wf.f424562g;
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack
    /* renamed from: getDeviceType */
    public com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.DeviceInfo mo84262x1cd0bea6() {
        return this.f40085x3164ae;
    }
}
