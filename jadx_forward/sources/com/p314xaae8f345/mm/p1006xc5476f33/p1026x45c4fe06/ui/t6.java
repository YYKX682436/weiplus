package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class t6 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f171759a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 f171760b;

    public t6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12662x7403fcf1 activityC12662x7403fcf1) {
        this.f171760b = activityC12662x7403fcf1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            b(-1, str);
        } else {
            b(-2, null);
        }
    }

    public final void b(int i17, java.lang.String str) {
        android.os.Bundle bundle;
        if (this.f171759a) {
            return;
        }
        this.f171759a = true;
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) this.f171760b.getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                bundle = null;
            } else {
                bundle = new android.os.Bundle();
                bundle.putString(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
            }
            resultReceiver.send(i17, bundle);
        }
    }
}
