package j93;

/* loaded from: classes.dex */
public final class r0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f380021d = jz5.h.b(new j93.q0(this));
    }

    public static final void T6(j93.r0 r0Var, java.util.List list) {
        jz5.f0 f0Var;
        j75.f m67437x4bd5310;
        r0Var.getClass();
        java.util.List e17 = g95.e.f351334a.e(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(e17, 10));
        java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
            ri5.h hVar = ri5.j.I;
            int i17 = ri5.j.Z;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            java.lang.String a17 = hVar.a(d17, i17, 0);
            ti5.d dVar = new ti5.d(null, null, 0, 0, 0, 0, null, false, 255, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = r0Var.P6();
            if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
                f0Var = null;
            } else {
                m67437x4bd5310.B3(new wi5.t0(ti5.d.f501196i.b(r0Var.m158354x19263085(), a17, z3Var, i17, dVar), -1, 1));
                f0Var = jz5.f0.f384359a;
            }
            arrayList.add(f0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new j93.n0(this));
    }
}
