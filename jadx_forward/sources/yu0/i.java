package yu0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f547329d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f547330e;

    /* renamed from: f, reason: collision with root package name */
    public int f547331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.m f547332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yu0.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547332g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yu0.i(this.f547332g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yu0.m mVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547331f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioTaskManager", " cancel job ");
            yu0.m mVar2 = this.f547332g;
            p3325xe03a0797.p3326xc267989b.p2.a(mVar2.f547350h, null, 1, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioTaskManager", " clear res ");
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = mVar2.f547345c;
            this.f547329d = dVar;
            this.f547330e = mVar2;
            this.f547331f = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            mVar = mVar2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (yu0.m) this.f547330e;
            java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f547329d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj3;
        }
        try {
            mVar.f547344b.set(0);
            mVar.f547346d.clear();
            mVar.f547347e.clear();
            mVar.f547348f.clear();
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioTaskManager", " cancel scope ");
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
