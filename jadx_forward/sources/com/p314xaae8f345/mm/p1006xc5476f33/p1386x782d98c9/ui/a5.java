package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class a5 implements h32.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f180934a;

    public a5(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f180934a = activityC13474xf9906714;
    }

    @Override // h32.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceProfileUI", "on NetSceneDelFollow end,errType:" + i17 + "  errCode:" + i18 + "  errMsg:" + str);
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KeyNeedUpdateRank", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f180934a;
            activityC13474xf9906714.setResult(-1, intent);
            activityC13474xf9906714.finish();
        }
    }
}
