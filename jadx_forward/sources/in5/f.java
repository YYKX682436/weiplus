package in5;

/* loaded from: classes2.dex */
public final class f extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Set f374569a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.i f374570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f374571c;

    public f(in5.i iVar, yz5.l lVar) {
        this.f374570b = iVar;
        this.f374571c = lVar;
    }

    @Override // ym5.m0
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var);
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        return ((java.lang.Boolean) this.f374571c.mo146xb9724478(itemView)).booleanValue();
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0.0f;
    }

    @Override // ym5.m0
    public long c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.i iVar = this.f374570b;
        return iVar != null ? iVar.b(k3Var) : super.c(k3Var);
    }

    @Override // ym5.m0
    public boolean d() {
        in5.i iVar = this.f374570b;
        if (iVar != null) {
            return true ^ (iVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ye);
        }
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.Object a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        boolean isEmpty = exposedHolders.isEmpty();
        in5.i iVar = this.f374570b;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EasyExposeTimeRecordListener", "current exposed exposeHolders is empty");
            in5.h.a(this.f374569a);
            if (iVar != null) {
                iVar.c(this.f374569a);
            }
            this.f374569a.clear();
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            if (iVar != null && (a17 = iVar.a(k3Var)) != null) {
                in5.e eVar = new in5.e(a17);
                if (!this.f374569a.contains(eVar)) {
                    eVar.f374556b = hq.d.a();
                    eVar.f374559e = k3Var.m8183xf806b362();
                    eVar.f374560f = k3Var.f3639x46306858;
                    this.f374569a.add(eVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EasyExposeTimeRecordListener", "add new record: " + eVar);
                    iVar.d(eVar);
                }
                hashSet.add(eVar);
            }
        }
        if (this.f374569a.size() > hashSet.size()) {
            java.util.Set g17 = kz5.q1.g(this.f374569a, hashSet);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EasyExposeTimeRecordListener", "find diff record: size = " + g17.size());
            in5.h.a(g17);
            if (iVar != null) {
                iVar.c(g17);
            }
            java.util.Set g18 = kz5.q1.g(this.f374569a, g17);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.i(g18)) {
                g18 = null;
            }
            if (g18 != null) {
                this.f374569a = g18;
            }
        }
    }
}
