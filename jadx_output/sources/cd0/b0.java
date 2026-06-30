package cd0;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cd0.b0 f40525a = new cd0.b0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f40526b;

    public final void a(com.tencent.mm.storage.f9 f9Var, java.util.List list, java.util.List list2, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, boolean z17, long j17, boolean z18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestBatchRevokeNetScene() called with: msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(" msgSvrId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(" type:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.getType()) : null);
        sb6.append(" status:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.P0()) : null);
        sb6.append(" revokeTicket = ");
        sb6.append(str);
        sb6.append(" revokeMsgListSize = ");
        sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
        if (f9Var == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.ng ngVar = new r45.ng();
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        ngVar.f381370d = c01.z1.r();
        ngVar.f381371e = f9Var.Q0();
        ngVar.f381373g = c01.id.c() / 1000;
        ngVar.f381374h = new java.util.LinkedList();
        java.util.List list3 = list2 == null ? list : list2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new cd0.s(list3, ngVar, f0Var, arrayList2, f9Var, arrayList, j17, list, str2, z17, weakReference, z18, str, null), 1, null);
        }
    }

    public final void b(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestRevokeNetScene() called with: msgId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.getMsgId()) : null);
        sb6.append(" msgSvrId:");
        sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.I0()) : null);
        sb6.append(" type:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.getType()) : null);
        sb6.append(" status:");
        sb6.append(f9Var != null ? java.lang.Integer.valueOf(f9Var.P0()) : null);
        sb6.append(" revokeTicket = ");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", sb6.toString());
        com.tencent.mm.modelsimple.d1 d1Var = new com.tencent.mm.modelsimple.d1(f9Var, str, str2);
        gm0.j1.d().a(594, new cd0.t(d1Var));
        gm0.j1.d().g(d1Var);
    }

    public final void c(com.tencent.mm.storage.f9 f9Var, java.lang.String str, yb5.d dVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var2;
        if (f9Var == null || dVar == null) {
            return;
        }
        if (f9Var.n2() && z17) {
            boolean z18 = j62.e.g().c(new com.tencent.mm.repairer.config.revoke.RepairerConfigFileRevokeFix()) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "click revoke file isRepairerConfigFileRevokeFix:%s", java.lang.Boolean.valueOf(z18));
            if (z18) {
                com.tencent.mm.ui.chatting.component.nh nhVar = new com.tencent.mm.ui.chatting.component.nh(dVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.MessBoxComponentKt", "doFileRevoke msg:" + f9Var.getMsgId() + " srvid:" + f9Var.I0() + " talker:" + f9Var.Q0());
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.ui.chatting.component.mh(nhVar, f9Var, null), 2, null);
                    return;
                }
                return;
            }
        }
        if (w11.c1.f441989a.b(f9Var, z17)) {
            ((ku5.t0) ku5.t0.f312615d).g(new cd0.z(dVar, f9Var, dVar.x(), db5.e1.Q(dVar.g(), null, dVar.s().getString(com.tencent.mm.R.string.b5q), true, false, null)));
            return;
        }
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(f9Var.Q0(), f9Var.getMsgId());
        if (dVar.I()) {
            return;
        }
        java.lang.String string = dVar.s().getString(com.tencent.mm.R.string.b5s);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        f40526b = new java.lang.ref.WeakReference(u3Var == null ? db5.e1.Q(dVar.g(), null, dVar.s().getString(com.tencent.mm.R.string.b5q), true, false, null) : u3Var);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() called with: msgId:" + java.lang.Long.valueOf(n17.getMsgId()) + " msgSvrId:" + java.lang.Long.valueOf(n17.I0()) + " type:" + java.lang.Integer.valueOf(n17.getType()) + " status:" + java.lang.Integer.valueOf(n17.P0()) + ", revokeTicket = " + str + ", synchFlag:" + java.lang.Integer.valueOf(n17.h2()));
        if (!(n17.P0() == 2)) {
            if (!(n17.h2() == 1)) {
                if (n17.P0() == 5) {
                    java.lang.ref.WeakReference weakReference2 = f40526b;
                    if (weakReference2 != null && (u3Var2 = (com.tencent.mm.ui.widget.dialog.u3) weakReference2.get()) != null) {
                        u3Var2.dismiss();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.RevokeMsgHandler", "reqRevoke() realtime STATE_FAILED msgId=" + n17.getMsgId());
                    db5.t7.i(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5r), com.tencent.mm.R.raw.icons_filled_error);
                    cd0.c0.f40528a.a(n17, 3);
                } else {
                    ((com.tencent.mm.storage.g9) c01.d9.b().u()).n0(new cd0.a0(n17, string, str, weakReference), android.os.Looper.getMainLooper());
                }
                return;
            }
        }
        b(n17, string, str);
    }
}
