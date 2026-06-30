package kh;

/* loaded from: classes10.dex */
public final class a4 implements p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f389282a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f389283b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f389284c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f389285d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f389286e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f389287f;

    public a4(java.lang.String name, java.lang.Class proxyClass, java.util.List listenerList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proxyClass, "proxyClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenerList, "listenerList");
        this.f389282a = name;
        this.f389283b = proxyClass;
        this.f389284c = listenerList;
        this.f389285d = kh.k4.f389377a.d(name);
        this.f389287f = jz5.h.a(jz5.i.f384362d, kh.z3.f389499d);
    }

    @Override // p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747
    public java.lang.Object add(java.lang.Object obj) {
        boolean z17 = this.f389285d;
        kh.w3 w3Var = kh.y3.f389487d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "addListener: " + w3Var.a(obj));
        }
        return w3Var.b(this.f389282a, obj, this.f389283b, obj != null ? obj.getClass().getName() : null);
    }

    @Override // p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747
    /* renamed from: clear */
    public void mo2495x5a5b64d() {
        this.f389286e = true;
        if (this.f389285d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "clear");
        }
    }

    @Override // p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747
    public void end() {
        boolean z17 = this.f389285d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "end");
        }
        boolean z18 = this.f389286e;
        jz5.g gVar = this.f389287f;
        java.util.List list = this.f389284c;
        if (z18) {
            list.clear();
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "end, clear");
            }
        } else {
            java.util.Iterator it = ((java.util.ArrayList) gVar.mo141623x754a37bb()).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                list.remove(next);
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "end, remove: " + kh.y3.f389487d.a(next));
                }
            }
        }
        this.f389286e = false;
        ((java.util.ArrayList) gVar.mo141623x754a37bb()).clear();
    }

    @Override // p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747
    /* renamed from: remove */
    public void mo2496xc84af884(java.lang.Object obj) {
        ((java.util.ArrayList) this.f389287f.mo141623x754a37bb()).add(obj);
        if (this.f389285d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", "removeListener: " + kh.y3.f389487d.a(obj));
        }
    }

    @Override // p001xcca8366f.p011x373aa5.InterfaceC0051x421b4747
    /* renamed from: size */
    public int mo2497x35e001() {
        return -1;
    }
}
