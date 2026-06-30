package ei3;

/* loaded from: classes14.dex */
public class x extends com.p314xaae8f345.mm.p872xbfc2bd01.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ei3.x f334720d = new ei3.x();

    /* renamed from: e, reason: collision with root package name */
    public static int f334721e = 0;

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Object b(java.lang.Comparable comparable) {
        return new byte[((java.lang.Integer) comparable).intValue()];
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public void c() {
        super.c();
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long e(java.lang.Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable f(java.lang.Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return java.lang.Integer.valueOf(bArr.length);
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long g() {
        return 10485760L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public long h() {
        if (f334721e <= 0) {
            f334721e = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getLargeMemoryClass();
        }
        return f334721e >= 512 ? 41943040L : 20971520L;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public java.lang.Comparable i(java.lang.Comparable comparable) {
        return (java.lang.Integer) comparable;
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.g
    public com.p314xaae8f345.mm.p872xbfc2bd01.d j(java.lang.Comparable comparable) {
        return new com.p314xaae8f345.mm.p872xbfc2bd01.h(((java.lang.Integer) comparable).intValue());
    }

    @Override // com.p314xaae8f345.mm.p872xbfc2bd01.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public synchronized byte[] m(java.lang.Integer num) {
        byte[] bArr;
        bArr = (byte[]) super.m(num);
        if (bArr == null) {
            bArr = new byte[num.intValue()];
        }
        return bArr;
    }

    public synchronized void o(byte[] bArr) {
        k(bArr);
    }
}
