package com.tencent.mm.feature.performance;

/* loaded from: classes11.dex */
public class s2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        long j17 = ((com.tencent.mm.ipcinvoker.type.IPCLong) obj).f68405d;
        boolean z17 = mm.w.f328542a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "noteLightPushTimeDelegate: " + j17);
        mm.w.f328544c = mm.w.f328544c + j17;
    }
}
