package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class q9 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 f292191a;

    public q9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18) {
        this.f292191a = activityC22523xb066d18;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18 = this.f292191a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC22523xb066d18.f291690i)) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18.a7(activityC22523xb066d18, message.what == activityC22523xb066d18.f291697s);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareImgUI", "launch : fail, filePath is null");
        activityC22523xb066d18.e7(activityC22523xb066d18.f291689h);
        activityC22523xb066d18.finish();
    }
}
