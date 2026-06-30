package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final /* synthetic */ class NotifyReceiver$NotifyService$$f implements com.tencent.mm.booter.y0 {
    @Override // com.tencent.mm.booter.y0
    public final void a(long j17, java.lang.String str) {
        synchronized (com.tencent.mm.booter.NotifyReceiver.f63261e) {
            if (com.tencent.mm.booter.NotifyReceiver.f63257a == null) {
                com.tencent.mm.booter.NotifyReceiver.f63257a = new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.sdk.platformtools.x2.f193071a, "MicroMsg.NotifyReceiver");
            }
        }
        com.tencent.mm.booter.NotifyReceiver.f63257a.lock(j17, str);
    }
}
