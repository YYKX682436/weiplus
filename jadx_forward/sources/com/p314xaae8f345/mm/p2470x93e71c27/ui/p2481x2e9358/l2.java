package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2 f271993e;

    public l2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2 m2Var, java.lang.String str) {
        this.f271993e = m2Var;
        this.f271992d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f271992d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "onTxtMsgSend, msg is null or nil? %s.", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m2 m2Var = this.f271993e;
        if (m2Var.f272015a.f271623x0 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        m2Var.f272015a.f271623x0.d(str);
    }
}
