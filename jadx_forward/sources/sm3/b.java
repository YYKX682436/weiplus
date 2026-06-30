package sm3;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.i f491368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f491369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 f491370g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qm3.i iVar, kp4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16707x92645a7 c16707x92645a7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491368e = iVar;
        this.f491369f = aVar;
        this.f491370g = c16707x92645a7;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sm3.b(this.f491368e, this.f491369f, this.f491370g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sm3.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491367d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qm3.i iVar = this.f491368e;
            iVar.getClass();
            kp4.a track = this.f491369f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.e eVar = new p3325xe03a0797.p3326xc267989b.p3328x30012e.e(iVar.a(track).f446296e.d(), false, null, 0, null, 28, null);
            sm3.a aVar2 = new sm3.a(track, this.f491370g);
            this.f491367d = 1;
            if (eVar.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
