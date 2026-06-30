package q81;

/* loaded from: classes7.dex */
public final class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a, wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final t81.c f442234d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442235e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f442236f;

    public d0(t81.c cmd) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmd, "cmd");
        this.f442234d = cmd;
        this.f442235e = "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.RunCmdTask";
    }

    public final yz5.a a() {
        yz5.a aVar = this.f442236f;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notifyQueueCallback");
        throw null;
    }

    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        new p81.j(this.f442234d, new q81.c0(rVar)).c();
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f442235e;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try record ");
        t81.c cVar = this.f442234d;
        sb6.append(cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f442235e, sb6.toString());
        q81.e0.f442238h.add(cVar.f67698x28d45f97);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new q81.b0(this, cVar, null), 2, null);
    }
}
