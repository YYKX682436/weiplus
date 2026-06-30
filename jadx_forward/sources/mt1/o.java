package mt1;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.k0 f412777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ArrayBlockingQueue f412778e;

    public o(l75.k0 k0Var, java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue) {
        this.f412777d = k0Var;
        this.f412778e = arrayBlockingQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashSet hashSet;
        long j17;
        mt1.b0 b0Var = mt1.b0.f412724a;
        l75.k0 k0Var = this.f412777d;
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = this.f412778e;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) mt1.b0.c(b0Var)).b(15);
        int myTid = android.os.Process.myTid();
        mt1.b0.b(b0Var).add(java.lang.Integer.valueOf(myTid));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.util.HashSet hashSet2 = mt1.b0.f412729f;
            synchronized (hashSet2) {
                hashSet = new java.util.HashSet(hashSet2);
            }
            try {
                try {
                    try {
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CalcWxNewService", e17, "Cannot refresh invalid files.", new java.lang.Object[0]);
                        if (k0Var.G()) {
                            j17 = 0L;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                if (k0Var.G()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CalcWxNewService", "inTransaction, skip");
                    if (k0Var.G()) {
                        j17 = 0L;
                        k0Var.w(j17);
                    }
                }
                long b17 = k0Var.b();
                while (true) {
                    jz5.l lVar = (jz5.l) arrayBlockingQueue.take();
                    java.lang.String str = (java.lang.String) lVar.f384366d;
                    long longValue = ((java.lang.Number) lVar.f384367e).longValue();
                    if (str == null) {
                        break;
                    }
                    mt1.b0 b0Var2 = mt1.b0.f412724a;
                    java.lang.String h27 = b0Var2.n().h2(longValue);
                    if (h27 == null) {
                        h27 = "talker-ignore";
                    }
                    java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue2 = arrayBlockingQueue;
                    if (!hashSet.contains(new jz5.l(h27, java.lang.Long.valueOf(longValue))) && !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        b0Var2.n().O2(h27, longValue, true, null);
                    }
                    arrayBlockingQueue = arrayBlockingQueue2;
                }
                if (k0Var.G()) {
                    j17 = java.lang.Long.valueOf(b17);
                    k0Var.w(j17);
                }
            } catch (java.lang.Throwable th6) {
                try {
                    if (k0Var.G()) {
                        k0Var.w(0L);
                    }
                } catch (java.lang.Exception unused2) {
                }
                throw th6;
            }
        } finally {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CalcWxNewService", "runTaskWithLeakInspect taskId=15, cost=" + currentTimeMillis2 + "ms|" + java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis2) + "min");
            mt1.b0.b(b0Var).remove(java.lang.Integer.valueOf(myTid));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) mt1.b0.c(b0Var)).a(15);
        }
    }
}
