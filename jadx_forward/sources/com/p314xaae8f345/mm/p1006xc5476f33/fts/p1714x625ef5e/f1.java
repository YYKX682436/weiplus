package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class f1 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f219061e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f219062f;

    /* renamed from: g, reason: collision with root package name */
    public w13.f f219063g;

    /* renamed from: h, reason: collision with root package name */
    public w13.b f219064h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219065i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f219066m;

    public f1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f219065i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6197x2d9053b9>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$1
            {
                this.f39173x3fe91575 = -1874260055;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6197x2d9053b9 c6197x2d9053b9) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1.this;
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) f1Var.f219061e).b(65596, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d1(f1Var, true));
                return true;
            }
        };
        this.f219066m = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.C15576x38aaa00e(this, a0Var);
    }

    public static java.util.List j(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.f1 f1Var, java.lang.String str) {
        boolean z17;
        int indexOf;
        f1Var.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        objArr[1] = f17.equalsIgnoreCase("zh_CN") ? "zh_CN".toLowerCase() : (f17.equalsIgnoreCase("zh_TW") || f17.equalsIgnoreCase("zh_HK")) ? "zh_TW".toLowerCase() : "en".toLowerCase();
        java.lang.String format = java.lang.String.format("%s/feature_%s.conf", objArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList %s", format);
        long l17 = com.p314xaae8f345.mm.vfs.w6.l(format);
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(format);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (k17 == 0) {
            throw new p13.a0("data file no exist error");
        }
        p13.f fVar = null;
        for (java.lang.String str2 : new java.lang.String(com.p314xaae8f345.mm.vfs.w6.N(format, 0, k17)).split("\n")) {
            if (str2 != null) {
                java.lang.String trim = str2.trim();
                if (trim.length() != 0 && (indexOf = trim.indexOf("=")) >= 0) {
                    java.lang.String substring = trim.substring(0, indexOf);
                    java.lang.String substring2 = trim.substring(indexOf + 1);
                    if (substring.equals("FeatureID")) {
                        if (fVar != null) {
                            fVar.f68147xf1c539e3 = str + "/icon/" + fVar.f68145x818dc9ac + ".png";
                            arrayList.add(fVar);
                        }
                        fVar = new p13.f();
                        fVar.f68145x818dc9ac = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(substring2, 0);
                        fVar.f68149x9de75411 = l17;
                    }
                    if (fVar != null) {
                        if (substring.equals("Title")) {
                            fVar.f68150x29dd02d3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                        } else if (substring.equals("TitlePY")) {
                            fVar.f68151x26a7a41c = substring2;
                        } else if (substring.equals("TitleShortPY")) {
                            fVar.f68152xb2e3b132 = substring2;
                        } else if (substring.equals("Tag")) {
                            fVar.f68148x4b6e82d5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                        } else if (substring.equals("ActionType")) {
                            if (substring2.equals("H5")) {
                                fVar.f68143x2788aaf5 = 2;
                            } else if (substring2.equals("Native")) {
                                fVar.f68143x2788aaf5 = 1;
                            }
                        } else if (substring.equals("Url")) {
                            fVar.f68154x4b6e88aa = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                        } else if (substring.equals("HelpUrl")) {
                            fVar.f68146xa49a5829 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                        } else {
                            if (substring.equals("UpdateUrl")) {
                                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
                                z17 = true;
                                if (!(!yp5.a.f545942a.a())) {
                                    fVar.f68153x266f9ee1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                                }
                            } else {
                                z17 = true;
                                if (substring.equals("AndroidUrl")) {
                                    fVar.f68144xe43f00e5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.p9.e(substring2);
                                }
                            }
                        }
                    }
                }
            }
            z17 = true;
        }
        if (fVar != null) {
            fVar.f68147xf1c539e3 = str + "/icon/" + fVar.f68145x818dc9ac + ".png";
            fVar.f68149x9de75411 = l17;
            arrayList.add(fVar);
        }
        if (arrayList.size() == 0) {
            throw new p13.a0("no data error");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList resultSize:%d", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static com.p314xaae8f345.mm.vfs.r6 k() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(lp0.b.h(), "fts"), "feature");
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "fts_feature");
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        return r6Var2;
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e1 e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e1(this, uVar, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219062f).b(-65536, e1Var);
        return e1Var;
    }

    @Override // o13.w
    /* renamed from: getName */
    public java.lang.String mo9545xfb82e301() {
        return "FTS5SearchFeatureLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Fail!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Success!");
        this.f219061e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218912d;
        this.f219062f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f218913e;
        this.f219063g = (w13.f) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(17);
        this.f219064h = (w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3);
        this.f219065i.mo48813x58998cd();
        this.f219066m.mo48813x58998cd();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) this.f219061e).b(131132, new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.d1(this, false));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f219065i.mo48814x2efc64();
        this.f219066m.mo48814x2efc64();
        this.f219063g = null;
        this.f219064h = null;
        this.f219061e = null;
        this.f219062f = null;
        return true;
    }

    public final int l(com.p314xaae8f345.mm.vfs.r6 r6Var) {
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, "version.info");
        int i17 = 0;
        int i18 = -1;
        try {
            if (r6Var2.m()) {
                i17 = java.lang.Integer.parseInt(com.p314xaae8f345.mm.vfs.w6.M(r6Var2.o()), 10);
                i18 = i17;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "version file %s not exist", r6Var2.o());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchFeatureLogic", e17, "getFeatureVersion", new java.lang.Object[i17]);
        }
        return i18;
    }

    public final boolean m(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("fts/feature/temp");
        com.p314xaae8f345.mm.vfs.w6.f(h07.o());
        com.p314xaae8f345.mm.vfs.w6.u(h07.o());
        try {
            int Q = com.p314xaae8f345.mm.vfs.w6.Q(str, h07.o());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "unzip %s %d", str, java.lang.Integer.valueOf(Q));
            if (Q >= 0) {
                com.p314xaae8f345.mm.vfs.r6 k17 = k();
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(h07, "fts_feature");
                int l17 = l(r6Var);
                int l18 = l(k17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList: updateVersion %d currentVersion %d", java.lang.Integer.valueOf(l17), java.lang.Integer.valueOf(l18));
                if (l17 > l18) {
                    com.p314xaae8f345.mm.vfs.w6.f(k17.o());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList rename ret=%b, currentVersion=%s", java.lang.Boolean.valueOf(r6Var.L(k17)), java.lang.Integer.valueOf(l(k17)));
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTS5SearchFeatureLogic", e17, "updateFeatureList", new java.lang.Object[0]);
        }
        return false;
    }
}
