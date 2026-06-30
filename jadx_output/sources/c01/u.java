package c01;

/* loaded from: classes11.dex */
public class u implements vg3.q4 {

    /* renamed from: f, reason: collision with root package name */
    public static c01.s f37498f;

    /* renamed from: d, reason: collision with root package name */
    public long f37499d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashMap f37500e;

    public u() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f37500e = linkedHashMap;
        linkedHashMap.put("qy_revoke_msg", new c01.c0());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r9, long r10, long r12) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            r2 = 0
            java.lang.String r3 = "@"
            boolean r3 = r9.startsWith(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            if (r3 == 0) goto L27
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.lang.String r3 = r3.sourceDir     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r3 = 1
            java.lang.String r9 = r9.substring(r3)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            java.util.zip.ZipEntry r9 = r4.getEntry(r9)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            java.io.InputStream r9 = r4.getInputStream(r9)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            goto L2c
        L27:
            java.io.InputStream r9 = com.tencent.mm.vfs.w6.E(r9)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L74
            r4 = r2
        L2c:
            r2 = r9
        L2d:
            r5 = 0
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L39
            long r5 = r2.skip(r10)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            long r10 = r10 - r5
            goto L2d
        L39:
            java.lang.String r9 = "MD5"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            r10 = 2048(0x800, float:2.87E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
        L43:
            int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r11 <= 0) goto L5c
            r7 = 2048(0x800, double:1.012E-320)
            long r7 = java.lang.Math.min(r7, r12)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            int r11 = (int) r7     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            int r11 = r2.read(r10, r1, r11)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            r3 = -1
            if (r11 != r3) goto L56
            goto L5c
        L56:
            r9.update(r10, r1, r11)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            long r7 = (long) r11     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            long r12 = r12 - r7
            goto L43
        L5c:
            byte[] r9 = r9.digest()     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.t8.l(r9)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L88
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L69
        L69:
            if (r4 == 0) goto L6e
            r4.close()     // Catch: java.io.IOException -> L6e
        L6e:
            return r9
        L6f:
            r9 = move-exception
            goto L76
        L71:
            r9 = move-exception
            r4 = r2
            goto L89
        L74:
            r9 = move-exception
            r4 = r2
        L76:
            java.lang.String r10 = "MicroMsg.BigBallSysCmdMsgConsumer"
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            com.tencent.mars.xlog.Log.printErrStackTrace(r10, r9, r0, r11)     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L82
            r2.close()     // Catch: java.io.IOException -> L82
        L82:
            if (r4 == 0) goto L87
            r4.close()     // Catch: java.io.IOException -> L87
        L87:
            return r0
        L88:
            r9 = move-exception
        L89:
            if (r2 == 0) goto L8e
            r2.close()     // Catch: java.io.IOException -> L8e
        L8e:
            if (r4 == 0) goto L93
            r4.close()     // Catch: java.io.IOException -> L93
        L93:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.u.b(java.lang.String, long, long):java.lang.String");
    }

    public static long c(java.lang.String str) {
        java.util.zip.ZipFile zipFile;
        if (!str.startsWith("@")) {
            return com.tencent.mm.vfs.w6.k(str);
        }
        java.util.zip.ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new java.util.zip.ZipFile(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().sourceDir);
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            java.util.zip.ZipEntry entry = zipFile.getEntry(str.substring(1));
            if (entry == null) {
                try {
                    zipFile.close();
                } catch (java.io.IOException unused) {
                }
                return -1L;
            }
            long size = entry.getSize();
            try {
                zipFile.close();
            } catch (java.io.IOException unused2) {
            }
            return size;
        } catch (java.io.IOException e18) {
            e = e18;
            zipFile2 = zipFile;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", e, "", new java.lang.Object[0]);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (java.io.IOException unused3) {
                }
            }
            return -1L;
        } catch (java.lang.Throwable th7) {
            th = th7;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static java.lang.String h(java.lang.Object... objArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            for (java.lang.Object obj : objArr) {
                if (obj instanceof java.lang.String) {
                    byteArrayOutputStream.write(((java.lang.String) obj).getBytes());
                } else if (obj instanceof java.lang.Integer) {
                    int intValue = ((java.lang.Integer) obj).intValue();
                    for (int i17 = 0; i17 < 4; i17++) {
                        byteArrayOutputStream.write(intValue & 255);
                        intValue >>= 8;
                    }
                } else if (obj instanceof java.lang.Long) {
                    long longValue = ((java.lang.Long) obj).longValue();
                    for (int i18 = 0; i18 < 8; i18++) {
                        byteArrayOutputStream.write((int) (255 & longValue));
                        longValue >>= 8;
                    }
                } else {
                    if (!(obj instanceof java.lang.Boolean)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BigBallSysCmdMsgConsumer", "Invalid object class: %s", obj);
                        return "";
                    }
                    byteArrayOutputStream.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
                }
            }
            return com.tencent.mm.sdk.platformtools.t8.l(java.security.MessageDigest.getInstance("MD5").digest(byteArrayOutputStream.toByteArray()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BigBallSysCmdMsgConsumer", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public void f(java.lang.String str, long j17, com.tencent.mm.modelbase.p0 p0Var, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.storage.l4 l4Var;
        a95.a z07;
        com.tencent.mars.xlog.Log.i("MicroMsg.BigBallSysCmdMsgConsumer", "doRevokeMsg xmlSrvMsgId=%d talker=%s isGet=%s", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(p0Var.f70727b));
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j17);
        com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(o27);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(str);
        if (p0Var.f70727b) {
            r45.j4 j4Var = p0Var.f70726a;
            java.lang.String g17 = x51.j1.g(j4Var.f377561h);
            com.tencent.mm.storage.y7 y7Var = new com.tencent.mm.storage.y7();
            y7Var.field_originSvrId = j17;
            if (o27.getMsgId() == 0) {
                com.tencent.mars.xlog.Log.i(str4, "summerbadcr get a revoke but msg id is 0 originSvrId[%d]", java.lang.Long.valueOf(j17));
                y7Var.field_content = g17;
                y7Var.field_createTime = j4Var.f377565o;
                y7Var.field_flag = c01.w9.q(p0Var);
                y7Var.field_fromUserName = x51.j1.g(j4Var.f377558e);
                y7Var.field_toUserName = x51.j1.g(j4Var.f377559f);
                y7Var.field_newMsgId = j4Var.f377568r;
                com.tencent.mars.xlog.Log.i(str4, "summerbadcr insert ret[%b], systemRowid[%d]", java.lang.Boolean.valueOf(((w11.w1) i95.n0.c(w11.w1.class)).Ai().insert(y7Var)), java.lang.Long.valueOf(y7Var.systemRowid));
                return;
            }
            com.tencent.mars.xlog.Log.i(str4, "summerbadcr get a revoke and has done delete info, originSvrId[%d]", java.lang.Long.valueOf(j17));
            ((w11.w1) i95.n0.c(w11.w1.class)).Ai().delete(y7Var, true, new java.lang.String[0]);
            if (p17 != null && p17.R0() == j4Var.f377569s) {
                com.tencent.mars.xlog.Log.i(str4, "summerbadcr get a revoke and fix fault lastseq[%s], firstUnDeliverSeq[%s]", java.lang.Long.valueOf(p17.R0()), java.lang.Long.valueOf(p17.F0()));
                com.tencent.mm.storage.f9 W5 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).W5(p17.h1());
                if (W5 != null) {
                    p17.P1(W5.F0());
                    com.tencent.mars.xlog.Log.i(str4, "summerbadcr get a revoke and fix fault by [%s, %s] lastseq[%s], firstUnDeliverSeq[%s], update[%s]", java.lang.Long.valueOf(W5.I0()), java.lang.Long.valueOf(W5.F0()), java.lang.Long.valueOf(p17.R0()), java.lang.Long.valueOf(p17.F0()), java.lang.Integer.valueOf(((com.tencent.mm.storage.m4) c01.d9.b().r()).Y(p17, p17.h1(), true, true)));
                }
            }
        }
        if (o27.getMsgId() != 0 || (z07 = ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).wi().z0(j17)) == null) {
            f9Var = M1;
            l4Var = p17;
        } else {
            f9Var = M1;
            l4Var = p17;
            if (z07.field_msgSvrId != 0) {
                o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, z07.field_msgSvrId);
            }
        }
        if (o27.getMsgId() == 0) {
            if (((lp3.r) i95.n0.c(lp3.r.class)).Bi(j17) != null) {
                ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Bi(str, j17);
                return;
            } else {
                com.tencent.mars.xlog.Log.i(str4, "summerbadcr get a revoke newxml, but original msg has not been found, originSvrId[%d]", java.lang.Long.valueOf(j17));
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).f193990s.a(0, j17, 0L, false);
                return;
            }
        }
        if (o27.getType() == 922746929) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Bi(str, j17);
            return;
        }
        int i17 = o27.F & 4;
        if (i17 != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BigBallSysCmdMsgConsumer", "doRevokeMsg revokeFlag=%d msgId=%s talker=%s type=%d revokeMsgSvrId=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(o27.getMsgId()), str, java.lang.Integer.valueOf(o27.getType()), java.lang.Long.valueOf(j17));
            tg3.p1.f419206a.d(o27);
            if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ni() && (o27.J2() || o27.isVideo())) {
                r15.d I = com.tencent.mm.modelsimple.d1.I(o27);
                o27.d1(str2);
                o27.setType(285222674);
                w15.h hVar = new w15.h();
                w15.e eVar = new w15.e();
                w15.d dVar = new w15.d();
                dVar.s(c01.id.a() / 1000);
                dVar.w(str2);
                dVar.u("revokemsgcontent");
                eVar.k(dVar);
                hVar.o("revokemsgcontent");
                eVar.l(str2);
                hVar.n(eVar);
                if (I != null) {
                    r15.b bVar = new r15.b();
                    bVar.o(I);
                    hVar.l(bVar);
                }
                o27.x3(hVar.toXml());
            } else {
                o27.d1(str2);
                o27.x3(str2);
                o27.setType(268445456);
            }
            o27.p1("");
            c01.w9.n(o27, p0Var);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(o27.getMsgId(), o27, true);
        }
        com.tencent.mm.autogen.events.RevokeMsgEvent revokeMsgEvent = new com.tencent.mm.autogen.events.RevokeMsgEvent();
        long msgId = o27.getMsgId();
        am.cs csVar = revokeMsgEvent.f54713g;
        csVar.f6394a = msgId;
        csVar.f6395b = str2;
        csVar.f6396c = o27;
        com.tencent.mm.storage.f9 f9Var2 = f9Var;
        csVar.f6397d = f9Var2;
        csVar.f6398e = j17;
        csVar.f6399f = str3;
        revokeMsgEvent.e();
        if (f9Var2 != null) {
            gm0.j1.e().j(new c01.r(this, f9Var2));
        }
        ri3.e eVar2 = (ri3.e) ((aa0.e) i95.n0.c(aa0.e.class));
        ui3.b D0 = eVar2.Di().D0(str, j17);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySvrId msgSvrId:%s, msgQuote is null", java.lang.Long.valueOf(j17));
        } else if (D0.field_status == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySvrId msgSvrId:%s revoked!!", java.lang.Long.valueOf(j17));
        } else {
            D0.field_status = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf() msgSvrId:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(eVar2.Di().P0(D0)));
        }
        if (l4Var != null && l4Var.d1() > 0) {
            if (l4Var.d1() >= ((com.tencent.mm.storage.g9) c01.d9.b().u()).w8(o27)) {
                com.tencent.mm.storage.l4 l4Var2 = l4Var;
                l4Var2.Y1(l4Var.d1() - 1);
                if (l4Var2.t0() > 0) {
                    if (o27.s2(c01.z1.r())) {
                        l4Var2.i1(l4Var2.t0() - 1);
                    } else if (o27.y2()) {
                        l4Var2.i1(l4Var2.t0() - 4096);
                    } else if (o27.r2()) {
                        l4Var2.i1(l4Var2.t0() - com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                    }
                }
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).W(l4Var2, l4Var2.h1());
            }
        }
        if (kn.l0.a(f9Var2)) {
            com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent notifyGroupToolsResetEvent = new com.tencent.mm.autogen.events.NotifyGroupToolsResetEvent();
            notifyGroupToolsResetEvent.f54547g.f7903a = f9Var2;
            notifyGroupToolsResetEvent.e();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:55|56|57|(6:(2:61|(8:63|64|65|66|67|68|(1:(2:496|(1:498)(1:499))(1:500))(1:73)|74))|67|68|(1:70)|(0)(0)|74)|507|64|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x023b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x023c, code lost:
    
        r28 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0bd2  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0d9c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0eaf  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0f11  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0f2e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0f8e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0fdd A[Catch: Exception -> 0x0ff4, TRY_LEAVE, TryCatch #6 {Exception -> 0x0ff4, blocks: (B:476:0x0fd1, B:478:0x0fdd), top: B:475:0x0fd1 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x01f7 A[Catch: Exception -> 0x0239, TryCatch #14 {Exception -> 0x0239, blocks: (B:68:0x01b8, B:70:0x01c0, B:73:0x01c8, B:496:0x01f7, B:498:0x01fd, B:499:0x0217, B:500:0x021f), top: B:67:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x021f A[Catch: Exception -> 0x0239, TRY_LEAVE, TryCatch #14 {Exception -> 0x0239, blocks: (B:68:0x01b8, B:70:0x01c0, B:73:0x01c8, B:496:0x01f7, B:498:0x01fd, B:499:0x0217, B:500:0x021f), top: B:67:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028e  */
    @Override // vg3.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 k7(java.lang.String r38, java.util.Map r39, com.tencent.mm.modelbase.p0 r40) {
        /*
            Method dump skipped, instructions count: 4095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.u.k7(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }
}
