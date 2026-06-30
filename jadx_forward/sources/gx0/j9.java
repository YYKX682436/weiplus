package gx0;

/* loaded from: classes5.dex */
public final class j9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f358111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.o f358112f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358113g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(gx0.p9 p9Var, ex0.o oVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358111e = p9Var;
        this.f358112f = oVar;
        this.f358113g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.j9(this.f358111e, this.f358112f, this.f358113g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.j9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358110d;
        gx0.p9 p9Var = this.f358111e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            du0.t0 Q6 = p9Var.Q6();
            this.f358110d = 1;
            if (Q6.V6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String defaultLyricStyleID = this.f358113g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(defaultLyricStyleID, "$defaultLyricStyleID");
        this.f358112f.I(defaultLyricStyleID);
        gx0.bf t76 = p9Var.t7();
        this.f358110d = 2;
        if (gx0.bf.d7(t76, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
