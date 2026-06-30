package od0;

@j95.b(m140513x1e06fd29 = {fo3.j.class})
/* loaded from: classes11.dex */
public class r extends i95.w {
    public static void Ai(int i17, byte[] bArr) {
        ((ku5.t0) ku5.t0.f394148d).h(new od0.o(i17, bArr), "SIRWorker");
    }

    public static void wi() {
        w04.l lVar = w04.l.INSTANCE;
        if (lVar.M5(3, 86400000L) || (!fo3.s.INSTANCE.He() && lVar.M5(10, 21600000L))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "[+] req task posted.");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j && com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273979i && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("gprs_alert", true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PSIR", "CTA alert is not checked Return here.");
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new od0.q(), "SIRWorker");
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
    }
}
