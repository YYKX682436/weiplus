package l0;

/* loaded from: classes14.dex */
public final class c2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f395628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f395629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.a3 f395630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(java.lang.Object obj, l0.a3 a3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f395629e = obj;
        this.f395630f = a3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new l0.c2(this.f395629e, this.f395630f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((l0.c2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f395628d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l0.a3 a3Var = this.f395630f;
            java.lang.Object b17 = a3Var.b();
            java.lang.Object obj2 = this.f395629e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, b17)) {
                this.f395628d = 1;
                z.p pVar = a3Var.f395561a;
                java.lang.Object a17 = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.x0) a3Var.f395570j).a(new l0.q2(obj2, a3Var, pVar), this);
                if (a17 != aVar) {
                    a17 = f0Var;
                }
                if (a17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
