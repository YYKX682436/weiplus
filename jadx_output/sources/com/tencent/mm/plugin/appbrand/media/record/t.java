package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes15.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.media.record.a0 f85848d;

    public t(com.tencent.mm.plugin.appbrand.media.record.a0 a0Var) {
        this.f85848d = a0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecordMgr", "timer, onTimerExpired to stop record");
        this.f85848d.m();
        return true;
    }
}
