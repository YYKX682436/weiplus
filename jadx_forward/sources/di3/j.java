package di3;

/* loaded from: classes10.dex */
public class j implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di3.n f314257d;

    public j(di3.n nVar) {
        this.f314257d = nVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        byte[] bArr2;
        java.util.List list;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6 = bArr;
        di3.n nVar = this.f314257d;
        boolean z17 = true;
        if (!nVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCamera", "onPreviewFrame: %s %s", bArr6, nVar.f314274h);
            this.f314257d.B = true;
        }
        if (bArr6 == null || bArr6.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightCamera", "onPreviewFrame, frame data is null!!");
            return;
        }
        xp1.a aVar = this.f314257d.f314289z;
        if (aVar.f537403c == 0) {
            aVar.f537402b++;
            aVar.f537401a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(wo.r.d(), 0);
        }
        int i17 = aVar.f537403c + 1;
        aVar.f537403c = i17;
        if (i17 >= 90) {
            i17 = 0;
        }
        aVar.f537403c = i17;
        if (this.f314257d.L || (list = this.f314257d.A) == null || ((java.util.ArrayList) list).size() <= 0) {
            bArr2 = bArr6;
        } else {
            di3.n nVar2 = this.f314257d;
            android.graphics.Point point = nVar2.f314286w;
            if (point != null) {
                ei3.x xVar = ei3.x.f334720d;
                byte[] m17 = xVar.m(java.lang.Integer.valueOf(((nVar2.f314272f.f314244c * point.y) * 3) / 2));
                this.f314257d.F.a(1L);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                di3.n nVar3 = this.f314257d;
                di3.g0 g0Var = nVar3.f314272f;
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69160x80eaf1f(bArr6, m17, g0Var.f314244c, g0Var.f314243b, nVar3.f314286w.y);
                di3.n nVar4 = this.f314257d;
                android.graphics.Point point2 = nVar4.f314286w;
                int i18 = point2.x;
                if (i18 < nVar4.f314272f.f314244c) {
                    byte[] m18 = xVar.m(java.lang.Integer.valueOf(((i18 * point2.y) * 3) / 2));
                    di3.n nVar5 = this.f314257d;
                    int i19 = nVar5.f314272f.f314244c;
                    android.graphics.Point point3 = nVar5.f314286w;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69161x5e678e98(m17, m18, i19, point3.x, point3.y);
                    xVar.o(m17);
                    m17 = m18;
                }
                this.f314257d.G.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                if (!this.f314257d.Q) {
                    elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    di3.n nVar6 = this.f314257d;
                    android.graphics.Point point4 = nVar6.f314286w;
                    int i27 = point4.x;
                    int i28 = point4.y;
                    int i29 = nVar6.f314277n.f529247b;
                    if (i29 != 270 && i29 != 90) {
                        z17 = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69208x53f0f18e(m17, i27, i28, z17);
                    this.f314257d.H.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                }
                boolean a17 = di3.n.a(this.f314257d, m17);
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
                if (a17) {
                    this.f314257d.I.a(elapsedRealtime2);
                }
                byte[] bArr7 = m17;
                bArr2 = bArr6;
                bArr6 = bArr7;
            } else {
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                di3.n nVar7 = this.f314257d;
                if (!nVar7.Q) {
                    di3.g0 g0Var2 = nVar7.f314272f;
                    int i37 = g0Var2.f314244c;
                    int i38 = g0Var2.f314243b;
                    int i39 = nVar7.f314277n.f529247b;
                    if (i39 != 270 && i39 != 90) {
                        z17 = false;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69208x53f0f18e(bArr6, i37, i38, z17);
                    this.f314257d.H.a(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
                }
                di3.n nVar8 = this.f314257d;
                if (!nVar8.f314288y || (bArr5 = nVar8.f314287x) == null) {
                    bArr3 = bArr6;
                } else {
                    android.graphics.Point point5 = nVar8.f314285v;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69220x6eddcfb8(bArr6, bArr5, point5.x, nVar8.f314284u.y, point5.y);
                    bArr3 = this.f314257d.f314287x;
                }
                boolean a18 = di3.n.a(this.f314257d, bArr3);
                long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
                if (a18) {
                    this.f314257d.I.a(elapsedRealtime4);
                }
                di3.n nVar9 = this.f314257d;
                if ((!nVar9.f314288y || nVar9.f314287x == null) && a18) {
                    bArr6 = ei3.x.f334720d.m(java.lang.Integer.valueOf(bArr6.length));
                }
                di3.n nVar10 = this.f314257d;
                if (nVar10.f314288y && (bArr4 = nVar10.f314287x) != null) {
                    if (a18) {
                        bArr4 = ei3.x.f334720d.m(java.lang.Integer.valueOf(bArr4.length));
                    }
                    nVar10.f314287x = bArr4;
                }
                bArr2 = bArr6;
                bArr6 = bArr3;
            }
        }
        this.f314257d.K = bArr6;
        di3.n nVar11 = this.f314257d;
        di3.l lVar = nVar11.C;
        if (lVar == di3.l.Preview) {
            nVar11.E.a(1L);
        } else if (lVar == di3.l.Recording) {
            nVar11.D.a(1L);
        }
        this.f314257d.f314274h.a(bArr2);
    }
}
