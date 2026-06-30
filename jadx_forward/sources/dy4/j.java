package dy4;

/* loaded from: classes15.dex */
public final class j extends eg.a implements tf.w, tf.q, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p2926x359365.C25485x5a0a6891 f326201h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f326202i;

    /* renamed from: n, reason: collision with root package name */
    public sf.f f326204n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f326205o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f326206p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f326207q;

    /* renamed from: s, reason: collision with root package name */
    public sf.e f326209s;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f326200g = jz5.h.b(dy4.g.f326176d);

    /* renamed from: m, reason: collision with root package name */
    public final tf.q f326203m = new tf.l0();

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f326208r = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    public j() {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = new com.p314xaae8f345.p2926x359365.C25485x5a0a6891(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f326201h = c25485x5a0a6891;
        c25485x5a0a6891.mo94523xbdb2cd8a(new dy4.e(this));
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68912 = this.f326201h;
        if (c25485x5a0a68912 != null) {
            c25485x5a0a68912.m94520x81e7097e(new dy4.f());
        }
    }

    @Override // eg.b
    public boolean b(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeContext, "invokeContext");
        java.lang.String l17 = invokeContext.l();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r(), "handleJsApi, jsapiName is null or empty");
            return null;
        }
        org.json.JSONObject c17 = invokeContext.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "handler(%s) handleJsApi(%s), data:%s", q(), l17, c17.toString());
        java.lang.String optString = c17.optString("action", "");
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1100634679:
                    if (optString.equals("insertSameLayerVideo")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "inserting");
                        if (this.f326209s == null) {
                            dy4.i iVar = new dy4.i(this);
                            this.f326209s = iVar;
                            invokeContext.e(iVar);
                        }
                        this.f326204n = invokeContext;
                        s(invokeContext);
                        break;
                    }
                    break;
                case -952717996:
                    if (optString.equals("operateSameLayerVideo")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "operating");
                        org.json.JSONObject c18 = invokeContext.c();
                        java.lang.String optString2 = c18.optString("type");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                        java.util.Locale locale = java.util.Locale.ROOT;
                        java.lang.String lowerCase = optString2.toLowerCase(locale);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                        boolean z17 = true;
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                            java.lang.String lowerCase2 = optString2.toLowerCase(locale);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase2, "toLowerCase(...)");
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase2, "stop")) {
                                java.lang.String lowerCase3 = optString2.toLowerCase(locale);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase3, "toLowerCase(...)");
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase3, "pause")) {
                                    java.lang.String lowerCase4 = optString2.toLowerCase(locale);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase4, "toLowerCase(...)");
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase4, "resume")) {
                                        java.lang.String lowerCase5 = optString2.toLowerCase(locale);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase5, "toLowerCase(...)");
                                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase5, "mute")) {
                                            java.lang.String r17 = r();
                                            java.lang.String lowerCase6 = optString2.toLowerCase(locale);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase6, "toLowerCase(...)");
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r17, "unknown operate type: %s", lowerCase6);
                                            invokeContext.g("fail");
                                            break;
                                        } else {
                                            boolean optBoolean = c18.optBoolean("muted", true);
                                            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f326201h;
                                            if (c25485x5a0a6891 != null) {
                                                c25485x5a0a6891.m94522x764d819b(optBoolean);
                                            }
                                            invokeContext.g("ok");
                                            break;
                                        }
                                    } else {
                                        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68912 = this.f326201h;
                                        if (c25485x5a0a68912 != null) {
                                            c25485x5a0a68912.mo94517xc84dc82d();
                                        }
                                        invokeContext.g("ok");
                                        break;
                                    }
                                } else {
                                    com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68913 = this.f326201h;
                                    if (c25485x5a0a68913 != null) {
                                        c25485x5a0a68913.mo94516x65825f6();
                                    }
                                    invokeContext.g("ok");
                                    break;
                                }
                            } else {
                                com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68914 = this.f326201h;
                                if (c25485x5a0a68914 != null) {
                                    c25485x5a0a68914.mo94537x66343656(false);
                                }
                                invokeContext.g("ok");
                                break;
                            }
                        } else {
                            java.lang.String str = this.f326207q;
                            if (!(str == null || str.length() == 0)) {
                                com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a68915 = this.f326201h;
                                if (c25485x5a0a68915 != null) {
                                    c25485x5a0a68915.mo94535x5c1200c2(this.f326207q, 1);
                                    break;
                                }
                            } else {
                                java.lang.String str2 = this.f326205o;
                                if (!(str2 == null || str2.length() == 0)) {
                                    java.lang.String str3 = this.f326206p;
                                    if (str3 != null && str3.length() != 0) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Qj(this.f326206p, this.f326205o, 0, new dy4.h(this, invokeContext));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case -312131623:
                    if (optString.equals("updateSameLayerVideo")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "updating");
                        s(invokeContext);
                        break;
                    }
                    break;
                case 1975278676:
                    if (optString.equals("removeSameLayerVideo")) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "removing");
                        t();
                        invokeContext.g("ok");
                        break;
                    }
                    break;
            }
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r(), "handler(%s), unknown action: %s", q(), c17.optString("action", ""));
        return null;
    }

    @Override // tf.w
    public java.lang.String g() {
        return this.f334031e + '_' + this.f334030d;
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f326208r;
    }

    @Override // tf.q
    /* renamed from: getName */
    public java.lang.String mo10361xfb82e301() {
        java.lang.String q17 = q();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "key(...)");
        return q17;
    }

    @Override // tf.q
    public tf.r h(java.lang.Class addOnClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addOnClass, "addOnClass");
        return ((tf.l0) this.f326203m).h(addOnClass);
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f326202i = surface;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "handler(%s) handlePluginReady", q());
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f326201h;
        if (c25485x5a0a6891 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r(), "handlePluginReady, setSurface");
            c25485x5a0a6891.m94527x42c875eb(this.f326202i);
        }
    }

    @Override // tf.w
    public void m() {
    }

    @Override // tf.w
    public boolean o() {
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        i(new android.view.Surface(surfaceTexture));
    }

    public final java.lang.String r() {
        return (java.lang.String) ((jz5.n) this.f326200g).mo141623x754a37bb();
    }

    public final void s(sf.f fVar) {
        com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946 = new com.p314xaae8f345.p2926x359365.C25484xcc963946();
        org.json.JSONObject c17 = fVar.c();
        this.f326206p = c17.optString("exportId", "");
        this.f326205o = c17.optString("nonceId", "");
        this.f326207q = c17.optString("url", "");
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f326201h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.m94521x78bda44(c25484xcc963946);
        }
        fVar.g("ok");
    }

    public final void t() {
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = this.f326201h;
        if (c25485x5a0a6891 != null) {
            c25485x5a0a6891.mo94537x66343656(true);
        }
        this.f326201h = null;
        android.view.Surface surface = this.f326202i;
        if (surface != null) {
            surface.release();
        }
        this.f326202i = null;
        sf.f fVar = this.f326204n;
        if (fVar != null) {
            if (fVar != null) {
                fVar.i(this.f326209s);
            }
            this.f326209s = null;
        }
        this.f326204n = null;
    }
}
