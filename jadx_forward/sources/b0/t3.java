package b0;

/* loaded from: classes14.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f98070d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.h2 f98072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p1.a0 f98073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f98074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98075i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(b0.h2 h2Var, p1.a0 a0Var, yz5.q qVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f98072f = h2Var;
        this.f98073g = a0Var;
        this.f98074h = qVar;
        this.f98075i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        b0.t3 t3Var = new b0.t3(this.f98072f, this.f98073g, this.f98074h, this.f98075i, interfaceC29045xdcb5ca57);
        t3Var.f98071e = obj;
        return t3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b0.t3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f98070d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f98071e;
            b0.h2 h2Var = this.f98072f;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.b(h2Var.f97864g, null, 1, null);
            h2Var.f97862e = false;
            h2Var.f97863f = false;
            b0.s3 s3Var = new b0.s3(this.f98074h, y0Var, this.f98072f, this.f98075i, null);
            this.f98070d = 1;
            if (((p1.q0) this.f98073g).v(s3Var, this) == aVar) {
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
