package com.p176xb6135e39.p271xde6bf207.p272x9b169b86;

/* renamed from: com.google.firebase.analytics.FirebaseAnalytics */
/* loaded from: classes16.dex */
public final class C2732x4233611f {

    /* renamed from: zzacw */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 f7864x6f02155;

    public C2732x4233611f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 c2247x394c25) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(c2247x394c25);
        this.f7864x6f02155 = c2247x394c25;
    }

    /* renamed from: getInstance */
    public static com.p176xb6135e39.p271xde6bf207.p272x9b169b86.C2732x4233611f m20441x9cf0d20b(android.content.Context context) {
        return com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(context).m19181x394c89();
    }

    /* renamed from: getAppInstanceId */
    public final com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.AbstractC2439x27a9a5<java.lang.String> m20442x4b6169db() {
        return this.f7864x6f02155.m19166x394c0f().m19190x4b6169db();
    }

    /* renamed from: logEvent */
    public final void m20443x769949b6(java.lang.String str, android.os.Bundle bundle) {
        this.f7864x6f02155.m19180x394c88().m19485x769949b6(str, bundle);
    }

    /* renamed from: resetAnalyticsData */
    public final void m20444x5c033741() {
        this.f7864x6f02155.m19166x394c0f().m19197x5c033741();
    }

    /* renamed from: setAnalyticsCollectionEnabled */
    public final void m20445x848c89df(boolean z17) {
        this.f7864x6f02155.m19180x394c88().m19492x105dbfe7(z17);
    }

    /* renamed from: setCurrentScreen */
    public final void m20446xd4fcce03(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.f7864x6f02155.m19170x394c13().m19221xd4fcce03(activity, str, str2);
    }

    /* renamed from: setMinimumSessionDuration */
    public final void m20447xa37f9b5e(long j17) {
        this.f7864x6f02155.m19180x394c88().m19493xa37f9b5e(j17);
    }

    /* renamed from: setSessionTimeoutDuration */
    public final void m20448xa19717a1(long j17) {
        this.f7864x6f02155.m19180x394c88().m19494xa19717a1(j17);
    }

    /* renamed from: setUserId */
    public final void m20449x26778548(java.lang.String str) {
        this.f7864x6f02155.m19180x394c88().m19496xee02891f("app", "_id", str);
    }

    /* renamed from: setUserProperty */
    public final void m20450x2e43c042(java.lang.String str, java.lang.String str2) {
        this.f7864x6f02155.m19180x394c88().m19495x2e43c042(str, str2);
    }
}
