package j0;

/* loaded from: classes14.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f378121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.f f378122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.e0 f378123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0.c5 f378124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j0.d5 f378125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2.v f378126i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(g0.f fVar, g2.e0 e0Var, j0.c5 c5Var, j0.d5 d5Var, g2.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f378122e = fVar;
        this.f378123f = e0Var;
        this.f378124g = c5Var;
        this.f378125h = d5Var;
        this.f378126i = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new j0.v0(this.f378122e, this.f378123f, this.f378124g, this.f378125h, this.f378126i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        d1.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f378121d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            j0.k3 k3Var = this.f378124g.f377766a;
            a2.k1 k1Var = this.f378125h.f377798a;
            this.f378121d = 1;
            int e17 = a2.m1.e(this.f378123f.f349227b);
            ((g2.t) this.f378126i).getClass();
            if (e17 < k1Var.f82298a.f82287a.length()) {
                gVar = k1Var.b(e17);
            } else if (e17 != 0) {
                gVar = k1Var.b(e17 - 1);
            } else {
                gVar = new d1.g(0.0f, 0.0f, 1.0f, p2.q.b(j0.u3.a(k3Var.f377937b, k3Var.f377941f, k3Var.f377942g, j0.u3.f378114a, 1)));
            }
            java.lang.Object a17 = ((g0.h) this.f378122e).a(gVar, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
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
