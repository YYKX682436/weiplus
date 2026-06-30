package ts0;

/* loaded from: classes10.dex */
public final class g implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f503086d;

    public g(ts0.l lVar) {
        this.f503086d = lVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        android.graphics.Point point;
        ts0.l lVar = this.f503086d;
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                if (((java.util.ArrayList) lVar.f503093y).size() <= 0) {
                    wo.d1 d1Var = lVar.f503094z;
                    if (d1Var != null) {
                        d1Var.a(bArr);
                        return;
                    }
                    return;
                }
                lVar.getClass();
                if (((java.util.ArrayList) lVar.f503093y).size() > 0 && (point = lVar.f503070s) != null) {
                    if (point != null && point.x == lVar.f503062k.f314244c) {
                        if (point != null && point.y == lVar.f503062k.f314243b) {
                            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            boolean N = lVar.N(bArr);
                            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (N) {
                                lVar.G.a(elapsedRealtime2);
                            }
                            if (N) {
                                bArr = ei3.x.f334720d.m(java.lang.Integer.valueOf(bArr.length));
                            }
                        }
                    }
                    ei3.x xVar = ei3.x.f334720d;
                    int i17 = lVar.f503062k.f314244c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
                    byte[] m17 = xVar.m(java.lang.Integer.valueOf(((i17 * point.y) * 3) / 2));
                    lVar.E.a(1L);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                    di3.g0 g0Var = lVar.f503062k;
                    int i18 = g0Var.f314244c;
                    int i19 = g0Var.f314243b;
                    android.graphics.Point point2 = lVar.f503070s;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69160x80eaf1f(bArr, m17, i18, i19, point2.y);
                    android.graphics.Point point3 = lVar.f503070s;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point3);
                    if (point3.x < lVar.f503062k.f314244c) {
                        android.graphics.Point point4 = lVar.f503070s;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point4);
                        int i27 = point4.x;
                        android.graphics.Point point5 = lVar.f503070s;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point5);
                        byte[] m18 = xVar.m(java.lang.Integer.valueOf(((i27 * point5.y) * 3) / 2));
                        int i28 = lVar.f503062k.f314244c;
                        android.graphics.Point point6 = lVar.f503070s;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point6);
                        int i29 = point6.x;
                        android.graphics.Point point7 = lVar.f503070s;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point7);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69161x5e678e98(m17, m18, i28, i29, point7.y);
                        xVar.o(m17);
                        m17 = m18;
                    }
                    lVar.F.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
                    boolean N2 = lVar.N(m17);
                    long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
                    if (N2) {
                        lVar.G.a(elapsedRealtime4);
                    }
                }
                wo.d1 d1Var2 = lVar.f503094z;
                if (d1Var2 != null) {
                    d1Var2.a(bArr);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(lVar.f503091w, "onPreviewFrame, frame data is null!!");
    }
}
