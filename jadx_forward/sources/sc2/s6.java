package sc2;

/* loaded from: classes2.dex */
public final class s6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f487775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad2.h f487777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f487778g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487779h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f487780i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487781m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f487782n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(xc2.p0 p0Var, ad2.h hVar, sc2.v6 v6Var, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, android.view.View view, sc2.r7 r7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487776e = p0Var;
        this.f487777f = hVar;
        this.f487778g = v6Var;
        this.f487779h = str;
        this.f487780i = c19786x6a1e2862;
        this.f487781m = view;
        this.f487782n = r7Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sc2.s6(this.f487776e, this.f487777f, this.f487778g, this.f487779h, this.f487780i, this.f487781m, this.f487782n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.s6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f487775d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xc2.p0 p0Var = this.f487776e;
            xc2.o0 o0Var = p0Var.f534779h;
            boolean z17 = false;
            if (o0Var != null && !o0Var.a()) {
                z17 = true;
            }
            if (!z17 && !this.f487777f.m(p0Var)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cache.iconUrl=");
                xc2.o0 o0Var2 = p0Var.f534779h;
                sb6.append(o0Var2 != null ? o0Var2.f534754c : null);
                sb6.append(" cache.title=");
                xc2.o0 o0Var3 = p0Var.f534779h;
                sb6.append((java.lang.Object) (o0Var3 != null ? o0Var3.f534752a : null));
                sb6.append("cache.desc=");
                xc2.o0 o0Var4 = p0Var.f534779h;
                sb6.append((java.lang.Object) (o0Var4 != null ? o0Var4.f534753b : null));
                sb6.append(" info.wording=");
                sb6.append(this.f487780i.m76523x98b23862());
                this.f487778g.a("onChanged", this.f487779h, sb6.toString());
                return f0Var;
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            sc2.r6 r6Var = new sc2.r6(this.f487777f, this.f487778g, this.f487781m, this.f487776e, this.f487782n, null);
            this.f487775d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, r6Var, this) == aVar) {
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
