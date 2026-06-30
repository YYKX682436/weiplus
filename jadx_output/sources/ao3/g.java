package ao3;

@j95.b
/* loaded from: classes8.dex */
public class g extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public do3.a f12551d;

    public do3.a Ai() {
        gm0.j1.b().c();
        if (((ao3.g) i95.n0.c(ao3.g.class)).f12551d == null) {
            ((ao3.g) i95.n0.c(ao3.g.class)).f12551d = new do3.a();
        }
        return ((ao3.g) i95.n0.c(ao3.g.class)).f12551d;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCpuCard", "process: %s", com.tencent.mm.sdk.platformtools.t8.W(com.tencent.mm.sdk.platformtools.x2.f193071a, android.os.Process.myPid()));
        ((ku5.t0) ku5.t0.f312615d).k(new ao3.e(this), 5000L);
        int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
        if (intValue == 0) {
            if (((java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue() == 1) {
                wi(true);
            } else {
                wi(false);
            }
        } else if (intValue == 1) {
            wi(true);
        } else {
            wi(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCpuCard", "doNFCReport start");
        ((ku5.t0) ku5.t0.f312615d).l(new ao3.f(this), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, ao3.g.class.getName());
    }

    public final void wi(boolean z17) {
        if (z17) {
            com.tencent.mm.sdk.platformtools.t8.I1(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
        } else {
            com.tencent.mm.sdk.platformtools.t8.I1(com.tencent.mm.sdk.platformtools.x2.f193071a, new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
        }
    }
}
