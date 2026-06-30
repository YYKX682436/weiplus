package n0;

/* loaded from: classes14.dex */
public final class u1 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0.u1 f415247d = new n0.u1();

    /* renamed from: e, reason: collision with root package name */
    public static final android.view.Choreographer f415248e;

    static {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        f415248e = (android.view.Choreographer) p3325xe03a0797.p3326xc267989b.l.e(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, new n0.r1(null));
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
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        n0.t1 t1Var = new n0.t1(rVar, lVar);
        f415248e.postFrameCallback(t1Var);
        rVar.m(new n0.s1(t1Var));
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
