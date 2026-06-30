package g43;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f350310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g43.x f350311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d f350313g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.List list, g43.x xVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350310d = list;
        this.f350311e = xVar;
        this.f350312f = str;
        this.f350313g = c15701x78babc7d;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.r(this.f350310d, this.f350311e, this.f350312f, this.f350313g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g43.r rVar = (g43.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList<java.lang.String> linkedList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List list = this.f350310d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str = this.f350312f;
            if (!hasNext) {
                ((y33.h) this.f350311e.f350331h.mo141623x754a37bb()).z2(arrayList, str);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88 c15744x2fe9df88 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15744x2fe9df88) it.next();
            y33.g gVar = new y33.g();
            gVar.f68997xb2033e3a = str + c15744x2fe9df88.f36637xf02988d6;
            java.lang.String username = c15744x2fe9df88.f36637xf02988d6;
            gVar.f69002xdde069b = username;
            gVar.f68998x21eb2633 = c15744x2fe9df88.f36632x436a86e;
            gVar.f69000x136b93ab = str;
            gVar.f68996x81118851 = c15744x2fe9df88.f36617xac32c159;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15701x78babc7d c15701x78babc7d = this.f350313g;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c15701x78babc7d != null ? c15701x78babc7d.f36445x98e520e2 : null, username)) {
                r7 = ((c15701x78babc7d == null || (linkedList = c15701x78babc7d.f36444x486e5577) == null || !linkedList.contains(username)) ? 0 : 1) != 0 ? 2 : 0;
            }
            gVar.f68999x2261249b = r7;
            gVar.f69001xa783a79b = currentTimeMillis;
            arrayList.add(gVar);
        }
    }
}
