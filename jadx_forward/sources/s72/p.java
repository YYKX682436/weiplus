package s72;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f485652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f485653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f485654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f485655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s72.j0 j0Var, long j17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485653e = j0Var;
        this.f485654f = j17;
        this.f485655g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.p(this.f485653e, this.f485654f, this.f485655g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485652d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            s72.j0 j0Var = this.f485653e;
            if (j0Var.f485604g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSyncService", "[handleBatchGetCgiWithCallback] is doing batch get");
                return f0Var;
            }
            this.f485652d = 1;
            if (j0Var.Y6(this.f485654f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f485655g.mo152xb9724478();
        return f0Var;
    }
}
