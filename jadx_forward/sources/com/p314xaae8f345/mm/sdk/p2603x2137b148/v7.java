package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes11.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f274574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f274575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f274576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.u7 f274577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f274578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(long j17, java.util.Set set, android.net.ConnectivityManager connectivityManager, com.p314xaae8f345.mm.sdk.p2603x2137b148.u7 u7Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(0);
        this.f274574d = j17;
        this.f274575e = set;
        this.f274576f = connectivityManager;
        this.f274577g = u7Var;
        this.f274578h = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f274574d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Set set = this.f274575e;
        java.lang.String str2 = (java.lang.String) kz5.n0.Y(set);
        java.lang.String str3 = "";
        if (str2 == null || (str = "firstIp:".concat(str2)) == null) {
            str = "";
        }
        sb6.append(str);
        if (set.size() > 1) {
            str3 = " lastIp:" + ((java.lang.String) kz5.n0.h0(set));
        }
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimCardUtil", "getSimCardIPAddresses end cost:" + currentTimeMillis + " ipList:[size:" + set.size() + ' ' + sb6.toString() + ']');
        this.f274576f.unregisterNetworkCallback(this.f274577g);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f274578h).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.n0.S0(set)));
        return jz5.f0.f384359a;
    }
}
