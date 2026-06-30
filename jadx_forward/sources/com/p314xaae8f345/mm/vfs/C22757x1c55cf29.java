package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem */
/* loaded from: classes12.dex */
final class C22757x1c55cf29 extends com.p314xaae8f345.mm.vfs.k4 implements com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22757x1c55cf29> f39819x681a0c0c = new com.p314xaae8f345.mm.vfs.w3();

    public C22757x1c55cf29(com.p314xaae8f345.mm.vfs.v3 v3Var) {
    }

    @Override // com.p314xaae8f345.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long f(java.util.List list, java.lang.String str, final com.p314xaae8f345.mm.vfs.q2 q2Var, final java.lang.String[] strArr, long j17, android.os.CancellationSignal cancellationSignal, org.json.JSONArray jSONArray) {
        if (list.isEmpty()) {
            return -1L;
        }
        pm5.a aVar = new pm5.a() { // from class: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$b
            @Override // pm5.a
            public final java.lang.Iterable a(java.lang.Object obj) {
                final com.p314xaae8f345.mm.vfs.q2 q2Var2 = com.p314xaae8f345.mm.vfs.q2.this;
                java.lang.Iterable mo82286x32b09e = q2Var2.mo82286x32b09e((java.lang.String) obj);
                if (mo82286x32b09e == null) {
                    mo82286x32b09e = java.util.Collections.emptyList();
                }
                final java.lang.String[] strArr2 = strArr;
                return new pm5.b(mo82286x32b09e, new pm5.a() { // from class: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$c
                    @Override // pm5.a
                    public final java.lang.Iterable a(java.lang.Object obj2) {
                        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj2;
                        if (java.util.Arrays.binarySearch(strArr2, x1Var.f294765b) < 0) {
                            return null;
                        }
                        return new pm5.i(java.util.Collections.singleton(x1Var), com.p314xaae8f345.mm.vfs.e8.p(q2Var2, x1Var.f294764a, false, null));
                    }
                });
            }
        };
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        pm5.c cVar = new pm5.c(list.iterator(), aVar);
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j18 = 0;
        long j19 = 0;
        while (cVar.hasNext()) {
            com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) cVar.next();
            i18++;
            if ((i18 & 15) == 0) {
                cancellationSignal.throwIfCanceled();
            }
            j19 += x1Var.f294767d;
            if (x1Var.f294769f) {
                i19++;
            } else {
                i17++;
                j18 += java.lang.Math.max(0L, currentTimeMillis - x1Var.f294768e);
            }
        }
        long j27 = i17 > 0 ? j18 / i17 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.MigrationStatistics", "Stat >> " + str + ": " + j19 + ", " + i17 + ", " + i19 + ", " + j27);
        if (j19 > j17) {
            try {
                jSONArray.put(new org.json.JSONObject().put("n", str).put("ts", j19).put("f", i17).put("d", i19).put("a", j27));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.MigrationStatistics", e17, "Cannot append report", new java.lang.Object[0]);
            }
        }
        return j19;
    }

    @Override // com.p314xaae8f345.mm.vfs.k4, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        java.util.List subList;
        java.util.List subList2;
        java.util.List b17 = com.p314xaae8f345.mm.vfs.q7.b(false);
        final java.util.HashSet hashSet = new java.util.HashSet();
        final java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            hashSet.add((java.lang.String) pair.first);
            hashSet.add((java.lang.String) pair.second);
            hashSet2.add((java.lang.String) pair.first);
            if (java.util.Objects.equals(pair.first, pair.second) && !"ee1da3ae2100e09165c2e52382cfe79f".equals(pair.first)) {
                i17++;
            }
        }
        cancellationSignal.throwIfCanceled();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        final java.util.ArrayList arrayList4 = new java.util.ArrayList();
        final java.util.TreeMap treeMap = new java.util.TreeMap();
        final java.util.List arrayList5 = new java.util.ArrayList();
        final java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Map c17 = com.p314xaae8f345.mm.vfs.a3.f294314a.c();
        final com.p314xaae8f345.mm.vfs.q2 b18 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${storage}/tencent/MicroMsg").b(c17);
        com.p314xaae8f345.mm.vfs.q2 b19 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${extData}/MicroMsg").b(c17);
        java.lang.Iterable mo82286x32b09e = b18.mo82286x32b09e("");
        if (mo82286x32b09e == null) {
            mo82286x32b09e = java.util.Collections.emptyList();
        }
        final java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9a-f]{32}(temp[0-9]+)?");
        final int i18 = i17;
        int i19 = i17;
        pm5.c cVar = new pm5.c(mo82286x32b09e.iterator(), new pm5.a() { // from class: com.tencent.mm.vfs.MigrationStatistics$MigrationStatisticsFileSystem$$a
            @Override // pm5.a
            public final java.lang.Iterable a(java.lang.Object obj) {
                com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) obj;
                if (!x1Var.f294769f) {
                    return java.util.Collections.singleton(x1Var);
                }
                java.util.regex.Pattern pattern = compile;
                java.lang.String str = x1Var.f294765b;
                java.util.regex.Matcher matcher = pattern.matcher(str);
                if (!matcher.matches()) {
                    if (java.util.Arrays.binarySearch(com.p314xaae8f345.mm.vfs.x3.f294772b, str) < 0) {
                        return null;
                    }
                    return new pm5.i(java.util.Collections.singleton(x1Var), com.p314xaae8f345.mm.vfs.e8.p(b18, x1Var.f294764a, false, null));
                }
                java.lang.String group = matcher.group(1);
                if (group != null && !group.isEmpty()) {
                    arrayList5.add(str);
                    return null;
                }
                if (hashSet.contains(str)) {
                    arrayList3.add(str);
                    if (!hashSet2.contains(str)) {
                        return null;
                    }
                    arrayList4.add(str);
                    return null;
                }
                if (i18 == 0) {
                    arrayList6.add(str);
                    return null;
                }
                treeMap.put(java.lang.Long.valueOf(x1Var.f294768e), str);
                return null;
            }
        });
        int i27 = 0;
        while (cVar.hasNext()) {
            com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) cVar.next();
            i27++;
            if ((i27 & 15) == 0) {
                cancellationSignal.throwIfCanceled();
            }
            long j17 = x1Var.f294767d;
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        java.lang.String e17 = com.p314xaae8f345.mm.vfs.e8.e(b3Var.c(), "account");
        java.lang.String e18 = com.p314xaae8f345.mm.vfs.e8.e(b3Var.c(), "accountSalt");
        if (e17 != null && e18 != null) {
            arrayList3.remove(e17);
            arrayList3.remove(e18);
            arrayList4.remove(e17);
            arrayList.add(e17);
            arrayList.add(e18);
            arrayList2.add(e17);
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList(treeMap.values());
        if (i19 >= arrayList7.size()) {
            subList2 = null;
            subList = null;
        } else {
            subList = arrayList7.subList(0, i19);
            subList2 = arrayList7.subList(i19, arrayList7.size());
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.String[] strArr = com.p314xaae8f345.mm.vfs.x3.f294771a;
        f(arrayList2, "@@Remained_NoSalt_MyAccount_C2C", b19, strArr, 262144L, cancellationSignal, jSONArray);
        f(arrayList4, "@@Remained_NoSalt_KnownAccount_C2C", b19, strArr, 262144L, cancellationSignal, jSONArray);
        f(arrayList, "@@Remained_MyAccount_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
        f(arrayList3, "@@Remained_KnownAccount_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
        if (subList == null) {
            f(arrayList7, "@@Remained_UnknownAccount0_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
        } else {
            f(subList, "@@Remained_UnknownAccount1_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
            f(subList2, "@@Remained_UnknownAccount2_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
        }
        f(arrayList5, "@@Remained_DroppedAccount_C2C", b18, strArr, 262144L, cancellationSignal, jSONArray);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().D("storage_migration_report_items", jSONArray.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this;
    }
}
