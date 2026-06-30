package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes13.dex */
public class e1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73 f155349a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73 activityC11400x69da2d73) {
        this.f155349a = activityC11400x69da2d73;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290741l);
        java.lang.String str = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11400x69da2d73 activityC11400x69da2d73 = this.f155349a;
        intent2.putExtra(str, activityC11400x69da2d73.getIntent().getDataString());
        b4.d.a(activityC11400x69da2d73).c(intent2);
        activityC11400x69da2d73.finish();
    }
}
