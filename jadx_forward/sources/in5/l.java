package in5;

/* loaded from: classes2.dex */
public final class l extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f374616a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.p f374617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f374618c;

    public l(in5.p pVar, yz5.l lVar) {
        this.f374617b = pVar;
        this.f374618c = lVar;
    }

    @Override // ym5.m0
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        return ((java.lang.Boolean) this.f374618c.mo146xb9724478(itemView)).booleanValue();
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.p pVar = this.f374617b;
        if (pVar != null) {
            return pVar.a(view);
        }
        return 0.0f;
    }

    @Override // ym5.m0
    public long c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (this.f374617b == null) {
            return super.c(k3Var);
        }
        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
        in5.c cVar = s0Var != null ? (in5.c) s0Var.f374658i : null;
        in5.c cVar2 = cVar instanceof in5.c ? cVar : null;
        if (cVar2 != null) {
            return cVar2.mo2128x1ed62e84();
        }
        return 0L;
    }

    @Override // ym5.m0
    public boolean d() {
        in5.p pVar = this.f374617b;
        if (pVar != null) {
            return pVar.b();
        }
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        boolean isEmpty = exposedHolders.isEmpty();
        in5.p pVar = this.f374617b;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExposeTimeRecordListener", "current exposed exposeHolders is empty");
            in5.o.a(this.f374616a);
            if (pVar != null) {
                pVar.c(this.f374616a);
            }
            this.f374616a.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<in5.s0> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : exposedHolders) {
            if (obj instanceof in5.s0) {
                arrayList.add(obj);
            }
        }
        for (in5.s0 s0Var : arrayList) {
            in5.c cVar = (in5.c) s0Var.f374658i;
            if (cVar != null) {
                in5.j jVar = new in5.j(cVar);
                if (!this.f374616a.contains(jVar)) {
                    jVar.f374604b = hq.d.a();
                    jVar.f374607e = s0Var.m8183xf806b362();
                    jVar.f374608f = s0Var.f3639x46306858;
                    this.f374616a.add(jVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExposeTimeRecordListener", "add new record: " + jVar);
                    if (pVar != null) {
                        pVar.d(jVar);
                    }
                }
                hashSet.add(jVar);
            }
        }
        if (this.f374616a.size() > hashSet.size()) {
            java.util.Set g17 = kz5.q1.g(this.f374616a, hashSet);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExposeTimeRecordListener", "find diff record: size = " + g17.size());
            in5.o.a(g17);
            if (pVar != null) {
                pVar.c(g17);
            }
            java.util.Set g18 = kz5.q1.g(this.f374616a, g17);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(g18)) {
                g18 = null;
            }
            if (g18 != null) {
                this.f374616a = g18;
            }
        }
    }
}
