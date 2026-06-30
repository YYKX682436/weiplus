package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f280409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f280410g;

    public c7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f280410g = f7Var;
        this.f280407d = str;
        this.f280408e = str2;
        this.f280409f = z3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f280407d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int d17 = c01.h2.d(str, c01.e2.f118653d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var = this.f280410g;
        f7Var.f280560t = d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChattingReportComponent", "dkchatmsg:name:%s unRead:%s entryTime:%s(%s)", str, java.lang.Integer.valueOf(d17), new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date(f7Var.f280558r)), java.lang.Long.valueOf(f7Var.f280558r));
        f7Var.f280113d.getClass();
        java.lang.String str2 = this.f280408e;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str2)) {
            int i17 = this.f280409f.T;
        }
    }
}
