package gk5;

/* loaded from: classes9.dex */
public final class y extends m50.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // m50.x
    public co.a V6() {
        return new ld5.a();
    }

    @Override // m50.x
    public void h7(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str == null ? "" : str);
        X6(arrayList);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClawBotForward: toUser=");
        sb6.append(str);
        sb6.append(", talker=");
        ld5.a aVar = (ld5.a) c7();
        sb6.append(aVar.m75945x2fec8307(aVar.f125235d + 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMultiUIC", sb6.toString());
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        java.util.List q76 = q7();
        if (q76 == null) {
            q76 = new java.util.ArrayList();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((gk5.m1) pf5.z.f435481a.a(activity).a(gk5.m1.class)).V6(q76, com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.d(action.f536274b), 0);
        return true;
    }

    @Override // m50.x
    public void l7() {
        java.util.List q76 = q7();
        if (q76 == null) {
            return;
        }
        ld5.a aVar = (ld5.a) c7();
        java.lang.String m75945x2fec8307 = aVar.m75945x2fec8307(aVar.f125235d + 1);
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).fj(m80379x76847179(), q76, m75945x2fec8307 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(m75945x2fec8307) : null, true, new gk5.v(this));
    }

    @Override // m50.x
    public void n7() {
        ot0.f3 f3Var;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.f287761a.f287736c;
        if (weakReference == null || (f3Var = (ot0.f3) weakReference.get()) == null) {
            return;
        }
        f3Var.f2(ot0.e3.trans);
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        l15.c k17 = ((ld5.a) c7()).k();
        if (k17 == null) {
            return;
        }
        gu.k kVar = new gu.k(toUser, k17);
        kVar.f357149s = "forward_merge_record";
        ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j d17 = qi3.x.f445294a.d(new ru.u(kVar));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new gk5.x(d17, null), 1, null);
        }
    }

    public final java.util.List q7() {
        java.util.LinkedList j17 = ((ld5.a) c7()).j();
        if (j17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            pt0.e0 e0Var = pt0.f0.f439742b1;
            ld5.a aVar = (ld5.a) c7();
            arrayList.add(e0Var.n(aVar.m75945x2fec8307(aVar.f125235d + 1), longValue));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }
}
