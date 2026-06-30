package r54;

/* loaded from: classes4.dex */
public final class f implements i11.d {

    /* renamed from: d, reason: collision with root package name */
    public final k55.b f474271d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f474272e;

    /* renamed from: f, reason: collision with root package name */
    public final long f474273f;

    /* renamed from: g, reason: collision with root package name */
    public final i11.e f474274g;

    public f(k55.b bVar, java.lang.String str, long j17) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f474274g = i11.h.e();
        this.f474273f = j17;
        this.f474271d = bVar;
        this.f474272e = str;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }

    @Override // i11.d
    public boolean w6(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GeoServerRequester", "the onGetLocation is called, the longitude is " + f17);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            if (android.os.Looper.myLooper() != null) {
                ((i11.h) this.f474274g).m(this);
            } else {
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new r54.e(this));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("result", z17);
            bundle2.putDouble("latitude", f18);
            bundle2.putDouble("longitude", f17);
            bundle2.putDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, d17);
            bundle2.putDouble("accuracy", d18);
            k55.b bVar = this.f474271d;
            if (bVar != null) {
                bVar.m142013x77b46a52(this.f474272e, java.lang.Long.valueOf(this.f474273f), bundle2);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GeoServerRequester", "there is something wrong in onGetLocation");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetLocation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
        return false;
    }
}
