package ps3;

/* loaded from: classes15.dex */
public final class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.w f439662d;

    public u(ps3.w wVar) {
        this.f439662d = wVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        ps3.w wVar = this.f439662d;
        if (!wVar.f439666f) {
            wVar.f439669i = ps3.s.f439659f;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.lbs.C19621x752a03d5 c19621x752a03d5 = wVar.f439667g;
            if (c19621x752a03d5 != null) {
                float f17 = c19621x752a03d5.f270899d;
                if (f17 == -85.0f || c19621x752a03d5.f270900e == -1000.0f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Radar.RadarManager", "error! location is null!");
                    return false;
                }
                float f18 = c19621x752a03d5.f270900e;
                int i17 = c19621x752a03d5.f270901f;
                int i18 = c19621x752a03d5.f270902g;
                java.lang.String mac = c19621x752a03d5.f270903h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mac, "mac");
                java.lang.String cellId = c19621x752a03d5.f270904i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cellId, "cellId");
                wVar.f439668h = new ps3.a(1, f17, f18, i17, i18, mac, cellId);
                gm0.j1.d().g(wVar.f439668h);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Radar.RadarManager", "error! location is null!");
            }
        }
        return false;
    }
}
