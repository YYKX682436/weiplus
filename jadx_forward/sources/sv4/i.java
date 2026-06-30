package sv4;

/* loaded from: classes12.dex */
public final class i implements jv4.h, sv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f494933a;

    /* renamed from: b, reason: collision with root package name */
    public rv4.z f494934b;

    /* renamed from: c, reason: collision with root package name */
    public jv4.i f494935c;

    public i(java.lang.ref.WeakReference settingDelegate, mv4.h session) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingDelegate, "settingDelegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        this.f494933a = settingDelegate;
    }

    @Override // jv4.h
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 a(android.view.ViewGroup parent, jv4.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 6) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570663eg3, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new sv4.l(inflate);
        }
        if (ordinal != 7) {
            return new jv4.g(new android.view.View(parent.getContext()));
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570664eg4, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
        return new sv4.q(inflate2);
    }

    @Override // jv4.h
    public java.util.List b() {
        rv4.z zVar = this.f494934b;
        if (zVar == null) {
            return kz5.p0.f395529d;
        }
        java.util.List list = zVar.f482096a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new tv4.b(this.f494933a, this, (rv4.a0) it.next()));
        }
        return kz5.n0.t0(kz5.b0.c(new tv4.f()), arrayList);
    }

    @Override // jv4.h
    public void c(jv4.i iVar) {
        this.f494935c = iVar;
    }
}
