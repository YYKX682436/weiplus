package sn1;

/* loaded from: classes9.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f491648f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, java.util.function.Consumer consumer, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491647e = str;
        this.f491648f = consumer;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sn1.y(this.f491647e, this.f491648f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sn1.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491646d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sn1.z zVar = sn1.z.f491649a;
            this.f491646d = 1;
            obj = zVar.f(this.f491647e, this);
            if (obj == aVar) {
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
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        sn1.x xVar = new sn1.x(this.f491648f, (sn1.j) obj, null);
        this.f491646d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, xVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
