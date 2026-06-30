package ze5;

/* loaded from: classes9.dex */
public final class q7 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553699a;

    public q7(yb5.d dVar) {
        this.f553699a = dVar;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public final void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2002) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemLocationCardMvvm", "[onActivityResult] null == data, requestCode:%s resultCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            if (intent.getBooleanExtra("kfavorite", false)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.l(c5303xc75d2f73, intent);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f553699a.f542250l;
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                c4Var.f87857j = abstractC21611x7536149b;
                c4Var.f87860m = 42;
                c5303xc75d2f73.e();
            }
        }
    }
}
