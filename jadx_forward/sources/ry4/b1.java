package ry4;

/* loaded from: classes.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f483118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.util.List list, ry4.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483118d = list;
        this.f483119e = d1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ry4.b1(this.f483118d, this.f483119e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ry4.b1 b1Var = (ry4.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8> list = this.f483118d;
        ry4.d1 d1Var = this.f483119e;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            r45.u26 u26Var = new r45.u26();
            u26Var.set(0, d1Var.f483141d);
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 : list) {
                java.util.LinkedList m75941xfb821914 = u26Var.m75941xfb821914(1);
                r45.l56 l56Var = new r45.l56();
                l56Var.set(0, java.lang.Integer.valueOf(c19510x90fb7cb8.f269612d));
                l56Var.set(1, c19510x90fb7cb8.f269613e);
                l56Var.set(2, c19510x90fb7cb8.f269614f);
                m75941xfb821914.add(l56Var);
            }
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.a(24, 7, u26Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandListUIC", "syncToServer: fired %d items for username:%s", new java.lang.Integer(list.size()), d1Var.f483141d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandListUIC", e17, "syncToServer failed", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
