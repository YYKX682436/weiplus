package w21;

/* loaded from: classes12.dex */
public class p implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w21.o f523984d;

    public p(w21.o oVar) {
        this.f523984d = oVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        w21.o oVar = this.f523984d;
        w21.w0 j17 = w21.x0.j(oVar.f523965f);
        if (j17 == null || !j17.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + oVar.f523965f);
            oVar.f523970n = fp.k.a() + 10000;
            oVar.f523963d.mo815x76e0bfae(3, -1, "doScene failed", oVar);
            return false;
        }
        if (!oVar.f523972p && 3 != (i17 = j17.f524025i) && 8 != i17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if ((currentTimeMillis / 1000) - j17.f524027k > 30) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoice", "Error ModifyTime in Read file:" + oVar.f523965f);
                oVar.f523970n = fp.k.a() + 10000;
                oVar.f523963d.mo815x76e0bfae(3, -1, "doScene failed", oVar);
                return false;
            }
            if (currentTimeMillis - oVar.f523969m < 2000) {
                java.lang.String str = oVar.f523965f;
                return true;
            }
            w21.t d17 = w21.x0.i(null, oVar.f523965f).d(j17.f524022f, 6000);
            java.lang.String str2 = oVar.f523965f;
            if (d17.f523998b < 2000) {
                return true;
            }
        }
        if (oVar.mo807x6c193ac1(oVar.m47995xb7ba1aa7(), oVar.f523963d) == -1) {
            oVar.f523970n = fp.k.a() + 10000;
            oVar.f523963d.mo815x76e0bfae(3, -1, "doScene failed", oVar);
        }
        return false;
    }
}
