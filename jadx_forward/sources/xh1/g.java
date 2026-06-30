package xh1;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 {

    /* renamed from: m, reason: collision with root package name */
    public static final xh1.a f536040m = new xh1.a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.Map f536041n = kz5.c1.k(new jz5.l("/cgi-bin/mmbiz-bin/js-authorize", 1157), new jz5.l("/cgi-bin/mmbiz-bin/js-authorize-confirm", java.lang.Integer.valueOf(me1.a.f72878x366c91de)), new jz5.l("/cgi-bin/mmbiz-bin/js-operatewxdata", 1133));

    /* renamed from: d, reason: collision with root package name */
    public final ze.n f536042d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f536043e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f536044f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f536045g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f536046h;

    /* renamed from: i, reason: collision with root package name */
    public final xh1.f f536047i;

    public g(ze.n runtime, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 originCgiService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originCgiService, "originCgiService");
        this.f536042d = runtime;
        this.f536043e = "Luggage.CgiServiceImplByLibServer(" + hashCode() + ')';
        this.f536044f = jz5.h.b(new xh1.c(this));
        this.f536045g = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f536046h = new java.util.concurrent.ConcurrentHashMap();
        this.f536047i = new xh1.f(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object a(xh1.g gVar, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, java.lang.Class cls, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int andIncrement = gVar.f536045g.getAndIncrement();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f536043e, "sendToLibServer cgiUrl:" + str + " requestId:" + andIncrement);
        if (fVar instanceof r45.my3) {
            r45.my3 my3Var = (r45.my3) fVar;
            if (my3Var.mo11508xa452ad48() == null) {
                my3Var.mo11509x3ab820bc((r45.he) ((jz5.n) gVar.f536044f).mo141623x754a37bb());
            }
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        gVar.f536046h.put(new java.lang.Integer(andIncrement), new xh1.b(rVar, cls));
        try {
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0 = gVar.f536042d.C0();
            if (C0 != null) {
                qe.n nVar = qe.o.f443513i;
                java.lang.Object obj = f536041n.get(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                nVar.a(C0, andIncrement, ((java.lang.Number) obj).intValue(), fVar);
            }
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p e17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17)));
        }
        xh1.f fVar2 = gVar.f536047i;
        fVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(java.lang.Integer.valueOf(andIncrement), "null cannot be cast to non-null type kotlin.Any");
        fVar2.mo50311x7ab51103(fVar2.mo50292x733c63a2(fVar2.f536038b, java.lang.Integer.valueOf(andIncrement)), fVar2.f536037a);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final void b(int i17) {
        p3325xe03a0797.p3326xc267989b.q qVar;
        xh1.b bVar = (xh1.b) this.f536046h.remove(java.lang.Integer.valueOf(i17));
        java.lang.String str = this.f536043e;
        if (bVar == null || (qVar = bVar.f536022a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "callbackUnsupported missing continuation for requestId:" + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "callback 'Unsupported cgi' for requestId:" + i17);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.TRANSFER, -1, "Unsupported cgi", null))));
        }
    }

    public final void c() {
        this.f536047i.mo50302x6b17ad39(null);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f536046h;
        java.util.Collection<xh1.b> values = concurrentHashMap.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        for (xh1.b bVar : values) {
            if (((p3325xe03a0797.p3326xc267989b.r) bVar.f536022a).n()) {
                p3325xe03a0797.p3326xc267989b.p.a(bVar.f536022a, null, 1, null);
            }
        }
        concurrentHashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0
    public km5.d e1(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, java.lang.Class cls) {
        if (!f536041n.keySet().contains(str == null ? "" : str) || fVar == null || cls == null) {
            km5.q qVar = new km5.q();
            qVar.x(null);
            return qVar;
        }
        km5.d n17 = ((km5.q) km5.u.d()).n(new xh1.e(this, str, fVar, cls, str2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "next(...)");
        return n17;
    }
}
