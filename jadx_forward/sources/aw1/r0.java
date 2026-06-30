package aw1;

/* loaded from: classes12.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static aw1.q0 f96200b;

    /* renamed from: a, reason: collision with root package name */
    public static final aw1.r0 f96199a = new aw1.r0();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f96201c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("ReportC2CFileByOneDay", gm0.j1.b().h(), 1);

    public static /* synthetic */ void h(aw1.r0 r0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        r0Var.g(z17);
    }

    public final void a(com.p314xaae8f345.mm.vfs.x1 x1Var, java.lang.StringBuilder sb6) {
        long j17 = x1Var.f294766c / 1024;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(j17);
        sb7.append('#');
        sb6.append(sb7.toString());
    }

    public final void b(com.p314xaae8f345.mm.vfs.x1 x1Var, boolean z17, int i17) {
        if (x1Var == null) {
            return;
        }
        long j17 = x1Var.f294767d;
        if (i17 == 30) {
            if (z17) {
                c().f96192y++;
                c().f96193z += j17;
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
                a(x1Var, c().f96167a0);
                return;
            }
            c().I++;
            c().f96165J += j17;
            a(x1Var, c().f96169b0);
            return;
        }
        switch (i17) {
            case 10:
                if (z17) {
                    c().f96166a++;
                    c().f96168b += j17;
                    a(x1Var, c().O);
                    return;
                }
                c().f96170c++;
                c().f96171d += j17;
                a(x1Var, c().P);
                return;
            case 11:
                if (z17) {
                    c().f96172e++;
                    c().f96173f += j17;
                    a(x1Var, c().Q);
                    return;
                }
                c().f96174g++;
                c().f96175h += j17;
                a(x1Var, c().R);
                return;
            case 12:
                if (z17) {
                    c().f96176i++;
                    c().f96177j += j17;
                    a(x1Var, c().K);
                    return;
                }
                c().f96178k++;
                c().f96179l += j17;
                a(x1Var, c().L);
                return;
            default:
                switch (i17) {
                    case 20:
                        if (z17) {
                            c().f96180m++;
                            c().f96181n += j17;
                            a(x1Var, c().U);
                            return;
                        }
                        c().f96182o++;
                        c().f96183p += j17;
                        a(x1Var, c().V);
                        return;
                    case 21:
                        if (z17) {
                            c().f96184q++;
                            c().f96185r += j17;
                            a(x1Var, c().W);
                            return;
                        }
                        c().f96186s++;
                        c().f96187t += j17;
                        a(x1Var, c().X);
                        return;
                    case 22:
                        if (z17) {
                            c().f96188u++;
                            c().f96189v += j17;
                            a(x1Var, c().S);
                            return;
                        }
                        c().f96190w++;
                        c().f96191x += j17;
                        a(x1Var, c().T);
                        return;
                    default:
                        return;
                }
        }
    }

    public final aw1.q0 c() {
        aw1.q0 q0Var = f96200b;
        if (q0Var != null) {
            return q0Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reportData");
        throw null;
    }

    public final boolean d() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("1", j62.e.g().a("clicfg_report_yesterday_c2c_storage_android", "0", false, true)) || z65.c.a()) {
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    public final void e(int i17, int i18, long j17, long j18, long j19, java.lang.String str) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("file_memory_statistics", kz5.c1.k(new jz5.l("file_memory_type", java.lang.Integer.valueOf(i17)), new jz5.l("file_source_type", java.lang.Integer.valueOf(i18)), new jz5.l("file_size_kb", java.lang.Long.valueOf(j17 / 1024)), new jz5.l("file_nums", java.lang.Long.valueOf(j18)), new jz5.l("target_ds", java.lang.Long.valueOf(j19)), new jz5.l("file_size_kb_list", str)), 32337);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileByOneDay", "report done");
    }

    public final void f(com.p314xaae8f345.mm.vfs.x1 x1Var, int i17, int i18, int i19, int i27, long j17) {
        if (x1Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileByOneDay", "report35066, filePath = " + x1Var.f294764a + ", fileType = " + i17 + ", talkerType = " + i18 + ", fileIsUploadType = " + i19 + ", msgIsSendType = " + i27 + ", startTimeStamp = " + j17);
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(x1Var.f294765b);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("incremental_chat_record_report", kz5.c1.k(new jz5.l("file_memory_type", java.lang.Integer.valueOf(i17)), new jz5.l("scan_start_timestamp", java.lang.Long.valueOf(j17)), new jz5.l("file_scene", java.lang.Integer.valueOf(i18)), new jz5.l("file_upload_or_download", java.lang.Integer.valueOf(i19)), new jz5.l("file_from_type", java.lang.Integer.valueOf(i27)), new jz5.l("file_size_kb", java.lang.Long.valueOf(x1Var.f294767d / ((long) 1024))), new jz5.l("file_send_type", ""), new jz5.l("file_extension", n17)), 35066);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportC2CFileByOneDay", "report done");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(q0Var, "<set-?>");
        f96200b = q0Var;
    }
}
