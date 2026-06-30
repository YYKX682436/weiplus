package pz3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final pz3.c f440715a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f440716b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f440717c;

    static {
        pz3.c cVar = new pz3.c();
        f440715a = cVar;
        java.util.ArrayList d17 = kz5.c0.d("https://c.weixin.com/g/");
        f440716b = d17;
        java.util.ArrayList d18 = kz5.c0.d("https://work.weixin.qq.com/gm/");
        f440717c = d18;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_scan_openim_normal_room_report_url_prefix, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi);
        cVar.a(Zi, d17);
        java.lang.String Zi2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_scan_openim_multi_room_report_url_prefix, "", true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Zi2);
        cVar.a(Zi2, d18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "initScanOpenIMReporter normalRoomUrlList: " + Zi + ", multiRoomUrlList: " + Zi2);
    }

    public final void a(java.lang.String str, java.util.ArrayList arrayList) {
        for (java.lang.String str2 : r26.n0.f0(str, new java.lang.String[]{";"}, false, 0, 6, null)) {
            if ((str2.length() > 0) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
    }

    public final void b(java.lang.String str, int i17, r45.bx5 bx5Var) {
        boolean z17;
        boolean z18;
        java.lang.Integer num;
        if (str == null) {
            return;
        }
        java.util.Iterator it = f440716b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.lang.String str2 = (java.lang.String) it.next();
            if (r26.i0.y(str, str2, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "isNormalRoomUrl isNormalRoomUrl: " + str + ", prefix: " + str2);
                z17 = true;
                break;
            }
        }
        if (z17) {
            num = 1;
        } else {
            java.util.Iterator it6 = f440717c.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z18 = false;
                    break;
                }
                java.lang.String str3 = (java.lang.String) it6.next();
                if (r26.i0.y(str, str3, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "isMultiRoomUrl isMultiRoomUrl: " + str + ", prefix: " + str3);
                    z18 = true;
                    break;
                }
            }
            num = z18 ? 2 : null;
        }
        if (num != null) {
            int intValue = num.intValue();
            r45.fw5 fw5Var = new r45.fw5();
            fw5Var.f456186d = i17;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(bx5Var != null ? bx5Var.f452666e : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "buildSearchContactContext getA8KeyScene: %s, subScene: %s", objArr);
            if (bx5Var != null) {
                fw5Var.f456187e = bx5Var.f452666e;
                java.lang.String str4 = bx5Var.f452667f;
                fw5Var.f456188f = str4;
                fw5Var.f456189g = bx5Var.f452668g;
                fw5Var.f456190h = bx5Var.f452669h;
                fw5Var.f456191i = bx5Var.f452670i;
                if (str4 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "buildSearchContactContext search_context: %s", str4);
                }
                r45.vm4 vm4Var = bx5Var.f452668g;
                if (vm4Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "buildSearchContactContext miniprogramContext: %s, %s", vm4Var.f469893d, java.lang.Integer.valueOf(vm4Var.f469894e));
                }
                r45.u2 u2Var = bx5Var.f452669h;
                if (u2Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "buildSearchContactContext adContext: %s, %s", java.lang.Integer.valueOf(u2Var.f468485d), java.lang.Long.valueOf(bx5Var.f452669h.f468486e));
                }
                r45.nu3 nu3Var = bx5Var.f452670i;
                if (nu3Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "buildSearchContactContext h5Context: %s", nu3Var.f463218d);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanOpenIMReporter", "reportJoinOpenIMRoom url: " + str + ", reportType: " + intValue);
            new pz3.a(intValue, str, fw5Var).l().q(pz3.b.f440714a);
        }
    }
}
