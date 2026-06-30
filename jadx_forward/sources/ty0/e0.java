package ty0;

/* loaded from: classes5.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f504357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f504359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e0.f1 f1Var, n0.e5 e5Var, ty0.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f504357d = f1Var;
        this.f504358e = e5Var;
        this.f504359f = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ty0.e0(this.f504357d, this.f504358e, this.f504359f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ty0.e0 e0Var = (ty0.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ty0.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        n0.h3 h3Var = ty0.z0.f504575a;
        e0.f1 f1Var = this.f504357d;
        java.util.List b17 = f1Var.f().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : b17) {
            e0.q0 q0Var = (e0.q0) ((e0.n) obj2);
            int max = java.lang.Math.max(0, f1Var.f().d() - q0Var.f327211a);
            int i17 = q0Var.f327211a;
            int i18 = q0Var.f327214d;
            if (java.lang.Math.max(0.0f, 100.0f - ((((float) (max + java.lang.Math.max(0, (i17 + i18) - f1Var.f().f()))) * 100.0f) / ((float) i18))) >= 30.0f) {
                arrayList.add(obj2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) kz5.n0.a0(ty0.z0.h(this.f504358e), ((e0.q0) ((e0.n) it.next())).f327212b));
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 c4116xf4b2c356 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356) it6.next();
            if (c4116xf4b2c356 != null && (cVar = this.f504359f.f504333j) != null) {
                java.lang.String m33856x92013dca = c4116xf4b2c356.m33856x92013dca();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33856x92013dca, "getMusicID(...)");
                bz0.j.f118283a.a(((mz0.q2) cVar).f414562a.o7().a(), m33856x92013dca);
            }
        }
        return jz5.f0.f384359a;
    }
}
