package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f239924d;

    /* renamed from: e, reason: collision with root package name */
    public int f239925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.k1 f239926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f239927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.k1 k1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f239926f = k1Var;
        this.f239927g = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.e1(this.f239926f, this.f239927g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vx3.i f17;
        java.lang.Object e17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f239925e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            f17 = mx3.i0.f();
            this.f239924d = f17;
            this.f239925e = 1;
            e17 = xx3.h.f539557a.e(2, 1, 0, 0L, "", 0, 0, 0, "", this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vx3.i iVar = (vx3.i) this.f239924d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            f17 = iVar;
            e17 = obj;
        }
        boolean z17 = ((rm0.i) e17).f478954a;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f239927g;
        if (z17) {
            mx3.i0.k("", null);
            boolean z18 = (f17.f522834r == null || f17.i().f339137b == null || !co4.c.b(f17.i())) ? false : true;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f239926f.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.d3.class)).P6(f17, null, z18);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            mx3.i0.m(r17, null, 0L, 4, null);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f384359a;
    }
}
