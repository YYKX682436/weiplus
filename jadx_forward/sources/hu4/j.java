package hu4;

/* loaded from: classes9.dex */
public abstract class j {
    public static java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append('0');
            }
            sb6.append(hexString);
        }
        return sb6.toString();
    }

    public static void b(hu4.l lVar) {
        if (lVar.f366767a == -1) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = lVar.f366767a;
        if (elapsedRealtime < j17) {
            lVar.f366767a = elapsedRealtime;
            lVar.f366768b += elapsedRealtime;
            java.lang.String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", java.lang.Long.valueOf(elapsedRealtime), java.lang.Long.valueOf(lVar.f366768b));
        } else {
            lVar.f366768b += elapsedRealtime - j17;
            lVar.f366767a = elapsedRealtime;
        }
    }

    public static byte[] c(java.util.List list) {
        if (list == null) {
            throw new java.lang.IllegalArgumentException("pattern is null");
        }
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i17 = 0; i17 < size; i17++) {
            hu4.k kVar = (hu4.k) list.get(i17);
            bArr[i17] = (byte) ((kVar.f366765a * 3) + kVar.f366766b + 1);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < size; i18++) {
            sb6.append((int) bArr[i18]);
        }
        java.lang.String sb7 = sb6.toString();
        return kk.k.g((kk.k.g((kk.k.g(sb7.getBytes()) + c01.z1.r()).getBytes()) + sb7).getBytes()).getBytes();
    }

    public static byte[] d(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (int i17 = 0; i17 < bArr.length - 1; i17 += 2) {
            byteArrayOutputStream.write(("0123456789abcdef".indexOf(java.lang.Character.toLowerCase(bArr[i17])) << 4) | "0123456789abcdef".indexOf(java.lang.Character.toLowerCase(bArr[i17 + 1])));
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean e() {
        hu4.l lVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        if (c17 == null) {
            lVar = new hu4.l();
        } else {
            java.lang.Object l17 = c17.l(339971, null);
            if (l17 == null) {
                lVar = new hu4.l();
            } else {
                hu4.l lVar2 = new hu4.l();
                lVar2.a(h((java.lang.String) l17));
                lVar = lVar2;
            }
        }
        if (lVar.f366767a != -1) {
            b(lVar);
            long j17 = lVar.f366768b;
            if (j17 / 1000 < 600) {
                hu4.i.i(lVar.f366767a, j17);
                return true;
            }
            hu4.i.f();
        }
        return false;
    }

    public static boolean f() {
        hu4.l a17 = hu4.i.a();
        if (a17.f366767a != -1) {
            b(a17);
            long j17 = a17.f366768b;
            if (j17 / 1000 < 600) {
                hu4.i.h(a17.f366767a, j17);
                return true;
            }
            hu4.i.e();
        }
        return false;
    }

    public static boolean g() {
        if (!gm0.j1.a() || gm0.m.r()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GestureUtil", "not login !!");
            return false;
        }
        r45.q55 c17 = hu4.i.c();
        r45.p55 b17 = hu4.i.b();
        boolean z17 = c17 == null;
        boolean z18 = b17 == null;
        boolean j17 = !z17 ? j(c17) : false;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = c17;
        objArr[1] = java.lang.Integer.valueOf(c17 == null ? -1 : c17.f465230f);
        objArr[2] = java.lang.Boolean.valueOf(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", objArr);
        boolean i17 = !z18 ? i(b17) : false;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = b17;
        objArr2[1] = java.lang.Integer.valueOf(b17 != null ? b17.f464306g : -1);
        objArr2[2] = java.lang.Boolean.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", objArr2);
        try {
            if (!j17) {
                if (i17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
                    return b17.f464306g == 1;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
                return false;
            }
            if (!i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
                return c17.f465230f == 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
            int i18 = c17.f465228d;
            int i19 = b17.f464304e;
            if (i18 > i19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.f464304e));
                return c17.f465230f == 1;
            }
            if (i18 == i19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.f464304e));
                return c17.f465230f == 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.f464304e));
            return b17.f464306g == 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GestureUtil", e17, "isUserSetWalletLock throw an exception.", new java.lang.Object[0]);
            return false;
        }
    }

    public static byte[] h(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i17 = 0;
        while (i17 < str.length()) {
            int i18 = i17 + 2;
            byteArrayOutputStream.write(java.lang.Integer.parseInt(str.substring(i17, i18), 16));
            i17 = i18;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean i(r45.p55 p55Var) {
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        if (p55Var == null || (cu5Var = p55Var.f464307h) == null || (gVar = cu5Var.f453374f) == null) {
            return false;
        }
        byte[] bArr = gVar.f273689a;
        if (bArr.length == 0 || (bArr.length & 1) != 0) {
            return false;
        }
        long longValue = new kk.v(p55Var.f464303d).longValue();
        byte[] d17 = d(bArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(p55Var.f464304e);
        r45.cu5 cu5Var2 = p55Var.f464305f;
        if (cu5Var2.f453375g) {
            sb6.append(new java.lang.String(cu5Var2.f453374f.f273689a));
        }
        sb6.append(longValue);
        int m46308x53e49862 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46308x53e49862(hu4.c.f366758b, sb6.toString().getBytes(), d17);
        java.lang.String.format("verifyPatternBuffer, ret:%d", java.lang.Integer.valueOf(m46308x53e49862));
        return m46308x53e49862 == 1;
    }

    public static boolean j(r45.q55 q55Var) {
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        boolean z17 = false;
        if (q55Var != null && (cu5Var = q55Var.f465229e) != null && (gVar = cu5Var.f453374f) != null) {
            byte[] bArr = gVar.f273689a;
            if (bArr.length != 0 && (bArr.length & 1) == 0) {
                byte[] d17 = d(bArr);
                long longValue = new kk.v(gm0.j1.b().h()).longValue();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(q55Var.f465228d);
                sb6.append(longValue);
                int m46308x53e49862 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46308x53e49862(hu4.c.f366758b, sb6.toString().getBytes(), d17);
                if ((m46308x53e49862 != 1 && q55Var.f465230f == 1) || (m46308x53e49862 == 1 && q55Var.f465230f == 0)) {
                    z17 = true;
                }
                java.lang.String.format("verifyPatternInfo, verifyRes:%d ret:%b", java.lang.Integer.valueOf(m46308x53e49862), java.lang.Boolean.valueOf(z17));
            }
        }
        return z17;
    }
}
