package bw1;

/* loaded from: classes12.dex */
public class a implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        if (strArr.length == 0) {
            return false;
        }
        java.lang.String str2 = strArr[0];
        str2.getClass();
        if (!str2.equals("//clean") || strArr.length < 2) {
            return false;
        }
        java.lang.String str3 = strArr[1];
        str3.getClass();
        char c17 = 65535;
        switch (str3.hashCode()) {
            case -2146994480:
                if (str3.equals("rescan-rescue")) {
                    c17 = 0;
                    break;
                }
                break;
            case -2037355359:
                if (str3.equals("force-clean-modules")) {
                    c17 = 1;
                    break;
                }
                break;
            case -1686427720:
                if (str3.equals("dump-wxindex")) {
                    c17 = 2;
                    break;
                }
                break;
            case -1162057060:
                if (str3.equals("fill-test")) {
                    c17 = 3;
                    break;
                }
                break;
            case -500525318:
                if (str3.equals("report-cheat")) {
                    c17 = 4;
                    break;
                }
                break;
            case -180418528:
                if (str3.equals("debug-detail-list")) {
                    c17 = 5;
                    break;
                }
                break;
            case 3524221:
                if (str3.equals("scan")) {
                    c17 = 6;
                    break;
                }
                break;
            case 95467907:
                if (str3.equals("delay")) {
                    c17 = 7;
                    break;
                }
                break;
            case 108404047:
                if (str3.equals("reset")) {
                    c17 = '\b';
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_RESCUE_CURSOR_LONG_SYNC, Long.MIN_VALUE);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_CURSOR_LONG_SYNC, Long.MIN_VALUE);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_C2C_RESCUE_OTHER_ACCOUNT_SCAN_DONE_LONG_SYNC, Long.MIN_VALUE);
                db5.t7.makeText(context, "Reset rescue cursor.", 0).show();
                return true;
            case 1:
                yv1.h1.f466065a = true;
                return true;
            case 2:
                final com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, null);
                ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: bw1.a$$b
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:6:0x001c, B:10:0x0026, B:12:0x0038, B:15:0x003e, B:18:0x0072, B:21:0x00a9, B:26:0x005a), top: B:5:0x001c }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 234
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: bw1.a$$b.run():void");
                    }
                });
                return true;
            case 3:
                ((ku5.t0) ku5.t0.f312615d).a(new bw1.a$$a());
                dp.a.makeText(context, "Done.", 1).show();
                return true;
            case 4:
                boolean equals = strArr.length > 2 ? "1".equals(strArr[2]) : false;
                boolean equals2 = strArr.length > 3 ? "1".equals(strArr[3]) : false;
                com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("clean_status_report", gm0.j1.b().h(), 1);
                if (equals2) {
                    J2.G("scan_cheat", true);
                } else {
                    J2.W("scan_cheat");
                }
                if (equals) {
                    J2.G("report_cheat", true);
                } else {
                    J2.W("report_cheat");
                }
                dp.a.makeText(context, "Report cheat - scan: " + equals2 + ", report: " + equals, 1).show();
                return true;
            case 5:
                yv1.h1.f466067c = true;
                return true;
            case 6:
                ((ku5.t0) ku5.t0.f312615d).c(new com.tencent.mm.console.p0$$i(mt1.b0.f331191a));
                db5.t7.makeText(context, "trigger scan now.", 0).show();
                return true;
            case 7:
                if (strArr.length < 5) {
                    return false;
                }
                yv1.h1.f466066b = new long[]{com.tencent.mm.sdk.platformtools.t8.V(strArr[2], 0L) * 1000, com.tencent.mm.sdk.platformtools.t8.V(strArr[3], 0L) * 1000, com.tencent.mm.sdk.platformtools.t8.V(strArr[4], 0L) * 100};
                return true;
            case '\b':
                com.tencent.mm.sdk.platformtools.o4.M("CleanCalcMMKV").X(new java.lang.String[]{"CleanCalcAlreadyResetIndex", "CleanCalcResetIndexTime"});
                new com.tencent.mm.autogen.events.CleanWxFileIndexEvent().e();
                db5.t7.makeText(context, "clean wx file index now.", 0).show();
                return true;
            default:
                return false;
        }
    }
}
