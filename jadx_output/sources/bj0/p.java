package bj0;

/* loaded from: classes11.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final bj0.s a(java.lang.String engineGroupId) {
        kotlin.jvm.internal.o.g(engineGroupId, "engineGroupId");
        if (engineGroupId.length() == 0) {
            return null;
        }
        java.util.HashMap hashMap = bj0.s.f21130g;
        if (!hashMap.containsKey(engineGroupId)) {
            hashMap.put(engineGroupId, new bj0.s());
        }
        return (bj0.s) hashMap.get(engineGroupId);
    }
}
