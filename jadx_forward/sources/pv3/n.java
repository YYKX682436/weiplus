package pv3;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final pv3.n f440152a = new pv3.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f440153b = new java.util.concurrent.ConcurrentHashMap();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a audioCacheInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioCacheInfo, "audioCacheInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "publishEvent " + scene + ' ' + audioCacheInfo);
        iv3.c cVar = (iv3.c) f440153b.get(scene);
        if (cVar != null) {
            ((nv3.l) ((jz5.n) ((no4.c) cVar).f420310h).mo141623x754a37bb()).a(audioCacheInfo.f237244e);
        }
    }
}
