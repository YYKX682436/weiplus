package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f240083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 f240084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f240085f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b3 b3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f240083d = linkedList;
        this.f240084e = b3Var;
        this.f240085f = activityC0065xcd7aa112;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y2(this.f240083d, this.f240084e, this.f240085f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y2 y2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        t45.n0 n0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.y2 y2Var = this;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.Iterator it = kz5.n0.N(y2Var.f240083d, y2Var.f240084e.f239897t).iterator();
        while (it.hasNext()) {
            for (in5.x0 x0Var : (java.util.List) it.next()) {
                in5.c cVar = x0Var.f374691a;
                ox3.g gVar = cVar instanceof ox3.g ? (ox3.g) cVar : null;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = y2Var.f240085f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                java.lang.Object a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ed0.z0.i1((ed0.z0) a17, 1L, x0Var.f374693c, gVar, 0L, 8, null);
                if (((gVar == null || (n0Var = gVar.f431282d) == null) ? null : n0Var.f497155n) != null) {
                    java.lang.Object a18 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.c3.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                    ed0.z0.i1((ed0.z0) a18, 11L, x0Var.f374693c, gVar, 0L, 8, null);
                }
                y2Var = this;
            }
            y2Var = this;
        }
        return jz5.f0.f384359a;
    }
}
