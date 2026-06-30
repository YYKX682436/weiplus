package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class t0 implements com.p314xaae8f345.mm.vfs.x2 {
    @Override // com.p314xaae8f345.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
            com.p314xaae8f345.mm.vfs.c1.f294383i = new java.util.HashMap();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Begin statistics maintenance");
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public boolean b(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, android.os.CancellationSignal cancellationSignal) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
        int i17;
        boolean z19;
        long j17;
        if (z17 || z18) {
            synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Interrupted statistics maintenance, statistics count: " + com.p314xaae8f345.mm.vfs.c1.f294383i.size());
                com.p314xaae8f345.mm.vfs.c1.f294382h.putAll(com.p314xaae8f345.mm.vfs.c1.f294383i);
                com.p314xaae8f345.mm.vfs.c1.f294383i = null;
            }
            return;
        }
        try {
            java.lang.Iterable p17 = com.p314xaae8f345.mm.vfs.e8.p(new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${extData}/MicroMsg/${accountSalt}/record").b(com.p314xaae8f345.mm.vfs.a3.f294314a.c()), "", false, null);
            if (p17 != null) {
                java.util.Iterator it = ((pm5.b) p17).iterator();
                j17 = 0;
                while (true) {
                    pm5.c cVar = (pm5.c) it;
                    if (!cVar.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.vfs.x1 x1Var = (com.p314xaae8f345.mm.vfs.x1) cVar.next();
                    if (x1Var.f294769f) {
                        long j18 = x1Var.f294768e;
                        if (j18 > 1650902400000L) {
                            j17 = java.lang.Math.max(j17, j18);
                        }
                    }
                }
            } else {
                j17 = 0;
            }
            if (j17 > 0) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.d(21388, "@WrongMigration-record", 0, 0, "", 0, 0, 0, 0, 0, java.lang.Long.valueOf(j17), 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                fVar.t(1912, 2);
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_OTHER_ACCOUNT_WRONG_MIGRANT_INT_SYNC;
                if (c17.t(u3Var, 0L) == 0) {
                    gm0.j1.u().c().x(u3Var, 2);
                }
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VOICE2_HIT_INT_SYNC;
            if (c18.r(u3Var2, 0) != 0) {
                gm0.j1.u().c().x(u3Var2, 0);
                jx3.f fVar2 = jx3.f.INSTANCE;
                fVar2.d(21388, "@WrongMigration-voice2", 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                fVar2.t(1912, 3);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_VIDEO_HIT_INT_SYNC;
            if (c19.r(u3Var3, 0) != 0) {
                gm0.j1.u().c().x(u3Var3, 0);
                jx3.f fVar3 = jx3.f.INSTANCE;
                fVar3.d(21388, "@WrongMigration-video", 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                fVar3.t(1912, 4);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.DiskFileStatistics", e17, "Cannot report wrong migration", new java.lang.Object[0]);
        }
        d();
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2550x9e95ebc3.C20478xc1552bbe()) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "calcMediaMessageStorage expt false");
        } else if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("last_calcTypeMessageStorage", 0L) < 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Not time to calcTypeMessageStorage");
        } else {
            try {
                d95.f.q();
                qi3.y.sc();
            } finally {
                try {
                } finally {
                }
            }
        }
        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("last_calcC2CMediaInfo", 0L) < 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Not time to calcC2CMediaInfo");
        } else {
            try {
                qi3.y.p4();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.DiskFileStatistics", th6, "calcC2CMediaInfo failed", new java.lang.Object[0]);
            }
        }
        try {
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.vfs.s0(this, d95.f.f309195h, true), "saveDbFreePage");
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.vfs.s0(this, d95.f.f309196i, false), "saveDbFreePage");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> mo82286x32b09e = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${data}/MicroMsg/${account}").b(com.p314xaae8f345.mm.vfs.a3.f294314a.c()).mo82286x32b09e("");
            if (mo82286x32b09e != null) {
                for (com.p314xaae8f345.mm.vfs.x1 x1Var2 : mo82286x32b09e) {
                    if (!x1Var2.f294769f && x1Var2.f294765b.endsWith(".db")) {
                        java.lang.String str = "${data}/MicroMsg/${account}/" + x1Var2.f294765b;
                        com.p314xaae8f345.mm.vfs.a1 a1Var = new com.p314xaae8f345.mm.vfs.a1("@DiskSpace-DB", 12, 0, str, x1Var2.f294767d, 1, 0, 1, x1Var2.f294766c, x1Var2.f294768e - currentTimeMillis, 0L, 0L);
                        synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
                            java.util.Map map = com.p314xaae8f345.mm.vfs.c1.f294383i;
                            if (map == null) {
                                map = com.p314xaae8f345.mm.vfs.c1.f294382h;
                            }
                            map.put(str + "|@DiskSpace-DB", a1Var);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.DiskFileStatistics", e18, "Failed to calculate databases.", new java.lang.Object[0]);
        }
        boolean z27 = "1".equals(j62.e.g().j("clicfg_diskspace_force_report", "0", true, true)) || com.p314xaae8f345.mm.vfs.c1.j() || z65.c.a();
        synchronized (com.p314xaae8f345.mm.vfs.c1.f294381g) {
            java.util.Map map2 = com.p314xaae8f345.mm.vfs.c1.f294383i;
            com.p314xaae8f345.mm.vfs.c1.f294382h = map2;
            java.util.Iterator it6 = map2.values().iterator();
            int i18 = 0;
            while (true) {
                i17 = 14;
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.vfs.a1 a1Var2 = (com.p314xaae8f345.mm.vfs.a1) it6.next();
                java.util.Iterator it7 = ((java.util.HashSet) com.p314xaae8f345.mm.vfs.c1.f294391q).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        if (((com.p314xaae8f345.mm.vfs.b1) it7.next()).c(a1Var2)) {
                            z19 = true;
                            break;
                        }
                    } else {
                        z19 = false;
                        break;
                    }
                }
                if (!z19) {
                    if (z27 && a1Var2.f294302e > 0) {
                        jx3.f.INSTANCE.d(21388, a1Var2.f294298a, java.lang.Integer.valueOf(a1Var2.f294299b), java.lang.Integer.valueOf(a1Var2.f294300c), a1Var2.f294301d, java.lang.Long.valueOf(a1Var2.f294302e), java.lang.Integer.valueOf(a1Var2.f294303f), java.lang.Integer.valueOf(a1Var2.f294304g), java.lang.Integer.valueOf(a1Var2.f294305h), java.lang.Long.valueOf(a1Var2.f294306i), 0L, java.lang.Long.valueOf(a1Var2.f294307j), java.lang.Long.valueOf(a1Var2.f294308k), java.lang.Long.valueOf(a1Var2.f294309l), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", a1Var2.f294298a, java.lang.Integer.valueOf(a1Var2.f294299b), java.lang.Integer.valueOf(a1Var2.f294300c), a1Var2.f294301d, java.lang.Long.valueOf(a1Var2.f294302e), java.lang.Integer.valueOf(a1Var2.f294303f), java.lang.Integer.valueOf(a1Var2.f294304g), java.lang.Integer.valueOf(a1Var2.f294305h), java.lang.Long.valueOf(a1Var2.f294306i), java.lang.Long.valueOf(a1Var2.f294307j));
                    i18++;
                }
            }
            java.util.Iterator it8 = ((java.util.HashSet) com.p314xaae8f345.mm.vfs.c1.f294391q).iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.mm.vfs.a1 b17 = ((com.p314xaae8f345.mm.vfs.b1) it8.next()).b();
                if (b17 != null) {
                    if (z27 && b17.f294302e > 0) {
                        jx3.f fVar4 = jx3.f.INSTANCE;
                        java.lang.Object[] objArr = new java.lang.Object[i17];
                        objArr[0] = b17.f294298a;
                        objArr[1] = java.lang.Integer.valueOf(b17.f294299b);
                        objArr[2] = java.lang.Integer.valueOf(b17.f294300c);
                        objArr[3] = b17.f294301d;
                        objArr[4] = java.lang.Long.valueOf(b17.f294302e);
                        objArr[5] = java.lang.Integer.valueOf(b17.f294303f);
                        objArr[6] = java.lang.Integer.valueOf(b17.f294304g);
                        objArr[7] = java.lang.Integer.valueOf(b17.f294305h);
                        objArr[8] = java.lang.Long.valueOf(b17.f294306i);
                        objArr[9] = 0L;
                        objArr[10] = java.lang.Long.valueOf(b17.f294307j);
                        objArr[11] = java.lang.Long.valueOf(b17.f294308k);
                        objArr[12] = java.lang.Long.valueOf(b17.f294309l);
                        objArr[13] = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
                        fVar4.d(21388, objArr);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "KV > name: %s, type: %d, flags: %d, path: %s, totalSize: %d, fileCount: %d, dirCount: %d, maxDepth: %d, maxFileSize: %d, filesAge: %d", b17.f294298a, java.lang.Integer.valueOf(b17.f294299b), java.lang.Integer.valueOf(b17.f294300c), b17.f294301d, java.lang.Long.valueOf(b17.f294302e), java.lang.Integer.valueOf(b17.f294303f), java.lang.Integer.valueOf(b17.f294304g), java.lang.Integer.valueOf(b17.f294305h), java.lang.Long.valueOf(b17.f294306i), java.lang.Long.valueOf(b17.f294307j));
                    i18++;
                }
                i17 = 14;
            }
            if (z27) {
                com.p314xaae8f345.mm.vfs.c1.c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "End statistics maintenance, reported: %d, count: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.p314xaae8f345.mm.vfs.c1.f294383i.size()));
            com.p314xaae8f345.mm.vfs.c1.f294383i = null;
            com.p314xaae8f345.mm.vfs.c1.f294384j = true;
        }
        com.p314xaae8f345.mm.vfs.c1.b();
    }

    public final void d() {
        if (!"1".equals(j62.e.g().j("clicfg_storage_efficiency_report", "0", true, true))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "calcAndSaveMessageStorage expt false");
            return;
        }
        long j17 = 0;
        if (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("last_calcAndSaveMessageStorage", 0L) < 1209600000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "Not time to calcAndSaveMessageStorage");
            return;
        }
        int i17 = 4;
        try {
            d95.f.q();
            l75.k0 k0Var = gm0.j1.u().f354686f;
            android.database.Cursor Ai = ((ot0.g3) ((com.p314xaae8f345.mm.app.w2) i95.n0.c(com.p314xaae8f345.mm.app.w2.class))).Ai();
            long j18 = 0;
            long j19 = 0;
            long j27 = 0;
            long j28 = 0;
            long j29 = 0;
            while (Ai.moveToNext()) {
                int i18 = Ai.getInt(0);
                long j37 = Ai.getLong(1);
                long j38 = Ai.getLong(2) + Ai.getLong(3) + Ai.getLong(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VFS.DiskFileStatistics", "type = $type, count = $count, contentSize = $contentSize, lvbufferSize = $lvbufferSize, reservedSize = $reservedSize, sumSize = $sumSize");
                if (java.lang.System.currentTimeMillis() % 10 != j17) {
                    jx3.f.INSTANCE.d(21019, java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1109xca0053ba.z.f34775x366c91de), "" + i18, "", java.lang.Long.valueOf(j38 / j37));
                }
                j18 += j37;
                if (i18 == 1) {
                    j19 = j37;
                } else if (i18 == 3) {
                    j27 = j37;
                } else if (i18 == 34) {
                    j29 = j37;
                } else if (i18 == 43) {
                    j28 = j37;
                }
                j17 = 0;
                i17 = 4;
            }
            Ai.close();
            android.database.Cursor B = k0Var.B("SELECT SUM(videolength) FROM videoinfo2,message WHERE message.msgId=videoinfo2.msglocalid", null);
            long j39 = 0;
            while (B.moveToNext()) {
                j39 = B.getLong(0);
            }
            B.close();
            android.database.Cursor B2 = k0Var.B("SELECT SUM(VoiceLength) FROM voiceinfo,message WHERE message.msgId=voiceinfo.msglocalid", null);
            long j47 = 0;
            while (B2.moveToNext()) {
                j47 = B2.getLong(0) / 1000;
            }
            B2.close();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_total_msg_count", j18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_text_msg_count", j19);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_image_msg_count", j27);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_video_msg_count", j28);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_voice_msg_count", j29);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_video_msg_len", j39);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("daily_storage_voice_msg_len", j47);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("last_calcAndSaveMessageStorage", java.lang.System.currentTimeMillis());
        } finally {
            try {
            } finally {
            }
        }
    }
}
