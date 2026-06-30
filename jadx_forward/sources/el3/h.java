package el3;

/* loaded from: classes13.dex */
public class h implements el3.i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f335521a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f335522b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile int f335523c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f335524d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile int f335525e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f335526f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile int f335527g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.util.HashMap f335528h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static volatile java.util.HashMap f335529i = new java.util.HashMap();

    /* renamed from: j, reason: collision with root package name */
    public static volatile java.util.HashMap f335530j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public static volatile java.util.HashMap f335531k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public static volatile java.util.HashMap f335532l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.util.HashMap f335533m = new java.util.HashMap();

    public static void A(el3.h hVar, java.util.HashMap hashMap, java.lang.String str, long j17) {
        hVar.getClass();
        if (hashMap.containsKey(str)) {
            ((java.util.List) hashMap.get(str)).add(java.lang.Long.valueOf(j17));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.Long.valueOf(j17));
        hashMap.put(str, arrayList);
    }

    public static void y(el3.h hVar, el3.g gVar, java.util.HashMap hashMap) {
        int i17;
        hVar.getClass();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.List list = (java.util.List) ((java.util.Map.Entry) it.next()).getValue();
            for (int i18 = 0; i18 < list.size(); i18++) {
                gVar.f335519b += ((java.lang.Long) list.get(i18)).longValue();
            }
            gVar.f335518a += list.size();
        }
        long j17 = gVar.f335519b;
        if (j17 <= 0 || (i17 = gVar.f335518a) <= 0) {
            return;
        }
        gVar.f335520c = j17 / i17;
    }

    public static void z(el3.h hVar, java.lang.String str) {
        hVar.getClass();
        for (java.util.Map.Entry entry : f335530j.entrySet()) {
            el3.f fVar = (el3.f) entry.getValue();
            if (fVar != null && fVar.f335514a >= 1) {
                long j17 = fVar.f335516c;
                if (j17 == 0) {
                    j17 = rl.a.e((java.lang.String) entry.getKey());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16577, str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(fVar.f335517d), java.lang.Long.valueOf(fVar.f335515b), java.lang.Integer.valueOf(fVar.f335514a), 0);
            }
        }
    }

    public void B(int i17, long j17, long j18, long j19, int i18, int i19, long j27, long j28, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344;
        long j29;
        int i29;
        int i37;
        int i38;
        int i39;
        int i47;
        int i48;
        int i49;
        int i57;
        int i58;
        int i59;
        int i66;
        int i67;
        int i68;
        int i69;
        int i76;
        int i77;
        int i78;
        int i79;
        int i86;
        int i87;
        int i88;
        int i89;
        int i96;
        int i97;
        int i98;
        int i99;
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(971);
        c4582x424c3442.m40331x936762bd(0);
        c4582x424c3442.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3443.m40330x4c144dd(971);
        c4582x424c3443.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3443);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3444.m40330x4c144dd(971);
        c4582x424c3444.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3444);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3445.m40330x4c144dd(971);
        c4582x424c3445.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3445);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3446.m40330x4c144dd(971);
        c4582x424c3446.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3446);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3447 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3447.m40330x4c144dd(971);
        c4582x424c3447.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3447);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3448 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3448.m40330x4c144dd(971);
        c4582x424c3448.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3448);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3449 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3449.m40330x4c144dd(971);
        c4582x424c3449.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c3449);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34410 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34411 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        if (i18 > 0) {
            c4582x424c34410.m40330x4c144dd(971);
            c4582x424c34410.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c34410);
            c4582x424c34411.m40330x4c144dd(971);
            c4582x424c34411.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c34411);
        }
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34412 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34413 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        if (i19 > 0) {
            c4582x424c34412.m40330x4c144dd(971);
            c4582x424c344 = c4582x424c34410;
            c4582x424c34412.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c34412);
            c4582x424c34413.m40330x4c144dd(971);
            c4582x424c34413.m40332x57b2b64f(1L);
            arrayList.add(c4582x424c34413);
        } else {
            c4582x424c344 = c4582x424c34410;
        }
        if (i17 == 0) {
            c4582x424c3443.m40331x936762bd(1);
            c4582x424c3444.m40331x936762bd(2);
            c4582x424c3445.m40331x936762bd((0 > j17 || j17 > 3) ? (3 >= j17 || j17 > 6) ? (6 >= j17 || j17 > 10) ? (10 >= j17 || j17 > 15) ? (15 >= j17 || j17 > 20) ? 8 : 7 : 6 : 5 : 4 : 3);
            c4582x424c3446.m40331x936762bd(11);
            c4582x424c3447.m40331x936762bd((0 > j18 || j18 > 6) ? (6 >= j18 || j18 > 10) ? (10 >= j18 || j18 > 15) ? (15 >= j18 || j18 > 20) ? (20 >= j18 || j18 > 30) ? (30 >= j18 || j18 > 40) ? (40 >= j18 || j18 > 50) ? 19 : 18 : 17 : 16 : 15 : 14 : 13 : 12);
            c4582x424c3448.m40331x936762bd(22);
            c4582x424c3449.m40331x936762bd((0 > j19 || j19 > 20) ? (20 >= j19 || j19 > 30) ? (30 >= j19 || j19 > 40) ? (40 >= j19 || j19 > 50) ? (50 >= j19 || j19 > 60) ? (60 >= j19 || j19 > 70) ? (70 >= j19 || j19 > 80) ? (80 >= j19 || j19 > 90) ? (90 >= j19 || j19 > 100) ? (100 >= j19 || j19 > 110) ? (110 >= j19 || j19 > 120) ? (120 >= j19 || j19 > 130) ? (130 >= j19 || j19 > 140) ? (140 >= j19 || j19 > 150) ? (150 >= j19 || j19 > 200) ? 38 : 37 : 36 : 35 : 34 : 33 : 32 : 31 : 30 : 29 : 28 : 27 : 26 : 25 : 24 : 23);
            if (i18 > 0) {
                c4582x424c344.m40331x936762bd(41);
                if (i18 == 0) {
                    i99 = 42;
                } else if (1 <= i18 && i18 <= 3) {
                    i99 = 43;
                } else if (4 <= i18 && i18 <= 6) {
                    i99 = 44;
                } else if (7 <= i18 && i18 <= 10) {
                    i99 = 45;
                } else if (11 > i18 || i18 > 15) {
                    if (15 < i18) {
                        i97 = 20;
                        if (i18 <= 20) {
                            i99 = 47;
                        }
                    } else {
                        i97 = 20;
                    }
                    if (i97 < i18) {
                        i98 = 40;
                        if (i18 <= 40) {
                            i99 = 48;
                        }
                    } else {
                        i98 = 40;
                    }
                    i99 = (i98 >= i18 || i18 > 60) ? (60 >= i18 || i18 > 100) ? 51 : 50 : 49;
                } else {
                    i99 = 46;
                }
                c4582x424c34411.m40331x936762bd(i99);
            }
            if (i19 > 0) {
                c4582x424c34412.m40331x936762bd(124);
                if (i19 == 0) {
                    i89 = 125;
                } else {
                    if (i19 < 0 || i19 > 10) {
                        if (10 <= i19) {
                            i87 = 20;
                            if (i19 <= 20) {
                                i96 = 127;
                            }
                        } else {
                            i87 = 20;
                        }
                        if (i87 <= i19) {
                            i88 = 40;
                            if (i19 <= 40) {
                                i96 = 128;
                            }
                        } else {
                            i88 = 40;
                        }
                        if (i88 > i19 || i19 > 60) {
                            if (60 < i19 && i19 <= 100) {
                                i96 = 130;
                            } else if (100 < i19 && i19 <= 150) {
                                i89 = 131;
                            } else if (150 >= i19 || i19 > 200) {
                                i89 = (200 >= i19 || i19 > 500) ? 134 : 133;
                            } else {
                                i96 = 132;
                            }
                            i89 = i96;
                        } else {
                            i96 = 129;
                        }
                    } else {
                        i96 = 126;
                    }
                    i89 = i96;
                }
                c4582x424c34413.m40331x936762bd(i89);
            }
            i38 = i27;
            i37 = 200;
        } else {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34414 = c4582x424c344;
            c4582x424c3443.m40331x936762bd(59);
            c4582x424c3444.m40331x936762bd(60);
            c4582x424c3445.m40331x936762bd((0 >= j17 || j17 > 3) ? (3 >= j17 || j17 > 6) ? (6 >= j17 || j17 > 10) ? (10 >= j17 || j17 > 15) ? (15 >= j17 || j17 > 20) ? 66 : 65 : 64 : 63 : 62 : 61);
            c4582x424c3446.m40331x936762bd(69);
            c4582x424c3447.m40331x936762bd((0 > j18 || j18 > 6) ? (6 >= j18 || j18 > 10) ? (10 >= j18 || j18 > 15) ? (15 >= j18 || j18 > 20) ? (20 >= j18 || j18 > 30) ? (30 >= j18 || j18 > 40) ? (40 >= j18 || j18 > 50) ? 77 : 76 : 75 : 74 : 73 : 72 : 71 : 70);
            c4582x424c3448.m40331x936762bd(80);
            if (0 <= j19 && j19 <= 20) {
                i29 = 81;
            } else if (20 < j19 && j19 <= 30) {
                i29 = 82;
            } else if (30 < j19 && j19 <= 40) {
                i29 = 83;
            } else if (40 < j19 && j19 <= 50) {
                i29 = 84;
            } else if (50 < j19 && j19 <= 60) {
                i29 = 85;
            } else if (60 >= j19 || j19 > 70) {
                if (70 < j19) {
                    j29 = 80;
                    if (j19 <= 80) {
                        i29 = 87;
                    }
                } else {
                    j29 = 80;
                }
                i29 = (j29 >= j19 || j19 > 90) ? (90 >= j19 || j19 > 100) ? (100 >= j19 || j19 > 110) ? (110 >= j19 || j19 > 120) ? (120 >= j19 || j19 > 130) ? (130 >= j19 || j19 > 140) ? (140 >= j19 || j19 > 150) ? (150 >= j19 || j19 > 200) ? 96 : 95 : 94 : 93 : 92 : 91 : 90 : 89 : 88;
            } else {
                i29 = 86;
            }
            c4582x424c3449.m40331x936762bd(i29);
            if (i18 > 0) {
                c4582x424c34414.m40331x936762bd(98);
                if (i18 == 0) {
                    i66 = 99;
                } else if (1 <= i18 && i18 <= 3) {
                    i66 = 100;
                } else if (4 <= i18 && i18 <= 6) {
                    i66 = 101;
                } else if (7 > i18 || i18 > 10) {
                    if (11 <= i18) {
                        i57 = 15;
                        if (i18 <= 15) {
                            i66 = 103;
                        }
                    } else {
                        i57 = 15;
                    }
                    if (i57 < i18) {
                        i58 = 20;
                        if (i18 <= 20) {
                            i66 = 104;
                        }
                    } else {
                        i58 = 20;
                    }
                    if (i58 < i18) {
                        i59 = 40;
                        if (i18 <= 40) {
                            i66 = 105;
                        }
                    } else {
                        i59 = 40;
                    }
                    i66 = (i59 >= i18 || i18 > 60) ? (60 >= i18 || i18 > 100) ? 108 : 107 : 106;
                } else {
                    i66 = 102;
                }
                c4582x424c34411.m40331x936762bd(i66);
            }
            if (i19 > 0) {
                c4582x424c34412.m40331x936762bd(139);
                if (i19 == 0) {
                    i49 = 140;
                } else {
                    if (i19 < 0 || i19 > 10) {
                        if (10 <= i19) {
                            i39 = 20;
                            if (i19 <= 20) {
                                i48 = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf;
                            }
                        } else {
                            i39 = 20;
                        }
                        if (i39 <= i19) {
                            i47 = 40;
                            if (i19 <= 40) {
                                i48 = com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd;
                            }
                        } else {
                            i47 = 40;
                        }
                        if (i47 <= i19 && i19 <= 60) {
                            i48 = 144;
                        } else if (60 < i19 && i19 <= 100) {
                            i48 = 145;
                            i37 = 200;
                            c4582x424c34413.m40331x936762bd(i48);
                        } else if (100 >= i19 || i19 > 150) {
                            i37 = 200;
                            i48 = (150 >= i19 || i19 > 200) ? (200 >= i19 || i19 > 500) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de : 148 : 147;
                            c4582x424c34413.m40331x936762bd(i48);
                        } else {
                            i49 = 146;
                        }
                    } else {
                        i48 = 141;
                    }
                    i37 = 200;
                    c4582x424c34413.m40331x936762bd(i48);
                }
                i48 = i49;
                i37 = 200;
                c4582x424c34413.m40331x936762bd(i48);
            } else {
                i37 = 200;
            }
            if (j27 > 0 && j28 > 0) {
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34415 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34415.m40330x4c144dd(971);
                c4582x424c34415.m40332x57b2b64f(1L);
                c4582x424c34415.m40331x936762bd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5);
                arrayList.add(c4582x424c34415);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34416 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34416.m40330x4c144dd(971);
                c4582x424c34416.m40332x57b2b64f(1L);
                c4582x424c34416.m40331x936762bd((0 > j27 || j27 > 10485760) ? (10485760 >= j27 || j27 > 20971520) ? (20971520 >= j27 || j27 > 31457280) ? (31457280 >= j27 || j27 > 41943040) ? (41943040 >= j27 || j27 > 52428800) ? (52428800 >= j27 || j27 > 62914560) ? (62914560 >= j27 || j27 > 73400320) ? (73400320 >= j27 || j27 > 94371840) ? (94371840 >= j27 || j27 > 115343360) ? 163 : 162 : 161 : 160 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de : 158 : 157 : 156 : 155 : 154);
                arrayList.add(c4582x424c34416);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34417 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c34417.m40330x4c144dd(971);
                c4582x424c34417.m40332x57b2b64f(1L);
                c4582x424c34417.m40331x936762bd((0 > j28 || j28 > 10485760) ? (10485760 >= j28 || j28 > 20971520) ? (20971520 >= j28 || j28 > 31457280) ? (31457280 >= j28 || j28 > 41943040) ? (41943040 >= j28 || j28 > 52428800) ? (52428800 >= j28 || j28 > 62914560) ? (62914560 >= j28 || j28 > 73400320) ? (73400320 >= j28 || j28 > 94371840) ? (94371840 >= j28 || j28 > 115343360) ? 178 : 177 : 176 : 175 : 174 : ib1.t.f69911x366c91de : 172 : 171 : 170 : be1.r.f4230x366c91de);
                arrayList.add(c4582x424c34417);
            }
            i38 = i27;
        }
        if (i38 > 0) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34418 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c34418.m40330x4c144dd(971);
            c4582x424c34418.m40332x57b2b64f(1L);
            c4582x424c34418.m40331x936762bd(181);
            arrayList.add(c4582x424c34418);
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34419 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c34419.m40330x4c144dd(971);
            c4582x424c34419.m40332x57b2b64f(1L);
            if (1 <= i38 && i38 <= 3) {
                i86 = 182;
            } else if (4 <= i38 && i38 <= 6) {
                i86 = 183;
            } else if (7 > i38 || i38 > 10) {
                if (11 <= i38) {
                    i77 = 15;
                    if (i38 <= 15) {
                        i86 = 185;
                    }
                } else {
                    i77 = 15;
                }
                if (i77 < i38) {
                    i78 = 20;
                    if (i38 <= 20) {
                        i86 = 186;
                    }
                } else {
                    i78 = 20;
                }
                if (i78 < i38) {
                    i79 = 40;
                    if (i38 <= 40) {
                        i86 = 187;
                    }
                } else {
                    i79 = 40;
                }
                i86 = (i79 >= i38 || i38 > 60) ? (60 >= i38 || i38 > 100) ? 190 : 189 : 188;
            } else {
                i86 = 184;
            }
            c4582x424c34419.m40331x936762bd(i86);
            arrayList.add(c4582x424c34419);
        }
        if (i28 > 0) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34420 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34421 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
            c4582x424c34420.m40330x4c144dd(971);
            c4582x424c34420.m40332x57b2b64f(1L);
            c4582x424c34420.m40331x936762bd(193);
            arrayList.add(c4582x424c34420);
            c4582x424c34421.m40330x4c144dd(971);
            c4582x424c34421.m40332x57b2b64f(1L);
            if (1 <= i28 && i28 <= 3) {
                i76 = 194;
            } else if (4 <= i28 && i28 <= 6) {
                i76 = 195;
            } else if (7 > i28 || i28 > 10) {
                if (11 <= i28) {
                    i67 = 15;
                    if (i28 <= 15) {
                        i76 = 197;
                    }
                } else {
                    i67 = 15;
                }
                if (i67 < i28) {
                    i68 = 20;
                    if (i28 <= 20) {
                        i76 = nd1.d1.f72919x366c91de;
                    }
                } else {
                    i68 = 20;
                }
                if (i68 < i28) {
                    i69 = 40;
                    if (i28 <= 40) {
                        i76 = 199;
                    }
                } else {
                    i69 = 40;
                }
                i76 = (i69 >= i28 || i28 > 60) ? (60 >= i28 || i28 > 100) ? 202 : 201 : i37;
            } else {
                i76 = 196;
            }
            c4582x424c34421.m40331x936762bd(i76);
            arrayList.add(c4582x424c34421);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c34422 = (com.p314xaae8f345.p542x3306d5.smc.C4582x424c344) it.next();
            c4582x424c34422.m40328x7eed3b49();
            c4582x424c34422.m40329x79249bdb();
        }
        int i100 = rl.b.f478676a;
    }

    public void C(int i17) {
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
        c4582x424c344.m40331x936762bd(118);
        c4582x424c344.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(na1.e.f72905x366c91de);
        c4582x424c3442.m40331x936762bd(el3.a.a(i17));
        c4582x424c3442.m40332x57b2b64f(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
        el3.a.b(arrayList);
    }

    public void D(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c344.m40330x4c144dd(na1.e.f72905x366c91de);
        c4582x424c344.m40331x936762bd(0);
        c4582x424c344.m40332x57b2b64f(1L);
        com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
        c4582x424c3442.m40330x4c144dd(na1.e.f72905x366c91de);
        c4582x424c3442.m40331x936762bd(2);
        c4582x424c3442.m40332x57b2b64f(1L);
        arrayList.add(c4582x424c344);
        arrayList.add(c4582x424c3442);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.j(arrayList, true, false);
    }

    public void E(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, boolean z17, java.lang.String str3, long j27, long j28, long j29) {
        p95.a.a(new el3.d(this, str, str2, j17, j18, j19, z17, str3, j29, j28, j27));
    }
}
