package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceForOpenMsgUI;", "Lcom/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.ChattingSendDataToDeviceForOpenMsgUI */
/* loaded from: classes15.dex */
public final class ActivityC21617x40566a2b extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd
    public void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingSendDataToDeviceForOpenMsgUI", "showIdleState:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = this.A1;
        if (c10597xb1f0d2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, this.H1) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, this.J1)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        vj5.a.a(m78513xc2a54588(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f561033a43), true);
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = (com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2) getIntent().getParcelableExtra("NetworkDeviceInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingSendDataToDeviceForOpenMsgUI", "onCreate deviceInfo:" + c10597xb1f0d2);
        if (c10597xb1f0d2 == null) {
            finish();
        } else {
            m78513xc2a54588().post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.o7(c10597xb1f0d2, this));
            findViewById(com.p314xaae8f345.mm.R.id.aad).setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p7(this));
        }
    }
}
