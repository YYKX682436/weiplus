package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.scheduler.z f67675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.feature.performance.scheduler.z zVar) {
        super(0);
        this.f67675d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.feature.performance.scheduler.z zVar = this.f67675d;
        java.util.LinkedList<com.tencent.mm.feature.performance.scheduler.n> linkedList = zVar.f67727b;
        if (!(linkedList instanceof java.util.Collection) || !linkedList.isEmpty()) {
            for (com.tencent.mm.feature.performance.scheduler.n nVar : linkedList) {
                boolean R0 = nVar.R0();
                com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "check " + zVar.f67726a + ": " + nVar.getClass() + ' ' + R0 + ' ');
                if (!R0) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        return java.lang.Boolean.valueOf(z17);
    }
}
