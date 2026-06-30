package d95;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f309124h = java.util.regex.Pattern.compile("^[\\s]*CREATE[\\s]+TABLE[\\s]*", 2);

    /* renamed from: a, reason: collision with root package name */
    public d95.f f309125a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f309126b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309127c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f309128d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309129e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f309130f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f309131g = false;

    public final void a(d95.f fVar) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7 = fVar.f309211a;
        if (c26948xabb259c7 == null) {
            c26948xabb259c7 = fVar.f309212b;
        }
        com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 m107712x46d43bc4 = c26948xabb259c7.m107712x46d43bc4(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, "SELECT count(*) FROM sqlite_master;", null, null);
        if (!m107712x46d43bc4.moveToFirst()) {
            throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183("Cannot get count for sqlite_master");
        }
        m107712x46d43bc4.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.a.b(java.lang.String, java.lang.String):boolean");
    }

    public final boolean c(java.util.HashMap hashMap, boolean z17, boolean z18) {
        java.lang.String str;
        int i17;
        int i18 = 0;
        if (this.f309125a == null) {
            return false;
        }
        if (hashMap != null) {
            hashMap.size();
        }
        if (z17) {
            this.f309127c = this.f309125a.k() + ".ini";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (hashMap != null) {
                for (d95.c0 c0Var : hashMap.values()) {
                    if (c0Var.a() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBInit", "factory.getSQLs() is null: %s", c0Var.getClass().toString());
                        iz5.a.g("factory.getSQLs() is null:" + c0Var.getClass().toString(), false);
                    }
                    for (java.lang.String str2 : c0Var.a()) {
                        sb6.append(str2.hashCode());
                    }
                }
            }
            str = kk.k.g(sb6.toString().getBytes());
            if (!z18) {
                java.lang.String c17 = new l75.a(this.f309127c).c("createmd5");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17) && str.equals(c17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBInit", "Create table factories not changed , no need create !  %s", this.f309125a.k());
                    return true;
                }
            }
        } else {
            str = "";
        }
        java.lang.String str3 = str;
        this.f309125a.f("pragma auto_vacuum = 0 ");
        fp.j jVar = new fp.j();
        this.f309125a.b();
        if (hashMap != null) {
            java.util.Iterator it = hashMap.values().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.String[] a17 = ((d95.c0) it.next()).a();
                int length = a17.length;
                int i27 = i19;
                int i28 = i18;
                while (i28 < length) {
                    java.lang.String str4 = a17[i28];
                    try {
                        this.f309125a.f(str4);
                        i27++;
                    } catch (java.lang.Exception e17) {
                        java.util.regex.Matcher matcher = f309124h.matcher(str4);
                        if (matcher == null || !matcher.matches()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DBInit", "CreateTable failed:[" + str4 + "][" + e17.getMessage() + "]");
                        } else {
                            iz5.a.g("CreateTable failed:[" + str4 + "][" + e17.getMessage() + "]", false);
                        }
                    }
                    i28++;
                    i18 = 0;
                }
                i19 = i27;
            }
            i17 = i19;
        } else {
            i17 = 0;
        }
        long a18 = jVar.a();
        this.f309125a.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DBInit", "createtables end sql:%d trans:%d sqlCount:%d", java.lang.Long.valueOf(a18), java.lang.Long.valueOf(jVar.a()), java.lang.Integer.valueOf(i17));
        if (!z17) {
            return true;
        }
        new l75.a(this.f309127c).d("createmd5", str3);
        return true;
    }

    public final java.util.List d(java.lang.String str, java.lang.String str2) {
        android.database.Cursor u17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        d95.f fVar = this.f309125a;
        if (fVar == null || (u17 = fVar.u(java.lang.String.format("PRAGMA table_info( %s )", str), null)) == null) {
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int columnIndex = u17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        int columnIndex2 = u17.getColumnIndex("type");
        while (u17.moveToNext()) {
            hashMap.put(u17.getString(columnIndex), u17.getString(columnIndex2));
        }
        u17.close();
        android.database.Cursor u18 = this.f309125a.u(java.lang.String.format("PRAGMA table_info( %s )", str2), null);
        if (u18 == null) {
            return arrayList;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        int columnIndex3 = u18.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        int columnIndex4 = u18.getColumnIndex("type");
        while (u18.moveToNext()) {
            hashMap.put(u18.getString(columnIndex3), u18.getString(columnIndex4));
        }
        u18.close();
        java.util.Iterator it = new java.util.HashSet(hashMap.entrySet()).iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str3 = (java.lang.String) entry.getKey();
            java.lang.String str4 = (java.lang.String) entry.getValue();
            if (str4 != null && str4.length() > 0) {
                java.lang.String str5 = (java.lang.String) hashMap2.get(str3);
                if (str5 == null) {
                    arrayList.add("ALTER TABLE " + str2 + " ADD COLUMN " + str3 + " " + str4 + ";");
                    hashMap.remove(str3);
                } else if (!str4.toLowerCase().startsWith(str5.toLowerCase())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DBInit", "conflicting alter table on column: " + str3 + ", " + str5 + "<o-n>" + str4);
                    hashMap.remove(str3);
                }
            }
        }
        return arrayList;
    }

    public java.lang.String e() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f309130f) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(new l75.a(this.f309130f).c("Reported"))) {
            return "";
        }
        new l75.a(this.f309130f).d("Reported", "true");
        return "";
    }

    public final void f(java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        android.database.Cursor u17 = this.f309125a.u(java.lang.String.format("select * from %s limit 1 ", str), null);
        if (u17.getCount() == 0) {
            u17.close();
            return;
        }
        u17.moveToFirst();
        for (int i17 = 0; i17 < u17.getColumnCount(); i17++) {
            hashSet.add(u17.getColumnName(i17));
        }
        u17.close();
        android.database.Cursor u18 = this.f309125a.u(java.lang.String.format("PRAGMA table_info( %s )", str2), null);
        java.lang.String str3 = "";
        while (u18.moveToNext()) {
            java.lang.String string = u18.getString(u18.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d));
            if (hashSet.contains(string)) {
                str3 = (str3 + string) + ",";
            }
        }
        u18.close();
        java.lang.String substring = str3.substring(0, str3.length() - 1);
        this.f309125a.f("insert into " + str2 + "(" + substring + ") select " + substring + " from " + str + ";");
    }
}
