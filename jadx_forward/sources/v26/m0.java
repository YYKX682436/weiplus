package v26;

/* loaded from: classes14.dex */
public final class m0 extends qz5.d implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.k f514562d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f514563e;

    /* renamed from: f, reason: collision with root package name */
    public final int f514564f;

    /* renamed from: g, reason: collision with root package name */
    public oz5.l f514565g;

    /* renamed from: h, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f514566h;

    public m0(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, oz5.l lVar) {
        super(v26.i0.f514542d, oz5.m.f431862d);
        this.f514562d = kVar;
        this.f514563e = lVar;
        this.f514564f = ((java.lang.Number) lVar.mo7093x300c01(0, v26.l0.f514558d)).intValue();
    }

    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.Object obj) {
        oz5.l mo48699x76847179 = interfaceC29045xdcb5ca57.mo48699x76847179();
        p3325xe03a0797.p3326xc267989b.v2.f(mo48699x76847179);
        oz5.l lVar = this.f514565g;
        if (lVar != mo48699x76847179) {
            if (lVar instanceof v26.c0) {
                throw new java.lang.IllegalStateException(r26.b0.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v26.c0) lVar).f514521d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((java.lang.Number) mo48699x76847179.mo7093x300c01(0, new v26.p0(this))).intValue() != this.f514564f) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f514563e + ",\n\t\tbut emission happened in " + mo48699x76847179 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f514565g = mo48699x76847179;
        }
        this.f514566h = interfaceC29045xdcb5ca57;
        java.lang.Object mo147xb9724478 = v26.o0.f514569a.mo147xb9724478(this.f514562d, obj, this);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo147xb9724478, pz5.a.f440719d)) {
            this.f514566h = null;
        }
        return mo147xb9724478;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        try {
            java.lang.Object a17 = a(interfaceC29045xdcb5ca57, obj);
            return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            this.f514565g = new v26.c0(th6, interfaceC29045xdcb5ca57.mo48699x76847179());
            throw th6;
        }
    }

    @Override // qz5.a, qz5.e
    /* renamed from: getCallerFrame */
    public qz5.e mo144028x366976c() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f514566h;
        if (interfaceC29045xdcb5ca57 instanceof qz5.e) {
            return (qz5.e) interfaceC29045xdcb5ca57;
        }
        return null;
    }

    @Override // qz5.d, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        oz5.l lVar = this.f514565g;
        return lVar == null ? oz5.m.f431862d : lVar;
    }

    @Override // qz5.a
    /* renamed from: getStackTraceElement */
    public java.lang.StackTraceElement mo161161x91a6cfe9() {
        return null;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
        if (m143898xd4a2fc34 != null) {
            this.f514565g = new v26.c0(m143898xd4a2fc34, mo48699x76847179());
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f514566h;
        if (interfaceC29045xdcb5ca57 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(obj);
        }
        return pz5.a.f440719d;
    }

    @Override // qz5.d, qz5.a
    /* renamed from: releaseIntercepted */
    public void mo161162x90ea0a5a() {
        super.mo161162x90ea0a5a();
    }
}
