package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class aj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f242371d;

    /* renamed from: e, reason: collision with root package name */
    public int f242372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 f242373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 activityC17446x3014d797, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f242373f = activityC17446x3014d797;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.aj(this.f242373f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.aj) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 activityC17446x3014d797;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f242372e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797 activityC17446x3014d7972 = this.f242373f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f242371d = activityC17446x3014d7972;
            this.f242372e = 1;
            obj = ((ef0.y2) o8Var).Zi(activityC17446x3014d7972, this);
            if (obj == aVar) {
                return aVar;
            }
            activityC17446x3014d797 = activityC17446x3014d7972;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityC17446x3014d797 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17446x3014d797) this.f242371d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        activityC17446x3014d797.f242108f = (bw5.lc0) obj;
        bw5.lc0 lc0Var = activityC17446x3014d7972.f242108f;
        activityC17446x3014d7972.f242107e = lc0Var != null ? lc0Var.f111279p : 0;
        activityC17446x3014d7972.V6();
        return jz5.f0.f384359a;
    }
}
