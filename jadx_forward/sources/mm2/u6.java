package mm2;

/* loaded from: classes3.dex */
public final class u6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o6 f410999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(mm2.o6 o6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410999e = o6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.u6(this.f410999e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.u6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410998d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f410998d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(30000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("job cancel timeout await, state = ");
        mm2.o6 o6Var = this.f410999e;
        sb6.append(o6Var.f410870a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveToastManagerSlice", sb6.toString());
        p3325xe03a0797.p3326xc267989b.f1 f1Var = o6Var.f410873d;
        if (f1Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        }
        o6Var.f410872c.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
