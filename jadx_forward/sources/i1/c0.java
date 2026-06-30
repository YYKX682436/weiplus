package i1;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f368379a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final i1.b0 f368380b = new i1.b0(0.0f, 0.0f, 3, null);

    /* renamed from: c, reason: collision with root package name */
    public final i1.b0 f368381c = new i1.b0(0.0f, 0.0f, 3, null);

    /* renamed from: d, reason: collision with root package name */
    public final i1.b0 f368382d = new i1.b0(0.0f, 0.0f, 3, null);

    /* renamed from: e, reason: collision with root package name */
    public final i1.b0 f368383e = new i1.b0(0.0f, 0.0f, 3, null);

    public final void a(char c17, float[] args) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list;
        java.util.List list2 = this.f368379a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (c17 == 'z' || c17 == 'Z') {
            list = kz5.b0.c(i1.i.f368460c);
        } else {
            char c18 = 2;
            if (c17 == 'm') {
                e06.i l17 = e06.p.l(new e06.k(0, args.length - 2), 2);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l17, 10));
                java.util.Iterator it = l17.iterator();
                while (((e06.j) it).hasNext()) {
                    int b17 = ((kz5.x0) it).b();
                    float[] P0 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b17, b17 + 2)));
                    float f17 = P0[0];
                    float f18 = P0[1];
                    java.lang.Object uVar = new i1.u(f17, f18);
                    if ((uVar instanceof i1.m) && b17 > 0) {
                        uVar = new i1.l(f17, f18);
                    } else if (b17 > 0) {
                        uVar = new i1.t(f17, f18);
                    }
                    arrayList2.add(uVar);
                }
            } else if (c17 == 'M') {
                e06.i l18 = e06.p.l(new e06.k(0, args.length - 2), 2);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l18, 10));
                java.util.Iterator it6 = l18.iterator();
                while (((e06.j) it6).hasNext()) {
                    int b18 = ((kz5.x0) it6).b();
                    float[] P02 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b18, b18 + 2)));
                    float f19 = P02[0];
                    float f27 = P02[1];
                    java.lang.Object mVar = new i1.m(f19, f27);
                    if (b18 > 0) {
                        mVar = new i1.l(f19, f27);
                    } else if ((mVar instanceof i1.u) && b18 > 0) {
                        mVar = new i1.t(f19, f27);
                    }
                    arrayList2.add(mVar);
                }
            } else if (c17 == 'l') {
                e06.i l19 = e06.p.l(new e06.k(0, args.length - 2), 2);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l19, 10));
                java.util.Iterator it7 = l19.iterator();
                while (((e06.j) it7).hasNext()) {
                    int b19 = ((kz5.x0) it7).b();
                    float[] P03 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b19, b19 + 2)));
                    float f28 = P03[0];
                    float f29 = P03[1];
                    java.lang.Object tVar = new i1.t(f28, f29);
                    if ((tVar instanceof i1.m) && b19 > 0) {
                        tVar = new i1.l(f28, f29);
                    } else if ((tVar instanceof i1.u) && b19 > 0) {
                        tVar = new i1.t(f28, f29);
                    }
                    arrayList2.add(tVar);
                }
            } else if (c17 == 'L') {
                e06.i l27 = e06.p.l(new e06.k(0, args.length - 2), 2);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l27, 10));
                java.util.Iterator it8 = l27.iterator();
                while (((e06.j) it8).hasNext()) {
                    int b27 = ((kz5.x0) it8).b();
                    float[] P04 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b27, b27 + 2)));
                    float f37 = P04[0];
                    float f38 = P04[1];
                    java.lang.Object lVar = new i1.l(f37, f38);
                    if ((lVar instanceof i1.m) && b27 > 0) {
                        lVar = new i1.l(f37, f38);
                    } else if ((lVar instanceof i1.u) && b27 > 0) {
                        lVar = new i1.t(f37, f38);
                    }
                    arrayList2.add(lVar);
                }
            } else if (c17 == 'h') {
                e06.i l28 = e06.p.l(new e06.k(0, args.length - 1), 1);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l28, 10));
                java.util.Iterator it9 = l28.iterator();
                while (((e06.j) it9).hasNext()) {
                    int b28 = ((kz5.x0) it9).b();
                    float[] P05 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b28, b28 + 1)));
                    float f39 = P05[0];
                    java.lang.Object sVar = new i1.s(f39);
                    if ((sVar instanceof i1.m) && b28 > 0) {
                        sVar = new i1.l(f39, P05[1]);
                    } else if ((sVar instanceof i1.u) && b28 > 0) {
                        sVar = new i1.t(f39, P05[1]);
                    }
                    arrayList2.add(sVar);
                }
            } else if (c17 == 'H') {
                e06.i l29 = e06.p.l(new e06.k(0, args.length - 1), 1);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l29, 10));
                java.util.Iterator it10 = l29.iterator();
                while (((e06.j) it10).hasNext()) {
                    int b29 = ((kz5.x0) it10).b();
                    float[] P06 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b29, b29 + 1)));
                    float f47 = P06[0];
                    java.lang.Object kVar = new i1.k(f47);
                    if ((kVar instanceof i1.m) && b29 > 0) {
                        kVar = new i1.l(f47, P06[1]);
                    } else if ((kVar instanceof i1.u) && b29 > 0) {
                        kVar = new i1.t(f47, P06[1]);
                    }
                    arrayList2.add(kVar);
                }
            } else if (c17 == 'v') {
                e06.i l37 = e06.p.l(new e06.k(0, args.length - 1), 1);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l37, 10));
                java.util.Iterator it11 = l37.iterator();
                while (((e06.j) it11).hasNext()) {
                    int b37 = ((kz5.x0) it11).b();
                    float[] P07 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b37, b37 + 1)));
                    float f48 = P07[0];
                    java.lang.Object yVar = new i1.y(f48);
                    if ((yVar instanceof i1.m) && b37 > 0) {
                        yVar = new i1.l(f48, P07[1]);
                    } else if ((yVar instanceof i1.u) && b37 > 0) {
                        yVar = new i1.t(f48, P07[1]);
                    }
                    arrayList2.add(yVar);
                }
            } else if (c17 == 'V') {
                e06.i l38 = e06.p.l(new e06.k(0, args.length - 1), 1);
                arrayList2 = new java.util.ArrayList(kz5.d0.q(l38, 10));
                java.util.Iterator it12 = l38.iterator();
                while (((e06.j) it12).hasNext()) {
                    int b38 = ((kz5.x0) it12).b();
                    float[] P08 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b38, b38 + 1)));
                    float f49 = P08[0];
                    java.lang.Object zVar = new i1.z(f49);
                    if ((zVar instanceof i1.m) && b38 > 0) {
                        zVar = new i1.l(f49, P08[1]);
                    } else if ((zVar instanceof i1.u) && b38 > 0) {
                        zVar = new i1.t(f49, P08[1]);
                    }
                    arrayList2.add(zVar);
                }
            } else {
                char c19 = 5;
                char c27 = 3;
                if (c17 == 'c') {
                    e06.i l39 = e06.p.l(new e06.k(0, args.length - 6), 6);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l39, 10));
                    java.util.Iterator it13 = l39.iterator();
                    while (((e06.j) it13).hasNext()) {
                        int b39 = ((kz5.x0) it13).b();
                        float[] P09 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b39, b39 + 6)));
                        float f57 = P09[0];
                        float f58 = P09[1];
                        java.lang.Object rVar = new i1.r(f57, f58, P09[2], P09[3], P09[4], P09[c19]);
                        arrayList.add((!(rVar instanceof i1.m) || b39 <= 0) ? (!(rVar instanceof i1.u) || b39 <= 0) ? rVar : new i1.t(f57, f58) : new i1.l(f57, f58));
                        c19 = 5;
                    }
                } else if (c17 == 'C') {
                    e06.i l47 = e06.p.l(new e06.k(0, args.length - 6), 6);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l47, 10));
                    java.util.Iterator it14 = l47.iterator();
                    while (((e06.j) it14).hasNext()) {
                        int b47 = ((kz5.x0) it14).b();
                        float[] P010 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b47, b47 + 6)));
                        float f59 = P010[0];
                        float f66 = P010[1];
                        java.lang.Object jVar = new i1.j(f59, f66, P010[2], P010[c27], P010[4], P010[5]);
                        if ((jVar instanceof i1.m) && b47 > 0) {
                            jVar = new i1.l(f59, f66);
                        } else if ((jVar instanceof i1.u) && b47 > 0) {
                            jVar = new i1.t(f59, f66);
                        }
                        arrayList.add(jVar);
                        c27 = 3;
                    }
                } else if (c17 == 's') {
                    e06.i l48 = e06.p.l(new e06.k(0, args.length - 4), 4);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l48, 10));
                    java.util.Iterator it15 = l48.iterator();
                    while (((e06.j) it15).hasNext()) {
                        int b48 = ((kz5.x0) it15).b();
                        float[] P011 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b48, b48 + 4)));
                        float f67 = P011[0];
                        float f68 = P011[1];
                        java.lang.Object wVar = new i1.w(f67, f68, P011[2], P011[3]);
                        if ((wVar instanceof i1.m) && b48 > 0) {
                            wVar = new i1.l(f67, f68);
                        } else if ((wVar instanceof i1.u) && b48 > 0) {
                            wVar = new i1.t(f67, f68);
                        }
                        arrayList.add(wVar);
                    }
                } else if (c17 == 'S') {
                    e06.i l49 = e06.p.l(new e06.k(0, args.length - 4), 4);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l49, 10));
                    java.util.Iterator it16 = l49.iterator();
                    while (((e06.j) it16).hasNext()) {
                        int b49 = ((kz5.x0) it16).b();
                        float[] P012 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b49, b49 + 4)));
                        float f69 = P012[0];
                        float f76 = P012[1];
                        java.lang.Object oVar = new i1.o(f69, f76, P012[2], P012[3]);
                        if ((oVar instanceof i1.m) && b49 > 0) {
                            oVar = new i1.l(f69, f76);
                        } else if ((oVar instanceof i1.u) && b49 > 0) {
                            oVar = new i1.t(f69, f76);
                        }
                        arrayList.add(oVar);
                    }
                } else if (c17 == 'q') {
                    e06.i l57 = e06.p.l(new e06.k(0, args.length - 4), 4);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l57, 10));
                    java.util.Iterator it17 = l57.iterator();
                    while (((e06.j) it17).hasNext()) {
                        int b57 = ((kz5.x0) it17).b();
                        float[] P013 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b57, b57 + 4)));
                        float f77 = P013[0];
                        float f78 = P013[1];
                        java.lang.Object vVar = new i1.v(f77, f78, P013[2], P013[3]);
                        if ((vVar instanceof i1.m) && b57 > 0) {
                            vVar = new i1.l(f77, f78);
                        } else if ((vVar instanceof i1.u) && b57 > 0) {
                            vVar = new i1.t(f77, f78);
                        }
                        arrayList.add(vVar);
                    }
                } else if (c17 == 'Q') {
                    e06.i l58 = e06.p.l(new e06.k(0, args.length - 4), 4);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l58, 10));
                    java.util.Iterator it18 = l58.iterator();
                    while (((e06.j) it18).hasNext()) {
                        int b58 = ((kz5.x0) it18).b();
                        float[] P014 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b58, b58 + 4)));
                        float f79 = P014[0];
                        float f86 = P014[1];
                        java.lang.Object nVar = new i1.n(f79, f86, P014[2], P014[3]);
                        if ((nVar instanceof i1.m) && b58 > 0) {
                            nVar = new i1.l(f79, f86);
                        } else if ((nVar instanceof i1.u) && b58 > 0) {
                            nVar = new i1.t(f79, f86);
                        }
                        arrayList.add(nVar);
                    }
                } else if (c17 == 't') {
                    e06.i l59 = e06.p.l(new e06.k(0, args.length - 2), 2);
                    arrayList2 = new java.util.ArrayList(kz5.d0.q(l59, 10));
                    java.util.Iterator it19 = l59.iterator();
                    while (((e06.j) it19).hasNext()) {
                        int b59 = ((kz5.x0) it19).b();
                        float[] P015 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b59, b59 + 2)));
                        float f87 = P015[0];
                        float f88 = P015[1];
                        java.lang.Object xVar = new i1.x(f87, f88);
                        if ((xVar instanceof i1.m) && b59 > 0) {
                            xVar = new i1.l(f87, f88);
                        } else if ((xVar instanceof i1.u) && b59 > 0) {
                            xVar = new i1.t(f87, f88);
                        }
                        arrayList2.add(xVar);
                    }
                } else if (c17 == 'T') {
                    e06.i l66 = e06.p.l(new e06.k(0, args.length - 2), 2);
                    arrayList2 = new java.util.ArrayList(kz5.d0.q(l66, 10));
                    java.util.Iterator it20 = l66.iterator();
                    while (((e06.j) it20).hasNext()) {
                        int b67 = ((kz5.x0) it20).b();
                        float[] P016 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b67, b67 + 2)));
                        float f89 = P016[0];
                        float f96 = P016[1];
                        java.lang.Object pVar = new i1.p(f89, f96);
                        if ((pVar instanceof i1.m) && b67 > 0) {
                            pVar = new i1.l(f89, f96);
                        } else if ((pVar instanceof i1.u) && b67 > 0) {
                            pVar = new i1.t(f89, f96);
                        }
                        arrayList2.add(pVar);
                    }
                } else if (c17 == 'a') {
                    e06.i l67 = e06.p.l(new e06.k(0, args.length - 7), 7);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l67, 10));
                    java.util.Iterator it21 = l67.iterator();
                    while (((e06.j) it21).hasNext()) {
                        int b68 = ((kz5.x0) it21).b();
                        float[] P017 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b68, b68 + 7)));
                        java.lang.Object qVar = new i1.q(P017[0], P017[1], P017[2], java.lang.Float.compare(P017[3], 0.0f) != 0, java.lang.Float.compare(P017[4], 0.0f) != 0, P017[5], P017[6]);
                        if ((qVar instanceof i1.m) && b68 > 0) {
                            qVar = new i1.l(P017[0], P017[1]);
                        } else if ((qVar instanceof i1.u) && b68 > 0) {
                            qVar = new i1.t(P017[0], P017[1]);
                        }
                        arrayList.add(qVar);
                    }
                } else {
                    if (c17 != 'A') {
                        throw new java.lang.IllegalArgumentException("Unknown command for: " + c17);
                    }
                    e06.i l68 = e06.p.l(new e06.k(0, args.length - 7), 7);
                    arrayList = new java.util.ArrayList(kz5.d0.q(l68, 10));
                    java.util.Iterator it22 = l68.iterator();
                    while (((e06.j) it22).hasNext()) {
                        int b69 = ((kz5.x0) it22).b();
                        float[] P018 = kz5.n0.P0(kz5.z.m0(args, e06.p.m(b69, b69 + 7)));
                        java.lang.Object hVar = new i1.h(P018[0], P018[1], P018[c18], java.lang.Float.compare(P018[3], 0.0f) != 0, java.lang.Float.compare(P018[4], 0.0f) != 0, P018[5], P018[6]);
                        if ((hVar instanceof i1.m) && b69 > 0) {
                            hVar = new i1.l(P018[0], P018[1]);
                        } else if ((hVar instanceof i1.u) && b69 > 0) {
                            hVar = new i1.t(P018[0], P018[1]);
                        }
                        arrayList.add(hVar);
                        c18 = 2;
                    }
                }
                list = arrayList;
            }
            list = arrayList2;
        }
        ((java.util.ArrayList) list2).addAll(list);
    }

    public final void b(e1.p0 p0Var, double d17, double d18, double d19, double d27, double d28, double d29, double d37, boolean z17, boolean z18) {
        double d38;
        double d39;
        double d47 = d28;
        double d48 = (d37 / 180) * 3.141592653589793d;
        double cos = java.lang.Math.cos(d48);
        double sin = java.lang.Math.sin(d48);
        double d49 = ((d17 * cos) + (d18 * sin)) / d47;
        double d57 = (((-d17) * sin) + (d18 * cos)) / d29;
        double d58 = ((d19 * cos) + (d27 * sin)) / d47;
        double d59 = (((-d19) * sin) + (d27 * cos)) / d29;
        double d66 = d49 - d58;
        double d67 = d57 - d59;
        double d68 = 2;
        double d69 = (d49 + d58) / d68;
        double d76 = (d57 + d59) / d68;
        double d77 = (d66 * d66) + (d67 * d67);
        if (d77 == 0.0d) {
            return;
        }
        double d78 = (1.0d / d77) - 0.25d;
        if (d78 < 0.0d) {
            double sqrt = (float) (java.lang.Math.sqrt(d77) / 1.99999d);
            b(p0Var, d17, d18, d19, d27, d47 * sqrt, d29 * sqrt, d37, z17, z18);
            return;
        }
        double sqrt2 = java.lang.Math.sqrt(d78);
        double d79 = d66 * sqrt2;
        double d86 = sqrt2 * d67;
        if (z17 == z18) {
            d38 = d69 - d86;
            d39 = d76 + d79;
        } else {
            d38 = d69 + d86;
            d39 = d76 - d79;
        }
        double atan2 = java.lang.Math.atan2(d57 - d39, d49 - d38);
        double atan22 = java.lang.Math.atan2(d59 - d39, d58 - d38) - atan2;
        if (z18 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d87 = d38 * d47;
        double d88 = d39 * d29;
        double d89 = (d87 * cos) - (d88 * sin);
        double d96 = (d87 * sin) + (d88 * cos);
        double d97 = 4;
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((atan22 * d97) / 3.141592653589793d));
        double cos2 = java.lang.Math.cos(d48);
        double sin2 = java.lang.Math.sin(d48);
        double cos3 = java.lang.Math.cos(atan2);
        double sin3 = java.lang.Math.sin(atan2);
        double d98 = -d47;
        double d99 = d98 * cos2;
        double d100 = d29 * sin2;
        double d101 = d98 * sin2;
        double d102 = d29 * cos2;
        double d103 = atan22 / ceil;
        double d104 = d17;
        double d105 = (d99 * sin3) - (d100 * cos3);
        int i17 = 0;
        double d106 = atan2;
        double d107 = (sin3 * d101) + (cos3 * d102);
        double d108 = d18;
        while (i17 < ceil) {
            double d109 = d106 + d103;
            double sin4 = java.lang.Math.sin(d109);
            double cos4 = java.lang.Math.cos(d109);
            double d110 = d103;
            double d111 = (d89 + ((d47 * cos2) * cos4)) - (d100 * sin4);
            double d112 = d96 + (d47 * sin2 * cos4) + (d102 * sin4);
            double d113 = (d99 * sin4) - (d100 * cos4);
            double d114 = (sin4 * d101) + (cos4 * d102);
            double d115 = d109 - d106;
            double tan = java.lang.Math.tan(d115 / d68);
            double sin5 = (java.lang.Math.sin(d115) * (java.lang.Math.sqrt(d97 + ((3.0d * tan) * tan)) - 1)) / 3;
            ((e1.i) p0Var).f327796a.cubicTo((float) (d104 + (d105 * sin5)), (float) (d108 + (d107 * sin5)), (float) (d111 - (sin5 * d113)), (float) (d112 - (sin5 * d114)), (float) d111, (float) d112);
            i17++;
            sin2 = sin2;
            d101 = d101;
            d108 = d112;
            d104 = d111;
            ceil = ceil;
            d106 = d109;
            d107 = d114;
            d105 = d113;
            d103 = d110;
            d47 = d28;
        }
    }

    public final e1.p0 c(e1.p0 target) {
        int i17;
        int i18;
        i1.b0 b0Var;
        java.util.ArrayList arrayList;
        e1.i iVar;
        int i19;
        i1.b0 b0Var2;
        i1.a0 a0Var;
        i1.b0 b0Var3;
        i1.b0 b0Var4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        e1.i iVar2 = (e1.i) target;
        iVar2.c();
        i1.b0 b0Var5 = this.f368380b;
        b0Var5.a();
        i1.b0 b0Var6 = this.f368381c;
        b0Var6.a();
        i1.b0 b0Var7 = this.f368382d;
        b0Var7.a();
        i1.b0 b0Var8 = this.f368383e;
        b0Var8.a();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.f368379a;
        int size = arrayList2.size();
        i1.a0 a0Var2 = null;
        int i27 = 0;
        while (i27 < size) {
            i1.a0 a0Var3 = (i1.a0) arrayList2.get(i27);
            if (a0Var2 == null) {
                a0Var2 = a0Var3;
            }
            boolean z17 = a0Var3 instanceof i1.i;
            android.graphics.Path path = iVar2.f327796a;
            android.graphics.Path path2 = iVar2.f327796a;
            if (z17) {
                b0Var5.f368365a = b0Var7.f368365a;
                b0Var5.f368366b = b0Var7.f368366b;
                b0Var6.f368365a = b0Var7.f368365a;
                b0Var6.f368366b = b0Var7.f368366b;
                path.close();
                path2.moveTo(b0Var5.f368365a, b0Var5.f368366b);
            } else if (a0Var3 instanceof i1.u) {
                i1.u uVar = (i1.u) a0Var3;
                float f17 = b0Var5.f368365a;
                float f18 = uVar.f368579c;
                b0Var5.f368365a = f17 + f18;
                float f19 = b0Var5.f368366b;
                float f27 = uVar.f368580d;
                b0Var5.f368366b = f19 + f27;
                path.rMoveTo(f18, f27);
                b0Var7.f368365a = b0Var5.f368365a;
                b0Var7.f368366b = b0Var5.f368366b;
            } else if (a0Var3 instanceof i1.m) {
                i1.m mVar = (i1.m) a0Var3;
                float f28 = mVar.f368504c;
                b0Var5.f368365a = f28;
                float f29 = mVar.f368505d;
                b0Var5.f368366b = f29;
                path.moveTo(f28, f29);
                b0Var7.f368365a = b0Var5.f368365a;
                b0Var7.f368366b = b0Var5.f368366b;
            } else if (a0Var3 instanceof i1.t) {
                i1.t tVar = (i1.t) a0Var3;
                float f37 = tVar.f368558c;
                float f38 = tVar.f368559d;
                path.rLineTo(f37, f38);
                b0Var5.f368365a += tVar.f368558c;
                b0Var5.f368366b += f38;
            } else if (a0Var3 instanceof i1.l) {
                i1.l lVar = (i1.l) a0Var3;
                float f39 = lVar.f368500c;
                float f47 = lVar.f368501d;
                path.lineTo(f39, f47);
                b0Var5.f368365a = lVar.f368500c;
                b0Var5.f368366b = f47;
            } else if (a0Var3 instanceof i1.s) {
                i1.s sVar = (i1.s) a0Var3;
                path.rLineTo(sVar.f368554c, 0.0f);
                b0Var5.f368365a += sVar.f368554c;
            } else if (a0Var3 instanceof i1.k) {
                i1.k kVar = (i1.k) a0Var3;
                path.lineTo(kVar.f368497c, b0Var5.f368366b);
                b0Var5.f368365a = kVar.f368497c;
            } else if (a0Var3 instanceof i1.y) {
                i1.y yVar = (i1.y) a0Var3;
                path.rLineTo(0.0f, yVar.f368607c);
                b0Var5.f368366b += yVar.f368607c;
            } else if (a0Var3 instanceof i1.z) {
                i1.z zVar = (i1.z) a0Var3;
                path.lineTo(b0Var5.f368365a, zVar.f368613c);
                b0Var5.f368366b = zVar.f368613c;
            } else {
                if (a0Var3 instanceof i1.r) {
                    i1.r rVar = (i1.r) a0Var3;
                    i17 = size;
                    path.rCubicTo(rVar.f368545c, rVar.f368546d, rVar.f368547e, rVar.f368548f, rVar.f368549g, rVar.f368550h);
                    b0Var6.f368365a = b0Var5.f368365a + rVar.f368547e;
                    b0Var6.f368366b = b0Var5.f368366b + rVar.f368548f;
                    b0Var5.f368365a += rVar.f368549g;
                    b0Var5.f368366b += rVar.f368550h;
                } else {
                    i17 = size;
                    if (a0Var3 instanceof i1.j) {
                        i1.j jVar = (i1.j) a0Var3;
                        path.cubicTo(jVar.f368472c, jVar.f368473d, jVar.f368474e, jVar.f368475f, jVar.f368476g, jVar.f368477h);
                        b0Var6.f368365a = jVar.f368474e;
                        b0Var6.f368366b = jVar.f368475f;
                        b0Var5.f368365a = jVar.f368476g;
                        b0Var5.f368366b = jVar.f368477h;
                    } else if (a0Var3 instanceof i1.w) {
                        i1.w wVar = (i1.w) a0Var3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var2);
                        if (a0Var2.f368346a) {
                            b0Var8.f368365a = b0Var5.f368365a - b0Var6.f368365a;
                            b0Var8.f368366b = b0Var5.f368366b - b0Var6.f368366b;
                        } else {
                            b0Var8.a();
                        }
                        iVar2.f327796a.rCubicTo(b0Var8.f368365a, b0Var8.f368366b, wVar.f368590c, wVar.f368591d, wVar.f368592e, wVar.f368593f);
                        b0Var6.f368365a = b0Var5.f368365a + wVar.f368590c;
                        b0Var6.f368366b = b0Var5.f368366b + wVar.f368591d;
                        b0Var5.f368365a += wVar.f368592e;
                        b0Var5.f368366b += wVar.f368593f;
                    } else if (a0Var3 instanceof i1.o) {
                        i1.o oVar = (i1.o) a0Var3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var2);
                        if (a0Var2.f368346a) {
                            float f48 = 2;
                            b0Var8.f368365a = (b0Var5.f368365a * f48) - b0Var6.f368365a;
                            b0Var8.f368366b = (f48 * b0Var5.f368366b) - b0Var6.f368366b;
                        } else {
                            b0Var8.f368365a = b0Var5.f368365a;
                            b0Var8.f368366b = b0Var5.f368366b;
                        }
                        iVar2.f327796a.cubicTo(b0Var8.f368365a, b0Var8.f368366b, oVar.f368515c, oVar.f368516d, oVar.f368517e, oVar.f368518f);
                        b0Var6.f368365a = oVar.f368515c;
                        b0Var6.f368366b = oVar.f368516d;
                        b0Var5.f368365a = oVar.f368517e;
                        b0Var5.f368366b = oVar.f368518f;
                    } else if (a0Var3 instanceof i1.v) {
                        i1.v vVar = (i1.v) a0Var3;
                        float f49 = vVar.f368584c;
                        float f57 = vVar.f368585d;
                        float f58 = vVar.f368586e;
                        float f59 = vVar.f368587f;
                        path.rQuadTo(f49, f57, f58, f59);
                        b0Var6.f368365a = b0Var5.f368365a + vVar.f368584c;
                        b0Var6.f368366b = b0Var5.f368366b + f57;
                        b0Var5.f368365a += f58;
                        b0Var5.f368366b += f59;
                    } else if (a0Var3 instanceof i1.n) {
                        i1.n nVar = (i1.n) a0Var3;
                        float f66 = nVar.f368508c;
                        float f67 = nVar.f368509d;
                        float f68 = nVar.f368510e;
                        float f69 = nVar.f368511f;
                        path.quadTo(f66, f67, f68, f69);
                        b0Var6.f368365a = nVar.f368508c;
                        b0Var6.f368366b = f67;
                        b0Var5.f368365a = f68;
                        b0Var5.f368366b = f69;
                    } else if (a0Var3 instanceof i1.x) {
                        i1.x xVar = (i1.x) a0Var3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var2);
                        if (a0Var2.f368347b) {
                            b0Var8.f368365a = b0Var5.f368365a - b0Var6.f368365a;
                            b0Var8.f368366b = b0Var5.f368366b - b0Var6.f368366b;
                        } else {
                            b0Var8.a();
                        }
                        float f76 = b0Var8.f368365a;
                        float f77 = b0Var8.f368366b;
                        float f78 = xVar.f368602c;
                        float f79 = xVar.f368603d;
                        path2.rQuadTo(f76, f77, f78, f79);
                        b0Var6.f368365a = b0Var5.f368365a + b0Var8.f368365a;
                        b0Var6.f368366b = b0Var5.f368366b + b0Var8.f368366b;
                        b0Var5.f368365a += xVar.f368602c;
                        b0Var5.f368366b += f79;
                    } else if (a0Var3 instanceof i1.p) {
                        i1.p pVar = (i1.p) a0Var3;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a0Var2);
                        if (a0Var2.f368347b) {
                            float f86 = 2;
                            b0Var8.f368365a = (b0Var5.f368365a * f86) - b0Var6.f368365a;
                            b0Var8.f368366b = (f86 * b0Var5.f368366b) - b0Var6.f368366b;
                        } else {
                            b0Var8.f368365a = b0Var5.f368365a;
                            b0Var8.f368366b = b0Var5.f368366b;
                        }
                        float f87 = b0Var8.f368365a;
                        float f88 = b0Var8.f368366b;
                        float f89 = pVar.f368531c;
                        float f96 = pVar.f368532d;
                        path2.quadTo(f87, f88, f89, f96);
                        b0Var6.f368365a = b0Var8.f368365a;
                        b0Var6.f368366b = b0Var8.f368366b;
                        b0Var5.f368365a = pVar.f368531c;
                        b0Var5.f368366b = f96;
                    } else {
                        if (a0Var3 instanceof i1.q) {
                            i1.q qVar = (i1.q) a0Var3;
                            float f97 = qVar.f368541h;
                            float f98 = b0Var5.f368365a;
                            float f99 = f97 + f98;
                            float f100 = b0Var5.f368366b;
                            float f101 = qVar.f368542i + f100;
                            i18 = i27;
                            i19 = i17;
                            b0Var = b0Var8;
                            arrayList = arrayList2;
                            i1.b0 b0Var9 = b0Var6;
                            b0Var2 = b0Var7;
                            i1.b0 b0Var10 = b0Var5;
                            iVar = iVar2;
                            b(target, f98, f100, f99, f101, qVar.f368536c, qVar.f368537d, qVar.f368538e, qVar.f368539f, qVar.f368540g);
                            b0Var10.f368365a = f99;
                            b0Var10.f368366b = f101;
                            b0Var9.f368365a = f99;
                            b0Var9.f368366b = f101;
                            b0Var4 = b0Var10;
                            b0Var3 = b0Var9;
                            a0Var = a0Var3;
                        } else {
                            i18 = i27;
                            b0Var = b0Var8;
                            arrayList = arrayList2;
                            iVar = iVar2;
                            i1.b0 b0Var11 = b0Var5;
                            i19 = i17;
                            i1.b0 b0Var12 = b0Var6;
                            b0Var2 = b0Var7;
                            if (a0Var3 instanceof i1.h) {
                                i1.h hVar = (i1.h) a0Var3;
                                double d17 = b0Var11.f368365a;
                                double d18 = b0Var11.f368366b;
                                double d19 = hVar.f368455h;
                                float f102 = hVar.f368456i;
                                a0Var = a0Var3;
                                b(target, d17, d18, d19, f102, hVar.f368450c, hVar.f368451d, hVar.f368452e, hVar.f368453f, hVar.f368454g);
                                float f103 = hVar.f368455h;
                                b0Var4 = b0Var11;
                                b0Var4.f368365a = f103;
                                b0Var4.f368366b = f102;
                                b0Var3 = b0Var12;
                                b0Var3.f368365a = f103;
                                b0Var3.f368366b = f102;
                            } else {
                                a0Var = a0Var3;
                                b0Var3 = b0Var12;
                                b0Var4 = b0Var11;
                            }
                        }
                        i27 = i18 + 1;
                        b0Var5 = b0Var4;
                        b0Var6 = b0Var3;
                        size = i19;
                        arrayList2 = arrayList;
                        b0Var8 = b0Var;
                        a0Var2 = a0Var;
                        b0Var7 = b0Var2;
                        iVar2 = iVar;
                    }
                }
                a0Var = a0Var3;
                i18 = i27;
                b0Var = b0Var8;
                arrayList = arrayList2;
                b0Var3 = b0Var6;
                iVar = iVar2;
                b0Var4 = b0Var5;
                i19 = i17;
                b0Var2 = b0Var7;
                i27 = i18 + 1;
                b0Var5 = b0Var4;
                b0Var6 = b0Var3;
                size = i19;
                arrayList2 = arrayList;
                b0Var8 = b0Var;
                a0Var2 = a0Var;
                b0Var7 = b0Var2;
                iVar2 = iVar;
            }
            a0Var = a0Var3;
            i19 = size;
            i18 = i27;
            b0Var = b0Var8;
            arrayList = arrayList2;
            b0Var3 = b0Var6;
            b0Var2 = b0Var7;
            iVar = iVar2;
            b0Var4 = b0Var5;
            i27 = i18 + 1;
            b0Var5 = b0Var4;
            b0Var6 = b0Var3;
            size = i19;
            arrayList2 = arrayList;
            b0Var8 = b0Var;
            a0Var2 = a0Var;
            b0Var7 = b0Var2;
            iVar2 = iVar;
        }
        return target;
    }
}
