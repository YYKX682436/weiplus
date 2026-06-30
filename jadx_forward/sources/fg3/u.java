package fg3;

/* loaded from: classes12.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f343985d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f343986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg3.v f343987f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fg3.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f343987f = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        fg3.u uVar = new fg3.u(this.f343987f, interfaceC29045xdcb5ca57);
        uVar.f343986e = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fg3.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        fg3.h hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f343985d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f343986e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f343986e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            fg3.v vVar = this.f343987f;
            jz5.l a17 = ((ig3.i) vVar.U()).a();
            int intValue = ((java.lang.Number) a17.f384366d).intValue();
            int intValue2 = ((java.lang.Number) a17.f384367e).intValue();
            if (intValue2 > 0 && (hVar = (fg3.h) vVar.G().a(fg3.h.class)) != null) {
                hVar.w(intValue, intValue2);
            }
            long min = java.lang.Math.min(1000 - (intValue % 1000), 500L);
            this.f343986e = y0Var;
            this.f343985d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(min, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
