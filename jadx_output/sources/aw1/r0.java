package aw1;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static aw1.q0 f14667b;

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.r0 f14666a = new aw1.r0();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f14668c = com.tencent.mm.sdk.platformtools.o4.J("ReportC2CFileByOneDay", gm0.j1.b().h(), 1);

    public static /* synthetic */ void h(aw1.r0 r0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        r0Var.g(z17);
    }

    public final void a(com.tencent.mm.vfs.x1 x1Var, java.lang.StringBuilder sb6) {
        long j17 = x1Var.f213233c / 1024;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(j17);
        sb7.append('#');
        sb6.append(sb7.toString());
    }

    public final void b(com.tencent.mm.vfs.x1 x1Var, boolean z17, int i17) {
        if (x1Var == null) {
            return;
        }
        long j17 = x1Var.f213234d;
        if (i17 == 30) {
            if (z17) {
                c().f14659y++;
                c().f14660z += j17;
                a(x1Var, c().M);
                return;
            }
            c().A++;
            c().B += j17;
            a(x1Var, c().N);
            return;
        }
        if (i17 == 40) {
            if (z17) {
                c().C++;
                c().D += j17;
                a(x1Var, c().Y);
                return;
            }
            c().E++;
            c().F += j17;
            a(x1Var, c().Z);
            return;
        }
        if (i17 == 50) {
            if (z17) {
                c().G++;
                c().H += j17;
                a(x1Var, c().f14634a0);
                return;
            }
            c().I++;
            c().f14632J += j17;
            a(x1Var, c().f14636b0);
            return;
        }
        switch (i17) {
            case 10:
                if (z17) {
                    c().f14633a++;
                    c().f14635b += j17;
                    a(x1Var, c().O);
                    return;
                }
                c().f14637c++;
                c().f14638d += j17;
                a(x1Var, c().P);
                return;
            case 11:
                if (z17) {
                    c().f14639e++;
                    c().f14640f += j17;
                    a(x1Var, c().Q);
                    return;
                }
                c().f14641g++;
                c().f14642h += j17;
                a(x1Var, c().R);
                return;
            case 12:
                if (z17) {
                    c().f14643i++;
                    c().f14644j += j17;
                    a(x1Var, c().K);
                    return;
                }
                c().f14645k++;
                c().f14646l += j17;
                a(x1Var, c().L);
                return;
            default:
                switch (i17) {
                    case 20:
                        if (z17) {
                            c().f14647m++;
                            c().f14648n += j17;
                            a(x1Var, c().U);
                            return;
                        }
                        c().f14649o++;
                        c().f14650p += j17;
                        a(x1Var, c().V);
                        return;
                    case 21:
                        if (z17) {
                            c().f14651q++;
                            c().f14652r += j17;
                            a(x1Var, c().W);
                            return;
                        }
                        c().f14653s++;
                        c().f14654t += j17;
                        a(x1Var, c().X);
                        return;
                    case 22:
                        if (z17) {
                            c().f14655u++;
                            c().f14656v += j17;
                            a(x1Var, c().S);
                            return;
                        }
                        c().f14657w++;
                        c().f14658x += j17;
                        a(x1Var, c().T);
                        return;
                    default:
                        return;
                }
        }
    }

    public final aw1.q0 c() {
        aw1.q0 q0Var = f14667b;
        if (q0Var != null) {
            return q0Var;
        }
        kotlin.jvm.internal.o.o("reportData");
        throw null;
    }

    public final boolean d() {
        if (kotlin.jvm.internal.o.b("1", j62.e.g().a("clicfg_report_yesterday_c2c_storage_android", "0", false, true)) || z65.c.a()) {
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    public final void e(int i17, int i18, long j17, long j18, long j19, java.lang.String str) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("file_memory_statistics", kz5.c1.k(new jz5.l("file_memory_type", java.lang.Integer.valueOf(i17)), new jz5.l("file_source_type", java.lang.Integer.valueOf(i18)), new jz5.l("file_size_kb", java.lang.Long.valueOf(j17 / 1024)), new jz5.l("file_nums", java.lang.Long.valueOf(j18)), new jz5.l("target_ds", java.lang.Long.valueOf(j19)), new jz5.l("file_size_kb_list", str)), 32337);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportC2CFileByOneDay", "report done");
    }

    public final void f(com.tencent.mm.vfs.x1 x1Var, int i17, int i18, int i19, int i27, long j17) {
        if (x1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportC2CFileByOneDay", "report35066, filePath = " + x1Var.f213231a + ", fileType = " + i17 + ", talkerType = " + i18 + ", fileIsUploadType = " + i19 + ", msgIsSendType = " + i27 + ", startTimeStamp = " + j17);
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(x1Var.f213232b);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("incremental_chat_record_report", kz5.c1.k(new jz5.l("file_memory_type", java.lang.Integer.valueOf(i17)), new jz5.l("scan_start_timestamp", java.lang.Long.valueOf(j17)), new jz5.l("file_scene", java.lang.Integer.valueOf(i18)), new jz5.l("file_upload_or_download", java.lang.Integer.valueOf(i19)), new jz5.l("file_from_type", java.lang.Integer.valueOf(i27)), new jz5.l("file_size_kb", java.lang.Long.valueOf(x1Var.f213234d / ((long) 1024))), new jz5.l("file_send_type", ""), new jz5.l("file_extension", n17)), 35066);
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportC2CFileByOneDay", "report done");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x04a8 A[Catch: all -> 0x0a11, TryCatch #0 {all -> 0x0a11, blocks: (B:110:0x03c9, B:112:0x03e1, B:113:0x03fe, B:115:0x0433, B:116:0x0450, B:122:0x0467, B:123:0x04a8, B:125:0x04e9, B:126:0x0529, B:128:0x0553, B:130:0x0567, B:132:0x0596, B:133:0x05b3, B:134:0x05cf, B:136:0x061b, B:137:0x0638, B:140:0x0656, B:141:0x0675, B:157:0x06a2), top: B:109:0x03c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(boolean r122) {
        /*
            Method dump skipped, instructions count: 2584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.r0.g(boolean):void");
    }

    public final void i(aw1.q0 q0Var) {
        kotlin.jvm.internal.o.g(q0Var, "<set-?>");
        f14667b = q0Var;
    }
}
