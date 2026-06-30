package qm3;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm3.a f446314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.a f446315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qm3.i f446316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qm3.a aVar, kp4.a aVar2, qm3.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446314e = aVar;
        this.f446315f = aVar2;
        this.f446316g = iVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qm3.h(this.f446314e, this.f446315f, this.f446316g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qm3.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446313d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f446313d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qm3.a aVar2 = this.f446314e;
        java.util.List F0 = kz5.n0.F0(kz5.n0.S0(aVar2.f446293b), new qm3.g());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kp4.a aVar3 = this.f446315f;
        sb6.append(aVar3);
        sb6.append(" request ");
        java.lang.String arrays = java.util.Arrays.toString(F0.toArray(new java.lang.Long[0]));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", size:[");
        sb6.append(aVar3.f392604a);
        sb6.append(',');
        sb6.append(aVar3.f392605b);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThumbCachedLoader", sb6.toString());
        aVar2.f446294c.addAll(F0);
        aVar2.f446293b.clear();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
        qm3.f fVar = new qm3.f(this.f446314e, this.f446316g, this.f446315f, F0, null);
        this.f446313d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, fVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
