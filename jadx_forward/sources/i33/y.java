package i33;

/* loaded from: classes10.dex */
public final class y implements u23.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f369822a;

    public y(i33.a0 a0Var) {
        this.f369822a = a0Var;
    }

    @Override // u23.p
    public void a(java.util.List deleted, boolean z17) {
        java.util.Set set;
        java.util.List list;
        java.util.List list2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleted, "deleted");
        i33.a0 a0Var = this.f369822a;
        android.app.Activity context = a0Var.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((i33.b1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(i33.b1.class)).f369695g.B = deleted.size();
        a0Var.getClass();
        java.util.Set X0 = kz5.n0.X0(deleted);
        if (deleted.isEmpty()) {
            return;
        }
        yz5.a aVar = a0Var.f369678g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.mo152xb9724478() : null;
        java.lang.String str = a0Var.f369677f;
        if (b0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeDeleted: failed");
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeDeleted: skip refreshUI");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = (java.util.ArrayList) a0Var.f369682n;
        java.util.ListIterator listIterator = arrayList.listIterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        while (listIterator.hasNext()) {
            v23.b bVar = (v23.b) listIterator.next();
            boolean removeAll = p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(bVar.f514420b).removeAll(X0);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f514419a, a0Var.X6())) {
                v23.b bVar2 = a0Var.f369684p;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.f514421c, bVar2 != null ? bVar2.f514421c : null) && removeAll) {
                    c0Var.f391645d = true;
                    v23.b bVar3 = a0Var.f369684p;
                    if (bVar3 != null && (list2 = bVar3.f514420b) != null) {
                        list2.size();
                    }
                }
            }
            if (bVar.f514420b.isEmpty() && arrayList.size() > 1) {
                listIterator.remove();
            }
        }
        java.util.ArrayList arrayList2 = b0Var.f328664g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList2, "getSelectedMediaItems(...)");
        java.util.Set d07 = kz5.n0.d0(arrayList2, X0);
        v23.b bVar4 = a0Var.f369684p;
        boolean z18 = false;
        boolean z19 = (bVar4 != null && (list = bVar4.f514420b) != null && list.isEmpty()) && (arrayList.isEmpty() ^ true);
        if (!z19 && (c0Var.f391645d || (!d07.isEmpty()))) {
            z18 = true;
        }
        if (z18) {
            java.util.ArrayList arrayList3 = b0Var.f328663f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList3, "getAllMediaItems(...)");
            set = kz5.n0.d0(arrayList3, X0);
        } else {
            set = kz5.r0.f395535d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "removeDeleted: " + d07.size() + ", " + set.size() + ", " + java.lang.Thread.currentThread().getName() + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
        t23.p0.n().c(new i33.z(a0Var, d07, z19, z18, set, c0Var));
    }
}
