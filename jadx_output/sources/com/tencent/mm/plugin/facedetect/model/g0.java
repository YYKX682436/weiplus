package com.tencent.mm.plugin.facedetect.model;

/* loaded from: classes.dex */
public class g0 extends com.tencent.mm.sdk.event.n {
    public g0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetIsSupportFaceEvent getIsSupportFaceEvent = (com.tencent.mm.autogen.events.GetIsSupportFaceEvent) iEvent;
        boolean z17 = false;
        if (getIsSupportFaceEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceGetIsSupportListener", "hy: event is null");
            return false;
        }
        com.tencent.mm.plugin.facedetect.model.y yVar = com.tencent.mm.plugin.facedetect.model.y.INSTANCE;
        boolean hasSystemFeature = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c17 = com.tencent.mm.plugin.facedetect.model.s0.c(true);
        am.bg bgVar = getIsSupportFaceEvent.f54400g;
        if (!hasSystemFeature) {
            bgVar.f6252b = 10001;
            bgVar.f6253c = "No front camera";
            vz2.c.e(10001, "No front camera");
        } else if (c17) {
            if (!com.tencent.mm.ui.bk.A() || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_flash_enable_pad, true)) {
                bgVar.f6253c = "ok";
                vz2.c.e(0, "ok");
            } else {
                bgVar.f6252b = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
                bgVar.f6253c = "Not support pad";
                vz2.c.e(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, "Not support pad");
            }
        } else {
            bgVar.f6252b = 10002;
            bgVar.f6253c = "No necessary model found";
            vz2.c.e(10002, "No necessary model found");
        }
        bgVar.f6254d = 1;
        if (hasSystemFeature && c17) {
            z17 = true;
        }
        bgVar.f6251a = z17;
        return true;
    }
}
