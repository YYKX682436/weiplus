package c04;

/* loaded from: classes13.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 f119223a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196) {
        this.f119223a = c17265xca2bb196;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240492a.a(this.f119223a.f240206r);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "tipsImage getResource failed"));
            return null;
        }
        try {
            if (!a17.isRecycled()) {
                a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, (float) java.lang.Math.floor(((a17.getWidth() > a17.getHeight() ? a17.getWidth() : a17.getHeight()) / 2.0d) + 0.5d));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanViewUtils", e17, "decodeRoundBitmap exception", new java.lang.Object[0]);
            a17 = null;
        }
        return a17;
    }
}
