package b0;

/* loaded from: classes14.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98077d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.i2 f98079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f98080g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(b0.i2 i2Var, n0.e5 e5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98079f = i2Var;
        this.f98080g = e5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.u2 u2Var = new b0.u2(this.f98079f, this.f98080g, interfaceC29045xdcb5ca57);
        u2Var.f98078e = obj;
        return u2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.u2) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [p1.q0] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ?? r86;
        b0.t2 t2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98077d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r86 = (p1.a0) this.f98078e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p1.a0 a0Var = (p1.a0) this.f98078e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r86 = a0Var;
        }
        do {
            t2Var = new b0.t2(this.f98079f, this.f98080g, null);
            this.f98078e = r86;
            this.f98077d = 1;
            r86 = (p1.q0) r86;
        } while (r86.v(t2Var, this) != aVar);
        return aVar;
    }
}
