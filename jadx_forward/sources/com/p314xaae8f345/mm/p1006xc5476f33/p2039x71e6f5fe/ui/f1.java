package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes10.dex */
public class f1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17302x1966fea1 f241079a;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17302x1966fea1 activityC17302x1966fea1) {
        this.f241079a = activityC17302x1966fea1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.q
    public void a(long j17, android.os.Bundle bundle) {
        if (bundle.containsKey("param_card_bitmap")) {
            android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bundle.getByteArray("param_card_bitmap"));
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17302x1966fea1 activityC17302x1966fea1 = this.f241079a;
            if (activityC17302x1966fea1.f240864d == 11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0 c5964xc2df36f0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5964xc2df36f0();
                am.rs rsVar = c5964xc2df36f0.f136261g;
                rsVar.f89370a = "identity_pay_auth";
                rsVar.f89371b = 1;
                rsVar.f89372c = G;
                c5964xc2df36f0.e();
                activityC17302x1966fea1.finish();
            }
        }
    }
}
