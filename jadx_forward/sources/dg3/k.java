package dg3;

/* loaded from: classes3.dex */
public abstract class k extends lf3.n implements dg3.m, db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f313865d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.p2 f313866e;

    /* renamed from: f, reason: collision with root package name */
    public dg3.o f313867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void V6(dg3.k kVar, db5.g4 g4Var, java.util.List list) {
        kVar.getClass();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dg3.p pVar = (dg3.p) it.next();
            java.lang.String string = kVar.m80379x76847179().getString(pVar.f313871b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i17 = pVar.f313872c;
            dg3.q qVar = pVar.f313870a;
            java.lang.Integer num = pVar.f313873d;
            if (num != null) {
                g4Var.h(qVar.f313885d, string, i17, kVar.m80379x76847179().getResources().getColor(num.intValue()));
            } else {
                g4Var.h(qVar.f313885d, string, i17, 0);
            }
        }
    }

    public abstract java.util.List W6(mf3.k kVar);

    public dg3.o X6(mf3.k info, mf3.p apiCenter) {
        dg3.o aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        int ordinal = info.mo2109xfb85f7b0().ordinal();
        if (ordinal == 1) {
            aVar = new dg3.a(info, apiCenter);
        } else {
            if (ordinal != 2) {
                return null;
            }
            aVar = new dg3.l(info, apiCenter);
        }
        return aVar;
    }

    public abstract java.util.List Y6(mf3.k kVar);

    @Override // dg3.m
    public void Z0(mf3.k info, mf3.p apiCenter, dg3.q type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        dg3.o X6 = X6(info, apiCenter);
        this.f313867f = X6;
        if (X6 != null) {
            X6.a(type);
        }
    }

    public void Z6(mf3.k info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((jd0.q2) x2Var).getClass();
        this.f313866e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(m158354x19263085);
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        dg3.o oVar;
        if (menuItem != null) {
            int itemId = menuItem.getItemId();
            rz5.a aVar = dg3.q.f313884r;
            int d17 = kz5.b1.d(kz5.d0.q(aVar, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            for (java.lang.Object obj : aVar) {
                linkedHashMap.put(java.lang.Integer.valueOf(((dg3.q) obj).f313885d), obj);
            }
            dg3.q qVar = (dg3.q) linkedHashMap.get(java.lang.Integer.valueOf(itemId));
            if (qVar == null || (oVar = this.f313867f) == null) {
                return;
            }
            oVar.a(qVar);
        }
    }

    @Override // dg3.m
    public void y6(mf3.k info, mf3.p apiCenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        sf3.f fVar = (sf3.f) U6(sf3.f.class);
        sf3.k Q3 = fVar != null ? fVar.Q3(info) : null;
        if (info.mo2109xfb85f7b0() == mf3.u.f407656e && Q3 == sf3.k.f488932g) {
            dg3.n nVar = (dg3.n) U6(dg3.n.class);
            if (nVar != null) {
                rh5.g gVar = (rh5.g) nVar;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) gVar.m158354x19263085(), 0, true);
                k0Var.f293405n = new rh5.f(gVar);
                rh5.i iVar = new rh5.i(gVar.m158354x19263085(), info, apiCenter);
                k0Var.f293414s = iVar;
                k0Var.f293387d = iVar;
                k0Var.v();
                return;
            }
            return;
        }
        this.f313867f = X6(info, apiCenter);
        this.f313865d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m158354x19263085(), 0, true);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = this.f313865d;
        if (k0Var2 != null) {
            k0Var2.f293409p = new dg3.b(mVar, this);
        }
        if (k0Var2 != null) {
            k0Var2.f293419x = new dg3.c(mVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var2);
        k0Var2.f293418w = new dg3.e(mVar, this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.f313865d;
        if (k0Var3 != null) {
            k0Var3.f293405n = new dg3.f(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f293407o = new dg3.g(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f293412q = new dg3.h(this, info);
        }
        if (k0Var3 != null) {
            k0Var3.f293387d = new dg3.i(this);
        }
        if (k0Var3 != null) {
            k0Var3.C = new dg3.j(this);
        }
        if (k0Var3 != null) {
            k0Var3.f293414s = this;
        }
        if (k0Var3 != null) {
            k0Var3.f293417v = this;
        }
        if (k0Var3 != null) {
            k0Var3.f293422y = this;
        }
        if (k0Var3 != null) {
            k0Var3.v();
        }
        Z6(info);
    }
}
