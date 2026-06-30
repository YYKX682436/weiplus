package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog */
/* loaded from: classes12.dex */
public class RunnableC4637x6ac2667 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f134111d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f134112e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f134113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c f134114g;

    public RunnableC4637x6ac2667(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar) {
        this.f134114g = cVar;
    }

    public void a() {
        synchronized (this.f134112e) {
            oj.j.c("Matrix.battery.JiffiesMonitorFeature", "ThreadWatchDog start watching, count = " + ((java.util.ArrayList) this.f134112e).size(), new java.lang.Object[0]);
            if (!((java.util.ArrayList) this.f134112e).isEmpty()) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("matrix_watchdog");
                handlerThread.start();
                android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
                this.f134113f = handler;
                long j17 = 0 + 300000;
                this.f134111d = j17;
                handler.postDelayed(this, j17);
            }
        }
    }

    public void b(int i17, int i18) {
        synchronized (this.f134112e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f134112e).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo threadInfo = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo) it.next();
                if (threadInfo.f134106a == i17 && threadInfo.f134107b == i18) {
                    return;
                }
            }
            java.util.List list = this.f134112e;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo threadInfo2 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo();
            threadInfo2.f134106a = i17;
            threadInfo2.f134107b = i18;
            ((java.util.ArrayList) list).add(threadInfo2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        oj.j.c("Matrix.battery.JiffiesMonitorFeature", "threadWatchDog start, size = " + ((java.util.ArrayList) this.f134112e).size() + ", delayMillis = " + this.f134111d, new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f134112e) {
            java.util.Iterator it = ((java.util.ArrayList) this.f134112e).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot c17 = com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot.c((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo) it.next());
                if (c17 != null) {
                    c17.f134100d = false;
                    arrayList.add(c17);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            rh.y2 y2Var = new rh.y2();
            y2Var.f477093a = arrayList;
            this.f134114g.f476827a.f444868d.f444816b.g(y2Var);
        }
        synchronized (this.f134112e) {
            long j17 = this.f134111d;
            if (j17 <= 300000) {
                android.os.Handler handler = this.f134113f;
                if (handler != null) {
                    this.f134111d = j17 + 300000;
                    handler.postDelayed(this, 300000L);
                }
            } else if (j17 <= 600000) {
                android.os.Handler handler2 = this.f134113f;
                if (handler2 != null) {
                    this.f134111d = j17 + 600000;
                    handler2.postDelayed(this, 600000L);
                }
            } else {
                synchronized (this.f134112e) {
                    ((java.util.ArrayList) this.f134112e).clear();
                }
            }
        }
    }
}
