package j93;

/* loaded from: classes.dex */
public final class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.v2 f380038d;

    public t2(int i17, j93.v2 v2Var) {
        this.f380038d = v2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList;
        j75.f m67437x4bd5310;
        if (menuItem.getItemId() == 1) {
            j93.v2 v2Var = this.f380038d;
            v2Var.f380056m = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = v2Var.P6();
            if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
                m67437x4bd5310.B3(new wi5.b());
            }
            java.util.ArrayList arrayList2 = v2Var.f380051e;
            int size = arrayList2.size();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 k17 = ((em.l2) ((jz5.n) v2Var.f380050d).mo141623x754a37bb()).k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getSelectContactRv(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe a17 = xm3.u0.a(k17);
            int size2 = (a17 == null || (arrayList = a17.f233598o) == null) ? 0 : arrayList.size();
            b93.q.f100138a.a(1, 2, 1, 23, v2Var.f380052f, v2Var.T6(), 0, size, size2, size2 - size);
            v2Var.f380055i = 0;
            v2Var.f380054h = 0;
            v2Var.f380053g = false;
            java.lang.String stringExtra = v2Var.m158359x1e885992().getStringExtra("label_id");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            if (arrayList2.size() > 0) {
                arrayList2.size();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(next, "null cannot be cast to non-null type kotlin.String");
                    java.lang.String str = (java.lang.String) next;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
                    if (n17 != null) {
                        java.lang.String D0 = n17.D0();
                        java.lang.String c17 = b93.n.c(D0, stringExtra);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectLabelRemoveContactUIC", "username:%s labels:%s mixLabelIds:%s", str, D0, c17);
                        if (!r26.i0.p(c17, D0, true)) {
                            r45.gw6 gw6Var = new r45.gw6();
                            gw6Var.f457114d = str;
                            gw6Var.f457115e = c17;
                            linkedList.add(gw6Var);
                        }
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectLabelRemoveContactUIC", "doUpdateContactList: contact is null");
                    }
                }
                if (linkedList.size() > 0) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = v2Var.m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    v2Var.f380057n = ((cj5.o) pf5.z.f435481a.a(activity).a(cj5.o.class)).T6();
                    r45.ip4 ip4Var = new r45.ip4();
                    ip4Var.f458789e = linkedList;
                    ip4Var.f458788d = linkedList.size();
                    ip4Var.b().l().K(new j93.q2(v2Var, ip4Var));
                }
            }
        }
    }
}
