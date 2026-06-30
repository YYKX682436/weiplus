package p3335x340bc8.p3336x27ae93cd.p3337x414ef28f;

/* renamed from: oicq.wlogin_sdk.request.WloginAllSigInfo */
/* loaded from: classes13.dex */
public class C29271xdf4abf50 implements java.io.Serializable, java.lang.Cloneable {

    /* renamed from: serialVersionUID */
    private static final long f73068x3a3ed56c = 1;

    /* renamed from: _useInfo */
    public p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492 f73071x83b82996 = new p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29274xba9fa492();

    /* renamed from: _tk_map */
    public java.util.TreeMap<java.lang.Long, p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d> f73069x6d72ccb3 = new java.util.TreeMap<>();

    /* renamed from: _uin */
    public long f73070x2cf39b = 0;

    /* renamed from: get_clone */
    public p3335x340bc8.p3336x27ae93cd.p3337x414ef28f.C29271xdf4abf50 m151441x43747734() {
        try {
            return (p3335x340bc8.p3336x27ae93cd.p3337x414ef28f.C29271xdf4abf50) clone();
        } catch (java.lang.Exception e17) {
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.a(e17.toString());
            return null;
        }
    }

    /* renamed from: put_siginfo */
    public int m151442x1a72bcf(long j17, long j18, long j19, long j27, long j28, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12, byte[][] bArr13) {
        p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d c29273x78a22b4d = this.f73069x6d72ccb3.get(new java.lang.Long(j17));
        java.util.TreeMap<java.lang.Long, p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d> treeMap = this.f73069x6d72ccb3;
        if (c29273x78a22b4d != null) {
            treeMap.put(new java.lang.Long(j17), c29273x78a22b4d.Set(j18, j19, j27, j28, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
            return 0;
        }
        treeMap.put(new java.lang.Long(j17), new p3335x340bc8.p3336x27ae93cd.p3338xd3ab5596.C29273x78a22b4d(j18, j19, j27, j28, bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10, bArr11, bArr12, bArr13));
        return 0;
    }
}
