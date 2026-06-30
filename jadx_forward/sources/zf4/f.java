package zf4;

/* loaded from: classes13.dex */
public class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.g f554188d;

    public f(zf4.g gVar) {
        this.f554188d = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        zf4.g gVar = this.f554188d;
        zf4.q c17 = zf4.r.c(gVar.f554191f);
        java.lang.String str = gVar.f554191f;
        if (c17 != null) {
            int i17 = c17.f68517x10a0fed7;
            if ((i17 > 1 && i17 <= 3) || i17 == 8) {
                if (3 != i17 && 8 != i17) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if ((currentTimeMillis / 1000) - c17.f68510x8de42782 > 30) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Error ModifyTime in Read file:" + str);
                        gVar.f554193h = fp.k.a() + 10000;
                        gVar.f554189d.mo815x76e0bfae(3, -1, "doScene failed", gVar);
                        return false;
                    }
                    if (currentTimeMillis - gVar.f554192g < 2000 || zf4.r.d(str).b(c17.f68514x90a9378, 6000).f554199b < 2000) {
                        return true;
                    }
                }
                if (gVar.mo807x6c193ac1(gVar.m47995xb7ba1aa7(), gVar.f554189d) == -1) {
                    gVar.f554193h = fp.k.a() + 10000;
                    gVar.f554189d.mo815x76e0bfae(3, -1, "doScene failed", gVar);
                }
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + str);
        gVar.f554193h = fp.k.a() + 10000;
        gVar.f554189d.mo815x76e0bfae(3, -1, "doScene failed", gVar);
        return false;
    }
}
