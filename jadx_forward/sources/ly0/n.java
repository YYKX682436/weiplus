package ly0;

/* loaded from: classes5.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public final ly0.p f403749a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f403750b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f403751c;

    /* renamed from: d, reason: collision with root package name */
    public volatile ly0.e f403752d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f403753e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ly0.d f403754f;

    /* renamed from: g, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f403755g;

    /* renamed from: h, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f403756h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f403757i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Object f403758j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.l f403759k;

    /* renamed from: l, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r0 f403760l;

    public n(ly0.p scene, java.util.List cndUrls, s26.a aVar, yz5.l rawCompletionCallback, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cndUrls, "cndUrls");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawCompletionCallback, "rawCompletionCallback");
        this.f403749a = scene;
        this.f403750b = cndUrls;
        this.f403751c = rawCompletionCallback;
        this.f403752d = ly0.e.f403724d;
        this.f403753e = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f403758j = new java.lang.Object();
        this.f403757i = new ly0.b(new java.lang.ref.WeakReference(this));
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        this.f403760l = new ly0.k(p3325xe03a0797.p3326xc267989b.q0.f392100d, this);
        this.f403759k = new ly0.c(this);
    }

    public static final void a(ly0.n nVar, java.lang.String str, ly0.d dVar, boolean z17) {
        boolean z18;
        java.util.Objects.toString(nVar.f403752d);
        if (nVar.f403752d != ly0.e.f403727g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AIGC.AIMediaGeneratePollingTask", "tryQueryResult - state is not WAITING_NEXT_QUERY, but " + nVar.f403752d);
            return;
        }
        if (dVar != null) {
            dVar.m146512x9616526c();
            int i17 = dVar.f403720a;
            if (i17 <= dVar.f403723d) {
                dVar.f403720a = i17 + 1;
                z18 = true;
            } else {
                z18 = false;
            }
            if (!z18) {
                return;
            }
        }
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) p3325xe03a0797.p3326xc267989b.l.f(null, new ly0.f(nVar, str, dVar, null), 1, null)).getValue();
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(value);
        if (m143898xd4a2fc34 != null) {
            nVar.f(m143898xd4a2fc34);
            return;
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
            value = null;
        }
        java.util.List list = (java.util.List) value;
        if (list == null || list.isEmpty()) {
            if (z17) {
                if (dVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AIGC.AIMediaGeneratePollingTask", "tryQueryResult - queryState is null");
                    return;
                } else {
                    nVar.f403755g = p3325xe03a0797.p3326xc267989b.l.d(nVar.f403753e, nVar.f403760l, null, new ly0.j(new ly0.h(dVar, nVar, null), null), 2, null);
                    return;
                }
            }
            return;
        }
        synchronized (nVar.f403758j) {
            java.util.Objects.toString(nVar.f403752d);
            nVar.d();
            yz5.l lVar = nVar.f403759k;
            if (lVar == null) {
                return;
            }
            nVar.f403752d = ly0.e.f403730m;
            nVar.b();
            ((ly0.c) lVar).mo146xb9724478(new ly0.x(str, list));
            nVar.f403759k = null;
        }
    }

    public final void b() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f403755g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f403755g = null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public abstract void c();

    public final void d() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f403756h;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f403756h = null;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public abstract java.lang.Object e(java.lang.String str, ly0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public final void f(java.lang.Throwable normalException) {
        ky0.e eVar;
        ky0.e eVar2;
        synchronized (this.f403758j) {
            java.util.Objects.toString(this.f403752d);
            java.util.Objects.toString(normalException);
            d();
            yz5.l lVar = this.f403759k;
            if (lVar == null) {
                return;
            }
            b();
            this.f403752d = ly0.e.f403729i;
            b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(normalException, "normalException");
            if (normalException instanceof ky0.e) {
                eVar2 = (ky0.e) normalException;
            } else {
                if (normalException instanceof java.util.concurrent.CancellationException) {
                    java.lang.String message = normalException.getMessage();
                    if (message == null) {
                        message = "Cancel";
                    }
                    eVar = new ky0.e(-6, message);
                } else {
                    java.lang.String message2 = normalException.getMessage();
                    if (message2 == null) {
                        message2 = "Unknown error";
                    }
                    eVar = new ky0.e(-1000, message2);
                }
                eVar2 = eVar;
            }
            lVar.mo146xb9724478(new ly0.w(eVar2));
            this.f403759k = null;
        }
    }

    public abstract java.lang.Object g(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
