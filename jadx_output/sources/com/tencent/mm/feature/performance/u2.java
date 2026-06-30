package com.tencent.mm.feature.performance;

/* loaded from: classes11.dex */
public class u2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        boolean z17 = mm.w.f328542a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NotifyPowerInspector", "pushNotifyDelegate: func=" + i17);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            mm.y yVar = mm.w.f328545d;
            if (yVar.b() || !mm.w.f328543b) {
                yVar.c(java.lang.String.valueOf(i17));
            }
        }
    }
}
