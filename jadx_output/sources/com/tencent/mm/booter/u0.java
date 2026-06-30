package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class u0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public static long f63576d;

    public final void a(long j17) {
        if (((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.network.x2.j()).getBoolean("is_in_notify_mode", false)) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper()).postDelayed(new com.tencent.mm.booter.s0(this), j17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015d, code lost:
    
        ((java.util.concurrent.locks.ReentrantLock) com.tencent.mm.booter.NotifyReceiver.f63260d).unlock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        throw r0;
     */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r22, int r23, java.lang.String r24, com.tencent.mm.modelbase.m1 r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.booter.u0.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
