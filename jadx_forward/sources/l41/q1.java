package l41;

/* loaded from: classes4.dex */
public final class q1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f397436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f397437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397438g;

    public q1(java.lang.String str, boolean z17, int i17, yz5.l lVar) {
        this.f397435d = str;
        this.f397436e = z17;
        this.f397437f = i17;
        this.f397438g = lVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        ((ku5.t0) ku5.t0.f394148d).B(l41.p1.f397429d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqController", "LocationGet isOk = %s, talkUsername = %s, useWgs84 = %s, fromScene = %s", java.lang.Boolean.valueOf(z17), this.f397435d, java.lang.Boolean.valueOf(this.f397436e), java.lang.Integer.valueOf(this.f397437f));
        if (!z17) {
            return false;
        }
        java.lang.String str = "WGS84";
        if (i17 != 0 && i17 == 1) {
            str = "GCJ02";
        }
        java.lang.String str2 = str;
        double d27 = f17;
        double d28 = f18;
        java.lang.String kfUsername = this.f397435d;
        int i18 = this.f397437f;
        yz5.l successCallback = this.f397438g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kfUsername, "kfUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(successCallback, "successCallback");
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new l41.u1(kfUsername, str2, d27, d28, d18, i18, successCallback, null), 1, null);
        }
        return false;
    }
}
