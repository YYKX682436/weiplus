package n4;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f416408a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f416409b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f416410c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f416411d;

    public g(java.lang.String str, java.util.Map map, java.util.Set set, java.util.Set set2) {
        this.f416408a = str;
        this.f416409b = java.util.Collections.unmodifiableMap(map);
        this.f416410c = java.util.Collections.unmodifiableSet(set);
        this.f416411d = set2 == null ? null : java.util.Collections.unmodifiableSet(set2);
    }

    public static n4.g a(p4.b bVar, java.lang.String str) {
        int i17;
        int i18;
        java.util.List list;
        int i19;
        q4.c cVar = (q4.c) bVar;
        android.database.Cursor f17 = cVar.f("PRAGMA table_info(`" + str + "`)");
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (f17.getColumnCount() > 0) {
                int columnIndex = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                int columnIndex2 = f17.getColumnIndex("type");
                int columnIndex3 = f17.getColumnIndex("notnull");
                int columnIndex4 = f17.getColumnIndex("pk");
                int columnIndex5 = f17.getColumnIndex("dflt_value");
                while (f17.moveToNext()) {
                    java.lang.String string = f17.getString(columnIndex);
                    hashMap.put(string, new n4.c(string, f17.getString(columnIndex2), f17.getInt(columnIndex3) != 0, f17.getInt(columnIndex4), f17.getString(columnIndex5), 2));
                }
            }
            f17.close();
            java.util.HashSet hashSet = new java.util.HashSet();
            f17 = cVar.f("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = f17.getColumnIndex(dm.i4.f66865x76d1ec5a);
                int columnIndex7 = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb);
                int columnIndex8 = f17.getColumnIndex("table");
                int columnIndex9 = f17.getColumnIndex("on_delete");
                int columnIndex10 = f17.getColumnIndex("on_update");
                java.util.List b17 = b(f17);
                int count = f17.getCount();
                int i27 = 0;
                while (i27 < count) {
                    f17.moveToPosition(i27);
                    if (f17.getInt(columnIndex7) != 0) {
                        i17 = columnIndex6;
                        i18 = columnIndex7;
                        list = b17;
                        i19 = count;
                    } else {
                        int i28 = f17.getInt(columnIndex6);
                        i17 = columnIndex6;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        i18 = columnIndex7;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
                        while (it.hasNext()) {
                            java.util.List list2 = b17;
                            n4.e eVar = (n4.e) it.next();
                            int i29 = count;
                            if (eVar.f416401d == i28) {
                                arrayList.add(eVar.f416403f);
                                arrayList2.add(eVar.f416404g);
                            }
                            b17 = list2;
                            count = i29;
                        }
                        list = b17;
                        i19 = count;
                        hashSet.add(new n4.d(f17.getString(columnIndex8), f17.getString(columnIndex9), f17.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i27++;
                    columnIndex6 = i17;
                    columnIndex7 = i18;
                    b17 = list;
                    count = i19;
                }
                f17.close();
                f17 = cVar.f("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    int columnIndex12 = f17.getColumnIndex(ya.b.f77495x8b74a326);
                    int columnIndex13 = f17.getColumnIndex("unique");
                    java.util.HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        java.util.HashSet hashSet3 = new java.util.HashSet();
                        while (f17.moveToNext()) {
                            if ("c".equals(f17.getString(columnIndex12))) {
                                n4.f c17 = c(cVar, f17.getString(columnIndex11), f17.getInt(columnIndex13) == 1);
                                if (c17 != null) {
                                    hashSet3.add(c17);
                                }
                            }
                        }
                        f17.close();
                        hashSet2 = hashSet3;
                        return new n4.g(str, hashMap, hashSet, hashSet2);
                    }
                    return new n4.g(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static java.util.List b(android.database.Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(dm.i4.f66865x76d1ec5a);
        int columnIndex2 = cursor.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < count; i17++) {
            cursor.moveToPosition(i17);
            arrayList.add(new n4.e(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public static n4.f c(p4.b bVar, java.lang.String str, boolean z17) {
        android.database.Cursor f17 = ((q4.c) bVar).f("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = f17.getColumnIndex("seqno");
            int columnIndex2 = f17.getColumnIndex("cid");
            int columnIndex3 = f17.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                java.util.TreeMap treeMap = new java.util.TreeMap();
                while (f17.moveToNext()) {
                    if (f17.getInt(columnIndex2) >= 0) {
                        treeMap.put(java.lang.Integer.valueOf(f17.getInt(columnIndex)), f17.getString(columnIndex3));
                    }
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new n4.f(str, z17, arrayList);
            }
            f17.close();
            return null;
        } finally {
            f17.close();
        }
    }

    /* renamed from: equals */
    public boolean m149084xb2c87fbf(java.lang.Object obj) {
        java.util.Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || n4.g.class != obj.getClass()) {
            return false;
        }
        n4.g gVar = (n4.g) obj;
        java.lang.String str = gVar.f416408a;
        java.lang.String str2 = this.f416408a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        java.util.Map map = gVar.f416409b;
        java.util.Map map2 = this.f416409b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        java.util.Set set2 = gVar.f416410c;
        java.util.Set set3 = this.f416410c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        java.util.Set set4 = this.f416411d;
        if (set4 == null || (set = gVar.f416411d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    /* renamed from: hashCode */
    public int m149085x8cdac1b() {
        java.lang.String str = this.f416408a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.util.Map map = this.f416409b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        java.util.Set set = this.f416410c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m149086x9616526c() {
        return "TableInfo{name='" + this.f416408a + "', columns=" + this.f416409b + ", foreignKeys=" + this.f416410c + ", indices=" + this.f416411d + '}';
    }
}
