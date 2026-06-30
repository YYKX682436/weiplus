package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public final class h6 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public int f274260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f274261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.f6 f6Var) {
        super(i6Var.f274276e);
        this.f274261e = i6Var;
        this.f274260d = 60;
        setPriority(i6Var.f274275d);
        i6Var.f274278g.add(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 g6Var;
        while (this.f274260d > 0) {
            synchronized (this.f274261e.f274277f) {
                try {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = this.f274261e;
                    if (i6Var.f274273b) {
                        i6Var.f274277f.wait();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("QueueWorkerThread.QueueWorkerThread", e17, "", new java.lang.Object[0]);
                }
            }
            try {
                g6Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.g6) this.f274261e.f274272a.poll(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("QueueWorkerThread.QueueWorkerThread", e18, "", new java.lang.Object[0]);
                g6Var = null;
            }
            if (g6Var == null) {
                this.f274260d--;
            } else {
                this.f274260d = 60;
                if (g6Var.a()) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f274261e.f274279h;
                    n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(0, g6Var));
                }
            }
        }
        this.f274261e.f274278g.remove(this);
        this.f274261e.f274272a.size();
        this.f274261e.f274278g.size();
    }
}
