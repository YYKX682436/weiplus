package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class z implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 f262760a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253) {
        this.f262760a = activityC19169x32646253;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f
    public void a(nt4.f fVar, mt4.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "Consume finished: " + fVar + ", purchase: " + eVar);
        boolean c17 = fVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19169x32646253 activityC19169x32646253 = this.f262760a;
        if (c17) {
            activityC19169x32646253.f262636f = 1002;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Fail ! ");
        } else {
            activityC19169x32646253.f262636f = 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIapUI", "back to preview UI, reason: consume Success ! ");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", fVar.f421356a);
        intent.putExtra("key_err_msg", fVar.f421357b);
        intent.putStringArrayListExtra("key_response_product_ids", activityC19169x32646253.f262640m.f262685a);
        intent.putStringArrayListExtra("key_response_series_ids", activityC19169x32646253.f262640m.f262686b);
        intent.putExtra("key_launch_ts", com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.c.f262672m);
        activityC19169x32646253.setResult(-1, intent);
        activityC19169x32646253.finish();
    }
}
