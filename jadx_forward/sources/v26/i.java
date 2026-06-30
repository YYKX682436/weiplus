package v26;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f514538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.j f514539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v26.q0 f514540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3332x361a9b.m f514541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar, v26.q0 q0Var, p3325xe03a0797.p3326xc267989b.p3332x361a9b.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f514539e = jVar;
        this.f514540f = q0Var;
        this.f514541g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new v26.i(this.f514539e, this.f514540f, this.f514541g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlinx.coroutines.sync.m] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.o] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f514538d;
        ?? r27 = this.f514541g;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = this.f514539e;
                v26.q0 q0Var = this.f514540f;
                this.f514538d = 1;
                if (jVar.a(q0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            r27 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) r27;
            r27.c();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.o) r27).c();
            throw th6;
        }
    }
}
