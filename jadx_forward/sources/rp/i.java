package rp;

/* loaded from: classes12.dex */
public final class i implements com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f479866c;

    /* renamed from: a, reason: collision with root package name */
    public volatile rp.e f479867a;

    /* renamed from: b, reason: collision with root package name */
    public volatile rp.g f479868b;

    public i(rp.d dVar) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String replace = bm5.f1.a().replace(':', '_');
        java.io.File file = new java.io.File(context.getFilesDir(), "crash/NativeCrash_" + replace + '_' + java.lang.System.currentTimeMillis());
        file.getParentFile().mkdirs();
        int i17 = f479866c ? 2176 : 2048;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatNativeCrash", "new flags enabled: " + f479866c);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84130x316510(file.getAbsolutePath(), 1871, i17, false);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84140xde4f266e();
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84128xa1b443bf("Client Version: " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84128xa1b443bf("Base Version: " + lp0.a.f401782c);
        com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.m84127x6d0510c(this);
    }

    public static void a(java.io.BufferedReader bufferedReader, java.lang.StringBuilder sb6) {
        java.lang.String readLine;
        int indexOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            readLine = bufferedReader.readLine();
            if (readLine == null || readLine.isEmpty() || (indexOf = readLine.indexOf(" -> ")) <= 0) {
                break;
            } else {
                arrayList.add(readLine.substring(indexOf + 4));
            }
        }
        if (arrayList.size() < 900) {
            sb6.append("FileDescriptors less than 900 lines\n");
            return;
        }
        java.util.Collections.sort(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = (java.lang.String) arrayList.get(0);
        int size = arrayList.size();
        int i17 = 1;
        for (int i18 = 1; i18 < size; i18++) {
            java.lang.String str2 = (java.lang.String) arrayList.get(i18);
            if (str2.equals(str)) {
                i17++;
            } else {
                arrayList2.add(android.util.Pair.create(str, java.lang.Integer.valueOf(i17)));
                i17 = 1;
                str = str2;
            }
        }
        arrayList2.add(android.util.Pair.create(str, java.lang.Integer.valueOf(i17)));
        java.util.Collections.sort(arrayList2, new rp.d());
        sb6.append("[File Descriptors]\n");
        if (readLine != null && readLine.startsWith("Total: ")) {
            sb6.append(readLine);
            sb6.append('\n');
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            sb6.append('(');
            sb6.append(pair.second);
            sb6.append(") ");
            sb6.append((java.lang.String) pair.first);
            sb6.append('\n');
        }
        sb6.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static rp.f b(int r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.i.b(int, java.lang.String, java.lang.String):rp.f");
    }

    public static void c(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject jSONObject2;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists() || !file.isFile() || (jSONObject2 = (org.json.JSONObject) jSONObject.opt(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7335x31ce7ede)) == null) {
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        jSONObject3.putOpt("contents", jSONArray);
                        jSONObject2.putOpt("threads", jSONObject3);
                        bufferedReader.close();
                        return;
                    }
                    if (readLine.startsWith("[File Descriptors]")) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        a(bufferedReader, sb6);
                        jSONObject.putOpt("File Descriptors", org.json.JSONObject.wrap(sb6.toString().split("\n")));
                    } else if (readLine.startsWith("[DumpThread:")) {
                        org.json.JSONObject putOpt = new org.json.JSONObject().putOpt(ya.b.f77479x42930b2, java.lang.Integer.valueOf(jSONArray.length()));
                        d(putOpt, bufferedReader);
                        jSONArray.put(putOpt);
                    } else if (readLine.startsWith("[DumpThread statis]")) {
                        while (true) {
                            java.lang.String readLine2 = bufferedReader.readLine();
                            if (readLine2 != null && !readLine2.isEmpty()) {
                                java.lang.String[] split = readLine2.split("=", 2);
                                if (split.length > 1) {
                                    jSONObject3.put(split[0].trim(), split[1].trim());
                                }
                            }
                        }
                    } else if (readLine.startsWith("[Mappings]")) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (true) {
                            java.lang.String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null || readLine3.isEmpty()) {
                                break;
                            } else {
                                arrayList.add(readLine3);
                            }
                        }
                        jSONObject.putOpt("Mappings", org.json.JSONObject.wrap(arrayList));
                    }
                } finally {
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeChatNativeCrash", e17, "parseFullDumpToJSON failed", new java.lang.Object[0]);
        }
    }

    public static void d(org.json.JSONObject jSONObject, java.io.BufferedReader bufferedReader) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.isEmpty()) {
                break;
            }
            java.lang.String[] split = readLine.split("=", 2);
            if (split[0].startsWith("Backtrace")) {
                while (true) {
                    java.lang.String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null || readLine2.isEmpty()) {
                        break;
                    } else {
                        arrayList.add(readLine2);
                    }
                }
            } else if (split.length > 1) {
                jSONObject.put(split[0].trim(), split[1].trim());
            }
        }
        jSONObject.put("BackTrace", org.json.JSONObject.wrap(arrayList));
    }

    @Override // com.p314xaae8f345.p2836x689789f0.C22999xca3e41b0.CrashCallback
    /* renamed from: onCrashDumped */
    public boolean mo84142x49fed8bb(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatNativeCrash", "onCrashDumped");
        rp.f b17 = b(i17, str, str2);
        if (this.f479867a != null) {
            ((com.p314xaae8f345.mm.app.w3) this.f479867a).getClass();
            boolean[] zArr = com.p314xaae8f345.mm.app.y3.f135458a;
        }
        if (this.f479868b != null) {
            this.f479868b.a(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatNativeCrash", "[MAPPINGS]");
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("/proc/" + android.os.Process.myPid() + "/maps"), 1024);
            while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatNativeCrash", readLine);
                } finally {
                }
            }
            bufferedReader.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeChatNativeCrash", e17, "Cannot read dump file: %s", str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return false;
        }
        d55.w wVar = new d55.w(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "recovery_statistic");
        wVar.e();
        int mo123525xb58848b9 = wVar.mo123525xb58848b9("crash_count", 0);
        boolean mo123524x41a8a7f2 = wVar.mo123524x41a8a7f2("launch_recovery", false);
        boolean mo123524x41a8a7f22 = wVar.mo123524x41a8a7f2("launch_recovery_real", false);
        boolean mo123524x41a8a7f23 = wVar.mo123524x41a8a7f2("recover_from_crash", false);
        int mo123525xb58848b92 = wVar.mo123525xb58848b9("recovery_status", -1);
        int mo123525xb58848b93 = wVar.mo123525xb58848b9("recovery_from", 0);
        int mo123525xb58848b94 = wVar.mo123525xb58848b9("recover_internal_status", 0);
        int mo123525xb58848b95 = wVar.mo123525xb58848b9("recover_launch_mode", 0);
        long mo123526xfb822ef2 = wVar.mo123526xfb822ef2("recover_running_time", 0L);
        boolean mo123524x41a8a7f24 = wVar.mo123524x41a8a7f2("recover_is_discard", false);
        wVar.mo123527x2fec8307("recover_app_ver", "");
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
        wVar.g("crash_count", mo123525xb58848b9);
        wVar.mo123528x1c849219("launch_recovery", mo123524x41a8a7f2);
        wVar.mo123528x1c849219("launch_recovery_real", mo123524x41a8a7f22);
        wVar.mo123528x1c849219("recover_from_crash", mo123524x41a8a7f23);
        wVar.mo123529xc5c55e60("recovery_status", mo123525xb58848b92);
        wVar.mo123529xc5c55e60("recovery_from", mo123525xb58848b93);
        wVar.mo123529xc5c55e60("recover_internal_status", mo123525xb58848b94);
        wVar.mo123529xc5c55e60("recover_launch_mode", mo123525xb58848b95);
        wVar.mo123530xf2e7ce2b("recover_running_time", mo123526xfb822ef2);
        wVar.mo123528x1c849219("recover_is_discard", mo123524x41a8a7f24);
        wVar.mo123531xe4673800("recover_app_ver", str3);
        wVar.c();
        d55.r0.a().c(4);
        return false;
    }
}
