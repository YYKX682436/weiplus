package lp4;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f401954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f401955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f401956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f401957g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lp4.u f401958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, long j18, java.lang.Long l17, lp4.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f401955e = j17;
        this.f401956f = j18;
        this.f401957g = l17;
        this.f401958h = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lp4.t(this.f401955e, this.f401956f, this.f401957g, this.f401958h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lp4.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList<rm5.j> arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f401954d;
        lp4.u uVar = this.f401958h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateTrackDuration startMs:");
            long j17 = this.f401955e;
            sb6.append(j17);
            sb6.append(" endMs:");
            long j18 = this.f401956f;
            sb6.append(j18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorCorePlugin", sb6.toString());
            java.lang.Long l17 = this.f401957g;
            if (l17 != null) {
                l17.longValue();
                rm5.v vVar = uVar.f401962h;
                if (vVar != null && (arrayList = vVar.f479117l) != null) {
                    for (rm5.j jVar : arrayList) {
                        long j19 = jVar.f479034c;
                        if (l17 != null && j19 == l17.longValue()) {
                            jVar.e(j17);
                            jVar.d(j18);
                            uVar.A(uVar.f401961g.u(r95.a.c(jVar)));
                        }
                    }
                }
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            lp4.s sVar = new lp4.s(uVar, null);
            this.f401954d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return uVar.f401962h;
    }
}
