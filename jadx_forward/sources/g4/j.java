package g4;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349911d;

    /* renamed from: e, reason: collision with root package name */
    public int f349912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.l f349913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f349914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g4.l lVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f349913f = lVar;
        this.f349914g = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        g4.j jVar = new g4.j(this.f349913f, this.f349914g, completion);
        jVar.f349911d = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.j) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349912e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f349911d;
            if (this.f349913f.f349944b.compareAndSet(false, true)) {
                this.f349912e = 1;
                java.lang.Object a17 = this.f349914g.a(new p3325xe03a0797.p3326xc267989b.p3328x30012e.a2(kVar, new p3321xbce91901.jvm.p3324x21ffc6bd.f0()), this);
                if (a17 != pz5.a.f440719d) {
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
