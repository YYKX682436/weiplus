package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes8.dex */
public class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7 f174888d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7 activityC12906x5398ea7) {
        this.f174888d = activityC12906x5398ea7;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7 activityC12906x5398ea7 = this.f174888d;
        if (itemId == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallProxyUI", "click remove all balls");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.T6(activityC12906x5398ea7, 1);
            activityC12906x5398ea7.finish();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallProxyUI", "click cancel remove all balls");
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.T6(activityC12906x5398ea7, 2);
            activityC12906x5398ea7.finish();
        }
    }
}
