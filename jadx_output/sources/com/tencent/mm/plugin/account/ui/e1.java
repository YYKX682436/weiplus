package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public class e1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.CustomTabActivity f73816a;

    public e1(com.tencent.mm.plugin.account.ui.CustomTabActivity customTabActivity) {
        this.f73816a = customTabActivity;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.ui.mmfb.sdk.l.f209208l);
        java.lang.String str = com.tencent.mm.ui.mmfb.sdk.l.f209202f;
        com.tencent.mm.plugin.account.ui.CustomTabActivity customTabActivity = this.f73816a;
        intent2.putExtra(str, customTabActivity.getIntent().getDataString());
        b4.d.a(customTabActivity).c(intent2);
        customTabActivity.finish();
    }
}
