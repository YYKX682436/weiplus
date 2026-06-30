package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f266203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f266205f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e f266207h;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e, android.os.Bundle bundle, java.lang.String str, boolean z17, java.lang.String str2) {
        this.f266207h = activityC19391xc941d0e;
        this.f266203d = bundle;
        this.f266204e = str;
        this.f266205f = z17;
        this.f266206g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19391xc941d0e activityC19391xc941d0e = this.f266207h;
        if (activityC19391xc941d0e.f265377p0 != null) {
            java.lang.String str = this.f266204e;
            android.os.Bundle bundle = this.f266203d;
            if (bundle == null || bundle.getInt("isRefresh") != 1 || bundle.getString("widgetId") == null) {
                activityC19391xc941d0e.f265377p0.b0(str, this.f266205f, this.f266206g);
            } else {
                activityC19391xc941d0e.f265377p0.g0(bundle.getString("widgetId"), str);
            }
        }
    }
}
