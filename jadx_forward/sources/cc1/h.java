package cc1;

/* loaded from: classes7.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final cc1.i a(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = cc1.i.f121962c;
        reentrantLock.lock();
        try {
            return (cc1.i) ((java.util.LinkedHashMap) cc1.i.f121963d).get(appId);
        } finally {
            reentrantLock.unlock();
        }
    }
}
