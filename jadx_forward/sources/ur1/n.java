package ur1;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ur1.n f511894a = new ur1.n();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f511895b = jz5.h.b(ur1.m.f511893d);

    public final boolean a() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        r45.sl b17 = b();
        if (b17.f467356g == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterStrategy", "canShowBizCreatorCenter = true");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.is_originator_open = " + b17.f467356g);
        return false;
    }

    public final r45.sl b() {
        byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f511895b).mo141623x754a37bb()).j("personal_center_main_table");
        r45.sl slVar = new r45.sl();
        if (j17 != null) {
            try {
                slVar.mo11468x92b714fd(j17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPersonalCenterStrategy", "parseFrom failed", e17);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6341xce5fa2a3 c6341xce5fa2a3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6341xce5fa2a3();
                c6341xce5fa2a3.f136927d = 2L;
                c6341xce5fa2a3.f136928e = c6341xce5fa2a3.b(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", true);
            }
        }
        return slVar;
    }

    public final com.p314xaae8f345.p2845xc516c4b6.biz.C23182x6874c685 c() {
        java.util.ArrayList arrayList;
        java.util.LinkedList<r45.sm> linkedList = b().f467358i;
        java.util.List list = null;
        if (linkedList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.sm smVar : linkedList) {
                java.lang.String str = smVar.f467373d;
                java.util.LinkedList linkedList2 = smVar.f467374e;
                if (linkedList2 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Long.valueOf(((java.lang.Integer) it.next()).intValue()));
                    }
                } else {
                    arrayList = null;
                }
                arrayList2.add(new com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a(str, arrayList, java.lang.Boolean.valueOf(smVar.f467375f)));
            }
            list = kz5.n0.S0(arrayList2);
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23182x6874c685 c23182x6874c685 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23182x6874c685(java.lang.Long.valueOf(r0.f467357h), list);
        java.util.List<com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a> m85160xe12f4d9d = c23182x6874c685.m85160xe12f4d9d();
        if (!(m85160xe12f4d9d == null || m85160xe12f4d9d.isEmpty())) {
            return c23182x6874c685;
        }
        com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a c23309xdefee23a = new com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.pak), kz5.c0.i(4L, 5L, 6L, 22L, 33L, 26L, 39L), java.lang.Boolean.TRUE);
        java.lang.String g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.pal);
        java.util.List i17 = kz5.c0.i(7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 17L, 18L, 19L, 23L, 24L, 25L, 28L, 29L, 30L, 31L, 32L, 34L, 35L, 36L, 37L, 38L);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new com.p314xaae8f345.p2845xc516c4b6.biz.C23182x6874c685(1L, kz5.c0.i(c23309xdefee23a, new com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a(g17, i17, bool), new com.p314xaae8f345.p2845xc516c4b6.biz.C23309xdefee23a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.pao), kz5.c0.i(1L, 3L, 27L, 40L), bool)));
    }
}
