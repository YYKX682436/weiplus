package fr2;

/* loaded from: classes2.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f347253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f347254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fr2.p f347255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17, fr2.p pVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f347253d = hVar;
        this.f347254e = z17;
        this.f347255f = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fr2.h(this.f347253d, interfaceC29045xdcb5ca57, this.f347254e, this.f347255f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fr2.h hVar = (fr2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.f42 f42Var = (r45.f42) ((xg2.i) this.f347253d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("randomEnterLive: cgi success, isPreload=");
        boolean z17 = this.f347254e;
        sb6.append(z17);
        sb6.append(", enter objectId=");
        java.util.LinkedList m75941xfb821914 = f42Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.Z(m75941xfb821914);
        sb6.append(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        sb6.append(", continue_flag=");
        sb6.append(f42Var.m75939xb282bd08(3));
        sb6.append(", preload_interval=");
        sb6.append(f42Var.m75939xb282bd08(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayTogetherBottomBarUIC", sb6.toString());
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = f42Var.m75934xbce7f2f(2);
        fr2.p pVar = this.f347255f;
        pVar.f347270e = m75934xbce7f2f;
        pVar.f347271f = f42Var.m75934xbce7f2f(4);
        int m75939xb282bd08 = f42Var.m75939xb282bd08(5);
        if (m75939xb282bd08 < 0) {
            m75939xb282bd08 = 0;
        }
        pVar.f347278p = m75939xb282bd08 * 1000;
        if (f42Var.m75939xb282bd08(3) == 0) {
            pVar.f347269d.clear();
        }
        java.util.LinkedList m75941xfb8219142 = f42Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.Z(m75941xfb8219142);
        if (c19792x256d27252 != null) {
            if (z17) {
                pVar.f347280r = c19792x256d27252;
            } else {
                fr2.p.O6(pVar, c19792x256d27252);
            }
        }
        return jz5.f0.f384359a;
    }
}
