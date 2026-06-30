package cg4;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.sdk.event.n {
    public i() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = (com.tencent.mm.autogen.events.ExtVoiceTransformTextClickEvent) iEvent;
        if (extVoiceTransformTextClickEvent == null) {
            return false;
        }
        am.b9 b9Var = extVoiceTransformTextClickEvent.f54219g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b9Var.f6224a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceTransformTextClickEventListener", "fileName is null");
            return false;
        }
        w21.w0 y07 = w21.p0.Di().y0(b9Var.f6224a);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceTransformTextClickEventListener", "voiceInfo is null");
            return false;
        }
        int i17 = b9Var.f6225b;
        if (i17 == 1 || i17 == 2) {
            java.lang.String str = y07.f442487d;
            int i18 = b9Var.f6226c;
            int i19 = y07.f442495l;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceTransformTextReporter", "reportTransformTextClick voiceId: %s, clickScene: %d, voiceLengthMs: %d", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14220, java.lang.Integer.valueOf(i18), 0, 0, 0, 0, 0, 0, str, java.lang.Integer.valueOf(i19));
        } else if (i17 == 3) {
            java.lang.String str2 = y07.f442487d;
            int i27 = b9Var.f6226c;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceTransformTextReporter", "reportTransformTextDoubleClick voiceId: %s, clickScene: %d", str2, java.lang.Integer.valueOf(i27));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14220, 0, java.lang.Integer.valueOf(i27), 0, 0, 0, 0, 0, str2);
        }
        return true;
    }
}
