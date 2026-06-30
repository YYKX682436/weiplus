package zr2;

/* loaded from: classes2.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final synchronized zr2.d a(int i17, boolean z17) {
        zr2.d dVar;
        java.lang.String str = "8755+" + i17;
        jz5.g gVar = zr2.d.f556714c;
        dVar = (zr2.d) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).get(str);
        if (dVar == null && z17) {
            dVar = new zr2.d(str);
            ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).mo141623x754a37bb()).put(str, dVar);
        }
        return dVar;
    }
}
