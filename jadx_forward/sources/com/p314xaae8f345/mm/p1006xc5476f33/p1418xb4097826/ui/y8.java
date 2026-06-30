package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes11.dex */
public final class y8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f211578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 f211579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211579e = activityC15041xa4ea2f4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y8(this.f211579e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.y8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f211578d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4 activityC15041xa4ea2f4 = this.f211579e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f211578d = 1;
            obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.e7(activityC15041xa4ea2f4, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.h7(activityC15041xa4ea2f4, ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f384359a;
    }
}
