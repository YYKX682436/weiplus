package i55;

/* loaded from: classes8.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f370399d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f370400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f370401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i55.p f370402g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j17, i55.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f370401f = j17;
        this.f370402g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        i55.o oVar = new i55.o(this.f370401f, this.f370402g, interfaceC29045xdcb5ca57);
        oVar.f370400e = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((i55.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f370399d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f370400e;
            long j17 = this.f370401f;
            this.f370400e = y0Var;
            this.f370399d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        i55.s sVar = i55.s.f370411a;
        java.util.Map c17 = sVar.c();
        i55.p pVar = this.f370402g;
        synchronized (c17) {
            g55.h hVar = (g55.h) sVar.c().get(new java.lang.Integer(pVar.f370405c));
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "check end cur back 4tab cnt = " + hVar.f350530c);
                int i18 = hVar.f350530c - 1;
                hVar.f350530c = i18;
                if (i18 >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "red dot is consumed!");
                    pVar.a(true);
                } else {
                    sVar.c().remove(new java.lang.Integer(pVar.f370405c));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageLifecycleLogic", "red dot is not consumed");
                    pVar.a(false);
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageLifecycleLogic", "get page delay info err");
            }
        }
        return jz5.f0.f384359a;
    }
}
