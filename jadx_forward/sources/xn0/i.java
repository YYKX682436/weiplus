package xn0;

/* loaded from: classes3.dex */
public final class i extends com.p314xaae8f345.mm.p971x6de15a2e.a0 {

    /* renamed from: f, reason: collision with root package name */
    public static int f536959f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f536960g;

    /* renamed from: d, reason: collision with root package name */
    public static final xn0.i f536957d = new xn0.i();

    /* renamed from: e, reason: collision with root package name */
    public static xn0.e f536958e = xn0.e.f536945f;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f536961h = jz5.h.b(xn0.h.f536956d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f536962i = jz5.h.b(xn0.g.f536955d);

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.b0
    public void Xe(boolean z17, int i17) {
        f536960g = z17;
        f536959f = i17;
    }

    public final xn0.e d(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        xn0.e eVar = f536958e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.HashMap) ((jz5.n) f536961h).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
        if (arrayList == null) {
            return eVar;
        }
        int size = arrayList.size();
        if (size >= 3) {
            java.util.Iterator it = arrayList.iterator();
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            i28 = 0;
            while (it.hasNext()) {
                kn0.e eVar2 = ((xn0.f) it.next()).f536953a;
                int i47 = eVar2.f391054s;
                i37 += i47;
                i38 += eVar2.f391047l;
                i39 += eVar2.f391043h;
                i28 = java.lang.Math.max(i28, i47);
            }
            i18 = i37 / size;
            i19 = i38 / size;
            i27 = i39 / size;
            java.util.Iterator it6 = arrayList.iterator();
            i29 = 0;
            while (it6.hasNext()) {
                int i48 = ((xn0.f) it6.next()).f536953a.f391043h - i27;
                i29 += i48 * i48;
            }
            double sqrt = java.lang.Math.sqrt(i29 / size);
            if (i28 <= 25) {
                eVar = xn0.e.f536946g;
            } else if (i18 <= 45) {
                eVar = sqrt < ((double) i27) * 0.1d ? xn0.e.f536947h : xn0.e.f536948i;
            } else if (i18 > 450 && sqrt > i27 * 0.5d) {
                eVar = xn0.e.f536949m;
            }
        } else {
            i18 = 0;
            i19 = 0;
            i27 = 0;
            i28 = 0;
            i29 = 0;
        }
        int i49 = 0;
        if (size > 0) {
            i49 = ((xn0.f) arrayList.get(0)).f536954b;
            if (i49 >= 10) {
                eVar = xn0.e.f536944e.a(java.lang.Math.max(eVar.f536952d, 5));
            } else if (i49 >= 3) {
                eVar = xn0.e.f536944e.a(java.lang.Math.max(eVar.f536952d, 4));
            } else if (i49 > 1) {
                eVar = xn0.e.f536944e.a(java.lang.Math.max(eVar.f536952d, 3));
            }
        }
        if (f536960g && i49 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.FLVNetworkInfo", "Poor network from mars, lastRTT:" + f536959f + ", preQuality:" + eVar);
            eVar = xn0.e.f536944e.a(java.lang.Math.max(eVar.f536952d, 4));
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.FLVNetworkInfo", "network down, lastRTT:" + f536959f + ", preQuality:" + eVar);
            eVar = xn0.e.f536950n;
        }
        jz5.g gVar = f536962i;
        xn0.c cVar = (xn0.c) ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            cVar = new xn0.c();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        ((java.util.HashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(java.lang.Integer.valueOf(i17), cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Live.FLVNetworkInfo", "videoQualityLevel:" + i17 + ",cnt:" + size + ", blockCnt:" + i49 + ", quality:" + eVar + ", maxJitter:" + i28 + ", avgJitter:" + i18 + ", avgSpeed:" + i19 + ", avgFps:" + i27 + ", fpsVar:" + i29);
        return eVar;
    }
}
