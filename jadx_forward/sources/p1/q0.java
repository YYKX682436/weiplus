package p1;

/* loaded from: classes14.dex */
public final class q0 extends p1.y implements p1.z, p1.a0, p2.f {

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 f432399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p2.f f432400g;

    /* renamed from: h, reason: collision with root package name */
    public p1.l f432401h;

    /* renamed from: i, reason: collision with root package name */
    public final o0.i f432402i;

    /* renamed from: m, reason: collision with root package name */
    public final o0.i f432403m;

    /* renamed from: n, reason: collision with root package name */
    public p1.l f432404n;

    /* renamed from: o, reason: collision with root package name */
    public long f432405o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f432406p;

    public q0(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k4 viewConfiguration, p2.f density) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewConfiguration, "viewConfiguration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        this.f432399f = viewConfiguration;
        this.f432400g = density;
        this.f432401h = p1.x0.f432457a;
        this.f432402i = new o0.i(new p1.o0[16], 0);
        this.f432403m = new o0.i(new p1.o0[16], 0);
        this.f432405o = 0L;
        this.f432406p = p3325xe03a0797.p3326xc267989b.i2.f392010d;
    }

    public final void C(p1.l lVar, p1.n nVar) {
        synchronized (this.f432402i) {
            o0.i iVar = this.f432403m;
            iVar.d(iVar.f423385f, this.f432402i);
        }
        try {
            int ordinal = nVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    o0.i iVar2 = this.f432403m;
                    int i17 = iVar2.f423385f;
                    if (i17 > 0) {
                        int i18 = i17 - 1;
                        java.lang.Object[] objArr = iVar2.f423383d;
                        do {
                            ((p1.o0) objArr[i18]).g(lVar, nVar);
                            i18--;
                        } while (i18 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            o0.i iVar3 = this.f432403m;
            int i19 = iVar3.f423385f;
            if (i19 > 0) {
                java.lang.Object[] objArr2 = iVar3.f423383d;
                int i27 = 0;
                do {
                    ((p1.o0) objArr2[i27]).g(lVar, nVar);
                    i27++;
                } while (i27 < i19);
            }
        } finally {
            this.f432403m.e();
        }
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // p2.f
    public int G(float f17) {
        return this.f432400g.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.f432400g.H(j17);
    }

    @Override // p1.z
    public p1.y N() {
        return this;
    }

    @Override // p2.f
    public float R(float f17) {
        return this.f432400g.R(f17);
    }

    @Override // p1.y
    public void b() {
        boolean z17;
        p1.l lVar = this.f432404n;
        if (lVar == null) {
            return;
        }
        java.util.List list = lVar.f432375a;
        int size = list.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            z17 = true;
            if (i18 >= size) {
                break;
            }
            if (!(true ^ ((p1.s) list.get(i18)).f432415d)) {
                z17 = false;
                break;
            }
            i18++;
        }
        if (z17) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        while (i17 < size2) {
            p1.s sVar = (p1.s) list.get(i17);
            long j17 = sVar.f432412a;
            long j18 = sVar.f432414c;
            long j19 = sVar.f432413b;
            boolean z18 = sVar.f432415d;
            arrayList.add(new p1.s(j17, j19, j18, false, j19, j18, z18, z18, 1, d1.e.f307156b, null));
            i17++;
            list = list;
        }
        p1.l lVar2 = new p1.l(arrayList);
        this.f432401h = lVar2;
        C(lVar2, p1.n.Initial);
        C(lVar2, p1.n.Main);
        C(lVar2, p1.n.Final);
        this.f432404n = null;
    }

    @Override // p1.y
    public void c(p1.l pointerEvent, p1.n pass, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointerEvent, "pointerEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pass, "pass");
        this.f432405o = j17;
        if (pass == p1.n.Initial) {
            this.f432401h = pointerEvent;
        }
        C(pointerEvent, pass);
        java.util.List list = pointerEvent.f432375a;
        int size = list.size();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                z17 = true;
                break;
            } else if (!p1.m.c((p1.s) list.get(i17))) {
                break;
            } else {
                i17++;
            }
        }
        if (!(!z17)) {
            pointerEvent = null;
        }
        this.f432404n = pointerEvent;
    }

    @Override // p2.f
    public long e(long j17) {
        return this.f432400g.e(j17);
    }

    @Override // p2.f
    /* renamed from: getDensity */
    public float mo7005x9a59d0b2() {
        return this.f432400g.mo7005x9a59d0b2();
    }

    @Override // p2.f
    /* renamed from: getFontScale */
    public float mo7006xa2f3d785() {
        return this.f432400g.mo7006xa2f3d785();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(this, obj);
    }

    @Override // p2.f
    public float n(int i17) {
        return this.f432400g.n(i17);
    }

    @Override // p2.f
    public float o(float f17) {
        return this.f432400g.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.f432400g.t(j17);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        return operation.mo149xb9724478(obj, this);
    }

    public java.lang.Object v(yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p1.o0 o0Var = new p1.o0(this, rVar);
        synchronized (this.f432402i) {
            this.f432402i.b(o0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pVar, "<this>");
            oz5.n nVar = new oz5.n(pz5.f.b(pz5.f.a(pVar, o0Var, o0Var)), pz5.a.f440719d);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
        }
        rVar.m(new p1.p0(o0Var));
        return rVar.j();
    }

    @Override // p2.f
    public long z(float f17) {
        return this.f432400g.z(f17);
    }
}
