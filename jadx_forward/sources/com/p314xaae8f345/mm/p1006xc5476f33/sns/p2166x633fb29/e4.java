package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f245705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f4 f245706f;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f4 f4Var, java.lang.String str, int i17) {
        this.f245706f = f4Var;
        this.f245704d = str;
        this.f245705e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
        android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit();
        java.lang.String str = this.f245704d;
        edit.putBoolean(str, true).commit();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g4.f(this.f245706f.f245724d).o(str, this.f245705e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().w(str, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsAdStreamVideoProxy$1$4");
    }
}
