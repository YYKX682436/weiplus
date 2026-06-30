package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes8.dex */
public class o0 implements ak1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171426a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257) {
        this.f171426a = activityC12636x4eed9257;
    }

    @Override // ak1.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "onCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171426a;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC12636x4eed9257.f170841n).m("preference_key_voip_device_list", false);
        activityC12636x4eed9257.W.clear();
        activityC12636x4eed9257.X.clear();
        ak1.e eVar = ak1.e.f87105a;
        java.util.ArrayList arrayList = ak1.e.f87106b;
        if (!arrayList.isEmpty()) {
            activityC12636x4eed9257.W.addAll(arrayList);
        }
        java.util.ArrayList arrayList2 = ak1.e.f87107c;
        if (arrayList2.isEmpty()) {
            return;
        }
        activityC12636x4eed9257.X.addAll(arrayList2);
    }
}
