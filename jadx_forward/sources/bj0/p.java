package bj0;

/* loaded from: classes11.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final bj0.s a(java.lang.String engineGroupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineGroupId, "engineGroupId");
        if (engineGroupId.length() == 0) {
            return null;
        }
        java.util.HashMap hashMap = bj0.s.f102663g;
        if (!hashMap.containsKey(engineGroupId)) {
            hashMap.put(engineGroupId, new bj0.s());
        }
        return (bj0.s) hashMap.get(engineGroupId);
    }
}
