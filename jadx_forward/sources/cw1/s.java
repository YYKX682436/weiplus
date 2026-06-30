package cw1;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f304832e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, yz5.a aVar) {
        this.f304831d = activityC13107x4291ddb8;
        this.f304832e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[2];
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8.f177179n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304831d;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13107x4291ddb8.T6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13107x4291ddb8.f177185i));
        ((cy1.a) rVar).Hj("chat_history_clean_all_last_ack_btn", "view_clk", kz5.c1.k(lVarArr), 32903);
        this.f304832e.mo152xb9724478();
    }
}
