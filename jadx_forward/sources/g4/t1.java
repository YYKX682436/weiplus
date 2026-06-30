package g4;

/* loaded from: classes5.dex */
public final class t1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350097d;

    /* renamed from: e, reason: collision with root package name */
    public int f350098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.x1 f350099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(g4.x1 x1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350099f = x1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.t1 t1Var = new g4.t1(this.f350099f, completion);
        t1Var.f350097d = obj;
        return t1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.t1) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350098e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g4.m4 m4Var = (g4.m4) this.f350097d;
            g4.x1 x1Var = this.f350099f;
            x1Var.getClass();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i0 i0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.i0(new g4.o1(null, null), x1Var.f350139a.f349793b);
            g4.q1 q1Var = new g4.q1(this, null, null);
            java.lang.Object obj2 = g4.s0.f350078a;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = g4.l4.a(new g4.r0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.v1(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new g4.p0(i0Var, null, q1Var, null))), new g4.s1(null, this, null), null));
            g4.r1 r1Var = new g4.r1(m4Var);
            this.f350098e = 1;
            if (a17.a(r1Var, this) == aVar) {
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
