package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes3.dex */
public final class a3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f391727d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f391728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f391729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f391729f = f3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.a3 a3Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.a3(this.f391729f, interfaceC29045xdcb5ca57);
        a3Var.f391728e = obj;
        return a3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.a3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f391727d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.z2 z2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.z2(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f391728e);
            this.f391727d = 1;
            if (this.f391729f.a(z2Var, this) == aVar) {
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
