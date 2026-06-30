package com.p314xaae8f345.mm.vfs;

@j95.b
/* loaded from: classes12.dex */
public final class h7 extends i95.w {
    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        java.util.Set set;
        java.util.Set set2;
        java.util.Set set3;
        java.util.Set set4;
        java.util.Set set5;
        java.lang.String group;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f274265a = com.p314xaae8f345.mm.vfs.g7.f294496a;
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        b3Var.getClass();
        com.p314xaae8f345.mm.vfs.t2 t2Var = new com.p314xaae8f345.mm.vfs.t2(b3Var, true);
        java.util.List b17 = com.p314xaae8f345.mm.vfs.q7.b(false);
        java.lang.String e17 = com.p314xaae8f345.mm.vfs.e8.e(b3Var.c(), "account");
        java.lang.String e18 = com.p314xaae8f345.mm.vfs.e8.e(b3Var.c(), "accountSalt");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (((java.lang.String) pair.first).equals(e17) || ((java.lang.String) pair.first).equals("ee1da3ae2100e09165c2e52382cfe79f") || ((java.lang.String) pair.first).equals(e18) || ((java.lang.String) pair.second).equals(e18)) {
                it.remove();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VFSStrategy", " * Other account pair: %s / %s", pair.first, pair.second);
            }
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i17 = 0; i17 < size; i17++) {
                android.util.Pair pair2 = (android.util.Pair) arrayList.get(i17);
                strArr[i17] = ((java.lang.String) pair2.first) + '|' + ((java.lang.String) pair2.second) + '|' + ((java.lang.String) pair2.second);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" * Other account env: ");
                sb6.append(strArr[i17]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VFSStrategy", sb6.toString());
            }
            t2Var.f294712a.f294647e.put("accountOtherList", strArr);
            t2Var.f294713b = true;
        }
        com.p314xaae8f345.mm.vfs.a0[] a0VarArr = new com.p314xaae8f345.mm.vfs.a0[16];
        for (int i18 = 0; i18 < 16; i18++) {
            a0VarArr[i18] = new com.p314xaae8f345.mm.vfs.C22744x8a210741(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662(com.p314xaae8f345.mm.vfs.w.f294752a[i18]));
        }
        t2Var.c("@CleanRubbish", new com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c(a0VarArr));
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9a-f]{32}(temp[0-9]+)?");
        try {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${sdFrom}/MicroMsg").b(com.p314xaae8f345.mm.vfs.a3.f294314a.c()).mo82286x32b09e("");
            if (mo82286x32b09e == null) {
                mo82286x32b09e = java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : mo82286x32b09e) {
                boolean z17 = x1Var.f294769f;
                java.lang.String str = x1Var.f294765b;
                if (z17) {
                    java.util.regex.Matcher matcher = compile.matcher(str);
                    if (matcher.matches() && (((group = matcher.group(1)) != null && !group.isEmpty()) || com.p314xaae8f345.mm.vfs.q7.f294676c)) {
                        arrayList2.add(new com.p314xaae8f345.mm.vfs.C22744x8a210741(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${sdFrom}/MicroMsg/" + str)));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                t2Var.c("@CleanAbandon", new com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c(arrayList2));
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.CleanRubbish", e19, "Failed installing wild account cleaner", new java.lang.Object[0]);
        }
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("old_org\\.chromium\\.android_webview_[0-9]+");
        try {
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e2 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${dataCache}").b(com.p314xaae8f345.mm.vfs.a3.f294314a.c()).mo82286x32b09e("");
            if (mo82286x32b09e2 == null) {
                mo82286x32b09e2 = java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : mo82286x32b09e2) {
                boolean z18 = x1Var2.f294769f;
                java.lang.String str2 = x1Var2.f294765b;
                if (z18 && compile2.matcher(str2).matches()) {
                    arrayList3.add(new com.p314xaae8f345.mm.vfs.C22744x8a210741(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${dataCache}/" + str2)));
                }
            }
            if (!arrayList3.isEmpty()) {
                t2Var.c("@CleanOldWebViewCache", new com.p314xaae8f345.mm.vfs.C22752x2dbf4b4c(arrayList3));
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.CleanRubbish", e27, "Failed installing old WebView cache cleaner", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.vfs.C22760xc8958b72 c22760xc8958b72 = new com.p314xaae8f345.mm.vfs.C22760xc8958b72(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${dataCache}"));
        c22760xc8958b72.a("@QQMusicCacheClean", new com.p314xaae8f345.mm.vfs.p4());
        t2Var.c("@QQMusicCacheClean", c22760xc8958b72);
        t2Var.c("@ApkClean", new com.p314xaae8f345.mm.vfs.C22737x493c71f3(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${sdTo}/MicroMsg")));
        synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
            set = com.p314xaae8f345.mm.vfs.c1.f294386l;
            set2 = com.p314xaae8f345.mm.vfs.c1.f294387m;
            set3 = com.p314xaae8f345.mm.vfs.c1.f294389o;
            set4 = com.p314xaae8f345.mm.vfs.c1.f294388n;
            set5 = com.p314xaae8f345.mm.vfs.c1.f294390p;
            set3.addAll(java.util.Arrays.asList(".vfs", "MicroMsg", "cache", "files", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428, "code_cache"));
            com.p314xaae8f345.mm.vfs.c1.f294386l = java.util.Collections.unmodifiableSet(set);
            com.p314xaae8f345.mm.vfs.c1.f294387m = java.util.Collections.unmodifiableSet(set2);
            com.p314xaae8f345.mm.vfs.c1.f294389o = java.util.Collections.unmodifiableSet(set3);
            com.p314xaae8f345.mm.vfs.c1.f294388n = java.util.Collections.unmodifiableSet(set4);
            com.p314xaae8f345.mm.vfs.c1.f294390p = java.util.Collections.unmodifiableSet(set5);
            com.p314xaae8f345.mm.vfs.c1.f294385k = java.util.Collections.unmodifiableSet(com.p314xaae8f345.mm.vfs.c1.f294385k);
        }
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-NonAccountSdcard-", 10, new java.lang.String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, set, false, true);
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-AccountSdcard-", 11, new java.lang.String[]{"${sdFrom}/MicroMsg/${account}", "${sdTo}/MicroMsg/${account}", "${sdToCache}/${account}", "${sdFrom}/MicroMsg/${accountSalt}", "${sdTo}/MicroMsg/${accountSalt}", "${sdToCache}/${accountSalt}"}, set2, false, true);
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-NonAccountData-", 7, new java.lang.String[]{"${data}", "${dataCache}", "${data}/MicroMsg"}, set3, false, true);
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-FilesData-", 7, new java.lang.String[]{"${data}/files"}, set5, false, true);
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-AccountData-", 8, new java.lang.String[]{"${data}/MicroMsg/${account}", "${dataCache}/${account}"}, set4, false, false);
        java.util.Map c17 = com.p314xaae8f345.mm.vfs.a3.f294314a.c();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Object e28 = com.p314xaae8f345.mm.vfs.e8.e(c17, "account");
        if (e28 instanceof java.lang.String) {
            hashSet.add(e28);
        } else if (e28 instanceof java.lang.String[]) {
            hashSet.addAll(java.util.Arrays.asList((java.lang.String[]) e28));
        }
        java.lang.Object e29 = com.p314xaae8f345.mm.vfs.e8.e(c17, "accountSalt");
        if (e29 instanceof java.lang.String) {
            hashSet.add(e29);
        } else if (e29 instanceof java.lang.String[]) {
            hashSet.addAll(java.util.Arrays.asList((java.lang.String[]) e29));
        }
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-OtherAccountSdcard-", 5, new java.lang.String[]{"${sdFrom}/MicroMsg", "${sdTo}/MicroMsg", "${sdToCache}"}, hashSet, true, false);
        com.p314xaae8f345.mm.vfs.c1.e(t2Var, "@DiskSpace-OtherAccountData-", 9, new java.lang.String[]{"${data}/MicroMsg"}, hashSet, true, false);
        t2Var.c("@MigrationStatistics", new com.p314xaae8f345.mm.vfs.C22757x1c55cf29(null));
        t2Var.a(t2Var.f294715d.C);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(new com.p314xaae8f345.mm.vfs.z7(null, null, new java.io.File(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir(), "vfs-statistics").getPath(), null, null).m82499x9616526c()));
            if (jSONObject.optInt("version") != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.DiskFileStatistics", "Mismatched file version: " + jSONObject.optInt("version"));
            } else {
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("content");
                int length = jSONArray.length();
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i19 = 0; i19 < length; i19++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                    java.lang.String string = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    java.lang.String string2 = jSONObject2.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    hashMap.put(string2 + '|' + string, new com.p314xaae8f345.mm.vfs.a1(string, jSONObject2.getInt("type"), jSONObject2.getInt("flags"), string2, jSONObject2.getLong("totalSize"), jSONObject2.getInt("fileCount"), jSONObject2.getInt("dirCount"), jSONObject2.getInt("maxDepth"), jSONObject2.getLong("maxFileSize"), jSONObject2.getLong("filesAge"), jSONObject2.optLong("targetSize"), jSONObject2.optLong("expireTime")));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Loaded statistics, count: " + hashMap.size());
                synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
                    com.p314xaae8f345.mm.vfs.c1.f294382h = hashMap;
                    com.p314xaae8f345.mm.vfs.c1.f294384j = true;
                }
            }
        } catch (java.io.IOException | org.json.JSONException e37) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.DiskFileStatistics", e37, "Unable to load statistics", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.u0("XWalk", 13, 0, "${data}/app_xwalk_*"));
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.v0("TBSEngine", 13, 0, "${data}/app_tbs_*"));
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.w0("WebViewData", 13, 0, "${data}/app_webview_com_tencent_mm*"));
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.x0("WebViewDataCache", 13, 0, "${dataCache}/webview_com_tencent_mm*"));
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.y0("WeiXin External", 0, 0, "${sdFrom}/MicroMsg/WeiXin"));
        com.p314xaae8f345.mm.vfs.c1.i(new com.p314xaae8f345.mm.vfs.z0("@DiskSpace-NonAccountData-${data}-MISC", 7, 0, "${data}/*"));
        com.p314xaae8f345.mm.vfs.p3 p3Var = com.p314xaae8f345.mm.vfs.p3.f294657b;
        com.p314xaae8f345.mm.vfs.x2 x2Var = com.p314xaae8f345.mm.vfs.c1.f294392r;
        synchronized (p3Var) {
            if (x2Var != null) {
                p3Var.f294658a.add(x2Var);
            }
        }
    }
}
