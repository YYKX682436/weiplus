package mz0;

/* loaded from: classes5.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.l2 f414504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.b0 f414505f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(mz0.l2 l2Var, az0.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414504e = l2Var;
        this.f414505f = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mz0.i2(this.f414504e, this.f414505f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.i2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414503d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            az0.i5 i5Var = az0.i5.f97090a;
            az0.i5.x(i5Var, false, false, 3, null);
            this.f414503d = 1;
            if (i5Var.g(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        mz0.l2 l2Var = this.f414504e;
        l2Var.f7().dismiss();
        this.f414503d = 2;
        return mz0.l2.J7(l2Var, this.f414505f, this) == aVar ? aVar : f0Var;
    }
}
