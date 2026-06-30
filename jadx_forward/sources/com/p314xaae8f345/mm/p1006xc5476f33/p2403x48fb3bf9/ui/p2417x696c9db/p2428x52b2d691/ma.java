package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ma;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class ma implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, final com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        byte[] byteArray = data.getByteArray("KEY_REQUEST_DATA");
        bi4.d1 d1Var = new bi4.d1();
        d1Var.mo11468x92b714fd(byteArray);
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                super.onReceiveResult(i17, bundle);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("KEY_RESULT_CODE", i17);
                bundle2.putParcelable("KEY_RESULT_DATA", bundle);
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = com.p314xaae8f345.mm.p794xb0fa9b5e.r.this;
                if (rVar2 != null) {
                    rVar2.a(bundle2);
                }
            }
        };
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, d1Var, resultReceiver);
    }
}
