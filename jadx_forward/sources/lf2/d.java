package lf2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f399813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(lf2.s sVar, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f399813d = sVar;
        this.f399814e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new lf2.d(this.f399813d, this.f399814e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        lf2.d dVar = (lf2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        lf2.s sVar = this.f399813d;
        boolean z17 = this.f399814e == 2;
        gk2.e eVar = sVar.H;
        boolean z18 = z17 && !((om2.e) eVar.a(om2.e.class)).f427829o;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = sVar.V;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("earSwitch");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc8.setEnabled(z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = sVar.V;
        if (viewOnClickListenerC22631x1cc07cc82 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("earSwitch");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(z18);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427828n).k(java.lang.Boolean.valueOf(z18));
        return jz5.f0.f384359a;
    }
}
