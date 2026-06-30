package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class w1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.h2 f71152d;

    public w1(com.tencent.mm.modelcdntran.h2 h2Var) {
        this.f71152d = h2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportService", "cdnCallbackExecuteTimeReport onTimerExpired");
        com.tencent.mm.modelcdntran.h2.c(this.f71152d);
        return true;
    }
}
