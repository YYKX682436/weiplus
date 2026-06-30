package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes11.dex */
public final class p1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17304x140e10a3 f241142a;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17304x140e10a3 activityC17304x140e10a3) {
        this.f241142a = activityC17304x140e10a3;
    }

    public void a(long j17, android.os.Bundle bundle) {
        if (bundle != null && bundle.containsKey("param_card_bitmap")) {
            java.io.Serializable serializable = bundle.getSerializable("param_card_bitmap");
            java.util.ArrayList arrayList = serializable instanceof java.util.ArrayList ? (java.util.ArrayList) serializable : null;
            if (arrayList != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G((byte[]) it.next()));
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e c5968xe69f472e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5968xe69f472e();
                am.ws wsVar = c5968xe69f472e.f136266g;
                wsVar.f89852a = 1;
                wsVar.f89854c = arrayList2;
                c5968xe69f472e.e();
                this.f241142a.finish();
            }
        }
    }
}
