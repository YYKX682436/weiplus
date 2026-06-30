package com.tencent.mm.feature.performance;

/* loaded from: classes11.dex */
public class t2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        int i17 = ((com.tencent.mm.ipcinvoker.type.IPCInteger) obj).f68404d;
        boolean z17 = mm.w.f328542a;
        mm.w.d("MicroMsg.NotifyPowerInspector", "notePushNetSceneDelegate: func=" + i17);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            mm.y yVar = mm.w.f328547f;
            if (yVar.b() || !mm.w.f328543b) {
                yVar.c(java.lang.String.valueOf(i17));
            }
        }
    }
}
