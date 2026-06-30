package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes9.dex */
public class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f175316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req f175317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c f175318c;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c activityC12934x73bfb80c, android.os.Bundle bundle, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req) {
        this.f175318c = activityC12934x73bfb80c;
        this.f175316a = bundle;
        this.f175317b = req;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.j
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c activityC12934x73bfb80c = this.f175318c;
        boolean isFinishing = activityC12934x73bfb80c.isFinishing();
        android.os.Bundle bundle = this.f175316a;
        java.lang.String string = bundle.getString("SendAppMessageWrapper_UserName", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing + ", username = " + string);
        if (!z17 || isFinishing || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.c(activityC12934x73bfb80c, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m5.a(activityC12934x73bfb80c.getIntent().getExtras(), -3), true, false);
        } else {
            android.content.Intent intent = new android.content.Intent(activityC12934x73bfb80c, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
            intent.putExtras(bundle);
            intent.putExtra("finish_direct", false);
            intent.putExtra("Chat_User", string);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = this.f175317b;
            intent.putExtra("SendAppMessageWrapper_Scene", req.f33050x683188c);
            if (req.f33049x38eb0007.m48467xfb85f7b0() == 45) {
                intent.putExtra("Select_Send_Card", true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12934x73bfb80c activityC12934x73bfb80c2 = this.f175318c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC12934x73bfb80c2, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC12934x73bfb80c2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC12934x73bfb80c2, "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.p(this), 1000L);
    }
}
