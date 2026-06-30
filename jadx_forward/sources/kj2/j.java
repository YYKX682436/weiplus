package kj2;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f389939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f389940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj2.o f389941f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, kj2.o oVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f389940e = hVar;
        this.f389941f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kj2.j(this.f389940e, interfaceC29045xdcb5ca57, this.f389941f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kj2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f389939d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xg2.a aVar2 = (xg2.a) ((xg2.b) this.f389940e).f535914b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getMicMemberList fail, isShowing: ");
            kj2.o oVar = this.f389941f;
            sb6.append(oVar.f389958d.b());
            sb6.append(" error: ");
            sb6.append(aVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveInviteVisitorMicWidget", sb6.toString());
            if (oVar.f389958d.b()) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                kj2.i iVar = new kj2.i(oVar, null);
                this.f389939d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, iVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
