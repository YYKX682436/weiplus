package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class k8 extends com.p314xaae8f345.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294569e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f294570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22772x3160aed9 f294571g;

    public k8(com.p314xaae8f345.mm.vfs.C22772x3160aed9 c22772x3160aed9, com.p314xaae8f345.mm.vfs.q2 q2Var) {
        this.f294571g = c22772x3160aed9;
        this.f294569e = q2Var;
        this.f294570f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public java.util.List K() {
        return this.f294570f;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0
    public com.p314xaae8f345.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f294569e;
    }

    public final boolean O(com.p314xaae8f345.mm.vfs.x1 x1Var) {
        if (!com.p314xaae8f345.mm.vfs.C22772x3160aed9.f294293f || java.lang.System.currentTimeMillis() - x1Var.f294768e <= 86400000) {
            return false;
        }
        boolean b17 = x1Var.b(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "deleteFile, fe = " + x1Var.f294764a + ", ret = " + b17 + ", modifiedTime = " + x1Var.f294768e);
        return b17;
    }

    @Override // com.p314xaae8f345.mm.vfs.m0, com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        java.lang.String str;
        long j17;
        com.p314xaae8f345.mm.vfs.q2[] q2VarArr;
        l75.k0 k0Var;
        java.lang.String str2;
        long j18;
        com.p314xaae8f345.mm.vfs.q2[] q2VarArr2;
        l75.k0 k0Var2;
        boolean startsWith;
        java.lang.String str3;
        long j19;
        java.lang.String substring;
        long s17 = com.p314xaae8f345.mm.vfs.e8.s("voice-clean");
        if (gm0.j1.u().k()) {
            jx3.f.INSTANCE.mo68478xbd3cda5f(22046, "voice-hasCorruptedDB");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "hasCorruptedDB, skip cleanup.");
        } else if (gm0.j1.u().a()) {
            jx3.f.INSTANCE.mo68478xbd3cda5f(22046, "voice-C2CToBeRescued");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "c2cErrorToBeRescued, skip cleanup.");
        } else if (!(z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_voice_scan_12", "0", false, true)))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "X Switch disabled, skip cleanup.");
        } else if (s17 < 1036800000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", java.lang.Long.valueOf(s17), 1036800000L);
        } else {
            java.lang.String str4 = "msg_";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "doMaintenance");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.vfs.C22772x3160aed9.f294293f = z65.c.a() || !"0".equals(j62.e.g().a("clicfg_wild_file_voice_clean", "0", false, true));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "isCleanExpt = " + com.p314xaae8f345.mm.vfs.C22772x3160aed9.f294293f);
            cancellationSignal.throwIfCanceled();
            com.p314xaae8f345.mm.vfs.q2[] q2VarArr3 = {new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${sdTo}/MicroMsg/${accountSd}/voice2").b(com.p314xaae8f345.mm.vfs.a3.f294314a.c()), this};
            l75.k0 k0Var3 = gm0.j1.u().f354686f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                d95.f.q();
                android.database.Cursor Di = ((ot0.g3) ((com.p314xaae8f345.mm.app.w2) i95.n0.c(com.p314xaae8f345.mm.app.w2.class))).Di();
                while (Di.moveToNext()) {
                    arrayList.add(Di.getString(0));
                }
                Di.close();
                d95.f.w();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "voicePathList size = " + arrayList.size());
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i27 = 0;
                long j27 = 0;
                long j28 = 0;
                for (int i28 = 2; i18 < i28; i28 = 2) {
                    java.lang.Iterable o17 = com.p314xaae8f345.mm.vfs.e8.o(q2VarArr3[i18], "");
                    if (o17 == null) {
                        o17 = java.util.Collections.emptyList();
                    }
                    java.util.Iterator it = o17.iterator();
                    long j29 = j28;
                    int i29 = i19;
                    long j37 = j27;
                    int i37 = i17;
                    while (true) {
                        if (!it.hasNext()) {
                            str = str4;
                            j17 = currentTimeMillis;
                            q2VarArr = q2VarArr3;
                            k0Var = k0Var3;
                            break;
                        }
                        com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) it.next();
                        if (cancellationSignal.isCanceled()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "cs.isCanceled break");
                            str = str4;
                            j17 = currentTimeMillis;
                            q2VarArr = q2VarArr3;
                            k0Var = k0Var3;
                            i27 = 1;
                            break;
                        }
                        java.lang.String str5 = x1Var.f294764a;
                        java.lang.String str6 = x1Var.f294765b;
                        java.util.Iterator it6 = it;
                        if (str5.startsWith(".ref")) {
                            it = it6;
                        } else {
                            if (x1Var.f294769f) {
                                str2 = str4;
                                j18 = currentTimeMillis;
                            } else {
                                try {
                                    startsWith = str6.startsWith(str4);
                                    str3 = x1Var.f294764a;
                                    j18 = currentTimeMillis;
                                    j19 = x1Var.f294767d;
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                    str2 = str4;
                                    j18 = currentTimeMillis;
                                }
                                if (startsWith) {
                                    try {
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                        str2 = str4;
                                    }
                                    if (str6.endsWith(".amr")) {
                                        str2 = str4;
                                        try {
                                            substring = str6.substring(str6.indexOf(str4) + 4, str6.lastIndexOf(".amr"));
                                        } catch (java.lang.Throwable th8) {
                                            th = th8;
                                            q2VarArr2 = q2VarArr3;
                                            k0Var2 = k0Var3;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.VoiceGCFileSystem", th, "", new java.lang.Object[0]);
                                            it = it6;
                                            currentTimeMillis = j18;
                                            str4 = str2;
                                            q2VarArr3 = q2VarArr2;
                                            k0Var3 = k0Var2;
                                        }
                                        if (!arrayList.contains(substring)) {
                                            android.database.Cursor B = k0Var3.B("SELECT filename FROM massendinfo WHERE filename=?", new java.lang.String[]{substring});
                                            B.moveToFirst();
                                            q2VarArr2 = q2VarArr3;
                                            k0Var2 = k0Var3;
                                            long count = B.getCount();
                                            try {
                                                B.close();
                                                if (count != 0) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "isMassVoice, name = " + substring);
                                                } else {
                                                    i29++;
                                                    j37 += j19;
                                                    if (O(x1Var)) {
                                                        i37++;
                                                        j29 += j19;
                                                    }
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.VoiceGCFileSystem", "wildFile 0 name = " + str3);
                                                }
                                            } catch (java.lang.Throwable th9) {
                                                th = th9;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.VoiceGCFileSystem", th, "", new java.lang.Object[0]);
                                                it = it6;
                                                currentTimeMillis = j18;
                                                str4 = str2;
                                                q2VarArr3 = q2VarArr2;
                                                k0Var3 = k0Var2;
                                            }
                                            it = it6;
                                            currentTimeMillis = j18;
                                            str4 = str2;
                                            q2VarArr3 = q2VarArr2;
                                            k0Var3 = k0Var2;
                                        }
                                    }
                                }
                                str2 = str4;
                                q2VarArr2 = q2VarArr3;
                                k0Var2 = k0Var3;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.VoiceGCFileSystem", "illegal name = " + str3);
                                i29++;
                                j37 += j19;
                                if (O(x1Var)) {
                                    i37++;
                                    j29 += j19;
                                }
                                it = it6;
                                currentTimeMillis = j18;
                                str4 = str2;
                                q2VarArr3 = q2VarArr2;
                                k0Var3 = k0Var2;
                            }
                            q2VarArr2 = q2VarArr3;
                            k0Var2 = k0Var3;
                            it = it6;
                            currentTimeMillis = j18;
                            str4 = str2;
                            q2VarArr3 = q2VarArr2;
                            k0Var3 = k0Var2;
                        }
                    }
                    i18++;
                    i17 = i37;
                    j27 = j37;
                    i19 = i29;
                    j28 = j29;
                    currentTimeMillis = j17;
                    str4 = str;
                    q2VarArr3 = q2VarArr;
                    k0Var3 = k0Var;
                }
                long j38 = currentTimeMillis;
                arrayList.clear();
                long j39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1L);
                long j47 = j27;
                int i38 = j39 != -1 ? (int) ((((float) j47) / ((float) j39)) * 100.0f) : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d\n > illegalFiles: %d, illegalSize: %d\n > wildFiles: %d, wildSize: %d\n > tempFiles: %d, tempSize: %d\n > noMediaFiles: %d, noMediaSize: %d > totalWildFile: %d, totalWildSize: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j47));
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j38;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.VoiceGCFileSystem", "duration = " + currentTimeMillis2);
                jx3.f.INSTANCE.d(22046, "voice-v3", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j28), 0, 0L, 0, 0L, 0, 0L, 0, 0L, 0, 0L, java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j47), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i38), java.lang.Long.valueOf(currentTimeMillis2));
                if (i27 == 0) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("recent_voice_wild_file_size", j47);
                    com.p314xaae8f345.mm.vfs.e8.t("voice-clean");
                    if (j47 > 209715200) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("extreme_storage_voice_wild_file_size", j47);
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("extreme_storage_voice_wild_file_size", -1L);
                    }
                }
            } catch (java.lang.Throwable th10) {
                try {
                    com.p314xaae8f345.mm.vfs.e8.t("voice-clean");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VFS.VoiceGCFileSystem", "fill voicePathList error : " + th10.getMessage());
                } finally {
                    d95.f.w();
                }
            }
        }
        cancellationSignal.throwIfCanceled();
        super.q(cancellationSignal);
    }

    @Override // com.p314xaae8f345.mm.vfs.a
    /* renamed from: toString */
    public java.lang.String mo82287x9616526c() {
        return "voiceGC <- " + this.f294569e;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294571g;
    }
}
