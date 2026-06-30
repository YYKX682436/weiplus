package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class s3 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f172353d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f172354e;

    static {
        int i17 = wo.w0.q() ? 2 : 1;
        f172353d = i17;
        f172354e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.R, "WxaPkgV8SnapshotInfoV3")};
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "<cinit>, ARCH: " + i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.R, "WxaPkgV8SnapshotInfoV3", dm.zc.f323139w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.r3(db6, this));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final boolean y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3 s3Var, l75.k0 k0Var) {
        java.util.Collection<dm.yc> collection;
        boolean z17;
        s3Var.getClass();
        android.database.Cursor B = k0Var.B("SELECT * FROM WxaPkgV8SnapshotInfoV2", null);
        ?? r07 = kz5.p0.f395529d;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    r07 = new java.util.ArrayList();
                    do {
                        dm.yc ycVar = new dm.yc();
                        ycVar.mo9015xbf5d97fd(B);
                        r07.add(ycVar);
                    } while (B.moveToNext());
                }
                vz5.b.a(B, null);
                collection = r07;
            } finally {
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "convertV2List, cursor is null");
            collection = r07;
        }
        if (!collection.isEmpty()) {
            for (dm.yc v27 : collection) {
                java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.Q;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v27, "v2");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
                q3Var.f69481x2259747b = v27.f69269x2259747b;
                q3Var.f69493xd1cec4cd = v27.f69281xd1cec4cd;
                q3Var.f69494x680b2eb6 = v27.f69282x680b2eb6;
                q3Var.f69495xf173fca7 = v27.f69283xf173fca7;
                q3Var.f69487x955d8787 = v27.f69275x955d8787;
                q3Var.f69492xd4a3db2e = v27.f69279xd4a3db2e;
                q3Var.f69488x70346188 = v27.f69276x70346188;
                q3Var.f69489x347c13af = v27.f69277x347c13af;
                q3Var.f69486x1a7ea1bc = v27.f69271x5c93fda1;
                q3Var.f69490x777c2edc = v27.f69278x777c2edc;
                z17 = false;
                q3Var.f69483x609f3215 = false;
                q3Var.f69491x937c602d = null;
                q3Var.f69484xa9348ff3 = v27.f69273xa9348ff3;
                q3Var.f69482xfa9bc557 = v27.f69270xfa9bc557;
                q3Var.f69485x80a1a130 = v27.f69274x80a1a130;
                if (!s3Var.J0(q3Var)) {
                    break;
                }
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "migrateTableV2, success: " + z17);
        return z17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 D0(java.lang.String wxaPkgPath, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaPkgPath, "wxaPkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, wxaPkgPath: " + wxaPkgPath + ", category: " + category);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
        q3Var.f69481x2259747b = f172353d;
        q3Var.f69494x680b2eb6 = wxaPkgPath;
        q3Var.f69487x955d8787 = category.f172308d;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.Q;
        if (mo9951xb06685ab(q3Var, (java.lang.String[]) java.util.Arrays.copyOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.Q, 3))) {
            return q3Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "deleteByWxaPkgPath, delete failure");
        return null;
    }

    public final boolean J0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 dao) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dao, "dao");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, wxaPkgPath: " + dao.f69494x680b2eb6 + ", category: " + dao.f69487x955d8787);
        boolean mo11260x413cb2b4 = mo11260x413cb2b4(dao);
        if (!mo11260x413cb2b4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "insertOrReplace, replace failure");
        }
        return mo11260x413cb2b4;
    }

    public final java.util.List L0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByBelowVersionAllArch, version: " + i17);
        return z0(m145256x1d3f4980("SELECT * FROM WxaPkgV8SnapshotInfoV3 WHERE wxaPkgVersion < ?", java.lang.String.valueOf(i17)));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 P0(java.lang.String wxaPkgPath, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaPkgPath, "wxaPkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, wxaPkgPath: " + wxaPkgPath + ", category: " + category);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
        q3Var.f69481x2259747b = f172353d;
        q3Var.f69494x680b2eb6 = wxaPkgPath;
        q3Var.f69487x955d8787 = category.f172308d;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.Q;
        if (get(q3Var, (java.lang.String[]) java.util.Arrays.copyOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3.Q, 3))) {
            return q3Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "selectByWxaPkgPath, get failure");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public final java.util.List z0(android.database.Cursor cursor) {
        java.util.List list;
        ?? r07 = kz5.p0.f395529d;
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    r07 = new java.util.ArrayList();
                    do {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q3();
                        q3Var.mo9015xbf5d97fd(cursor);
                        r07.add(q3Var);
                    } while (cursor.moveToNext());
                }
                vz5.b.a(cursor, null);
                list = r07;
            } finally {
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfoStorage", "convertList, cursor is null");
            list = r07;
        }
        return list;
    }
}
