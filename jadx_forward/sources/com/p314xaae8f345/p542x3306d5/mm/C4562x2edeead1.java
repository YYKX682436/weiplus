package com.p314xaae8f345.p542x3306d5.mm;

/* renamed from: com.tencent.mars.mm.AppManagerCallback */
/* loaded from: classes12.dex */
public class C4562x2edeead1 implements com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack {
    private static final java.lang.String TAG = "AppCallBack";

    /* renamed from: context */
    private android.content.Context f19376x38b735af;

    /* renamed from: info */
    com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo f19377x3164ae = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo(o45.wf.f424559d, wo.q.f529313a);

    public C4562x2edeead1(android.content.Context context) {
        this.f19376x38b735af = null;
        this.f19376x38b735af = context;
    }

    /* renamed from: exception2String */
    private static java.lang.String m40178x6cf4e7b4(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getAccountInfo */
    public com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo mo652xd71cb45() {
        com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo accountInfo = new com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo();
        if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c() != null && com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n != null) {
            try {
                accountInfo.uin = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o;
                java.lang.String str = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153439s;
                accountInfo.f17597xf01afcf6 = str;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    accountInfo.f17597xf01afcf6 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153428e;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return accountInfo;
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getAppFilePath */
    public java.lang.String mo653xda9123cc() {
        android.content.Context context = this.f19376x38b735af;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.mm.C4563x75755f66.m40180x7ca149f4(false);
            return null;
        }
        try {
            com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(context.getFilesDir());
            if (!j17.m()) {
                j17.k();
            }
            return j17.m82469x9616526c();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, m40178x6cf4e7b4(e17));
            com.p314xaae8f345.p542x3306d5.mm.C4563x75755f66.m40179x7ca149f4(e17.getClass().getSimpleName() + ":" + e17.getStackTrace()[0] + ", " + e17.getStackTrace()[1], false);
            return "";
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientConfig */
    public java.lang.String mo654xeff8b163(java.lang.String str, java.lang.String str2) {
        return j62.e.g().j(str, str2, true, true);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientConfigID */
    public long mo655xd491edbe(java.lang.String str) {
        return j62.b.f().c(str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getClientVersion */
    public int mo656xeb61b2d7() {
        return o45.wf.f424562g;
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack
    /* renamed from: getDeviceType */
    public com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo mo657x1cd0bea6() {
        return this.f19377x3164ae;
    }
}
