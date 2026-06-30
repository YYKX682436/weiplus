package nq1;

/* loaded from: classes11.dex */
public class z implements ak0.i {
    public z(nq1.v vVar) {
    }

    @Override // ak0.i
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 130L, 1L, false);
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 114L, 1L, false);
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 115L, 1L, false);
        } else if (i17 == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 132L, 1L, false);
        } else {
            if (i17 != 7) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 136L, 1L, false);
        }
    }

    @Override // ak0.i
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
        if (th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55626x99ea7522)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 134L, 1L, false);
        } else if (th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55627x6a5b804a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68477x336bdfd8(338L, 135L, 1L, false);
            g0Var.i("Tinker", "Tinker Exception:apply tinker occur dexOpt format exception " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true), null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.mo68477x336bdfd8(338L, 105L, 1L, false);
            g0Var2.i("Tinker", "Tinker Exception:apply tinker occur dexOpt exception " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true), null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g2.a(bm5.f1.a(), com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4451x33e61cdb.f18263x2b3a4fa4, android.util.Log.getStackTraceString(th6));
    }

    @Override // ak0.i
    public void c(java.io.File file, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report package check failed, error = %d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case -8:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 131, false);
                return;
            case -7:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 113, false);
                return;
            case -6:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 112, false);
                return;
            case -5:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 111, false);
                return;
            case -4:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 110, false);
                return;
            case -3:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 109, false);
                return;
            case -2:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 129, false);
                return;
            case -1:
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 107, 108, false);
                return;
            default:
                return;
        }
    }

    @Override // ak0.i
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 106L, 1L, false);
    }

    @Override // ak0.i
    public void e(java.io.File file, java.lang.Throwable th6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(338L, 104L, 1L, false);
        g0Var.i("Tinker", "Tinker Exception:apply tinker occur unknown exception " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H(th6, true), null);
    }

    @Override // ak0.i
    public void f(java.io.File file, boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerPatchReporter", "onPatchResult start");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 3L, 1L, true);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 101L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 103L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report report apply cost = %d", java.lang.Long.valueOf(j17));
        if (j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.HotPatchReportHelper", "hp_report report apply cost failed, invalid cost");
        } else if (j17 <= 5000) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 117L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 122L, 1L, false);
            }
        } else if (j17 <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 118L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 123L, 1L, false);
            }
        } else if (j17 <= 30000) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 119L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 124L, 1L, false);
            }
        } else if (j17 > 60000) {
            if (j17 >= 3600000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 133L, 1L, false);
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 121L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 126L, 1L, false);
            }
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 120L, 1L, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 125L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
    }

    @Override // ak0.i
    public void g(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17196xafa566d5.f239659c = 100L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.HotPatchReportHelper", "hp_report try to apply patch service start");
        if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 6, 127, false);
        } else if (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104654x7e63ed49(intent, "patch_path_extra") == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.y(338, 6, 128, false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 6L, 1L, true);
        }
    }

    @Override // ak0.i
    public void h(java.io.File file) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(338L, 116L, 1L, false);
    }
}
