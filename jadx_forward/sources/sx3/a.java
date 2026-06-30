package sx3;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f495076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f495077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx3.b f495078f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z17, java.util.List list, sx3.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495076d = z17;
        this.f495077e = list;
        this.f495078f = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sx3.a(this.f495076d, this.f495077e, this.f495078f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sx3.a aVar = (sx3.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f495076d;
        java.util.List<t45.s> list = this.f495077e;
        sx3.b bVar = this.f495078f;
        if (!z17 && list.isEmpty() && bVar.f495083h.isEmpty()) {
            bVar.f495079d.mo7808x76db6cb1(null);
        } else {
            for (t45.s sVar : list) {
                t45.n0 n0Var = sVar.f497171d;
                if (n0Var != null) {
                    long j17 = bVar.f495081f;
                    long j18 = sVar.f497173f;
                    if (j17 > j18) {
                        bVar.f495081f = j18;
                    }
                    vx3.i i17 = vx3.l.E.i(n0Var);
                    if (i17 != null) {
                        qx3.d.c(i17.f522831o, i17);
                        java.lang.String e17 = i17.e();
                        java.util.HashSet hashSet = bVar.f495082g;
                        if (!hashSet.contains(e17)) {
                            hashSet.add(e17);
                            bVar.f495083h.add(new ox3.g(n0Var));
                        }
                    }
                }
            }
            bVar.f495079d.mo7808x76db6cb1(bVar.f495083h);
        }
        return jz5.f0.f384359a;
    }
}
