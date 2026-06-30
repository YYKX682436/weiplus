package t23;

/* loaded from: classes10.dex */
public abstract class f implements t23.n1 {

    /* renamed from: d, reason: collision with root package name */
    public int f496674d = 100;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f496675e = {"camera", "screenshots", "download"};

    /* renamed from: f, reason: collision with root package name */
    public boolean f496676f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f496677g = false;

    public static void f(java.lang.String str, java.lang.String str2, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long g17 = g(str, currentTimeMillis, i17 == 1, true);
        long g18 = g(str2, currentTimeMillis, i17 == 1, false);
        if (g17 <= 0) {
            g17 = g18;
        }
        abstractC15633xee433078.f219968m = g17;
        abstractC15633xee433078.f219970o = g18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    /* JADX WARN: Type inference failed for: r23v3, types: [int] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long g(java.lang.String r35, long r36, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.f.g(java.lang.String, long, boolean, boolean):long");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c(android.database.Cursor cursor, int i17, java.lang.String str) {
        int i18;
        try {
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
            java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow(str));
            java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("date_modified"));
            java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow("datetaken"));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseMediaQuery", "null or nil album name, ignore this folder");
                return null;
            }
            if (!j33.d0.q()) {
                int i19 = cursor.getInt(3);
                if (i19 != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    i18 = i19;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseMediaQuery", "query album failed, " + i19 + ", " + string);
                return null;
            }
            i18 = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(i17, E1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? null : string, null, cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
            f(string3, string4, i17, b17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(string2, i18);
            c15630x7d8d0183.f219953i = b17;
            c15630x7d8d0183.r(cursor.getString(cursor.getColumnIndexOrThrow("bucket_id")));
            c15630x7d8d0183.f219952h = 0;
            c15630x7d8d0183.f219956o = j33.d0.q();
            return c15630x7d8d0183;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseMediaQuery", th6, "#albumConvertFrom failed", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean d(t23.m1 m1Var, java.util.LinkedList linkedList, long j17, boolean z17) {
        if (!this.f496676f) {
            if (z17) {
                this.f496674d = 200;
            } else {
                this.f496674d = 5000;
            }
        }
        if (m1Var == null || linkedList.size() % this.f496674d != 0) {
            return false;
        }
        m1Var.u5(linkedList, j17, z17);
        return true;
    }

    public final void e(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = null;
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next();
            if (!c15630x7d8d0183.f219956o) {
                i17 += c15630x7d8d0183.f219950f;
            }
            if (abstractC15633xee433078 == null) {
                abstractC15633xee433078 = c15630x7d8d0183.f219953i;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183("", i17);
        c15630x7d8d01832.f219954m = true;
        if (abstractC15633xee433078 != null) {
            c15630x7d8d01832.f219953i = abstractC15633xee433078;
        } else {
            c15630x7d8d01832.f219953i = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15631xba892b3b();
        }
        linkedList.add(0, c15630x7d8d01832);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 h(android.database.Cursor cursor, int i17) {
        if (cursor != null && !cursor.isAfterLast() && !cursor.isClosed()) {
            while (!cursor.isAfterLast()) {
                try {
                    if (cursor.getColumnIndexOrThrow("_id") >= 0) {
                        long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
                        java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow("date_modified"));
                        java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("datetaken"));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.a(i17, E1);
                        a17.f219963e = string;
                        f(string2, string3, i17, a17);
                        int i18 = o45.wf.f424556a;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f219963e) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f219966h)) {
                            java.lang.String string4 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string4)) {
                                string4 = "";
                            }
                            a17.f219971p = string4;
                            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("latitude");
                            if (cursor.getType(columnIndexOrThrow) != 0) {
                                double d17 = cursor.getDouble(columnIndexOrThrow);
                                if (i11.b.a(d17)) {
                                    a17.f219973r = d17;
                                }
                            }
                            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("longitude");
                            if (cursor.getType(columnIndexOrThrow2) != 0) {
                                double d18 = cursor.getDouble(columnIndexOrThrow2);
                                if (i11.b.b(d18)) {
                                    a17.f219972q = d18;
                                }
                            }
                            boolean z17 = i17 == 2;
                            if (i() && z17 && (a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b)) {
                                java.lang.String string5 = cursor.getString(cursor.getColumnIndexOrThrow("duration"));
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) a17).E = java.lang.Integer.parseInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string5) ? "-1" : string5);
                            }
                            return a17;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseMediaQuery", "thumb file and original file both not exist");
                        cursor.moveToNext();
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseMediaQuery", th6, "", new java.lang.Object[0]);
                }
            }
            return null;
        }
        return null;
    }

    public abstract boolean i();
}
