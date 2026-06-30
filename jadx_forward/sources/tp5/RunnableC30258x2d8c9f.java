package tp5;

/* renamed from: tp5.c$$b */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC30258x2d8c9f implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        for (java.util.Map.Entry entry : tp5.c.f502696p.entrySet()) {
            tp5.c cVar = (tp5.c) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (cVar == null) {
                tp5.c.f502696p.remove(entry.getKey());
            } else if (cVar.f502699d >= 2) {
                tp5.c.f502696p.remove(entry.getKey());
            } else {
                long j17 = currentTimeMillis - cVar.f502704i;
                if (j17 > 30000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WCDBLazyResult", "ALIVE_TOO_LONG lazyId=" + cVar.f502703h + " ageMs=" + j17 + " status=" + cVar.f502699d + " threadCreate=" + cVar.f502705m, cVar.f502706o);
                }
            }
        }
    }
}
