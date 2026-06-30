package h4;

/* loaded from: classes5.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360242d;

    /* renamed from: e, reason: collision with root package name */
    public int f360243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.z f360244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h4.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360244f = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        h4.y yVar = new h4.y(this.f360244f, completion);
        yVar.f360242d = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.y) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360243e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f360242d;
            u26.w a17 = u26.z.a(Integer.MAX_VALUE, null, null, 6, null);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.g0 g0Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new h4.v(new p3325xe03a0797.p3326xc267989b.p3328x30012e.i0(new h4.w(this, a17, null), p3325xe03a0797.p3326xc267989b.p3328x30012e.l.g(a17)), null)), new h4.x(this, a17, null));
            this.f360243e = 1;
            if (g0Var.a(kVar, this) == aVar) {
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
