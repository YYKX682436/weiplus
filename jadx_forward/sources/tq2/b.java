package tq2;

/* loaded from: classes2.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final tq2.c a(int i17) {
        java.util.HashMap hashMap = tq2.c.f502754j;
        tq2.c cVar = (tq2.c) hashMap.get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            cVar = new tq2.c(i17);
        }
        hashMap.put(java.lang.Integer.valueOf(i17), cVar);
        return cVar;
    }
}
