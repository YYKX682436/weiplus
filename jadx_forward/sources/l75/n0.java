package l75;

/* loaded from: classes4.dex */
public abstract class n0 extends l75.s0 implements l75.g0 {
    private static final java.lang.String TAG = "MicroMsg.SDK.MAutoStorage";

    /* renamed from: db, reason: collision with root package name */
    private final l75.k0 f398494db;

    /* renamed from: dbInfo */
    private final l75.e0 f72764xb02c764c;

    /* renamed from: field_MARK_CURSOR_CHECK_IGNORE */
    public int f72765x4f78ee85 = 1;

    /* renamed from: table */
    private final java.lang.String f72766x6903bce;

    public n0(l75.k0 k0Var, l75.e0 e0Var, java.lang.String str, java.lang.String[] strArr) {
        this.f398494db = k0Var;
        this.f72764xb02c764c = e0Var;
        e0Var.f398486b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e0Var.f398486b) ? "rowid" : e0Var.f398486b;
        this.f72766x6903bce = str;
        if (k0Var == null) {
            return;
        }
        k0Var.A(str, m145250x3fdc6f77(e0Var, str));
        java.util.List<java.lang.String> m145251xdc9c58c4 = m145251xdc9c58c4(e0Var, mo145255x88e404c3(), k0Var);
        for (int i17 = 0; i17 < m145251xdc9c58c4.size(); i17++) {
            if (!this.f398494db.A(this.f72766x6903bce, m145251xdc9c58c4.get(i17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "updateColumnSQLs table failed %s, sql %s", this.f72766x6903bce, m145251xdc9c58c4.get(i17));
            }
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (java.lang.String str2 : strArr) {
            this.f398494db.A(this.f72766x6903bce, str2);
        }
    }

    /* renamed from: getCreateSQLs */
    public static java.lang.String m145250x3fdc6f77(l75.e0 e0Var, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("CREATE TABLE IF NOT EXISTS " + str + " ( ");
        sb6.append(e0Var.f398489e);
        sb6.append(");");
        return sb6.toString();
    }

    /* renamed from: getUpdateSQLs */
    public static java.util.List<java.lang.String> m145251xdc9c58c4(l75.e0 e0Var, java.lang.String str, l75.k0 k0Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (k0Var == null || str == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(k0Var == null);
            objArr[1] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "dk getUpdateSQLs db==null :%b  table:%s", objArr);
            return arrayList;
        }
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( " + str + " )", new java.lang.String[0], 2);
        if (f17 == null) {
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        int columnIndex2 = f17.getColumnIndex("type");
        while (f17.moveToNext()) {
            hashMap.put(f17.getString(columnIndex), f17.getString(columnIndex2));
        }
        f17.close();
        for (java.util.Map.Entry entry : ((java.util.HashMap) e0Var.f398488d).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.lang.String str3 = (java.lang.String) entry.getKey();
            if (str2 != null && str2.length() > 0) {
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                if (str4 == null) {
                    arrayList.add("ALTER TABLE " + str + " ADD COLUMN " + str3 + " " + str2 + ";");
                    hashMap.remove(str3);
                } else if (!str2.toLowerCase().startsWith(str4.toLowerCase())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "conflicting alter table on column: " + str3 + ", " + str4 + "<o-n>" + str2);
                    hashMap.remove(str3);
                }
            }
        }
        return arrayList;
    }

