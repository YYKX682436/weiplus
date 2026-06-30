package mm2;

/* loaded from: classes3.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410279d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f410281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(mm2.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410281f = e5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mm2.a5 a5Var = new mm2.a5(this.f410281f, interfaceC29045xdcb5ca57);
        a5Var.f410280e = obj;
        return a5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.a5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410279d;
        mm2.e5 e5Var = this.f410281f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f410280e;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = e5Var.f410540n;
            if (r2Var == null) {
                y0Var = y0Var3;
                e5Var.f410540n = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new mm2.z4(e5Var, null), 3, null);
                return jz5.f0.f384359a;
            }
            this.f410280e = y0Var3;
            this.f410279d = 1;
            if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f410280e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        y0Var = y0Var2;
        e5Var.f410540n = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new mm2.z4(e5Var, null), 3, null);
        return jz5.f0.f384359a;
    }
}
