package cg4;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent extVoiceTransformTextResultEvent = (com.tencent.mm.autogen.events.ExtVoiceTransformTextResultEvent) iEvent;
        if (extVoiceTransformTextResultEvent == null) {
            return false;
        }
        am.c9 c9Var = extVoiceTransformTextResultEvent.f54220g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c9Var.f6339a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceTransformResultClickEventListener", "fileName is null");
            return false;
        }
        w21.w0 y07 = w21.p0.Di().y0(c9Var.f6339a);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceTransformResultClickEventListener", "voiceInfo is null");
            return false;
        }
        cg4.k.a(y07.f442487d, 0, 0, 0, c9Var.f6340b, y07.f442495l);
        return true;
    }
}
