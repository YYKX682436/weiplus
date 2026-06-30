package x36;

/* loaded from: classes16.dex */
public final class c {
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final x36.g a() {
        x36.g gVar = x36.g.f533208j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
        x36.g gVar2 = gVar.f533211f;
        if (gVar2 == null) {
            long nanoTime = java.lang.System.nanoTime();
            x36.g.class.wait(x36.g.f533206h);
            x36.g gVar3 = x36.g.f533208j;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar3);
            if (gVar3.f533211f != null || java.lang.System.nanoTime() - nanoTime < x36.g.f533207i) {
                return null;
            }
            return x36.g.f533208j;
        }
        long nanoTime2 = gVar2.f533212g - java.lang.System.nanoTime();
        if (nanoTime2 > 0) {
            long j17 = nanoTime2 / 1000000;
            x36.g.class.wait(j17, (int) (nanoTime2 - (1000000 * j17)));
            return null;
        }
        x36.g gVar4 = x36.g.f533208j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar4);
        gVar4.f533211f = gVar2.f533211f;
        gVar2.f533211f = null;
        return gVar2;
    }
}
