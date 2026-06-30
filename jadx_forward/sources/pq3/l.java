package pq3;

/* loaded from: classes12.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439185d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439186e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f439187f;

    /* renamed from: g, reason: collision with root package name */
    public int f439188g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq3.q f439189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(pq3.q qVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f439189h = qVar;
        this.f439190i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pq3.l(this.f439189h, this.f439190i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pq3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pq3.q qVar;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f439188g;
        pq3.q qVar2 = this.f439189h;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = qVar2.f439209b;
                this.f439185d = dVar;
                this.f439186e = qVar2;
                str = this.f439190i;
                this.f439187f = str;
                this.f439188g = 1;
                p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
                if (kVar.b(null, this) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
                obj2 = kVar;
            } else {
                if (i17 != 1) {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    return jz5.f0.f384359a;
                }
                str = (java.lang.String) this.f439187f;
                qVar = (pq3.q) this.f439186e;
                java.lang.Object obj3 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f439185d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                obj2 = obj3;
            }
            qq3.i iVar = qVar.f439210c;
            if (iVar != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f447493e.A0(), str)) {
                qVar.f439210c = null;
            }
            for (qq3.i iVar2 : qVar.c()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar2.f447493e.A0(), str)) {
                    qVar.c().remove(iVar2);
                }
            }
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            this.f439185d = null;
            this.f439186e = null;
            this.f439187f = null;
            this.f439188g = 2;
            if (qVar2.e(this) == aVar) {
                return aVar;
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            throw th6;
        }
    }
}
