package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection */
/* loaded from: classes13.dex */
public class C26056xa47d77b8 {

    /* renamed from: kMaxRoadNameLength */
    public static final int f49555x182735ea = 32;

    /* renamed from: color */
    public int f49556x5a72f63;

    /* renamed from: endNum */
    public int f49557xb29638ab;

    /* renamed from: roadName */
    public java.lang.String f49558xdd45ddcb;

    /* renamed from: startNum */
    public int f49559x4e7c7bc4;

    /* renamed from: byteLength */
    public static int m99629x10c6a20e() {
        return 140;
    }

    /* renamed from: intToBytes */
    private byte[] m99630x165f9bc1(int i17) {
        return new byte[]{(byte) i17, (byte) (i17 >> 8), (byte) (i17 >> 16), (byte) (i17 >> 24)};
    }

    /* renamed from: stringToBytes */
    private byte[] m99631xbf22c95f(java.lang.String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-16LE");
            } catch (java.lang.Exception unused) {
            }
        }
        return new byte[0];
    }

    /* renamed from: toBytes */
    public byte[] m99632xb99796b0() {
        byte[] bArr = new byte[m99629x10c6a20e()];
        java.lang.System.arraycopy(m99630x165f9bc1(this.f49559x4e7c7bc4), 0, bArr, 0, 4);
        java.lang.System.arraycopy(m99630x165f9bc1(this.f49557xb29638ab), 0, bArr, 4, 4);
        java.lang.System.arraycopy(m99630x165f9bc1(this.f49556x5a72f63), 0, bArr, 8, 4);
        byte[] m99631xbf22c95f = m99631xbf22c95f(this.f49558xdd45ddcb);
        if (m99631xbf22c95f.length < 32) {
            java.lang.System.arraycopy(m99631xbf22c95f, 0, bArr, 12, m99631xbf22c95f.length);
        } else {
            java.lang.System.arraycopy(m99631xbf22c95f, 0, bArr, 12, 32);
        }
        return bArr;
    }
}
