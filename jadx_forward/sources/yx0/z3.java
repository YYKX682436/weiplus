package yx0;

/* loaded from: classes.dex */
public final class z3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f549340f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(yx0.b8 b8Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549339e = b8Var;
        this.f549340f = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.z3(this.f549339e, this.f549340f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549338d;
        yx0.b8 b8Var = this.f549339e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            tx0.k kVar = b8Var.S1;
            this.f549338d = 1;
            c17 = kVar.c(this);
            if (c17 == aVar) {
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
            c17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(c17)) {
            c17 = null;
        }
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.l5(b8Var, (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) c17, null), 3, null);
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        yx0.y3 y3Var = new yx0.y3(this.f549340f, null);
        this.f549338d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, y3Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
