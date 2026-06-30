package pr0;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f439336d;

    /* renamed from: e, reason: collision with root package name */
    public int f439337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f439338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.d f439339g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, pr0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439338f = z17;
        this.f439339g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pr0.a(this.f439338f, this.f439339g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long elapsedRealtime;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439337e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preOpenCamera:");
            boolean z17 = this.f439338f;
            sb6.append(z17);
            sb6.append(' ');
            pr0.d dVar = this.f439339g;
            sb6.append(dVar.f439367e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            sr0.i iVar = dVar.f439367e;
            if (iVar != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                this.f439336d = elapsedRealtime;
                this.f439337e = 1;
                if (iVar.n(valueOf, this) == aVar) {
                    return aVar;
                }
                j17 = elapsedRealtime;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preOpenCamera cost:");
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb7.toString());
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j17 = this.f439336d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        elapsedRealtime = j17;
        java.lang.StringBuilder sb72 = new java.lang.StringBuilder("preOpenCamera cost:");
        boolean z192 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb72.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraKit", sb72.toString());
        return jz5.f0.f384359a;
    }
}
