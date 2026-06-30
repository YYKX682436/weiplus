package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class h4 extends l75.n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f276534h = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.d4.E, "ContactLabel")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276535d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f276536e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f276537f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f276538g;

    public h4(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.d4.E, "ContactLabel", null);
        this.f276536e = null;
        this.f276537f = null;
        this.f276538g = new java.util.HashMap();
        this.f276535d = k0Var;
        k0Var.A("ContactLabel", "CREATE INDEX IF NOT EXISTS  contact_label_createtime_index ON ContactLabel ( createTime )");
    }

    public static java.lang.String b1(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "genNotifyString() called with: action = [" + str + "], item = [" + d4Var + "]");
        if (d4Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(d4Var);
        return d1(str, arrayList);
    }

    public static java.lang.String d1(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "genNotifyString() called with: action = [" + str + "], ids = [" + list + "]");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(" ");
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) list.get(i17);
            if (d4Var != null) {
                sb6.append(d4Var.f66585x70ce48ca);
                if (i17 < size - 1) {
                    sb6.append(" ");
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "cpan[genNotifyString] event:%s", sb6.toString());
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r11 == null) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList C1(java.lang.String[] r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto Laa
            int r1 = r11.length
            if (r1 > 0) goto L8
            goto Laa
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLabelStrList() called with: labelIds = ["
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            int r1 = r11.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "select * from ContactLabel where labelID in ( "
            r3.<init>(r4)
            r4 = 0
            r5 = r4
        L2a:
            if (r5 >= r1) goto L4e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "'"
            r6.<init>(r7)
            r8 = r11[r5]
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.append(r6)
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L4b
            java.lang.String r6 = ","
            r3.append(r6)
        L4b:
            int r5 = r5 + 1
            goto L2a
        L4e:
            java.lang.String r11 = " )"
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            l75.k0 r1 = r10.f276535d     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L90
            r3 = 2
            android.database.Cursor r11 = r1.f(r11, r0, r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L90
            java.lang.String r1 = "labelName"
            int r1 = r11.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            boolean r3 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            if (r3 == 0) goto L83
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r3.<init>()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
        L6f:
            java.lang.String r5 = r11.getString(r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r3.add(r5)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            boolean r5 = r11.moveToNext()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            if (r5 != 0) goto L6f
            r3.size()     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L89
            r11.close()
            return r3
        L83:
            r11.close()
            goto La3
        L87:
            r0 = move-exception
            goto La4
        L89:
            r1 = move-exception
            goto L92
        L8b:
            r11 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto La4
        L90:
            r1 = move-exception
            r11 = r0
        L92:
            java.lang.String r3 = "cpan[getLabelStrList] exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L87
            r5[r4] = r1     // Catch: java.lang.Throwable -> L87
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r3, r5)     // Catch: java.lang.Throwable -> L87
            if (r11 == 0) goto La3
            goto L83
        La3:
            return r0
        La4:
            if (r11 == 0) goto La9
            r11.close()
        La9:
            throw r0
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.C1(java.lang.String[]):java.util.ArrayList");
    }

    public void D0() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f276536e = null;
        this.f276537f = null;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo9951xb06685ab(com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var, java.lang.String... strArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "delete() called with: item = [" + d4Var + "], keys = [" + strArr + "]");
        return L0(true, d4Var, strArr);
    }

    public java.util.ArrayList K1(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getSearchLabelKey() called with: query = [" + str + "]");
        android.database.Cursor cursor = null;
        java.util.ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                android.database.Cursor D = this.f276535d.D("ContactLabel", new java.lang.String[]{"labelID", "createTime", "isTemporary", "labelName", "labelPYFull", "labelPYShort"}, "labelName like ?", new java.lang.String[]{"%" + str + "%"}, null, null, null, 2);
                try {
                    try {
                        if (D.moveToFirst()) {
                            arrayList = new java.util.ArrayList();
                            do {
                                try {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
                                    d4Var.mo9015xbf5d97fd(D);
                                    arrayList.add(d4Var);
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    cursor = D;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelStorage", "cpan[getLabelIdByStr] exception %s", e.toString());
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return arrayList;
                                }
                            } while (D.moveToNext());
                            arrayList.size();
                            arrayList2 = arrayList;
                        }
                        D.close();
                        return arrayList2;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        cursor = D;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    arrayList = null;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                arrayList = null;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public boolean L0(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var, java.lang.String... strArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "delete() called with: notify = [" + z17 + "], item = [" + d4Var + "], keys = [" + strArr + "]");
        boolean mo9951xb06685ab = super.mo9951xb06685ab(d4Var, strArr);
        if (mo9951xb06685ab && z17) {
            mo145247xf35bbb4(b1("delete", d4Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "cpan[publishUpdateSearchIndexEvent]");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
            c6205xeec13785.f136457g.f87952a = 3000L;
            c6205xeec13785.e();
        }
        D0();
        return mo9951xb06685ab;
    }

    public boolean P0(java.util.List list) {
        long j17;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelStorage", "cpan[deleteList] list is null.");
            return false;
        }
        list.size();
        l75.k0 k0Var = this.f276535d;
        if (k0Var != null) {
            j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "begin deleteList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
        } else {
            j17 = -1;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            L0(false, (com.p314xaae8f345.mm.p2621x8fb0427b.d4) list.get(i17), "labelID");
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
        }
        mo145247xf35bbb4(d1("delete", list));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "cpan[publishUpdateSearchIndexEvent]");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 3000L;
        c6205xeec13785.e();
        return true;
    }

    public java.util.ArrayList P1(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById() called with: id = [" + str + "]");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, -1);
        if (P == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.ContactLabelStorage", "getUserNameListById  failed id:%s", str);
            return null;
        }
        java.util.HashMap hashMap = this.f276538g;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById: containsKey size:%s", java.lang.Integer.valueOf(((java.util.ArrayList) hashMap.get(str)).size()));
            return (java.util.ArrayList) hashMap.get(str);
        }
        y0();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f276537f.get(java.lang.Integer.valueOf(P));
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(arrayList != null ? arrayList.size() : -1);
        objArr[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getUserNameListById time:%s id:%s count:%s stack:%s", objArr);
        return arrayList;
    }

    public boolean S1(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "insert() called with: notify = [" + z17 + "], item = [" + d4Var + "]");
        boolean mo880xb970c2b9 = super.mo880xb970c2b9(d4Var);
        if (mo880xb970c2b9 && z17) {
            mo145247xf35bbb4(b1("insert", d4Var));
        }
        return mo880xb970c2b9;
    }

    public boolean T1(java.util.List list) {
        long j17;
        int ordinal;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] list is null.");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "insertOrUpdateList() called with: list = [" + list + "]");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        l75.k0 k0Var = this.f276535d;
        if (k0Var != null) {
            j17 = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "begin insertOrUpdateList in a transaction, ticket = %d", java.lang.Long.valueOf(j17));
        } else {
            j17 = -1;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) it.next();
            if (d4Var != null && (ordinal = z0(d4Var).ordinal()) != 0) {
                if (ordinal == 1) {
                    b2(false, d4Var, "labelID");
                    arrayList2.add(d4Var);
                } else if (ordinal != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelStorage", "cpan[insertOrUpdateList] unknow result.");
                } else {
                    d4Var.f66583xac3be4e = java.lang.System.currentTimeMillis();
                    S1(false, d4Var);
                    arrayList.add(d4Var);
                }
            }
        }
        if (k0Var != null) {
            k0Var.w(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "end insertOrUpdateList transaction");
        }
        if (arrayList.size() > 0) {
            mo145247xf35bbb4(d1("insert", arrayList));
        }
        if (arrayList2.size() > 0) {
            mo145247xf35bbb4(d1("update", arrayList2));
        }
        D0();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
    
        if (r11 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0101, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fe, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (r11 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean W0(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.W0(java.util.List):boolean");
    }

    @Override // l75.n0, l75.g0
    /* renamed from: X1, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var, java.lang.String... strArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "update() called with: item = [" + d4Var + "], keys = [" + strArr + "]");
        return b2(true, d4Var, strArr);
    }

    public boolean b2(boolean z17, com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var, java.lang.String... strArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "update() called with: notify = [" + z17 + "], item = [" + d4Var + "], keys = [" + strArr + "]");
        java.util.HashMap hashMap = this.f276538g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(d4Var.f66585x70ce48ca);
        sb6.append("");
        hashMap.remove(sb6.toString());
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(d4Var, strArr);
        if (mo9952xce0038c9 && z17) {
            mo145247xf35bbb4(b1("update", d4Var));
        }
        D0();
        return mo9952xce0038c9;
    }

    public boolean d(java.lang.String str) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "delete() called with: labelId = [" + str + "]");
        this.f276538g.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "cpan[delete] labelID:%s", str + "");
        try {
            i17 = this.f276535d.mo70514xb06685ab("ContactLabel", "labelID =? ", new java.lang.String[]{str});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelStorage", "cpan[delete] exception %s", e17.toString());
            i17 = -1;
        }
        return i17 > 0;
    }

    public java.util.ArrayList f1() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor f17 = this.f276535d.f("select * from ContactLabel where isTemporary = 0  order by createTime ASC ", null, 2);
        if (f17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
            d4Var.mo9015xbf5d97fd(f17);
            arrayList.add(d4Var);
        }
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(arrayList.size()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return arrayList;
    }

    public java.util.ArrayList i1() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor f17 = this.f276535d.f("select * from ContactLabel order by createTime ASC ", null, 2);
        if (f17 == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d4();
            d4Var.mo9015xbf5d97fd(f17);
            arrayList.add(d4Var);
        }
        f17.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getAllContactLable time:%s count:%s stack:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(arrayList.size()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return arrayList;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: insert */
    public boolean mo880xb970c2b9(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "insert() called with: item = [" + d4Var + "]");
        return S1(true, d4Var);
    }

    public java.util.ArrayList k1() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor D = this.f276535d.D("ContactLabel", new java.lang.String[]{"labelName"}, null, null, null, null, "createTime ASC ", 2);
        if (D == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (D.moveToNext()) {
            arrayList.add(D.getString(0));
        }
        D.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getAllLabel time:%s count:%s stack:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(arrayList.size()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        r2.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 n1(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getLabelByID() called with: labelID = ["
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.String r5 = "labelID =?"
            java.lang.String[] r6 = new java.lang.String[]{r13}
            r13 = 1
            r0 = 0
            r11 = 0
            l75.k0 r2 = r12.f276535d     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r3 = "ContactLabel"
            r4 = 6
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelID"
            r4[r0] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "createTime"
            r4[r13] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "isTemporary"
            r8 = 2
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelName"
            r8 = 3
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelPYFull"
            r8 = 4
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelPYShort"
            r8 = 5
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r2 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r2 == 0) goto L62
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            if (r3 == 0) goto L62
            com.tencent.mm.storage.d4 r3 = new com.tencent.mm.storage.d4     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r3.mo9015xbf5d97fd(r2)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r2.close()
            return r3
        L60:
            r3 = move-exception
            goto L69
        L62:
            if (r2 == 0) goto L7b
            goto L78
        L65:
            r13 = move-exception
            goto L7e
        L67:
            r3 = move-exception
            r2 = r11
        L69:
            java.lang.String r4 = "cpan[getLabelByID] exception %s"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c
            r13[r0] = r3     // Catch: java.lang.Throwable -> L7c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r4, r13)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L7b
        L78:
            r2.close()
        L7b:
            return r11
        L7c:
            r13 = move-exception
            r11 = r2
        L7e:
            if (r11 == 0) goto L83
            r11.close()
        L83:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.n1(java.lang.String):com.tencent.mm.storage.d4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0062, code lost:
    
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0078, code lost:
    
        r2.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2621x8fb0427b.d4 o1(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getLabelByStr() called with: label = ["
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.String r5 = "labelName =?"
            java.lang.String[] r6 = new java.lang.String[]{r13}
            r13 = 1
            r0 = 0
            r11 = 0
            l75.k0 r2 = r12.f276535d     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r3 = "ContactLabel"
            r4 = 6
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelID"
            r4[r0] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "createTime"
            r4[r13] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "isTemporary"
            r8 = 2
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelName"
            r8 = 3
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelPYFull"
            r8 = 4
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            java.lang.String r7 = "labelPYShort"
            r8 = 5
            r4[r8] = r7     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 2
            android.database.Cursor r2 = r2.D(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            if (r2 == 0) goto L62
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            if (r3 == 0) goto L62
            com.tencent.mm.storage.d4 r3 = new com.tencent.mm.storage.d4     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r3.<init>()     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r3.mo9015xbf5d97fd(r2)     // Catch: java.lang.Exception -> L60 java.lang.Throwable -> L7c
            r2.close()
            return r3
        L60:
            r3 = move-exception
            goto L69
        L62:
            if (r2 == 0) goto L7b
            goto L78
        L65:
            r13 = move-exception
            goto L7e
        L67:
            r3 = move-exception
            r2 = r11
        L69:
            java.lang.String r4 = "cpan[getLabelIdByStr] exception %s"
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7c
            r13[r0] = r3     // Catch: java.lang.Throwable -> L7c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r4, r13)     // Catch: java.lang.Throwable -> L7c
            if (r2 == 0) goto L7b
        L78:
            r2.close()
        L7b:
            return r11
        L7c:
            r13 = move-exception
            r11 = r2
        L7e:
            if (r11 == 0) goto L83
            r11.close()
        L83:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.o1(java.lang.String):com.tencent.mm.storage.d4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0063, code lost:
    
        if (r3 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0065, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007f: MOVE (r12 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String p1(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "labelID"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLabelIdByStr() called with: label = ["
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r6 = "labelName =?"
            java.lang.String[] r7 = new java.lang.String[]{r14}
            r14 = 0
            r1 = 1
            r12 = 0
            l75.k0 r3 = r13.f276535d     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r4 = "ContactLabel"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r5[r14] = r0     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r3 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r3 == 0) goto L63
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            if (r4 == 0) goto L63
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r4 = "cpan[getLabelIdByStr] label id is %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r6.<init>()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r6.append(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r7 = ""
            r6.append(r7)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r5[r14] = r6     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r5)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r3.close()
            return r0
        L61:
            r0 = move-exception
            goto L6d
        L63:
            if (r3 == 0) goto L7d
        L65:
            r3.close()
            goto L7d
        L69:
            r14 = move-exception
            goto L80
        L6b:
            r0 = move-exception
            r3 = r12
        L6d:
            java.lang.String r4 = "cpan[getLabelIdByStr] exception %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7e
            r1[r14] = r0     // Catch: java.lang.Throwable -> L7e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L7d
            goto L65
        L7d:
            return r12
        L7e:
            r14 = move-exception
            r12 = r3
        L80:
            if (r12 == 0) goto L85
            r12.close()
        L85:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.p1(java.lang.String):java.lang.String");
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "replace() called with: item = [" + d4Var + "]");
        this.f276538g.remove(d4Var.f66585x70ce48ca + "");
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(d4Var);
        if (mo11260x413cb2b4) {
            mo145247xf35bbb4(b1("replace", d4Var));
        }
        D0();
        return mo11260x413cb2b4;
    }

    public java.lang.String u1(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = null;
        if (arrayList != null && arrayList.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "getLabelIDList() called with: labelStr = [" + arrayList + "]");
            p75.i0 h17 = dm.g2.f318560n.h(dm.g2.f318561o);
            h17.f434190d = dm.g2.f318562p.l(arrayList).c(dm.g2.f318564r.i(0));
            java.util.List l17 = h17.a().l(this.f276535d);
            if (!((java.util.ArrayList) l17).isEmpty()) {
                arrayList2 = new java.util.ArrayList(l17);
            }
        }
        return b93.n.d(arrayList2);
    }

    public final void y0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "checkCache() called");
        if (this.f276536e == null || this.f276537f == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            p75.n0 n0Var = dm.e2.N1;
            p75.d dVar = dm.e2.X1;
            p75.i0 g17 = n0Var.g(kz5.c0.i(dm.e2.P1, dVar));
            p75.d dVar2 = dm.e2.T1;
            l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
            g17.f434190d = dVar2.g(1, 1).c(new p75.z0(dVar.z()));
            java.util.Iterator it = ((java.util.ArrayList) g17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.z3.class)).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) it.next();
                java.lang.String d17 = z3Var.d1();
                java.lang.String[] split = z3Var.D0().split(",");
                if (split.length > 0) {
                    int[] iArr = new int[split.length];
                    for (int i17 = 0; i17 < split.length; i17++) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[i17], -1);
                        iArr[i17] = P;
                        if (hashMap2.containsKey(java.lang.Integer.valueOf(P))) {
                            ((java.util.ArrayList) hashMap2.get(java.lang.Integer.valueOf(iArr[i17]))).add(d17);
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(d17);
                            hashMap2.put(java.lang.Integer.valueOf(iArr[i17]), arrayList);
                        }
                    }
                    hashMap.put(d17, iArr);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelStorage", "checkRebuildCache time:%s user:%s label:%s stack:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(hashMap.size()), java.lang.Integer.valueOf(hashMap2.size()), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            this.f276536e = hashMap;
            this.f276537f = hashMap2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        return com.p314xaae8f345.mm.p2621x8fb0427b.g4.NOEXISTS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (0 == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2621x8fb0427b.g4 z0(com.p314xaae8f345.mm.p2621x8fb0427b.d4 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "checkEquals() called with: equal = ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkEquals() called with: newItem = ["
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.String r1 = "select * from ContactLabel where labelID=?"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r10.f66585x70ce48ca
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r6 = 0
            l75.k0 r7 = r9.f276535d     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r8 = 2
            android.database.Cursor r6 = r7.f(r1, r4, r8)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            if (r6 == 0) goto L7b
            boolean r1 = r6.moveToFirst()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            if (r1 == 0) goto L7b
            java.lang.String r1 = "labelName"
            int r1 = r6.getColumnIndex(r1)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            if (r1 != 0) goto L52
            goto L53
        L52:
            r5 = r1
        L53:
            java.lang.String r10 = r10.f66586x7661fe9a     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            boolean r10 = r10.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r1.<init>(r0)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r1.append(r10)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r1.append(r2)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            if (r10 == 0) goto L73
            com.tencent.mm.storage.g4 r10 = com.p314xaae8f345.mm.p2621x8fb0427b.g4.EQUAL     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r6.close()
            return r10
        L73:
            com.tencent.mm.storage.g4 r10 = com.p314xaae8f345.mm.p2621x8fb0427b.g4.NOEQUAL     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> L81
            r6.close()
            return r10
        L79:
            r10 = move-exception
            goto L83
        L7b:
            if (r6 == 0) goto L95
        L7d:
            r6.close()
            goto L95
        L81:
            r10 = move-exception
            goto L98
        L83:
            java.lang.String r0 = "cpan[checkEqualsName] exception %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L81
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L81
            r2 = 0
            r1[r2] = r10     // Catch: java.lang.Throwable -> L81
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r0, r1)     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L95
            goto L7d
        L95:
            com.tencent.mm.storage.g4 r10 = com.p314xaae8f345.mm.p2621x8fb0427b.g4.NOEXISTS
            return r10
        L98:
            if (r6 == 0) goto L9d
            r6.close()
        L9d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.z0(com.tencent.mm.storage.d4):com.tencent.mm.storage.g4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0063, code lost:
    
        if (r3 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0065, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007d, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007f: MOVE (r12 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:21:0x007f */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String z1(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "labelName"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLabelStrById() called with: id = ["
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Label.ContactLabelStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            java.lang.String r6 = "labelID =?"
            java.lang.String[] r7 = new java.lang.String[]{r14}
            r14 = 0
            r1 = 1
            r12 = 0
            l75.k0 r3 = r13.f276535d     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            java.lang.String r4 = "ContactLabel"
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r5[r14] = r0     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r3 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6b
            if (r3 == 0) goto L63
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            if (r4 == 0) goto L63
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r4 = "cpan[getLabelStrById] label string is %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r6.<init>()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r6.append(r0)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r7 = ""
            r6.append(r7)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r5[r14] = r6     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r5)     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7e
            r3.close()
            return r0
        L61:
            r0 = move-exception
            goto L6d
        L63:
            if (r3 == 0) goto L7d
        L65:
            r3.close()
            goto L7d
        L69:
            r14 = move-exception
            goto L80
        L6b:
            r0 = move-exception
            r3 = r12
        L6d:
            java.lang.String r4 = "cpan[getLabelStrById] exception %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7e
            r1[r14] = r0     // Catch: java.lang.Throwable -> L7e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L7d
            goto L65
        L7d:
            return r12
        L7e:
            r14 = move-exception
            r12 = r3
        L80:
            if (r12 == 0) goto L85
            r12.close()
        L85:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.h4.z1(java.lang.String):java.lang.String");
    }
}
