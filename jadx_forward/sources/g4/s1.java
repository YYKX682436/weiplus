package g4;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350079d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350080e;

    /* renamed from: f, reason: collision with root package name */
    public int f350081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.t1 f350082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, g4.t1 t1Var, g4.f4 f4Var) {
        super(3, interfaceC29045xdcb5ca57);
        this.f350082g = t1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public final java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k create = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 continuation = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(create, "$this$create");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(continuation, "continuation");
        g4.s1 s1Var = new g4.s1(continuation, this.f350082g, null);
        s1Var.f350079d = create;
        s1Var.f350080e = obj2;
        return s1Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350081f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f350079d;
            g4.m1 m1Var = (g4.m1) this.f350080e;
            g4.t1 t1Var = this.f350082g;
            g4.x1 x1Var = t1Var.f350099f;
            g4.y2 y2Var = m1Var.f349963a;
            x1Var.getClass();
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = y2Var.f350169g;
            g4.x1 x1Var2 = t1Var.f350099f;
            g4.j3 j3Var = new g4.j3(jVar, new g4.n1(x1Var2, m1Var.f349963a, x1Var2.f350140b));
            this.f350081f = 1;
            if (kVar.mo771x2f8fd3(j3Var, this) == aVar) {
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
