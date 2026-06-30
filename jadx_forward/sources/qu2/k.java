package qu2;

/* loaded from: classes12.dex */
public final class k implements ts5.d {

    /* renamed from: a, reason: collision with root package name */
    public final ts5.a f448321a;

    /* renamed from: b, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f448322b;

    /* renamed from: c, reason: collision with root package name */
    public ts5.b f448323c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f448324d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f448325e;

    public k(ts5.a collectWhat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
        this.f448321a = collectWhat;
    }

    @Override // ts5.d
    public void a(java.util.Map map) {
        if (this.f448324d && !this.f448325e) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new qu2.j(this, null), 2, null);
        }
    }

    @Override // ts5.d
    /* renamed from: cancel */
    public void mo149995xae7a2e7a() {
        this.f448325e = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f448322b;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ts5.b bVar = this.f448323c;
        if (bVar != null) {
            ou2.c cVar = (ou2.c) bVar;
            ou2.d dVar = cVar.f430462b;
            dVar.getClass();
            ts5.p uniqueTag = cVar.f430461a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueTag, "uniqueTag");
            if (uniqueTag.f503274a.f503264d || ou2.a.a(ou2.d.f430464d)) {
                ou2.e eVar = dVar.f430465a;
                eVar.getClass();
                eVar.f430469b.remove(uniqueTag);
            }
        }
    }

    @Override // ts5.d
    /* renamed from: start */
    public void mo149996x68ac462() {
        if (this.f448324d) {
            return;
        }
        this.f448324d = true;
        this.f448322b = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new qu2.i(this, null), 2, null);
    }
}
