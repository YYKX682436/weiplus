package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public class h0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f171279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 f171280e;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257, int i17) {
        this.f171280e = activityC12636x4eed9257;
        this.f171279d = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        int i19;
        int intExtra;
        if (i17 == 1 && i18 == -1 && intent != null && intent.hasExtra("key_result_state") && (intExtra = intent.getIntExtra("key_result_state", (i19 = this.f171279d))) != i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257 activityC12636x4eed9257 = this.f171280e;
            activityC12636x4eed9257.f170853z = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, change location state to:%s", java.lang.Integer.valueOf(intExtra));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12636x4eed9257.Y6(activityC12636x4eed9257, intExtra);
            if (intExtra == 2) {
                activityC12636x4eed9257.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeUI", "report click location background auth state");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v.a(activityC12636x4eed9257.f170836f, activityC12636x4eed9257.f170837g, java.lang.System.currentTimeMillis(), 3, "", 0);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add("scope.userLocation");
            arrayList.add("scope.userLocationBackground");
            activityC12636x4eed9257.l7(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g0(this, intExtra));
        }
    }
}
