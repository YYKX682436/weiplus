package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class w0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 f264025a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 x0Var) {
        this.f264025a = x0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && "com.tencent.mm.ACTION_LOCATION_FROM_JSAPI".equals(intent.getAction()) && intent.getIntExtra("key_permission_request_code", 0) == 75) {
            int intExtra = intent.getIntExtra("key_result_code", 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x0 x0Var = this.f264025a;
            if (intExtra == -1) {
                x0Var.f(x0Var.f264037f);
            } else {
                x0Var.g(x0Var.f264037f, "fail");
            }
        }
    }
}
