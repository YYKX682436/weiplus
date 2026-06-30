package ju5;

/* loaded from: classes15.dex */
public class z extends ju5.f implements ju5.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f383701c;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383703e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f383704f;

    /* renamed from: g, reason: collision with root package name */
    public gu5.c f383705g;

    /* renamed from: h, reason: collision with root package name */
    public final gu5.d f383706h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383702d = null;

    /* renamed from: i, reason: collision with root package name */
    public zt5.s f383707i = null;

    /* renamed from: j, reason: collision with root package name */
    public ju5.y f383708j = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f383709k = false;

    public z(ju5.c cVar) {
        this.f383701c = -1;
        this.f383703e = null;
        this.f383704f = null;
        this.f383705g = null;
        this.f383706h = null;
        if (cVar == null) {
            throw new java.lang.IllegalArgumentException("param is null!");
        }
        this.f383701c = cVar.f383599a;
        this.f383704f = new java.lang.ref.WeakReference(cVar.f383601c);
        this.f383706h = cVar.f383609k;
        this.f383705g = cVar.f383608j;
        this.f383703e = cVar.f383600b;
    }

    public static void h(ju5.z zVar, java.security.Signature signature) {
        zVar.getClass();
        try {
            zVar.f383707i = wt5.a.a(signature.sign());
            zt5.h.c("Soter.TaskAuthentication", "soter: no upload wrapper, return directly", new java.lang.Object[0]);
            zVar.b(new eu5.a(0, zVar.f383707i));
        } catch (java.security.SignatureException e17) {
            zt5.h.b("Soter.TaskAuthentication", "soter: sign failed due to exception: %s", e17.getMessage());
            zt5.h.d("Soter.TaskAuthentication", e17, "soter: sign failed due to exception");
            zt5.i.b(200, "TaskAuthentication, sign fail: executeWhenAuthenticated().", e17);
            zVar.b(new eu5.a(1018, "sign failed even after user authenticated the key."));
        }
    }

    @Override // ju5.a
    public void a() {
        zt5.h.c("Soter.TaskAuthentication", "soter: called from cancellation signal", new java.lang.Object[0]);
        ju5.y yVar = this.f383708j;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // ju5.f
    public void c() {
        com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25623x18006e2e i17;
        if (zt5.l.b(this.f383703e)) {
            zt5.h.c("Soter.TaskAuthentication", "soter: not provide the challenge. we will do the job", new java.lang.Object[0]);
            throw null;
        }
        zt5.h.c("Soter.TaskAuthentication", "soter: already provided the challenge. directly authenticate", new java.lang.Object[0]);
        if (wt5.a.g() != 1) {
            java.security.Signature d17 = wt5.a.d(this.f383702d);
            if (d17 == null) {
                zt5.h.f("Soter.TaskAuthentication", "soter: error occurred when init sign", new java.lang.Object[0]);
                b(new eu5.a(1007));
                return;
            } else {
                this.f383708j = new ju5.y(this, d17, null);
                i(d17);
                ju5.o.a().b(new ju5.r(this));
                return;
            }
        }
        java.lang.String str = this.f383702d;
        java.lang.String str2 = this.f383703e;
        au5.b bVar = wt5.a.f531070c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: initSigh IMPL is null, not support soter", new java.lang.Object[0]);
            i17 = null;
        } else {
            i17 = bVar.i(str, str2);
        }
        if (i17 == null) {
            zt5.h.f("Soter.TaskAuthentication", "soter: error occurred when init sign soterSessionResult is null", new java.lang.Object[0]);
            b(new eu5.a(1007));
            return;
        }
        if (i17.f296863e != 0) {
            zt5.h.f("Soter.TaskAuthentication", "soter: error occurred when init sign resultCode error", new java.lang.Object[0]);
            b(new eu5.a(1007));
            return;
        }
        long j17 = i17.f296862d;
        zt5.h.a("Soter.TaskAuthentication", "soter: session is %d", java.lang.Long.valueOf(j17));
        ju5.y yVar = new ju5.y(this, null, null);
        this.f383708j = yVar;
        yVar.f383699b = j17;
        i(null);
        ju5.o.a().b(new ju5.q(this));
    }

    @Override // ju5.f
    public boolean d() {
        return true;
    }

    @Override // ju5.f
    public void e(eu5.e eVar) {
        int i17 = eVar.f557138a;
        if ((i17 == 1018 || i17 == 1007 || i17 == 1015) && fu5.c.a(ju5.z.class, eVar)) {
            zt5.h.c("Soter.TaskAuthentication", "soter: same error happen too much, delete ask", new java.lang.Object[0]);
            cu5.b.a();
        }
    }

    @Override // ju5.f
    public void f() {
        gu5.c cVar = this.f383705g;
        if (cVar != null) {
            zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
            if (cVar.f357494a.isCanceled()) {
                zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
                return;
            }
            ju5.o.a().c(new gu5.a(cVar));
            ju5.o a17 = ju5.o.a();
            a17.f383669b.postDelayed(new gu5.b(cVar), 350L);
        }
    }

    @Override // ju5.f
    public boolean g() {
        if (!fu5.d.b().d()) {
            zt5.h.f("Soter.TaskAuthentication", "soter: not initialized yet", new java.lang.Object[0]);
            b(new eu5.a(1008));
            return true;
        }
        if (!fu5.d.b().e()) {
            zt5.h.f("Soter.TaskAuthentication", "soter: not support soter", new java.lang.Object[0]);
            b(new eu5.a(2));
            return true;
        }
        android.util.SparseArray a17 = fu5.d.b().a();
        int i17 = this.f383701c;
        java.lang.String str = (java.lang.String) a17.get(i17, "");
        this.f383702d = str;
        if (zt5.l.b(str)) {
            zt5.h.f("Soter.TaskAuthentication", "soter: request prepare auth key scene: %d, but key name is not registered. Please make sure you register the scene in init", new java.lang.Object[0]);
            b(new eu5.a(1009, java.lang.String.format("auth scene %d not initialized in map", java.lang.Integer.valueOf(i17))));
            return true;
        }
        if (!wt5.a.i(this.f383702d)) {
            zt5.h.f("Soter.TaskAuthentication", "soter: auth key %s not exists. need re-generate", this.f383702d);
            b(new eu5.a(1006, java.lang.String.format("the auth key to scene %d not exists. it may because you haven't prepare it, or user removed them already in system settings. please prepare the key again", java.lang.Integer.valueOf(i17))));
            return true;
        }
        if (zt5.l.b(this.f383703e)) {
            zt5.h.f("Soter.TaskAuthentication", "soter: challenge wrapper is null!", new java.lang.Object[0]);
            b(new eu5.a(1010, "neither get challenge wrapper nor challenge str is found in request parameter"));
            return true;
        }
        android.content.Context context = (android.content.Context) this.f383704f.get();
        if (context == null) {
            zt5.h.f("Soter.TaskAuthentication", "soter: context instance released in preExecute", new java.lang.Object[0]);
            b(new eu5.a(1011));
            return true;
        }
        if (!xt5.h.f538700a.b(context)) {
            zt5.h.f("Soter.TaskAuthentication", "soter: user has not enrolled any fingerprint in system.", new java.lang.Object[0]);
            b(new eu5.a(1012));
            return true;
        }
        if ((com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, 1).m95995x80ed5ecf() || com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8.C25615x7788b3d7.m95989x3017aa(context, 1).m95996xba1c2120(context)) ? false : true) {
            zt5.h.f("Soter.TaskAuthentication", "soter: fingerprint sensor frozen", new java.lang.Object[0]);
            b(new eu5.a(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf, "Too many failed times"));
            return true;
        }
        if (this.f383705g != null) {
            zt5.h.f("Soter.TaskAuthentication", "hy: we strongly recommend you to check the final authentication data in server! Please make sure you upload and check later", new java.lang.Object[0]);
            return false;
        }
        zt5.h.f("Soter.TaskAuthentication", "soter: did not pass cancellation obj. We suggest you pass one", new java.lang.Object[0]);
        this.f383705g = new gu5.c();
        return false;
    }

    public final void i(java.security.Signature signature) {
        if (this.f383622b) {
            zt5.h.f("Soter.TaskAuthentication", "soter: already finished. can not authenticate", new java.lang.Object[0]);
            return;
        }
        android.content.Context context = (android.content.Context) this.f383704f.get();
        if (context == null) {
            zt5.h.f("Soter.TaskAuthentication", "soter: context instance released in startAuthenticate", new java.lang.Object[0]);
            b(new eu5.a(1011));
            return;
        }
        try {
            zt5.h.e("Soter.TaskAuthentication", "soter: performing start", new java.lang.Object[0]);
            xt5.e eVar = new xt5.e(signature);
            gu5.c cVar = this.f383705g;
            android.os.CancellationSignal cancellationSignal = cVar != null ? cVar.f357494a : null;
            xt5.h.f538700a.a(context, eVar, 0, cancellationSignal, this.f383708j, null);
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            zt5.h.b("Soter.TaskAuthentication", "soter: caused exception when authenticating: %s", message);
            zt5.h.d("Soter.TaskAuthentication", e17, "soter: caused exception when authenticating");
            zt5.i.b(200, "TaskAuthentication, start authentication fail: performStartFingerprintLogic().", e17);
            b(new eu5.a(1015, java.lang.String.format("start authentication failed due to %s", message)));
        }
    }

    @Override // ju5.a
    /* renamed from: isCancelled */
    public boolean mo141429x62a56b47() {
        return this.f383709k;
    }
}