    public static java.lang.StringBuilder n0(android.content.ContentValues contentValues, java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            sb6.append(str + " = ? AND ");
            if (contentValues.get(str) == null) {
                return null;
            }
        }
        sb6.append(" 1=1");
        return sb6;
    }

    public static java.lang.String[] u0(java.lang.String[] strArr, android.content.ContentValues contentValues) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String asString = contentValues.getAsString(strArr[i17]);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (asString == null) {
                asString = "";
            }
            strArr2[i17] = asString;
        }
        return strArr2;
    }

    /* renamed from: delete */
    public boolean mo49766xb06685ab(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e != null && mo9763xeb27878e.size() > 0) {
            if (strArr != null && strArr.length > 0) {
                java.lang.StringBuilder n07 = n0(mo9763xeb27878e, strArr);
                if (n07 == null) {
                    m0("delete failed, check keys failed");
                    return false;
                }
                if (this.f398494db.mo70514xb06685ab(mo145255x88e404c3(), n07.toString(), u0(strArr, mo9763xeb27878e)) > 0 && z17) {
                    mo142179xf35bbb4(mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b), 5, f0Var);
                    return true;
                }
                m0("delete failed");
                return false;
            }
            mo145255x88e404c3();
            l75.k0 k0Var = this.f398494db;
            java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
            java.lang.String str = this.f72764xb02c764c.f398486b + " = ?";
            java.lang.String[] strArr2 = new java.lang.String[1];
            java.lang.String asString = mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (asString == null) {
                asString = "";
            }
            strArr2[0] = asString;
            boolean z19 = k0Var.mo70514xb06685ab(mo145255x88e404c3, str, strArr2) > 0;
            if (z19 && z17) {
                mo142179xf35bbb4(mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b), 5, f0Var);
            }
            return z19;
        }
        m0("delete failed, value.size <= 0");
        return false;
    }

    /* renamed from: deleteNotify */
    public boolean mo60485xc9e4dcd4(long j17, boolean z17) {
        l75.k0 k0Var = this.f398494db;
        java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = k0Var.mo70514xb06685ab(mo145255x88e404c3, "rowid = ?", new java.lang.String[]{sb6.toString()}) > 0;
        if (z18 && z17) {
            mo142179xf35bbb4("*", 5, null);
        }
        return z18;
    }

    /* renamed from: execSQL */
    public boolean m145253xb158737d(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            m0("null or nill table");
            return false;
        }
        if (str2 != null && str2.length() != 0) {
            return this.f398494db.A(str, str2);
        }
        m0("null or nill sql");
        return false;
    }

    public boolean get(long j17, l75.f0 f0Var) {
        android.database.Cursor D = this.f398494db.D(mo145255x88e404c3(), this.f72764xb02c764c.f398487c, "rowid = ?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (D.moveToFirst()) {
            f0Var.mo9015xbf5d97fd(D);
            D.close();
            return true;
        }
        D.close();
        return false;
    }

    /* renamed from: getAll */
    public android.database.Cursor mo78085xb5882a6b() {
        return this.f398494db.E(mo145255x88e404c3(), this.f72764xb02c764c.f398487c, null, null, null, null, null);
    }

    /* renamed from: getCount */
    public int mo78086x7444f759() {
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980("select count(*) from " + mo145255x88e404c3(), new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            return 0;
        }
        m145256x1d3f4980.moveToFirst();
        int i17 = m145256x1d3f4980.getInt(0);
        m145256x1d3f4980.close();
        return i17;
    }

    /* renamed from: getPrimaryKey */
    public java.lang.String m145254xa242f8f3() {
        return this.f72764xb02c764c.f398486b;
    }

    /* renamed from: getTableName */
    public java.lang.String mo145255x88e404c3() {
        return this.f72766x6903bce;
    }

    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        return mo51731x24249762(f0Var, true);
    }

    /* renamed from: insertNotify */
    public boolean mo51731x24249762(l75.f0 f0Var, boolean z17) {
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e == null || mo9763xeb27878e.size() <= 0) {
            m0("insert failed, value.size <= 0");
            return false;
        }
        long l17 = this.f398494db.l(mo145255x88e404c3(), this.f72764xb02c764c.f398486b, mo9763xeb27878e);
        f0Var.f72763xa3c65b86 = l17;
        if (l17 <= 0 && (!(f0Var.mo9766x4c6b483e() instanceof java.lang.Integer) || f0Var.f72763xa3c65b86 != ((java.lang.Integer) f0Var.mo9766x4c6b483e()).intValue())) {
            m0("insert failed");
            return false;
        }
        mo9763xeb27878e.put("rowid", java.lang.Long.valueOf(f0Var.f72763xa3c65b86));
        if (!z17) {
            return true;
        }
        mo142179xf35bbb4(mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b), 2, f0Var);
        return true;
    }

    public final void m0(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, mo145255x88e404c3() + ":" + str);
    }

    /* renamed from: rawQuery */
    public android.database.Cursor m145256x1d3f4980(java.lang.String str, java.lang.String... strArr) {
        return this.f398494db.B(str, strArr);
    }

    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        return mo55864x413cb2b4(f0Var, true);
    }

    public final boolean s0(android.content.ContentValues contentValues) {
        l75.k0 k0Var = this.f398494db;
        java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
        java.lang.String[] strArr = this.f72764xb02c764c.f398487c;
        java.lang.String str = this.f72764xb02c764c.f398486b + " = ?";
        java.lang.String[] strArr2 = new java.lang.String[1];
        java.lang.String asString = contentValues.getAsString(this.f72764xb02c764c.f398486b);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (asString == null) {
            asString = "";
        }
        strArr2[0] = asString;
        android.database.Cursor E = k0Var.E(mo145255x88e404c3, strArr, str, strArr2, null, null, null);
        boolean m145242x39a117a6 = l75.f0.m145242x39a117a6(contentValues, E);
        E.close();
        return m145242x39a117a6;
    }

    /* renamed from: update */
    public int m145257xce0038c9(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return this.f398494db.p(str, contentValues, str2, strArr);
    }

    /* renamed from: updateNotify */
    public boolean mo51732xbf274172(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e == null || mo9763xeb27878e.size() <= 0) {
            m0("update failed, value.size <= 0");
            return false;
        }
        if (strArr != null && strArr.length > 0) {
            java.lang.StringBuilder n07 = n0(mo9763xeb27878e, strArr);
            if (n07 == null) {
                m0("update failed, check keys failed");
                return false;
            }
            if (this.f398494db.p(mo145255x88e404c3(), mo9763xeb27878e, n07.toString(), u0(strArr, mo9763xeb27878e)) <= 0) {
                m0("update failed");
                return false;
            }
            if (z17) {
                mo142179xf35bbb4(mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b), 3, f0Var);
            }
            return true;
        }
        mo145255x88e404c3();
        if (s0(mo9763xeb27878e)) {
            mo145255x88e404c3();
            return true;
        }
        l75.k0 k0Var = this.f398494db;
        java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
        java.lang.String str = this.f72764xb02c764c.f398486b + " = ?";
        java.lang.String[] strArr2 = new java.lang.String[1];
        java.lang.String asString = mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (asString == null) {
            asString = "";
        }
        strArr2[0] = asString;
        boolean z19 = k0Var.p(mo145255x88e404c3, mo9763xeb27878e, str, strArr2) > 0;
        if (z19 && z17) {
            mo142179xf35bbb4(mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b), 3, f0Var);
        }
        return z19;
    }

    /* renamed from: replace */
    public boolean mo55864x413cb2b4(l75.f0 f0Var, boolean z17) {
        iz5.a.g("replace primaryKey == null", !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f72764xb02c764c.f398486b));
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e != null && mo9763xeb27878e.size() == f0Var.mo232x1380a922().f398485a.length + (mo9763xeb27878e.containsKey("rowid") ? 1 : 0)) {
            if (s0(mo9763xeb27878e)) {
                mo145255x88e404c3();
                return true;
            }
            long m17 = this.f398494db.m(mo145255x88e404c3(), this.f72764xb02c764c.f398486b, mo9763xeb27878e);
            f0Var.f72763xa3c65b86 = m17;
            boolean z18 = m17 > 0;
            if (z18 && z17) {
                mo142179xf35bbb4(this.f72764xb02c764c.f398486b, 4, f0Var);
                return true;
            }
            if (!z18) {
                m0("replace failed");
            }
            return z18;
        }
        m0("replace failed, cv.size() != item.fields().length");
        return false;
    }

    /* renamed from: update */
    public boolean m145258xce0038c9(long j17, l75.f0 f0Var, boolean z17) {
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e != null && mo9763xeb27878e.size() > 0) {
            android.database.Cursor E = this.f398494db.E(mo145255x88e404c3(), this.f72764xb02c764c.f398487c, "rowid = ?", new java.lang.String[]{"" + j17}, null, null, null);
            if (l75.f0.m145242x39a117a6(mo9763xeb27878e, E)) {
                E.close();
                mo145255x88e404c3();
                return true;
            }
            E.close();
            l75.k0 k0Var = this.f398494db;
            java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(j17);
            boolean z18 = k0Var.p(mo145255x88e404c3, mo9763xeb27878e, "rowid = ?", new java.lang.String[]{sb6.toString()}) > 0;
            if (z18 && z17) {
                mo142179xf35bbb4("*", 3, f0Var);
            }
            return z18;
        }
        m0("update failed, value.size <= 0");
        return false;
    }

    public boolean get(l75.f0 f0Var, java.lang.String... strArr) {
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        if (mo9763xeb27878e != null && mo9763xeb27878e.size() > 0) {
            if (strArr != null && strArr.length > 0) {
                java.lang.StringBuilder n07 = n0(mo9763xeb27878e, strArr);
                if (n07 == null) {
                    m0("get failed, check keys failed");
                    return false;
                }
                android.database.Cursor D = this.f398494db.D(mo145255x88e404c3(), this.f72764xb02c764c.f398487c, n07.toString(), u0(strArr, mo9763xeb27878e), null, null, null, 2);
                if (D.moveToFirst()) {
                    f0Var.mo9015xbf5d97fd(D);
                    D.close();
                    return true;
                }
                D.close();
                mo145255x88e404c3();
                return false;
            }
            l75.k0 k0Var = this.f398494db;
            java.lang.String mo145255x88e404c3 = mo145255x88e404c3();
            java.lang.String[] strArr2 = this.f72764xb02c764c.f398487c;
            java.lang.String str = this.f72764xb02c764c.f398486b + " = ?";
            java.lang.String[] strArr3 = new java.lang.String[1];
            java.lang.String asString = mo9763xeb27878e.getAsString(this.f72764xb02c764c.f398486b);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (asString == null) {
                asString = "";
            }
            strArr3[0] = asString;
            android.database.Cursor D2 = k0Var.D(mo145255x88e404c3, strArr2, str, strArr3, null, null, null, 2);
            if (D2.moveToFirst()) {
                f0Var.mo9015xbf5d97fd(D2);
                D2.close();
                return true;
            }
            D2.close();
            return false;
        }
        m0("get failed, value.size <= 0");
        return false;
    }

    /* renamed from: update */
    public boolean mo11261xce0038c9(long j17, l75.f0 f0Var) {
        return m145258xce0038c9(j17, f0Var, true);
    }

    /* renamed from: delete */
    public boolean mo9951xb06685ab(l75.f0 f0Var, java.lang.String... strArr) {
        return mo49766xb06685ab(f0Var, true, strArr);
    }

    /* renamed from: update */
    public boolean mo9952xce0038c9(l75.f0 f0Var, java.lang.String... strArr) {
        return mo51732xbf274172(f0Var, true, strArr);
    }

    /* renamed from: delete */
    public int m145252xb06685ab(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        return this.f398494db.mo70514xb06685ab(str, str2, strArr);
    }

    /* renamed from: delete */
    public boolean mo70496xb06685ab(long j17) {
        return mo60485xc9e4dcd4(j17, true);
    }
}
