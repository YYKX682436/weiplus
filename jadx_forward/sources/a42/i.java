package a42;

/* loaded from: classes13.dex */
public abstract class i {
    public static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return b(bArr, bArr.length);
    }

    public static java.lang.String b(byte[] bArr, int i17) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (bArr.length < i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.Util", "data length is shorter then print command length");
            i17 = bArr.length;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = bArr[i18] & 255;
            if (i19 < 16) {
                sb6.append("0");
            }
            sb6.append(java.lang.Integer.toHexString(i19));
        }
        return sb6.toString().toUpperCase(java.util.Locale.US);
    }

    public static boolean c(byte[] bArr, int i17, byte[] bArr2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2) || bArr2.length + i17 > bArr.length || i17 < 0 || i17 >= bArr.length) {
            return false;
        }
        int i18 = 0;
        while (i18 < bArr2.length && bArr2[i18] == bArr[i18 + i17]) {
            i18++;
        }
        return i18 == bArr2.length;
    }

    public static int d(android.content.Context context, int i17) {
        int i18 = 0;
        try {
            if (context != null) {
                try {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    ((android.app.Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int height = ((android.app.Activity) context).getWindow().getDecorView().getHeight();
                    i18 = height - rect.height() >= 0 ? height - rect.height() : rect.top;
                } catch (java.lang.Exception e17) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[i18] = e17.toString();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "getStatusHeight err: %s", objArr);
                    return i17;
                }
            }
            return i18 <= 0 ? i17 : i18;
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long e() {
        /*
            java.lang.Class<c25.e> r0 = c25.e.class
            lm0.a r0 = gm0.j1.s(r0)
            c25.e r0 = (c25.e) r0
            com.tencent.mm.plugin.zero.a r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r0
            ip.j r0 = r0.b()
            java.lang.String r1 = "DeviceAutoSyncDuration"
            java.lang.String r0 = r0.d(r1)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            java.lang.String r2 = "MicroMsg.exdevice.Util"
            r3 = 60000(0xea60, double:2.9644E-319)
            if (r1 != 0) goto L36
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L27
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r5
            goto L37
        L27:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "parse string to time out long failed : %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1, r0)
        L36:
            r0 = r3
        L37:
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "now sync time out is %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6, r5)
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L4c
            goto L4d
        L4c:
            r3 = r0
        L4d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a42.i.e():long");
    }

    public static java.lang.String f(long j17) {
        byte[] bArr = new byte[6];
        for (int i17 = 0; i17 < 6; i17++) {
            bArr[i17] = (byte) (j17 >> (40 - (i17 << 3)));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < 6; i18++) {
            if (i18 != 0) {
                sb6.append(":");
            }
            int i19 = bArr[i18] & 255;
            if (i19 < 16) {
                sb6.append("0");
            }
            sb6.append(java.lang.Integer.toHexString(i19));
        }
        return sb6.toString().toUpperCase(java.util.Locale.US);
    }

    public static java.lang.String g(long j17) {
        byte[] bArr = new byte[6];
        for (int i17 = 0; i17 < 6; i17++) {
            bArr[i17] = (byte) (j17 >> (40 - (i17 << 3)));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < 6; i18++) {
            int i19 = bArr[i18] & 255;
            if (i19 < 16) {
                sb6.append("0");
            }
            sb6.append(java.lang.Integer.toHexString(i19));
        }
        return sb6.toString().toUpperCase(java.util.Locale.US);
    }

    public static long h(java.lang.String str) {
        long j17 = 0;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "mac string is null or nil");
            return 0L;
        }
        java.lang.String[] split = str.toUpperCase(java.util.Locale.US).split(":");
        int length = split.length;
        java.lang.Byte[] bArr = new java.lang.Byte[length];
        int i17 = 0;
        for (java.lang.String str2 : split) {
            if (str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "mac string parse fail");
                return 0L;
            }
            int charAt = (((byte) str2.charAt(0)) >= 65 ? (str2.charAt(0) - 'A') + 10 : str2.charAt(0) - '0') << 4;
            byte charAt2 = (byte) str2.charAt(1);
            char charAt3 = str2.charAt(1);
            bArr[i17] = java.lang.Byte.valueOf((byte) ((charAt2 >= 65 ? (charAt3 - 'A') + 10 : charAt3 - '0') | charAt));
            i17++;
        }
        int length2 = split.length - 1;
        for (int i18 = 0; i18 < length; i18++) {
            j17 |= (bArr[i18].longValue() & 255) << (length2 << 3);
            length2--;
        }
        return j17;
    }

    public static java.util.LinkedList i(java.lang.String str) {
        java.lang.String[] split;
        if (str == null || str.length() <= 0 || (split = str.split(",")) == null || split.length <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : split) {
            try {
                linkedList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
            } catch (java.lang.Exception unused) {
            }
        }
        return linkedList;
    }

    public static java.util.UUID j(byte[] bArr) {
        a(bArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "aUUIDByteArray is null or nil");
            return null;
        }
        if (16 != bArr.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "the length (%d) of this byte array is not 16", java.lang.Integer.valueOf(bArr.length));
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(8);
        try {
            allocate.put(bArr, 0, 8);
            allocate.flip();
            allocate2.put(bArr, 8, 8);
            allocate2.flip();
            java.util.UUID uuid = new java.util.UUID(allocate.getLong(), allocate2.getLong());
            uuid.toString();
            return uuid;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "%s", e17.getMessage());
            return null;
        }
    }

    public static java.lang.String k(java.lang.String str) {
        if (str == null || 12 != str.length()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "%s is not server string mac", str);
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < str.length(); i17++) {
            sb6.append(str.charAt(i17));
            if (i17 % 2 != 0 && i17 < str.length() - 1) {
                sb6.append(":");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "%s to %s is ok", str, sb6.toString());
        return sb6.toString();
    }
}
