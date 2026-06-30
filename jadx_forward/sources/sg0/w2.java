package sg0;

@j95.b
/* loaded from: classes8.dex */
public final class w2 extends jm0.o implements tg0.r1 {

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f489384o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f489386q;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f489382m = jz5.h.b(sg0.k2.f489273d);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f489383n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f489385p = new java.util.LinkedHashMap();

    public static final java.util.Map Zi(sg0.w2 w2Var, int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, java.lang.String str3, java.util.Map map, boolean z27) {
        w2Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(i17));
        linkedHashMap.put("useFlutterSearchBar", java.lang.Boolean.valueOf(z17));
        linkedHashMap.put("searchDirectly", java.lang.Boolean.valueOf(z18));
        linkedHashMap.put("searchBarHintText", str2);
        linkedHashMap.put("searchBarText", str);
        linkedHashMap.put("searchDirectlyAddToKvHistory", java.lang.Boolean.valueOf(z19));
        linkedHashMap.put("searchParams", str3);
        if (map == null) {
            map = new java.util.LinkedHashMap();
        }
        linkedHashMap.put("searchDirectlyCgiParams", java.lang.String.valueOf(ri.l0.a(map)));
        linkedHashMap.put("isHalfScreen", java.lang.Boolean.valueOf(z27));
        return linkedHashMap;
    }

    public static final sg0.j2 aj(sg0.w2 w2Var) {
        w2Var.getClass();
        return new sg0.j2(new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2(), new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19209x126ef0a5(), new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.C19208x67b272aa(), new zc.b0());
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.m2 bj(sg0.w2 w2Var, java.lang.Long l17) {
        sg0.j2 j2Var;
        if (l17 == null) {
            l17 = w2Var.f489386q;
        } else {
            w2Var.getClass();
        }
        if (l17 != null) {
            l17.longValue();
            sg0.i2 i2Var = (sg0.i2) ((java.util.LinkedHashMap) w2Var.f489385p).get(l17);
            if (i2Var != null && (j2Var = i2Var.f489256a) != null) {
                return j2Var.f489266a;
            }
        }
        return null;
    }

    public static final java.util.List cj(sg0.w2 w2Var, sg0.j2 j2Var) {
        w2Var.getClass();
        java.util.List Ai = ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).Ai();
        java.util.List k17 = kz5.c0.k(new ev4.c(), j2Var.f489266a, j2Var.f489267b, j2Var.f489268c, j2Var.f489269d);
        k17.addAll(Ai);
        return k17;
    }

    public static final ou4.d0 fj(sg0.w2 w2Var) {
        ou4.d0 d0Var;
        java.lang.String str = w2Var.f489384o;
        if (str == null) {
            return null;
        }
        w2Var.f489384o = null;
        ou4.e0 hj6 = w2Var.hj();
        if (hj6 != null) {
            ou4.x xVar = (ou4.x) ((jz5.n) ((ou4.z) hj6).f430573d).mo141623x754a37bb();
            xVar.getClass();
            d0Var = (ou4.d0) xVar.f430570b.get(str);
        } else {
            d0Var = null;
        }
        if (d0Var == null || ((ou4.s) d0Var).f430560k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.hitest.WebSearchFlutterService", "takePreloadedContainer: preloaded container not found or destroyed");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "takePreloadedContainer: reusing containerId=".concat(str));
        return d0Var;
    }

    public final ou4.e0 hj() {
        return (ou4.e0) ((jz5.n) this.f489382m).mo141623x754a37bb();
    }

    public void ij(java.lang.String exportId, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exportId, "exportId");
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.n2(this, l17, exportId, b17, null), 3, null);
    }

    public void mj(java.lang.String totalText, java.lang.String inEditText, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(totalText, "totalText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inEditText, "inEditText");
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.p2(this, l17, totalText, inEditText, b17, null), 3, null);
    }

    public void nj(boolean z17, java.lang.Long l17) {
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new sg0.s2(this, l17, z17, b17, null), 3, null);
    }

    public final java.util.List oj(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            c75.c.d(new org.json.JSONArray(str), new sg0.t2(arrayList));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.hitest.WebSearchFlutterService", th6, "parse extReqParamsStr fail %s", str);
        }
        return arrayList;
    }

    @Override // jm0.o, i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.WebSearchFlutterService", "onCreate");
        super.mo8845x3e5a77bb(context);
        ou4.e0 hj6 = hj();
        if (hj6 != null) {
            ou4.o oVar = new ou4.o("websearch", ya.a.f77450x918d59a8, "home", null, null, false, null, 112, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerService", "registerBusiness: businessId=".concat("websearch"));
            ou4.x xVar = (ou4.x) ((jz5.n) ((ou4.z) hj6).f430573d).mo141623x754a37bb();
            xVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterContainerManager", "registerBusiness: businessId=".concat("websearch"));
            xVar.f430569a.put("websearch", oVar);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.hitest.WebSearchFlutterService", "IFlutterContainerService not available, skip registerBusiness");
        }
        try {
            i95.n0.c(tg0.l1.class);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.C27572x42eac611.m117712x9cf0d20b();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.hitest.WebSearchFlutterService", "WebSearchManager init failed", e17);
        }
    }
}
