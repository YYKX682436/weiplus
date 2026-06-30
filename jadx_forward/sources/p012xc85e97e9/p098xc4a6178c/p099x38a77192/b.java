package p012xc85e97e9.p098xc4a6178c.p099x38a77192;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f93244d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f93245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p098xc4a6178c.p099x38a77192.e f93246f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p098xc4a6178c.p099x38a77192.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f93246f = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p012xc85e97e9.p098xc4a6178c.p099x38a77192.b bVar = new p012xc85e97e9.p098xc4a6178c.p099x38a77192.b(this.f93246f, interfaceC29045xdcb5ca57);
        bVar.f93245e = obj;
        return bVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p012xc85e97e9.p098xc4a6178c.p099x38a77192.b) mo148xaf65a0fc((g4.j3) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f93244d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g4.j3 j3Var = (g4.j3) this.f93245e;
            p012xc85e97e9.p098xc4a6178c.p099x38a77192.d dVar = this.f93246f.f93251c;
            this.f93244d = 1;
            dVar.getClass();
            java.lang.Object a17 = dVar.f350048e.a(0, new g4.o3(dVar, j3Var, null), this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
