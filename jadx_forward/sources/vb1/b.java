package vb1;

/* loaded from: classes7.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final vb1.d a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.HashMap hashMap = vb1.d.f516007d;
        synchronized (hashMap) {
            vb1.d dVar = (vb1.d) hashMap.get(appId);
            if (dVar != null) {
                return dVar;
            }
            vb1.d dVar2 = new vb1.d(appId);
            hashMap.put(appId, dVar2);
            return dVar2;
        }
    }
}
