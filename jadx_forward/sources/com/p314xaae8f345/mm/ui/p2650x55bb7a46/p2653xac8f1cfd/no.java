package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class no implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f281132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo f281133b;

    public no(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jo joVar, android.content.Intent intent) {
        this.f281133b = joVar;
        this.f281132a = intent;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3
    public void a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        java.lang.String stringExtra = this.f281132a.getStringExtra("key_multi_send_report_info");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("key_multi_send_report_info");
            for (int i17 = 0; i17 < list2.size(); i17++) {
                java.lang.String str = (java.lang.String) list2.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    M.putString(str, stringExtra);
                }
            }
        }
        this.f281133b.f280113d.b();
    }
}
