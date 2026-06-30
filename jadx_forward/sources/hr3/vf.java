package hr3;

/* loaded from: classes.dex */
public final class vf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f365649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365650g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f365651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(java.lang.String str, r45.v60 v60Var, android.content.Context context, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365648e = str;
        this.f365649f = v60Var;
        this.f365650g = context;
        this.f365651h = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.vf(this.f365648e, this.f365649f, this.f365650g, this.f365651h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.vf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365647d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hr3.ag agVar = hr3.ag.f364937a;
            this.f365647d = 1;
            obj = agVar.c(this.f365648e, this.f365649f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        yz5.p pVar = this.f365651h;
        if (z17) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            hr3.uf ufVar = new hr3.uf(pVar, null);
            this.f365647d = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, ufVar, this) == aVar) {
                return aVar;
            }
        } else {
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(str, i65.a.g(this.f365650g));
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            hr3.tf tfVar = new hr3.tf(pVar, str, a17, null);
            this.f365647d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, tfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
