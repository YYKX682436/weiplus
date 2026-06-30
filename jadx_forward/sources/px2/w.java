package px2;

/* loaded from: classes2.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd f440463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440463e = abstractGestureDetectorOnGestureListenerC15410x706991fd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px2.w(this.f440463e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((px2.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vx2.k m62785x8489ceb8;
        vx2.k m62785x8489ceb82;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440462d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd abstractGestureDetectorOnGestureListenerC15410x706991fd = this.f440463e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            m62785x8489ceb8 = abstractGestureDetectorOnGestureListenerC15410x706991fd.m62785x8489ceb8();
            m62785x8489ceb8.j();
            m62785x8489ceb82 = abstractGestureDetectorOnGestureListenerC15410x706991fd.m62785x8489ceb8();
            vx2.k.e(m62785x8489ceb82, 0L, false, 3, null);
            this.f440462d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        abstractGestureDetectorOnGestureListenerC15410x706991fd.m62809xeb2f5b7b(1);
        abstractGestureDetectorOnGestureListenerC15410x706991fd.t();
        return jz5.f0.f384359a;
    }
}
