package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/stub/WebViewPublishTextStateUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI */
/* loaded from: classes4.dex */
public final class ActivityC19299x4f9f7842 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_REQUEST_DATA");
        bi4.d1 d1Var = new bi4.d1();
        d1Var.mo11468x92b714fd(byteArrayExtra);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI$onCreate$setStatusCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                super.onReceiveResult(i17, bundle2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19299x4f9f7842 activityC19299x4f9f7842 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19299x4f9f7842) weakReference.get();
                if (activityC19299x4f9f7842 != null) {
                    android.content.Intent intent = new android.content.Intent();
                    if (bundle2 != null) {
                        intent.putExtras(bundle2);
                    }
                    activityC19299x4f9f7842.setResult(i17, intent);
                    activityC19299x4f9f7842.finish();
                }
            }
        };
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(mo55332x76847179(), d1Var, resultReceiver);
    }
}
