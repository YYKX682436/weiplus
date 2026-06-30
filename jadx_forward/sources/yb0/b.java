package yb0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final yb0.b f542147a = new yb0.b();

    public static final boolean a(java.lang.String str, java.lang.String str2) {
        java.io.RandomAccessFile randomAccessFile;
        if (str == null || str2 == null) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_enable_apk_clickid_inject_android, -1) != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInjectIdHelper", "inject id , not enable");
            return false;
        }
        java.lang.String c17 = yb0.a.f542145a.c(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInjectIdHelper", "inject id , downloadUrl=" + str2 + "  traceId=" + c17);
        java.lang.String str3 = "";
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("ad-apk-inject-mmkv", 2, null).getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26670x4be6424d.f56131xffdbdee4.concat(str2), "");
        java.lang.Long j17 = string != null ? r26.h0.j(string) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInjectIdHelper", "get offset = " + j17);
        yb0.b bVar = f542147a;
        if (j17 != null && j17.longValue() > 0) {
            if (!(c17 == null || r26.n0.N(c17))) {
                byte[] bytes = c17.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                for (int i17 = 0; i17 < java.lang.Math.max(18 - bytes.length, 0); i17++) {
                    str3 = str3 + ' ';
                }
                if (bytes.length < 18) {
                    bytes = (c17 + str3).getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                }
                try {
                    randomAccessFile = com.p314xaae8f345.mm.vfs.w6.A(com.p314xaae8f345.mm.vfs.z7.a(str), true);
                } catch (java.io.FileNotFoundException e17) {
                    bVar.b(3, r26.p0.E0(r26.i0.v("error=" + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000) + "|url=" + str2, ",", ";", false, 4, null), 1500));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ApkInjectIdHelper", e17, "openRandomAccess error!", new java.lang.Object[0]);
                    randomAccessFile = null;
                }
                try {
                    if (randomAccessFile == null) {
                        bVar.b(3, r26.p0.E0(r26.i0.v("error=" + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000) + "|url=" + str2, ",", ";", false, 4, null), 1500));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ApkInjectIdHelper", "can not readFile!");
                        return false;
                    }
                    try {
                        randomAccessFile.seek(j17.longValue() - 10264);
                        randomAccessFile.write(bytes, 0, bytes.length);
                        vz5.b.a(randomAccessFile, null);
                        bVar.b(5, "inject success");
                        return true;
                    } finally {
                    }
                } catch (java.io.IOException unused) {
                    bVar.b(4, r26.p0.E0(r26.i0.v("error=" + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000) + "|url=" + str2, ",", ";", false, 4, null), 1500));
                    return false;
                }
            }
        }
        java.lang.String E0 = r26.p0.E0(r26.i0.v("error=" + r26.p0.E0(jz5.a.b(new java.lang.Throwable()), 1000) + "|url=" + str2, ",", ";", false, 4, null), 1500);
        boolean z17 = j17 == null || j17.longValue() <= 0;
        boolean z18 = c17 == null || r26.n0.N(c17);
        if (z17 && z18) {
            bVar.b(0, E0);
        } else if (z17) {
            bVar.b(1, E0);
        } else if (z18) {
            bVar.b(2, E0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ApkInjectIdHelper", "get offset null, no inject");
        return false;
    }

    public final void b(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(19789, "ad_apk_inject_report", "" + i17, 0, 0, 0, "" + str);
        g0Var.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46362x7814908, i17);
    }
}
