package ao3;

@j95.b
/* loaded from: classes8.dex */
public class g extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public do3.a f94084d;

    public do3.a Ai() {
        gm0.j1.b().c();
        if (((ao3.g) i95.n0.c(ao3.g.class)).f94084d == null) {
            ((ao3.g) i95.n0.c(ao3.g.class)).f94084d = new do3.a();
        }
        return ((ao3.g) i95.n0.c(ao3.g.class)).f94084d;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCpuCard", "process: %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, android.os.Process.myPid()));
        ((ku5.t0) ku5.t0.f394148d).k(new ao3.e(this), 5000L);
        int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_SWITCH_INT_SYNC, 0)).intValue();
        if (intValue == 0) {
            if (((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NFC_OPEN_DEFAULT_SWITCH_INT_SYNC, 0)).intValue() == 1) {
                wi(true);
            } else {
                wi(false);
            }
        } else if (intValue == 1) {
            wi(true);
        } else {
            wi(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreCpuCard", "doNFCReport start");
        ((ku5.t0) ku5.t0.f394148d).l(new ao3.f(this), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, ao3.g.class.getName());
    }

    public final void wi(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.ComponentName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
        }
    }
}
