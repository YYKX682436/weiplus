package rg1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class h extends i95.w implements sg1.f {

    /* renamed from: d, reason: collision with root package name */
    public static final rg1.h f476751d = new rg1.h();

    public static final sg1.e wi(rg1.h hVar, r45.me3 me3Var) {
        hVar.getClass();
        sg1.e eVar = new sg1.e();
        r45.jr5 jr5Var = me3Var.f461938n;
        eVar.f469606d = jr5Var.f459603d;
        java.lang.String str = jr5Var.f459605f;
        if (str == null) {
            str = "";
        }
        eVar.f469607e = str;
        eVar.f469608f = jr5Var.f459606g;
        eVar.f469609g = me3Var.f461935h;
        if (me3Var.f461937m) {
            java.lang.String str2 = me3Var.f461940p;
            if (!(str2 == null || str2.length() == 0)) {
                eVar.f489411h = me3Var.f461940p;
                eVar.f489412i = me3Var.f461932e;
                eVar.f489413m = me3Var.f461934g;
                return eVar;
            }
        }
        eVar.f489411h = me3Var.f461933f;
        eVar.f489412i = me3Var.f461932e;
        eVar.f489413m = me3Var.f461934g;
        return eVar;
    }

    public void Ai(java.util.List list) {
        java.lang.String str;
        boolean z17;
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pair, "<this>");
            sg1.e eVar = (sg1.e) pair.first;
            java.lang.String str2 = (java.lang.String) pair.second;
            if (eVar != null) {
                java.lang.String str3 = eVar.f469606d;
                if (!(str3 == null || str3.length() == 0)) {
                    java.lang.String str4 = eVar.f489411h;
                    if (!(str4 == null || str4.length() == 0)) {
                        if (str2 != null && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                            java.lang.String str5 = eVar.f469606d;
                            java.lang.String str6 = eVar.f469607e;
                            int i17 = eVar.f469608f;
                            if (i17 == 0) {
                                str = "";
                            } else if (i17 == 6) {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33451xb78d0379;
                            } else if (i17 == 12) {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33448xa038ec0f;
                            } else if (i17 == 13) {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str6) + "$__WITHOUT_PLUGINCODE__";
                            } else if (i17 == 22) {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33447xa94b0169;
                            } else if (i17 != 23) {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str6);
                            } else {
                                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str6) + "$__WITHOUT_MULTI_PLUGINCODE__";
                            }
                            java.lang.String str7 = null;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(str5);
                                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : "$" + str);
                                str7 = sb6.toString();
                            }
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str7, "toString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().L(str7, eVar.f469609g, 0, "versionMd5", "NewMd5");
                            if (L != null) {
                                java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e9.f(str7, eVar.f469609g);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                                java.lang.String m37738xd7a366d = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37738xd7a366d(com.p314xaae8f345.mm.vfs.w6.i(str2, false));
                                boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gc.b(str2);
                                if (b17) {
                                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m37738xd7a366d, eVar.f489411h)) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected zstd file checksum invalid appId[" + eVar.f469606d + "] key[" + eVar.f469607e + "] type[" + eVar.f469608f + "] version[" + eVar.f469609g + "] fileMD5[" + m37738xd7a366d + ']');
                                    } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.gc.a(str2, f17)) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                                        java.lang.String m37738xd7a366d2 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37738xd7a366d(com.p314xaae8f345.mm.vfs.w6.i(f17, false));
                                        java.lang.String[] strArr = {L.f67186x912ff5eb, L.f67176xd0b3bac3};
                                        for (int i18 = 0; i18 < 2; i18++) {
                                            java.lang.String str8 = strArr[i18];
                                            if (!(str8 == null || str8.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str8, m37738xd7a366d2)) {
                                                z17 = true;
                                                break;
                                            }
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected zstd uncompress failed appId[" + eVar.f469606d + "] key[" + eVar.f469607e + "] type[" + eVar.f469608f + "] version[" + eVar.f469609g + "] fileMD5[" + m37738xd7a366d + ']');
                                    }
                                    z17 = false;
                                } else {
                                    java.lang.String[] strArr2 = {L.f67186x912ff5eb, L.f67176xd0b3bac3};
                                    for (int i19 = 0; i19 < 2; i19++) {
                                        java.lang.String str9 = strArr2[i19];
                                        if (!(str9 == null || str9.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str9, m37738xd7a366d)) {
                                            z17 = true;
                                            break;
                                        }
                                    }
                                    z17 = false;
                                }
                                if (z17) {
                                    if (!b17) {
                                        com.p314xaae8f345.mm.vfs.w6.w(str2, f17);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().F(str7, 0, eVar.f469609g, f17);
                                    java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                                    if (z65.c.a()) {
                                        pm0.v.X(new rg1.a(eVar, b17));
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk accepted appId[" + eVar.f469606d + "] key[" + eVar.f469607e + "] type[" + eVar.f469608f + "] version[" + eVar.f469609g + "] fileMD5[" + m37738xd7a366d + "] zstd?[" + b17 + ']');
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "WxaPkg path from OpenSdk rejected appId[" + eVar.f469606d + "] key[" + eVar.f469607e + "] type[" + eVar.f469608f + "] version[" + eVar.f469609g + "] fileMD5[" + m37738xd7a366d + "] zstd?[" + b17 + ']');
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public km5.q Bi(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchDataPrefetchExportServiceImpl", "prefetchContactAndPkgDownloadInfo EMPTY USERNAME");
            return pq5.h.d(null);
        }
        pq5.g q17 = pq5.h.a().q(new rg1.c(str)).q(new rg1.f(x6Var, str2, str));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q17, "$logic(...)");
        return q17;
    }

    public void Di(java.lang.String str, r.a aVar) {
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a.a(kz5.b0.c(str), k91.h1.WX_OPEN_SDK_PRE_FETCH, new rg1.g(aVar, str));
        } else if (aVar != null) {
        }
    }
}
