package d83;

/* loaded from: classes5.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.t0 f308547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(d83.t0 t0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f308547e = t0Var;
        this.f308548f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new d83.r0(this.f308547e, this.f308548f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((d83.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f308546d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f308546d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f308547e.f308557d;
        java.lang.String str = this.f308548f;
        d83.h0 h0Var = (d83.h0) concurrentHashMap.remove(str);
        if (h0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkStreamController", "pendingReportStreams timeout cleanup streamId: " + str);
            h0Var.f308506d.clear();
        }
        return jz5.f0.f384359a;
    }
}
