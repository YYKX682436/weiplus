package x65;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f533895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f533896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f533897f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f533898g;

    /* renamed from: h, reason: collision with root package name */
    public int f533899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x65.l f533900i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w65.m f533901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f533902n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(x65.l lVar, w65.m mVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f533900i = lVar;
        this.f533901m = mVar;
        this.f533902n = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new x65.h(this.f533900i, this.f533901m, this.f533902n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((x65.h) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        w65.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        x65.l lVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f533899h;
        x65.l lVar2 = this.f533900i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar = lVar2.f533908e;
            this.f533895d = dVar;
            this.f533896e = lVar2;
            mVar = this.f533901m;
            this.f533897f = mVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f533902n;
            this.f533898g = h0Var2;
            this.f533899h = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            lVar = lVar2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f533898g;
            mVar = (w65.m) this.f533897f;
            lVar = (x65.l) this.f533896e;
            java.lang.Object obj4 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f533895d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            obj2 = obj4;
        }
        try {
            y65.c f17 = lVar.f();
            java.lang.String id6 = mVar.id();
            f17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
            java.util.Iterator it = f17.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((w65.m) obj3).id(), id6)) {
                    break;
                }
            }
            boolean z17 = obj3 != null;
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (z17) {
                ((w65.g) mVar).k();
                h0Var.f391656d = lVar.f().b(mVar.id());
                return f0Var;
            }
            ((w65.g) mVar).f524890f = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
            h0Var.f391656d = mVar;
            y65.c g17 = lVar.g();
            g17.getClass();
            g17.a().add(mVar);
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar2.e(), "waitRunQueue:" + lVar2.g().a().size() + " runningQueue:" + lVar2.f().a().size());
            return f0Var;
        } finally {
            ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) obj2).d(null);
        }
    }
}
