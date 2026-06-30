package ts0;

/* loaded from: classes10.dex */
public final class h implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts0.l f503087d;

    public h(ts0.l lVar) {
        this.f503087d = lVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        ts0.l lVar = this.f503087d;
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0) && lVar.f503094z != null) {
                lVar.getClass();
                java.util.List list = lVar.f503093y;
                if (list != null && ((java.util.ArrayList) list).size() > 0) {
                    android.graphics.Point point = lVar.f503070s;
                    if (point != null) {
                        ei3.x xVar = ei3.x.f334720d;
                        int i17 = lVar.f503062k.f314244c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
                        byte[] m17 = xVar.m(java.lang.Integer.valueOf(((i17 * point.y) * 3) / 2));
                        lVar.E.a(1L);
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
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
                        lVar.F.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                        if (!lVar.f503058g) {
                            elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                            android.graphics.Point point8 = lVar.f503070s;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point8);
                            int i37 = point8.x;
                            android.graphics.Point point9 = lVar.f503070s;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point9);
                            int i38 = point9.y;
                            wo.h hVar = lVar.A;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
                            if (hVar.f529247b != 270) {
                                wo.h hVar2 = lVar.A;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar2);
                                if (hVar2.f529247b != 90) {
                                    z17 = false;
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69208x53f0f18e(m17, i37, i38, z17);
                        }
                        boolean N = lVar.N(m17);
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (N) {
                            lVar.G.a(elapsedRealtime2);
                        }
                    } else {
                        if (!lVar.f503058g) {
                            di3.g0 g0Var2 = lVar.f503062k;
                            int i39 = g0Var2.f314244c;
                            int i47 = g0Var2.f314243b;
                            wo.h hVar3 = lVar.A;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar3);
                            if (hVar3.f529247b != 270) {
                                wo.h hVar4 = lVar.A;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar4);
                                if (hVar4.f529247b != 90) {
                                    z17 = false;
                                }
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69208x53f0f18e(bArr, i39, i47, z17);
                        }
                        lVar.N(bArr);
                    }
                }
                lVar.getClass();
                wo.d1 d1Var = lVar.f503094z;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d1Var);
                d1Var.a(bArr);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(lVar.f503091w, "onPreviewFrame, frame data is null!!");
    }
}
