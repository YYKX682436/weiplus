package g4;

/* loaded from: classes5.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350001d;

    /* renamed from: e, reason: collision with root package name */
    public int f350002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.p2 f350003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f350004g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(g4.p2 p2Var, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350003f = p2Var;
        this.f350004g = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.o2 o2Var = new g4.o2(this.f350003f, this.f350004g, completion);
        o2Var.f350001d = obj;
        return o2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.o2) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350002e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f350001d;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j g17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.g(this.f350004g);
            g4.n2 n2Var = new g4.n2(this, y0Var);
            this.f350002e = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.e) g17).a(n2Var, this) == aVar) {
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
