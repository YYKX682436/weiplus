package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public class y0 {

    /* renamed from: k, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x0 f267367k = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x0(null);

    /* renamed from: b, reason: collision with root package name */
    public long f267369b;

    /* renamed from: c, reason: collision with root package name */
    public int f267370c;

    /* renamed from: d, reason: collision with root package name */
    public int f267371d;

    /* renamed from: f, reason: collision with root package name */
    public int f267373f;

    /* renamed from: g, reason: collision with root package name */
    public int f267374g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f267375h;

    /* renamed from: i, reason: collision with root package name */
    public int f267376i;

    /* renamed from: j, reason: collision with root package name */
    public int f267377j;

    /* renamed from: a, reason: collision with root package name */
    public long f267368a = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f267372e = "";

    public final int a() {
        int i17 = this.f267376i;
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 8;
        }
        if (i17 != 3) {
            return i17 != 4 ? 3 : 10;
        }
        return 9;
    }

    public final void b(ot0.m1 m1Var, int i17, int i18, int i19) {
        if (m1Var == null || this.f267377j == i17) {
            return;
        }
        this.f267377j = i17;
        if (m1Var.f430121z == -1) {
            try {
                android.net.Uri parse = android.net.Uri.parse(m1Var.f454872d);
                m1Var.f430121z = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
                m1Var.A = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
            } catch (java.lang.Exception unused) {
                m1Var.f430121z = 0L;
            }
        }
        switch (i17) {
            case 2:
            case 7:
            case 8:
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                this.f267369b += currentTimeMillis - this.f267368a;
                this.f267368a = currentTimeMillis;
                break;
            case 3:
            case 4:
            case 9:
            case 10:
                this.f267368a = java.lang.System.currentTimeMillis();
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x0 x0Var = f267367k;
        if (i17 == 3) {
            java.lang.String videoVid = m1Var.f454874f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoVid, "videoVid");
            java.lang.String mpUrl = m1Var.f454872d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mpUrl, "mpUrl");
            x0Var.e(0, videoVid, mpUrl, 141, this.f267374g, 0, i18);
        } else if (i17 == 4) {
            java.lang.String videoVid2 = m1Var.f454874f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoVid2, "videoVid");
            java.lang.String mpUrl2 = m1Var.f454872d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mpUrl2, "mpUrl");
            x0Var.e(1, videoVid2, mpUrl2, 141, this.f267374g, 0, i18);
        } else if (i17 == 10) {
            java.lang.String videoVid3 = m1Var.f454874f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoVid3, "videoVid");
            java.lang.String mpUrl3 = m1Var.f454872d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mpUrl3, "mpUrl");
            x0Var.e(2, videoVid3, mpUrl3, 141, this.f267374g, 0, i18);
        }
        int h17 = ot0.g0.h();
        if (h17 == 100) {
            h17 = -1;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6705x9e2ef4a1 c6705x9e2ef4a1 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6705x9e2ef4a1();
        c6705x9e2ef4a1.f140440e = c6705x9e2ef4a1.b("BizUserName", m1Var.f454881p, true);
        c6705x9e2ef4a1.f140446k = i17;
        c6705x9e2ef4a1.f140444i = c6705x9e2ef4a1.b("VideoId", m1Var.f454874f, true);
        c6705x9e2ef4a1.f140439d = h17;
        c6705x9e2ef4a1.f140441f = m1Var.f430121z;
        c6705x9e2ef4a1.f140442g = m1Var.A;
        c6705x9e2ef4a1.f140443h = i18;
        c6705x9e2ef4a1.f140445j = m1Var.f454877i;
        c6705x9e2ef4a1.f140451p = this.f267373f;
        c6705x9e2ef4a1.f140452q = this.f267374g;
        c6705x9e2ef4a1.f140456u = m1Var.f454878m;
        c6705x9e2ef4a1.f140455t = m1Var.f454879n;
        c6705x9e2ef4a1.B = i19;
        if (this.f267369b == 0 && this.f267368a != 0) {
            this.f267369b = java.lang.System.currentTimeMillis() - this.f267368a;
        }
        c6705x9e2ef4a1.f140448m = this.f267369b;
        c6705x9e2ef4a1.f140450o = this.f267371d;
        c6705x9e2ef4a1.f140447l = java.lang.System.currentTimeMillis() / 1000;
        c6705x9e2ef4a1.f140449n = this.f267370c;
        c6705x9e2ef4a1.f140453r = c6705x9e2ef4a1.b("PlayErrType", this.f267372e, true);
        c6705x9e2ef4a1.f140458w = 2L;
        c6705x9e2ef4a1.f140454s = this.f267375h ? 1L : 0L;
        c6705x9e2ef4a1.f140459x = 1L;
        c6705x9e2ef4a1.k();
        if (i17 == 1 || i17 == 2) {
            this.f267369b = 0L;
            this.f267368a = java.lang.System.currentTimeMillis();
            this.f267371d = 0;
        }
    }
}
