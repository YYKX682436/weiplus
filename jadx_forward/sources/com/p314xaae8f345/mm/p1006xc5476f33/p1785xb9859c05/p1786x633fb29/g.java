package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g f223998d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f223999a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f224000b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224001c = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.e(this, android.os.Looper.getMainLooper());

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.f fVar, boolean z17) {
        if (fVar != null) {
            this.f224000b.add(fVar);
        }
        if (this.f223999a) {
            return;
        }
        java.lang.System.currentTimeMillis();
        if (s83.b.f486400b.size() == 0 || !z17) {
            java.lang.System.currentTimeMillis();
            java.util.ArrayList b17 = s83.b.b();
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f224001c;
            android.os.Message mo50288x733c63a2 = n3Var.mo50288x733c63a2();
            mo50288x733c63a2.obj = b17;
            n3Var.mo50308x2936bf5f(mo50288x733c63a2);
            this.f223999a = true;
        }
    }
}
