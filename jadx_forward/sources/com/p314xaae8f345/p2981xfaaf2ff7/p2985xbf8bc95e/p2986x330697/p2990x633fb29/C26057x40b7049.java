package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MapRouteSectionWithName */
/* loaded from: classes13.dex */
public class C26057x40b7049 {

    /* renamed from: kMaxRoadNameLength */
    public static final int f49560x182735ea = 128;

    /* renamed from: color */
    public int f49561x5a72f63;

    /* renamed from: endNum */
    public int f49562xb29638ab;

    /* renamed from: roadName */
    public java.lang.String f49563xdd45ddcb;

    /* renamed from: startNum */
    public int f49564x4e7c7bc4;

    /* renamed from: byteLength */
    public static int m99633x10c6a20e() {
        return 140;
    }

    /* renamed from: intToBytes */
    private byte[] m99634x165f9bc1(int i17) {
        return new byte[]{(byte) i17, (byte) (i17 >> 8), (byte) (i17 >> 16), (byte) (i17 >> 24)};
    }

    /* renamed from: stringToBytes */
    private byte[] m99635xbf22c95f(java.lang.String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-16LE");
            } catch (java.lang.Exception unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: toBytes */
    public byte[] m99636xb99796b0() {
        byte[] bArr = new byte[m99633x10c6a20e()];
        java.lang.System.arraycopy(m99634x165f9bc1(this.f49564x4e7c7bc4), 0, bArr, 0, 4);
        java.lang.System.arraycopy(m99634x165f9bc1(this.f49562xb29638ab), 0, bArr, 4, 4);
        java.lang.System.arraycopy(m99634x165f9bc1(this.f49561x5a72f63), 0, bArr, 8, 4);
        byte[] m99635xbf22c95f = m99635xbf22c95f(this.f49563xdd45ddcb);
        if (m99635xbf22c95f.length < 128) {
            java.lang.System.arraycopy(m99635xbf22c95f, 0, bArr, 12, m99635xbf22c95f.length);
        } else {
            java.lang.System.arraycopy(m99635xbf22c95f, 0, bArr, 12, 128);
        }
        return bArr;
    }
}
