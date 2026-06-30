package cc1;

/* loaded from: classes7.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final cc1.i a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = cc1.i.f40429c;
        reentrantLock.lock();
        try {
            return (cc1.i) ((java.util.LinkedHashMap) cc1.i.f40430d).get(appId);
        } finally {
            reentrantLock.unlock();
        }
    }
}
