package zm1;

/* loaded from: classes10.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zm1.n {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f555691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f555691d = jz5.h.b(new zm1.i(activity));
    }

    public final java.util.ArrayList O6() {
        return (java.util.ArrayList) ((jz5.n) this.f555691d).mo141623x754a37bb();
    }

    @Override // zm1.n
    public void R(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).R(listener);
        }
    }

    @Override // zm1.n
    public java.lang.Object d(boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new zm1.j(this, nVar, z17, null), 3, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // zm1.n
    public void k5(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).k5(listener);
        }
    }

    @Override // zm1.n
    public void m0(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).m0(listener);
        }
    }

    @Override // zm1.n
    public void m2(um1.b listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.Iterator it = O6().iterator();
        while (it.hasNext()) {
            ((zm1.n) it.next()).m2(listener);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (m158354x19263085() instanceof p012xc85e97e9.p013x9d4bf30f.k) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type androidx.activity.OnBackPressedDispatcherOwner");
            m158354x19263085.mo2510x96a7816d().b(new zm1.l(this));
        }
    }
}
