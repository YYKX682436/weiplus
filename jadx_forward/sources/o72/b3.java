package o72;

/* loaded from: classes9.dex */
public class b3 implements o72.i4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f424843a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f424844b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f424845c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f424846d;

    public b3() {
        this.f424843a = true;
        this.f424844b = true;
        this.f424845c = false;
        this.f424846d = false;
    }

    public boolean a(o72.r2 r2Var, boolean z17, boolean z18) {
        if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err0");
            return false;
        }
        if (z17) {
            int i17 = r2Var.f67657x2262335f;
            if (i17 == 2 || i17 == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "canBeForwardWithMsg isFastSendToChat return false for type: " + i17);
                return false;
            }
            if (z18 && i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "canBeForwardWithMsg isFastSendVideoToChat return false for type: " + i17);
                return false;
            }
        }
        if (r2Var.f67644x3059914a > 0 && !o72.x1.l0(r2Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err1 %s", java.lang.Integer.valueOf(r2Var.f67644x3059914a));
            return false;
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.f67645x88be67a1);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.x(o72.x1.J(r2Var)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "[canBeForwardWithMsg] info.getType = " + r2Var.f67657x2262335f);
        int i18 = r2Var.f67657x2262335f;
        if (i18 != 2) {
            if (i18 != 4) {
                if (i18 != 8) {
                    if (i18 != 14) {
                        if (i18 != 16) {
                            if (i18 != 18) {
                                if (i18 == 24) {
                                    return r2Var.f67640x5ab01132.P == null;
                                }
                            }
                        } else {
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) != 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendFilter", "can not retransmit short video");
                                return false;
                            }
                            if (!r6Var.m()) {
                                return true;
                            }
                        }
                    }
                    if (r2Var.f67643xc8a07680 <= 0 && F != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err2");
                        return false;
                    }
                    r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                    if (bq0Var == null || bq0Var.f452497f.size() <= 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err3 %s", r2Var.f67640x5ab01132);
                        return false;
                    }
                }
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o72.x1.J(r2Var).A) && !r6Var.m()) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg() err4:%s", java.lang.Integer.valueOf(r2Var.f67657x2262335f));
            return false;
        }
        if (!r6Var.m()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg() err4:%s", java.lang.Integer.valueOf(r2Var.f67657x2262335f));
        return false;
    }

    public boolean b(r45.gp0 gp0Var, boolean z17, boolean z18) {
        r45.hp0 hp0Var;
        r45.km6 km6Var;
        if (gp0Var == null) {
            return true;
        }
        if (z17) {
            int i17 = gp0Var.I;
            if (i17 == 2 || i17 == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "filter isFastSendToChat return false for type: " + i17);
                return false;
            }
            if (z18 && i17 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "filter isFastSendToChat return false for type: " + i17);
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", "filter [FavDataItem] dataType = " + gp0Var.I);
        int i18 = gp0Var.I;
        if (i18 != 2) {
            if (i18 == 3) {
                return true;
            }
            if (i18 == 4) {
                if (this.f424845c && this.f424846d) {
                    return false;
                }
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(o72.x1.x(gp0Var));
                java.lang.String str = a17.f294812f;
                if (str != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                    return false;
                }
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.A);
            }
            if (i18 != 7) {
                if (i18 != 8) {
                    if (i18 == 15) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendFilter", "can not retransmit short video");
                            return true;
                        }
                        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(o72.x1.x(gp0Var));
                        java.lang.String str2 = a18.f294812f;
                        if (str2 != null) {
                            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                            if (!str2.equals(l18)) {
                                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                            }
                        }
                        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                        return !(!m18.a() ? false : m18.f294799a.F(m18.f294800b));
                    }
                    if (i18 != 29 && i18 != 32) {
                        if (i18 != 33 || (hp0Var = gp0Var.J1) == null || (km6Var = hp0Var.G) == null) {
                            return false;
                        }
                        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(km6Var.f460372e);
                    }
                }
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.A) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.C) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var.E);
        }
        if (this.f424845c) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(o72.x1.x(gp0Var));
        java.lang.String str3 = a19.f294812f;
        if (str3 != null) {
            java.lang.String l19 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l19)) {
                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l19, a19.f294813g, a19.f294814h);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[filter Data] IMG & FILE, dataFile path = ");
        sb6.append(o72.x1.x(gp0Var));
        sb6.append(", exists = ");
        com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
        sb6.append(!m19.a() ? false : m19.f294799a.F(m19.f294800b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendFilter", sb6.toString());
        return !(com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, m19).a() ? r13.f294799a.F(r13.f294800b) : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        if (r3 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSendFilter", "it can not retransmit short video because of file was replaced. file[%d, %s], data[%d, %s]", java.lang.Long.valueOf(r7), r9, java.lang.Long.valueOf(r10), r4.M);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(z30.v r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.b3.c(z30.v, boolean, boolean):boolean");
    }

    public b3(boolean z17, boolean z18) {
        this.f424843a = true;
        this.f424844b = true;
        this.f424845c = z17;
        this.f424846d = z18;
    }
}
