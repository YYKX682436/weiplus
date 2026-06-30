package hr3;

/* loaded from: classes11.dex */
public class ph implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f365435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365436e;

    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, boolean z17) {
        this.f365436e = activityC16872x6384268a;
        this.f365435d = z17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365436e;
        int i18 = activityC16872x6384268a.A ? 1 : this.f365435d ? 2 : 3;
        int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16872x6384268a.a7()) ? 3 : (activityC16872x6384268a.a7().equals(activityC16872x6384268a.f235395x) || activityC16872x6384268a.a7().equals(activityC16872x6384268a.f235394w)) ? 2 : 1;
        int i27 = 6;
        if (activityC16872x6384268a.H) {
            i17 = 6;
        } else {
            int i28 = activityC16872x6384268a.J1;
            i17 = (i28 & 8) != 0 ? 5 : ((i28 & 1) == 0 || (i28 & 2) == 0) ? (i28 & 2) != 0 ? 3 : (i28 & 1) != 0 ? 2 : 0 : 4;
        }
        int i29 = activityC16872x6384268a.f235401z;
        if (i29 == 1) {
            i27 = 4;
        } else if (i29 != 3) {
            if (i29 != 6 && i29 != 10 && i29 != 52) {
                if (i29 == 17) {
                    i27 = 5;
                } else if (i29 == 18 || i29 == 44) {
                    i27 = 9;
                } else if (i29 != 45) {
                    if (i29 == 48) {
                        i27 = 8;
                    } else if (i29 != 49) {
                        if (i29 != 78 && i29 != 79 && i29 != 181 && i29 != 182) {
                            switch (i29) {
                                case 13:
                                    break;
                                case 14:
                                    i27 = 7;
                                    break;
                                case 15:
                                    i27 = 2;
                                    break;
                                default:
                                    switch (i29) {
                                        case 21:
                                            break;
                                        default:
                                            switch (i29) {
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                    break;
                                                case 30:
                                                    break;
                                                default:
                                                    i27 = 11;
                                                    break;
                                            }
                                        case 22:
                                        case 23:
                                        case 24:
                                            i27 = 10;
                                            break;
                                    }
                            }
                        } else {
                            i27 = 12;
                        }
                    }
                }
            }
            i27 = 1;
        } else {
            i27 = 3;
        }
        java.util.ArrayList arrayList = activityC16872x6384268a.M;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size2 = activityC16872x6384268a.Q.size();
        if (size2 > 0) {
            for (int i37 = 0; i37 < size2; i37++) {
                sb6.append((java.lang.String) activityC16872x6384268a.Q.get(i37));
                if (i37 < size2 - 1) {
                    sb6.append("#");
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int size3 = arrayList.size();
        if (size3 > 0) {
            for (int i38 = 0; i38 < size3; i38++) {
                sb7.append((java.lang.String) arrayList.get(i38));
                if (i38 < size3 - 1) {
                    sb7.append("#");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18713, activityC16872x6384268a.f235393v, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - activityC16872x6384268a.I1), java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).O(false, c01.e2.f118665p, c01.z1.r(), "weixin", "helper_entry", "filehelper")), java.lang.Integer.valueOf(activityC16872x6384268a.K1), sb7.toString(), sb6, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(activityC16872x6384268a.L1), 0, java.lang.Integer.valueOf(activityC16872x6384268a.E[0]), java.lang.Integer.valueOf(activityC16872x6384268a.E[1]), java.lang.Integer.valueOf(activityC16872x6384268a.E[2]), java.lang.Integer.valueOf(activityC16872x6384268a.E[3]), java.lang.Integer.valueOf(activityC16872x6384268a.E[4]), java.lang.Integer.valueOf(activityC16872x6384268a.E[5]), java.lang.Integer.valueOf(activityC16872x6384268a.F[0]), java.lang.Integer.valueOf(activityC16872x6384268a.F[1]), java.lang.Integer.valueOf(activityC16872x6384268a.F[2]));
    }
}
