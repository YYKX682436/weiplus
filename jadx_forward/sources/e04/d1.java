package e04;

/* loaded from: classes13.dex */
public class d1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa f327419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa, android.os.Looper looper) {
        super(looper);
        this.f327419a = c17339x2dbc71fa;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        e04.e1 e1Var;
        if (message.what != 233 || (e1Var = (e04.e1) message.obj) == null) {
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        byte[] bArr = e1Var.f327425a;
        int i17 = e1Var.f327426b;
        int i18 = e1Var.f327427c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa = this.f327419a;
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa.a(c17339x2dbc71fa, bArr, i17, i18);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        c17339x2dbc71fa.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "isYuvDark: %s, currentLight: %s, used %sms", valueOf, java.lang.Float.valueOf(-1.0f), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "not dark");
            c17339x2dbc71fa.f241365c = 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e04.c1(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraLightDetector", "is dark now");
        c17339x2dbc71fa.f241365c++;
        if (!c17339x2dbc71fa.f241364b.equals("continuous-video") || c17339x2dbc71fa.f241365c >= 2) {
            c17339x2dbc71fa.f241365c = 0;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e04.b1(this));
        }
    }
}
