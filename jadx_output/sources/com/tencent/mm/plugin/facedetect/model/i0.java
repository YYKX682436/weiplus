package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes.dex */
public class i0 extends com.tencent.mm.sdk.event.n {
    public i0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RequestInternalFaceVerifyEvent requestInternalFaceVerifyEvent = (com.tencent.mm.autogen.events.RequestInternalFaceVerifyEvent) iEvent;
        boolean z17 = false;
        if (requestInternalFaceVerifyEvent == null) {
            return false;
        }
        com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
        am.lr lrVar = requestInternalFaceVerifyEvent.f54696g;
        android.content.Context context = lrVar.f7265a;
        android.os.Bundle bundle = lrVar.f7266b;
        int i17 = lrVar.f7267c;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectManager", "start wx internal face verify");
        if (context != null && bundle != null) {
            int i18 = com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.f137243i;
            bundle.putBoolean("face_permission_check", true);
            com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.U6(context, bundle, i17);
            z17 = true;
        }
        am.mr mrVar = requestInternalFaceVerifyEvent.f54697h;
        mrVar.f7359a = z17;
        if (!z17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            mrVar.f7360b = bundle2;
            bundle2.putInt("err_code", com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION);
            mrVar.f7360b.putString("err_msg", "face detect not support");
        }
        return true;
    }
}
