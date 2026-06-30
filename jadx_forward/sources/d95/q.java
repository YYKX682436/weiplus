package d95;

/* loaded from: classes12.dex */
public final class q implements com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer {

    /* renamed from: a, reason: collision with root package name */
    public static d95.v f309234a = new d95.v();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f309235b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f309236c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f309237d;

    static {
        d95.q qVar = new d95.q();
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106632x4d50bee3(f309234a.f309240a);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106621x6a99b7ff(f309234a.f309241b);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.m106589x75b7d30d(qVar);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40963x40b15f2e(new d95.r());
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new d95.s());
        f309237d = java.lang.System.nanoTime() % 10 == 0;
    }

    public static com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b a(java.lang.String str, java.util.List list, int i17) {
        java.lang.String str2;
        f309236c = !com.p314xaae8f345.mm.vfs.w6.j(str);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b(str);
        if ((i17 & 16) != 0) {
            c26918x6e83759b.m106688x8d3f07c(false);
            c26918x6e83759b.m106695x78bda44("SyncCheckpoint", new d95.C28210x33e9d0(), com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ConfigPriority.highest);
        }
        if ((i17 & 1) != 0) {
            int h17 = gm0.j1.b().h();
            java.util.Iterator it = com.p314xaae8f345.mm.p2623xe0b293cc.C21319x25fea65.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (java.lang.String) it.next();
                byte[] bytes = kk.k.g((str2 + h17).getBytes()).substring(0, 7).getBytes();
                if ((i17 & 2) != 0) {
                    c26918x6e83759b.m106691x2989b212(bytes, 4096, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion.version1);
                    if (c26918x6e83759b.m106653x20c2b23a()) {
                        break;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewDB", "Tried imei '" + str2 + "' and pageSize 4096 failed: " + str);
                }
                c26918x6e83759b.m106691x2989b212(bytes, 1024, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion.version1);
                if (c26918x6e83759b.m106653x20c2b23a()) {
                    break;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NewDB", "Tried imei '" + str2 + "' and pageSize 1024 failed: " + str);
            }
            if (str2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewDB", "Corruption on open: " + str);
                jx3.f fVar = jx3.f.INSTANCE;
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c26918x6e83759b.m106673xfb83cc9b());
                java.lang.String str3 = a17.f294812f;
                if (str3 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!a17.f294812f.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.lang.String str4 = a17.f294812f;
                int lastIndexOf = str4.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str4 = str4.substring(lastIndexOf + 1);
                }
                fVar.d(22323, str4, 0, "wcdb2Open", 0, 0, android.os.Build.FINGERPRINT);
                if ((i17 & 4) != 0) {
                    d95.f.r(str);
                } else {
                    c26918x6e83759b.m106685xed1b8453();
                }
                c26918x6e83759b.m106691x2989b212(kk.k.g((wo.w0.g(true) + h17).getBytes()).substring(0, 7).getBytes(), (i17 & 2) == 0 ? 1024 : 4096, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.CipherVersion.version1);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewDB", "Use imei '" + str2 + "': " + str);
            }
        }
        if ((i17 & 4) == 0) {
            c26918x6e83759b.m106698x2c87cbe5(new d95.u(list));
        } else {
            c26918x6e83759b.m106698x2c87cbe5(new d95.w(list));
        }
        if ((i17 & 8) != 0) {
            c26918x6e83759b.m106704x1fc5b9ab(new f95.l(c26918x6e83759b));
        }
        if (list != null) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it6.next();
                c26918x6e83759b.m106786xe1f0e832((java.lang.String) pair.first, (com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7) pair.second);
            }
        }
        return c26918x6e83759b;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.ExceptionTracer
    /* renamed from: onTrace */
    public void mo106727xb05dc6a6(com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 c26903x69761325) {
        int i17 = d95.t.f309238a[c26903x69761325.f57832x6219b84.ordinal()];
        if (i17 == 1 || i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WCDB", c26903x69761325.m106376xbb763b47());
            if (f309237d) {
                java.lang.String sql = c26903x69761325.sql();
                jx3.f.INSTANCE.d(14225, 0, c26903x69761325.f57830x2eaded, java.lang.Long.valueOf(c26903x69761325.tag()), 0, c26903x69761325.m106373x9341c427(), c26903x69761325.m106374x38eb0007(), sql == null ? "" : sql.replace(',', ';'), c26903x69761325.m106375x346425());
                return;
            }
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WCDB", c26903x69761325.m106376xbb763b47());
        } else {
            if (i17 != 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WCDB", c26903x69761325.m106376xbb763b47());
        }
    }
}
