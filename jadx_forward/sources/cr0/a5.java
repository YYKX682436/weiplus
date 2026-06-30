package cr0;

@j95.b
/* loaded from: classes12.dex */
public final class a5 extends i95.w implements com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.a, java.lang.Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f303119e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f303120f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f303121g = jz5.h.a(jz5.i.f384362d, cr0.w4.f303337d);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c f303122d;

    public void Ai() {
        if (f303119e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "Enable pthread hook");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<cmd><diagnostic><PthreadHook\n enable='1' process='");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "mm" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j() ? "appbrand" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() ? "tools" : com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18);
        sb6.append("' duration='1' hook='.*\\.so$' thread='.*'/></diagnostic></cmd>");
        tp3.a.INSTANCE.d(sb6.toString());
        f303119e = true;
    }

    public jz5.l Bi(int i17) {
        java.lang.String java;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.PthreadMsg Ni = Ni(i17);
        if (Ni == null || (java = Ni.getJava()) == null) {
            return null;
        }
        q26.h hVar = new q26.h((q26.i) q26.h0.i(kz5.n0.J(r26.n0.f0(java, new java.lang.String[]{";"}, false, 0, 6, null)), cr0.x4.f303341d));
        if (hVar.hasNext()) {
            return pj.e.f436436a.b((java.lang.String) hVar.next());
        }
        return null;
    }

    public jz5.l Di(int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.PthreadMsg Ni = Ni(i17);
        if (Ni == null || (str = Ni.getNative()) == null) {
            return null;
        }
        q26.h hVar = new q26.h((q26.i) q26.h0.i(kz5.n0.J(r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null)), cr0.y4.f303346d));
        if (!hVar.hasNext()) {
            return null;
        }
        java.lang.String stackLine = (java.lang.String) hVar.next();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stackLine, "stackLine");
        java.lang.String obj = r26.n0.u0(stackLine).toString();
        if (!r26.i0.A(obj, "#pc ", false, 2, null)) {
            return null;
        }
        if (!r26.i0.n(obj, ".so)", false) && !r26.n0.B(obj, ".so", false)) {
            return null;
        }
        java.lang.String substring = obj.substring(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        int L = r26.n0.L(substring, " ", 0, false, 6, null);
        if (L <= 0) {
            return null;
        }
        java.lang.String substring2 = substring.substring(0, L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        int L2 = r26.n0.L(substring, ".so", 0, false, 6, null);
        int i19 = L + 1;
        if (L2 <= i19) {
            return null;
        }
        java.lang.String substring3 = substring.substring(i19, L2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
        int P = r26.n0.P(substring3, "/lib", 0, false, 6, null);
        if (P <= 0 || (i18 = P + 4) >= substring3.length()) {
            return null;
        }
        java.lang.String substring4 = substring3.substring(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
        return new jz5.l(substring4, substring2);
    }

    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.PthreadMsg Ni(int i17) {
        java.lang.Object obj;
        boolean z17;
        java.util.Iterator it = Ri().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            java.util.List<com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.ThreadMsg> m45143xee0def73 = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.PthreadMsg) obj).m45143xee0def73();
            boolean z18 = false;
            if (m45143xee0def73 != null) {
                if (!m45143xee0def73.isEmpty()) {
                    java.util.Iterator<T> it6 = m45143xee0def73.iterator();
                    while (it6.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.ThreadMsg) it6.next()).getTid(), java.lang.String.valueOf(i17))) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    z18 = true;
                }
            }
            if (z18) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.PthreadMsg) obj;
    }

    public java.util.List Ri() {
        java.util.List F0;
        synchronized (this) {
            java.util.List[] listArr = new java.util.List[2];
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c c10653x4342648c = this.f303122d;
            listArr[0] = c10653x4342648c != null ? c10653x4342648c.m45135x3455543a() : null;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c c10653x4342648c2 = this.f303122d;
            listArr[1] = c10653x4342648c2 != null ? c10653x4342648c2.m45136xd1f3abfa() : null;
            java.util.List<java.lang.Iterable> i17 = kz5.c0.i(listArr);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Iterable iterable : i17) {
                if (iterable == null) {
                    iterable = kz5.p0.f395529d;
                }
                kz5.h0.u(arrayList, iterable);
            }
            F0 = kz5.n0.F0(arrayList, new cr0.z4());
        }
        return F0;
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "clear");
            this.f303122d = null;
            f303120f = false;
        }
    }

    public com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c wi() {
        java.lang.String v17;
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c c10653x4342648c;
        synchronized (this) {
            if (!f303119e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, unable");
                return this.f303122d;
            }
            if (this.f303122d != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, caching");
                return this.f303122d;
            }
            wp3.b bVar = (wp3.b) tp3.a.INSTANCE.a(wp3.b.class);
            if (bVar != null && (v17 = bVar.v()) != null) {
                if (com.p314xaae8f345.mm.vfs.w6.j(v17)) {
                    java.lang.String e17 = sp3.d.e(v17);
                    if (e17 != null) {
                        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.f28913x233c02ec.getClass();
                        try {
                            c10653x4342648c = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c) new com.p176xb6135e39.p280x308fcb.i().b(e17, com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.C10653x4342648c.class);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PthreadHookMsg", e18, "parse json failed", new java.lang.Object[0]);
                            c10653x4342648c = null;
                        }
                        if (c10653x4342648c != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, json updated");
                            this.f303122d = c10653x4342648c;
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ThreadProfilerFeatureService", "dumpPthreadHookMsg, json not found");
                }
            }
            return this.f303122d;
        }
    }
}
