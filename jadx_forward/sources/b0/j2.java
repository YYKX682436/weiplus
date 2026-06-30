package b0;

/* loaded from: classes10.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f97900d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.k2 f97902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(b0.k2 k2Var, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97902f = k2Var;
        this.f97903g = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.j2 j2Var = new b0.j2(this.f97902f, this.f97903g, interfaceC29045xdcb5ca57);
        j2Var.f97901e = obj;
        return j2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.j2) mo148xaf65a0fc((b0.p2) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97900d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b0.p2 p2Var = (b0.p2) this.f97901e;
            b0.k2 k2Var = this.f97902f;
            k2Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p2Var, "<set-?>");
            k2Var.f97920b = p2Var;
            this.f97900d = 1;
            if (this.f97903g.mo149xb9724478(k2Var, this) == aVar) {
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
