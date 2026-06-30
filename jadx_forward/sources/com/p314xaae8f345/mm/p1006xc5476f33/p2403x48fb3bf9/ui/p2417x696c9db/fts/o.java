package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes16.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f266082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f266083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f266084i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266085m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f266086n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266087o;

    public o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4, long j17, java.lang.String str5) {
        this.f266079d = str;
        this.f266080e = str2;
        this.f266081f = str3;
        this.f266082g = i17;
        this.f266083h = i18;
        this.f266084i = i19;
        this.f266085m = str4;
        this.f266086n = j17;
        this.f266087o = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6449x74744cf5 c6449x74744cf5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6449x74744cf5();
        c6449x74744cf5.f137887d = c6449x74744cf5.b("SessionId", this.f266079d, true);
        c6449x74744cf5.f137888e = c6449x74744cf5.b("SearchId", this.f266080e, true);
        c6449x74744cf5.f137889f = c6449x74744cf5.b("RequestId", this.f266081f, true);
        c6449x74744cf5.f137890g = this.f266082g;
        c6449x74744cf5.f137891h = this.f266083h;
        c6449x74744cf5.f137892i = this.f266084i;
        c6449x74744cf5.f137893j = java.lang.System.currentTimeMillis();
        c6449x74744cf5.f137894k = c6449x74744cf5.b("FeatureInfo", this.f266085m, true);
        c6449x74744cf5.f137897n = this.f266086n;
        c6449x74744cf5.f137898o = c6449x74744cf5.b("ParentSearchId", this.f266087o, true);
        c6449x74744cf5.k();
        su4.k3.m(c6449x74744cf5);
    }
}
