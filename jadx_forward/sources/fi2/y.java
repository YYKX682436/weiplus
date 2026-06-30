package fi2;

/* loaded from: classes10.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi2.e0 f344479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(fi2.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f344479e = e0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fi2.y(this.f344479e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fi2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f344478d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fi2.e0 e0Var = this.f344479e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j e17 = e0Var.e();
            if (!(e17 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.j)) {
                e17 = null;
            }
            if (e17 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j n17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.n(e17, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
                if (n17 != null) {
                    fi2.x xVar = new fi2.x(e0Var);
                    this.f344478d = 1;
                    if (n17.a(xVar, this) == aVar) {
                        return aVar;
                    }
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
