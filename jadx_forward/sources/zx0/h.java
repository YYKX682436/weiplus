package zx0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f558545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77 f558546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.j f558547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f558548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77 c4004xd61acd77, zx0.j jVar, yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558546e = c4004xd61acd77;
        this.f558547f = jVar;
        this.f558548g = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zx0.h(this.f558546e, this.f558547f, this.f558548g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f558545d;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4004xd61acd77 c4004xd61acd77 = this.f558546e;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.f1 a17 = ky0.h.f395012a.a(kz5.b0.c(c4004xd61acd77.f129400c), ly0.p.f403761d, null, kz5.b1.e(new jz5.l(c4004xd61acd77.f129400c, c4004xd61acd77.f129401d)));
            this.f558545d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) a17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List list = (java.util.List) obj;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).length() == 0) {
                    break;
                }
            }
        }
        z17 = false;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yx0.b8 b8Var = this.f558548g;
        if (!z17) {
            b8Var.I().c(c4004xd61acd77.f129398a);
            return f0Var;
        }
        this.f558547f.getClass();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m58);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        b8Var.I().a(c4004xd61acd77.f129398a, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.NetworkFailed.m33752x130a215f(), string));
        return f0Var;
    }
}
