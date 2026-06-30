package sf2;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f488827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(sf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f488828e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sf2.u(this.f488828e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f488827d;
        sf2.x xVar = this.f488828e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                gn2.a aVar2 = xVar.f488880p;
                if (aVar2 != null) {
                    aVar2.c(true);
                }
                this.f488827d = 1;
                if (xVar.k7(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            gn2.a aVar3 = xVar.f488880p;
            if (aVar3 != null) {
                aVar3.e();
            }
            gn2.a aVar4 = xVar.f488880p;
            if (aVar4 != null) {
                gn2.a.q(aVar4, false, 1, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorMusicSingSongController", "showOldSongListPanel error: " + e17.getMessage(), e17);
        }
        return jz5.f0.f384359a;
    }
}
