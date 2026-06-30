package yu0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f547325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.m f547326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yu0.e f547328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yu0.m mVar, java.lang.String str, yu0.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f547326e = mVar;
        this.f547327f = str;
        this.f547328g = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yu0.h(this.f547326e, this.f547327f, this.f547328g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yu0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f547325d;
        java.lang.String str = this.f547327f;
        yu0.m mVar = this.f547326e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioTaskManager", "query groupID " + str + " start");
            this.f547325d = 1;
            if (mVar.f547343a.b(str, this.f547328g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJAudioTaskManager", "query groupID " + str + " end");
        return jz5.f0.f384359a;
    }
}
