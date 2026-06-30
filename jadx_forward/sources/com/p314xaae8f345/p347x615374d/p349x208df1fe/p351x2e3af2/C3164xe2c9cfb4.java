package com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2;

/* renamed from: com.tencent.kinda.framework.boot.KindaApp */
/* loaded from: classes9.dex */
public class C3164xe2c9cfb4 {
    private static final java.lang.String TAG = "MicroMsg.Kinda.KindaApp";

    /* renamed from: instance */
    private static com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4 f12199x21169495;

    /* renamed from: appModuleManager */
    private com.p314xaae8f345.p347x615374d.p361xcbf79e0a.C3643xd1ddb44d f12200x99592300;

    /* renamed from: kinda */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515 f12201x615374d;

    /* renamed from: threadHandler */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.u3 f12202x30c2e1e0;

    private C3164xe2c9cfb4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "create kinda app");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(782, 30);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.m24753x8090dc3a();
        com.p314xaae8f345.p347x615374d.p361xcbf79e0a.C3643xd1ddb44d c3643xd1ddb44d = new com.p314xaae8f345.p347x615374d.p361xcbf79e0a.C3643xd1ddb44d();
        this.f12200x99592300 = c3643xd1ddb44d;
        c3643xd1ddb44d.m28553xd8c9faef(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p355x2e06d1.C3226x7e014faf());
        this.f12200x99592300.m28553xd8c9faef(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p355x2e06d1.C3225x5559da83());
        this.f12200x99592300.m28553xd8c9faef(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.pay.C3262x603c1f06());
        this.f12200x99592300.m28551x3857fc3d();
        this.f12201x615374d = com.p314xaae8f345.p347x615374d.gen.C3579x20b67303.m28280x9cf0d20b();
    }

    /* renamed from: appKinda */
    public static com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515 m25546x447cf9ac() {
        return m25547x21169495().f12201x615374d;
    }

    /* renamed from: instance */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4 m25547x21169495() {
        if (f12199x21169495 == null) {
            synchronized (com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.class) {
                if (f12199x21169495 == null) {
                    f12199x21169495 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4();
                }
            }
        }
        return f12199x21169495;
    }

    /* renamed from: reportFatalError */
    public static void m25548xdaaf6fb8(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String errorMsg = stringWriter.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "reportFatalError stack : " + errorMsg);
        if (errorMsg.length() > 6000) {
            errorMsg = errorMsg.substring(0, 6000);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24610, "6", "1", "1", errorMsg);
    }

    /* renamed from: checkIfNeedRequestUserBindqueryWhenUnBindCard */
    public void m25549xcebbfc8c(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkIfNeedRequestUserBindqueryWhenUnBindCard bindserial : %s", str);
        this.f12201x615374d.mo27482xcebbfc8c(str);
    }

    /* renamed from: checkIfNeedUpdateOfflinePayToken */
    public void m25550x68e57170() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checkIfNeedUpdateOfflinePayToken");
        this.f12201x615374d.mo27483x68e57170();
    }

    /* renamed from: notifyAllUseCases */
    public void m25551xd92017b4(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "notifyAllUseCases");
        this.f12201x615374d.mo27491xd92017b4(abstractC3411xcfaed72e);
    }

    /* renamed from: onBackground */
    public void m25552x77b5b46d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onBackground");
        this.f12201x615374d.mo27476x74edf2b6();
    }

    /* renamed from: onCreate */
    public void m25553x3e5a77bb() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.C3096x7fe29b3d.m24753x8090dc3a();
        this.f12200x99592300.m28552x3c20675e();
    }

    /* renamed from: onForeground */
    public void m25554x3d65c882() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onForeground");
        this.f12201x615374d.mo27477x3a9e06cb();
    }

    /* renamed from: reInitModule */
    public void m25555xa70df22f() {
        com.p314xaae8f345.p347x615374d.p361xcbf79e0a.C3643xd1ddb44d c3643xd1ddb44d = this.f12200x99592300;
        if (c3643xd1ddb44d != null) {
            c3643xd1ddb44d.m28551x3857fc3d();
            this.f12201x615374d = com.p314xaae8f345.p347x615374d.gen.AbstractC3403x8fdb0515.m27474x9cf0d20b();
        }
    }

    /* renamed from: releaseAppKinda */
    public void m25556xb78f8ed3() {
        this.f12201x615374d = null;
    }

    /* renamed from: updateOfflinePayDefaultCard */
    public void m25557x361c2aa3(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "updateOfflinePayDefaultCard, bindserial : %s", str);
        this.f12201x615374d.mo27499x361c2aa3(str, str2);
    }

    /* renamed from: updateOfflinePayTokenFromScene */
    public void m25558x6b373617(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "updateOfflinePayTokenFromScene : %s", java.lang.Integer.valueOf(i17));
        this.f12201x615374d.mo27500x9cceee7b(i17);
    }
}
