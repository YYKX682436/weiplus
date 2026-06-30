package rm5;

/* loaded from: classes10.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.util.List trackList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        if (trackList.isEmpty()) {
            return;
        }
        java.util.Iterator it = trackList.iterator();
        rm5.j jVar = null;
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            rm5.j jVar2 = (rm5.j) it.next();
            long j19 = ((float) (jVar2.f479038g - jVar2.f479037f)) / jVar2.f479039h;
            long min = java.lang.Math.min(jVar2.f479048q.a() ? jVar2.f479048q.f479064c : 0L, java.lang.Math.min(j17, j19));
            if (jVar != null) {
                jVar.f479050s = j18 - (min / 2);
            }
            jVar2.f479049r = j18 - (min / 2);
            jVar2.c(j18 - min);
            jVar2.b(jVar2.f479035d + j19);
            j18 = jVar2.f479036e;
            jVar = jVar2;
            j17 = j19;
        }
        rm5.j jVar3 = (rm5.j) kz5.n0.i0(trackList);
        jVar3.f479050s = jVar3.f479036e;
    }
}
