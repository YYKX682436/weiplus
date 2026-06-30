package h4;

/* loaded from: classes14.dex */
public final class b0 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360156d;

    /* renamed from: e, reason: collision with root package name */
    public int f360157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.e0 f360158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h4.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f360158f = e0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        java.lang.Throwable it = (java.lang.Throwable) obj2;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        h4.b0 b0Var = new h4.b0(this.f360158f, continuation);
        b0Var.f360156d = it;
        return b0Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360157e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.Throwable th6 = (java.lang.Throwable) this.f360156d;
            yz5.p pVar = this.f360158f.f360179e.f360192d;
            h4.l lVar = new h4.l(th6);
            this.f360157e = 1;
            if (pVar.mo149xb9724478(lVar, this) == aVar) {
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
