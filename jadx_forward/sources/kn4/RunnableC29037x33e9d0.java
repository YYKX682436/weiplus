package kn4;

/* renamed from: kn4.q$$a */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC29037x33e9d0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) kn4.q.f391279d;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (currentTimeMillis - ((kn4.s) entry.getValue()).f391283b > kn4.q.f391278c) {
                concurrentHashMap.remove(entry.getKey());
            }
        }
    }
}
