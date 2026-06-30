package hr3;

/* loaded from: classes11.dex */
public class pg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f365433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365434e;

    public pg(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9, long j17) {
        this.f365434e = activityC16871x34c232c9;
        this.f365433d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365434e;
        if (activityC16871x34c232c9.K == null) {
            activityC16871x34c232c9.K = new java.util.ArrayList();
        }
        if (activityC16871x34c232c9.f235357p0 == null) {
            activityC16871x34c232c9.f235357p0 = new java.util.ArrayList();
        }
        if (activityC16871x34c232c9.f235357p0 == null) {
            activityC16871x34c232c9.f235357p0 = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = activityC16871x34c232c9.K;
        c6829x19be670f.p(activityC16871x34c232c9.f235359q);
        long j17 = 0;
        c6829x19be670f.f141499e = activityC16871x34c232c9.W ? 1L : 0L;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            if (activityC16871x34c232c9.f235367x0.contains((java.lang.String) it.next())) {
                i18++;
            }
        }
        c6829x19be670f.f141501g = i18;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (activityC16871x34c232c9.f235370y0.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        c6829x19be670f.f141503i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i19 = 0;
        while (it7.hasNext()) {
            if (activityC16871x34c232c9.f235358p1.contains((java.lang.String) it7.next())) {
                i19++;
            }
        }
        c6829x19be670f.f141502h = i19;
        java.util.Iterator it8 = arrayList.iterator();
        int i27 = 0;
        while (it8.hasNext()) {
            if (activityC16871x34c232c9.f235352l1.contains((java.lang.String) it8.next())) {
                i27++;
            }
        }
        c6829x19be670f.f141500f = i27;
        c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - activityC16871x34c232c9.D1;
        c6829x19be670f.f141508n = activityC16871x34c232c9.X;
        long j18 = this.f365433d;
        c6829x19be670f.f141509o = j18;
        c6829x19be670f.f141504j = activityC16871x34c232c9.Y;
        java.util.Iterator it9 = arrayList.iterator();
        int i28 = 0;
        while (it9.hasNext()) {
            if (!activityC16871x34c232c9.f235357p0.contains((java.lang.String) it9.next())) {
                i28++;
            }
        }
        java.util.Iterator it10 = activityC16871x34c232c9.f235357p0.iterator();
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i17++;
            }
        }
        c6829x19be670f.f141510p = activityC16871x34c232c9.f235364v ? 4L : 2L;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = activityC16871x34c232c9.f235350h;
        java.lang.String trim = (c21503x6e5a020a == null || c21503x6e5a020a.m79028xfb85ada3() == null || activityC16871x34c232c9.f235350h.m79028xfb85ada3().toString() == null) ? "" : activityC16871x34c232c9.f235350h.m79028xfb85ada3().toString().trim();
        java.lang.String str = trim != null ? trim : "";
        if (x51.t1.b(activityC16871x34c232c9.U)) {
            if (!activityC16871x34c232c9.S) {
                activityC16871x34c232c9.V = 3;
            } else if (x51.t1.b(activityC16871x34c232c9.T)) {
                if (str.equals(activityC16871x34c232c9.T)) {
                    activityC16871x34c232c9.V = 3;
                } else {
                    activityC16871x34c232c9.V = 2;
                }
            } else if (activityC16871x34c232c9.T.equals(str)) {
                activityC16871x34c232c9.V = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                activityC16871x34c232c9.V = 3;
            } else {
                activityC16871x34c232c9.V = 2;
            }
        } else if (activityC16871x34c232c9.U.equals(str)) {
            activityC16871x34c232c9.V = 3;
        } else {
            activityC16871x34c232c9.V = 2;
        }
        c6829x19be670f.f141511q = activityC16871x34c232c9.V;
        c6829x19be670f.f141506l = i28;
        c6829x19be670f.f141505k = i17;
        c6829x19be670f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "22865 setAddedLabelCnt = " + i28 + ",setRemovedLabelCnt = " + i17 + ",oriLabelCnt = " + activityC16871x34c232c9.Y + ",opResult = " + j18 + ",totalLabelCnt = " + activityC16871x34c232c9.X + ",selectNewLabelCnt = " + i27 + ",selectAddLabelCnt = " + i19 + ",addRemarkType = " + activityC16871x34c232c9.V + ",scene= 2,newLebalCountBySearch = " + i18 + ",searchAddLabelCnt = " + j17);
    }
}
