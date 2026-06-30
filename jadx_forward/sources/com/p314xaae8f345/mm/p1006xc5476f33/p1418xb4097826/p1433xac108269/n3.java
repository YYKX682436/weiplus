package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3 f183932a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3();

    public final boolean a() {
        return ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).N6();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7 A[Catch: Exception -> 0x01ce, TryCatch #1 {Exception -> 0x01ce, blocks: (B:33:0x00e3, B:35:0x00f7, B:38:0x00fe, B:43:0x010a, B:45:0x0129, B:47:0x0168, B:59:0x017f), top: B:32:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a A[Catch: Exception -> 0x01ce, TryCatch #1 {Exception -> 0x01ce, blocks: (B:33:0x00e3, B:35:0x00f7, B:38:0x00fe, B:43:0x010a, B:45:0x0129, B:47:0x0168, B:59:0x017f), top: B:32:0x00e3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(r45.fr0 r31, float r32, java.lang.Integer r33, int r34) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.b(r45.fr0, float, java.lang.Integer, int):int");
    }

    public final void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, boolean z17) {
        boolean z18;
        boolean a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        if (((d85.d1) m0Var).Ri(g0Var, d85.f0.f308696n)) {
            if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(g0Var, d85.f0.f308697o)) {
                z18 = true;
                a17 = a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "requestLocationPermission switchOpen=" + z18 + " checkLocationPermission=" + a17 + " needReasonTitle=" + z17);
                if (a17 && !z18) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/FinderLbsManager", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/FinderLbsManager", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).S6(activity, z17);
            }
        }
        z18 = false;
        a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "requestLocationPermission switchOpen=" + z18 + " checkLocationPermission=" + a17 + " needReasonTitle=" + z17);
        if (a17) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(activity, "com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/FinderLbsManager", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/assist/FinderLbsManager", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((ey2.k0) ((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class))).S6(activity, z17);
    }

    public final boolean d() {
        final java.lang.Object obj = new java.lang.Object();
        try {
            synchronized (obj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "start syncWaitLbs");
                final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5504xb406463a>(a0Var) { // from class: com.tencent.mm.plugin.finder.assist.FinderLbsManager$syncWaitLbs$1$listener$1
                    {
                        this.f39173x3fe91575 = 825179210;
                    }

                    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                    /* renamed from: callback */
                    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5504xb406463a c5504xb406463a) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5504xb406463a event = c5504xb406463a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                        mo48814x2efc64();
                        java.lang.Object obj2 = obj;
                        synchronized (obj2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "notify syncWaitLbs");
                            obj2.notifyAll();
                        }
                        return true;
                    }
                }.mo48813x58998cd();
                if (!ya2.o1.t4((ya2.o1) pf5.u.f435469a.e(zy2.b6.class).c(ya2.o1.class), true, null, 2, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "syncWaitLbs no permission");
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "wait syncWaitLbs");
                obj.wait(5000L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLbsManager", "syncWaitLbs ok");
                return true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderLbsManager", th6, "syncWaitLbs exception", new java.lang.Object[0]);
            return false;
        }
    }

    public final r45.ze2 e(r45.c64 c64Var, float f17, float f18, java.lang.String str) {
        r45.du5 du5Var;
        java.lang.String str2 = null;
        if (c64Var == null) {
            return null;
        }
        r45.ze2 ze2Var = new r45.ze2();
        ze2Var.set(0, java.lang.Float.valueOf(f17));
        ze2Var.set(1, java.lang.Float.valueOf(f18));
        ze2Var.set(2, str);
        ze2Var.set(3, c64Var.f452844e);
        java.util.LinkedList linkedList = c64Var.f452849m;
        if (linkedList != null && (du5Var = (r45.du5) kz5.n0.Z(linkedList)) != null) {
            str2 = du5Var.f454289d;
        }
        ze2Var.set(4, str2);
        ze2Var.set(5, c64Var.f452843d);
        ze2Var.set(6, java.lang.Integer.valueOf(c64Var.f452852p));
        return ze2Var;
    }
}
