package jd3;

/* loaded from: classes.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f380711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f380712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jd3.g f380713f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lc3.a0 a0Var, jd3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380712e = a0Var;
        this.f380713f = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jd3.f(this.f380712e, this.f380713f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jd3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f380711d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            org.json.JSONArray optJSONArray = this.f380712e.optJSONArray("jsFiles");
            jd3.g gVar = this.f380713f;
            lc3.h0 h0Var = (lc3.h0) gVar.f399423a;
            if (h0Var != null) {
                jd3.e eVar = new jd3.e(gVar);
                this.f380711d = 1;
                if (jd3.g.u(gVar, h0Var, optJSONArray, eVar, this) == aVar) {
                    return aVar;
                }
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
