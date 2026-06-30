package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class aa extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c f291808a;

    public aa(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c activityC22525xd785bb4c) {
        this.f291808a = activityC22525xd785bb4c;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c activityC22525xd785bb4c = this.f291808a;
        android.app.ProgressDialog progressDialog = activityC22525xd785bb4c.f291703d;
        if (progressDialog != null && progressDialog.isShowing()) {
            activityC22525xd785bb4c.f291703d.dismiss();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22525xd785bb4c.f291705f)) {
            activityC22525xd785bb4c.T6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, filePath is null");
        activityC22525xd785bb4c.U6();
        activityC22525xd785bb4c.finish();
    }
}
