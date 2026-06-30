package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final double f296924a;

    /* renamed from: b, reason: collision with root package name */
    public final double f296925b;

    /* renamed from: c, reason: collision with root package name */
    public final double f296926c;

    /* renamed from: d, reason: collision with root package name */
    public final double f296927d;

    /* renamed from: e, reason: collision with root package name */
    public final double f296928e;

    /* renamed from: f, reason: collision with root package name */
    public final double f296929f;

    public g(double d17, double d18, double d19, double d27) {
        this.f296924a = d17;
        this.f296925b = d19;
        this.f296926c = d18;
        this.f296927d = d27;
        this.f296928e = (d17 + d18) / 2.0d;
        this.f296929f = (d19 + d27) / 2.0d;
    }

    public boolean a(double d17, double d18) {
        return this.f296924a <= d17 && d17 <= this.f296926c && this.f296925b <= d18 && d18 <= this.f296927d;
    }

    public boolean b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.g gVar) {
        return a(gVar.f296924a, gVar.f296926c, gVar.f296925b, gVar.f296927d);
    }

    public boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.h hVar) {
        return a(hVar.f296930a, hVar.f296931b);
    }

    public boolean a(double d17, double d18, double d19, double d27) {
        return d17 < this.f296926c && this.f296924a < d18 && d19 < this.f296927d && this.f296925b < d27;
    }

    public boolean a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a.g gVar) {
        return gVar.f296924a >= this.f296924a && gVar.f296926c <= this.f296926c && gVar.f296925b >= this.f296925b && gVar.f296927d <= this.f296927d;
    }
}
