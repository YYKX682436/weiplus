package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f265883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 f265885h;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357, android.os.Bundle bundle, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f265885h = activityC19379x488a6357;
        this.f265881d = bundle;
        this.f265882e = str;
        this.f265883f = z17;
        this.f265884g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19379x488a6357 activityC19379x488a6357 = this.f265885h;
        if (activityC19379x488a6357.f265377p0 != null) {
            java.lang.String str = this.f265882e;
            android.os.Bundle bundle = this.f265881d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
                activityC19379x488a6357.f265377p0.b0(str, this.f265883f, this.f265884g);
            } else {
                activityC19379x488a6357.f265377p0.g0(bundle.getString("widgetId"), str);
            }
        }
    }
}
