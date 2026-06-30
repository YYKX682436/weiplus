package n0;

/* loaded from: classes14.dex */
public final class h implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f415053d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f415055f;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f415054e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f415056g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f415057h = new java.util.ArrayList();

    public h(yz5.a aVar) {
        this.f415053d = aVar;
    }

    public final boolean d() {
        boolean z17;
        synchronized (this.f415054e) {
            z17 = !this.f415056g.isEmpty();
        }
        return z17;
    }

    public final void e(long j17) {
        java.lang.Object m143895xf1229813;
        synchronized (this.f415054e) {
            java.util.List list = this.f415056g;
            this.f415056g = this.f415057h;
            this.f415057h = list;
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                n0.f fVar = (n0.f) list.get(i17);
                fVar.getClass();
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(fVar.f415035a.mo146xb9724478(java.lang.Long.valueOf(j17)));
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                fVar.f415036b.mo48700xdecd0e93(m143895xf1229813);
            }
            list.clear();
        }
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
        yz5.a aVar;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        synchronized (this.f415054e) {
            java.lang.Throwable th6 = this.f415055f;
            if (th6 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6)));
            } else {
                h0Var.f391656d = new n0.f(lVar, rVar);
                boolean z17 = !this.f415056g.isEmpty();
                java.util.List list = this.f415056g;
                java.lang.Object obj = h0Var.f391656d;
                if (obj == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("awaiter");
                    throw null;
                }
                list.add((n0.f) obj);
                boolean z18 = !z17;
                rVar.m(new n0.g(this, h0Var));
                if (z18 && (aVar = this.f415053d) != null) {
                    try {
                        aVar.mo152xb9724478();
                    } catch (java.lang.Throwable th7) {
                        synchronized (this.f415054e) {
                            if (this.f415055f == null) {
                                this.f415055f = th7;
                                java.util.List list2 = this.f415056g;
                                int size = list2.size();
                                for (int i17 = 0; i17 < size; i17++) {
                                    p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 = ((n0.f) list2.get(i17)).f415036b;
                                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                                    interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7)));
                                }
                                this.f415056g.clear();
                            }
                        }
                    }
                }
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f440719d;
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
