package g43;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f350315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g43.x f350316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d f350317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f350319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g43.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350316e = xVar;
        this.f350317f = c15701x78babc7d;
        this.f350318g = str;
        this.f350319h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.t(this.f350316e, this.f350317f, this.f350318g, this.f350319h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350315d;
        boolean z17 = this.f350319h;
        g43.x xVar = this.f350316e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = xVar.f350330g;
            java.util.LinkedList<java.lang.String> admin_username_list = this.f350317f.f36444x486e5577;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(admin_username_list, "admin_username_list");
            for (java.lang.String str2 : admin_username_list) {
                if (!xVar.f350332i.contains(str2)) {
                    xVar.f350332i.add(str2);
                }
            }
            java.util.ArrayList arrayList = xVar.f350332i;
            java.lang.String str3 = this.f350318g;
            if (!arrayList.contains(str3)) {
                xVar.f350332i.add(str3);
            }
            if (str == null) {
                g43.x.N6(xVar, null, z17);
                return jz5.f0.f384359a;
            }
            g43.m mVar = g43.m.f350299d;
            this.f350315d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(str, new g43.c(str, rVar));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        g43.x.N6(xVar, (w33.e) obj, z17);
        return jz5.f0.f384359a;
    }
}
