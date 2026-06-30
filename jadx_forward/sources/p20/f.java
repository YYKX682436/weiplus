package p20;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p20.a f432946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p20.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f432946d = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p20.f(this.f432946d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p20.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = p20.i.f432954g.get();
        jz5.f0 f0Var = jz5.f0.f384359a;
        p20.a aVar2 = this.f432946d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", "Preloader is paused, task will not be executed: " + aVar2.a());
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) p20.i.f432950c).c();
            ((java.util.concurrent.ConcurrentHashMap) p20.i.f432951d).remove(aVar2.a());
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start executing preload task: ");
        sb6.append(aVar2.a());
        sb6.append(", current preloading: ");
        java.util.Map map = p20.i.f432951d;
        sb6.append(((java.util.concurrent.ConcurrentHashMap) map).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsPlayerPreloadMgr", sb6.toString());
        ((java.util.concurrent.ConcurrentHashMap) map).put(aVar2.a(), aVar2);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17793xd428dad6 = 20302;
        c2CDownloadRequest.f17792xcd096f43 = aVar2.a();
        p20.j jVar = aVar2.f432940a;
        c2CDownloadRequest.m37861xfb0731c4(jVar.a());
        c2CDownloadRequest.m37872xca029dad(jVar.f432956a);
        c2CDownloadRequest.f17811x4d4a9121 = aVar2.f432941b;
        c4446x11b6e6e0.m37789x737fa05e(c2CDownloadRequest, new p20.d(), new p20.e(), 2);
        return f0Var;
    }
}
