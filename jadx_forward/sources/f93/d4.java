package f93;

/* loaded from: classes11.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 f341845d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868) {
        this.f341845d = activityC16172xa598f868;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List<java.lang.String> i17;
        java.util.ArrayList k17 = b93.r.wi().k1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16172xa598f868 activityC16172xa598f868 = this.f341845d;
        activityC16172xa598f868.C = k17;
        if (activityC16172xa598f868.f224829J) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = activityC16172xa598f868.D.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!activityC16172xa598f868.C.contains(str)) {
                    arrayList2.add(str);
                }
            }
            if (activityC16172xa598f868.E) {
                com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) c01.d9.b().B()).z0(activityC16172xa598f868.f224844v);
                if (z07 != null) {
                    activityC16172xa598f868.f224845w = z07.f66693x91130dba;
                    i17 = ((b93.b) c93.a.a()).f(activityC16172xa598f868.f224845w);
                } else {
                    i17 = null;
                }
            } else {
                activityC16172xa598f868.f224845w = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC16172xa598f868.f224844v, true).D0();
                i17 = ((b93.b) c93.a.a()).i(activityC16172xa598f868.f224845w);
            }
            if (i17 == null) {
                i17 = new java.util.ArrayList();
            }
            java.util.ArrayList arrayList4 = activityC16172xa598f868.f224846x;
            if (arrayList4 != null) {
                java.util.Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it6.next();
                    if (!i17.contains(str2)) {
                        arrayList3.add(str2);
                    }
                }
                activityC16172xa598f868.f224846x.clear();
                activityC16172xa598f868.f224846x.addAll(i17);
            }
            java.util.Iterator<java.lang.String> it7 = activityC16172xa598f868.f224835m.mo65204x8c275306().iterator();
            while (it7.hasNext()) {
                java.lang.String next = it7.next();
                if (!arrayList2.contains(next)) {
                    if (!arrayList.contains(next) && !arrayList3.contains(next)) {
                        arrayList.add(next);
                    }
                    if (activityC16172xa598f868.f224848z.contains(next)) {
                        hashSet.add(next);
                    }
                }
            }
            for (java.lang.String str3 : i17) {
                if (!arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
            }
            java.util.Iterator it8 = activityC16172xa598f868.C.iterator();
            while (it8.hasNext()) {
                java.lang.String str4 = (java.lang.String) it8.next();
                if (!arrayList2.contains(str4) && activityC16172xa598f868.f224847y.contains(str4)) {
                    hashSet2.add(str4);
                }
            }
            activityC16172xa598f868.f224847y.clear();
            activityC16172xa598f868.f224847y.addAll(hashSet2);
            activityC16172xa598f868.f224848z.clear();
            activityC16172xa598f868.A.clear();
            activityC16172xa598f868.f224848z.addAll(hashSet);
            activityC16172xa598f868.A.addAll(arrayList);
            activityC16172xa598f868.D.clear();
            activityC16172xa598f868.D.addAll(activityC16172xa598f868.C);
        } else {
            activityC16172xa598f868.A.addAll(activityC16172xa598f868.f224846x);
            activityC16172xa598f868.f224829J = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 c16180x2cdd3130 = activityC16172xa598f868.f224835m;
        java.util.ArrayList arrayList5 = activityC16172xa598f868.A;
        c16180x2cdd3130.r(arrayList5, arrayList5);
        if (activityC16172xa598f868.f224840r != null) {
            java.util.ArrayList arrayList6 = activityC16172xa598f868.C;
            if (arrayList6 == null || arrayList6.size() <= 0) {
                activityC16172xa598f868.f224840r.r(activityC16172xa598f868.A, activityC16172xa598f868.C);
                if (activityC16172xa598f868.I) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 0, 0);
                    activityC16172xa598f868.I = false;
                }
            } else {
                if (activityC16172xa598f868.E) {
                    activityC16172xa598f868.f224840r.r(activityC16172xa598f868.A, activityC16172xa598f868.C);
                } else {
                    activityC16172xa598f868.f224840r.r(activityC16172xa598f868.A, activityC16172xa598f868.C);
                }
                if (activityC16172xa598f868.I) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 0, 1);
                    activityC16172xa598f868.I = false;
                }
            }
        }
        java.util.ArrayList arrayList7 = activityC16172xa598f868.f224846x;
        activityC16172xa598f868.getClass();
        if (arrayList7 != null && arrayList7.size() > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new f93.a4(activityC16172xa598f868), 50L);
        }
        activityC16172xa598f868.d7(f93.n4.Normal);
    }
}
