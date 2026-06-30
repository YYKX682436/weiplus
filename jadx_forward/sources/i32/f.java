package i32;

/* loaded from: classes13.dex */
public class f extends i32.e {
    public f(long j17, int i17, int i18, byte[] bArr) {
        super(j17, i17, i18, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "onDeviceRequest deviceId = " + j17 + " seq = " + i17 + " cmdId = " + i18);
    }

    @Override // i32.e
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdInit", "data is null");
            return null;
        }
        o32.f fVar = new o32.f();
        try {
            fVar.mo11468x92b714fd(bArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "------Init Request parse is ok------ ");
            this.f369656e = fVar;
            return fVar;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExDeviceCmdInit", "pase error : " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExDeviceCmdInit", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public void e(int i17, java.lang.String str, byte[] bArr, byte[] bArr2, int i18, int i19) {
        int[] iArr;
        int i27;
        int i28;
        long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExDeviceCmdInit", "------initResponse------ errorCode = %d, errMsg = %s, filter = %s, challenge = %s, initScene = %d, second = %d", java.lang.Integer.valueOf(i17), str, a42.i.a(bArr), a42.i.a(bArr2), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        o32.g gVar = new o32.g();
        o32.e eVar = new o32.e();
        this.f369654c = eVar;
        eVar.f424227d = 0;
        eVar.f424228e = "ok";
        gVar.f424247d = eVar;
        java.lang.String r17 = c01.z1.r();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17)) {
            iArr = null;
        } else {
            java.lang.String lowerCase = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r17).toLowerCase();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "user md5 : [%s]", lowerCase);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lowerCase)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "get hash code failed, value is null or nill");
                j17 = 0;
            } else {
                char[] charArray = lowerCase.toCharArray();
                if (charArray.length > 0) {
                    i28 = 0;
                    for (char c17 : charArray) {
                        i28 = (i28 * 31) + c17;
                    }
                } else {
                    i28 = 0;
                }
                long j18 = i28 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "get int hashcode value = %d, long hashcode = %d", java.lang.Integer.valueOf(i28), java.lang.Long.valueOf(j18));
                j17 = j18;
            }
            iArr = new int[]{(int) ((j17 >> 32) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2), (int) (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & j17)};
        }
        gVar.f424231e = iArr[0];
        gVar.f424232f = iArr[1];
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr2)) {
            if (bArr2 == null || bArr2.length == 0) {
                i27 = 0;
            } else {
                java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                crc32.update(bArr2);
                i27 = (int) crc32.getValue();
            }
            gVar.f424233g = i27;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
            byte b17 = bArr[0];
            if ((b17 & 4) != 0) {
                gVar.f424238o = o45.wf.f424558c;
            }
            if ((b17 & 8) != 0) {
                int i29 = o45.wf.f424556a;
                gVar.f424239p = wo.q.f529318f;
            }
            if ((b17 & 2) != 0) {
                gVar.f424237n = 2;
            }
            if ((b17 & com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) != 0) {
                gVar.f424240q = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            }
            if ((bArr[0] & 32) != 0) {
                java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
                int rawOffset = timeZone.getRawOffset() / 1000;
                int i37 = (timeZone.useDaylightTime() && timeZone.inDaylightTime(new java.util.Date(java.lang.System.currentTimeMillis()))) ? 1 : 0;
                int i38 = (rawOffset / 3600) + i37;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "getTimeZone, rawSecond = %d, dt = %d, re = %d", java.lang.Integer.valueOf(rawOffset), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38));
                gVar.f424241r = i38;
            }
            if ((bArr[0] & 64) != 0) {
                java.lang.String format = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
                int i39 = 7;
                try {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(java.lang.String.valueOf(java.util.Calendar.getInstance().get(7)), 0);
                    if (P != 1) {
                        i39 = P - 1;
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.Util", "parse day failed : %s", e17.getMessage());
                    i39 = 0;
                }
                gVar.f424242s = format + i39;
            }
            if ((bArr[0] & 1) != 0) {
                gVar.f424236m = c01.z1.l();
            }
        }
        gVar.f424234h = i18;
        gVar.f424235i = i19;
        this.f369655d = gVar;
        this.f369653b = (short) 20003;
    }
}
