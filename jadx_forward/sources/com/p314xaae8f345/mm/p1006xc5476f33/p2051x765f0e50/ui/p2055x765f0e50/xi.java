package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class xi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243291d;

    /* renamed from: e, reason: collision with root package name */
    public int f243292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450 f243293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450 activityC17445xbcc29450, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f243293f = activityC17445xbcc29450;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xi(this.f243293f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xi) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450 activityC17445xbcc29450;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f243292e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450 activityC17445xbcc294502 = this.f243293f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f243291d = activityC17445xbcc294502;
            this.f243292e = 1;
            obj = ((ef0.y2) o8Var).Zi(activityC17445xbcc294502, this);
            if (obj == aVar) {
                return aVar;
            }
            activityC17445xbcc29450 = activityC17445xbcc294502;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityC17445xbcc29450 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17445xbcc29450) this.f243291d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        activityC17445xbcc29450.f242103f = (bw5.lc0) obj;
        bw5.lc0 lc0Var = activityC17445xbcc294502.f242103f;
        activityC17445xbcc294502.f242102e = lc0Var != null ? lc0Var.f111276m : 0;
        activityC17445xbcc294502.V6(true);
        return jz5.f0.f384359a;
    }
}
