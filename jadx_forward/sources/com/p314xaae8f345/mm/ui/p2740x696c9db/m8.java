package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class m8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f292111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f292112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f292113f;

    public m8(com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, boolean z17) {
        this.f292113f = c9Var;
        this.f292111d = activityC1102x9ee2d9f;
        this.f292112e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f292111d;
        if (activityC1102x9ee2d9f == null || activityC1102x9ee2d9f.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f292113f.f291849a, "want to collapse search view, but activity status error");
        } else if (this.f292112e) {
            activityC1102x9ee2d9f.mo2548x55429c53();
        }
    }
}
