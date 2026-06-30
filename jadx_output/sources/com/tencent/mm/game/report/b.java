package com.tencent.mm.game.report;

@mk0.a
/* loaded from: classes8.dex */
class b implements com.tencent.mm.ipcinvoker.j {
    private b() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.game.report.c.f((com.tencent.mm.game.report.api.GameWebPerformanceInfo) obj);
        if (rVar != null) {
            rVar.a(null);
        }
    }
}
