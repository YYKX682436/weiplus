package ny0;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny0.d f422916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ny0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f422916e = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ny0.a(this.f422916e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ny0.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f422915d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelServerRequest taskId:");
            ny0.d dVar = this.f422916e;
            sb6.append(dVar.f422924m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIGC.AIMGSnsPollingTask", sb6.toString());
            r45.u86 u86Var = new r45.u86();
            u86Var.set(1, dVar.f422924m);
            com.p314xaae8f345.mm.p944x882e457a.i d17 = u86Var.d();
            this.f422915d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AIGC.AIMGSnsPollingTask", "cancelServerRequest result:" + ((com.p314xaae8f345.mm.p944x882e457a.f) obj).b());
        return jz5.f0.f384359a;
    }
}
