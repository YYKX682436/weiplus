package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteQueryBuilder */
/* loaded from: classes12.dex */
public class C26967xf321bfff {
    private static final java.lang.String TAG = "WCDB.SQLiteQueryBuilder";

    /* renamed from: sLimitPattern */
    private static final java.util.regex.Pattern f58328x98d6df68 = java.util.regex.Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");

    /* renamed from: mStrict */
    private boolean f58332x1a418596;

    /* renamed from: mProjectionMap */
    private java.util.Map<java.lang.String, java.lang.String> f58331x33f21520 = null;

    /* renamed from: mTables */
    private java.lang.String f58333x1ae36532 = "";

    /* renamed from: mWhereClause */
    private java.lang.StringBuilder f58334x36c1be89 = null;

    /* renamed from: mDistinct */
    private boolean f58329x3632d689 = false;

    /* renamed from: mFactory */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58330x5d03e3dd = null;

    /* renamed from: appendClause */
    private static void m107816x32a40d29(java.lang.StringBuilder sb6, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        sb6.append(str);
        sb6.append(str2);
    }

    /* renamed from: appendColumns */
    public static void m107817x27970f63(java.lang.StringBuilder sb6, java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String str = strArr[i17];
            if (str != null) {
                if (i17 > 0) {
                    sb6.append(", ");
                }
                sb6.append(str);
            }
        }
        sb6.append(' ');
    }

    /* renamed from: buildQueryString */
    public static java.lang.String m107818xc800dfab(boolean z17, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (android.text.TextUtils.isEmpty(str3) && !android.text.TextUtils.isEmpty(str4)) {
            throw new java.lang.IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        if (!android.text.TextUtils.isEmpty(str6) && !f58328x98d6df68.matcher(str6).matches()) {
            throw new java.lang.IllegalArgumentException("invalid LIMIT clauses:" + str6);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(120);
        sb6.append("SELECT ");
        if (z17) {
            sb6.append("DISTINCT ");
        }
        if (strArr == null || strArr.length == 0) {
            sb6.append("* ");
        } else {
            m107817x27970f63(sb6, strArr);
        }
        sb6.append("FROM ");
        sb6.append(str);
        m107816x32a40d29(sb6, " WHERE ", str2);
        m107816x32a40d29(sb6, " GROUP BY ", str3);
        m107816x32a40d29(sb6, " HAVING ", str4);
        m107816x32a40d29(sb6, " ORDER BY ", str5);
        m107816x32a40d29(sb6, " LIMIT ", str6);
        return sb6.toString();
    }

    /* renamed from: computeProjection */
    private java.lang.String[] m107819x516695e6(java.lang.String[] strArr) {
        int i17 = 0;
        if (strArr == null || strArr.length <= 0) {
            java.util.Map<java.lang.String, java.lang.String> map = this.f58331x33f21520;
            if (map == null) {
                return null;
            }
            java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.String>> entrySet = map.entrySet();
            java.lang.String[] strArr2 = new java.lang.String[entrySet.size()];
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : entrySet) {
                if (!entry.getKey().equals("_count")) {
                    strArr2[i17] = entry.getValue();
                    i17++;
                }
            }
            return strArr2;
        }
        if (this.f58331x33f21520 == null) {
            return strArr;
        }
        java.lang.String[] strArr3 = new java.lang.String[strArr.length];
        int length = strArr.length;
        while (i17 < length) {
            java.lang.String str = strArr[i17];
            java.lang.String str2 = this.f58331x33f21520.get(str);
            if (str2 != null) {
                strArr3[i17] = str2;
            } else {
                if (this.f58332x1a418596 || !(str.contains(" AS ") || str.contains(" as "))) {
                    throw new java.lang.IllegalArgumentException("Invalid column " + strArr[i17]);
                }
                strArr3[i17] = str;
            }
            i17++;
        }
        return strArr3;
    }

    /* renamed from: validateQuerySql */
    private void m107820x7d521f1c(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        c26948xabb259c7.m107686x3b27c976().m107861xed060d07(str, c26948xabb259c7.m107685x1472aee8(true), c26987xeef691ab, null);
    }

    /* renamed from: appendWhere */
    public void m107821x8f1d5ded(java.lang.CharSequence charSequence) {
        if (this.f58334x36c1be89 == null) {
            this.f58334x36c1be89 = new java.lang.StringBuilder(charSequence.length() + 16);
        }
        if (this.f58334x36c1be89.length() == 0) {
            this.f58334x36c1be89.append('(');
        }
        this.f58334x36c1be89.append(charSequence);
    }

    /* renamed from: appendWhereEscapeString */
    public void m107822xb5ccde7f(java.lang.String str) {
        if (this.f58334x36c1be89 == null) {
            this.f58334x36c1be89 = new java.lang.StringBuilder(str.length() + 16);
        }
        if (this.f58334x36c1be89.length() == 0) {
            this.f58334x36c1be89.append('(');
        }
        com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106224x939975f6(this.f58334x36c1be89, str);
    }

    /* renamed from: buildQuery */
    public java.lang.String m107823xe33136fa(java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String[] m107819x516695e6 = m107819x516695e6(strArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = this.f58334x36c1be89;
        boolean z17 = sb7 != null && sb7.length() > 0;
        if (z17) {
            sb6.append(this.f58334x36c1be89.toString());
            sb6.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z17) {
                sb6.append(" AND ");
            }
            sb6.append('(');
            sb6.append(str);
            sb6.append(')');
        }
        return m107818xc800dfab(this.f58329x3632d689, this.f58333x1ae36532, m107819x516695e6, sb6.toString(), str2, str3, str4, str5);
    }

    /* renamed from: buildUnionQuery */
    public java.lang.String m107825xf9bbac47(java.lang.String[] strArr, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        int length = strArr.length;
        java.lang.String str3 = this.f58329x3632d689 ? " UNION " : " UNION ALL ";
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 > 0) {
                sb6.append(str3);
            }
            sb6.append(strArr[i17]);
        }
        m107816x32a40d29(sb6, " ORDER BY ", str);
        m107816x32a40d29(sb6, " LIMIT ", str2);
        return sb6.toString();
    }

    /* renamed from: buildUnionSubQuery */
    public java.lang.String m107826x7f879a89(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i18 = 0; i18 < length; i18++) {
            java.lang.String str6 = strArr[i18];
            if (str6.equals(str)) {
                strArr2[i18] = "'" + str2 + "' AS " + str;
            } else if (i18 > i17 && !set.contains(str6)) {
                strArr2[i18] = "NULL AS ".concat(str6);
            } else {
                strArr2[i18] = str6;
            }
        }
        return m107823xe33136fa(strArr2, str3, str4, str5, null, null);
    }

    /* renamed from: getTables */
    public java.lang.String m107828x308e615b() {
        return this.f58333x1ae36532;
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107829x66f18c8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return m107831x66f18c8(c26948xabb259c7, strArr, str, strArr2, str2, str3, str4, null, null);
    }

    /* renamed from: setCursorFactory */
    public void m107832xc9fd8b92(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory) {
        this.f58330x5d03e3dd = cursorFactory;
    }

    /* renamed from: setDistinct */
    public void m107833x87c7cd7e(boolean z17) {
        this.f58329x3632d689 = z17;
    }

    /* renamed from: setProjectionMap */
    public void m107834x291a2f4b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.f58331x33f21520 = map;
    }

    /* renamed from: setStrict */
    public void m107835x2321b5cb(boolean z17) {
        this.f58332x1a418596 = z17;
    }

    /* renamed from: setTables */
    public void m107836x23c39567(java.lang.String str) {
        this.f58333x1ae36532 = str;
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107830x66f18c8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return m107831x66f18c8(c26948xabb259c7, strArr, str, strArr2, str2, str3, str4, str5, null);
    }

    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107831x66f18c8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        if (this.f58333x1ae36532 == null) {
            return null;
        }
        if (this.f58332x1a418596 && str != null && str.length() > 0) {
            m107820x7d521f1c(c26948xabb259c7, m107823xe33136fa(strArr, "(" + str + ")", str2, str3, str4, str5), c26987xeef691ab);
        }
        java.lang.String m107823xe33136fa = m107823xe33136fa(strArr, str, str2, str3, str4, str5);
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.d(TAG, "Performing query: " + m107823xe33136fa);
        return c26948xabb259c7.m107713x46d43bc4(this.f58330x5d03e3dd, m107823xe33136fa, strArr2, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.m107624x9e9b9e2b(this.f58333x1ae36532), c26987xeef691ab);
    }

    @java.lang.Deprecated
    /* renamed from: buildUnionSubQuery */
    public java.lang.String m107827x7f879a89(java.lang.String str, java.lang.String[] strArr, java.util.Set<java.lang.String> set, int i17, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr2, java.lang.String str4, java.lang.String str5) {
        return m107826x7f879a89(str, strArr, set, i17, str2, str3, str4, str5);
    }

    @java.lang.Deprecated
    /* renamed from: buildQuery */
    public java.lang.String m107824xe33136fa(java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return m107823xe33136fa(strArr, str, str2, str3, str4, str5);
    }
}
