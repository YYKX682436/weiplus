package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l5 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261941d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1) {
        super(false);
        this.f261941d = activityC19116x82bf90f1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261941d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19116x82bf90f1.f261572u)) {
            return;
        }
        if (activityC19116x82bf90f1.f261560i.contains(activityC19116x82bf90f1.f261572u)) {
            activityC19116x82bf90f1.f261560i.remove(activityC19116x82bf90f1.f261572u);
            activityC19116x82bf90f1.C1.setChecked(false);
        } else {
            activityC19116x82bf90f1.f261560i.add(activityC19116x82bf90f1.f261572u);
            activityC19116x82bf90f1.C1.setChecked(true);
        }
    }
}
