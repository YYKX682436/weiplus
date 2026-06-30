package uv4;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f512994d;

    /* renamed from: a, reason: collision with root package name */
    public static final uv4.x f512991a = new uv4.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f512992b = kz5.z.D0(new java.lang.Integer[]{0, 10, 6});

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f512993c = jz5.h.b(uv4.r.f512983d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f512995e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f512996f = jz5.h.b(uv4.w.f512990d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f512997g = jz5.h.b(uv4.t.f512987d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f512998h = jz5.h.b(uv4.u.f512988d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f512999i = jz5.h.b(uv4.v.f512989d);

    public final void a() {
        java.lang.String str;
        try {
            java.util.List i17 = kz5.c0.i((uv4.p) ((jz5.n) f512996f).mo141623x754a37bb(), (uv4.p) ((jz5.n) f512997g).mo141623x754a37bb(), (uv4.p) ((jz5.n) f512998h).mo141623x754a37bb());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : i17) {
                if (((uv4.p) obj).v("_udr").f512968a == 1) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: all templates already initialized, skip check");
                return;
            }
            f512994d = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: " + arrayList.size() + " template(s) need initialization");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uv4.p pVar = (uv4.p) it.next();
                int i18 = pVar.f512950a;
                if (i18 == 0) {
                    str = "fts_template";
                } else if (i18 == 6) {
                    str = "tsc_template";
                } else if (i18 != 10) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateByUDR", "getResourceName: unknown templateType=" + i18);
                    str = "";
                } else {
                    str = "esc_template";
                }
                if (str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: skip template with empty resource name");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "checkUDRResourcesIfNeeded: checking resource '" + str + "' for project ilinkres_6362f858");
                    com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
                    qVar.c("ilinkres_6362f858");
                    java.util.LinkedList linkedList = qVar.f299081e;
                    if (linkedList != null) {
                        linkedList.add(str);
                    }
                    ((com.p314xaae8f345.mm.udr.a1) e0Var).Di(qVar, new uv4.s(str, e0Var, pVar));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchTemplateHolder", e17, "checkUDRResourcesIfNeeded", new java.lang.Object[0]);
        }
    }

    public final int b() {
        return ((java.lang.Number) ((jz5.n) f512993c).mo141623x754a37bb()).intValue();
    }

    public final uv4.g c(int i17, java.lang.Boolean bool) {
        if (f512992b.contains(java.lang.Integer.valueOf(i17))) {
            boolean z17 = true;
            if (b() < 1 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE)) {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchTemplateHolder", "getTemplate: type=" + i17 + ", useUdr=" + z17 + ", template=" + (z17 ? "WebSearchTemplateByUDR" : "Original"));
            if (z17) {
                if (!f512994d) {
                    synchronized (f512995e) {
                        if (!f512994d) {
                            f512991a.a();
                        }
                    }
                }
                if (i17 == 0) {
                    return (uv4.p) ((jz5.n) f512996f).mo141623x754a37bb();
                }
                if (i17 == 6) {
                    return (uv4.p) ((jz5.n) f512998h).mo141623x754a37bb();
                }
                if (i17 != 10) {
                    return null;
                }
                return (uv4.p) ((jz5.n) f512997g).mo141623x754a37bb();
            }
        }
        return (uv4.g) ((java.util.HashMap) ((jz5.n) f512999i).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
    }
}
