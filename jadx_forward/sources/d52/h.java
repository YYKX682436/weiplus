package d52;

/* loaded from: classes13.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d52.n f308066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d52.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f308066e = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new d52.h(this.f308066e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((d52.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f308065d;
        d52.n nVar = this.f308066e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            u26.w wVar = nVar.f308079c;
            this.f308065d = 1;
            i17 = ((u26.k) wVar).i(this);
            if (i17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i17 = ((u26.c0) obj).f505674a;
        }
        r45.hw3 hw3Var = (r45.hw3) u26.c0.b(i17);
        if (hw3Var != null) {
            try {
                d52.f fVar = nVar.f308060a;
                if (fVar != null) {
                    ((g52.c) fVar).a(d52.e.a(hw3Var));
                }
                java.lang.Thread.currentThread().getId();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewMsgQ", "onMsg err " + e17);
            }
        }
        return jz5.f0.f384359a;
    }
}
