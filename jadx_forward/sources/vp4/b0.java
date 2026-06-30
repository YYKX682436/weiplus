package vp4;

/* loaded from: classes10.dex */
public final class b0 extends m55.b {

    /* renamed from: b, reason: collision with root package name */
    public final st3.r f520535b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0.b f520536c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f520537d;

    /* renamed from: e, reason: collision with root package name */
    public rp4.a f520538e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f520539f;

    /* renamed from: g, reason: collision with root package name */
    public final ru3.f f520540g;

    /* renamed from: h, reason: collision with root package name */
    public final rp4.x f520541h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.s f520542i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.p f520543j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f520544k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n f520545l;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.q f520546m;

    public b0(st3.r encode, ct0.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, rp4.a aVar, android.content.Context context, ru3.f fVar, rp4.x xVar, st3.s editConfig, yz5.p pVar, java.lang.String taskId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encode, "encode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editConfig, "editConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f520535b = encode;
        this.f520536c = bVar;
        this.f520537d = c16993xacc19624;
        this.f520538e = aVar;
        this.f520539f = context;
        this.f520540g = fVar;
        this.f520541h = xVar;
        this.f520542i = editConfig;
        this.f520543j = pVar;
        this.f520544k = taskId;
    }

    @Override // m55.b
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = this.f520545l;
        sb6.append(nVar != null ? nVar.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoForegroundRemuxChain", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar2 = this.f520545l;
        if (nVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.b(nVar2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f520546m;
        if (qVar != null) {
            p3325xe03a0797.p3326xc267989b.p.a(qVar, null, 1, null);
        }
        return true;
    }

    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new vp4.a0(this, dVar, null), interfaceC29045xdcb5ca57);
    }
}
