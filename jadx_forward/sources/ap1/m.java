package ap1;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f94234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f94235f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ap1.w wVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94234e = wVar;
        this.f94235f = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ap1.m mVar = new ap1.m(this.f94234e, this.f94235f, interfaceC29045xdcb5ca57);
        mVar.f94233d = obj;
        return mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean a17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f94233d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 dialog = this.f94235f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dialog, "$dialog");
        po1.c cVar = po1.d.f438827i;
        ap1.w wVar = this.f94234e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = wVar.f94285i;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.u uVar = gVar.f297365g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uVar, "getTargetDevice(...)");
        po1.d a18 = cVar.a(uVar);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = wVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = true;
        if (a18.f438829b != po1.g.f438843h) {
            a17 = true;
        } else {
            po1.d e17 = ro1.v.f479547a.e(a18.f438828a);
            a17 = ((e17 == null || so1.b.f491759a.h(e17)) ? so1.g.f491771a : to1.g.f502444a).a(context, a18);
        }
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "Check permission failed.");
            pf5.e.m158344xbe96bc24(wVar, null, null, new ap1.i(dialog, wVar, a18, null), 3, null);
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            return f0Var;
        }
        p3325xe03a0797.p3326xc267989b.z0.g(y0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = wVar.f94285i;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String str = gVar2.f297365g.f297522e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDeviceId(...)");
        boolean m17 = r0Var.m(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connectivity of Device=");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar3 = wVar.f94285i;
        if (gVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        sb6.append(gVar3.f297365g.f297522e);
        sb6.append(" is ");
        sb6.append(m17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        if (m17) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ap1.l(wVar, dialog, null), 3, null);
        } else {
            pf5.e.m158344xbe96bc24(wVar, null, null, new ap1.k(wVar, dialog, null), 3, null);
        }
        return f0Var;
    }
}
