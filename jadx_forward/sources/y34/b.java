package y34;

/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f540715a;

    public b(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.toString();
        this.f540715a = byteBuffer;
        byteBuffer.position(0);
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean a(byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        if (bArr.length < 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        if (bArr[0] < 53) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (byte b17 : bArr) {
            if (b17 < 48 && b17 != 46) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return false;
            }
            if (b17 > 57 && b17 != 46) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return false;
            }
            if (i17 == 2 && b17 != 46) {
                i19++;
            }
            if (b17 == 46) {
                i17++;
            }
            if (i17 == 0) {
                i18 = (i18 * 10) + (b17 - 48);
            }
        }
        if (i17 < 3 || i18 < 50 || i19 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        return true;
    }

    public java.lang.String b() {
        short b17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byte[] bArr = new byte[8];
        java.nio.ByteBuffer byteBuffer = this.f540715a;
        byteBuffer.get(bArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        java.lang.String str = new java.lang.String(bArr);
        if (!str.startsWith("dex\n")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            return "";
        }
        java.lang.Integer.parseInt(str.substring(4, 7));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        byteBuffer.get(new byte[20]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readBytes", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.Buffers");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFileSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c17 = y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLinkSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLinkOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMapOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        int i17 = byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long c18 = y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTypeIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTypeIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProtoIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setProtoIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFieldIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFieldIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMethodIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMethodIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClassDefsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClassDefsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        byteBuffer.getInt();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDataSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.c(byteBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDataOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeaderSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        y34.a.a(byteBuffer, c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readDexHeader", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStringIdsOff", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStringIdsSize", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexHeader");
        long j17 = i17;
        if (j17 > 50000) {
            j17 = 50000;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.DexParser", "stringIdsOff: " + c18 + ", size:" + j17);
        int i18 = 0;
        while (i18 < j17) {
            y34.a.a(byteBuffer, (i18 * 4) + c18);
            y34.a.a(byteBuffer, y34.a.c(byteBuffer));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            int i19 = 0;
            int i27 = 0;
            do {
                b17 = y34.a.b(byteBuffer);
                i27 |= (b17 & 127) << (i19 * 7);
                i19++;
            } while ((b17 & 128) != 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readVarInts", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            char[] cArr = new char[i27];
            int i28 = 0;
            while (i28 < i27) {
                short b18 = y34.a.b(byteBuffer);
                long j18 = j17;
                if ((b18 & 128) == 0) {
                    cArr[i28] = (char) b18;
                } else if ((b18 & 224) == 192) {
                    cArr[i28] = (char) ((y34.a.b(byteBuffer) & 63) | ((b18 & 31) << 6));
                } else if ((b18 & 240) == 224) {
                    cArr[i28] = (char) (((y34.a.b(byteBuffer) & 63) << 6) | ((b18 & 15) << 12) | (y34.a.b(byteBuffer) & 63));
                }
                char c19 = cArr[i28];
                i28++;
                j17 = j18;
            }
            long j19 = j17;
            java.lang.String str2 = new java.lang.String(cArr);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readString", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            boolean a17 = a(str2.getBytes());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkStr", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
            if (a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.DexParser", "check true: ".concat(str2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
                return str2;
            }
            i18++;
            j17 = j19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdDeviceInfo.ua.DexParser", "not found chrome version");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findChromeVer", "com.tencent.mm.plugin.sns.ad.device.utils.ua.dex.DexParser");
        return "";
    }
}
