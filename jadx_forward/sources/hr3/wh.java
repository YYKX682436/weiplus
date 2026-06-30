package hr3;

/* loaded from: classes11.dex */
public class wh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365696e;

    public wh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, long j17) {
        this.f365696e = activityC16872x6384268a;
        this.f365695d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365696e;
        if (activityC16872x6384268a.M == null) {
            activityC16872x6384268a.M = new java.util.ArrayList();
        }
        if (activityC16872x6384268a.f235400y1 == null) {
            activityC16872x6384268a.f235400y1 = new java.util.ArrayList();
        }
        if (activityC16872x6384268a.f235400y1 == null) {
            activityC16872x6384268a.f235400y1 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = activityC16872x6384268a.M;
        c6829x19be670f.p(activityC16872x6384268a.f235393v);
        long j17 = 0;
        c6829x19be670f.f141499e = activityC16872x6384268a.f235396x0 ? 1L : 0L;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (activityC16872x6384268a.f235402z1.contains((java.lang.String) it.next())) {
                i18++;
            }
        }
        c6829x19be670f.f141501g = i18;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (activityC16872x6384268a.A1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        c6829x19be670f.f141503i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i19 = 0;
        while (it7.hasNext()) {
            if (activityC16872x6384268a.C1.contains((java.lang.String) it7.next())) {
                i19++;
            }
        }
        c6829x19be670f.f141502h = i19;
        java.util.Iterator it8 = arrayList.iterator();
        int i27 = 0;
        while (it8.hasNext()) {
            if (activityC16872x6384268a.B1.contains((java.lang.String) it8.next())) {
                i27++;
            }
        }
        c6829x19be670f.f141500f = i27;
        c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - activityC16872x6384268a.I1;
        c6829x19be670f.f141508n = activityC16872x6384268a.f235399y0;
        long j18 = this.f365695d;
        c6829x19be670f.f141509o = j18;
        c6829x19be670f.f141504j = activityC16872x6384268a.f235381l1;
        java.util.Iterator it9 = arrayList.iterator();
        int i28 = 0;
        while (it9.hasNext()) {
            if (!activityC16872x6384268a.f235400y1.contains((java.lang.String) it9.next())) {
                i28++;
            }
        }
        java.util.Iterator it10 = activityC16872x6384268a.f235400y1.iterator();
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i17++;
            }
        }
        c6829x19be670f.f141510p = activityC16872x6384268a.A ? 4L : 2L;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = activityC16872x6384268a.f235379h;
        java.lang.String trim = (c21503x6e5a020a == null || c21503x6e5a020a.m79028xfb85ada3() == null || activityC16872x6384268a.f235379h.m79028xfb85ada3().toString() == null) ? "" : activityC16872x6384268a.f235379h.m79028xfb85ada3().toString().trim();
        java.lang.String str = trim != null ? trim : "";
        if (x51.t1.b(activityC16872x6384268a.Z)) {
            if (!activityC16872x6384268a.X) {
                activityC16872x6384268a.f235386p0 = 3;
            } else if (x51.t1.b(activityC16872x6384268a.Y)) {
                if (str.equals(activityC16872x6384268a.Y)) {
                    activityC16872x6384268a.f235386p0 = 3;
                } else {
                    activityC16872x6384268a.f235386p0 = 2;
                }
            } else if (activityC16872x6384268a.Y.equals(str)) {
                activityC16872x6384268a.f235386p0 = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                activityC16872x6384268a.f235386p0 = 3;
            } else {
                activityC16872x6384268a.f235386p0 = 2;
            }
        } else if (activityC16872x6384268a.Z.equals(str)) {
            activityC16872x6384268a.f235386p0 = 3;
        } else {
            activityC16872x6384268a.f235386p0 = 2;
        }
        c6829x19be670f.f141511q = activityC16872x6384268a.f235386p0;
        c6829x19be670f.f141506l = i28;
        c6829x19be670f.f141505k = i17;
        c6829x19be670f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "22865 setAddedLabelCnt = " + i28 + ",setRemovedLabelCnt = " + i17 + ",oriLabelCnt = " + activityC16872x6384268a.f235381l1 + ",opResult = " + j18 + ",totalLabelCnt = " + activityC16872x6384268a.f235399y0 + ",selectNewLabelCnt = " + i27 + ",selectAddLabelCnt = " + i19 + ",addRemarkType = " + activityC16872x6384268a.f235386p0 + ",scene= 2,newLebalCountBySearch = " + i18 + ",searchAddLabelCnt = " + j17);
    }
}
