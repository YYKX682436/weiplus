package gx0;

/* loaded from: classes5.dex */
public final class lb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f358211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(gx0.ac acVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358210e = acVar;
        this.f358211f = c3971x241f78;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.lb(this.f358210e, this.f358211f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.lb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358209d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ex0.q n76 = this.f358210e.d8().n7(this.f358211f);
            if (n76 == null) {
                return null;
            }
            this.f358209d = 1;
            if (n76.G(this) == aVar) {
                return aVar;
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
