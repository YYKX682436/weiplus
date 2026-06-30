package i33;

/* loaded from: classes10.dex */
public class z0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final j33.u f369833f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.q2 f369834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369833f = new j33.u();
        this.f369834g = com.p314xaae8f345.mm.ui.q2.NORMAL;
    }

    public static /* synthetic */ void Y6(i33.z0 z0Var, i33.c cVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        z0Var.X6(cVar, i17);
    }

    public final void W6(com.p314xaae8f345.mm.ui.q2 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        java.util.Objects.toString(this.f369834g);
        newMode.toString();
        java.util.List F0 = kz5.n0.F0(((java.util.LinkedHashMap) this.f369833f.f378991a).entrySet(), new j33.t());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(F0, 10));
        java.util.Iterator it = F0.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.util.Map.Entry) it.next()).getKey());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((i33.c) it6.next()).V6(this.f369834g, newMode);
        }
        this.f369834g = newMode;
    }

    public final void X6(i33.c uic, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        this.f369833f.f378991a.put(uic, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        j33.u uVar = this.f369833f;
        if (!uVar.f378991a.isEmpty()) {
            ((java.util.LinkedHashMap) uVar.f378991a).clear();
        }
        this.f369834g = com.p314xaae8f345.mm.ui.q2.NORMAL;
    }
}
