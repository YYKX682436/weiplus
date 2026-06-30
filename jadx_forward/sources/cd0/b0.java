package cd0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cd0.b0 f122058a = new cd0.b0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f122059b;

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.List list, java.util.List list2, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17, long j17, boolean z18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestBatchRevokeNetScene() called with: msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(" msgSvrId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(" type:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(" status:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.P0()) : null);
        sb6.append(" revokeTicket = ");
        sb6.append(str);
        sb6.append(" revokeMsgListSize = ");
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
        if (f9Var == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.ng ngVar = new r45.ng();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        ngVar.f462903d = c01.z1.r();
        ngVar.f462904e = f9Var.Q0();
        ngVar.f462906g = c01.id.c() / 1000;
        ngVar.f462907h = new java.util.LinkedList();
        java.util.List list3 = list2 == null ? list : list2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new cd0.s(list3, ngVar, f0Var, arrayList2, f9Var, arrayList, j17, list, str2, z17, weakReference, z18, str, null), 1, null);
        }
    }

    public final void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestRevokeNetScene() called with: msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
        sb6.append(" msgSvrId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(" type:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()) : null);
        sb6.append(" status:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.P0()) : null);
        sb6.append(" revokeTicket = ");
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
        com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var = new com.p314xaae8f345.mm.p957x53236a1b.d1(f9Var, str, str2);
        gm0.j1.d().a(594, new cd0.t(d1Var));
        gm0.j1.d().g(d1Var);
    }

    public final void c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, yb5.d dVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2;
        if (f9Var == null || dVar == null) {
            return;
        }
        if (f9Var.n2() && z17) {
            boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2564xc84f0e86.C20644x607059f7()) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "click revoke file isRepairerConfigFileRevokeFix:%s", java.lang.Boolean.valueOf(z18));
            if (z18) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh nhVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nh(dVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MessBoxComponentKt", "doFileRevoke msg:" + f9Var.m124847x74d37ac6() + " srvid:" + f9Var.I0() + " talker:" + f9Var.Q0());
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
                if (c20976x6ba6452a != null) {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.l.d(c20976x6ba6452a, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.mh(nhVar, f9Var, null), 2, null);
                    return;
                }
                return;
            }
        }
        if (w11.c1.f523522a.b(f9Var, z17)) {
            ((ku5.t0) ku5.t0.f394148d).g(new cd0.z(dVar, f9Var, dVar.x(), db5.e1.Q(dVar.g(), null, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5q), true, false, null)));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(f9Var.Q0(), f9Var.m124847x74d37ac6());
        if (dVar.I()) {
            return;
        }
        java.lang.String string = dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        f122059b = new java.lang.ref.WeakReference(u3Var == null ? db5.e1.Q(dVar.g(), null, dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5q), true, false, null) : u3Var);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() called with: msgId:" + java.lang.Long.valueOf(n17.m124847x74d37ac6()) + " msgSvrId:" + java.lang.Long.valueOf(n17.I0()) + " type:" + java.lang.Integer.valueOf(n17.mo78013xfb85f7b0()) + " status:" + java.lang.Integer.valueOf(n17.P0()) + ", revokeTicket = " + str + ", synchFlag:" + java.lang.Integer.valueOf(n17.h2()));
        if (!(n17.P0() == 2)) {
            if (!(n17.h2() == 1)) {
                if (n17.P0() == 5) {
                    java.lang.ref.WeakReference weakReference2 = f122059b;
                    if (weakReference2 != null && (u3Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference2.get()) != null) {
                        u3Var2.dismiss();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() realtime STATE_FAILED msgId=" + n17.m124847x74d37ac6());
                    db5.t7.i(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5r), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                    cd0.c0.f122061a.a(n17, 3);
                } else {
                    ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n0(new cd0.a0(n17, string, str, weakReference), android.os.Looper.getMainLooper());
                }
                return;
            }
        }
        b(n17, string, str);
    }
}
