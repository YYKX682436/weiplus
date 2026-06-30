package ak0;

/* loaded from: classes11.dex */
public final class t extends rv5.a {
    @Override // rv5.a, rv5.c
    public void a(java.io.File file, int i17) {
        super.a(file, i17);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274607d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", java.lang.Integer.valueOf(i17));
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 170L, 1L, false);
            }
            switch (i17) {
                case -8:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 186, false);
                    break;
                case -7:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 176, false);
                    break;
                case -6:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 175, false);
                    break;
                case -5:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 174, false);
                    break;
                case -4:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, ib1.t.f69911x366c91de, false);
                    break;
                case -3:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 172, false);
                    break;
                case -2:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 182, false);
                    break;
                case -1:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, be1.r.f4230x366c91de, 171, false);
                    break;
            }
        }
    }

    @Override // rv5.a, rv5.c
    public void b(int i17, java.lang.Throwable th6) {
        super.b(i17, th6);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", java.lang.Integer.valueOf(i17), th6);
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret ok");
            } else if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file");
            } else if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error");
            }
            new b83.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new nq1.C29225x378cc9(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d);
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 193L, 1L, false);
            } else if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(338L, 191L, 1L, false);
                g0Var.i("Tinker", "Tinker Exception:interpret occur instruction exception " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true), null);
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.mo68477x336bdfd8(338L, 192L, 1L, false);
                g0Var2.i("Tinker", "Tinker Exception:interpret occur command exception " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    @Override // rv5.a, rv5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.io.File r16, int r17, long r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak0.t.c(java.io.File, int, long):void");
    }

    @Override // rv5.a, rv5.c
    public void d(java.io.File file, int i17) {
        super.d(file, i17);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 162L, 1L, false);
            } else if (i17 == 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 163L, 1L, false);
            } else if (i17 == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 185L, 1L, false);
            }
        }
    }

    @Override // rv5.a, rv5.c
    public void e(java.lang.Throwable th6, int i17) {
        super.e(th6, i17);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            java.lang.String message = th6.getMessage();
            if (message == null) {
                message = "";
            }
            java.lang.String str = message;
            boolean z17 = false;
            if (i17 == -4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(338L, 188L, 1L, false);
                g0Var.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 188);
            } else if (i17 != -3) {
                if (i17 != -2) {
                    if (i17 == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.mo68477x336bdfd8(338L, 160L, 1L, false);
                        g0Var2.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 160);
                    }
                } else if (str.contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55625xd6edb921)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var3.mo68477x336bdfd8(338L, 189L, 1L, false);
                    g0Var3.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 189);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "tinker dex check fail:" + th6.getMessage());
                    z17 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var4.mo68477x336bdfd8(338L, 161L, 1L, false);
                    g0Var4.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 161);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.HotPatchReportHelper", "tinker dex reflect fail:" + th6.getMessage());
                }
            } else if (str.contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55628xc392eb38)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var5.mo68477x336bdfd8(338L, 190L, 1L, false);
                g0Var5.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 190);
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var6.mo68477x336bdfd8(338L, 184L, 1L, false);
                g0Var6.d(30353, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, 10, 0, 0, bm5.f1.a(), "", y73.z.e(th6.getStackTrace()), str, "", 184);
            }
            if (!z17) {
                java.lang.String H = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true);
                if (i17 == -4) {
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    java.lang.String m104665x9fa1ddd5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104665x9fa1ddd5(context);
                    if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104743x83891ddd(m104665x9fa1ddd5)) {
                        H = "tinker checkSafeModeCount fail:\n" + m104665x9fa1ddd5;
                        ak0.z.b(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104682x8e55de5b(context));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.i("Tinker", "Tinker Exception:load tinker occur exception " + H, null);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0031. Please report as an issue. */
    @Override // rv5.a, rv5.c
    public void f(java.io.File file, int i17, boolean z17) {
        super.f(file, i17, z17);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType:%d, isDirectory:%b", file.getAbsolutePath(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
            switch (i17) {
                case 1:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 166L, 1L, false);
                    break;
                case 2:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 167L, 1L, false);
                    break;
                case 3:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 164L, 1L, false);
                    break;
                case 4:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 183L, 1L, false);
                    break;
                case 5:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 165L, 1L, false);
                    break;
                case 6:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 187L, 1L, false);
                    break;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerPatchLoadReporter", "Patch file '%s' was lost, mark remove current patch and kill main proces.", file);
                ak0.n.a();
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/boots/ProcessHotPatchInitializer$Default$LegacyTinkerLoadListener", "onLoadFileNotFound", "(Ljava/io/File;IZ)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj, "com/tencent/mm/plugin/boots/ProcessHotPatchInitializer$Default$LegacyTinkerLoadListener", "onLoadFileNotFound", "(Ljava/io/File;IZ)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            }
        }
    }

    @Override // rv5.a, rv5.c
    public void g(java.lang.String str, java.lang.String str2, java.io.File file) {
        super.g(str, str2, file);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 168L, 1L, false);
        }
    }

    @Override // rv5.a, rv5.c
    public void h(java.io.File file, int i17) {
        super.h(file, i17);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            if (i17 == -26 || i17 == -5) {
                ak0.n.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report try to apply hotpatch fail");
            switch (i17) {
                case -26:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 83L, 1L, false);
                    break;
                case -25:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 82L, 1L, false);
                    break;
                case -24:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 81L, 1L, false);
                    break;
                case -23:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 79L, 1L, false);
                    break;
                case -22:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 80L, 1L, false);
                    break;
                case -21:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 77L, 1L, false);
                    break;
                case -20:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 76L, 1L, false);
                    break;
                default:
                    switch (i17) {
                        case -7:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 84L, 1L, false);
                            break;
                        case -6:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 78L, 1L, false);
                            break;
                        case -5:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 85L, 1L, false);
                            break;
                        case -4:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 74L, 1L, false);
                            break;
                        case -3:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 73L, 1L, false);
                            break;
                        case -2:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 75L, 1L, false);
                            break;
                        case -1:
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 72L, 1L, false);
                            break;
                    }
            }
        }
    }

    @Override // rv5.a, rv5.c
    public void i(java.lang.String str, java.lang.String str2, java.io.File file, java.lang.String str3) {
        super.i(str, str2, file, str3);
        java.util.Iterator it = ak0.j.f87071a.iterator();
        while (it.hasNext()) {
            ((nq1.y) ((ak0.h) it.next())).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 5L, 1L, false);
        }
    }
}
