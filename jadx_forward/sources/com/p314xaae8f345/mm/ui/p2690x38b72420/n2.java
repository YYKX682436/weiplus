package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 f288571e;

    public n2(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948, long j17) {
        this.f288571e = activityC22295xcc682948;
        this.f288570d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f c6829x19be670f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6829x19be670f();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22295xcc682948 activityC22295xcc682948 = this.f288571e;
        java.util.List list = activityC22295xcc682948.Y;
        c6829x19be670f.p(activityC22295xcc682948.f287918t);
        activityC22295xcc682948.getClass();
        long j17 = 0;
        c6829x19be670f.f141499e = 0L;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (activityC22295xcc682948.f287927y1.contains((java.lang.String) it.next())) {
                i17++;
            }
        }
        c6829x19be670f.f141501g = i17;
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (activityC22295xcc682948.f287929z1.contains((java.lang.String) it6.next())) {
                j17++;
            }
        }
        c6829x19be670f.f141503i = j17;
        java.util.Iterator it7 = arrayList.iterator();
        int i18 = 0;
        while (it7.hasNext()) {
            if (activityC22295xcc682948.B1.contains((java.lang.String) it7.next())) {
                i18++;
            }
        }
        c6829x19be670f.f141502h = i18;
        java.util.Iterator it8 = arrayList.iterator();
        int i19 = 0;
        while (it8.hasNext()) {
            if (activityC22295xcc682948.A1.contains((java.lang.String) it8.next())) {
                i19++;
            }
        }
        c6829x19be670f.f141500f = i19;
        c6829x19be670f.f141507m = java.lang.System.currentTimeMillis() - activityC22295xcc682948.f287923x0;
        c6829x19be670f.f141508n = activityC22295xcc682948.f287926y0;
        long j18 = this.f288570d;
        c6829x19be670f.f141509o = j18;
        c6829x19be670f.f141504j = activityC22295xcc682948.f287908l1;
        int intExtra = activityC22295xcc682948.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra > 0) {
            c6829x19be670f.f141512r = 22L;
        }
        java.util.Iterator it9 = arrayList.iterator();
        int i27 = 0;
        while (it9.hasNext()) {
            if (!activityC22295xcc682948.X.contains((java.lang.String) it9.next())) {
                i27++;
            }
        }
        java.util.Iterator it10 = activityC22295xcc682948.X.iterator();
        int i28 = 0;
        while (it10.hasNext()) {
            if (!arrayList.contains((java.lang.String) it10.next())) {
                i28++;
            }
        }
        long j19 = j17;
        c6829x19be670f.f141510p = 1L;
        java.lang.String trim = activityC22295xcc682948.f287902d.m79028xfb85ada3().toString().trim();
        if (trim == null) {
            trim = "";
        }
        if (x51.t1.b(activityC22295xcc682948.B)) {
            if (!activityC22295xcc682948.K) {
                activityC22295xcc682948.f287914p1 = 3;
            } else if (x51.t1.b(activityC22295xcc682948.A)) {
                if (trim.equals(activityC22295xcc682948.A)) {
                    activityC22295xcc682948.f287914p1 = 3;
                } else {
                    activityC22295xcc682948.f287914p1 = 2;
                }
            } else if (activityC22295xcc682948.A.equals(trim)) {
                activityC22295xcc682948.f287914p1 = 1;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                activityC22295xcc682948.f287914p1 = 3;
            } else {
                activityC22295xcc682948.f287914p1 = 2;
            }
        } else if (activityC22295xcc682948.B.equals(trim)) {
            activityC22295xcc682948.f287914p1 = 3;
        } else {
            activityC22295xcc682948.f287914p1 = 2;
        }
        c6829x19be670f.f141511q = activityC22295xcc682948.f287914p1;
        c6829x19be670f.f141506l = i27;
        c6829x19be670f.f141505k = i28;
        c6829x19be670f.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.ContactRemarkInfoModUI", "22865 setAddedLabelCnt = " + i27 + ",setRemovedLabelCnt = " + i28 + ",source = " + intExtra + ",oriLabelCnt = " + activityC22295xcc682948.f287908l1 + ",opResult = " + j18 + ",totalLabelCnt = " + activityC22295xcc682948.f287926y0 + ",selectNewLabelCnt = " + i19 + ",selectAddLabelCnt = " + i18 + ",addRemarkType = " + activityC22295xcc682948.f287914p1 + ",scene= 1,newLebalCountBySearch = " + i17 + ",searchAddLabelCnt = " + j19);
    }
}
