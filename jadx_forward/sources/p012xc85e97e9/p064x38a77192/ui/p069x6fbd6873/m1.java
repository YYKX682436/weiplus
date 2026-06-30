package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class m1 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.Choreographer f92174d;

    public m1(android.view.Choreographer choreographer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choreographer, "choreographer");
        this.f92174d = choreographer;
    }

    @Override // oz5.l
    /* renamed from: fold */
    public java.lang.Object mo7093x300c01(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    /* renamed from: getKey */
    public oz5.j mo7094xb5884f29() {
        return n0.q2.f415218d;
    }

    @Override // n0.r2
    public java.lang.Object l(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        int i17 = oz5.f.Y0;
        oz5.i iVar = mo48699x76847179.get(oz5.e.f431860d);
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = iVar instanceof p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 ? (p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1) iVar : null;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l1 l1Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l1(rVar, this, lVar);
        if (i1Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i1Var.f92122e, this.f92174d)) {
            this.f92174d.postFrameCallback(l1Var);
            rVar.m(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k1(this, l1Var));
        } else {
            synchronized (i1Var.f92124g) {
                i1Var.f92126i.add(l1Var);
                if (!i1Var.f92129o) {
                    i1Var.f92129o = true;
                    i1Var.f92122e.postFrameCallback(i1Var.f92130p);
                }
            }
            rVar.m(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j1(i1Var, l1Var));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // oz5.l
    /* renamed from: minusKey */
    public oz5.l mo7095xafa9a7cf(oz5.j key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    /* renamed from: plus */
    public oz5.l mo7096x348d9a(oz5.l context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
