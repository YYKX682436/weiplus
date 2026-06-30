package qy1;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f449306d;

    /* renamed from: e, reason: collision with root package name */
    public long f449307e;

    /* renamed from: f, reason: collision with root package name */
    public int f449308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f449309g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f449310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qy1.b0 b0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449309g = b0Var;
        this.f449310h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy1.y(this.f449309g, this.f449310h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.m] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.o oVar;
        long j17;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar;
        java.lang.Throwable th6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f449308f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar2 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.m) ((jz5.n) this.f449309g.f449244j).mo141623x754a37bb();
                this.f449306d = mVar2;
                long j18 = this.f449310h;
                this.f449307e = j18;
                this.f449308f = 1;
                oVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar2;
                if (oVar.a(this) == aVar) {
                    return aVar;
                }
                j17 = j18;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.m) this.f449306d;
                    try {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).c();
                        return jz5.f0.f384359a;
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).c();
                        throw th6;
                    }
                }
                j17 = this.f449307e;
                ?? r17 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.m) this.f449306d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                oVar = r17;
            }
            this.f449306d = oVar;
            this.f449308f = 2;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
            mVar = oVar;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).c();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th8) {
            mVar = oVar;
            th6 = th8;
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) mVar).c();
            throw th6;
        }
    }
}
