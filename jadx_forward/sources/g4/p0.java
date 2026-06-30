package g4;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f350012d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f350013e;

    /* renamed from: f, reason: collision with root package name */
    public int f350014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f350015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f350016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f350017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, java.lang.Object obj, yz5.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350015g = jVar;
        this.f350016h = obj;
        this.f350017i = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.p0 p0Var = new g4.p0(this.f350015g, this.f350016h, this.f350017i, completion);
        p0Var.f350012d = obj;
        return p0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.p0) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350014f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar2 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f350012d;
            h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            java.lang.Object obj2 = this.f350016h;
            h0Var.f391656d = obj2;
            this.f350012d = kVar2;
            this.f350013e = h0Var;
            this.f350014f = 1;
            if (kVar2.mo771x2f8fd3(obj2, this) == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f350013e;
            kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f350012d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        g4.o0 o0Var = new g4.o0(this, kVar, h0Var);
        this.f350012d = null;
        this.f350013e = null;
        this.f350014f = 2;
        if (this.f350015g.a(o0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
