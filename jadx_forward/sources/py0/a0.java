package py0;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final py0.a0 f440499a = new py0.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f440500b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MaasAutoFallbackOutputSizeConfig");

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f440501c = jz5.h.b(py0.z.f440570d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f440502d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f440503e;

    static {
        rg.c cVar = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar = new jz5.l(0, 144);
        rg.c cVar2 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar2 = new jz5.l(1, 224);
        rg.c cVar3 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar3 = new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3));
        rg.c cVar4 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar4 = new jz5.l(3, 480);
        rg.c cVar5 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar5 = new jz5.l(4, java.lang.Integer.valueOf(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c));
        rg.c cVar6 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar6 = new jz5.l(5, java.lang.Integer.valueOf(com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf));
        rg.c cVar7 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar7 = new jz5.l(6, 1080);
        rg.c cVar8 = rg.c.DIMENSION_LEVEL_360;
        jz5.l lVar8 = new jz5.l(7, 1440);
        rg.c cVar9 = rg.c.DIMENSION_LEVEL_360;
        java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, new jz5.l(8, 2160));
        f440502d = k17;
        java.util.Set<java.util.Map.Entry> entrySet = k17.entrySet();
        int d17 = kz5.b1.d(kz5.d0.q(entrySet, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.util.Map.Entry entry : entrySet) {
            linkedHashMap.put(java.lang.Integer.valueOf(((java.lang.Number) entry.getValue()).intValue()), java.lang.Integer.valueOf(((java.lang.Number) entry.getKey()).intValue()));
        }
        f440503e = linkedHashMap;
        kz5.n0.S0(f440502d.values());
    }

    public final int a(rg.c cVar) {
        java.lang.Integer num;
        java.util.Map map = f440502d;
        if (!map.containsKey(java.lang.Integer.valueOf(cVar.f476682d)) || (num = (java.lang.Integer) map.get(java.lang.Integer.valueOf(cVar.f476682d))) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final void b(rg.c dimension) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dimension, "dimension");
        if (((java.lang.Boolean) ((jz5.n) f440501c).mo141623x754a37bb()).booleanValue()) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_maas_autofallback_dimension_threshold, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf);
            int a17 = a(dimension);
            if (a17 >= Ni) {
                rg.c cVar = rg.c.DIMENSION_LEVEL_360;
                int i17 = dimension.f476682d;
                int a18 = a(i17 == 7 ? rg.c.DIMENSION_LEVEL_1080 : i17 == 6 ? rg.c.DIMENSION_LEVEL_720 : rg.c.DIMENSION_LEVEL_540);
                f440500b.A("KeyMassAutoFallbackOutputSize", a18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasExportAutoFallback", "markExportFailed fallbackDimensionThreshold:" + Ni + ", size:" + a17 + ", fallbackSize:" + a18);
            }
        }
    }
}
