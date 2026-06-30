package du3;

/* loaded from: classes3.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325115e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(du3.t3 t3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325115e = t3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.f3(this.f325115e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((du3.f3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325114d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            du3.t3 t3Var = this.f325115e;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(t3Var.E().f363353n);
            du3.e3 e3Var = new du3.e3(t3Var);
            this.f325114d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) b17).a(e3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
