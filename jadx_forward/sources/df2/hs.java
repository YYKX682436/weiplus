package df2;

/* loaded from: classes10.dex */
public final class hs implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311883d;

    public hs(df2.lt ltVar) {
        this.f311883d = ltVar;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22800xb2c6317b c22800xb2c6317b;
        java.lang.String m77166xb5887639;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        df2.lt ltVar = this.f311883d;
        int i18 = ltVar.f312245t;
        java.util.ArrayList arrayList = ltVar.f312250y;
        if (i18 != -1) {
            ltVar.f312245t = i17;
            java.lang.String str2 = df2.lt.W;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "hand change index: " + ltVar.f312245t);
            if (arrayList.size() > 0) {
                ltVar.f312243r = (in5.c) arrayList.get(ltVar.f312245t % arrayList.size());
            }
        }
        in5.c cVar = ltVar.f312243r;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        java.lang.String str3 = df2.lt.W;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pagechange title :");
        sb6.append((hVar == null || (c19786x6a1e28622 = hVar.f315074d) == null) ? null : c19786x6a1e28622.m76523x98b23862());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb6.toString());
        r45.bm1 bm1Var = hVar != null ? hVar.f315078h : null;
        boolean z19 = false;
        int m76490xf00280e = (hVar == null || (c19786x6a1e2862 = hVar.f315074d) == null) ? 0 : c19786x6a1e2862.m76490xf00280e();
        java.lang.String str4 = "";
        if (hVar != null) {
            ltVar.h7(hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (bm1Var == null || (str = bm1Var.m75945x2fec8307(0)) == null) {
                str = "";
            }
            objArr[0] = str;
            objArr[1] = 2;
            objArr[2] = java.lang.Integer.valueOf(ltVar.l7(hVar));
            g0Var.d(27755, objArr);
            java.util.LinkedList<dk2.h> linkedList = ltVar.C;
            if (m76490xf00280e == 1) {
                te2.u3 u3Var = te2.u3.f500001a;
                r45.bm1 bm1Var2 = hVar.f315078h;
                u3Var.a(1, bm1Var2 != null ? bm1Var2.m75945x2fec8307(0) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "gift add 2 del, index = " + arrayList.indexOf(hVar));
                linkedList.add(hVar);
            } else {
                for (dk2.h hVar2 : linkedList) {
                    int indexOf = arrayList.indexOf(hVar2);
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        java.lang.String str5 = df2.lt.W;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "gift 2 del, index = " + indexOf);
                        arrayList.remove(hVar2);
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ltVar.f312240o;
                        if (c22848x6ddd90cf != null) {
                            c22848x6ddd90cf.m8155x27702c4(indexOf);
                        }
                    }
                }
                linkedList.clear();
            }
            if (ltVar.N) {
                ltVar.x7();
                ltVar.N = false;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = ltVar.f312240o;
            if (c22848x6ddd90cf2 != null) {
                int i19 = ltVar.f312245t;
                java.lang.String str6 = df2.lt.W;
                c22848x6ddd90cf2.m8148xed6e4d18(i19, "bannerselected");
            }
        }
        if (hVar == null || bm1Var == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = bm1Var.m75939xb282bd08(1);
        int m75939xb282bd08 = bm1Var.m75939xb282bd08(15);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = hVar.f315074d;
        if (c19786x6a1e28623.m76494x46f709d9() != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9 = c19786x6a1e28623.m76494x46f709d9();
            if (m76494x46f709d9 != null && m76494x46f709d9.m77164x7528c3fb() == 1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d92 = c19786x6a1e28623.m76494x46f709d9();
                if (m76494x46f709d92 != null && (m77166xb5887639 = m76494x46f709d92.m77166xb5887639()) != null) {
                    str4 = m77166xb5887639;
                }
                ae2.in inVar = ae2.in.f85221a;
                jz5.g gVar = ae2.in.f85439w0;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() != 2) {
                    if (m75939xb282bd08 == 1) {
                        if (str4.length() == 0) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[preloadAdH5] fail, stack:");
                            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            sb7.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb7.toString());
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", "[preloadAdH5] url:".concat(str4));
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f556516a = str4;
                            i0Var.f556518c = 214;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(i0Var);
                            ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList2);
                        }
                    }
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue() == 0 && (c22800xb2c6317b = ltVar.f312239n) != null) {
                        c22800xb2c6317b.postDelayed(new df2.gs(f0Var, str4, hVar, ltVar, bm1Var), bm1Var.m75939xb282bd08(16));
                    }
                }
            }
        }
        if (c19786x6a1e28623.m76503x92bc3c07() == 3) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e28623.m76506x42318aa0();
            if (m76506x42318aa0 != null && m76506x42318aa0.m77224x4236b52c() == 17) {
                z19 = true;
            }
            if (z19) {
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).Ai(0L, "", "", false, true);
            }
        }
    }
}
