package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85854d;

    public y(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85854d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.media.record.a0 a0Var = this.f85854d;
        long j17 = a0Var.f85790l;
        a0Var.n();
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "startTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.appbrand.media.record.t(a0Var), false);
        a0Var.f85788j = b4Var;
        b4Var.c(j17, j17);
    }
}
