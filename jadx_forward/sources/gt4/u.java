package gt4;

/* loaded from: classes9.dex */
public class u extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 f357092g;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18) {
        this.f357092g = c19146xd2600a18;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletAwardShakeAnimView", "onShake");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19146xd2600a18 c19146xd2600a18 = this.f357092g;
        long j17 = c19146xd2600a18.f262238g;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (c19146xd2600a18.f262239h) {
            if (elapsedRealtime < 80) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        c19146xd2600a18.f262238g = android.os.SystemClock.elapsedRealtime();
        c19146xd2600a18.f262239h = true;
        if (c19146xd2600a18.f262240i) {
            return;
        }
        c19146xd2600a18.f262240i = true;
        c19146xd2600a18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletAwardShakeAnimView", "onStartShakeOrClick");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(c19146xd2600a18.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.j3j);
        c19146xd2600a18.b();
        gt4.x xVar = c19146xd2600a18.f262246r;
        if (xVar != null) {
            ((gt4.z1) xVar).a(true);
        }
    }
}
