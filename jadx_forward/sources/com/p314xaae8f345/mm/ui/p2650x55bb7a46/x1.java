package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class x1 {
    public static int a(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return -8868722;
        }
        java.lang.String str = qVar.f430269z1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9 c6253xea7119b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9();
        c6253xea7119b9.f136500g.f89583a = str;
        c6253xea7119b9.e();
        int i17 = c6253xea7119b9.f136501h.f89696a;
        if (i17 == 4 && qVar.A1 == 5) {
            return -12479656;
        }
        if (i17 != 3 && i17 != 2 && i17 != 4) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e17 = e(qVar);
            int i18 = qVar.A1;
            long j17 = e17.f287717e;
            int i19 = e17.f287716d;
            int i27 = e17.f287715c;
            int i28 = e17.f287713a;
            int i29 = e17.f287714b;
            if (i18 == 2 || i18 == 3) {
                if (i28 == 1 || z17) {
                    if (i29 > 0 && i27 >= 0 && i19 >= 0) {
                        if (i29 == 1 || i29 == 2) {
                            return -12479656;
                        }
                    }
                } else if (i28 == 2 && i29 > 0 && j17 >= 0 && i29 == 1) {
                    return -12479656;
                }
            } else if (i18 == 5) {
                if (i28 == 1 || z17) {
                    if (i29 <= 0 || i27 < 0 || i19 < 0) {
                        return -8868722;
                    }
                    if (i29 == 1 || i29 == 2) {
                        return -12479656;
                    }
                } else {
                    if (i28 != 2) {
                        int i37 = f(qVar).f287714b;
                        if (i37 > 0) {
                            return ((i37 == 1 || i37 == 2 || i37 == 3) && !qVar.F1) ? -12479656 : -8868722;
                        }
                        return -8868722;
                    }
                    if (i29 > 0 && j17 >= 0 && i29 == 1) {
                        return -12479656;
                    }
                }
            }
            return -8868722;
        }
        return -8868722;
    }

    public static float b(ot0.q qVar, boolean z17, boolean z18) {
        if (qVar == null || qVar.A1 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return 0.3f;
        }
        java.lang.String str = qVar.f430269z1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9 c6253xea7119b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9();
        c6253xea7119b9.f136500g.f89583a = str;
        c6253xea7119b9.e();
        int i17 = c6253xea7119b9.f136501h.f89696a;
        if (i17 == 4 && qVar.A1 == 5) {
            return z18 ? 0.5f : 0.8f;
        }
        if (i17 != 3 && i17 != 2 && i17 != 4) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e17 = e(qVar);
            int i18 = qVar.A1;
            long j17 = e17.f287717e;
            int i19 = e17.f287716d;
            int i27 = e17.f287715c;
            int i28 = e17.f287713a;
            int i29 = e17.f287714b;
            if (i18 == 2 || i18 == 3) {
                if (i28 == 1 || z17) {
                    if (i29 > 0 && i27 >= 0 && i19 >= 0) {
                        if (i29 == 1 || i29 == 2) {
                            return z18 ? 0.5f : 0.8f;
                        }
                    }
                } else if (i28 == 2 && i29 > 0 && j17 >= 0 && i29 == 1) {
                    return z18 ? 0.5f : 0.8f;
                }
            } else if (i18 == 5) {
                if (i28 == 1 || z17) {
                    if (i29 <= 0 || i27 < 0 || i19 < 0) {
                        return 0.3f;
                    }
                    if (i29 == 1 || i29 == 2) {
                        return z18 ? 0.5f : 0.8f;
                    }
                } else {
                    if (i28 != 2) {
                        int i37 = f(qVar).f287714b;
                        if (i37 <= 0) {
                            return 0.3f;
                        }
                        if ((i37 == 1 || i37 == 2 || i37 == 3) && !qVar.F1) {
                            return z18 ? 0.5f : 0.8f;
                        }
                        return 0.3f;
                    }
                    if (i29 > 0 && j17 >= 0 && i29 == 1) {
                        return z18 ? 0.5f : 0.8f;
                    }
                }
            }
            return 0.3f;
        }
        return 0.3f;
    }

    public static int c(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
        }
        java.lang.String str = qVar.f430269z1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9 c6253xea7119b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9();
        c6253xea7119b9.f136500g.f89583a = str;
        c6253xea7119b9.e();
        int i17 = c6253xea7119b9.f136501h.f89696a;
        if (i17 == 4 && qVar.A1 == 5) {
            return qVar.F1 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
        }
        if (i17 == 3 || i17 == 2) {
            return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.bqm : com.p314xaae8f345.mm.R.C30861xcebc809e.ahe;
        }
        if (i17 == 4) {
            return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e17 = e(qVar);
        int i18 = qVar.A1;
        long j17 = e17.f287717e;
        int i19 = e17.f287716d;
        int i27 = e17.f287715c;
        int i28 = e17.f287713a;
        int i29 = e17.f287714b;
        if (i18 == 2 || i18 == 3) {
            if (i28 == 1 || z17) {
                if (i29 <= 0 || i27 < 0 || i19 < 0) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i29 == 1 || i29 == 2) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
                }
                if (i29 == 3 || i29 == 4) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
            } else {
                if (i28 != 2) {
                    return i28 == 3 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i29 <= 0 || j17 < 0) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i29 == 1) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
                }
                if (i29 == 2 || i29 == 3 || i29 == 4) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
            }
        } else if (i18 == 5) {
            if (i28 == 1 || z17) {
                if (i29 <= 0 || i27 < 0 || i19 < 0) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i29 == 1 || i29 == 2) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
                }
                if (i29 == 3 || i29 == 4) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
            } else if (i28 != 2) {
                int i37 = f(qVar).f287714b;
                if (i37 <= 0) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i37 == 1 || i37 == 2 || i37 == 3) {
                    return qVar.F1 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
                }
                if (i37 == 4) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
            } else {
                if (i29 <= 0 || j17 < 0) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
                if (i29 == 1) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562185j : com.p314xaae8f345.mm.R.C30861xcebc809e.f562183h;
                }
                if (i29 == 2 || i29 == 3 || i29 == 4) {
                    return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
                }
            }
        }
        return z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562189k : com.p314xaae8f345.mm.R.C30861xcebc809e.f562184i;
    }

    public static int d(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return com.p314xaae8f345.mm.R.raw.f78727x52120d46;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e17 = e(qVar);
        int i17 = qVar.A1;
        long j17 = e17.f287717e;
        int i18 = e17.f287716d;
        int i19 = e17.f287715c;
        int i27 = e17.f287713a;
        int i28 = e17.f287714b;
        if (i17 == 2 || i17 == 3) {
            if (i27 == 1 || z17) {
                return (i28 <= 0 || i19 < 0 || i18 < 0) ? com.p314xaae8f345.mm.R.raw.f78727x52120d46 : (i28 == 1 || i28 == 2) ? com.p314xaae8f345.mm.R.raw.f78728x3e316a0f : i28 != 3 ? com.p314xaae8f345.mm.R.raw.f78727x52120d46 : com.p314xaae8f345.mm.R.raw.f78726x52101456;
            }
            if (i27 != 2 || i28 <= 0 || j17 < 0) {
                return com.p314xaae8f345.mm.R.raw.f78727x52120d46;
            }
            if (i28 == 1) {
                return com.p314xaae8f345.mm.R.raw.f78728x3e316a0f;
            }
            if (i28 == 2 || i28 == 3) {
                return com.p314xaae8f345.mm.R.raw.f78726x52101456;
            }
        } else if (i17 == 5) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.p314xaae8f345.mm.R.raw.f78727x52120d46;
                }
                if (i28 == 1 || i28 == 2) {
                    return com.p314xaae8f345.mm.R.raw.f78728x3e316a0f;
                }
                if (i28 == 3) {
                    return com.p314xaae8f345.mm.R.raw.f78726x52101456;
                }
            } else {
                if (i27 != 2) {
                    int i29 = f(qVar).f287714b;
                    return i29 > 0 ? ((i29 == 1 || i29 == 2 || i29 == 3) && !qVar.F1) ? com.p314xaae8f345.mm.R.raw.f78728x3e316a0f : com.p314xaae8f345.mm.R.raw.f78727x52120d46 : com.p314xaae8f345.mm.R.raw.f78727x52120d46;
                }
                if (i28 <= 0 || j17 < 0) {
                    return com.p314xaae8f345.mm.R.raw.f78727x52120d46;
                }
                if (i28 == 1) {
                    return com.p314xaae8f345.mm.R.raw.f78728x3e316a0f;
                }
                if (i28 == 2 || i28 == 3) {
                    return com.p314xaae8f345.mm.R.raw.f78726x52101456;
                }
            }
        }
        return com.p314xaae8f345.mm.R.raw.f78727x52120d46;
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e(ot0.q qVar) {
        java.lang.String r17 = c01.z1.r();
        int i17 = qVar.A1;
        if (i17 == 2 || i17 == 3 || i17 == 5) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qVar.D1)) {
                java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
                while (it.hasNext()) {
                    java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                    if (split.length == 4 && split[0].equals(r17)) {
                        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], -1));
                    }
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qVar.E1)) {
                java.util.Iterator it6 = ((java.util.ArrayList) qVar.E1).iterator();
                while (it6.hasNext()) {
                    java.lang.String[] split2 = ((java.lang.String) it6.next()).split(",");
                    if (split2.length == 3 && split2[0].equals(r17)) {
                        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split2[2], -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(split2[1], -1L));
                    }
                }
            }
        }
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1(3);
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 f(ot0.q qVar) {
        int i17 = qVar.A1;
        if ((i17 == 2 || i17 == 3 || i17 == 5) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(qVar.D1)) {
            java.util.Iterator it = ((java.util.ArrayList) qVar.D1).iterator();
            while (it.hasNext()) {
                java.lang.String[] split = ((java.lang.String) it.next()).split(",");
                if (split.length == 4) {
                    return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[2], -1), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[3], -1));
                }
            }
        }
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1(3);
    }

    public static java.lang.String g(ot0.q qVar, boolean z17) {
        if (qVar == null || qVar.A1 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z17 ? qVar.f430217m1 : qVar.f430221n1;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.w1 e17 = e(qVar);
        java.lang.String str = qVar.f430269z1;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9 c6253xea7119b9 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9();
        c6253xea7119b9.f136500g.f89583a = str;
        c6253xea7119b9.e();
        int i17 = qVar.A1;
        long j17 = e17.f287717e;
        int i18 = e17.f287716d;
        int i19 = e17.f287715c;
        int i27 = e17.f287713a;
        int i28 = e17.f287714b;
        if (i17 == 2 || i17 == 3) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571282am);
                }
                if (i28 == 1) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571283an);
                }
                if (i28 == 2) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571280ak, java.lang.Integer.valueOf(i19 - i18));
                }
                if (i28 == 3) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571278ai);
                }
                if (i28 == 4) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571282am);
                }
            } else {
                if (i27 != 2) {
                    return i27 == 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
                if (i28 <= 0 || j17 < 0) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
                if (i28 == 1) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571274ae, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 2) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571273ad, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 3) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571277ah, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 4) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
            }
        } else if (i17 == 5) {
            if (i27 == 1 || z17) {
                if (i28 <= 0 || i19 < 0 || i18 < 0) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571282am);
                }
                if (i28 == 1) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571283an);
                }
                if (i28 == 2) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571281al, java.lang.Integer.valueOf(i18));
                }
                if (i28 == 3) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571278ai);
                }
                if (i28 == 4) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571282am);
                }
            } else if (i27 != 2) {
                int i29 = f(qVar).f287714b;
                if (i29 <= 0) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
                if (i29 == 1 || i29 == 2 || i29 == 3) {
                    return qVar.F1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571279aj);
                }
                if (i29 == 4) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
            } else {
                if (i28 <= 0 || j17 < 0) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
                if (i28 == 1) {
                    return qVar.F1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571275af) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571274ae, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 2) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571273ad, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 3) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571277ah, java.lang.Float.valueOf(((float) j17) / 100.0f));
                }
                if (i28 == 4) {
                    return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571276ag);
                }
            }
        }
        return z17 ? qVar.f430217m1 : qVar.f430221n1;
    }

    public static int h(int i17, int i18, boolean z17) {
        return i17 == 5 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f77942x42215bf : com.p314xaae8f345.mm.R.C30861xcebc809e.f77941xaae5a4ee : i17 == 4 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562616k9 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562607k6 : i17 == 3 ? i18 == 2 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562616k9 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562607k6 : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562613k8 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562606k5 : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562613k8 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562606k5;
    }

    public static java.lang.String i(int i17, int i18, int i19, boolean z17, boolean z18, java.lang.String str, ot0.q qVar, android.widget.TextView textView) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ot0.c cVar = (ot0.c) qVar.y(ot0.c.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CAppMsgUtil", "getC2CLuckyMoneyDescByHbStatus() hbType:%s hbStatus:%s receiveStatus:%s isGroupChat:%s exclusiveRecvUsername: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z18), cVar.f429954n);
        if (i18 == 5) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gji);
        }
        if (i17 == 1) {
            return i18 == 4 ? i19 == 2 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gje) : (i18 == 3 && i19 == 2) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj) : "";
        }
        if (i17 == 0) {
            if (i18 != 4) {
                return (i18 == 3 && !z17 && i19 == 2) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj) : "";
            }
            if (z17) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gje);
            }
            if (z18 && i19 != 2) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gje);
            }
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj);
        }
        if (i17 == 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f429954n)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = cVar.f429954n;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(str2, str);
            if (i18 == 4) {
                return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjh, f17);
            }
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjf, f17);
            if (textView == null) {
                return string + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
            }
            if (textView.getWidth() <= 0) {
                i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 150);
            }
            return string + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f429954n)) {
            return i18 == 4 ? (!z18 || (z17 && i19 == 2)) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gje) : (i18 == 3 && i19 == 2 && !z17) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj) : "";
        }
        tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str3 = cVar.f429954n;
        ((sg3.a) v0Var2).getClass();
        java.lang.String f18 = c01.a2.f(str3, str);
        if (i18 == 4) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjj);
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjf, f18);
        if (textView == null) {
            return string2 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
        }
        if (textView.getWidth() <= 0) {
            i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 150);
        }
        return string2 + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjg);
    }

    public static int j(int i17, int i18, boolean z17) {
        return i17 == 5 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.d6q : com.p314xaae8f345.mm.R.C30861xcebc809e.d6m : i17 == 4 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563493an2 : com.p314xaae8f345.mm.R.C30861xcebc809e.am8 : i17 == 3 ? i18 == 2 ? z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563493an2 : com.p314xaae8f345.mm.R.C30861xcebc809e.am8 : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563492an1 : com.p314xaae8f345.mm.R.C30861xcebc809e.am7 : z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f563492an1 : com.p314xaae8f345.mm.R.C30861xcebc809e.am7;
    }

    public static int k(int i17, int i18, boolean z17) {
        if (i17 == 5 || i17 == 4) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.cap;
        }
        if (i17 == 3 && i18 == 2 && !z17) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.cap;
        }
        return -1;
    }
}
