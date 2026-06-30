package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class u5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 f288741e;

    public u5(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01, long j17) {
        this.f288741e = activityC22313x70d15e01;
        this.f288740d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22313x70d15e01 activityC22313x70d15e01 = this.f288741e;
        java.util.List list = activityC22313x70d15e01.V;
        c6829x19be670f.p(activityC22313x70d15e01.f288005h);
        long j17 = 0;
        c6829x19be670f.f141499e = activityC22313x70d15e01.X ? 1L : 0L;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (activityC22313x70d15e01.f288025y0.contains((java.lang.String) it.next())) {
                i17++;
            }
        }
        c6829x19be670f.f141501g = i17;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (activityC22313x70d15e01.f288007l1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        c6829x19be670f.f141503i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i18 = 0;
        while (it7.hasNext()) {
            if (activityC22313x70d15e01.f288023x1.contains((java.lang.String) it7.next())) {
                i18++;
            }
        }
        c6829x19be670f.f141502h = i18;
        java.util.Iterator it8 = arrayList.iterator();
        int i19 = 0;
        while (it8.hasNext()) {
            if (activityC22313x70d15e01.f288013p1.contains((java.lang.String) it8.next())) {
                i19++;
            }
        }
        c6829x19be670f.f141500f = i19;
        c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - activityC22313x70d15e01.Y;
        c6829x19be670f.f141508n = activityC22313x70d15e01.Z;
        long j18 = this.f288740d;
        c6829x19be670f.f141509o = j18;
        c6829x19be670f.f141504j = activityC22313x70d15e01.f288012p0;
        int intExtra = activityC22313x70d15e01.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            c6829x19be670f.f141512r = 22L;
        }
        java.util.Iterator it9 = arrayList.iterator();
        int i27 = 0;
        while (it9.hasNext()) {
            if (!((java.util.ArrayList) activityC22313x70d15e01.U).contains((java.lang.String) it9.next())) {
                i27++;
            }
        }
        java.util.Iterator it10 = ((java.util.ArrayList) activityC22313x70d15e01.U).iterator();
        int i28 = 0;
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i28++;
            }
        }
        long j19 = j17;
        c6829x19be670f.f141510p = 3L;
        java.lang.String trim = activityC22313x70d15e01.f288001d.m79028xfb85ada3().toString().trim();
        if (trim == null) {
            trim = "";
        }
        if (x51.t1.b(activityC22313x70d15e01.f288014q)) {
            if (!activityC22313x70d15e01.f288015r) {
                activityC22313x70d15e01.Q = 3;
            } else if (x51.t1.b(activityC22313x70d15e01.f288010o)) {
                if (trim.equals(activityC22313x70d15e01.f288010o)) {
                    activityC22313x70d15e01.Q = 3;
                } else {
                    activityC22313x70d15e01.Q = 2;
                }
            } else if (activityC22313x70d15e01.f288010o.equals(trim)) {
                activityC22313x70d15e01.Q = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                activityC22313x70d15e01.Q = 3;
            } else {
                activityC22313x70d15e01.Q = 2;
            }
        } else if (activityC22313x70d15e01.f288014q.equals(trim)) {
            activityC22313x70d15e01.Q = 3;
        } else {
            activityC22313x70d15e01.Q = 2;
        }
        c6829x19be670f.f141511q = activityC22313x70d15e01.Q;
        c6829x19be670f.f141506l = i27;
        c6829x19be670f.f141505k = i28;
        c6829x19be670f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ModRemarkName", "22865 setAddedLabelCnt = " + i27 + ",setRemovedLabelCnt = " + i28 + ",source = " + intExtra + ",oriLabelCnt = " + activityC22313x70d15e01.f288012p0 + ",opResult = " + j18 + ",totalLabelCnt = " + activityC22313x70d15e01.Z + ",selectNewLabelCnt = " + i19 + ",addRemarkType = " + activityC22313x70d15e01.Q + ",scene= 3,selectAddLabelCnt = " + i18 + ",newLebalCountBySearch = " + i17 + ",searchAddLabelCnt = " + j19);
    }
}
