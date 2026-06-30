package xx3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f539539d;

    /* renamed from: e, reason: collision with root package name */
    public int f539540e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f539541f;

    /* renamed from: g, reason: collision with root package name */
    public int f539542g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t45.q f539543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t45.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f539543h = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xx3.e(this.f539543h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xx3.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        t45.f fVar;
        java.lang.String str;
        java.lang.Object b17;
        int i18;
        t45.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i19 = this.f539542g;
        vx3.k kVar = vx3.l.E;
        if (i19 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            t45.q qVar = this.f539543h;
            t45.n0 n0Var = qVar.f497166e;
            if (n0Var != null) {
                int i27 = n0Var.f497148d;
                t45.l0 l0Var = qVar.f497165d;
                if (l0Var != null) {
                    i17 = l0Var.f497135e;
                    if (l0Var != null) {
                        int i28 = l0Var.f497136f;
                        if (n0Var == null) {
                            return null;
                        }
                        boolean z17 = false;
                        if (n0Var != null && n0Var.f497152h) {
                            z17 = true;
                        }
                        if (z17) {
                            return null;
                        }
                        if (i27 != 2) {
                            vx3.i h17 = vx3.k.h(kVar, i17, i28, n0Var, null, 8, null);
                            if (h17 == null) {
                                return null;
                            }
                            return new nx3.b(1, i17, i28, false, h17);
                        }
                        t45.g gVar2 = n0Var.f497150f;
                        if (gVar2 != null && (fVar = gVar2.f497093d) != null) {
                            long j17 = fVar.f497082d;
                            if (fVar != null && (str = fVar.f497083e) != null) {
                                this.f539541f = gVar2;
                                this.f539539d = i17;
                                this.f539540e = i28;
                                this.f539542g = 1;
                                b17 = xx3.h.b(j17, str, this);
                                if (b17 == aVar) {
                                    return aVar;
                                }
                                i18 = i28;
                                gVar = gVar2;
                            }
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        if (i19 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i18 = this.f539540e;
        int i29 = this.f539539d;
        t45.g gVar3 = (t45.g) this.f539541f;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        i17 = i29;
        gVar = gVar3;
        b17 = obj;
        xx3.a aVar2 = (xx3.a) b17;
        if (aVar2 == null) {
            return null;
        }
        return new nx3.b(2, i17, i18, aVar2.f539527b, kVar.d(i17, i18, gVar, aVar2.f539526a));
    }
}
