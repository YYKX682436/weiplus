package b83;

/* loaded from: classes11.dex */
public class k implements w11.e1 {
    @Override // w11.e1
    public void a(boolean z17) {
        com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService tinkerPatchResultService = com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.f142403a;
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        voipEvent.f54945g.f8415b = 2;
        voipEvent.e();
        boolean z18 = voipEvent.f54946h.f8501b;
        boolean H = iq.b.H();
        boolean d17 = com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean c17 = com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.c();
        if (z17 || d17 || z18 || H || c17) {
            com.tencent.mars.xlog.Log.w("Tinker.TinkerPatchResultService", "not hit condition, skip suicide this time. cond: screenOn: %s, screenOnNow: %s, voip: %s, multiTalk: %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(H));
        } else {
            com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService.b(false);
        }
    }
}
