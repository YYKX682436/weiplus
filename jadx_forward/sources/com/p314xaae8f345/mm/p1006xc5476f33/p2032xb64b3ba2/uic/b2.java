package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f239882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2 f239883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2 d2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f239883e = d2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b2(this.f239883e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.b2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f239882d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d2 d2Var = this.f239883e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rx3.u P6 = d2Var.P6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = d2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class)).f240034g;
            this.f239882d = 1;
            obj = rx3.i.b(P6, i18, false, false, this, 6, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        rx3.j jVar = (rx3.j) obj;
        boolean z17 = jVar.f482568c;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = d2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class)).O6();
            return f0Var;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = d2Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        pf5.z zVar = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class)).P6(jVar.f482566a);
        if (!jVar.f482567b) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = d2Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) zVar.a(activity4).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class)).O6();
        }
        return f0Var;
    }
}
