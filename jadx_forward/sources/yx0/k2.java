package yx0;

/* loaded from: classes5.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548946e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.k2(this.f548946e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.k2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548945d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = this.f548946e.f548725s.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                switch (ordinal) {
                    case 14:
                    case 15:
                    case 16:
                        break;
                    default:
                        yx0.b8 b8Var = this.f548946e;
                        this.f548945d = 1;
                        obj = b8Var.x(this);
                        if (obj == aVar) {
                            return aVar;
                        }
                        break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "getFaceEffectModel >> but state is " + this.f548946e.f548725s);
            nx0.s1 s1Var = nx0.s1.f422755b;
            return nx0.s1.f422755b;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        return obj;
    }
}
