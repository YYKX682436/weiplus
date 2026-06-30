package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes11.dex */
public class o0 extends com.tencent.mm.sdk.event.n {
    public o0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RequestStartFaceManageEvent requestStartFaceManageEvent = (com.tencent.mm.autogen.events.RequestStartFaceManageEvent) iEvent;
        boolean z17 = false;
        if (requestStartFaceManageEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceStartManageListener", "hy: event is null");
            return false;
        }
        android.content.Context context = requestStartFaceManageEvent.f54701g.f7740a;
        com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "hy: start face manage process");
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectManager", "hy: context is null. abort");
        } else if (yVar.d(true)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/facedetect/model/FaceDetectManager", "startFaceManageProcess", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FaceDetectManager", "hy: not support face detect. abort");
        }
        requestStartFaceManageEvent.f54702h.f7836a = z17;
        return true;
    }
}
