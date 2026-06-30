package p61;

/* loaded from: classes5.dex */
public class t1 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 f433912b;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504, java.lang.String str) {
        this.f433912b = activityC11362x5f9e5504;
        this.f433911a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactUI", "next to BindMContactVerifyUI for bind mobile");
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11362x5f9e5504 activityC11362x5f9e5504 = this.f433912b;
            android.content.Intent intent = new android.content.Intent(activityC11362x5f9e5504, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d.class);
            intent.putExtra("policy_ticket", bundle.getString("policyTicket", ""));
            intent.putExtra("bindmcontact_mobile", this.f433911a);
            intent.putExtra("KEnterFromBanner", activityC11362x5f9e5504.f154528r);
            intent.putExtra("bind_scene", activityC11362x5f9e5504.f154532v);
            intent.addFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
            intent.putExtra("back_to_status", activityC11362x5f9e5504.f154529s);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11362x5f9e5504, intent);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new java.lang.Runnable() { // from class: p61.t1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p61.t1.this.f433912b.finish();
                }
            }, 500L);
        }
    }
}
