package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f159100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(boolean z17) {
        super(0);
        this.f159100d = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean e17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11535xa1a2514c().e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent", "callback handled:" + e17);
        if (!e17 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.c() == 0 && this.f159100d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v0.NO_RUNTIMES_LEFT);
        }
        return jz5.f0.f384359a;
    }
}
