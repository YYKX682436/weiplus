package h4;

/* loaded from: classes14.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360193d;

    /* renamed from: e, reason: collision with root package name */
    public int f360194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.k0 f360195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(h4.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360195f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        h4.h0 h0Var = new h4.h0(this.f360195f, completion);
        h0Var.f360193d = obj;
        return h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.h0) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360194e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Object obj2 = this.f360193d;
            java.lang.Object obj3 = h4.k0.f360210d;
            java.lang.Object obj4 = h4.k0.f360210d;
            h4.k0 k0Var = this.f360195f;
            if (obj2 == obj4) {
                h4.k0.a(k0Var);
            } else {
                this.f360194e = 1;
                h4.i iVar = (h4.i) k0Var;
                iVar.getClass();
                if (iVar.h((h4.q) obj2, this) == aVar) {
                    return aVar;
                }
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
