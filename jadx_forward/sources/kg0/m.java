package kg0;

@j95.b
/* loaded from: classes14.dex */
public class m extends i95.w implements bd0.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f389213d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(java.lang.String roomUin, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPFeatureReportService", "newInstance %s", roomUin);
        mg0.a aVar = new mg0.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomUin, "roomUin");
        aVar.f407730a = roomUin;
        aVar.f407733d = i17;
        ((java.util.concurrent.ConcurrentHashMap) this.f389213d).put(roomUin, aVar);
    }

    public void Bi(java.lang.String str, boolean z17, int i17) {
        mg0.a wi6 = wi(str);
        if (wi6 != null) {
            if (wi6.f407735f < 1) {
                wi6.f407735f = 1;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7003xd906a5cb c7003xd906a5cb = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7003xd906a5cb();
            c7003xd906a5cb.f143173e = c7003xd906a5cb.b("RoomUin", wi6.f407730a, true);
            c7003xd906a5cb.f143175g = wi6.f407731b;
            c7003xd906a5cb.f143174f = wi6.f407732c;
            c7003xd906a5cb.f143172d = wi6.f407733d;
            c7003xd906a5cb.f143176h = 1;
            c7003xd906a5cb.f143177i = 10;
            c7003xd906a5cb.f143178j = z17 ? 1 : 0;
            c7003xd906a5cb.o();
            c7003xd906a5cb.k();
        }
    }

    public void Di(java.lang.String roomUin, int i17, int i18, int i19) {
        mg0.a wi6 = wi(roomUin);
        if (wi6 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomUin, "roomUin");
            wi6.f407730a = roomUin;
            wi6.f407731b = i17;
            wi6.f407732c = i18;
            if (wi6.f407734e) {
                wi6.a();
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        ((java.util.concurrent.ConcurrentHashMap) this.f389213d).clear();
    }

    public final mg0.a wi(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f389213d;
        mg0.a aVar = (mg0.a) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (aVar == null && (aVar = (mg0.a) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get("0")) != null) {
            ((java.util.concurrent.ConcurrentHashMap) concurrentMap).put(str, aVar);
        }
        return aVar;
    }
}
