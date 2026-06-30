package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes4.dex */
public class b4 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a f176492a;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a) {
        this.f176492a = activityC13058x9cebb75a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null || !action.equals("android.intent.action.LOCALE_CHANGED")) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a.f176434s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13058x9cebb75a activityC13058x9cebb75a = this.f176492a;
        activityC13058x9cebb75a.getClass();
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() || com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()) ? false : true)) {
            activityC13058x9cebb75a.U6();
        }
    }
}
