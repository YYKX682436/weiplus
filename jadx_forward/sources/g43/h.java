package g43;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350291d = str;
        this.f350292e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.h(this.f350291d, this.f350292e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        u33.m mVar = (u33.m) g43.m.f350299d.c().get(this.f350291d);
        if (mVar == null) {
            return null;
        }
        g43.u uVar = (g43.u) mVar;
        java.util.List users = this.f350292e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(users, "users");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uVar.f350321b, uVar.f350322c.f36445x98e520e2);
        g43.x xVar = uVar.f350320a;
        w33.b O6 = xVar.O6();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(users, 10));
        int i17 = 0;
        for (java.lang.Object obj2 : users) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            y33.g gVar = (y33.g) obj2;
            arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, b17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573733fl2) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573734fl3)), gVar.t0(), false, 101, 4, null) : new w33.c(null, gVar.t0(), false, 101, 5, null));
            i17 = i18;
        }
        xVar.f350327d.mo7808x76db6cb1(w33.b.a(O6, null, null, new jz5.l(bool, arrayList), null, 11, null));
        return jz5.f0.f384359a;
    }
}
