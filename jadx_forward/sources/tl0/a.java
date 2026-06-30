package tl0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        ul0.a aVar = tl0.b.f501727a;
        aVar.getClass();
        aVar.f510088d.A("ChattingEvent", "DELETE FROM ChattingEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.d dVar = tl0.b.f501728b;
        dVar.getClass();
        dVar.f510094d.A("SnsFeature", "DELETE FROM SnsFeature where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.c cVar = tl0.b.f501729c;
        cVar.getClass();
        cVar.f510092d.A("LiveHomeRedDotEvent", "DELETE FROM LiveHomeRedDotEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.b bVar = tl0.b.f501730d;
        bVar.getClass();
        bVar.f510090d.A("LiveHomeNoRedDotEvent", "DELETE FROM LiveHomeNoRedDotEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - 604800000));
    }
}
